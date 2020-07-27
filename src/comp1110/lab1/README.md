# COMP1110 Lab 1

* The first lab contains material from modules [**I1**](https://cs.anu.edu.au/courses/comp1110/lectures/intro/#I1) (Academic Honesty),
[**J1**](https://cs.anu.edu.au/courses/comp1110/lectures/java/#J1)(Basic I/O) and [**S1**](https://cs.anu.edu.au/courses/comp1110/lectures/se/#S1)(Gitlab)

## Purpose

The first lab is intended to ensure that you have become familiar with the basic tools we will be using throughout the semester in the labs at ANU and on your own computer (if you plan to use one).

**It is essential that you complete this lab and have a tutor mark each of the
 deliverables off during the lab:**
1. Your pledge of academic integrity.
2. Week 1 of your personal journal
3. Completion of the HelloWorld example in the ANU linux VDI.
4. Completion of the HelloWorld example on your computer.
5. Completion of the HelloTutor JavaFX test in the ANU linux VDI.
6. Completion of the HelloTutor JavaFX test on your laptop. 

We want you to do this **now**, in week one, so that you can focus on course content from the first day of week two rather than be distracted by concerns over how the tools work.   This is your chance to get yourself established and familiar with the tools with the assistance of the course tutors.  Please make the most of the opportunity.

We have created a step-by-step [video](https://cs.anu.edu.au/courses/comp1110/help/mp4/lab1.mp4) showing you how to complete this lab in the lab environment.

## Tasks


### **Set up GitLab**
0. **Install and launch the ANU Linux VDI**
    
    Follow the instructions on the course web page for [installing the RSCS VDI](https://cs.anu.edu.au/courses/comp1110/help/05-working-remotely/#rscs-vdi).   You need to have it working and be successfully logged on to complete the lab.

1. **Set up your GitLab account.**

    You will use GitLab throughout the semester to manage all of your coursework.

    First you need to set up your GitLab account. Open a browser (you can do this either on your computer or within the VDI---it may be easier to do it in your own computer), and go to GitLab http://gitlab.cecs.anu.edu.au (ensure that
    you remember the .cecs. in the URL).   Log in to GitLab using the LDAP tab
    of the Sign in section of the front page.   You should type your student
    ID and your normal password.

    Go to Profile Settings, which is accessible via a gear icon at top right.
    Feel free to update your GitLab personal profile if you wish.

    This completes your GitLab setup.
2.  **Fork the comp1110 labs repository.**

    In GitLab jargon, to [fork](http://docs.gitlab.com/ee/gitlab-basics/fork-project.html)
    a repository means to create a fresh copy of the repo where the copy will be owned
    by you.   The class has its own labs repo which serves as a template for
    yours.   You and every other student will fork the class labs repo to create
    your own.  You  can't commit changes to the class repo (only the lecturer
    can do that), but you can commit changes to your own forked repo.

    To fork the repo, go to the GitLab page for the labs [https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs).
    Notice that when you go to that page, the name of the repo at upper left is
    `comp1110 / comp1110-labs`.  This tells you that the owner of this repo is 
    `comp1110` (before the `/`), and that among their repos this one is called
    `comp1110-labs` (after the `/`).

    Now click  `Fork`  (upper centre-right).   You may have to select which GitLab
    account to use; select your account.
    
    You now have your own copy ('clone') of the
    labs repo.  Notice that the name at top left will have changed to reflect
    that you own this new repo.   It should now say something like
    `Your Name/comp1110-labs`.  Text below will remind you of where this new 
    repo came from (*"Forked from comp1110-labs"*).
    You will use this clone of the class repo to complete the remainder of your labs (not just this
    week).   Unlike the class repo, this one is yours; you can make changes to
    it.    So far, however, your repo exists only on GitLab (i.e. *in 'the
    cloud'*).

    Soon you will be making a working copy (clone) that you can edit on the lab
    computer.   Later you can do the same on your own computer.   *Although you
    might have multiple clones of your repo on different devices, the*
    **definitive** *version always resides on GitLab, in the cloud.*

    At the end of this lab, you can repeat this process for the [homework](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-homework)
and [assignment 1](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass1) repos.

3.  **Find this document within your labs repo.**

    At this point in the lab you should see `Your Name/comp1110-labs` at top
    left of your GitLab page in your browser. 
    If not, you can navigate there via the navigation menu at the top left
    (three dark grey horizontal lines).
    To find your project, *either* use the navigation menu and click on 
    `Projects`, which will bring up a projects page, or else click on your
    avatar at the top right of the page, select `Profile`, and then select the
    `Personal projects` tab.
    
    Once you can see `Your Name/comp1110-labs` at the top center-left,
    you can scroll down below the brown horizontal line and you'll see
    the contents of `comp1110-labs` repository.  Then you can navigate
    to your own version of *this* document within GitLab.  Navigate
    through `src/comp1110`, and then to `lab1`.  The files inside
    `lab1` should be shown at the top, followed by your own copy of
    this document.  If you're in any doubt about whose version of the
    document you're looking at, check the text at top center-left and
    you should see your name followed by a '>' and then comp1110-labs.
    You can also check the URL in the navigation bar of your browser
    and it should be something like:
    `https://gitlab.cecs.anu.edu.au/u1234567/comp1110-labs/tree/master/src/comp1110/lab1`.
	
4. **Find Open Issues**

	One of the items in the top control panel (alongside `GitLab`,
    `Projects`, `Groups` etc) is **Issues** (found to the right of the
    search bar). Clicking on this item will reveal the issues
    dashboard which allows you to view open and closed issues
    separately, as well as all together. Currently, you will likely
    see a '0' next to **Open**. After exploring this dashboard, return
    to your fork of the labs project (you should see 'Your
    Name/comp1110-labs' in the URL). In the left side navigation
    panel, you will see an **Issues** tab. Clicking this button will
    reveal a list of issues associated with this project/repo. Right
    down the bottom you will find `Issue #1` which refers to the task
    you are completing now. Issues will be used throughout the
    semester to help assign and track work.

5. **Assign issues to yourself**

    These issues are 'unassigned' (no one is yet responsible for
    them). You now need to assign them all to yourself (these are the
    lab tasks you'll do throughout semester). To do this, click the
    `Edit issues` button in the top right, next to the bright green
    `New issue` button. A new panel will reveal itself on the right
    which provides controls over the status of issues, the assignee as
    well as any milestones, labels and subscriptions associated with
    the issue. In the upper left corner of the list of issues, click
    the check box. This should have the effect of selecting *all* of
    the issues. Now use the pull down menu on the right, `Assignee` to
    assign the issues to yourself, and apply this change by pressing
    the 'Update all' button above the 'Assignee' menu. When dealing
    with 'GitLab', sometimes you will experience delays due to network
    congestion, this may be the case when modifying large numbers of
    issue assignments. Please be patient throughout the semester. You
    should now see this assignment reflected in the number of open
    issues in your issues menu accessed via the top issues button.
    You are welcome (and encouraged) to make use of issues to track
    your own work and milestones, and once you start your group
    project, you may use issues to assign tasks among your team.  You
    can now follow along with this lab exercise either by continuing
    to read on the web page, or by working through the issues (which
    point to the same info).
    
### **Pledge of Academic Integrity.**

Before doing anything more, check again that you are reading this from your
own fork of the labs (you will see `Your Name/comp1110-labs` at top left of
your GitLab page in your browser).   If not, repeat the step above, or ask
for help.
    
Now follow [this link](Integrity.md) to the pledge of academic integrity. You 
will now need to edit the file with your name, University ID, and date.

Click on the `Edit` tab to the top right of the document.  Go to the
bottom of the document and replace `<your name>` with your name (it
needs to match your Gitlab username), `<your uid>` with your UID, and
replace `<today's date>` with today's date in <yyyy-mm-dd> format.
Then scroll to the bottom and type a commit message, such as 'Added my
name', then commit the changes.

You should see a small blue circle at upper right of your gitlab page.
This indicates that your change is being checked.  After a short
while, it should turn into an orange circle with an exclaimation mark.
If you made an error filling out your information, it may turn into a
red cross (indicating an error).  Click on that symbol now and you
should see what gitlab is doing to check your work.  You should see a
'pipeline' with three phases, 'Validate' (which checks your integrity
statement), 'Build' (which compiles your code), and 'Test', which runs
tests against many of the lab exercises (ones you have not yet
started).   You should see a green check mark (tick) next to
'validate' and another green check mark next to (build).   If so, you
can now click on the 'Repository' tab at upper left, to go back to
reading the instructions and browsing the repo.   If not, you should
click on the red cross to discover what the problem was and then go
back to your Integrity statement and fix it.

The fact that you have not completed the 'Test' portions is not a
problem at this stage; you'll do some later in this lab, and others in
the weeks to come.

The checking process you just experienced is called 'Continuous
Integration', and is very widely used in software development to check
that things are done correctly, and that chances to code do not
(re)introduce known bugs.  We will use CI throughout this course, and
you should become familiar with checking whether your work passed CI.
You will be graded on the tests that you pass (for example, in your
assignments).

### **Complete Week 1 of your Personal Journal.**

Check again that you are reading this from your
own fork of the labs (you will see `Your Name/comp1110-labs` at top left of
your GitLab page in your browser).

Follow [this link](journal.md) to your personal journal, and read through the instructions in the file.

From week 2 onwards, you will need to complete, commit, and push your
personal journal at least **5 minutes prior to your lab**. Your tutor
will review your journal.  Your timely completion of the journal is
part of your weekly lab engagement mark.

Your journal should be **thoughtful** and **concise**.

Click on the `Edit` tab to the top right of the document. Scroll down the file to the table.

* In the first column next to week 1, respond to the statement
  "*Overall, I am happy with how this course is going for me*" with a
  number from 1 to 5 (`1` strongly disagree, `2` disagree, `3`
  neutral, `4` agree, `5` strongly agree).

* This week, you can skip the second column, which asks about group
  work.  You will start filling that in from week 4 onwards.

* In the third column, in **just a few words** you should write what
  you've **already done** for the course this week. This could be
  about the homework you have completed/attempted, concepts you have
  studied or practiced, work you have done for assignments.  Be honest
  about the work you have done. The journals are a useful tool for
  **you** to keep track of your progress in this course, be
  self-reflective, and to make sure you are staying on top of the
  material.

* In the fourth column, in **just a few words** write what you **will
  do** for the course in the week to come. This could be reviewing
  material, completing homework exercises, completing a section of an
  assignment.  This could also be 'I will discuss concept x with a
  tutor' or 'I will ask my assignment group for help with completing
  this section'.  Don't forget- there are a lot of people and
  resources if you need help with understanding the course
  material. If you need help, ask!

* In the last column, in **just a few words** write any
    **impediments** you see to you achieving your goals (from the
    previous column). An impediment is an obstacle or issue which is
    stopping you from progressing comfortably through the course. This
    could be having trouble with understanding a particular concept,
    timing issues, or more specific problems that have come up when
    completing homework/assignments ('there is a problem when I try to
    run program A') The more specific you are here, the better. It is
    easier to fix a long list of small problems, than one big problem
    ('it's all too hard!'). 

Be sure to **stick to the table format**, keeping your responses for
each week to a single row (so no line breaks in your responses).  This
will encourage you to **be consise**!

At the bottom of the page, change the commit message to `Completed
journal week 1!` and commit changes.  Check the resulting page for any
formatting errors.  Your tutor will check this at the end of the lab.

---
Let's slow down for a moment. Before we jump into `IntelliJ`
configuration, we should have a basic understanding of what `Git` is
and how we should be aiming to use it. `Git` is a Version Control
System (VCS). This means that it is a software tool used to help
manage different versions of a project which can be distributed across
many locations and people. `Git` is known as a [distributed
VCS](https://en.wikipedia.org/wiki/Distributed_version_control) since
all developers have a complete copy of the project and its history on
their computer.

Although this first lab is designed to simply walk you through the steps without necessarily understanding all of what's happening under the hood.  It touches on some key concepts which will become more and more important in the coming weeks.   We've included at the end of this lab a summary of [Basic Git Concepts](#basic-git-concepts).   We encourage you strongly to take a ready through them.   If you don't understand all of the ideas just yet that's perfectly fine.   They'll gradually become more familiar to you.

Above all, a **fork** is your copy of a **repo** which is a project managed by
git and hosted online (in this case by `GitLab`). A **clone** is your
local (i.e. offline) copy of a repo (of which there can be many,
across many devices and developers). When you make new files in your
clone, you need to **add** these files so that git knows to **track**
them. When you have made some changes, you should **commit** them,
which makes a save point associated with a helpful commit
message. Once you have finished working, or are online again,
**push**ing the changes will upload them to the online version of the
repo. To update your local **clone** of a repo, you should **pull**
from the online version, which applies any new commits to the files of
your **clone**. Thus, it is a good habit to commit, pull and push
regularly, and make use of informative and concise commit messages.

---

### **Set up IntelliJ (lab)**
1.  **Start and Configure IntelliJ**

    You should see a square menu with the letters "IJ" on the toolbar on the left of the VDI desktop window. Use this to start IntelliJ.

    If this is the first time you have started IntelliJ on the lab machines,
    there a few once-only steps occur behind the scenes which may make the
    startup a little slow.

    You should now see a splash screen titled `Welcome to IntelliJ IDEA`.

    In the next step you will use this splash screen to clone your labs repo.
2. **Clone your labs repo.**

    In task #1, you browsed your own repo in your browser, using the GitLab
    web interface.   Now you will make your own local *clone* (copy) of your
    repo, using IntelliJ.   You can have multiple clones/copies (for example, one on
    your ANU account, and one on your laptop), but the definitive version is
    *always* the one in GitLab, so to keep everything synchronized, after editing
    your local version you always need to *push* your changes back to your remote
    repo (which is on GitLab, in 'the cloud') and conversely  you need to pull
    changes from  your remote repo
    (on GitLab), before you start work on a different clone of the
    repo.
	
    
3.  Select `Git` from the drop-down menu `Check out from Version
    Control` on the initial IntelliJ splash screen.  Use your browser
    to navigate to your GitLab project page and find the URL of your
    repo.  When you're on the correct GitLab page, you should have the
    lab repo name at the top left (`Your Name/comp1110-labs`). In the
    top right, there should be a blue 'Clone' button. Pressing this
    will reveal the HTTPS and SSH URLs for your
    repo. [SSH](https://en.wikipedia.org/wiki/Secure_Shell) is a
    cryptographic network protocol which acts as a more customizable
    alternative to HTTPS which will not work out of the box (unlike
    HTTPS). You should choose HTTPS.  YOu should see a URL something like
    `https://gitlab.cecs.anu.edu.au/u1234567/comp1110-labs.git` (you
    can [configure
    IntelliJ](https://www.jetbrains.com/idea/help/using-git-integration.html)
    to use ssh rather than https, but that is optional and outside the
    scope of this lab).  Select that text and copy it into the
    IntelliJ dialogue.  If you can't paste into the VDI you may need to copy the URL by hand.  Click `Test` to verify that you are correctly
    set up. You may need to enter your `GitLab` credentials in the pop
    up menu. If the test fails, carefully check that you've copied the
    URL correctly, and that you've selected `HTTPS` on drop-down tab
    next to the URL on the GitLab page.  You may see a warning message
    in the IntelliJ dialogue that tells you that `The parent path
    /students/u1234567/IdeaProjects must exist.` To fix this, click
    the little ellipsis (...) below the `Test` button.  Press
    `Alt+Insert` to create a new folder in your home directory.  Name
    it `IdeaProjects` and click OK.  The error message should go away
    allowing you to clone the repo.  Press `Clone`.  You will be
    prompted for your username and password and a checkbox will ask if
    you would like the password to be remembered.  IntelliJ will also
    ask whether you wish to [set up a master
    password](https://www.jetbrains.com/idea/help/handling-passwords-for-git-remote-repositories.html#d686468e18637).
    The choice is yours but having IntelliJ remember the password and
    protect it with a master password is convenient and secure.
    
    You will now see a
    `Tip of the Day` from IntelliJ.   You may find it helpful to read these tips
    as you learn more about IntelliJ.
        
    IntelliJ may take a minute or so to initialize.  Check the bottom status
    bar; if it says *"Indexing..."*, you should wait until that is complete before
    proceeding with the rest of the lab.

3. **Complete initial setup of the IntelliJ environment.**

    Due to changes in the packaged libraries in Java 11 and above, the
    graphics libary we use in this course, JavaFX is no longer included
    in the installation of a Java Development Kit (JDK). Thus, there
    are now extra
    [steps](https://cs.anu.edu.au/courses/comp1110/help/05-working-remotely/#javafx)
    involved in setting it up.   You should not have to do this on the VDI image, but you will most likely need to do it when you set up IntelliJ on your own computer.

    1. Select `File -> Settings ...  -> Appearance and Behaviour -> Path
   Variables` (these instructions vary according to which OS you're
   using; see IntelliJ [documentation](https://www.jetbrains.com/help/idea/configuring-project-and-ide-settings.html#access-project-settings) for OS-specific info). 
    2. Press the '+' symbol in the top right of the window.
    3. In the 'Name' field enter precisely `PATH_TO_FX` .
    4. Press the small folder icon in the 'Value' field, and navigate to
        the `lib` sub directory of the `JavaFX` installation. On the lab
        computers this should be found at `/usr/local/openjfx/lib`. Where
        this file is located on your laptop will depend on where you chose
        to install it to.
	  5. Press `OK` to confirm.

    The above steps set the environment variable `PATH_TO_FX` to point
    towards the `JavaFX` installation, which allows `IntelliJ` to know
    how to execute the `HelloTutor` application. If after following
    the above steps, and after reading the working remotely
    [instructions](https://cs.anu.edu.au/courses/comp1110/help/05-working-remotely/#javafx)
    the program will still not execute, please seek help from your
    peers and your tutor.
   
    Now press `Alt+1` to open the comp1110-labs project (if it is not
    already open), or click on the little vertical text to the left that says `1: Project`.  You see a small drop down menu at the top middle-left next to a small green arrow (it is possible that the green arrow is greyed out) hammer.  Use that menu to select `L1 HelloWorldTest` if it is not already selected.    If you press the
    green arrow while `L1 HelloWorldTest` is selected in the
    drop-down, then IntelliJ will run a set of tests for Lab1.  Click
    the green arrow, and you should now see a message:
    `java.lang.NoClassDefFoundError: comp1110/lab1/HelloWorld`.  This
    means you've not yet created the code that IntelliJ is trying to
    test.  That's OK.  The next task solves this problem.

    If you don't see that message, and instead see a message that says that 'the SDK is not specified for module "COMP1110Labs"', you can fix this by pressing "OK" and then selecting Java version 13 form the drop down menu, then clicking "OK".   You should now see the test run and fail with the message above.
    
    However, you may instead see an error message that says `Cannot
    start compiler: the SDK is not specified...`.  If you see this, press
    OK, which will bring up the ProjectStructure dialogue, which you
    can also reach from the file menu.  Once that dialogue comes up,
    you'll see that the Project SDK is marked as invalid.  You should see an option there to select Java version 13.  If so, click on it and press OK.  Otherwise, click on
    the `New..` button, and select `JDK`.  This will bring up a
    dialogue that allows you to select the location of your Java
    installation.  On the lab machines, it should direct you to
    `/usr/local/openjdk`.  Once that is
    highlighted, press `OK`.  Press `Apply` on the project structure
    dialogue, and then `OK`.  You should now be able to run`L1
    HelloWorldTest` and see the error message
    `java.lang.NoClassDefFoundError: comp1110/lab1/HelloWorld.`, which
    the next task addresses.

### Create a simple class (VDI)

Do the following task in the VDI.

1. **Add a new class**
   
    Navigate to the blue `src` folder.  Continue to navigate to
    `comp1110` and `lab1`.  Inside that folder you'll see `README.md`,
    which is a copy of this file, the lab instructions.  While the
    `lab1` folder is selected, right-click on it and select `New...`
    and the choose `Java class`.  Name the class `HelloWorld` (be sure
    to be precise about the naming of the class, including the upper
    case `W`).  You will be asked whether you would like to add the
    class to Git.  Say `Add`. (*Consider the discussion
    of git concepts detailed below and think why is `IntelliJ` asking you this? What does
    adding the file do? Why might you not want to add the file? If you
    say no, but change your mind later, how can you add the file?)*

2. **Add the main method for your class**
    
    You should now see a very simple piece of code.  Click your mouse
    to the left of the closing brace (`}`), which is just below the
    word `public`.  Type the letters `psvm` and you should find an
    IntelliJ dialogue that recognises this as a shortcut for a main()
    method declaration.  If you press enter you should find new text
    appears, with your cursor below the newly added word `public`.
    This is the main method for your new class; the code that will be
    run by default when your class is executed.  Right now the method
    is empty, so it will do nothing.

3. **Add code to print out `Hi`**. 
    
    Type `sout`, which is another IntelliJ shortcut, this time for
    producing code for printing strings.  Press enter to generate the
    code `System.out.println()`.  This will print a new line
    containing what is between the brackets (nothing!).  Move your
    cursor between the brackets and add the word `"Hi"` (include the
    quotes).  Save your file (either via the `File` menu or with
    `Ctr+S`). Now use the `Run` menu and select `Run...`.  Choose
    `HelloWorld`.  Your little program should now run.  You should see
    a new sub-window with the word `Hi` in black text.

4.  **Test your program** 
    
    Chose `L1 HelloWorldTest` from the dropdown menu next to the green
    arrow at the top of the screen towards the right.  Look carefully
    at the output below.  It should state that it has 
     `Failed: 6 of 6 tests`.  Look
    more carefully at the brownish text below and you'll discover
    what's wrong with your code.

5. **Debug your program**
    
    Change your program so that it prints `Hello`. Read the comments
    and names of the tests you just failed - which ones are you now
    expecting to pass?  Re-run the test and you should find that you
    failed fewer tests.  Try again with `Hello world`, and then
    finally with `Hello world!`.  You should pass all tests.  Notice
    that the testing is *very* pedantic.  You need to have the correct
    number of spaces, correct punctuation, correct case, etc. There
    are **a lot** of more advanced debugging strategies and tools
    which can help you identify the location of issues in your
    code. These include breakpoints and code step throughs, print
    statements, writing or modifying test cases, code walk throughs
    and peer review etc.  As we progress through the labs, some of
    these strategies will be introduced. For now, it is sufficient to
    use the provided tests to assess and debug your code.

### JavaFX Setup Testing

Included in the `src/comp1110/lab1` package
is a simple graphical class, `HelloTutor`. Please attempt to run this
class on the lab computer. If your JavaFX setup is correctly
configured you should be able to run the program and see a little
window pop up.    If not, please return to the JavaFX setup step
above.

Once you're able to successfully run the program, please close that
window and modify the source code of `HelloTutor` to correctly show
the name of your tutor in the title and in the text label visible in
the displayed window.

### Finishing Up

To finish in with the VDI, you need to commit and push your
work and then close the associated issues.

1.  **Commit and push to Gitlab**
    
    Once you have completed your work on the lab computer, you should
    commit your new HelloWorld class and push it to GitLab.  Use the
    `VCS` menu (Version Control Systems) to find `Git`, `Commit
    File..`.  You should see your HelloWorld and HelloTutor files highlighted.  Type
    in a commit message, such as `Finished lab exercises and passed all
    tests!`.  Next to the `Commit` button, there is a small
    arrow. Select `Commit and Push`.  Committing will commit all of
    the changes you've made as a single change, but will *not*
    propagate those changes back to GitLab or any other repo.  For
    your changes to be visible on GitLab or on clones on other
    devices, you need to first *commit*, and then *push* your changes.
    Ignore any warnings, and press `Push` on the next dialogue. You
    should see a small notification stating that the Push was
    successful.  Now go to your GitLab page.  Click the `Commits` tab
    and you should see your commit has shown up on GitLab.  This means
    that the change you made in IntelliJ has been committed and
    propagated into GitLab.  You can now see that change on other
    devices when you clone and pull from GitLab.

	You should now check whether your commit passed CI.   Click on the
    `CI / CD` tab in your GitLab browser menu and click on your
    commit.   You should see that the 'Validate' and 'Build' phases
    passed, and that 'lab1' passed.

2. **Close Issues**

   You can now close each of the Issues (tasks) that you've completed.  Go to
   your GitLab web page, in the top navigation menu click on `Issues`.
   **Before you do anything else, check that you are looking at your own
   gitlab page** by checking for your name at the top left and your
   UID in the URL for the repo.  Once you're sure you're on your page,
   for each of the issues you've competed, click on the issue. You
   will see the history of the issue, then a text box where you can
   write a brief message to indicate that you've finished it
   (eg *"All done, completed without any problems"*). Click 'Comment
   and close issue' once your message is complete. If you don't see any
   issues, go [back](#set-up-gitlab) to the first task and check that you
   *assigned* the issues to yourself correctly.   If you did not, they won't
   show up as issues in your navigation bar.  By default GitLab only
   shows *open* issues, so once you've closed them, they'll disappear. However,
   you can list *all* issues or the *closed* ones by selecting the appropriate
   tab.

### Set up IntelliJ (home)

You now need to configure your home computer/laptop.  **Before you start**, you
must have [set up the software for your home computer](https://cs.anu.edu.au/courses/comp1110/help/05-working-remotely/).

Once you have the software installed, you will need to
carefully repeat the [process from the start of this lab](#set-up-intellij-lab)
of:
1. setting up IntelliJ, and
2. cloning your labs repo,

just as you did in the lab environment, but this time on your *own computer*.
The only major difference will be
that when you clone your labs repo this time, you will see the HelloWorld
class you created at the start of the lab.

### Modify HelloWorld (home)

1. In IntelliJ on your own computer, go to your comp1110-labs project, and
navigate to HelloWorld.
2. Check that HelloWorld runs correctly (use the Run menu), and that it passes
the HelloWorld test, using the `L1 HelloWorldTest` option from the Run menu, just as it
did in the [earlier exercise](#create-a-simple-class-lab).
3. Modify HelloWorld so that it prints out `Goodbye World`.  Confirm that it 
does *not* pass the tests any longer.
4. Commit your change.  Use a commit message such as "Broke program".
5. Fix your program so that it works correctly.
6. Commit your change.  Use a commit message such as "Fixed program".
7. Be sure to *push* your commits if you have not already done so (`VCS`, `Git`,
`...Push`) in IntelliJ.

### Execute HelloTutor (home)
1. Follow the steps shown in the working remotely
   [instructions](https://cs.anu.edu.au/courses/comp1110/help/05-working-remotely/#javafx)
   and ensure that you have installed and configured `JavaFX`
   correctly.
2. In IntelliJ on your own computer, open the comp1110-labs
   project and navigate to `HelloTutor`.
3. Check that the class will compile and run, and that the application
   window appears correctly. 
4. If after carefully reviewing the working remotely instructions, the
   class will not run, please seek assistance via your peers, your
   tutor and the [ Piazza ](https://piazza.com/).
5. There is no need to make any modifications to this program, just
   check that `HelloTutor` runs correctly. We will be coming back to
   `JavaFX` later in the semester.
   
### Have your lab marked

Once you have completed the tasks for the lab, approach your tutor to have them
marked off.  Be sure to show them:
* Your signed pledge (give this to them now if you have not already)
* Your completed week 1 journal entry
* Your work on the VDI
* Your work on your laptop (they will want to see the Git log that shows your work).

### Accessing homework and assignment repos

You should fork and clone the [homework](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-homework)
and [assignment 1](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass1) repos
in exactly the same way as you have for the labs repo, above.

---
## Basic Git Concepts 

 Let's explain some of the most crucial `Git`
operations and concepts:

* **Repo**: A repo is, in essence, the git name for a project. A git
  repo contains a collection of files which are managed by git accross
  multiple access points. A repo can be created from scratch, or a
  repo can be associated to an existing project or collection of
  files.
  
* **Fork**: To *fork a repo* is to make a copy of the repo, under
  your own name. If you do not fork a repo, if you try to make changes
  to any files, you will need permission from the original creator of
  the repo to do so. If this was not the case, what would stop you
  from accessing the `comp1110-labs` repo and deleting this exercise!
  Later in the course, we will see that we can allow others privileges
  to a repo, so that they can make changes without having to make
  their own fork. In summary, to fork is to make your own copy of a
  repo which you have full ownership over.
  
* **Clone**: So far, all of these concepts don't exist on your
  computer, just on `GitLab`. You can edit files within a browser
  using `GitLab`, but imagine trying to program using a simple text
  editor! Instead, we want to make a **local copy** of a repo, and
  make changes as we see fit using our own software development
  tools. This is where cloning comes in. When we *clone a repo*, we
  download the latest version of the repo from the cloud
  (i.e. `GitLab`'s server) to our computer. As we make changes, we can
  use the below operations to track these changes and upload them back
  to the `GitLab` version. 

* **Add**: By default, git doesn't know what you want to track and
  what you don't want to track. To 'track' a file, in git language,
  means that git will notice changes in the file, and warn you if you
  have not committed (see below) these changes. Let's say you have
  cloned a repo, and you want to add a `README` file. You create the
  file using a text editor, and save it. The file now exists locally
  on your computer, but git is not yet tracking it. You can use
  `IntelliJ`'s VCS tools menu (which will be explained throughout the
  semester) or a terminal window to tell git to track this file by
  using the add command (`git add README`). Now, git is happy because
  it knows that you want it to be listening for changes to this
  file. By default, git will yell at you if you have any files within
  your local copy of a repo which have not been added, unless you
  exclude these files using a [git ignore
  file](https://git-scm.com/docs/gitignore). An example of the type of
  files you may want in your local copy of a repo, but not to be
  traced, are configuration files which are local to your computer. In
  fact, when you create a git repo using `IntelliJ`, it will
  automatically generate a git ignore file which excludes its own
  configuration files! In summary, when you add new files to a repo,
  you need to tell git to track these files (if you want it to) by
  using the git add command. 

* **Commit**: Think of committing as making a save point for your
  project. One of the magical parts of git is that you can return, at
  any time, to any commit point in the history of the project. So,
  commit regularly! Continuing the example of our `README` file. You
  have created the file, and added the file. You now want git to
  'save' the state of the file, so you would use `IntelliJ`'s VCS
  tools or the terminal to commit the file (`git commit -m "Completed
  README" README`). As you can see from this command, commits require
  a message (though one commit can be more than one file). Commit
  messages are very important. Think about looking back on your work a
  year later - what would be helpful to you? You might like to know
  what the changes you made were, why you made them (if it's not
  obvious) or what the state of the project is after the
  commit. Having informative commit messages makes it easier to look
  back through the history of a project and find useful points to [
  checkout ]( https://git-scm.com/docs/git-checkout ) to or [cherry
  pick]( https://git-scm.com/docs/git-cherry-pick ) from. However,
  a common mistake is to think that because a commit has been made,
  that this commit is now uploaded. Commits are completely local, and
  the changes are not uploaded to `GitLab` until you **push** them
  (see below). This is useful, since when we are working offline, we
  might need to make savepoints of our files and manipulate commits
  without interrupting the working release version available to others
  on `GitLab`. In summary, committing is the act of saving the
  progress of your repo, and labelling this progress with a message
  which should be concise but informative. Once a change is committed,
  it is ready to be pushed.

* **Push**: Pushing is the act of taking one or multiple changes
  (commits) made to the repo, each labelled with a commit message, and
  uploading these changes to the online version. You can only push if
  git is under the impression that there are no pending changes to
  tracked files which have not been committed. This rule is enforced
  because git wants to be sure that when a push is made, the state of
  the local version and the uploaded version are matching (with the
  exception of untracked files). To continue our example of `README`,
  you may realise that you made a mistake and want to change the
  file. So you make the changes locally using a text editor, then
  re-commit these changes (you need a new save point). Re-committing
  does not overwrite the previous commit and its state, it is still
  present in the file history. You can now push the current state of
  your repo to the online version. When you push, you need to push to
  a target
  [remote](https://git-scm.com/book/en/v2/Git-Basics-Working-with-Remotes)
  and target
  [branch](https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell). By
  default, these will be `origin` and `master` respectively. Don't
  worry too much about remotes and branches for the moment, these will
  be explained as we progress throughout the course. For the moment,
  remember that pushing (`git push README`) is the act of taking a
  savepoint and uploading it to the online version of the repo. 
  
* **Pull**: Let's say that you want to share the work you are doing
  with someone else. You have made a git repo, and have added your
  friend with the correct privileges so that they can edit files on
  your repo. You send them the URL to your git repo and they clone
  this repo. Notice that, in this case, your friend does not need to
  fork the repo first, since they actually want to work on **your**
  copy of the repo, so that you can collaborate! They didn't like your
  (rushed) version of the `README` so decide to change it. They open a
  text editor, change the file, and commit their changes (notice that
  they did not need to add the file, since it was already being
  tracked by git). They push their commit with a helpful commit
  message. The next time you work on the project, your first step
  should always be to make sure that your local version of the repo
  matches the online version. To do this, you use a git pull. Git pull
  applies any new commits available online to your local version of a
  repo. As in pushing, pulling requires a remote and a branch, with
  the defaults of origin and master (again, these concepts will be
  explained later in more detail). After pulling, you will see the
  changes made by your friend and their commit message, explaining the
  changes and why they were made. This is the basis of collaboration
  on git!

Unfortunately, sometimes things go wrong. We will explore the
possibility of merge conflicts and other issues later in the labs. For
the moment, as long as you push and pull frequently from all your
devices, you will likely not encounter any problems.
