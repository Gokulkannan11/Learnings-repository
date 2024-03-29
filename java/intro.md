# Inroduction

- Java is a *compiled* programming language, meaning the code we write in a **.java** file is transformed into *byte code* by a compiler before it is executed by the Java Virtual Machine on your computer.
- A compiler is a program that translates human-friendly programming languages into other programming languages that computers can execute.
- public class name  should always match the file name of the program
- Every main method has a class
- for single line command `//`  is used
- For multiline command `/* */` is used.
- we can compile a **.java** file from the terminal with the command:

```java

javac Filename.java
```

If the file compiles successfully, this command produces an *executable* class: **FileName.class**. Executable means we can run this program from the terminal.

We run the executable with the command:

```java
java Filename
```
## Syntax

```java

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

```