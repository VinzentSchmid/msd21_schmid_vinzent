# Logging

### 1. Why we use logging libraries ?
Logs are  very important for development, testing, and finding the place of occurrence of a problem.
The use of standard print statements is not a good way of logging. It is really difficult to track 
these print statements in a pool of extra logs coming from other sources like Maven.

### 2. How many log levels are in log4J and meanings
Log levels are a mechanism to categorise logs. Levels used for identifying the severity of an event. We can easily configure levels to specify which log details we want to see

 - ALL – To log all events.
 - DEBUG – A general debugging event.
 - ERROR – An error in the application, possibly recoverable.
 - FATAL – A severe error that will prevent the application from continuing.
 - INFO – An event for informational purposes.
 - TRACE – A fine-grained debug message, typically capturing the flow through the application.
 - WARN – An event that might possibly lead to an error.
 - OFF – No events will be logged.

### 3. Which configurations do you have with log4J

We can configure Log4j2 with our application using a configuration file written in XML, JSON, YAML, or properties format. We can do it programmatically as well but let’s focus on configuring using configuration files as of now. Log4j has the ability to automatically configure itself during initialization. It has an order to look for the configuration file in the application. Log4j will provide a default configuration if it cannot locate a configuration file.