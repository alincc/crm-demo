FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD crm-eureka-registry-0.0.1-SNAPSHOT.jar crm-eureka-registry.jar
RUN sh -c 'touch /crm-eureka-registry.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /crm-eureka-registry.jar" ]
