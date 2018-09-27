# Grade
80/100

**Note: This is the base grade assigned to your team. Your individual score may vary if I have detected that an individual team member did not contribute to the project.**

## Comments
- Repository &#10005;
- Form &#10003;
- Design &#10003;-
- Implementation &#10003;+

It looks like you both used the repository but there is no evidence that both of you actually wrote code. All commits were through the web interface by copying the code placed into one branch into a file in the master branch (Repository &#10005;). Let me know if I have this wrong, and you can show me evidence of more substantial collaboration. The implementation of the player class is very nice, however, and I like the notion of storing a strategy as an attribute of the class so it can be easily reused (Implementation &#10003;+). There are ways in Java to make this even more concise, and we will discuss them in later class meetings! Comments are present and the styling is easy to read (Form &#10003;). The code compiles without a problem, though without more detail in the prompt I'm not sure what the possible options are (I figured it out by looking at your code). I can understand your thinking with the Excel sheet, and it's clever, but it's not really what the assignment was looking for. Note that I specifically mention that a strategy can only be declared dominant if there are at least 100 rounds - you test five (Design &#10003;-). Clever workaround to try the Excel file documentationk, but it's not really in the scope of this class to test if you know how to use Office.

# Project 1
In this project, you will develop bots that play a simple game. Each bot has a different strategy. You will pit these bots against each other to determine which strategy is more successful in this context.

# Teams
Teams have been assigned for this project as follows. They are fixed - no switching or cooperating across team lines. It is up to teammates to ensure that their partner adheres to the <a href="https://www.american.edu/academics/integrity/code.cfm">American University Honor Code.</a>

0. Drew Meseck & Benjamin Doiron
1. Deirdre Belson & Marlon Teo-Diaz
2. Arsenii Shatokhin & Julie Ngo
3. Michael  Lucatorto & Olivia Chernew
4. Jonathan Wolfson & Olivia Hirsh
5. Jeffrey Chase & Marc Cohen-Trivinos
6. Sarah Sleiman & Gennaro Dicolandrea
7. Anthony Baron & Gabriel Euodias
8. Miguel Enrico Sabado & Angelica Vega-Aponte
9. Nathaniel Riley & Liam Farley
10. Sean Gallagher & Yifan Xu

## Step 0 - Background Research.
1. **Both members** should review the description for the <a href="https://en.wikipedia.org/wiki/Prisoner%27s_dilemma">Prisoner's Dilemma</a> on Wikipedia. You *do not* need to become familiar with the intimate mathematical details of the Dilemma, just the general mechanism and the difference between the iterated dilemma and the non-iterated version (Introduction through the end of Section 3.1).
2. This topic has been debated endless in a variety of fields, so there is a lot of additional material available if you want to dig deeper. For this assignment, you will only be required to be familiar with the basics (e.g., you will not need to understand the Nash equilibrium or the proof that goes with it).
4. **Both members** should work together to devise five strategies for "winning" the prisoner's dilemma over a long number of iterations. I recommend first writing these strategies down in simple English rather than trying to jump directly into developing code. You may use the 'tit-for-tat' strategy as one of them, or come up with ones of your own.
5. **Optional** There are several good videos that can help make these concepts a little clearer. I recommend [this one](https://www.youtube.com/watch?v=BOvAbjfJ0x0), but there are many others.

## Step 1 - Fork the Repo for your Team.
1. **Both members** of your team will visit <a href='https://classroom.github.com/g/jrobClld'> this link</a>. This will fork a repo for your team to Github. For this assignment, you will share the Github repo with your teammate. If you're the first member of your team to visit the link, you can create the team and fork the repo - **make sure you create the right team**. If you're the second member to click the link, then **make sure** you join the right team.
2. **Both members** will clone the repository to your local machines. You will then each have a local repository that is linked to the shared repository, and can work on the code together.
3. As a reference for how to use git, I suggest <a href='http://codingdomain.com/git/'>this site</a>, as it avoids some of the more complicated theory behind git and focuses on the bare minimum practicalities.

## Step 2 - Review the Provided Code.
In the repository is a starter class, `Prison`, that has the bare minimum for the iterated prisoner's dilemma. There is a variable for the last choice made by each of two prisoners, (i.e., Prisoner A and Prisoner B).

```java
//The last choice of each prisoner.
//True : the prisoner betrayed.
//False : the prisoner stayed silent.
boolean lastChoicePrisonerA = false;
boolean lastChoicePrisonerB;
```

In the current definition, Prisoner B knows that Prisoner A stayed silent the last time that Prisoner A played the dilemma. Prisoner B is using a `RandomChoice()` strategy (not the name of a publicly defined strategy), in which B will *stay silent* if A *stayed silent* last time. If A *betrayed* last time, then B will randomly choose to *stay silent* or *betray* based on the results of a coin flip. The coin flip is generated using the `Random` class, a more thorough description of which can be found <a href="https://docs.oracle.com/javase/10/docs/api/java/util/Random.html">here</a>.

```java
public static boolean randomChoice(boolean lastChoice){
    Random rand = new Random();
    return lastChoice && rand.nextBoolean();
}
```

## Step 3 - Write one method for each strategy.
Following the design pattern for the `randomChoice()` strategy, define one method for each of your five team's strategies (you may not use `randomChoice()` as one of your five. Assume that each prisoner knows the outcome of one or more previous encounters with the other prisoner.

## Step 4 - Write a method for scoring the outcome
In the definition of the prisoner's dilemma on the wikipedia article linked above, if they both stay silent then both prisoners serve 1 year. If a prisoner *stays silent* and the other *betrays*, then the prisoner who stayed silent gets 3 years in prison while the other goes free. If both *betray*, then each prisoner serves 2 years. Write a method that assigns a score to a strategy based upon the outcome.

## Step 5 - Test your Strategies
Using your five strategies and your scoring method, determine which strategy is most effective by pitting them against each other. You are free to determine the extent to which you test your strategies, but for one strategy to be declared dominant to another in a pairing, they should compete over no fewer than 100 iterations.

## Step 6 - Push to Github
Do not forget to push your final submission to Github before the deadline.

## Step 7 - Peer and Self Review
A separate form will be made available for you to rate your own performance and your partner's.

# Grading
Grading will be assigned according to the following categories. As described in the syllabus, each category can receive a  &#10003; (satisfactory); a &#10003;+ (above and beyond); a &#10003;- (incorrect, incomplete, or sloppy); or in the worst case an &#10005;, meaning it was altogether missing or inappropriate (assigned at the instructor's discretion). A category assigned an &#10005; can carry significant grade penalties for this assignment.

1. Repository / Teamwork. Everyone contributed and used the repository well.
2. Comments and Code Formatting. The code is easy to follow and understand.
3. Project Design. The code is designed to do what the project requires.
4. Implementation. The code does what it was designed to do.

Rating | Repository | Form | Design | Implementation
-|-|-|-|-
&#10003;+ | Evidence of branching and merging. | Project is commented and styled according to [Javadoc](https://www.oracle.com/technetwork/java/javase/documentation/index-137868.html) Guidelines. | Project includes five strategies that are substantially different from each other; tests all combinations of them; provides a formatted printout of the outcomes | Project is free of logical and syntax errors; extensive and creative use of Java commands and classes to reduce length and/or complexity.
&#10003; | Multiple commits from each teammate | Project is commented and styled neatly. | Project includes five strategies that are different from each other; tests two of them; provides a printout of the winner | Project compiles
&#10003;- | Evidence that one teammate did most of the work and/or all commits were through web interface | Comments are sparse and/or code styling is difficult to follow. | Strategies are too similar or incomplete; minimal testing; printout of program execution status only | Project compiles with some minor correction