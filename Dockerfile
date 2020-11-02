# from base image centos
FROM java:8

EXPOSE 80
VOLUME /data/upload

#inatall app
ADD target/editor-markdown-0.0.1-SNAPSHOT.jar /usr/project/

#start app
ENTRYPOINT ["java" ,"-jar","/usr/project/editor-markdown-0.0.1-SNAPSHOT.jar"]