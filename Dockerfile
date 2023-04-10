FROM openjdk:11
WORKDIR /app
EXPOSE 8080
ADD ./build/libs/fat.jar .
CMD ["java", "-jar", "fat.jar"]
