# Database Transactions

Database transaction concepts and consistency engineering discussions organized for scalable backend systems and production engineering scenarios.

## Transaction Fundamentals

Coverage:

- ACID Properties
- Transaction Lifecycle
- Commit
- Rollback
- Isolation Levels
- Transaction Propagation
- Distributed Transaction
- Multiple Database Transaction
- Consistency Handling
- Microservice Transaction Strategy

## ACID Properties

Atomicity:

Transaction executes fully or rollback happens.

Example:

```text
Debit Account A

Credit Account B

Failure

Rollback
```

Consistency:

Database remains in valid state.

Isolation:

Concurrent transactions do not corrupt data.

Durability:

Committed transaction survives failures.

## Transaction Lifecycle

Flow:

```text
Start Transaction

↓

Read Data

↓

Modify Data

↓

Commit

or

Rollback
```

## Commit and Rollback

Commit:

Persist transaction changes.

Example:

```sql
COMMIT;
```

Rollback:

Undo transaction changes.

Example:

```sql
ROLLBACK;
```

## Isolation Levels

Coverage:

- Read Uncommitted
- Read Committed
- Repeatable Read
- Serializable

## Read Uncommitted

Possible Issue:

- Dirty Read

## Read Committed

Prevents:

- Dirty Read

Possible Issue:

- Non Repeatable Read

## Repeatable Read

Prevents:

- Dirty Read
- Non Repeatable Read

Possible Issue:

- Phantom Read

## Serializable

Highest isolation guarantee.

Tradeoff:

- Lower concurrency

## Dirty Read

Example:

Transaction A:

```text
Update salary

No commit
```

Transaction B:

```text
Read modified salary
```

Rollback happens.

Transaction B consumed invalid data.

## Non Repeatable Read

Example:

Same row read twice.

Between reads another transaction modifies value.

## Phantom Read

Example:

Query returns different row count due to concurrent insert.

## Transaction Propagation

Coverage:

- REQUIRED
- REQUIRES_NEW
- SUPPORTS
- MANDATORY
- NEVER

REQUIRED:

Uses existing transaction or creates new.

REQUIRES_NEW:

Always creates independent transaction.

## Distributed Transaction

Multiple services or databases participate in single business operation.

Challenges:

- Consistency
- Retry handling
- Failure recovery

Strategies:

- Saga Pattern
- Choreography
- Orchestration

## One Database vs Multiple Database Transaction

Single Database:

- Easier consistency

Multiple Database:

- Complex coordination
- Distributed consistency concerns

## Consistency Across Microservices

Approaches:

- Event Driven Consistency
- Saga Pattern
- Retry Strategy
- Idempotency

## Production Engineering Discussions

Examples:

- Transaction troubleshooting
- Deadlock handling
- Isolation tuning
- Retry handling
- Backend consistency optimization

## Notes

Transaction design directly impacts backend reliability, consistency and production scalability.