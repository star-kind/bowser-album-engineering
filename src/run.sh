# del ./*.class;del ./*/*.class;

javac -cp ".:../lib/jackson/*" MainApp.java
java -cp ".:../lib/jackson/*" MainApp

