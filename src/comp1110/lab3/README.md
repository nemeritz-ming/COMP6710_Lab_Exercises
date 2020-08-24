# COMP1110 Lab 3

### Before the Lab

* Complete your personal journal for week 4, commit and push it at least 5 minutes prior to the first lab test.

* Make sure you've covered the modules [**O1**](https://cs.anu.edu.au/courses/comp1110/lectures/oo/#O1)(Object Creation) and [**O2**](https://cs.anu.edu.au/courses/comp1110/lectures/oo/#O2) (Constructor)

### Purpose

In this lab you will develop a very simple object-oriented Java
program, learn about the stack trace, practise debugging a more
complex program and will form groups for the group assignment.

**It is important to complete this lab.   Your tutor will mark your engagement during the lab.**  You will receive a mark of 0.9 for full engagement and a small bonus (a mark of 1.0) if you completed all the tasks during the lab (your tutor will use the CI to check this --- you don't need to be marked off).


## Part I: 30-Minute Check-In

As usual, you will do _two_ things during the 30-minute check-in:

1.  Check in with **your tutor**.  Briefly outline any issues you're having, that you'd particularly like help with during the lab (make sure you have your journal open and refer to it when you meet with your tutor).  After this week, you'll do check-in with your whole group, rather than individually.
2.  When you're not doing your check-in with your tutor, you should be listening to the **lab leader** as they give an overview of what you'll be going through in this week's lab.

## Part II:  Your Lab Tasks

### Assignment Groups.

During today's lab you need to get to know your group and assign roles as per
[deliverable D2A](https://cs.anu.edu.au/courses/comp1110/assessments/deliverables/#D2A).
A key element of this course is completion of this group project, so
this is a very important step.[README]()

Close the associated issue (#13) and contact your tutor once you've completed
[D2A](https://cs.anu.edu.au/courses/comp1110/assessments/deliverables/#D2A)..

### Tasks

**Group design exercise**

Your tutor will walk you through a group design exercise for the following problem.

*Problem brief*

A client at a software design company wants assistance processing
their documents.  After interviewing the client you find that their
documents consist of a one sentence title, a date, and a series of
paragraphs.  Each paragraph is a simple list of sentences.  Paragraphs
are separated by new lines.  Each document also has an author (first
and last name) and a document access level (open, internal or
confidential).

 At a minimal level the client would like the software to be able to:
* Count the number of words in the document (with or without the
  title)
* Count the number of characters in the document
* Print out a document
* Print out the date of the document
* Print out the author of the document

Additional desirable features:
* Count the number of a particular type of word (noun, verb, proper
  noun or other) 
* Given a title, date, author and a string for the remaining document,
  create a document file
* Spell check the document 

**Create, debug and test the Bucket class.**

This exercise develops the concept of an *object*.

What does an object combine?

1.    **Create a new class**

In the Java package `comp1110.lab3`, within your labs repo, create a new
Java class, `Bucket`.  Instances of this class will represent a bucket
that can be filled with water.  When you create a new `Bucket` object, that new object will
represent a bucket with a particular capacity, `capacity` and certain contents, `contents`.
The units of measurement are not important to this exercise, but you could imagine
that it was litres.

2.    **Write the constructor for the Bucket object**

The constructor for a Bucket should take the capacity as an argument.   The constructor's
signature should thus be `Bucket(double capacity)`.

In your object, both `capacity`
and `contents` should be stored as `doubles`.  Because `capacity` and `contents` are distinct
properties of *each object* (not properties of the class), they need to be
declared as **instance** fields, not *class* fields.
This means you don't use a `static` qualifier when you declare the field.   The `capacity` field will never
change (the capacity of a bucket is something that does not (normally) change), so it
can be declared as `final`.   Both fields should be private to the `Bucket` class.

**Discuss with group**: What would be an example of a class field (in terms of a Bucket class)? Can you think of an instance field of a bucket that would have type `String`?

3.  **Add methods to the Bucket object**

The `Bucket` class should have four public **instance** methods (not *static* methods).

 * The first is` getCapacity()`, which returns a double reflecting the capacity of the bucket.

 * The second is `getContents()`, which returns a double reflecting the current contents of the bucket.

 * The third is `empty()`, which will empty the bucket (its contents will now be zero), and will
 return the contents of the bucket before it was emptied (i.e. how much was emptied from the bucket).

 * The fourth is `add(double amount)`, which will add the given amount to the bucket, and increase
 the contents accordingly, but it will never increase the contents to be more than the capacity
 (i.e. any extra water will be spilled, so the total contents can never be higher than the capacity).
 It doesn't return anything.

**Discuss with group:** What's the difference between a static and instance method?
    Can you think of a static method that might be useful here?
    Is there a difference between a *class* method and a *static* method?

**Discuss with group:** If you run your code here, what are you expecting the output to be? What is the return type for constructors?

4.   **Create instances of type Bucket**

You should create a main method, and in that method, declare two local variables:
`big` and `small`, both of type `Bucket`.   Initialize `big` by
instantiating a new bucket with capacity 10.0.   Initialize `small` by instantiating
a new bucket with capacity 1.0.

5.  **Try out your Bucket methods**

    * Use the `add()` method to add 20.0 to each bucket
    * Print out the bucket contents using `getContents()`.  You should find that both buckets are full to capacity, but not more.
    * Use `empty()` to empty the `big` bucket and  print out the bucket's contents, and ensure that it is in fact empty.
    * Empty the `small` bucket into the `big` bucket.  Print out the contents of each of them and ensure that the `small` bucket is empty
    and the `big` bucket has 1.0 in it.


6.   **Test your program**

Test your work using the provided `L3 BucketTest` class.

Commit all of your work to git, push, close the associated issue (#12), and show your tutor.


### Extension

**Create a class that inherits from `Bucket`**

Add a new class `StackableBucket` to lab3. This class should inherit from the `Bucket` class.

Add a new instance field `innerBucket` of type `StackableBucket`. (Imagine you want to put a smaller bucket into a larger bucket.) Don't include this as an argument in the constructor; treat it like `contents` in the Bucket class.
Set the default equal to `null`.


Add the constructor `StackableBucket(double capacity,String name)`.
`name` should be a new instance field, capacity should come from the Bucket class.


Add a public instance method `getInnerBucket()` that will return name of the innerBucket.

Add a new public instance method `setInnerBuckets(StackableBucket smallerBucket)` which should:
* Print `Too large to stack!` if the `smallerBucket` has a larger capacity than the bucket.
* Set the `smallerBucket` as the innerBucket of your bucket, if your bucket has a larger capacity **and** does not curently have a innerBucket.
* If the bucket already has an innerBucket, the `smallerBucket` should try to stack into the `innerBucket`.

Try in main method:

Initialize 3 StackableBuckets- `big` with capacity `10.0`, `small` with capacity `1.0` and `medium` with capacity `5.0`. The names should be big, small and medium.
* Use `setInnerBucket()` to stack the `big` bucket into the `medium` bucket. If you run this, your code should print `Too large to stack!`.
* Use `setInnerBucket()` to stack the `medium` bucket into the `big` bucket. Print the `getInnerBucket()` of the `big` bucket. This should return `medium`
* Use `setInnerBucket()` to stack the `small` bucket into the `big` bucket. Print `getInnerBucket()` of the `big` and `medium` buckets. The small bucket should be stacked in the medium bucket, which is stacked in the big bucket.


Add a new public instance method `unstackBuckets()`. This method should remove all buckets from inside the bucket, unstack them from each other.
If you run this method on the `big` bucket, the big and medium buckets should now have no innerBucket.
