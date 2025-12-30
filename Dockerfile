# -------- Build stage --------
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom and mvn wrapper files first (for dependency caching)
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

# Download dependencies
RUN ./mvnw -q -B dependency:go-offline

# Copy source code
COPY src src

# Build the application (skip tests)
RUN ./mvnw clean package -DskipTests

# -------- Run stage --------
FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy the built jar from build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
