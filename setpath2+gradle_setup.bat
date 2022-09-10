@ECHO OFF
ECHO *** Path before:
ECHO %PATH%
ECHO ***
ECHO *** JAVA_HOME before:
ECHO %JAVA_HOME%
ECHO ***
PAUSE
SET PATH=C:\Program Files\Java\jdk1.8.0_333\bin
SET PATH=%PATH%;%SystemRoot%\system32
SET PATH=%PATH%;%SystemRoot%\System32\Wbem
SET PATH=%PATH%;%SYSTEMROOT%\System32\WindowsPowerShell\v1.0\
SET PATH=%PATH%;%SYSTEMROOT%\System32\OpenSSH\
SET PATH=%PATH%;%SYSTEMROOT%\Git\cmd
SET JAVA_HOME=C:\Program Files\Java\jdk1.8.0_333
ECHO *** Path after:
ECHO %PATH%
ECHO ***
ECHO *** JAVA_HOME after:
ECHO %JAVA_HOME%
ECHO ***
PAUSE
CALL .\gradlew setupDecompWorkspace