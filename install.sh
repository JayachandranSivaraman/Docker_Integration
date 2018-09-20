#!/usr/bin/env bash

set -e

cd /app
cd src
javac LongestEvenNumber.java
java LongestEvenNumber
echo "execution completed"
