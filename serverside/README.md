# serverside
## 構成
```
serverside 
│   ├── build.gradle.kts
│   ├── src/main/kotolin
│   │   ├── com/personal/shisan
│   │   │   ├── gen(openapi-generatorで自動生成されたコード)
│   │   │   ├── domains
│   │   │   │   ├── services()
│   │   │   │   └── repositories()
│   │   │   ├── interfaces
│   │   │   │   ├── controllers(外部からのデータを受け取る場所)
│   │   │   │   └── presenters(外部に返すときのデータの値を書き換えて場所)
│   │   │   └── ShisanDashboardApplication.kt()
└───┴───┴── resources
                └── application.yml
```
