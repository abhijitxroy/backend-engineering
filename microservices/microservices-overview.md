

# Microservices Overview

Microservices architecture is an approach where applications are built as independently deployable services communicating over network protocols.

Microservices improve scalability, deployment flexibility and distributed system maintainability.

## Monolith vs Microservices

Monolithic Architecture:

- Single deployable unit
- Tight coupling
- Simpler initial development
- Harder scaling for large systems

Microservices Architecture:

- Independent services
- Independent deployment
- Technology flexibility
- Better scalability
- Distributed ownership

## Service Discovery

Service discovery helps services dynamically identify and communicate with other services.

Examples:

- Eureka
- Consul
- Kubernetes Service Discovery

Benefits:

- Dynamic service registration
- Reduced hardcoded configuration

## API Gateway

API Gateway acts as a centralized entry point.

Responsibilities:

- Authentication
- Routing
- Rate Limiting
- Monitoring
- Request Aggregation

## Inter Service Communication

Communication approaches:

### Synchronous

- REST API
- gRPC

### Asynchronous

- Kafka
- RabbitMQ
- Event Driven Messaging

## Load Balancing

Load balancing distributes requests across service instances.

Examples:

- Client Side Load Balancing
- Server Side Load Balancing

Benefits:

- High availability
- Better throughput

## Circuit Breaker

Circuit breaker improves fault tolerance.

States:

- Closed
- Open
- Half Open

Benefits:

- Failure isolation
- Fallback handling
- Service resilience

## Distributed Tracing

Distributed tracing tracks requests across services.

Examples:

- Zipkin
- OpenTelemetry
- Jaeger

## Centralized Logging

Centralized logging improves troubleshooting.

Examples:

- ELK Stack
- Grafana Loki

## Configuration Management

Configuration externalization improves deployment flexibility.

Examples:

- Config Server
- Kubernetes ConfigMap

## Saga Pattern

Saga pattern manages distributed transactions.

Approaches:

- Choreography
- Orchestration

## CQRS

Command Query Responsibility Segregation separates:

- Read operations
- Write operations

Benefits:

- Better scalability
- Independent optimization

## Event Driven Architecture

Services communicate through events.

Benefits:

- Loose coupling
- Better scalability
- Resilience

## Observability

Production monitoring areas:

- Metrics
- Logs
- Traces
- Alerts

## Production Engineering Discussions

Backend discussions commonly include:

- Fault Tolerance
- Retry Strategy
- Horizontal Scaling
- Service Resilience
- High Availability
- Monitoring

## Notes

Microservices architecture directly influences backend scalability, deployment agility and distributed system reliability.