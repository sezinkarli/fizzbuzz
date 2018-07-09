FROM odamax/securewildfly
MAINTAINER Bahadir Gurpinar
ADD ./target/fizzBuzzService-1.war ${DEPLOYMENT_DIR}
ENTRYPOINT ${WILDFLY_HOME}/bin/standalone.sh -c standalone.xml  -b=0.0.0.0
VOLUME ["/opt/fizzbuzz/standalone/log"]
VOLUME ["/opt/temp"]
ENV ENV prod