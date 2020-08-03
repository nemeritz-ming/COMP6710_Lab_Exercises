# COMP1110 Lab 5

### Before the Lab

* Complete week 6 of your personal journal, commit and push at least 5 minutes prior to your lab.

* Make sure you've covered the modules [**J9**](https://cs.anu.edu.au/courses/comp1110/lectures/java/#J9) (Lambda expressions) and [**X1**](https://cs.anu.edu.au/courses/comp1110/lectures/javafx/#X1) (JavaFX)

### Purpose

In this lab you will write a simple Java FX program.

**It is essential that you complete this lab and have a tutor mark it off during the lab**.

## Part I: 30-Minute Check-In

As usual, you will do _two_ things during the 30-minute check-in:

1.  Check in with **your tutor** together with the other members of your group.    Briefly outline any issues you're having that you'd particularly like help with during the lab (make sure you have your journal open and refer to it when you meet with your tutor).
2.  When you're not doing your check-in with your tutor, you should be listening to the **lab leader** as they give an overview of what you'll be going through in this week's lab.

## Part II:  Your Lab Tasks

### A simple JavaFX animation

Your objective here is to familiarize yourself further with JavaFX by creating
a simple window with a moving 'ant'.

In the Java package comp1110.lab5, within your comp1110-labs
repository, create a new Java class, `Ant`, that draws the path of an
ant that is walking randomly around a JavaFX window. This should look
a little like a scribbling on a page. If the ant walks off the edge of
the screen re-center the ant and continue the random walk. Use the
basic template from the code from lecture X01 (or the
[HelloTutor](../lab1/HelloTutor.java) example from Lab 1). In addition
to that, you may find the following helpful:

````java
...
primaryStage.setScene(scene);

Timeline timeline = new Timeline(new KeyFrame(Duration.millis(100),
                            ae -> {
                                   /* your code goes here */
                                  }));
timeline.setCycleCount(Animation.INDEFINITE);
timeline.play();
primaryStage.show();
...
````
that little bit of code will be called once every 100 milliseconds (10 times a second).


![alt ant](assets/lab5.png)

### Extension

**Use recursion to reverse an ArrayList**

Create a recursive method reverseArray.

The method should take an ArrayList of characters and return the same ArrayList with the characters reversed.
E.g. if you start with `['a','b','c','d','e']` the method should return `['e','d','c','b','a'].

For the method to be recursive, it needs to call itself at some point. 


**Use recursion to print a triangle (harder)**

Create a method `trianglePrinter`.

The method should take an integer as input, and print out a triangle with that many rows.The triangle should look like the triangle from lab 2, except the bottom row should have spaces instead of stars.
For example, if you run trianglePrinter(5):
```
____*
___*_*
__*___*
_*_____*
*_______*

```
To be recursive, the method needs to call itself at some point.
