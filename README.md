simple-aop
==========

Simple AOP example

This is just an example project for me to play around with to learn about Java
and the ecosystem. I am trying to learn what I am doing with java from the
command line but including gradle as it will make it easier for future use.

In order to compile all my classes I need to do the following from the root
directory of the project:

    `javac **/*.java`

The above command will take all java files in the project and compile them to
class files. Then I would like to run my program. I will need to run the
following two commands.

    `cd src/main/java`
    `java com.williamsbdev.Main`

This will execute the Main.class which contains your main function.

To make this simpler, there is a build tool called gradle. I ran the following
commands (from a mac) to setup gradle:

    `brew install gradle`

Next I created the build.gradle file. I added some plugins, `java` and
`application`, to help the process and this allows me to do the following:

    `gradle build run`

This will compile all of your classes into a build/classes directory and also
create a jar with the name of your project directory under build/libs. Then
with the run command and the configuration for the `application` plugin
`mainClassName`, it will execute the jar pointing to the main class similar to
the java command below:

    `java -cp build/libs/simple-aop.jar com.williamsbdev.Main`
