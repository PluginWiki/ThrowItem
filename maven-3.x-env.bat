set JVM_VerNo=jdk1.7.x

call X:\MiddleWares\JVM\set-jdk-vars.bat

set M2_HOME=X:\Development_Tools\Building-Utils\apache-maven-3.x
set M2_REPO=D:\Shared_Sources\repositories\maven2
set SVN_HOME=X:\CASE_Tools\SCM\svn-win32-1.5.x

set Path=%M2_HOME%\bin;%SVN_HOME%\bin;%Path%

echo "Call mvn with default settings.xml"
echo "mvn -gs %M2_HOME%\conf-default\settings.xml"

cmd