# Suggested Commands

## Prerequisites
```bash
npm install -g swagger-merger  # Required for OpenAPI file merging
```

## Primary Development Commands
All commands should be run from the `serverside/` directory:

### Build and Run
```bash
./gradlew build           # Build the entire project
./gradlew bootRun         # Run the Spring Boot application
./gradlew clean           # Clean build artifacts
./gradlew jar            # Build JAR file
```

### Testing
```bash
./gradlew test           # Run all tests
./gradlew check          # Run all checks including tests
```

### OpenAPI Code Generation
```bash
./gradlew openApiGenerate    # Generate Kotlin models/interfaces from Swagger specs
swagger-merger -i docs/swagger/root.yml  # Merge modular Swagger files
```

### Database
```bash
docker-compose up -d     # Start PostgreSQL database
docker-compose down      # Stop database
```

### Gradle Information
```bash
./gradlew tasks          # List all available tasks
./gradlew projects       # Show project structure
./gradlew dependencies   # Show dependencies
```

## System Commands (macOS/Darwin)
```bash
ls                       # List files
cd <directory>           # Change directory
grep -r "pattern" .      # Search for text patterns
find . -name "*.kt"      # Find files by pattern
git status               # Git status
git add .                # Add all changes
git commit -m "message"  # Commit changes
```