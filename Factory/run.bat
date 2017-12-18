@echo off
cls
if not exist classes mkdir classes
if exist app.jar del app.jar

for %%a in (.) do set currentfolder=%%~na
echo Project %currentfolder%
echo Design Pattern - Factory Pattern
echo In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
echo.

echo ## Compiling JAVA files ##
javac -sourcepath src src/*.java -d classes
echo.

echo ## Running CLASS files ##
java -cp classes App
echo.



echo ## Creating JAR file ##
jar cfve app.jar App -C classes .
echo.

echo ## Running jar file ##
java -cp classes -jar app.jar
echo.

del app.jar

rmdir /S /Q classes