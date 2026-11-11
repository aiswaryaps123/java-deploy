# Java Web Application Deployment on Linux using Apache Tomcat

## Project Overview

This project demonstrates the development, building, and deployment of a Java web application on a Rocky Linux server using Apache Tomcat.

The application was developed using Java Servlets and Maven, packaged as a WAR file, and deployed on Apache Tomcat.

## Technologies Used

- Java 17
- Apache Maven 3.6.3
- Java Servlet API 4.0.1
- Apache Tomcat 9
- Rocky Linux 9.7
- Git and GitHub
- PuTTY

## Project Architecture

Java Source Code → Maven Build → WAR File → Apache Tomcat → Web Browser

## Project Structure

```text
hello-java-app/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/
│       │       └── HelloServlet.java
│       └── webapp/
│           ├── index.jsp
│           └── WEB-INF/
│               └── web.xml
├── pom.xml
├── .gitignore
└── README.md
```

## Implementation Steps

1. Verified Java and Maven installations.
2. Created a Maven web application.
3. Developed a Java Servlet.
4. Configured Servlet URL mapping using web.xml.
5. Configured Maven dependencies and build plugins.
6. Generated the WAR file using Maven.
7. Installed Apache Tomcat 9 on Rocky Linux.
8. Created a dedicated Tomcat Linux service account.
9. Configured Tomcat as a systemd service.
10. Deployed the WAR file into Tomcat's webapps directory.
11. Configured the firewall to allow port 8080.
12. Tested the deployed application through a web browser.

## Build the Application

```bash
mvn clean package
```

## Deploy the Application

Copy the generated WAR file into Tomcat's webapps directory:

```bash
cp target/hello-java-app.war /opt/apache-tomcat-9.0.123/webapps/
```

## Application URL

```text
http://SERVER-IP:8080/hello-java-app/hello
```

## Expected Output

Welcome to My First Java Application!

Successfully Deployed on Linux Server.

Powered by Java 17 and Apache Tomcat.

## Learning Outcomes

- Java web application development.
- Maven build automation.
- WAR packaging and deployment.
- Linux user and permission management.
- Tomcat installation and configuration.
- systemd service management.
- Linux firewall configuration.
- Git version control and GitHub.
