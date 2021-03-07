# mastery-4-1 - Mastery Module 4.1.

In this 7th mastery module on route to the Java 11 certification, we are going to use data from the History of the United States of America in the 60's

## Exercise

1. `Exception` `catch` order
2. What is the output of `String` for it's 3 different kind of values: `null`, "" and "Something"
3. JLS evaluation order in multiple operands
4. Last `Exception` to execute before exiting program abruptly
5. Generics separation between `<T>` and `T`
6. Java Inheritance of state
7. Calculating averages with `collector`'s or with Number typed streams
8. Loading of drivers in JDBC 4.0
9. DOS attacks in Java
10. Using non-modularized jars in modularized jars - [mastery-4-1-modularity](../mastery-4-1-modularity)
11. Using `private` in inner classes
12. All possible `switch`
13. References operation in shadowing static interface members with class members
14. What encapsulation CANNOT do!
15. What does `@Deprecated` actually do?

## Preparation

If you are on a Unix based system or if you are running any sort of BSD, MAC-OS, then you are fine using filr [prepare.sh](prepare.sh). If you are using windows, then this will maybe work. I seldom use windows and not always I can test my work there. The point is that you need to have a `/tmp`
folder at this point.

```bash
./prepare.sh
```

## Output

```text
==================== Master Module mastery-4-1 ====================
Note that this mastery need the prepare.sh script to be run first.
--- 1. `Exception` `catch` order
============
Case: We have just made a test about the history of the United States of America.
You are applying for a United States residency and nationality.
You will be qualified in 6 levels in lowest to highest order:
rookie, beginner, junior, medior, expert or senior
In what year was president JFK born?
1917
JFK was which president of the United States of America?
35
How many years was JFK in power?
3
In what year did JFK enrolled in Harvard University?
1936
In what year did JFK write his senior thesis on how Britain was in a considerable weak position against the germans in WWII?
1939
When did JFK graduated?
1940
How many copies did `Why England Slept` sold?
80000
Take-away
1. In a try with multiple catches, the order is more specific to more generic
--- 2. What is the output of `String` for it's 3 different kind of values: `null`, "" and "Something"
============
Case: Three students are making resets: Katie, Chloe and Susan
Teacher: In what year was JFK assigned to the ONI field office at Headquarters
Katie: Hmmmm.... null
T: That is not correct. Chloe?
Chloe: I don't know, maybe, 
T: You also don't know? How about you Susan?
Susan: Of course I do! It was in January 1942
Take-away
1. An empty string does not generate output
2. A null string generates `null` as output
3. A string with a value, generates that value as output
--- 3. JLS evaluation order in multiple operands
============
https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html
Case: We have the initials LBJ and we want to know how many years was he/she president.
We don't know anything about them. Just the initials.
We have a map from initials to president name.
Another from president name to year.
Another from year to president number.
And finally and array from president number to how many years.
Can we do this in one go?
We seem to have found a mistake. It wasn't 2 years. That's for sure!
We though it was JFK, but then it wasn't JFK and instead it was Lyndon B. Johnson
I guess our calculation is correct. They were 3 years!
An now it is corrected also in our data structures: 3 years!
Take-away
1. Expression evaluation can be seriously complicated
2. Most counter intuitive rule might be that the left operand is evaluated first.
3. All operands have to be evaluated
4. Read https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html for more details±!
--- 4. Last `Exception` to execute before exiting program abruptly
============
Case: It is 1969, June 28th and you went downtown NY to the famous `The Stonewall Inn`
It was a nice cosy night and now its early morning and all of the sudden the police charges in!
You are now facing the beginnings of what later became known as the Stonewall riots
Patrons are having after hours fun!
This should be first exception: org.jesperancinha.java11.mastery4dot1.riots.ResponseException
	Patrons responded to the police action in a series of riots which, fortunately, led to a more intense discussion on LGBT rights across the USA.
	org.jesperancinha.java11.mastery4dot1.Mastery4Dot1Runner.exercise4(Mastery4Dot1Runner.java:459)
	org.jesperancinha.java11.mastery4dot1.Mastery4Dot1Runner.main(Mastery4Dot1Runner.java:64)
If our story had ended here, the raid would have never happened.
In other words, System.exit(1), would have not allowed to see the output of RaidException.
Notice when this exception occurs: org.jesperancinha.java11.mastery4dot1.riots.RaidException
	In 1969, unfortunately, LGBT rights weren't legally recognized and in fact were criminalized. Police did their work and tried to raid the Stonewall Inn.
	org.jesperancinha.java11.mastery4dot1.Mastery4Dot1Runner.exercise4(Mastery4Dot1Runner.java:456)
	org.jesperancinha.java11.mastery4dot1.Mastery4Dot1Runner.main(Mastery4Dot1Runner.java:64)
You see this here, but if you did a System.exit(1) in the previous location, you wouldn't see this message
Take-away
1. Although finally always occurs in a try catch, the exception doesn't do anything yet although it has been thrown, if no catch is declared
2. Further process that block the thread from continuing will prevent this exception to affect anything at all.
--- 5. Generics separation between `<T>` and `T`
============
Case: Lyndon B. Johnson envisioned `The Great Society plan` in 1963.
This led through the years to the civil rights act of 1964 and 1965.
We can make a few sentences with this:
This happens because we specified that the `printSocietyAdapterMethod` would return `String` -> java.lang.ClassCastException
	class java.lang.Double cannot be cast to class java.lang.String (java.lang.Double and java.lang.String are in module java.base of loader 'bootstrap')
	org.jesperancinha.java11.mastery4dot1.Mastery4Dot1Runner.exercise5(Mastery4Dot1Runner.java:431)
	org.jesperancinha.java11.mastery4dot1.Mastery4Dot1Runner.main(Mastery4Dot1Runner.java:65)
However we also generically specify that if input parameters are numbers, then it should return a `Double` number.
This is why it fail this way. Let's make it good now.
This is a message from the GSA->The civil liberties act was signed off by LBJ in 1963
The Great Society term was coined in 1964 which led to the creation of the Civil Rights act of 1964,000000
Take-away
1. We can specify a generic type for one specify class before runtime or during runtime with anonymous classes
2. We can also, regardless of the class generic type, specify the input params of each individual method of an instance object during runtime
3. We can, in the same way specify the return parameters
--- 6. Java Inheritance of state
============
Case: After JFK's assassination, LBJ inherited the bill of rights which JFK had fought for, for so long.
This was the time to make a move, and make a move LBJ did!
Marylin Monroe, didn't sing Happy B'Day to LBJ though.
Work to do:
Civil Rights Bill passed: false
Happy birthday passed: Happy Birthday Mr. President
But wait! This is not an instance member!: Happy Birthday Mr. President
So no `Happy Birthday Mr. President`for LBJ
Take-away
1. Since we cannot have a subclass of multiple classes, only interfaces, then there is no multiple inheritance of state in Java
--- 7. Calculating averages with `collector`'s or with Number typed streams
============
Case: We will count the average count of electoral votes per state in the results of the 1968th USA presidential election.
The sum of electoral votes for Richard Nixon in 1968 was 301 (via IntStream)
The sum of electoral votes for Richard Nixon in 1968 was 301 (via ObjStream)
The sum of electoral votes for Richard Nixon in 1968 was 301 (via BoxedStream)
So the electoral vote average for Richard Nixon was 9,406250 (via IntStream)
So the electoral vote average for Richard Nixon was 9,406250 (via averagingDouble)
So the electoral vote average for Richard Nixon was 9,406250 (via averagingInt)
So the electoral vote average for Richard Nixon was 9,406250 (via averagingLong)
Take-away
1. All average calculation using streams result in a double result
2. There are at least two ways of doing this. One via collectors and the other via the average method of a Number Stream
--- 8. Loading drivers in JDBC 4.0
============
Case: We need to record the different missions that took place in the Vietnam War.
The Vietnam war is a period that lasted between 1887 and 1975.
The US had a prominent role in this role which escalated very fast between 1965 and 1968.
During period, Operation Rolling Thunder took place.
From: https://en.wikipedia.org/wiki/Operation_Rolling_Thunder:
Operation Rolling Thunder was the title of a gradual and sustained aerial bombardment campaign conducted by the United States (U.S.) 2nd Air Division (later Seventh Air Force), U.S. Navy, and Republic of Vietnam Air Force (RVNAF) against the Democratic Republic of Vietnam (North Vietnam) from 2 March 1965 until 2 November 1968, during the Vietnam War.
Let's put this in our database. We will use an H2 database
Connection: H2 / UNNAMED
Current auto-commit setting: true
We can configure this because our dependency com.h2database:h2:1.4.200 contains:
1. file java.sql.Driver in /META-INF/services/java.sql.Driver
2. this file contains: org.h2.Driver
This way, the runtime knows which driver to use.
The result is 1
The result is Operation Rolling Thunder was the title of a gradual and sustained aerial bombardment campaign conducted by the United States (U.S.) 2nd Air Division (later Seventh Air Force), U.S. Navy, and Republic of Vietnam Air Force (RVNAF) against the Democratic Republic of Vietnam (North Vietnam) from 2 March 1965 until 2 November 1968, during the Vietnam War.
The result is Wikipedia
The result is 1965
Take-away
1. In JDBC4.0, available in Java 11, we don't need to load the driver.
2. As file java.sql.Driver exists in /META-INF/services of that library, the driver is automatically loaded.
--- 9. DOS attacks in Java
============
Case: It's 1967, you work for the Pentagon and you come across some papers about the USA involvement in the Vietnam war.
You have to keep these papers safe, so you decide to make a copy of these files to your safe.
We'll this in some safe way.
We also know that files bigger than 2000 characters are fake.
We still copy until its 2000 characters.
We will also process maximum 200 files.
We will validate evey file and check for pattern /tmp/pentagon to avoid path traversal.
Check your /tmp/tmp folder for the results!
Take-away
1. Guideline 1-1 / DOS-1: Beware of activities that may use disproportionate resources
2. Guideline 1-2 / DOS-2: Release resources in all cases
3. Guideline 1-3 / DOS-3: Resource limit checks should not suffer from integer overflow
4. Guideline 1-4 / DOS-4: Implement Robust Error/Exceptions handling for services
--- 10. Using non-modularized jars in modularized jars
============
Please check module mastery-4-1-modularity to continue.
--- 11. Using `private` in inner classes
============
Case: In 1957, Frank Kameny's was fired from the United States Army.
The case seemed to come from institutionalized homophobia. In fact he was discharged for being found to be a homosexual
In those years, that was, unfortunately a reason to be used against someone to keep them out of the workforce.
That started a 4 year case in the Supreme Court of the United States of America.
Unfortunately, it all came to close in 1961, where Kameny was denied certiorari.
This means that his case was denied the right to be reviewed and Kameny lost his case.
This case was closed back then
Based on this, we will now see how can two classes with exactly the same code, can make properties accessible and non-accessible.
Court Session is opened:
from:https://en.wikipedia.org/wiki/1960s_in_LGBT_rights
The United States Supreme Court denies certiorari to Frank Kameny's petition to review the legality of his firing by the United States Army's Map Service in 1957, bringing his four-year legal battle to a close
Court Session is closed:
!!!CLASSIFIED!!!
If we check via reflection:
from:https://en.wikipedia.org/wiki/1960s_in_LGBT_rights
The United States Supreme Court denies certiorari to Frank Kameny's petition to review the legality of his firing by the United States Army's Map Service in 1957, bringing his four-year legal battle to a close
This means that although the courtCase is private now, it is still registered for the future.
Take-away
1. private members can be always access from the outer and inner classes alike
2. the scope, however, changes when the class is taken out
3. although the code stays the same, the scope changes
4. moving classes away from their inner scope can also be used to change scope without changing a single line of code.
--- 12. All possible `switch`
============
Case: It is the 15th of August 1969 and you just went to have fun with your pals.
We'll look at the listings to see wha't happening for today and tomorrow.
Switch case for day 15 and day 16
On day 15 these bands:
[Richie Havens, Swami Satchidananda, Sweetwater, Bert Sommer, Tim Hardin, Ravi Shankar]
will play!
On day 16 these bands:
[Ravi Shankar, Melanie, Arlo Guthrie, Joan Baez, Quill, Country Joe McDonald, Santana, John Sebastian, Keef Hartley Band, The Incredible String Band, Canned Heat, Mountain, Grateful Dead, Creedence Clearwater Revival]
will play!
Switch case for Joan Baez
Joan Baez is playing these songs:
[Oh Happy Day, The Last Thing on My Mind, I Shall Be Released, Story about how federal marshals took husband David Harris into custody, Joe Hill, Sweet Sir Galahad, Hickory Wind, Drug Store Truck Driving Man (duet with Jeffrey Shurtleff), One Day at a Time, Take Me Back to the Sweet Sunny South, Warm and Tender Love, Swing Low, Sweet Chariot, We Shall Overcome]
Switch case for who played 5 songs only
These artists are playing 5 songs: [John Sebastian, Keef Hartley Band, Grateful Dead]
Switch case for artists who played for 45 minutes = 2700 seconds
These artists played for 2700 seconds:
[Sweetwater, Tim Hardin, Ravi Shankar, Joan Baez, Quill, Santana, Keef Hartley Band, ]
Switch case for artists who start with a C.
These artists played for C seconds:
[Country Joe McDonald, Canned Heat, Creedence Clearwater Revival, Country Joe and the Fish, Crosby, Stills, Nash & Young]
Take-aways
1. for switch case, the allowed primitive types are int, short, char and byte
2. for switch case, the allowed boxing types are Integer, Short, Character and Byte
3. extra objects can be of type String of enum
4. cases must be declared with constants
5. default isn't mandatory but there can only be one
--- 13. References operation in shadowing static interface members with class members
============
Case: You don't want to miss the time Joan Baez is going to perform
Your ticket has two dates and times on it, but which one is the one from your concert?
And what is the other date about?
In your ticket it says: Artist{name='Joan Baez', start=1968-08-16T03:00, end=1968-08-16T03:45}
And the other date is start: 1969-08-15T17:00
And the other date is end: 1969-08-18T11:10
Right! This is actually the time Woodstock '69 in Bethel, New York starts and ends!
Take-away
1. Members in interfaces are implicitly static
2. Static members can be shadowed by instance members
3. We can, however, by upcasting access them anyways
4. If we don't upcast, in our specific case, the compiler would interpret that an attempt to access instance members
5. Since instance members are package protected, and we are on a different package, this results in a compilation failure
---  14. What encapsulation CANNOT do!
============
Case: You were so impressed with day 16th of August 1969 at Woodstock, that you decided to make a radio of it
The best thing about radio is always the surprise factor and the fact that you do not control it
So we create a radio with a list of all the artists that played on that day
We'll get a random artist with the only available method.
So now we've hidden our list and any possibility of changing it!
We can still select random artist 😉 Arlo Guthrie
Take-away
1. Encapsulation is a simple concept
2. Encapsulation allows to hice unwanted members and methods from public access
3. Encapsulation has nothing to do with inheritance!
4. Encapsulation has nothing to do with abstraction!
5. Encapsulation has nothing to do with polymorphism!
6. Encapsulation is just about wrapping functionalities to reduce functionality to what is strictly needed!
7. Encapsulation can be, and frequently is used in combination with other techniques, but that doesn't change its basic principle.
---  15. What does `@Deprecated` actually do?
============
Case: You are one of the organizers of Woodstock '69
You realized you made a mistake!
You've registered Joan Baez to perform but in the wrong register!
What will happen?
Oh no! You've registered Joan Baez in the wrong book: DeprecatedArtist{name='Joan Baez'}
You sneak into the back and fix your mistake: Artist{name='Joan Baez', start=1968-08-16T03:00, end=1968-08-16T03:45}
We don't see the difference running the code
This is because @Deprecated activates during compile time
You should be getting this from your compiler: 'DeprecatedArtist(java.lang.String)' is deprecated 
'org.jesperancinha.java11.mastery4dot1.concert.DeprecatedArtist' is deprecated
Take-away
1. @Deprecated triggers compilers to show warnings
2. @Deprecated has RUNTIME retention. This just means that the annotation is not removed
3. @Deprecated is accessible via reflection during runtime.
4. @Deprecated is applicable all around the code:{CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE}
🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄
Hope you enjoyed this mastery into Java 11 with the united states of america's history flavour to it.
Please keep coming back as I'll be creating more mastery modules.
Thank you!
🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄

Process finished with exit code 0
```

