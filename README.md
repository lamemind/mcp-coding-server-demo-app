# Todo List App - Claude MCP Demo

A demonstration project showcasing the capabilities of Claude AI with Model Context Protocol in creating a Java EE application.

## Project Overview

This Todo List application is built using:
- Java 17
- Quarkus 3.17.3
- Qute templating engine
- MySQL database

## Features

- REST API endpoints for task management
- Database persistence layer
- Clean and functional user interface
- Comprehensive test suite (unit + integration)

## Project Structure

```
it.lamemind.todoapp/
├── data/           # Database access layer
├── rest/           # REST endpoints
├── ui/             # User interface components
└── test/           # Testing suite
```

## Getting Started

### Prerequisites

- Java 17 or higher
- MySQL 8.0 or higher
- Maven 3.8+

### Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd java-app
```

2. Configure your MySQL database connection in `application.properties`

3. Build the project:
```bash
./mvnw clean package
```

4. Run the application:
```bash
./mvnw quarkus:dev
```

The application will be available at `http://localhost:8080`

## Development

This project follows standard Java EE practices with Quarkus extensions. The codebase is organized using a layered architecture:

- Data layer: MySQL database access using Panache
- Business layer: REST endpoints and service implementations
- Presentation layer: Qute templates for the UI

## Testing

Run the test suite with:
```bash
./mvnw test
```

## Documentation

Additional documentation is available in the `/docs` directory, including:
- API specifications
- Database schema
- Development guidelines

## License
MIT License
