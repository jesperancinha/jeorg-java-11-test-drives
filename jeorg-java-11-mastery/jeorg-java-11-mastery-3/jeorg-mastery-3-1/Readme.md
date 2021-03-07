# mastery-3-1 - Mastery Module 3.1.

In this fifth master module on route to the Java 11 certification, we are going to use data from some of the most amazing singers who sing in dutch. Regardless of my musical preferences and of yours, it is undeniable that it is through their music that I ended up learning this amazing language. I
sang these songs from my heart and little by little my dutch speaking goal became a reality. It should be no surprise that my story would end up being a part of my study materials of some sort and this is their debut.

## Preparation

If you are on a Unix based system or if you are running any sort of BSD, MAC-OS, then you are fine using filr [prepare.sh](prepare.sh). If you are using windows, then this will maybe work. I seldom use windows and not always I can test my work there. The point is that you need to have a `/tmp`
folder at this point.

```bash
./prepare.sh
```

## Exercise

1. `Integer` Mathematical Bases `parseInt`
2. Labels and `break` in loops
3. `Files.newDirectoryStream` Listings and the `glob` pattern
4. `@Override` in `equals`
5. How `null` is interpreted in overloading
6. How `getRoot()` exhibits the root `Path`
7. Type of elements in a diamond notation declared `ArrayList` assigned to `var`
8. Initialization of invisible `primitive` members
9. Declaring a `String` array.
10. Passing variables by value and not returning in `Stream`
11. Thread safe `Object` s
12. `Stream` count types
13. How to guarantee Immutability - [Java Security Guidelines](https://www.oracle.com/java/technologies/javase/seccodeguide.html)
14. Accessing `static` `interface` methods
15. `java.lang.OutOfMemoryError` and `Error` classes
16. Accessibility `@Override`

## Output

```text
================== Master Module mastery-3-1 ==================
--- 1. `Integer` Mathematical Bases `parseInt`
============
According to NPO(https://www.nporadio2.nl/song/3230/grote-mannen-worden-klein),  Diggy Dex single, "Grote Mannen Worden Klein" was releases in 2014
Let's see different ways to visualize this:
*** Integer.parseInt(2014)
The single was "Grote Mannen Worden Klein" was released, in Decimal, in the year 2014
*** Integer.parseInt(11111011110, 2)
The single was "Grote Mannen Worden Klein" was released, in Binary, in the year 2014
References
1. https://www.nporadio2.nl/song/3230/grote-mannen-worden-klein
2. https://www.last.fm/music/Diggy+Dex/_/Grote+Mannen+Worden+Klein
3. https://www.metrolyrics.com/grote-mannen-worden-klein-lyrics-diggy-dex.html
--- 2. Labels and `break` in loops
============
Case: You are a fan of "De Jeugd van Tegenwoordig" and you just keep buying their records.
You have a shelf with three rows where your records are organized by most favourite too less favourite album.
However, you bought a bunch of repeated records and because of your mood wings,
You don't even know anymore which one is your favourite and which one is not.
So now you have 2 records on the top shelf, 4 on the second one and 10 at the bottom!
But "De Jeugd van Tegenwoordig" only edited 8 albums!
We will use old fashioned for loops to figure out this mess.
On our example we just want to check how many iteration our for loops will perform.
Our criteria is:
1. For loop will break once a repetition is found
2. The Atomic Integer counts the number of repetitions found
3. Keep in mind that there might be more repetitions in one particular iteration, but those are not counted
4. Remember that the for loop will break and will skip the rest of the albums on that iteration
5. No repetitions will be counted on the same shelf
6. I know its difficult but that's the point 😊
Your goal is to guess how many iterations will the atomic number count
These are your randomized shelves:
Shelf 1 -> [Parels voor de zwijnen, Luek]
Shelf 2 -> [Luek, De Machine, De lachende derde, Manon]
Shelf 3 -> [De lachende derde, X - Viering van het super decennium, Luek, Luek, De Machine, Anders (Different), Anders (Different), Manon, X - Viering van het super decennium, Luek]
Please guess how many repetitions will this method find ->
5
You made it champ!! There are indeed 5 repetitions found! 🥇
1. https://nl.wikipedia.org/wiki/De_Jeugd_van_Tegenwoordig_(rapgroep)
2. https://www.youtube.com/watch?v=cNMXSKfWfLQ
--- 3. `Files.newDirectoryStream` Listings and the `glob` pattern
============
Case: We saved a part of Abel's Lyrics somewhere, for our social study work, but we don't know where the file is.
We took the lyrics from https://www.musixmatch.com/lyrics/Abel/Onderweg,
but now we have no access to the internet and we have to deliver our work in 2 hours! Help!
In this exercise we will find Abel's lyrics in our tmp folder. We hope the system hasn't deleted it yet...
We will try to find our file in /tmp. Remember to run ./prepare.sh. Check Readme.md for more details:
If we use a glob filter of *.{gif,jpeg,jpg,bmp} we get:
No file found!
This was the wrong extension! If we use a glob filter of *.{txt} we get:
/tmp/abel.onderweg.txt
/tmp/.ebonwgal.txt
/tmp/ebal.rwegonde.txt
But this may lead to a lot of them! If we use a glob filter of [ebal][ebal][ebal][ebal].[rwegonde][rwegonde][rwegonde][rwegonde][rwegonde][rwegonde][rwegonde][rwegonde].{txt} we get:
/tmp/abel.onderweg.txt
/tmp/ebal.rwegonde.txt
But this may still lead to a lot of them! If we use a glob filter of abel.onderweg.? we get:
/tmp/abel.onderweg.t
But this is not even our file!! If we use a glob filter of abel.onderweg.{txt} we get:
From: https://www.musixmatch.com/lyrics/Abel/Onderweg

Ik doe de deur dicht
Straten lijken te huilen
Wolken lijken te vluchten
Ik stap de bus in
Mensen lijken te kijken
Maar ik wil ze ontwijken
Voordat ze mij zien
Het is al lang verleden tijd
Dat je mijn verjaardag niet vergat
Je onvoorwaardelijk koos voor mij

A study for the music styles at the end of the 90's.
/tmp/abel.onderweg.txt
We finally found it!
--- 4. `@Override` in `equals`
============
Case: We want to buy a record of Maaike Ouboter
We made a selection of an article we really want to buy.
Customer -> Good morning, do you have Maaike Ouboter album "Vanaf nu is het van jou?"
Clerk -> Yes I do, let me check...
Clerk -> So that album was published in 2018, by Sony Music Entertainment, one moment...
Clerk -> We seem to have two of those, do you know exactly the one you want?
[ShopItem{barCode='2742984738947894790942370470', name='Vanaf nu is het van jou', year='2018', publisher='Sony Music Entertainment', specialEdition='Normal'}, ShopItem{barCode='2394720347320943290482084328', name='Vanaf nu is het van jou', year='2018', publisher='Sony Music Entertainment', specialEdition='Special'}]
Customer -> Yes, I want the special super special please
Clerk -> Yes, let me check if we have it... false. We don't sorry. Do you have another selection?
Customer -> Yes, I want the special edition please
Clerk -> Yes, let me check if we have it... true. Yes! We do! Great! 😉
Important take out here is that `@Override` must be done with `Object` and equals can of course be overloaded.
--- 5. How `null` is interpreted in overloading
============
Case: We receive different shop items.
Now we want to check their state.
In our shop there are many automated ways of checking the state of items, but we generally just call the `checkItem` procedure.
We receive a copy of the album "De stilte voorbij" by pop-band "Abel", but the store manager has found different ways to check it's authenticity.
Let's see how he does it:
This is our record. It's a vinyl! ShopItem{barCode='2742984738947894790942370470', name='De stilte voorbij', year='2000', publisher='[PIAS] Holland', specialEdition='Normal'}
We'll call `checkItem` in different ways!
Shop.checkItem(record);
Object ShopItem{barCode='2742984738947894790942370470', name='De stilte voorbij', year='2000', publisher='[PIAS] Holland', specialEdition='Normal'} is cleared to be sold as a VinylRecord!
Shop.checkItem((Record) record);
Object ShopItem{barCode='2742984738947894790942370470', name='De stilte voorbij', year='2000', publisher='[PIAS] Holland', specialEdition='Normal'} is cleared to be sold as a Record!
Shop.checkItem((ShopItem) record);
Object ShopItem{barCode='2742984738947894790942370470', name='De stilte voorbij', year='2000', publisher='[PIAS] Holland', specialEdition='Normal'} is cleared to be sold as a ShopItem!
Finally we make a machine a start the `checkItem` procedure without a record
Object null is cleared to be sold as a VinylRecord!
Never forget that a call with null will search for the most specific overloading!
--- 6. How `getRoot()` exhibits the root `Path`
============
Case: We placed our files somewhere, but how do we call the root?
Path.of("/tmp").getRoot()
/
That's it! Slashes are part of root, not of individual paths
--- 7. Type of elements in a diamond notation declared `ArrayList` assigned to `var`
============
Case: We've created a list of elements but didn't gave it a type with diamond notation!
We can't sell these at our shop this way, but what is their type?
 var itemsWithNoName = new ArrayList<>();
        itemsWithNoName.add("Diggy Dex Ft. Eva De Roovere");
        itemsWithNoName.add("Slaap Lekker (Fantastig Toch)");
        itemsWithNoName.add(2009);
        itemsWithNoName.add("Hip Hop");
        Object singers = itemsWithNoName.get(0);

This is the type of this list, class java.util.ArrayList
And these are the types of its contents, class java.util.ArrayList
We can only list the singers, Diggy Dex Ft. Eva De Roovere, `Object`'s
The point is, just like in any List, the type is important when retrieving the items.
Although diamond notation is handy in the old syntax, with the use of `var` it becomes rather obsolete and leads to confusing code.
--- 8. Initialization of invisible `primitive` members
============
Case: Our shop has grown a lot and we need a brand new bookcase!
Let's create one!
This RecordCase has a capacity of 50 records
This RecordCase has a capacity of 100 records
Current year is 0
Case details -> Case{capacity=100}
Current year is 2020
Take notice on the member calling before creation.
Which methods are actually called and why?
Generally speaking, only after `super`, are the instance variable members initialized.
--- 9. Declaring a `String` array.
============
We'll just list the band "De Jeugd van Tegenwoordig"
final String[]  band = {"Willie Wartaal", "Vieze Fur", "Faberyayo", "Bas Bron"};
This is the band: Willie Wartaal,Vieze Fur,Faberyayo,Bas Bron
--- 10. Passing variables by value and not returning in `Stream`
============
Let's create a list of the band "De Jeugd van Tegenwoordig"
The array is Willie Wartaal
This is the band: [Willie Wartaal, Vieze Fur, Faberyayo, Bas Bron]
This is the band  list : [Willie Wartaal, Vieze Fur, Faberyayo, Bas Bron]
The band didn't change! [Willie Wartaal, Vieze Fur, Faberyayo, Bas Bron]
We finally got all the names!! 😉 [Willie Wartaal(Olivier Mitshel Locadia), Vieze Fur(Alfred Tratlehner), Faberyayo(Pepijn Lanen), Bas Bron(Bas Bron)]
For loops do not affect elements directly. They may only affect their contents...
--- 11. Thread safe `Object` s
============
Please wait while concert goers go inside the arenas...
Live concert has 147 goers
Safe live concert has 50 goers
Unregulated live concert has 148 goers
Virtual live concert has 50 goers
All thread safe concert arenas should have only 50 concert goes.
We can also say that thread safe object allow changes to happen but in a controlled manner where one thread does not influece the others result.
In our case, more concert goers got in the  non thread-safe spaces.
--- 12. `Stream` count types
============
Case: We have the complete collection of `Diggy Dex` records.
We will now count them
Diggy Dex has published 6 albums!
The type of this count is long.
From long: 6
Stream counts are always long.
--- 13. How to guarantee Immutability - [Java Security Guidelines](https://www.oracle.com/java/technologies/javase/seccodeguide.html)
============
Case: Someone is trying to get into Trix in Antwerp to watch a Gers Pardoel show
However, the show on the ticket is from a missed show in Villa Thallia in Rotterdam which took  place 8 days ago.
Can we mutate any of the three tickets we have for the past show?
Current Tickets
Unsafe Ticket -> UnsafeTicket{date=Sun Nov 09 19:30:00 CET 3919, concert='Villa Thalia - Rotterdam', artist='Gers Pardoel'}
Final Ticket -> FinalTicket{date=Sun Nov 09 19:30:00 CET 3919, concert='Villa Thalia - Rotterdam', artist='Gers Pardoel'}
Private Ticket -> PrivateTicket{date=Sun Nov 09 19:30:00 CET 3919, concert='Villa Thalia - Rotterdam', artist='Gers Pardoel'}
New Tickets
Unsafe Ticket -> UnsafeTicket{date=Mon Nov 17 19:30:00 CET 3919, concert='Villa Thalia - Rotterdam', artist='Gers Pardoel'}
Final Ticket -> FinalTicket{date=Sun Nov 09 19:30:00 CET 3919, concert='Villa Thalia - Rotterdam', artist='Gers Pardoel'}
Private Ticket -> PrivateTicket{date=Sun Nov 09 19:30:00 CET 3919, concert='Villa Thalia - Rotterdam', artist='Gers Pardoel'}
These tickets actually cannot be changed to anything convincing.
However, one of the is not entirely immutable. We were able to change the date though.
Both the Final Ticket and Private Ticket are immutable. This is because they cannot be changed in any normal execution flow.
--- 14. Accessing `static` `interface` methods
============
Case: We received a record case and want to see its descriptions.
Do we need its instance?.
This RecordCase has a capacity of 50 records
This RecordCase has a capacity of 100 records
Current year is 0
This is possible: recordCase.describeMe();
I'm a record case class -> org.jesperancinha.java11.mastery3dot1.furniture.RecordCase
This is possible: ((Case)recordCase).describeMe();
I'm a case class -> org.jesperancinha.java11.mastery3dot1.furniture.Case
This is not possible: ((Container)recordCase).describeMe();
This is possible: Container.describeMe();
I'm a container interface -> org.jesperancinha.java11.mastery3dot1.furniture.Container
The point is that interface static methods cannot be called via an instance.
There is hardly any reason to call a static method from an instance anyways.
They can though, but only if they belong to ordinary classes and not interfaces.
--- 15. `java.lang.OutOfMemoryError` and `Error` classes
============
Case: A new top 20 NL Hits CD is Out! And everyone wants to buy it!
What will happen if too many people buy it?
Please wait...
...
cd267005-ce5f-4f52-9a26-00d049cc7ce5
This is the expected error java.lang.OutOfMemoryError: Java heap space
OutOfMemory is always an Error.
We can catch it!
--- 16. Accessibility `@Override`
============
Case: We hve different versions of `Verdronken Vlinder`.
How many ways can we get them?
The original version of `Verdronken vlinder` came about in 1967 as a B-Side recording of Boudewijn de Groot's single `Onder ons`
In this case you can just call the public method. Note that the abstraction is package protected.
This means that it is the strictest next to `private`
So we can implement it with `protected` and `public` only.
Maaike Ouboter sang a cover version of `Verdronken Vlinder in dutch TV show `De Dereld Draait Door`
🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄
Hope you enjoyed this mastery into Java 11 with a dutch flavour to it.
Please keep coming back as I'll be creating more mastery modules.
Thank you!
🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄

Process finished with exit code 0
```

## References

- [Ode aan Boudewijn: Maaike Ouboter - Verdronken Vlinder - 17-1-2014](https://www.bnnvara.nl/dewerelddraaitdoor/videos/257725)
- [Verdronken vlinder - Wikipedia NL](https://nl.wikipedia.org/wiki/Verdronken_vlinder)
- [100% NL TOP 20](https://www.100p.nl/muziek/charts/100-nl-top-20)
- [Vinyl Record Sizes and Speeds – What does 33 – 45- 78 RPM mean?](https://blog.electrohome.com/vinyl-record-speeds-33-45-78-mean/)
- [Maaike Ouboter](https://nl.wikipedia.org/wiki/Maaike_Ouboter)
- [Musixmatch - Abel, Onderweg, Lyrics](https://www.musixmatch.com/lyrics/Abel/Onderweg)
- [Glob pattern](https://en.wikipedia.org/wiki/Glob_(programming))
- [De Jeugd van Tegenwoordig - Wikipedia NL](https://nl.wikipedia.org/wiki/De_Jeugd_van_Tegenwoordig_(rapgroep))
- [Diggy Dex - Wikipedia NL](https://nl.wikipedia.org/wiki/Diggy_Dex)
- [Jan Willem Roy - Wikipedia NL](https://nl.wikipedia.org/wiki/JW_Roy)

<div align="center">
      <a href="https://www.youtube.com/watch?v=bY-F4sCQz1E">
         <img 
              src="https://img.youtube.com/vi/bY-F4sCQz1E/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=d3Bbu2H7x_s">
         <img 
              src="https://img.youtube.com/vi/d3Bbu2H7x_s/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=-WNo6YdN8u0">
         <img 
              src="https://img.youtube.com/vi/-WNo6YdN8u0/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=T6YE5h2Xtow">
         <img 
              src="https://img.youtube.com/vi/T6YE5h2Xtow/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=cNMXSKfWfLQ">
         <img 
              src="https://img.youtube.com/vi/cNMXSKfWfLQ/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=MZRw9NiVUuM">
         <img 
              src="https://img.youtube.com/vi/MZRw9NiVUuM/0.jpg" 
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
