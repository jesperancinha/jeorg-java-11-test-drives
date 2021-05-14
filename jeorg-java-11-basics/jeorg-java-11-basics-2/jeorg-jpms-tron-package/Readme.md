# jpms-tron-package

## Exercise

In this exercise we'll have a look at different command line possibilities provided by the jdk. We'll use TRON as a reference. We'll explore modularity specifically. The commands we'll explore are as follows:

```mysql based
java ...
javac ...
jar ...
jmods ...
jdeps ...
```

## How to

-   We compile our module

```bash
cd java-11-basics-2/jpms-tron-package
cd src/main
javac --module-source-path . -m tron -d ./out
java --module-path out --module tron/org.jesperancinha.java11.tron.TronRunner
mkdir jars
jar --create --file ./jars/tron.jar --main-class org.jesperancinha.java11.tron.TronRunner -C ./out/tron .
java --module-path jars --module tron/org.jesperancinha.java11.tron.TronRunner
```

-   We run our module

```bash
java --module-path jars --module tron/org.jesperancinha.java11.tron.TronRunner
```

-   We run our module showing resolution

```bash
java --module-path jars --module tron/org.jesperancinha.java11.tron.TronRunner --show-module-resolution
```

-   To create a mod file

```bash
mkdir mods
cp resources/resource.txt out/tron
jmod create --class-path out/tron/ mods/tron.mod
```

## Output

-   Program run

```bash
java --module-path out --module tron/org.jesperancinha.java11.tron.TronRunner
ACCESS CODE 6
PASSWORD SERIES PS 17
REINDEER FLOTILLA
YOU SHOULDN'T HAVE COME BACK FLYNN
CODE SERIES LSU-123
...ACTIVATE
THAT ISN'T GOING TO DO YOU ANY
GOOD, FLYNN. I'M AFRAID YOU...
MAG IOX
MODE: SCAN
TARGETING
SERVO PWR
PWR CPLING
LOGIC BYPS
MCP CNTRL
ACTIVE INPT
SERVO CNTR
GRID MATRIX
FRG MNTR
KCW CNTRL
GDNCE INPT
STRGE CLRD
THERMO TRGT
THERMO TRGT
MODE: LOCK
TARGET
LOCK ON
ACTIVATE
```

-   jdeps

```bash
jdeps jars/tron.jar 
tron
 [file:///Users/jofisaes/dev/src/jofisaes/java-test-drives/java-11-basics-2/jpms-tron-package/src/main/jars/tron.jar]
   requires mandated java.base (@15-ea)
tron -> java.base
   org.jesperancinha.java11.tron                       -> java.io                                            java.base
   org.jesperancinha.java11.tron                       -> java.lang                                          java.base
   org.jesperancinha.java11.tron                       -> java.lang.invoke                                   java.base
   org.jesperancinha.java11.tron                       -> java.util                                          java.base
```

```bash
jdeps -verbose jars/tron.jar
tron
 [file:///Users/jofisaes/dev/src/jofisaes/java-test-drives/java-11-basics-2/jpms-tron-package/src/main/jars/tron.jar]
   requires mandated java.base (@15-ea)
tron -> java.base
   org.jesperancinha.java11.tron.TronRunner            -> java.lang.Class                                    java.base
   org.jesperancinha.java11.tron.TronRunner            -> java.lang.Object                                   java.base
   org.jesperancinha.java11.tron.TronRunner            -> java.lang.String                                   java.base
   org.jesperancinha.java11.tron.TronRunner            -> java.util.Objects                                  java.base
   org.jesperancinha.java11.tron.TronRunner            -> java.util.Optional                                 java.base
   org.jesperancinha.java11.tron.TronRunner            -> java.util.ServiceLoader                            java.base
   org.jesperancinha.java11.tron.TronRunner            -> org.jesperancinha.java11.tron.TronService           tron
   org.jesperancinha.java11.tron.TronService           -> java.lang.InterruptedException                     java.base
   org.jesperancinha.java11.tron.TronService           -> java.lang.Object                                   java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.io.InputStream                                java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.io.PrintStream                                java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.lang.InterruptedException                     java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.lang.Object                                   java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.lang.String                                   java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.lang.System                                   java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.lang.Thread                                   java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.lang.invoke.CallSite                          java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.lang.invoke.LambdaMetafactory                 java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.lang.invoke.MethodHandle                      java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.lang.invoke.MethodHandles                     java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.lang.invoke.MethodHandles$Lookup              java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.lang.invoke.MethodType                        java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> java.util.Scanner                                  java.base
   org.jesperancinha.java11.tron.TronServiceImpl       -> org.jesperancinha.java11.tron.TronService           tron
```

-   jmod describe

```bash
jmod describe mods/tron.mod 
tron
exports org.jesperancinha.java11.tron
requires java.base mandated
uses org.jesperancinha.java11.tron.TronService
provides org.jesperancinha.java11.tron.TronService with org.jesperancinha.java11.tron.TronServiceImpl
```

## How NOT to

```bash
java --class-path 'jars/*' org.jesperancinha.java11.tron.TronRunner
```

NOTE: Although we can run jars in a non-modular way, come things like ServiceLoader, won't function anymore.

## References

