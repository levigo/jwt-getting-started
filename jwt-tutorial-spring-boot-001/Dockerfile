FROM openjdk:11-jre-slim

# Update and install the fontconfig tool
RUN apt-get update && \
        apt-get install -y wget fontconfig

# Install "Standard14 Fonts": These standard fonts are used as font substitutes in some cases. E.g. if non-embedded fonts are used inside a PDF
RUN wget -O /tmp/documentplatform-standard14-fonts.tar.gz https://github.com/levigo/documentplatform-standard14-fonts/archive/documentplatform-standard14-fonts-2.3.tar.gz \
        && mkdir -p /usr/share/fonts \
        && tar -xzvf /tmp/documentplatform-standard14-fonts.tar.gz -C /usr/share/fonts --strip 8 documentplatform-standard14-fonts-documentplatform-standard14-fonts-2.3/src/main/resources/com/levigo/jadice/fonts \
        && fc-cache -f -v 

ADD target/*.jar /app.jar
ENTRYPOINT java $JAVA_OPTIONS -Djavax.accessibility.assistive_technologies=" " -XX:+UnlockExperimentalVMOptions -XX:+UseContainerSupport  -Djava.security.egd=file:/dev/./urandom -jar /app.jar

VOLUME /tmp /config
EXPOSE 8080
