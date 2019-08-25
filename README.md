# Apache Maven (Command Line)
# Creating a Simple Java Project name: mvn-cmd :smile:

## Step 1: Create the java project
```
Syntax: mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

Explanation: For beginners,
Only two things are of concern:
1) Group ID: This will be our package name.
2) Artifact ID: This is our project name (mvn-cmd)
```
![Image](https://github.com/NishkarshRaj/Maven-Using-CMD/blob/master/Screenshots/Create%20Project.png)

## Step 2: Check the Directory Structure of created project
```
At the source folder of the project:
1) src/ 
It contains two folders:
1.1) main/ 
It is used to create codes in java
1.2) test/
It is used to create JUnit Test cases
2) pom.xml 
Pom.xml is the mail build file of the maven!
```
![Image](https://github.com/NishkarshRaj/Maven-Using-CMD/blob/master/Screenshots/Maven%20Directory%20Structure.png)

## Step 3: Change the source code (and file name) as you want to make
```
Go to /src/main/java/pkg1
NOTE: pkg1 is the package name we defined while creating the project.
Always include package name in the code.
Modify the app.java file 
Rename to the file name you want.
```
![Image](https://github.com/NishkarshRaj/Maven-Using-CMD/blob/master/Screenshots/Source%20Directory%20for%20coding.png)

## Step 4: Clean the project area
## Syntax: mvn clean
```
Before start building a project, it is necessary to delete old configuration files.
mvn clean command is used to delete the target/ folder.
```
![Image](https://github.com/NishkarshRaj/Maven-Using-CMD/blob/master/Screenshots/mvn%20clean.png)

## Step 5: Compile the Project source code
## Syntax: mvn compile
```
This command is used to check whether the source code we wrote in java file is correct syntactically or not.
```
![Image](https://github.com/NishkarshRaj/Maven-Using-CMD/blob/master/Screenshots/mvn%20compile.png)

## Step 6: Unit Testing
## Syntax: mvn test
```
This work is tricky. 
You must know how to create JUnit Test cases.
You need to define the Unit Test cases in /src/test/pkg1
```
![Image](https://github.com/NishkarshRaj/Maven-Using-CMD/blob/master/Screenshots/mvn%20test.png)

## Step 7: Install (Build the Project)
```
Checks the Maven Configuration in pom.xml file
Creates the project build.
Creates jar file in target/ folder which can be deployed
```
![Image](https://github.com/NishkarshRaj/Maven-Using-CMD/blob/master/Screenshots/mvn%20install.png)

## Step 8: Site 
## Syntax: mvn site
```
Maven Site command is used to create GUI reports
It creates reports in format of web pages in HTML+CSS format.
Site Reports are stored in /target/site
```
![Image](https://github.com/NishkarshRaj/Maven-Using-CMD/blob/master/Screenshots/mvn%20site.png)

## Here is one Web Page of Site Report

![Image](https://github.com/NishkarshRaj/Maven-Using-CMD/blob/master/Screenshots/mvn%20site%20results.png)