-   [Tron](https://www.imdb.com/title/tt0084827/)
-   [Java Modules Cheat Sheet](https://nipafx.dev/build-modules/)
-   [How to print color in console using System.out.println?](https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println)
-   [jmod](https://docs.oracle.com/javase/9/tools/jmod.htm)
-   [Tron Wiki](https://en.wikipedia.org/wiki/Tron)
-   [Herong Yang's jmod tool page](http://www.herongyang.com/Java-Tools/jmod-The-JMOD-File-Tool.html)
-   [khmarbaisere/jdk9-jlink-jmod-example](https://github.com/khmarbaise/jdk9-jlink-jmod-example/blob/master/jmod-create.sh)
-   [Ant Apache Mod](https://ant.apache.org/manual/Tasks/jmod.html)
-   [Coloring the Console by vratiu](https://gist.github.com/vratiu/9780109)

<div align="center">
      <a href="https://www.youtube.com/watch?v=fFgayA0YAfk">
         <img 
              src="https://img.youtube.com/vi/fFgayA0YAfk/0.jpg" 
              style="width:10%;">
      </a>
</div>

## About me 👨🏽‍💻🚀🏳️‍🌈

[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/JEOrgLogo-20.png "João Esperancinha Homepage")](http://joaofilipesabinoesperancinha.nl)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/medium-20.png "Medium")](https://medium.com/@jofisaes)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/credly-20.png "Credly")](https://www.credly.com/users/joao-esperancinha)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Homepage&message=joaofilipesabinoesperancinha.nl&color=6495ED "João Esperancinha Homepage")](https://joaofilipesabinoesperancinha.nl/)
[![GitHub followers](https://img.shields.io/github/followers/jesperancinha.svg?label=jesperancinha&style=social "GitHub")](https://github.com/jesperancinha)
[![Twitter Follow](https://img.shields.io/twitter/follow/joaofse?label=João%20Esperancinha&style=social "Twitter")](https://twitter.com/joaofse)
[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=JEsperancinhaOrg&color=yellow "jesperancinha.org dependencies")](https://github.com/JEsperancinhaOrg)   
[![Generic badge](https://img.shields.io/static/v1.svg?label=Articles&message=Across%20The%20Web&color=purple)](https://github.com/jesperancinha/project-signer/blob/master/project-signer-templates/Articles.md)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Webapp&message=Image%20Train%20Filters&color=6495ED)](http://itf.joaofilipesabinoesperancinha.nl/)
[![Generic badge](https://img.shields.io/static/v1.svg?label=All%20Badges&message=Badges&color=red "All badges")](https://joaofilipesabinoesperancinha.nl/badges)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Status&message=Project%20Status&color=red "Project statuses")](https://github.com/jesperancinha/project-signer/blob/master/project-signer-quality/Info.md)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/coursera-20.png "Coursera")](https://www.coursera.org/user/da3ff90299fa9297e283ee8e65364ffb)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/google-apps-20.png "Google Apps")](https://play.google.com/store/apps/developer?id=Joao+Filipe+Sabino+Esperancinha)   
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/sonatype-20.png "Sonatype Search Repos")](https://search.maven.org/search?q=org.jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/docker-20.png "Docker Images")](https://hub.docker.com/u/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/stack-overflow-20.png)](https://stackoverflow.com/users/3702839/joao-esperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/reddit-20.png "Reddit")](https://www.reddit.com/user/jesperancinha/)
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
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/hacker-news-20.png "Hacker News")](https://news.ycombinator.com/user?id=jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/infoq-20.png "InfoQ")](https://www.infoq.com/profile/Joao-Esperancinha.2/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/linkedin-20.png "LinkedIn")](https://www.linkedin.com/in/joaoesperancinha/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/xing-20.png "Xing")](https://www.xing.com/profile/Joao_Esperancinha/cv)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/tumblr-20.png "Tumblr")](https://jofisaes.tumblr.com/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/pinterest-20.png "Pinterest")](https://nl.pinterest.com/jesperancinha/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/quora-20.png "Quora")](https://nl.quora.com/profile/Jo%C3%A3o-Esperancinha)

## Achievements

[![Oracle Certified Professional, JEE 7 Developer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-professional-java-ee-7-application-developer-100.png "Oracle Certified Professional, JEE7 Developer")](https://www.credly.com/badges/27a14e06-f591-4105-91ca-8c3215ef39a2)
[![Oracle Certified Professional, Java SE 11 Programmer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-professional-java-se-11-developer-100.png "Oracle Certified Professional, Java SE 11 Programmer")](https://www.credly.com/badges/87609d8e-27c5-45c9-9e42-60a5e9283280)
[![Oracle Certified Professional, Java SE 8 Programmer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-professional-java-se-8-programmer-100.png "Oracle Certified Professional, Java SE 8 Programmer")](https://www.credly.com/badges/92e036f5-4e11-4cff-9935-3e62266d2074)
[![Oracle Certified Associate, Java SE 8 Programmer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-associate-java-se-8-programmer-100.png "Oracle Certified Associate, Java SE 8 Programmer")](https://www.credly.com/badges/a206436d-6fd8-4ca1-8feb-38a838446ee7)
[![Oracle Certified Associate, Java SE 7 Programmer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-associate-java-se-7-programmer-100.png "Oracle Certified Associate, Java SE 7 Programmer")](https://www.credly.com/badges/f4c6cc1e-cb52-432b-904d-36d266112225)
[![Oracle Certified Junior Associate](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-foundations-associate-java-100.png "Oracle Certified Foundations Associate")](https://www.credly.com/badges/6db92c1e-7bca-4856-9543-0d5ed0182794)
