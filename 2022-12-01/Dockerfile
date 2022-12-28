FROM eclipse-temurin:17-jdk as build
WORKDIR /app
COPY ./gradle ./gradle
COPY gradlew build.gradle.kts settings.gradle.kts ./
RUN ./gradlew --no-daemon dependencies
COPY . .
RUN ./gradlew --no-daemon build
ENTRYPOINT [ "./gradlew" ]

FROM eclipse-temurin:17-jre
COPY --from=build /app/build/libs/2022-12-01.jar ./
ENTRYPOINT [ "java" ]
CMD [ "-jar", "2022-12-01.jar" ]
