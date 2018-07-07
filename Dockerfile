FROM odamax/securewildfly
MAINTAINER Bahadir Gurpinar
ADD ./target/fizzbuzz-1.0-SNAPSHOT.war ${DEPLOYMENT_DIR}
ENTRYPOINT ${WILDFLY_HOME}/bin/standalone.sh -c standalone.xml  -b=0.0.0.0
VOLUME ["/opt/salesforce/standalone/log"]
VOLUME ["/opt/temp"]
ENV ENV prod