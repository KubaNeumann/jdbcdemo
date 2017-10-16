#!/bin/sh

java -cp ./db/hsql-2.4.0.jar  org.hsqldb.util.DatabaseManagerSwing --url jdbc:hsqldb:hsql://localhost/workdb
