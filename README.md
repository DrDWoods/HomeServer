# HomeServer

A REST API using Ktor designed to run as a docker container using port 8080. These endpoints are 
intended to map to other services running on a home server.

# Build

1. ./gradlew build
2. docker built -t kotlin-api .

This will build a docker image that you can run as a container. By default, this uses port 8080 so
remember to map port 8080 to the docker container when spinning up.