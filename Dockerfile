FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/products-category-service-0.0.1.jar
COPY ${JAR_FILE} app_eureka.jar
ENTRYPOINT ["java","-jar","products-category-service.jar"]