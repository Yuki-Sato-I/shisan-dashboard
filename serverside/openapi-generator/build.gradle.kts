plugins {
    id("org.openapi.generator") version "7.10.0"
}

openApiGenerate {
    generatorName.set("kotlin-spring")
    inputSpec.set("$rootDir/../docs/swagger/root.yml")
    outputDir.set("$buildDir/generated")
    apiPackage.set("com.personal.shisan.generated.api")
    modelPackage.set("com.personal.shisan.generated.model")
    configOptions.set(mapOf(
        "dateLibrary" to "java8",
        "interfaceOnly" to "true",
        "useTags" to "true",
        "serializationLibrary" to "jackson"
    ))
}

sourceSets {
    main {
        java {
            srcDir("$buildDir/generated/src/main/kotlin")
        }
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
}

tasks.named("compileKotlin") {
    dependsOn("openApiGenerate")
}