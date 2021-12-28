FROM maven:3-openjdk-17-slim as build
WORKDIR /opt/app

ENV JAVAAGENT_ARTIFACT_ID=opentelemetry-javaagent
ENV JAVAAGENT_ARTIFACT=io.opentelemetry.javaagent:${JAVAAGENT_ARTIFACT_ID}:1.9.1
RUN mvn dependency:get -Dartifact=${JAVAAGENT_ARTIFACT} \
    && mvn dependency:copy -Dartifact=${JAVAAGENT_ARTIFACT} -DoutputDirectory=. -Dmdep.stripVersion=true \
    && mv ${JAVAAGENT_ARTIFACT_ID}.jar javaagent.jar

COPY pom.xml .
RUN mvn --batch-mode dependency:go-offline

COPY . .
RUN mvn --batch-mode --offline -Djar.finalName=app package

FROM openjdk:17-alpine
COPY --from=build /opt/app/javaagent.jar ./javaagent.jar
COPY --from=build /opt/app/target/app.jar ./app.jar

ENTRYPOINT ["java", "-javaagent:./javaagent.jar", "-jar", "app.jar"]