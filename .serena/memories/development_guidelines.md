# Development Guidelines

## OpenAPI-First Development
This project follows an OpenAPI-first approach:
1. Define APIs in `docs/swagger/` using modular YAML files
2. Use `$ref` to reference reusable components
3. Generate Kotlin interfaces and models using OpenAPI Generator
4. Implement controllers that implement the generated interfaces

## Critical Rules
- **NEVER** manually edit files in `src/main/kotlin/com/personal/shisan/gen/`
- Always regenerate code after OpenAPI spec changes: `./gradlew openApiGenerate`
- The generator deletes and recreates the entire `gen/` directory

## Architecture Pattern
- **Controllers** (`interfaces/controllers/`) - Handle HTTP requests, minimal logic
- **Services** (`domains/services/`) - Business logic implementation  
- **Repositories** (`domains/repositories/`) - Data access layer with MyBatis
- **Generated Code** (`gen/`) - API interfaces and data models

## Database Development
- Use MyBatis for database operations
- Database schema managed through migration scripts in `db/sql/postgres/`
- Local development uses Docker Compose PostgreSQL instance
- Connection configured in `application.yml`

## Code Generation Configuration
The OpenAPI generator is configured to:
- Generate Kotlin Spring interfaces only (no implementations)
- Use Jackson for JSON serialization
- Map DateTime to LocalDateTime
- Enable Bean Validation annotations
- Use Spring Boot 3 features

## Best Practices
- Keep controllers thin - delegate to services
- Use dependency injection with Spring annotations
- Follow Kotlin coding conventions
- Write tests for business logic in services
- Use meaningful names that reflect domain concepts