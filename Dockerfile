FROM openjdk:11-jre-slim
#ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8789
ADD target/login-service-0.0.1-SNAPSHOT.jar login-service.jar
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=n","-jar","login-service.jar"]