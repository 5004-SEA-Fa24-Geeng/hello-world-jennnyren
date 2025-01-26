# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
classDiagram
    class AlohaWorld {
        - AlohaWorld()
        + main()
    }

    class ConsoleView {
        - Scanner SCANNER
        - List~String~ LOCALITY_OPTIONS
        - ConsoleView()
        + getName()
        + getLocality()
        + checkRunAgain()
        + printGreeting()
    }

    class Greeter {
        - String name
        - int locality
        - List~String~ localityList
        - int HAWAII=1
        - int CHINA=3
        - int ITALY=4
        - int DEFAULT_LOCALITY=2
        + Greeter(String name)
        + Greeter(String name, int locality)
        + String getName()
        + int getLocality()
        + setLocality(int locality)
        + String greet()
        + String greet(boolean asciiOnly)
        - String getLocalityString()
        + int hashCode()
        + boolean equals(Object obj)
        + String toString()
        + List~String~ getLocalityList()
    }

    AlohaWorld ..> Greeter
    AlohaWorld ..> ConsoleView
    ConsoleView ..> Greeter

### Program Flow
Program flow:

The program begins execution in the main method of the `AlohaWorld` class. 
It prompts the user for their name through `ConsoleView.getName()` method, and asks the user to select a locality via the `ConsoleView.getLocality()` method.

A `Greeter` object is created with the user’s name and selected locality, and the `Greeter.greet()` method is called to generate the greeting message, which is displayed using `Consoleview.printGreeting()` method.

After displaying the greeting, the program enters a loop controlled by the user’s choice. The `ConsoleView.checkRunAgain()` method determines if the user wishes to receive another greeting.

The `AlohaWorld.java` acts as the entry point of the program and manages the overall flow by interacting with other classes. The `ConsoleView.java` handles all user interactions including collecting the user’s name and locality, displaying the message and confirming if the user wants to continue. The `Greeter.java` represents a greeter object containing the user’s name and selected locality, generates greeting messages based on the selected locality and provides methods to update and validate the locality dynamically. 

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   * `System. in`
   * `static`
   * `final`


2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * The `final` keyword is used to create constants or to prevent modifications. It can be applied to variables, methods and classes. For example, when a variable is declared as `final`, its value cannot be changed: `final int AGE = 30;`
    * `System. in` is a part of the `java.lang`package that represents the standard input system. It is used to read input from the user in a console application. For example: `Scanner scanner = new Scanner(System.in);`
    * The `static` keyword is used to define members that belong to the class rather than any other specific instances in the class. It can be applied to variables, methods, blocks and nested classes. For example, `static int count = 0;`


3. What does `main` do in Java? 

    It acts as a 'driver' in the program, in other words, it gets the program running.


4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

    The `toString()` method is used to provide a string representation of an object. The reason why we override `toString()` is to improve readability and it helps debug.

5. What is javadoc style commenting? What is it used for? 

    Javadoc is a documentation tool that generates a HTML that includes comments written in the specific java code, and these comments are called Javadoc-style comments, staring with /** and end with */. It is used to generate documentation and improve code readability.


6. Describe Test Driving Development (TDD) in your own words. 

    TDD is a process where we write tests before the writing the actual code.

7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?
Containing the client interaction in `ConsoleView` aligns with best practices in software design. It makes the application easier to test, maintain, and extend while keeping the program's components focused on their individual responsibilities.

2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.
We can modify ConsoleView class to make it easier to add new localities.


> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.


<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java