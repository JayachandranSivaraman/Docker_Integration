FROM openjdk

RUN apt-get update
# copy file
WORKDIR /app
COPY ./ /app	
