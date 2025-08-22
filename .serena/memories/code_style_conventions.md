# Code Style and Conventions

## Kotlin Style
- Uses standard Kotlin conventions
- Class names: PascalCase (e.g., `UserController`, `ShisanDashboardApplication`)
- Function names: camelCase (e.g., `showUsers`, `runApplication`)
- Variable names: camelCase (e.g., `userId`)
- Package structure follows reverse domain notation: `com.personal.shisan.*`

## Spring Boot Conventions
- Controllers use `@RestController` and `@RequestMapping` annotations
- Path variables use `@PathVariable("name")` syntax
- HTTP mappings use specific annotations (`@GetMapping`, etc.)

## Project Conventions
- **NEVER** edit files in `src/main/kotlin/com/personal/shisan/gen/` - these are auto-generated
- OpenAPI specifications are modular using `$ref` references
- Database entities and API models are generated from OpenAPI specs
- Controllers are kept minimal, business logic goes in services

## File Organization
- Controllers in `interfaces/controllers/`
- Services in `domains/services/`
- Repositories in `domains/repositories/`
- Generated code in `gen/` (models, APIs)
- OpenAPI specs in `docs/swagger/` with modular structure

## Configuration
- Application configuration in `application.yml`
- Build configuration in `build.gradle.kts`
- OpenAPI generation configured in Gradle build script