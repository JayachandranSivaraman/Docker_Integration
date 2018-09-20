#!/usr/bin/env bash

set -e

docker build -t dockerintegrationproject .

docker run dockerintegrationproject sh install.sh






