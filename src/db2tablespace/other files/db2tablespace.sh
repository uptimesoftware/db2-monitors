#!/bin/sh

../../jre/bin/java -jar db2tablespace.jar "$UPTIME_HOSTNAME" "$UPTIME_DBPORT" "$UPTIME_DBUSER" "$UPTIME_DBPASSWORD" "$UPTIME_DBNAME"
