# Task Completion Checklist

## When a coding task is completed, run these commands:

### 1. Build and Compile Check
```bash
cd serverside
./gradlew build
```
This will:
- Compile all Kotlin code
- Run static analysis checks
- Validate dependencies
- Build the application

### 2. Run Tests
```bash
./gradlew test
```
This will:
- Execute unit tests
- Execute integration tests
- Generate test reports

### 3. OpenAPI Code Generation (if API changes were made)
```bash
./gradlew openApiGenerate
```
Only run this if:
- OpenAPI specifications in `docs/swagger/` were modified
- New API endpoints were defined
- Model schemas were updated

### 4. Application Startup Test
```bash
./gradlew bootRun
```
Verify the application starts successfully and check for:
- No startup errors
- Database connection works
- API endpoints are accessible

### 5. Git Status Check
```bash
git status
```
Review what files were changed and ensure:
- Only intended files were modified
- No generated files in `gen/` are manually edited
- No sensitive information is committed

## Important Notes
- Always run from `serverside/` directory
- Never manually edit files in `src/main/kotlin/com/personal/shisan/gen/`
- Ensure PostgreSQL is running (`docker-compose up -d`) before testing
- Check application logs for any warnings or errors