

# Security Overview

Backend security protects applications, APIs, infrastructure and user data from unauthorized access and security threats.

Security engineering directly influences backend reliability, compliance and production system resilience.

## Authentication

Authentication verifies user identity.

Common approaches:

- Basic Authentication
- Session Based Authentication
- Token Based Authentication
- OAuth2
- JWT

## Authorization

Authorization determines access permissions after authentication.

Examples:

- Role Based Access Control (RBAC)
- Attribute Based Access Control (ABAC)

## Session Based Authentication

Server maintains user session information.

Flow:

- User Login
- Session Creation
- Session Storage
- Session Validation

Benefits:

- Centralized control

Limitations:

- Scalability challenges in distributed systems

## Token Based Authentication

Server issues token after authentication.

Client sends token with requests.

Examples:

- JWT
- OAuth Access Token

Benefits:

- Stateless architecture
- Better scalability

## JWT

JSON Web Token enables stateless authentication.

JWT structure:

- Header
- Payload
- Signature

Benefits:

- Distributed authentication
- Reduced session dependency

## OAuth2

OAuth2 enables delegated authorization.

Common components:

- Resource Owner
- Client Application
- Authorization Server
- Resource Server

## Password Security

Password protection approaches:

- BCrypt
- PBKDF2
- Argon2

Best practices:

- Salted Hashing
- Strong Password Policy
- Credential Rotation

## CORS

Cross Origin Resource Sharing controls browser cross origin requests.

Backend discussions:

- Allowed Origins
- Allowed Methods
- Credential Policies

## CSRF

Cross Site Request Forgery protection prevents unauthorized request execution.

Protection approaches:

- CSRF Token
- SameSite Cookie

## Security Headers

Examples:

- Content-Security-Policy
- X-Frame-Options
- Strict-Transport-Security
- X-Content-Type-Options

## API Security

Common protections:

- Rate Limiting
- Input Validation
- Authentication
- Authorization
- Encryption

## OWASP Top 10

Examples:

- Broken Access Control
- Cryptographic Failures
- Injection
- Security Misconfiguration
- Vulnerable Components

## Secret Management

Production discussions:

- Environment Variables
- Secret Rotation
- Vault Integration

## Production Engineering Discussions

Backend discussions commonly include:

- Identity Management
- Threat Protection
- Access Control
- Monitoring and Auditing
- Security Hardening

## Notes

Security engineering directly influences backend stability, production reliability and secure system design.