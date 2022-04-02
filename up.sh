#!/bin/sh
set -e

docker_compose_files='--file ./docker-compose.yaml --file ./opentelemetry/docker-compose.yaml'

cleanup() {
  # shellcheck disable=SC2086
  docker-compose ${docker_compose_files} down --volumes
}

trap cleanup EXIT

# shellcheck disable=SC2086
docker-compose ${docker_compose_files} pull
# shellcheck disable=SC2086
docker-compose ${docker_compose_files} up --build