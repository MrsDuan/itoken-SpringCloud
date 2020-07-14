FROM openjdk:8-jre
MAINTAINER dct<duancuntao@qq.com>

RUN wget http://github.com/jwilder/dockerize/releases/download/v0.6.1/dockerize-linux-amd64-v0.6.1.tar.gz && tar -C /usr/local/bin -zxvf dockerize-linux-amd64-v0.6.1.tar.gz && rm dockerize-linux-amd64-v0.6.1.tar.gz

RUN mkdir /app

COPY itoken-eureka-1.0.0-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["dockerize","-timeout","5m","-wait","http://192.168.137.131:8888/eureka/dev/master","java","-Djava.security.egd=file:/dev/.urandom","-jar","/app/app.jar","--spring.profiles.active=prod"]

EXPOSE 8888
