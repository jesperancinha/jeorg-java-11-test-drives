# mastery-2-1 - Mastery Module 2.1.

## Exercise

In this third mastery exercise we'll look at a few important key aspects:

1. Interface Inheritance
2. Comparing with `thenComparing`
3. AccessController and Permissions
4. Marking with `markSupported`
5. `StringBuilder` vs `StringBuffer`
6. Super constructors
7. Abstraction: Interfaces vs Classes
8. Stream filters
9. Question mark in Mappings (left vs right)
10. provider() in modularity
11. `IndexOutOfBoundsException`
12. `allMatch` in stream
14. One line assignment operations
15. Method calling and inner class instantiation
16. `null` role in collection copies
17. `String`'s `isBlank`
18. Flow control ans specification of Exceptions
19. Constructor rules vs Method rules in overriding
20. Simple `File` creation with `FileWriter`
21. Overriding with generics
22. `var` in `for` loops
23. relativize of `Path`
24. Creating methods in inner anonymous classes

## Output

```bash
============
### 1. Creating wolf. Interface cannot access everything
Roar!!!
The wolf name is: The Wolf. Of course now we use down casting
============
### 2. Creating Bird. Interface cannot access everything
[Wolf{instrument='French horns', name='The Wolf'}, Bird{instrument='Flute', name='Sasha'}]
The wolf name is: The Wolf. Of course now we use down casting
The bird name is: Sasha. Of course now we use down casting
The new collection should be reordered: [Bird{instrument='Flute', name='Sasha'}, Wolf{instrument='French horns', name='The Wolf'}]
============
### 3. We will save our OST in /tmp/ost.txt.
### After running there should be just one TEST text written on that file.
[ost.txt] [ost.txt] [/tmp/ost.txt]
============
### 4. Checking how marking works with a BufferedReader
### Don't forget that readAhead is an optimization parameter
### It has no logic influence
The Reader class does not support mark false
The BufferedReader class does support mark true
Each character is represented by a different instrument of the synthesized orchestra.
For instance, the part of Billy the Bird is played by a flute, like this...
The part of Bruce the Duck is played by an oboe...
For instance, the part of Billy the Bird is played by a flute, like this...
For instance, the part of Billy the Bird is played by a flute, like this...
The part of Bruce the Duck is played by an oboe...
Louie the Cat is a clarinet. All right, he's not really a clarinet. He's just - you know, he's represented by a clarinet...
The part of the Grandfather will be played by Don Amiche.
He... what?
Can't make it? Oh. Huh.
For instance, the part of Billy the Bird is played by a flute, like this...
============
### 5. StringBuilder and StringBuffer have the same methods but their implementations are different.
### StringBuilder and StringBuffer do not have a trim() method like String does!.
...noossab a ,huh ,
...noossab a ,huh ,
...noossab a ,huh ,
...noossab a ,huh ,
============
### 6. When you develop a subclass, its constructors must know which super constructor to call
### If none is available, then the default, zero argument constructor is called
### One or more are available, then the subclass constructor must determine which constructor to use using super
### One or more constructors are implemented and none default is available, then the default is no longer available
Sasha
Flute
============
### 7. Know a few things about Interfaces
### All methods without a body are implicitly abstract and public
### public and abstract are redundant for these implicit properties
The Wolf
French horns
============
### 8. A parallel stream can change to be a sequential stream
### BaseStream.sequential() vs BaseStream.parallel
### Also in partitionBy the way to distinguish is using Boolean
Bird{instrument='Flute', name='Sasha'}
Bird{instrument='Oboe', name='Bruce'}
Bird{instrument='Flute', name='Sasha'}
Bird{instrument='Oboe', name='Bruce'}
Bird{instrument='Flute', name='Sasha'}
Bird{instrument='Oboe', name='Bruce'}
============
### 9. You do not need to know the type on the left operand of an assignment operation
### You also cannot use diamond notation. You can use question marks as placeholders
### Question marks are not allowed on the right
### On a practical note it seems to be because a question mark is a wildcard
### Wildcards do not make sense during creation.
### Diamond notation always knows that its type is defined on the left 
Map<String, List<Animal>> mapOfAnimals1 = new HashMap<String, List<Animal>>(); -> class java.util.HashMap
Map<String, List<Animal>> mapOfAnimals2= new HashMap<>();
Map<?, List<Animal>> mapOfAnimals3 = new HashMap<>(); -> class java.util.HashMap
Map<?, List<?>> mapOfAnimals4 = new HashMap<>(); -> class java.util.HashMap
Map<?,?> mapOfAnimals5 = new HashMap<>(); -> class java.util.HashMap
var mapOfAnimals6 = new HashMap<>(); -> class java.util.HashMap
var mapOfAnimals7 = new HashMap<Animal, List<Animal>>(); -> class java.util.HashMap
============
### 10. Key things to remember:
### There is no implements in module!
### provides is always followed by with
### using a service requires you to use it in the module definition
### to be able to implement a service outside the source module you need requires
### You can provide an implementation statically or with an instance
### Flute service is static
### Oboe service is an instance
Playing the flute...
Playing the oboe...
============
### 11. ArrayIndexOutOfBoundsException is not thrown by a charAt.
### IndexOutOfBoundsException is  thrown by a charAt.
### StringIndexOutOfBoundsException may be thrown by a charAt (It is implementation dependent).
If parameter of charAt surpasses the length of the String, it results in: class java.lang.StringIndexOutOfBoundsException
============
### 12. allMatch means that one doesn't match, it will return false, otherwise true
### It is prone to fail fast, given that the false condition determines when the filtering stops
### This operation depends opn how many cores your machine is running on
Wolf{instrument='French horns', name='The Wolf'}
Feline{instrument='Clarinet', name='Louis'}
Bird{instrument='Flute', name='Sasha'}
We have iterated 3 times! This is unpredictable
Has the condition matched? false
============
### 10. Double providers in modularity
Playing the flute...
Playing the better flute...
============
### 14. One liner operators and different assignments
        int a = 10; => 20
        int b = 20; => 20 
        boolean c = a == b; => false
        boolean d = a != b; => true
        int f = a = b; => 20
============
### 15. Static imports are also possible for static inner classes
var food  = new Food();
============
### 16. Copies of null values from Arrays to immutable Lists  always fail
### Copies of null values from Arrays always to Unmodifiable lists don't fail
### Unmodifiable means you have a reference that doesn't allow you to modify the list
### Although if you have the reference to the original List, then you can change it that way
### Immutable means you cannot modify the list
NullPointerException was thrown on trying to copu the array into a List
NullPointerException was thrown on trying to copu the array into an immutable list
[Wolf{instrument='French horns', name='The Wolf'}, Bird{instrument='Oboe', name='Bruce'}, null, Bird{instrument='Flute', name='Sasha'}, null, Feline{instrument='Clarinet', name='Louis'}]
[Wolf{instrument='French horns', name='The Wolf'}, Bird{instrument='Oboe', name='Bruce'}, null, Bird{instrument='Flute', name='Sasha'}, null, Feline{instrument='Clarinet', name='Louis'}]
============
### 17. Test is String is blank
blankSimple is blank? true, blankComplicated is blank? true
============
### 18. Always use control flow in detriment to Exceptions
============
### 19. Constructor exception implementation rules are inversely proportional to method return parameter implementation rules
The Grandfather
The Grandfather
House
============
### 20. FileWriter always creates a file
Check your java.io.FileWriter@23e028a9 folder
============
### 21. Golden rule of Overriding methods is that the return value is always of a sub-class or the same as of the overridden one
[Wolf{instrument='French horns', name='The Wolf'}, Feline{instrument='Clarinet', name='Louis'}, Bird{instrument='Flute', name='Sasha'}, Bird{instrument='Flute', name='Sasha'}, Bird{instrument='Oboe', name='Bruce'}, Human{instrument='bassoon', name='The Grandfather'}]
[Bird{instrument='Flute', name='Sasha'}, Wolf{instrument='French horns', name='The Wolf'}, Bird{instrument='Oboe', name='Bruce'}, Feline{instrument='Clarinet', name='Louis'}, Human{instrument='bassoon', name='The Grandfather'}]
[Bird{instrument='Flute', name='Sasha'}, Wolf{instrument='French horns', name='The Wolf'}, Bird{instrument='Oboe', name='Bruce'}, Feline{instrument='Clarinet', name='Louis'}, Human{instrument='bassoon', name='The Grandfather'}, Bird{instrument='Oboe', name='Bruce'}]
============
### 22. var can be used in for just like int
------
0 1 2 3 4 5 6 7 8 9 ------
0 1 2 3 4 5 6 7 8 9 ------
============
### 23. relativize will fail if paths have a different sort
Process failed for p1=wolf and p2=/tmp/wolf
Process didn't fail for p1=wolf and p2=tmp and the result for p2.relativize(p1) is: ../wolf
Process didn't fail for p1=/tmp/wolf/2 and p2=/tmp/wolf and the result for p2.relativize(p1) is: 2
============
### 24. If we create an anonymous class and therein we crate methods,those methods are onle reachable via reflection or inside the instance itself
You did this? You just cannot reach this method without reflection and so The Wolf gets no apples! 
Process finished with exit code 0
```

