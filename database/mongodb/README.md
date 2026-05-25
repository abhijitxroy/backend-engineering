

# MongoDB

MongoDB concepts and NoSQL backend engineering discussions organized for scalable distributed systems and production engineering scenarios.

## MongoDB Fundamentals

Coverage:

- Collection
- Document
- BSON
- Embedded Documents
- Schema Design
- CRUD Operations
- Aggregation Pipeline
- Lookup
- Match
- Composite Index
- Replication
- Sharding
- Connection Types

## NoSQL Database Types

Examples:

- Key Value Database
- Document Database
- Column Database
- Graph Database

Examples Technologies:

- MongoDB
- Redis
- Cassandra
- Neo4j

## Lookup and Match

Lookup:

Used for join style operations across collections.

Match:

Used for filtering pipeline data.

Example:

```javascript
{
 $match: {
   status: "ACTIVE"
 }
}
```

## MongoDB Join Performance

Considerations:

- Reduce large lookup operations
- Use indexing strategy
- Prefer embedding where appropriate
- Optimize aggregation pipeline

## Composite Index

Composite index improves query performance when multiple fields participate in filtering.

Example:

```javascript
db.employee.createIndex(
 {
   department:1,
   employeeId:1
 }
)
```

## MongoDB vs DynamoDB

| Feature | MongoDB | DynamoDB |
|----------|----------|-----------|
| Type | Document Database | Key Value Database |
| Query Capability | Rich Query | Key Based |
| Scaling | Sharding | Managed Scaling |
| Management | Self Managed or Managed | Fully Managed |

## Collection Operations

Create Collection:

```javascript
db.createCollection("employee")
```

Drop Collection:

```javascript
db.employee.drop()
```

## Connection Types

Examples:

- Standalone
- Replica Set
- Sharded Cluster

Mongo communication approaches:

- MongoClient connection
- Replica Set connection
- SRV connection string

Examples:

Standalone:

mongodb://localhost:27017

Replica Set:

mongodb://node1:27017,node2:27017,node3:27017/?replicaSet=rs0

SRV:

mongodb+srv://cluster.mongodb.net

Production considerations:

- Connection pooling
- Replica awareness
- Retry handling
- Read preference optimization

## Replication

Replication creates multiple copies of data.

Benefits:

- Fault tolerance
- High availability
- Disaster recovery

## Sharding

Sharding distributes data across multiple nodes.

Benefits:

- Horizontal scaling
- High throughput
- Large dataset support

## Production Engineering Discussions

Examples:

- Query optimization
- Index tuning
- Shard key selection
- Aggregation optimization
- Database scalability
- Connection optimization
- Replica topology planning

## Notes

MongoDB provides scalable NoSQL storage optimized for distributed backend systems.