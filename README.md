# MCP Coding Server Demo with Claude AI

This repository demonstrates the integration of Claude AI into a development workflow using the Model Context Protocol (MCP), showcasing how AI can be effectively utilized in software development processes. The project includes both the MCP integration server and a practical demonstration through a Todo List application.

## 🌟 Project Overview

This project consists of two main components:

1. **MCP Integration Server**
   - A server implementation of the Model Context Protocol
   - Manages context and communication with Claude AI
   - Provides structured prompting and response handling
   - Maintains conversation history and project context

2. **Todo List Application Demo**
   - A practical showcase of AI-assisted development
   - Built with Java EE and Quarkus
   - Demonstrates how Claude AI can assist in real-world application development

## 🔧 Architecture

### MCP Server Components

```
mcp-coding-server-demo-app/
├── prompts/                # Prompt templates and configurations
│   ├── project prompt.xml  # Global context settings
│   └── history/            # Conversation history storage
├── java-app/               # Demo Todo List application
└── mcp-server/             # Model Context Protocol server
```

### Key Features

- **Structured Context Management**
  - Maintains project context across conversations
  - Validates and enforces development guidelines
  - Manages file system access and version control

- **Intelligent Prompting System**
  - Template-based prompt management
  - Context-aware responses
  - Error handling and validation protocols

- **Development Integration**
  - Git integration with smart commit messages
  - File system management
  - Code analysis and validation

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- MySQL 8.0 or higher
- Maven
- Git

### Installation

_Coming Soon_

## 📱 Todo List Demo Application

The included Todo List application serves as a practical demonstration of AI-assisted development. It showcases:

- Full-stack Java EE development with Quarkus
- REST API implementation
- Database integration
- UI development with Qute
- Test suite implementation

## 📚 Documentation

_Coming Soon_

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

