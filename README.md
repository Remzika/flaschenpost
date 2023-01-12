# flaschenpost
## IT Exercise (Create a set of automated tests)
## About The Project
#### Test automation is built using the Cucumber BDD framework with Selenium for UI testing. Rest-Asurred is used for JsonSchema Validation.
---

### Built With
+ Java 17
+ Selenium 4.7.1
+ Maven 4.0
+ Cucumber Junit 7.10.1 
+ POM
+ Rest-Assured 5.2.1
+ Json-schema-validator from Rest-Asurred 4.3.3
---
## Prerequisites
#### It is Java-Selenium project. To run it needs Java 1.8 jdk. You may run that test framework on your local in your IDE (IntelliJ recommended). Also it can start from command line. In order to run from commandline you need to have Maven in your local.
### Usage
#### The Runner class in the Runners folder is responsible for running the UI part of the test.

1. Go to the Runner Class ("couk/fashionette/Runners/CukesRunner.java")

2. Make sure DryRun = False

3. Negative Test scenario is created to show that screenshots can be taken.

You can choose which Scenarios to run with any name annotation by putting them in front of the Scenarios. You can run the test via Maven-Lifecycle-Verify or from your local shell with maven "mvn correct".

### Contact
Remzi Kayip  remzika58@gmail.com
#### Project Link:  https://github.com/Remzika/flaschenpost.git
