@echo off

for %%a in (.) do set currentfolder=%%~na
echo Project %currentfolder%

if not exist classes mkdir classes

javac -sourcepath src src/*.java -d classes

java -cp classes App

REM if exist app.jar del app.jar
REM jar cfve app.jar App ./classes/*.class
REM java -cp classes -jar app.jar
REM del app.jar

rmdir /S /Q classes