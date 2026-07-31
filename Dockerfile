FROM maven:3.9.9-eclipse-temurin-21

WORKDIR /app

COPY . .

RUN chmod +x mvnw

CMD ["./mvnw", "test"]
