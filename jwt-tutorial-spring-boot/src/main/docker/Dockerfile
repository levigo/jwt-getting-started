FROM openjdk:8-jre-slim

# Install "Standard14 Fonts":
RUN apt-get update && \
        apt-get install -y wget fontconfig

RUN wget -O /tmp/documentplatform-standard14-fonts.tar.gz https://github.com/levigo/documentplatform-standard14-fonts/archive/documentplatform-standard14-fonts-2.3.tar.gz \
        && mkdir -p /usr/share/fonts \
        && tar -xzvf /tmp/documentplatform-standard14-fonts.tar.gz -C /usr/share/fonts --strip 8 documentplatform-standard14-fonts-documentplatform-standard14-fonts-2.3/src/main/resources/com/levigo/jadice/fonts \
        && fc-cache -f -v 

# Install Java
#RUN apt-get update && apt-get -y install curl \
#    && curl -L -b "oraclelicense=a" -O https://download.oracle.com/otn-pub/java/jdk/8u191-b12/2787e4a523244c269598db4e85c51e0c/jdk-8u191-linux-x64.tar.gz
#RUN mkdir /usr/local/oracle-java-8 && tar -zxf jdk-8u191-linux-x64.tar.gz -C /usr/local/oracle-java-8 \
#	&& update-alternatives --install "/usr/bin/java" "java" "/usr/local/oracle-java-8/jdk1.8.0_191/bin/java" 1500 \
#	&& rm -rf jdk-8u191-linux-x64.tar.gz 

ADD *.jar /app.war
ENTRYPOINT java $JAVA_OPTIONS -Djavax.accessibility.assistive_technologies=" " -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Djava.security.egd=file:/dev/./urandom -jar /app.war

VOLUME /tmp /config
EXPOSE 8080
