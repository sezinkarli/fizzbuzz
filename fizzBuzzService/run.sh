sudo docker run -d -p 9090:808 0  -v /opt/salesforce/log:/opt/wildfly-10.0.0.Final/standalone/log -v /opt/temp:/opt/temp -e "TZ=Europe/Istanbul" -e "ENV=prod" --name salesforce odamax/salesforce