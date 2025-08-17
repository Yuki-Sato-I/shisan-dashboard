# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Spring Boot application written in Kotlin for a "Shisan Dashboard" (asset management dashboard). The project uses OpenAPI Generator to automatically generate API models and interfaces from Swagger specifications.

## Architecture

```
shisan/
├── serverside/               # Main Kotlin Spring Boot application
│   ├── src/main/kotlin/com/personal/shisan/
│   │   ├── gen/             # Auto-generated OpenAPI code (DO NOT EDIT)
│   │   ├── domains/         # Business logic layer
│   │   │   ├── services/    # Business services
│   │   │   └── repositories/ # Data access layer
│   │   ├── interfaces/      # External interface layer
│   │   │   ├── controllers/ # REST API controllers
│   │   │   └── presenters/  # Response data transformation
│   │   └── ShisanDashboardApplication.kt # Main application class
├── docs/swagger/            # OpenAPI specifications
├── db/sql/postgres/         # Database initialization scripts
└── docker-compose.yml      # PostgreSQL database setup
```

## Key Development Commands

All commands should be run from the `serverside/` directory:

### Build and Run
- `./gradlew build` - Build the entire project
- `./gradlew bootRun` - Run the Spring Boot application
- `./gradlew test` - Run all tests
- `./gradlew clean` - Clean build artifacts

### OpenAPI Code Generation
- `./gradlew openApiGenerate` - Generate Kotlin models/interfaces from Swagger specs
- `swagger-merger -i docs/swagger/root.yml` - Merge Swagger files (requires global npm install)

The OpenAPI generator is configured to:
- Generate Kotlin Spring interfaces only (no implementations)
- Use Jackson for serialization
- Map DateTime to LocalDateTime
- Delete and regenerate the `gen/` directory on each run

### Database Setup
- `docker-compose up -d` - Start PostgreSQL database
- Database runs on localhost:5432 with user/password: postgres/postgres
- Creates `keiba` database and user automatically

## Important Notes

- **Never edit files in `src/main/kotlin/com/personal/shisan/gen/`** - These are auto-generated from OpenAPI specs
- Swagger specifications are in `docs/swagger/` with modular structure using `$ref`
- The application connects to PostgreSQL database named "keiba"
- Uses Spring Boot 3.x with Kotlin 1.9.25 and Java 21
- MyBatis is configured for database access