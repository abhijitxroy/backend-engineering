# Spring Core Interview

## Bean Lifecycle

- Spring Bean Lifecycle
- ApplicationContext Lifecycle
- close() vs registerShutdownHook()
- Bean initialization flow
- Bean destroy flow
- How many Spring lifecycle mechanisms? (3)
- Spring lifecycle demo with database
- When Spring Bean gets destroyed

## Dependency Injection

- Field Injection
- Constructor Injection
- Setter Injection
- Bean Scope Injection Problem
- Prototype vs Singleton
- Scope bean injection problem resolution
- Scoped Proxy
- Lookup Method Injection
- ApplicationContextAware
- ObjectFactory

## Spring Annotations

- @Configuration
- @Autowired
- @Qualifier
- @Component vs @Bean
- @Service vs @Repository
- @Component vs @Service vs @Repository
- 5 Spring annotations excluding stereotype annotations
- What happens if @Service is used over DAO
- Qualifier and why it is needed

## Bean Processing

- BeanFactoryPostProcessor
- Bean lifecycle extension points
- BeanFactory Pattern
- BeanFactoryPostProcessor code walkthrough
- Who creates proxy in Spring

## Configuration

- application.properties vs application.yaml
- Which loads first
- Read application.properties approaches
- @Value
- Environment.getProperty()
- Java Properties API
- No Spring MVC in classpath -> ApplicationContext creation

## Exception Handling

- Global Exception Handler
- Custom Validator
- 5 Spring Exceptions
- ExceptionHandler vs Fallback Method

## Application Context

- Helper class that initializes and destroys WebApplicationContext
- @PreDestroy in standalone application

## Production Discussions

- Bean scope troubleshooting
- Dependency injection debugging
- Application startup debugging
- Spring container internals

## Notes

Focus on framework internals, lifecycle understanding and production engineering discussions instead of annotation memorization.