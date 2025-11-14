# Tomcat + Java 17
FROM tomcat:9.0-jdk17

# Remove default ROOT app
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy your WAR file from Maven target folder
COPY target/QueryResolvingSystem-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war


# Expose port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
