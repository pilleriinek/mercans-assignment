# Description

## Prerequisites
- Have IntelliJ IDEA installed
- Have Java 1.8 JDK installed
- Have Maven installed

## Execute tests

```
mvn clean test
```

## Test cases
Test cases make an assumption that both of the users don't have any pending or already accepted leave requests on defined leave periods by the test.

### Employee tests
1) loginTest - checks if employee account login is successful with correct credentials 
2) requestAnnualLeaveTest - checks if requesting new annual leave is successful

### Manager tests

1) loginTest - checks if manager account login is successful with correct credentials
2) requestSickLeaveTest - checks if requesting sick leave is successful
3) acceptAnnualLeaveTest - checks if accepting pending annual leave my manager is successful

