# people-jar-mongo-redis (JAR)
Java 17, Spring Boot app using MongoDB (primary) and Redis (cache).

## Build locally
mvn clean package
java -jar target/people-jar-mongo-redis-0.0.1-SNAPSHOT.jar

## Docker (recommended)
docker-compose up --build
# then open http://localhost:8080/