## References

- [Java Security Practices Code Guide](https://www.oracle.com/java/technologies/javase/seccodeguide.html)
- [Naming of Automatic Module](https://www.tutorialspoint.com/what-are-automatic-modules-in-java-9)

- [Woodstock](https://en.wikipedia.org/wiki/Woodstock)
- [List of performances and events at Woodstock Festival](https://en.wikipedia.org/wiki/List_of_performances_and_events_at_Woodstock_Festival)
- [1960s in LGBT rights](https://en.wikipedia.org/wiki/1960s_in_LGBT_rights)
- [Frank Kameny](https://en.wikipedia.org/wiki/Frank_Kameny)
- [Pentagon Papers](https://en.wikipedia.org/wiki/Pentagon_Papers)
- [Operation Rolling Thunder](https://en.wikipedia.org/wiki/Operation_Rolling_Thunder)
- [1968 United States presidential election](https://en.wikipedia.org/wiki/1968_United_States_presidential_election)
- [Richard Nixon](https://www.biography.com/us-president/richard-nixon)
- [Voting Rights Act of 1965](https://en.wikipedia.org/wiki/Voting_Rights_Act_of_1965)
- [Civil Rights Act of 1964](https://en.wikipedia.org/wiki/Civil_Rights_Act_of_1964)
- [Great Society](https://en.wikipedia.org/wiki/Great_Society)
- [Stonewall riots](https://en.wikipedia.org/wiki/Stonewall_riots)
- [Lyndon B. Johnson](https://en.wikipedia.org/wiki/Lyndon_B._Johnson)
- [John F. Kennedy Biography(1917–1963)](https://www.biography.com/us-president/john-f-kennedy)
- [The 1960s History by The History Channel](https://www.history.com/topics/1960s/1960s-history)

<div align="center">
      <a href="https://www.youtube.com/watch?v=pD3Vn44F7as">
         <img 
              src="https://img.youtube.com/vi/pD3Vn44F7as/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=Q9wdMJmuBlA">
         <img 
              src="https://img.youtube.com/vi/Q9wdMJmuBlA/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=msw-SCSQm3Q">
         <img 
              src="https://img.youtube.com/vi/msw-SCSQm3Q/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=mLXoeelZ7XA">
         <img 
              src="https://img.youtube.com/vi/mLXoeelZ7XA/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=6x0l_vkjozc">
         <img 
              src="https://img.youtube.com/vi/6x0l_vkjozc/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=MR41T36LhMA">
         <img 
              src="https://img.youtube.com/vi/MR41T36LhMA/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=-nrpLVgO7l4">
         <img 
              src="https://img.youtube.com/vi/-nrpLVgO7l4/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=5QAF2qF4wHU">
         <img 
              src="https://img.youtube.com/vi/5QAF2qF4wHU/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=Ok9941BTzVg">
         <img 
              src="https://img.youtube.com/vi/Ok9941BTzVg/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=bcS6N_XPSqA">
         <img 
              src="https://img.youtube.com/vi/bcS6N_XPSqA/0.jpg" 
              style="width:10%;">
      </a>
</div>

---

## References

### Online

- [OCP11 1z0-817](https://education.oracle.com/upgrade-ocp-java-6-7-8-to-java-se-11-developer/pexam_1Z0-817)
- [OCP11 1z0-819](https://education.oracle.com/java-se-11-developer/pexam_1Z0-819)
- [OCP 11 study guide](https://www.goodreads.com/book/show/51132641-ocp-oracle-certified-professional-java-se-11-programmer-i-study-guide)
- [A JDeps Tutorial - Analyze Your Project's Dependencies](https://nipafx.dev/jdeps-tutorial-analyze-java-project-dependencies)

---

## Java 11 Specs

- [Qualified Exports](https://www.logicbig.com/tutorials/core-java-tutorial/modules/qualified-exports.html)
- [The modular JDK](https://openjdk.java.net/jeps/200)
- [JLink](https://docs.oracle.com/javase/9/tools/jlink.htm)

---

## The module graph

[![alt text](https://bugs.openjdk.java.net/secure/attachment/72525/jdk.png "The module graph")](https://openjdk.java.net/jeps/200)
 
---

## About me 👨🏽‍💻🚀

[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/JEOrgLogo-20.png "João Esperancinha Homepage")](http://joaofilipesabinoesperancinha.nl)
[![Twitter Follow](https://img.shields.io/twitter/follow/joaofse?label=João%20Esperancinha&style=social "Twitter")](https://twitter.com/joaofse)
[![GitHub followers](https://img.shields.io/github/followers/jesperancinha.svg?label=jesperancinha&style=social "GitHub")](https://github.com/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/medium-20.png "Medium")](https://medium.com/@jofisaes)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/google-apps-20.png "Google Apps")](https://play.google.com/store/apps/developer?id=Joao+Filipe+Sabino+Esperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/sonatype-20.png "Sonatype Search Repos")](https://search.maven.org/search?q=org.jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/docker-20.png "Docker Images")](https://hub.docker.com/u/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/stack-overflow-20.png)](https://stackoverflow.com/users/3702839/joao-esperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/reddit-20.png "Reddit")](https://www.reddit.com/user/jesperancinha/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/acclaim-20.png "Acclaim")](https://www.youracclaim.com/users/joao-esperancinha/badges)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/devto-20.png "Dev To")](https://dev.to/jofisaes)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/hackernoon-20.jpeg "Hackernoon")](https://hackernoon.com/@jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/codeproject-20.png "Code Project")](https://www.codeproject.com/Members/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/github-20.png "GitHub")](https://github.com/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/bitbucket-20.png "BitBucket")](https://bitbucket.org/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/gitlab-20.png "GitLab")](https://gitlab.com/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/bintray-20.png "BinTray")](https://bintray.com/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/free-code-camp-20.jpg "FreeCodeCamp")](https://www.freecodecamp.org/jofisaes)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/hackerrank-20.png "HackerRank")](https://www.hackerrank.com/jofisaes)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/codeforces-20.png "Code Forces")](https://codeforces.com/profile/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/codebyte-20.png "Codebyte")](https://coderbyte.com/profile/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/codewars-20.png "CodeWars")](https://www.codewars.com/users/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/codepen-20.png "Code Pen")](https://codepen.io/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/coursera-20.png "Coursera")](https://www.coursera.org/user/da3ff90299fa9297e283ee8e65364ffb)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/hacker-news-20.png "Hacker News")](https://news.ycombinator.com/user?id=jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/infoq-20.png "InfoQ")](https://www.infoq.com/profile/Joao-Esperancinha.2/)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Articles&message=Across%20The%20Web&color=purple)](https://github.com/jesperancinha/project-signer/blob/master/project-signer-templates/Articles.md)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Homepage&message=Time%20Disruption%20Studios&color=6495ED)](http://tds.joaofilipesabinoesperancinha.nl/)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Homepage&message=Image%20Train%20Filters&color=6495ED)](http://itf.joaofilipesabinoesperancinha.nl/)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Homepage&message=MancalaJE&color=6495ED)](http://mancalaje.joaofilipesabinoesperancinha.nl/)
[![Generic badge](https://img.shields.io/static/v1.svg?label=All%20Badges&message=Badges&color=red)](https://github.com/jesperancinha/project-signer/blob/master/project-signer-templates/Badges.md)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Status&message=Project%20Status&color=red)](https://github.com/jesperancinha/project-signer/blob/master/project-signer-templates/Status.md)
[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=ITF%20Chartizate%20Android&color=yellow)](https://github.com/JEsperancinhaOrg/itf-chartizate-android)
[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=ITF%20Chartizate%20Java&color=yellow)](https://github.com/JEsperancinhaOrg/itf-chartizate-modules/tree/master/itf-chartizate-java)
[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=ITF%20Chartizate%20API&color=yellow)](https://github.com/JEsperancinhaOrg/itf-chartizate/tree/master/itf-chartizate-api)
[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=Markdowner%20Core&color=yellow)](https://github.com/jesperancinha/markdowner/tree/master/markdowner-core)
[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=Markdowner%20Filter&color=yellow)](https://github.com/jesperancinha/markdowner/tree/master/markdowner-filter)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/linkedin-20.png "LinkedIn")](https://www.linkedin.com/in/joaoesperancinha/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/xing-20.png "Xing")](https://www.xing.com/profile/Joao_Esperancinha/cv)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/instagram-20.png "Instagram")](https://www.instagram.com/jesperancinha/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/tumblr-20.png "Tumblr")](https://jofisaes.tumblr.com/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/pinterest-20.png "Pinterest")](https://nl.pinterest.com/jesperancinha/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/quora-20.png "Quora")](https://nl.quora.com/profile/Jo%C3%A3o-Esperancinha)

## Achievements

[![Oracle Certified Professional, JEE 7 Developer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-professional-java-ee-7-application-developer-100.png "Oracle Certified Professional, JEE7 Developer")](https://www.youracclaim.com/badges/27a14e06-f591-4105-91ca-8c3215ef39a2/public_url)
[![Oracle Certified Professional, Java SE 11 Programmer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-professional-java-se-11-developer-100.png "Oracle Certified Professional, Java SE 11 Programmer")](https://www.youracclaim.com/badges/87609d8e-27c5-45c9-9e42-60a5e9283280/public_url)
[![Oracle Certified Professional, Java SE 8 Programmer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-professional-java-se-8-programmer-100.png "Oracle Certified Professional, Java SE 8 Programmer")](https://www.youracclaim.com/badges/92e036f5-4e11-4cff-9935-3e62266d2074/public_url)
[![Oracle Certified Associate, Java SE 8 Programmer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-associate-java-se-8-programmer-100.png "Oracle Certified Associate, Java SE 8 Programmer")](https://www.youracclaim.com/badges/a206436d-6fd8-4ca1-8feb-38a838446ee7/public_url)
[![Oracle Certified Associate, Java SE 7 Programmer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-associate-java-se-7-programmer-100.png "Oracle Certified Associate, Java SE 7 Programmer")](https://www.youracclaim.com/badges/f4c6cc1e-cb52-432b-904d-36d266112225/public_url)
[![Oracle Certified Junior Associate](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-foundations-associate-java-100.png "Oracle Certified Foundations Associate")](https://www.youracclaim.com/badges/6db92c1e-7bca-4856-9543-0d5ed0182794/public_url)
