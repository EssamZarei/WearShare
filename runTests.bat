@echo off
javac -cp ".;lib/*" WearShare.java WearShareTest.java
java -cp ".;lib/*" org.junit.platform.console.ConsoleLauncher --select-class WearShareTest
