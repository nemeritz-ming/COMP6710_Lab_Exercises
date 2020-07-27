# COMP1110 Lab 2

## Before the Lab

* Complete your [personal journal](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs/blob/master/journal.md) for week 2, commit it and push at least 5 minutes prior to the lab.

* Next week (week 3) will be the [lab test](https://cs.anu.edu.au/courses/comp1110/assessments/labtest/).You will still need to complete your personal journal for week 3, commit and push 5 minutes prior to the lab test.

* Make sure you've covered the material for modules [**J5**](https://cs.anu.edu.au/courses/comp1110/lectures/java/#J5) (Selection) and [**J6**](https://cs.anu.edu.au/courses/comp1110/lectures/java/#J6) (Iteration)

## Purpose

In this lab you will learn a little more about GitLab before you write,
test, and debug some small, *imperative* Java programs.   

All of the exercises are done with your labs
repo, and the Java exercises are done in IntelliJ.   You may work on your own
computer, but you will need to share your
work with your tutor and discuss it with them in your lab.

**It is essential that you complete this lab and have a tutor mark it off during the lab**.

## Introduce yourself to someone else in the lab!

If you have a question or a problem during a lab, chances are someone else is having the same issue. If you get stuck, we encourage you to discuss with other people in your lab as well as your tutor.
There will also be a few chances to discuss concepts and compare solutions with others.

Introduce yourself to someone else in your lab now - it'll help you later!

## GitLab Remedial Tasks (Fixing Problems From Week One)

There were major unforseen problems with gitlab during week one.   To
ensure everyone's repos are in good shape, please take the following
steps:

1. **Check that the COMP1110 marker bot has access to each of your forked
repos.**

    Do the following for each of your three forked repos (`comp1110-labs`,
`comp1110-ass1`, `comp1110-homework`):
    * Go to the repo in gitlab, in your browser.  The repo URL should
      be something like
      `https://gitlab.cecs.anu.edu.au/u1234567/comp1110-labs`, only with
      your UID, and the appropriate repo name.   You should see your
      name at the top left of the window.
    * Click on the *gear* icon at the bottom of the left margin menu,
    and select `Members` from the drop-down menu.
    * Look at the field titled **Existing members and groups**.   You
      should see two members: yourself, and another called **COMP1110 Sem 2
      2019 (Marker bot)**.
    * If you do not see these members **ask your tutor to fix the
      problem for you**.   *Please do not attempt to do this yourself*.
      Incorrectly configuring your membership may cause significant problems.

2. **Check that issues were created for you when you forked labs and
assignment repos**

    Do the following for the labs and assignment repos (`comp1110-labs`,
`comp1110-ass1`):
    * Go to the repo in gitlab, in your browser.  The repo URL should
      be something like
      `https://gitlab.cecs.anu.edu.au/u1234567/comp1110-labs`, only with
      your UID, and the appropriate repo name.   You should see your
      name at the top left of the window.
    * Click on the *ticket* icon, above the rocket in your left-hand
    margin menu, and select **Issues**.
    * You should see a list of issues.
    * If you **do** see a list of issues, things are OK with
      this repo and
      you can move on to check the next repo, or move to the [next lab
      exercise](#gitlab-task) if you've done both.
    * If you **don't** see a list of issues, but instead see something
    like the following, you will need to manually import them via the
    steps that follow:
      ![No Issues](https://cs.anu.edu.au/courses/comp1110/images/noissues-small.png)
    1. Download the issues for your repo to your computer.  Use the
    following links: [comp1110-labs](https://cs.anu.edu.au/courses/comp1110/help/issues/comp1110-labs-issues.csv), [comp1110-ass1](https://cs.anu.edu.au/courses/comp1110/help/issues/comp1110-ass1-issues.csv).
    2. Now, go back to your repo, click the *ticket* menu icon, and
       select issues.   You should see the screen above, which allows you to
       `Import CSV`.  Click on `Import CSV`.   Then click on `Choose
       File`, and navigate to the csv file you downloaded in the step
       above.  Be sure to
       double-check that you have the right issues file for the repo
       you're working on.  Once you've selected the correctly, click `Import
       Issues`.  You should now correctly see issues for this repo.
       If not, ask your tutor for help.
    3. Mark off any issues you've already completed.



## GitLab Task

1.  **Pulling upstream commits in GitLab**

	Remember that your labs and assignment repos are *forks*; your own variation
	of some other repo.   Once you've made the fork, your repo is independent
	and won't see any subsequent changes to the repo from which your fork was
	taken.

	Sometimes it is valuable to be able to pull changes from the repo from which
	you originally forked, and apply those changes to your repo.   In the case
	of our class, this is true if the master repo is updated with corrections
	or improvements.  In such cases, it would be good if you could relatively
	easily merge those changes into your own repo.   In this lab exercise you
	will learn how to do that.

	The [terminology](http://stackoverflow.com/questions/2739376/definition-of-downstream-and-upstream)
	of an *upstream* repo is often used to refer to the one from which a repo
	is derived.   In your case, the *upstream* repo is the one from which your
	repo was forked (one created by your lecturer).  Git has [advanced](https://git-scm.com/book/en/v2/Git-Basics-Working-with-Remotes)
	mechanisms for pulling changes from an upstream repo; we'll just look at
	something quite specific in this lab.

	You should compete the following exercise.   In these steps you will update
	your *personal* comp1110-labs repo with some changes.

	1. Open your comp1110-labs repo in IntelliJ.
	2. If you have any uncommitted changes, commit them before starting the upstream pull (VCS -> Commit Changes...).
	3. Select VCS -> Git -> Remotes...
	4. Select the "+" button to add the comp1110 labs repo as a remote upstream repo
	(Name: `upstream` URL:`https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs.git`). Select OK.
	5. Prepare to pull changes (VCS -> Git -> Pull...).
	6. Use the drop-down menu to change the 'Remote' to be
	`upstream(https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs.git)`.
	7. Refresh the list of branches by clicking the refresh button to the right of the dropdown.
	8. Select the `upstream/master` branch.
	9. Click `Pull`.  This should behave just like a merge from your last lab
	exercise, and work without further interaction.   If not, you may need to
	merge, in which case you should consult your tutor if you're unsure what
	to do.
	10. Bring up the `Version Control` panel at the bottom of your IntelliJ
	window, and select `Log`, and notice that you now have new changes in your history.
	10. `Push` your merge (VCS -> Git -> Push...)

After you pull remote commits into your repo and push them, they will
be visible to all clones of your repo.  Go to the GitLab web page for
your labs repo, and use the `Commits` and `Graph` menu options (in the
left menu under the subheading 'Repository') to see how the changes
you pulled have been integrated into your own repo.
 
You can also pull your changes into other clones of your labs repo (such as on your
home computer) using the process described above.

Once you have completed this task, close the associated issue (#10) with a
suitable comment.

You can **repeat the above exercise for the homework and assignment repos**.  The
steps are the same, but you need to change the repo name (in the obvious way)
in steps 1, 3, and 5 (using `comp1110-homework` and `comp1110-ass1` respectively, instead
of `comp1110-labs`).

**NOTE**: It is crucial that you regularly upstream pull all of the
homework, labs and assignment repos. We will try to alert you any time
we make changes to these repos, but it would be frustrating to work
according to tests or specifications which have changed! A good rule
of thumb would be to quickly upstream pull each time you start working
on one of these repos. 

## Imperative Coding Tasks

The following programming tasks exercise simple *imperative* programming,
demonstrating **sequence**, **selection**, and **repetition**.  We will start
*object-oriented* programming in the next lab.



1. **Countries**
    
    **A. Create a new class**
    
    Inside the package `comp1110.lab2` make a new class `Countries`. Add a main method to this class (Remember: use `psvm` as the shortcut to create the main method). 
    
    **B. Create an array**
    
    Inside your main method create an array of `String`s that has the names of the following
    countries: Germany, Argentina, Netherlands, Brazil.
   
    **C. Select elements of the sequence**

    Print out the elements of the array on separate lines (you do not need to use a loop for this,
    just manually choose the elements by their index).
	
	
    **D. Test your program**
    
    Test your program using the `L2 Countries` test. 
   
   
    If it fails any tests you'll have to debug your code. The first
    thing to try is reading through the tests and analysing the
    response from the test e.g. 'Did not print Germany'. If you get
    stuck, have a look at the [debugging](#debugging) exercise coming up.
   
   
    If you are stuck, ask the student next to you! If all else fails, ask your tutor!
    


	**Discuss with someone else** If you were doing the same thing
    using a loop, how would you do this? You don't need to discuss the
    code exactly, but identify the **sequence**, **selection** and
    **iteration** steps.

2. **Reverse**

    **A. Create a new class**
    
    Make a new class `Reverse` within the `comp1110.lab2` package. Write your code within the main method of the class.
   
    **B. Iterate over sequence**

    Using a `while` loop, write a program that prints (on separate lines) the numbers
    between and including 10 and 30 in reverse order. i.e. the program should
    print on separate lines: 30 29 28 ... 10.
    
    **C. Test & debug your program**
    
    Test your program using the `L2 Reverse` test.

	**Discuss with someone in lab** If you changed the `while` to a
	`do while` (Just added the word 'do' to your code), how would the
	output change? How many numbers would you expect to be printed?)  Is
	this the same for both your code and theirs? Have you solved the
	problem the same way?

3. **Triangle**
    
    **A. Create a class**

    Create a class `Triangle` within the `comp1110.lab2` package that draws
    simple triangles using ASCII characters and prints to standard output. 
    Write your code within the main method of the class.
    
    **B. Read integer from console**
    
    The program should read in from the console an integer which
    represents the height (in characters) of the triangle.  You may
    want to remind yourself of how to read input from the console.
    This was covered in lecture unit
    [J01](https://cs.anu.edu.au/courses/comp1110/lectures/java/#J1),
    in the example IOTest.java.
    
    **C. Draw the triangle**
    
    Use the `*` character to draw the resulting triangle. 
    The first line should have one`*`, the second will have
    a `*` followed by one space, followed by a `*`, the third will have three
    spaces, the fourth will have five, etc. The last line will have (height x 2) - 1
    `*`'s. For example, for an input of 5, the output might look like
    the illustration at the bottom of this section (here a '\_' is drawn to represent a space character).

    **D. Test & debug your program**
	
    Test your program using the `L2 TriangleTest` test.
    
	**Discuss with someone in your lab:** Have a look at your
    partner's code-without testing it first, discuss what you think
    will happen if you run the code with `-1` as the input?
    
```
____*
___*_*
__*___*
_*_____*
*********
```

4. **Commit and push your work**

    Commit your changes locally (navigate through `VCS` and select
    `Commit changes...` (*or* press `Ctrl + K`). Write a commit
    message that says: `Done with Lab 2!`. Leave everything else to
    its defaults.
	

    Push your changes, which will allow your tutor to see them (`VCS` -> `Git` -> `Push` (*or* `Crl + Shift + K`).

    Close the associated issue (#11) with a suitable comment.
    
    Get your tutor to mark off your work.


## Debugging

Removing
[bugs](https://blog.patracompany.com/the-history-of-the-computer-bug)
(debugging) is a very important process in software development. While
we can take active measures to reduce the number of errors introduced
into code, no developer is perfect and the art of quickly identifying
and fixing bugs is worth perfecting. In this exercise, some simple
code samples are provided which have bugs in them. In each sample a
different debugging technique will be demonstrated. In Lab 3, it will
be your job to debug a more substantial piece of code, making use of
the tools we describe below. Each of the examples can be followed
through by making a new class and making the changes and actions we
describe in the procedures (you may need to make a main method using
`psvm` and print the outputs of the functions with the described
inputs). The large code sample in the [Code Reduction](#codereduction)
section is provided as a class called `RunLengthDecoder`. 

### Print Statements
The most intuitive and sometimes most flexible way of debugging is
through the strategic placement of informative print statements. Have
a quick read of the code segment below: 

```
public static int countEvens(int[] nums) {
  int count = 0;
  for (int i : nums){
    count += (i % 2 == 0 ? 0 : 1);
  }
  return count;
}
```

The countEvens function is given an array of `int`'s and is expected
to return an integer representing how many of the given values are
even. This function uses two important concepts, the modulus operator
(`%`) and the ternary operator. The modulus operator is of the form `a
% b` and returns the remainder result of the integer division
`a/b`. For example, `4 % 2 = 0` and `4 % 3 = 1`. The ternary operator
is a useful way of assigning the result of a boolean operator to a
variable. The ternary operator has the syntax 
`<boolean statement> ? <true output> : <false output> `. 
For example, the value of the variable `a` in the statement
`a = (0 == 1) ? 0 : 1` will be `1`. We note that in all cases, the
ternary operator is a shortening of the statement:
```
if (<boolean condition>) then {
	result = <true output>;
}
else{
	result = <false output>;
}
```
At first glance, the code appears reasonable (suspend your disbelief
if the error appears obvious), so we give it some sample inputs. 
The input `[0,1, ..., 9]` returns `5` which is the correct
output. However the input `[0,1, ..., 10]` returns `5` which seems
not quite right (we would expect `6`). Let's use print statement debugging. We could add the
following to our code:

```
public static int countEvens(int[] nums) {
  int count = 0;
  for (int i : nums){
	boolean result = i % 2 == 0;
	System.out.println("Our program thinks that the number " + i + " is " + (result ? "Even" : "Odd"));
    count += result ? 0 : 1;
  }
  return count;
}
```
With the input `[0,1,...,10]` we get the output:
```
Our program thinks that the number 0 is Even
Our program thinks that the number 1 is Odd
Our program thinks that the number 2 is Even
Our program thinks that the number 3 is Odd
...
```
And the program output is still incorrect (`5`). Our program seems to
know if the numbers are odd or even, but doesn't count them
correctly. Let's find out which numbers result in an increase in our
count. We can modify the code to create:

```
public static int countEvens(int[] nums) {
    int count = 0;
    for (int i : nums){
        boolean result = i % 2 == 0;
        System.out.println("Our program thinks that the number " + i + " is " + (result ? "Even" : "Odd"));
        System.out.println("Our program is adding " + (result ? 0 : 1) + " to the count as a result.");
        count += result ? 0 : 1;
    }
    return count;
}
```
Which for the same input produces the output:
```
Our program thinks that the number 0 is Even
Our program is adding 0 to the count as a result.
Our program thinks that the number 1 is Odd
Our program is adding 1 to the count as a result.
Our program thinks that the number 2 is Even
Our program is adding 0 to the count as a result.
Our program thinks that the number 3 is Odd
Our program is adding 1 to the count as a result.
...
```
Aha! The program is adding the wrong number to the count. We have
narrowed the issue to the value of the ternary operator `result ? 0
: 1`. Can you see it now? According to our previous definition of the
ternary operator, we have the `0` and `1` swapped! Indeed, if we
change our original program to reflect this:

```
static public int countEvens(int[] nums) {
  int count = 0;
  for (int i : nums){
    count += (i % 2 == 0 ? 1 : 0);
  }
  return count;
}
```
it works as expected. While this example is simple, it proves that we
can reduce the bounds of an error by giving extra feedback to the user
about how each component is working. 

### Code Reduction
This debugging strategy is more subtle and is generally more useful in
larger programs. If we have a bug that cannot be isolated to a
particular area, particularly bugs which cause crashes, we have two
options to proceed. We could eliminate all but a solid, known to be
working section of code, and gradually re-introduce code sections
until the program/error re-occurs, or we can start from the full
program and gradually eliminate layers until the error
disappears. This is particularly useful for more hard to trace errors
such as those occurring remotely or in environments where error
feedback is poor (for example, in GUIs). 

Let's look at a larger program which decodes the result of Run Length
Encoding (RLE) on a binary sequence. RLE exploits the fact that in
binary sequences, there are often repeating sequences. If a binary
digit occurs once, it does not change, if it occurs more than once,
the number of repetitions is the next number. Some examples are
provided below:


|     Input    |   Output   |
|:------------:|:----------:|
| 010101       | 010101     |
| 000110100111 | 0312010213 |
| 00000001     | 071        |

A class is provided in `src/lab2/RunLengthDecoder` which attempts to expand this encoding.
As you can see, this program is non trivial in complexity and combines
multiple functions, repetition and selection to achieve a task of some
difficulty. Currently, the output when ran for the sample input 
`0312010213` is `100000000000`! How can we
go about debugging this? Lets use code reduction. In the `decode`
function we notice this functional composition:
`return
intToString(concatenate(groupedIntegers(stringToInteger(sequence))));`.
This is the perfect basis for reduction. We begin by viewing the
output of `return stringToInteger("0312010213");` which is as we
expect; `0312010213`. We now add in `groupedIntegers` to our
composition (`groupedIntegers(stringToInteger("0312010213"))`)
and look at the output (noting that some playing
with formatting is required):
```
000
11
0
1
00
111
```
Interesting. This seems fine so far. Continuing on we try the
concatenate function as well, the output of the composition is
`100000000000`. Aha! This is where the bug lies. Let's dig into the
concatenate function:
```
private static int[] concatenate(int[][] grouped_sequence){
        int total_length = 0;

        // Calculate the total length
        for (int outer_index = 0; outer_index < grouped_sequence.length; outer_index ++){
            total_length += grouped_sequence[outer_index].length;
        }

        // Proceed through the arrays depth first and place into output
        int[] output = new int[total_length];
        int output_index = 0;
        for (int outer_index = 0; outer_index < grouped_sequence.length; outer_index ++){
            for (int inner_index = 0; inner_index < grouped_sequence[outer_index].length; inner_index ++){
                output[output_index] = grouped_sequence[outer_index][inner_index];
            }
        }
        return output;
    }
```
We have narrowed down where the bug lies, now it's up to you! If you
can spot the bug just by reading the code, great, otherwise, make use of
print debugging or the debugger strategy below to debug this
function. Once you have debugged this function, write some sample
input and output values and make sure the code works as you expect. 


### The _Debugger_ (Breakpoints and Step Through Debugging) 

IntelliJ has an incredibly powerful Java debugger built right in. It
is designed to be easy to use and intuitive, but it is a powerful tool
and it has many advanced features. To get started, have a look at this
[tutorial](https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html).
You may find that the debugger is useful in completing the above
activity.
	
## Prepare for the lab test

If you finish early, use any spare time you have to do further preparation
for the [lab test](https://cs.anu.edu.au/courses/comp1110/assessments/labtest/). You are encouraged to ask your tutor
for help in understanding how to complete any of those questions.

## Extension

Note: Extension exercises are **not** assessable- if you need to prepare for a lab exam or work on a group assignment, do that first.
Extension exercises are just here to give you some extra problems to extend the lab work.


**Use the `break` keyword**

Create an array that contains {11,22,33,44,5,66,77,88,99,100} 

Using a loop containing the `break` keyword, write a program that will:

* print 5 and nothing else if the array contains the number 5.

* print the sum of the elements in the array and nothing else if the array doesn't contain the number 5.

When you run the code it should print `5`. Remove the 5 from the array-your program should now print `540`.

**Use the `continue` keyword**


Using the `continue` keyword, write a program to add all the numbers between 1 and 100 (inclusive) but skip multiples of 3 (3,6,9,12...)
So your code should calculate 1+2+4+5+7+8+10+11...+98+100.

Hint: If your code is working correctly, the sum should be `3367`.



