


# Database Indexing

Database indexing concepts and query optimization discussions organized for scalable backend systems and production engineering scenarios.

## Index Fundamentals

Coverage:

- Clustered Index
- Non Clustered Index
- Composite Index
- Unique Index
- Primary Key Index
- Covering Index
- Query Optimization
- Execution Plan Analysis

## Why Indexing

Index improves database query performance by reducing full table scans.

Benefits:

- Faster lookup
- Reduced IO operations
- Better query performance
- Improved backend scalability

## Clustered Index

Clustered index stores table data physically in indexed order.

Characteristics:

- One clustered index per table
- Faster range queries
- Physical ordering

Example:

```sql
CREATE CLUSTERED INDEX idx_employee_id
ON employee(id);
```

## Non Clustered Index

Non clustered index stores index structure separately from table data.

Characteristics:

- Multiple indexes supported
- Additional storage required
- Pointer based lookup

Example:

```sql
CREATE INDEX idx_employee_name
ON employee(employee_name);
```

## Composite Index

Composite index improves filtering across multiple columns.

Example:

```sql
CREATE INDEX idx_department_salary
ON employee(
 department,
 salary
);
```

Considerations:

- Column order matters
- Query pattern driven design

## Covering Index

Covering index contains all required query columns.

Benefits:

- Reduced table access
- Faster query execution

## Query Optimization

Examples:

- Reduce SELECT * usage
- Proper filtering
- Efficient JOIN strategy
- Index tuning
- Query plan validation

## Execution Plan Analysis

Execution plan helps identify:

- Full table scan
- Index scan
- Costly operation
- Join bottleneck

Examples:

- EXPLAIN
- EXPLAIN ANALYZE

## Clustered vs Non Clustered Index

| Feature | Clustered | Non Clustered |
|----------|------------|----------------|
| Data Storage | Physical Ordering | Separate Structure |
| Count Per Table | One | Multiple |
| Lookup Performance | Faster Range Scan | Flexible Filtering |

## Production Engineering Discussions

Examples:

- Slow query troubleshooting
- Query latency optimization
- Large table indexing strategy
- Backend scalability optimization
- Database performance engineering

## Notes

Indexing strategy directly impacts backend database scalability and production performance.