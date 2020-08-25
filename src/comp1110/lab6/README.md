# COMP1110 Lab 6

### Before the Lab

* Make sure you've covered module [**X01**](https://cs.anu.edu.au/courses/comp1110/lectures/javafx/) (JavaFX)

### Purpose

In this lab you will write a more advanced JavaFX program.

**It is important to complete this lab.   Your tutor will mark your engagement during the lab.**  You will receive a mark of 0.9 for full engagement and a small bonus (a mark of 1.0) if you completed all the tasks during the lab (your tutor will use the CI to check this --- you don't need to be marked off).

## Part I: 30-Minute Check-In

As usual, you will do _two_ things during the 30-minute check-in:

1.  Check in with **your tutor** together with the other members of your group.    Briefly outline any issues you're having that you'd particularly like help with during the lab (make sure you have your journal open and refer to it when you meet with your tutor).
2.  When you're not doing your check-in with your tutor, you should be listening to the **lab leader** as they give an overview of what you'll be going through in this week's lab.

## Part II:  Your Lab Tasks

### JavaFX Shapes

1.  **Create a new JavaFX class.**

    In the Java package `comp1110.lab6` within your labs repo, create a new Java class, `Board`, which extends `javafx.Application`, that draws a 600x519 pixel window.  Set the window title to "Board".

2.  **Draw a triangle**

    Create an upright 200x200x200 equilateral triangle within the scene you made in step 1. Use the `Polygon` class. From the origin (0,0), the triangle should extend an equal distance in both positive and negative x directions, and positive and negative y directions. Use `setLayoutX()` and `setLayoutY()` to recenter the triangle in the middle of your window. Set the fill color of the triangle to `LIGHTGREY`.

    ![alt triangle](assets/lab6a.png)
    
    *Hint: Relative to the origin, the apex of the triangle should be at (0.0, -86.6), and the right and left corners of the base should be (100.0, 86.6) and (-100.0, 86.6), where 100 = 200/2 and 86.6 = sqrt((200*200)-(100*100))/2;*

3.  **Create an inner class**

    Create an inner class, `Triangle`, which extends `Polygon` and has a constructor with signature `Triangle(double x, double y, double side)`. This should create an upright equilateral triangle, centered at (`x`,` y`), with sides of length `side`.

    Comment out the code you wrote in step 2 (that drew the triangle with Polygon), and replace it with the creation of a `Triangle`. Set the fill color of the new triangle to `LIGHTGREY`. Don't forget to add your triangle to the root group.

4.  **Fill the board with triangles**

    Fill the board with a grid of triangles, storing each triangle in an ArrayList<Triangle>.  You should fit exactly three rows (each 173.2 pixels apart), each row having five triangles (three upright and two inverted). You will need to use the setRotate() method to invert some of the triangles.
    

    
5. **Create a white border**

    Reduce the size of each triangle to 196 pixels, while maintaining the spacing as if they were size 200. This should create the effect of a white border around each triangle.

    ![alt board](assets/lab6b.png)

6. **Finish up**

    Commit your code, push it, close the relevant issue (#18), and show your work
to your tutor.


### Work on your group assignment

Use any spare time to work on your group assignment.




