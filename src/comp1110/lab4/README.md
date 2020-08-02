# COMP1110 Lab 4

### Before the Lab

* Complete your personal journal for week 5, commit and push at least 5 minutes before your lab.

* Make sure you've covered the modules [**S2**](https://cs.anu.edu.au/courses/comp1110/lectures/se/#S2) (Branches and Merging) and [**J4**](https://cs.anu.edu.au/courses/comp1110/lectures/java/#J4) (Random).

### Purpose

In this lab you will complete a git exercise in which you will practice using git in a group setting, and you will develop a more complex Java program.

**It is essential that you complete this lab and have a tutor mark it off during the lab**.

## Part I: 30-Minute Check-In

As usual, you will do _two_ things during the 30-minute check-in:

1.  Check in with **your tutor**.  This week, and for the remainder of the semster, you will do your check-in with the other members of your group.   You should briefly outline any issues you're having (as individuals or as a group), that you'd particularly like help with during the lab.  You should refer to your journal as you do this.  This helps your tutor prioritize time during the lab and 
2.  When you're not doing your check-in with your tutor, you should be listening to the **lab leader** as they give an overview of what you'll be going through in this week's lab.

## Part II:  Your Lab Tasks

### GitLab Upstream Pulls for Assignment

**One** group member should do the following.   Once complete, each of the
other group members can pull the changes.

0. Quit IntelliJ if you have it open.
1. Start a terminal (use the menu at top left)
2. Change directory (`cd`) into the folder that contains your intelliJ
projects (`cd IdeaProjects`)
3. Change directory (`cd`) into your assignment repo (`cd comp1110-ass2-<yourgroup>`
or `cd comp1140-ass2-<yourgroup>`).
4. Display the currently known remote repos for the project (`git remote -v`).
5. Add the comp1110 assignment2 repo as a remote upstream repo (`git remote
add upstream https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2.git` or
`git remote add upstream https://gitlab.cecs.anu.edu.au/comp1110/comp1140-ass2.git`).
6. Now open your comp1110-ass2 (or comp1140-ass2) repo in IntelliJ
7. Prepare to pull changes (VCS -> Git -> Pull...)
8. Use the drop-down menu to change the 'Remote' to be
`upstream(https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2.git)'
or 'upstream(https://gitlab.cecs.anu.edu.au/comp1110/comp1140-ass2.git)`.
9. Refresh the list of branches by clicking the refresh button to the right
of the dropdown.
10. Select the `upstream/master` branch.
11. Click `Pull`.  This should behave just like a merge from your last lab
exercise, and work without further interaction.   If not, you may need to
merge, in which case you should consult your tutor if you're unsure what to
do.
12. Bring up the `Version Control` panel at the bottom of your IntelliJ
window, and select `Log`, and notice that you now have some new changes in
your history.
13. Commit and push your change.
14. Your group members can now pull your change to their clones of the group
repo.

