# Codebase Architecture

## Project Structure
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
│   ├── paths/              # API path definitions
│   ├── schemas/            # Data model schemas
│   │   ├── responses/      # Response models
│   │   ├── requests/       # Request models
│   │   └── errors/         # Error models
├── db/sql/postgres/         # Database initialization scripts
└── docker-compose.yml      # PostgreSQL database setup
```

## Architecture Layers
1. **interfaces/** - External API layer (controllers, presenters)
2. **domains/** - Business logic layer (services, repositories)
3. **gen/** - Auto-generated code from OpenAPI specs (never edit manually)

## Key Files
- **ShisanDashboardApplication.kt** - Main Spring Boot application entry point
- **application.yml** - Spring configuration with database settings
- **build.gradle.kts** - Build configuration with OpenAPI generation setup
- **root.yml** - Main OpenAPI specification file