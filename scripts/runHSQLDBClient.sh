#!/bin/sh

java -cp /opt/devel/db/hsqldb-2.2.4/lib/hsqldb.jar org.hsqldb.util.DatabaseManagerSwing --url jdbc:hsqldb:hsql://localhost/workdb
