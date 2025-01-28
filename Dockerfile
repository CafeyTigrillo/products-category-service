FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/products-category-service-0.0.1.jar
COPY ${JAR_FILE} products-category-service.jar
ENTRYPOINT ["java","-jar","products-category-service.jar"]