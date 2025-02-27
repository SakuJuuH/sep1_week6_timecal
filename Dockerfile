FROM maven:latest

WORKDIR /app

COPY pom.xml /app/

RUN mvn -v

RUN ls -la /app

COPY . /app/

RUN mvn clean package

CMD ["java", "-jar", "target/timecal.jar"]