#!/bin/bash

java -cp ./scripts/hsql-2.4.0.jar org.hsqldb.server.Server --database.0 mem:mydb --dbname.0 workdb
