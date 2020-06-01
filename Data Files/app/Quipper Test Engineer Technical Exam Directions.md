Quipper Android Test Engineer Technical Exam

# Assignments

1. Given a simple android APK, create *Automated Instrumentation Test* suite that test all of the application features.
2. Create an *Android Automation Test System Architecture Proposal* slides to be presented to our VP of Engineering.

## Automated Instrumentation Test

### Objectives

Create an automated instrumentation test to test the given .apk application. Submit the git-bundle to us, complete with a step-by-step instruction on how to install & run the automated test.

git-bundle command: `git bundle create repo.bundle HEAD master`
then send us the `repo.bundle` file

### Features to Test

Here are the *minimal* features that you have to test:

1. Test whether the app correctly display a video playlist.
2. Test whether the app correctly load a video player when the playlist item is clicked.
3. Test whether the app correctly load a webView component when it's opening the "Campus Search" menu.
4. Test whether the webView component correctly open the ITB web page when user is typing "itb" and clicking the 1st item on the search result.

### Bonus Points

Feel free to add several edge cases that you think are important to be tested. 

## Android Automation Test System Architecture Proposal

Imagine you are tasked to create an automated test system for an already launched app. Currently, the app was only released after it passed all the tests contained on the "happy path" document. The test was conducted manually without any program or automated system. Create a 15 minutes proposal slides on your design of the Android Automation Test System. 

### Objectives

Here are the *minimal* point of the system that need to be presented on the slides:

1. Explain the proposed Technologies Stack
2. Explain the proposed Release Flow after the automated test system is running.
3. Explain a rough cost estimation to build the system

### Bonus Points

Fell free to add more point on the slides to backup the argument of the benefits of moving to an automated test system. 

## Submission

* You have 1 week time to complete and submit both test.
* Your submission of the 1st task (instrumentation test) will be reviewed by our current Android Engineer team.
* Your slides on the 2nd task (automated test system proposal) will have to be presented by you on the next stage of interview with our VPs.
* Please use English only for the code/commit comments and presentations. Reviewers won't read any text except English.