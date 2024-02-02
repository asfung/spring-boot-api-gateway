
## API GATEWAY

sedikit config 
```yaml
  application:
    spring:
    name: gateway-service
  cloud:
    gateway:
      routes:
        - id: person-service
          predicates:
          uri: localhost:8081/api/v1/**
```