You can repeat these steps to pull further changes into your forks of class
repos.   You only need to perform the steps on one of your clones and then
the changes will be visible (after pulling) at each clone of your repo.
You can do this on the lab computers (as in this exercise) or on your home
computer.   If you have Linux or MacOS on your computer, the process is
as described above.   If you have Windows on your computer, you will
need to use [git bash](https://git-for-windows.github.io) rather than a
terminal to set your upstream remote (steps 2-6).  Once done, close the issue (#14).

### Git groupwork

This is a simple exercise that explores most of the git skills that you are
expected to use in COMP1110. This exercise was demonstrated in a [how-to video](https://cs.anu.edu.au/courses/comp1110/help/mp4/gitexercise.mp4).
If you have not seen the video, I strongly recommend you watch it. If you get
yourself into trouble doing this exercise, you may find it helpful to look at
the video again. In the [video](https://cs.anu.edu.au/courses/comp1110/help/mp4/gitexercise.mp4) I performed the role of all three characters
(Alice, Bob and Cindy). You should do this exercise in the lab with your group
members. If there are only two people in the group, you should be able to adapt
the exercise by delegating Cindy's activities to Alice (so you just have Alice
and Bob).

1. Before you start, **everyone** in the group must have a clone of your group
repo and an associated project in IntelliJ.  This will work best if you're
sitting nearby to each other.
	 
2.  **Alice** does the following (with the others watching...):
    
    **Create a new package and 2 new classes**
    * Create a new package, `gittest`.
	* Create two new Java classes, `Main` (which has an empty `main()` method), and `A`, which just has a `toString()`.  When IntelliJ prompts you to add the new classes to git, say yes.
    * If you neglected to add the new files when they were created, add them now.
      You will notice that if a file has not been added to version control, IntelliJ shows the name of the file in red.
      You can add a file using `VCS` -> `Git` -> `Add`, or via the keyboard shortcut `Ctrl+Alt+A`.
      The file name will appear green once added.
    
    **Commit and push new files classes to group repo**
    * Commit (`VCS` -> `Commit Changes...` or `Ctrl+K`), being sure to set the author's name to `Alice <u1234567@anu.edu.au>` (option at top right, replacing u1234567 with your UID).
    * Click `Commit`, choosing to `Commit and Push`.
	* You should see a little green notification dialogue at the bottom of the screen confirming that the push was successful.
		
3. **Bob** does the following (*without co-ordinating with Cindy*):
    
    **Pull changes from group repo**
    * Pull Alice's changes `VCS` -> `Git` -> `Pull...`, leave the defaults and click `Pull`.
	* In the `Version Control` tool window (activate by clicking the little icon at the very bottom left of the IntelliJ window, and select `Version Control`), you should see Alice's changes.
    
    **Add a new class to group project**
    * Create a new Java class in the `gittest` package, `B` which just has a `toString()` method.  When prompted to add the new class to git, choose `Yes`.
	
    **Commit changes but do not push to group repo**
    * Commit (`Ctrl+K`), set the author to `Bob <u1234567@anu.edu.au>`, but when you click `Commit`, just choose commit, **do not** choose `Commit and Push...`
	* Do **not** push the change yet (we want to imagine Bob gets interrupted before pushing).
	
4. **Cindy** does the following (*without co-ordinating with Bob*):
    
    **Pull changes from group repo**
    * Pull Alice's changes `VCS` -> `Git` -> `Pull...`, leave the defaults and click `Pull`.
	* In the `Version Control` tool window (activate by clicking the little icon at the very bottom left of the IntelliJ window, and select `Version Control`), you should see Alice's changes.
	
    **Add a new class to group project**
    * Create a new Java class in the `gittest` package, `C` which just has a `toString()` method.  When prompted to add the new class to git, choose `Yes`.
	
    **Commit changes and push to group repo**
    * Commit (`Ctrl+K`), set the author to `Cindy <u1234567@anu.edu.au>`, and when you click `Commit`, choose `Commit and Push...`
	* You should see a little green notification dialogue at the bottome of the screen confirming that the push was successful.
	
5. **Bob** now does the following:
    
    **Try to push your commit to group repo**
    * Try to push `Ctrl+Shift+K`, then click `Push`, and see an error message giving you the option to either intentionally push a new head, or merge. We will merge in the following steps.
	
    **Merge your changes with group repo**
    * Click `Merge`.
	* You should see a green notification saying that the Push was successful and that two commits were pushed.  The first of the two commits is the one that Bob did in step 3.   The second is an automatically generated one that captures the merge of Cindy and Bob's work.
    * View the log by clicking on the `Log` tab of the Version Control tool window.  You can see a graph showing the merge of Cindy's work with Bob's.

6. **Alice** and **Cindy** update (`Ctrl+T`, select `Merge` as the update type).  Now everyone should be in the same state. View history to ensure that this is so (`Team...`, `Show History`).

7. **Bob** now conducts an experiment, but doesn't want to mess things up for Alice and Cindy (because his idea may not necessarily work out), so he uses a *branch*:
	
    **Create a new branch of your group repo**
    * Add a new branch named `BobsExperiment` (`VCS`, `Git`, `Branches...`, `New Branch...`).   Rules for branch names can be found [here](https://www.kernel.org/pub/software/scm/git/docs/git-check-ref-format.html).
	
    **Make changes to the group project, commit and push to your branch of group repo**
    * Make a simple change to class `B`, commit that change (`Ctrl+K`), being sure to set the author to Bob.
    * Make another simple change to class `B`, commit that change.
    * Push your changes.

8. **Everyone** does the following (*at the same time*):
    * Update project (`Ctrl+T`).
    * Look at the `Log` tab of the Version Control tool window.
    * Ensure that you are on the head of the `master` branch (i.e. not on Bob's experimental branch). 
      The changeset you are on will be marked with a yellow tag; if you hover the mouse over the tag it should show the word 'HEAD'. 
      If you followed all of the steps, Alice and Cindy should have the changeset where Bob did a merge (right before he made the branch). 
      Bob will be on the wrong changeset, so he should switch to the `master` branch: `VCS`, `Git`, `Branches`, `Local Branches`, select `origin/master`, and `Checkout`.
	* Now (ignoring Bob's experiment), everyone should edit the main method of `Main` and add a line such as `A a = new A();`, changed suitably to reflect the author (eg `B` for Bob and `C` for Cindy).
	* Each person should now save their change and commit (**but don't yet push**) your change.  Remember to set your author name and a commit message.

9. **Alice** pushes her changes. There should be no error. 
	
10. **Bob** now tries to push his change, but will find a problem that he must now resolve. [Why can't you push? What's causing the problem?]
    * Try to push (`Ctrl+Shift+K`).
	
    **Manually merge changes with group repo**
    * You should get an error message, which you should read (you will resolve the problem by merging, so click `Merge`).
	* You will see a dialogue which presents you with three choices (`Accept Yours`, which would throw away Alice's work, `Accept Theirs`, which would throw away your work, or `Merge`, which we will do).  Click `Merge`.
	* You will see a window with three panes, the center shows the result, the left shows yours (Bob's), and the right shows theirs (Alice's).
	* Click the little `<<` icon next to Alice's change to bring it into the merged result.
	* Click the little `>>` icon next to your (Bob's) change to bring it into the merged result.
	* You will be asked whether you want to finish.  Click `Save and Finish`.
	* Push your result (`Ctrl+Shift+K`).  
	
11. **Cindy** now tries to push her change, but will run into the same problem as Bob.
    * Try to push (`Ctrl+Shift+K`).
	
    **Manually merge changes with group repo**
    * You should get the same error message as Bob, which you should read (you will resolve the problem by merging, so click `Merge`).
	* You will see a dialogue which presents you with three choices (`Accept Yours`, which would throw away Alice and Bob's work, `Accept Theirs`, which would throw away your work, or `Merge`, which we will do).  Click `Merge`.
	* You will see a window with three panes, the center shows the result, the left shows yours (Cindy's), and the right shows theirs (Alice and Bob's).
	* Click the little `<<` icon next to Alice and Bob's change to bring it into the merged result.
	* Click the little `>>` icon next to your (Cindy's) change to bring it into the merged result.
	* You will be asked whether you want to finish.  Click `Save and Finish`.
	* Push your result (`Ctrl+Shift+K`).

12. **Everyone** pulls and updates and should see the `Main` file with all three contributions.

That completes the group exercise.  Close the associated issue (#15).  The next exercise is an individual exercise.


### The Stack Trace and a Debugging Exercise
Think back to lab 2. We discussed some common and very useful
debugging strategies which will have you, with practise, easily
finding and fixing bugs with minimal fuss. Now you will put those
skills into practise. But one thing first - sometimes `IntelliJ` does
most of the work for you! Consider two common cases:

**Unexpected output with no exception**: You have written a program
which compiles and runs without any exceptions (i.e. the program does
not _crash_ or display errors in the standard output), however, the
program does not work as expected. Maybe it never responds to input or
maybe the value it prints is not what you expect. This is the
situation we experienced in lab 2, and this situation can be difficult
to debug. This is why, in many cases, it is **useful** for your
program to crash when it is receiving values that seem incorrect or
for which the results will be meaningless. For example, if you have a
function that expects only positive numbers, you would expect the
program to gracefully crash at this point (or possibly just abort the
processing and display an error). You now have limited the number of
functions in which the error could have been occurring! While it may
seem like a good idea to avoid throwing errors at all costs, errors
are useful tools which allow you to catch bugs when and where they
occur (which brings us to the next point). However, if all else fails,
you can always use the techniques discussed last week (among
[others](https://spin.atomicobject.com/2018/08/01/debugging-strategies-tips/)).

**No output due to unexpected input/error**: You have written a
program which you expect to compile and produce an output, instead an
error occurs at some point which stops the program from
finishing. Don't panic! As we addressed above, this, in some cases, is
a _good_ thing since we wouldn't want our program carrying on with
unreliable and unpredictable behaviour. Generally, when an error
occurs, whether the error is handled by the program or causes a crash,
it is associated with a **stack trace** which is an extremely powerful
record of when and where the error occurred in your program. Learning
how to read a stack trace is a crucial skill in efficiently debugging
your program. Here is an example of a simple stack trace (taken from
an introduced error in the sample code `RunLengthDecoder` from lab 2);
```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
	at comp1110.lab2.RunLengthDecoder.groupedIntegers(RunLengthDecoder.java:55)
	at comp1110.lab2.RunLengthDecoder.decode(RunLengthDecoder.java:19)
	at comp1110.lab2.RunLengthDecoder.main(RunLengthDecoder.java:12)
```
Okay, so this looks intimidating but it is really quite simple. When
an error occurs, the location is recorded as a nesting of method
calls at particular line numbers. The term 'stack trace' comes from
the concept of a stack which is a memory allocation in your device
which grows as each method call is executed, by 'stacking'
information. In this case, we are being told that an exception has
occurred within the main thread of the program. The exception is of
the type `java.lang.ArrayIndexOutOfBoundsException`. Usually the last
part is the important one; `ArrayIndexOutOfBoundsException`. So we are
trying to get an element of an array, where the index we provide is
outside of the bounds of the array. But we have even more
information - we are told that the index we tried to get is `6` and
that the length of the array is `6` (why is this a
problem?). Furthermore, we are told at which line the error
occurs. Generally, the most _shallow_ element of the stack trace is
the most relevant, in this case;

`at
comp1110.lab2.RunLengthDecoder.groupedIntegers(RunLengthDecoder.java:55)`


tells us that the index out of bounds error occurred at line `55` of
the class `RunLengthDecoder`. Looking at this line, this is indeed
where I introduced an error;
`output[inner_index] = repeatInt(current, sequence[outer_index + 1]);`
in this case I had the inner and outer indexes in the incorrect
order. The _next_ line of a stack trace tells you where the
_current_ line of a stack trace was called from; in this case the error
occurred from the main method calling decode at line `12` which calls
the `groupedIntegers` method at line `19`. See, stack traces are
simple! Don't be afraid to dig into them and use them to quickly pin
point errors. Some other common stack trace errors
([exceptions](https://www.baeldung.com/java-common-exceptions))
are:

* **[NullPointerException](https://stackoverflow.com/questions/218384/what-is-a-nullpointerexception-and-how-do-i-fix-it)**:
  Your program is usually trying to access some property or method of an
  object which is actually a null reference. For example, you may
  assign the output of a function to a variable, but the function
  provides a null value due to an error. If you then tried to get,
  say, the `length` of the object, this error would occur.

*  **[StringIndexOutOfBoundsException](https://examples.javacodegeeks.com/java-basics/exceptions/java-lang-stringindexoutofboundsexception-how-to-solve-stringindexoutofboundsexception/)**:
  This is another example of an 'index out of bounds' exception. In
  this case, you are trying to address a character of a string at a
  position which does not exist.

* **[NumberFormatException](https://www.baeldung.com/java-number-format-exception)**:
  Sometimes when you try to convert a string to an integer (or another
  number, known as _parsing_), the _parser_ doesn't know what number
  to give you, so throws this error. For example, you might try to
  parse the string "13 - 15" as an `Integer` - this will throw an
  error.

* **[IllegalArgumentException](https://stackoverflow.com/questions/15208544/when-should-an-illegalargumentexception-be-thrown)**:
  Well written functions, often those found in standard Java
  libraries, will very carefully check the input provided to them to
  ensure that the input is reasonable. For example, the argument of a
  function which requires a number of milliseconds to sleep should not
  be negative.

There are many more exceptions and techniques to analyse stack traces,
but these should be enough to get you started in understanding how to
use them to quickly find errors in your code.

### Your turn: Debugging
Now, equipped with some common strategies (like print statements, code
reduction and using the built in `IntelliJ` debugger) as well as a
good understanding of the stack trace, see if you can find all the
bugs in the code provided in the class `Dice`. Make sure that the
output of the program matches the specifications included in the
comments of the class. Feel free to add any code you feel is neccesary
to properly test the functionality of the program.

### Extension - Heads or Tails
This exercise requires using object oriented design and imperative
design. 

* Hopefully, having completed the debugging exercise, you will have a working
`Dice` class which can, given a lower and upper bound, produce random
values in this range (inclusive). 

* If you haven't got this class working yet, please take this time now
to complete the debugging exercise.

* Please take some time to revise how `Random` is used to generate
  random numbers between two values. If you are having trouble
  understanding how `Random` works or are stuck on the debugging task,
  now is a good time to ask a peer or your tutor for help.


* Copy the working Dice class to your lab 4 package, and create a new
class, `HeadsOrTails`. 

* The class `HeadsOrTails` should enable the user to play many games
of heads or tails by accepting the 'prediction' from the terminal. 
* The user should input `h` for heads and `t` for tails. Any other
inputs should result in `Unexpected input` being printed to the
terminal. 

* When a heads or tails guess is received from the user, the program
should use the `Dice` class to create a `coin` which should then be
flipped.  If the user's prediction is correct, print `Good guess!` to
the terminal, otherwise print `Bad luck!`.

* The program should accept guesses and give answers
repeatedly until the user exits with `Ctrl+d`. Please don't print any
extra content to the terminal besides that precisely described above -
this will impact testing.

* **Consider**: how many `coin`'s do we need? Does `coin` have to be a
  local variable or can we declare it once? Can `coin` be an
  instance variable? Can `coin` be a class variable
  (i.e. static)? Can `coin` be a final variable? If `coin` is
  final, will calling `rollDice()` on `coin` still be random? 

Once you have completed the `HeadsOrTails` class, test your code using
the provided test class `L4 HeadsOrTailsTest`. Commit, push to git,
close the issue (#16) and show your tutor. 

**Background**

Professor [Richard P. Brent](https://researchers.anu.edu.au/researchers/brent-rp) (Emeritus professor at ANU!) made significant contributions to the field of random number generators, and created some algorithms to produce pseudo-random numbers.
[Further reading for those interested.](https://arxiv.org/abs/1004.3115)

**Write your own 'random' code**

As discussed in lectures, java.util.random gives you *pseudo-random* numbers- it looks random, but is created using a formula.

Without using java.util.random, write a code that will 'randomly' return an int in [1,2,3] every time you run it.

**Test your own 'random' code using collections**

Write some code to run your program 150 times, and collect the results. Read through the next steps and work out which collection type will be most useful here. (Array,list,set,map?)

To be *pseudo-random*, your code should:

- Print each number roughly the same amount of times. Using your collection, print how often each number came up-the closer to (50,50,50) the better!

- It should look random- if your code runs 1,2,3,1,2,3,1,2,3... that won't look random. Seperate the results into the first 50 (1-50), second 50 (51-100) and third 50 results (101-150).
How often is the same result in the same place- (e.g. Does the 1st result = 51st result = 101st result? How often does this happen?)

- Should contain all small sequences of numbers. Check that your results contain the following sets: (1,1,1), (1,2,3),(2,3,2),(3,2,1),(3,1,2).



How many different ways can you think of to create a 'random' number generator? You don't have to program more than one, but if you do try testing them against each other.
