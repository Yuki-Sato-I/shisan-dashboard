import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version "3.5.5-SNAPSHOT"
	id("io.spring.dependency-management") version "1.1.7"
    id("org.openapi.generator") version "7.14.0"
}

group = "com.personal"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.5")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    runtimeOnly("org.postgresql:postgresql")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testImplementation("org.mybatis.spring.boot:mybatis-spring-boot-starter-test:3.0.5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<GenerateTask> {
    doFirst {
        delete("$projectDir/src/main/kotlin/com/personal/shisan/gen")
    }
    generatorName.set("kotlin-spring")
    inputSpec.set("$projectDir/../docs/swagger/root.yml")
    outputDir.set("$projectDir")
    packageName.set("com.personal.shisan.gen")
    typeMappings.set(
        mapOf("DateTime" to "LocalDateTime")
    )
    importMappings.set(
        mapOf("LocalDateTime" to "java.time.LocalDateTime")
    )
    configOptions.set(
        mapOf(
            "annotationLibrary" to "none",
            "documentationProvider" to "none",
            "exceptionHandler" to "false",
            "gradleBuildFile" to "true",
            "interfaceOnly" to "true",
            "serializationLibrary" to "jackson",
            "useBeanValidation" to "true",
            "useSpringBoot3" to "true",
        )
    )
    ignoreFileOverride.set("$projectDir/.openapi-generator-ignore")
    doLast {
        delete("$projectDir/.openapi-generator")
    }
}
