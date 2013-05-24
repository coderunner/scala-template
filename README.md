scala-template
--------------

This repository holds a basic sbt/scala project template to get you up and running quickly with Scala using SBT.

How to use this project template?
---------------------------------

* Download https://github.com/coderunner/scala-template/archive/master.zip and unzip it!
* Or fork the repository and git clone it.
* Make sure Java 1.6 or higher installed on your machine. If not, install it http://java.com/en/download/help/download_options.xml
* Download and install SBT (simple build tool) from http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html. SBT is a development tool used to compile, run and manage project's dependencies.

Compile and Run
---------------

Go into the project directory and on the command line run

    sbt compile

This will compile this template project.

Run the application using

    sbt run

Run the tests using

    sbt test

Using IDEA
----------------
Any editor can be used, but if you are using IntelliJ IDEA, install the scala plugin (File -> Settings -> plugins)

Within the project folder, run

    sbt gen-idea

This command generates the IDEA project files.
