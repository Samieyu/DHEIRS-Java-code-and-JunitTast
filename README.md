# D-HEIRS: Digital Health Information Reporting System

A Java-based skeleton implementation of a health reporting and management system. This project defines the core entities and roles involved in digital health data flow at the community and administrative levels.

## Project Overview

D-HEIRS is designed to facilitate the collection, review, and reporting of health data through various stakeholders including Health Extension Workers (HEW), Coordinators, and HMIS Officers.

## Project Structure

```text
DHEIRS-Java-code-and-JunitTast/
├── src/
│   └── Dheircode/            # Package containing all source files
│       ├── User.java         # Base class for all users
│       ├── Administrator.java
│       ├── HealthExtentionWorker.java
│       ├── HEWCoordinator.java
│       ├── HMISOfficer.java
│       ├── Supervisor.java
│       ├── LinkageFocalPerson.java
│       ├── HealthData.java   # Entity for health records
│       ├── Household.java    # Entity for household registration
│       ├── Report.java       # Entity for consolidated reports
│       ├── ActivityLog.java  # Logging system
│       ├── Role.java         # Role and permission management
│       ├── userTest.java     # Unit tests for User class
│       └── RoleTest.java     # Unit tests for Role class
├── bin/                      # Compiled class files
├── build.xml                 # Ant build configuration
├── dhelrs.jar                # Packaged application
└── vpproject/                # Visual Paradigm project files (diagrams)
```

## Core Classes & Features

- **User System**: Implements basic login/logout functionality and role-based access.
- **Health Data Management**: Classes for registering households and entering health data.
- **Workflow**: Classes defining the flow of data from HEWs up to DHIS2 integration.
- **Testing**: Includes JUnit 4 test cases for verifying core logic.

## Compilation & Usage

To compile the project manually using `javac`, run the following from the root directory:

```bash
# Compile all source files into the bin directory
javac -d bin src/Dheircode/*.java src/module-info.java
```

Note: To compile the test files (`userTest.java`, `RoleTest.java`), you will need the JUnit 4 library on your classpath.

## Current Project Status

> [!NOTE]
> This project is currently in a skeleton stage. Most business logic methods (e.g., `generateReports()`, `createUserAccounts()`) are placeholders that throw `UnsupportedOperationException`.

### Recently Identified Fixes:
- Corrected typo in `Household.java`: `hosheholdId` -> `householdId`.
- Corrected typo in `Role.java`: `managerUserAccounts` -> `manageUserAccounts`.
- Identified naming convention issues (e.g., `userTest.java` should be `UserTest.java`).
- Identified misspelling in `HealthExtentionWorker.java` (should be `Extension`).
