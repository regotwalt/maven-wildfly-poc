# Maven WildFly Proof of Concept

This project is a proof of concept of utilizing the Maven plugin for the WildFly application server.

## Install WildFly

Download WildFly 17 from the [WildFly download site](https://wildfly.org/downloads/).

Unzip the download in a location of your choice (we'll refer to this as `WILDFLY_HOME` for the rest of the guide).

Open `pom.xml` and update the value of `wildfly.local.path` to point to `WILDFLY_HOME`.

Open a terminal and `cd` into `WILDFLY_HOME/bin`. Run `./add-user.sh`. Follow the steps to add a management user. Take note of the username and password you enter.

## Run the Application

Download Maven (if you do not already have it).

Open a terminal and `cd` into the directory where you've stored this project.

Run `mvn clean wildfly:run`.

Navigate to `http://localhost:9990` (you'll need your username and password from earlier). Under "Deployments", click on the "Start" link. Click on the project on the left and then click on the Context Root link. You should see "Hello World!!!" displayed.
