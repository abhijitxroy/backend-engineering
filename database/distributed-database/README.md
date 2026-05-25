# MongoDB

MongoDB is a NoSQL database known for its flexibility and scalability.

## Connection Types

- Standalone
- Replica Set
- Sharded Cluster

Mongo communication approaches:

- MongoClient connection
- Replica Set connection
- SRV connection string

Example:

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

## Production Engineering Discussions

- Shard balancing
- Replica lag troubleshooting
- Distributed consistency handling
- Microservice consistency validation
- Database scalability
- Connection optimization
- Replica topology planning