## References

- [Peter and The Wolf Lyrics](https://www.azlyrics.com/lyrics/weirdalyankovic/peterandthewolf.html)
- [Scientific Classification of Wolves](https://wolf.org/wolf-info/basic-wolf-info/types-of-wolves/)
- [Peter and the Wolf](https://en.wikipedia.org/wiki/Peter_and_the_Wolf)
- [Build your own Command Line with ANSI escape codes](https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html#256-colors)

<div align="center">
      <a href="https://www.youtube.com/watch?v=2EPl8zAsq8A">
     <img 
          src="https://img.youtube.com/vi/2EPl8zAsq8A/0.jpg" 
          style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=DGHGIO_4jeQ">
     <img 
          src="https://img.youtube.com/vi/DGHGIO_4jeQ/0.jpg" 
          style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=-P8Jh2SnMrU">
     <img 
          src="https://img.youtube.com/vi/-P8Jh2SnMrU/0.jpg" 
          style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=diJeT5o0Ji8">
     <img 
          src="https://img.youtube.com/vi/diJeT5o0Ji8/0.jpg" 
          style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=Va8Uz6MoKLg">
         <img 
              src="https://img.youtube.com/vi/Va8Uz6MoKLg/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=jlFPKXaHPSU">
         <img 
              src="https://img.youtube.com/vi/jlFPKXaHPSU/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=bsfTzpFXNuI">
         <img 
              src="https://img.youtube.com/vi/bsfTzpFXNuI/0.jpg" 
              style="width:10%;">
      </a>
</div>

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
