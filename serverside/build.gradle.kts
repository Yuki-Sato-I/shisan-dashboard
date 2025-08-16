plugins {
	kotlin("jvm") version "1.9.25" apply false
	kotlin("plugin.spring") version "1.9.25" apply false
	id("org.springframework.boot") version "3.5.5-SNAPSHOT" apply false
	id("io.spring.dependency-management") version "1.1.7" apply false
}

allprojects {
	group = "com.personal"
	version = "0.0.1-SNAPSHOT"
	
	repositories {
		mavenCentral()
		maven { url = uri("https://repo.spring.io/snapshot") }
	}
}

subprojects {
	apply(plugin = "org.jetbrains.kotlin.jvm")

	java {
		toolchain {
			languageVersion = JavaLanguageVersion.of(21)
		}
	}

	kotlin {
		compilerOptions {
			freeCompilerArgs.addAll("-Xjsr305=strict")
		}
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}