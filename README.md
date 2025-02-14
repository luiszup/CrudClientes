## Opções de configuração de banco de dados

// application.yml
``` yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/seu_banco_de_dados
    username: seu_usuario
    password: sua_senha
    driver-class-name: org.postgresql.Driver
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
```