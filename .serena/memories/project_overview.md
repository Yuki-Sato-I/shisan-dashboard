# Shisan Dashboard Project Overview

## Purpose
This is a Spring Boot application written in Kotlin for a "Shisan Dashboard" (asset management dashboard). The project serves as a keiba (horse racing) API system with automated code generation capabilities.

## Tech Stack
- **Language**: Kotlin 1.9.25 
- **Framework**: Spring Boot 3.5.5-SNAPSHOT
- **Java Version**: Java 21
- **Database**: PostgreSQL 17.5
- **Build Tool**: Gradle
- **API Generation**: OpenAPI Generator 7.14.0
- **ORM**: MyBatis 3.0.5
- **Testing**: JUnit 5
- **Containerization**: Docker Compose

## Key Dependencies
- Spring Boot Starter Web
- Spring Boot Starter Validation
- MyBatis Spring Boot Starter
- PostgreSQL Driver
- Kotlin Reflect
- Jackson (for JSON serialization)

## Database Configuration
- PostgreSQL database named "keiba"
- Default connection: localhost:5432
- Username/Password: postgres/postgres (or keiba/keiba for app user)
- Docker Compose setup available for easy local development