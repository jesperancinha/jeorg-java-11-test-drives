# localization-mcgruber

## Exercise

We are looking at the different types of date and time formats. To make it fun, we will present [MacGruber](https://en.wikipedia.org/wiki/MacGruber) 's [film](https://www.imdb.com/title/tt1470023/) timeline in different formats.

## Output

```text
Note that 'e' is not accepted in SimpledDateFormat resulting in exception
-  Illegal pattern character 'e'
-- //  --
--- We start out with MacGruber's birth date ---
Format: h s y d m
Result: 12 0 1963 17 0
Format: hh ss yy dd mmm
Result: 12 00 63 17 000
Format: hhh sss yyy ddd mmmm
Result: 012 000 1963 017 0000
Format: hhhh ssss yyyy dddd mmmmm
Result: 0012 0000 1963 0017 00000
Format: hhhhhh sssss yyyyy ddddd mmmmmmmmm
Result: 000012 00000 01963 00017 000000000
Format: z H S D M
Result: CET 0 0 76 3
Format: zz HH SS DD MM
Result: CET 00 00 76 03
Format: zzz HHH SSS DDD MMM
Result: CET 000 000 076 Mar
Format: zzzz HHHH SSSS DDDD MMMM
Result: Central European Standard Time 0000 0000 0076 March
Format: zzzzz HHHHHH SSSSSSSS DDDDDDDD MMMMMMMMMM
Result: Central European Standard Time 000000 00000000 00000076 March
--- // ---
--- We now find more interesting dates---
1.  MacGruber was probably born more exactly on the day 76 of year 1963 on month March(03) which the day was 17 on a Sunday around 10:15:30.999, CET
2.  Casey Janine Fitzpatrick was probably born more exactly on the April and that was month 4 of year 1963 and it was day 24 of that month, which was also day 114 of that year and so the birth time was at 10 and 15 minutes with the chronometers marking 30 seconds and 999 milliseconds, CET.
3.  Casey Janine Fitzpatrick died on (notice the daylight savings change): 1999-07-04 at 11:15:30.000999 CEST
4.  MacGruber gets his passport): issued on the: 20010526111530999 Central European Summer Time

Process finished with exit code 0
```

## References

-   [The Movie Timeline - MacGruber](http://www.themovietimeline.com/film8353)
-   [SimpleDateFormat](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html)
-   [DateTimeFormatter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html)
-   [Making life saving inventions out of household materials](https://www.youtube.com/watch?v=jsWs5Kd-qD8)

<div align="center">
      <a href="https://www.youtube.com/watch?v=xQHHHBkigDY">
         <img 
              src="https://img.youtube.com/vi/xQHHHBkigDY/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=jsWs5Kd-qD8">
         <img 
              src="https://img.youtube.com/vi/jsWs5Kd-qD8/0.jpg" 
              style="width:10%;">
      </a>
</div>

## About me ?????????????????????????????????

[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/JEOrgLogo-20.png "Jo??o Esperancinha Homepage")](http://joaofilipesabinoesperancinha.nl)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/medium-20.png "Medium")](https://medium.com/@jofisaes)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/credly-20.png "Credly")](https://www.credly.com/users/joao-esperancinha)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Homepage&message=joaofilipesabinoesperancinha.nl&color=6495ED "Jo??o Esperancinha Homepage")](https://joaofilipesabinoesperancinha.nl/)
[![GitHub followers](https://img.shields.io/github/followers/jesperancinha.svg?label=jesperancinha&style=social "GitHub")](https://github.com/jesperancinha)
[![Twitter Follow](https://img.shields.io/twitter/follow/joaofse?label=Jo??o%20Esperancinha&style=social "Twitter")](https://twitter.com/joaofse)
[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=JEsperancinhaOrg&color=yellow "jesperancinha.org dependencies")](https://github.com/JEsperancinhaOrg)   
[![Generic badge](https://img.shields.io/static/v1.svg?label=Articles&message=Across%20The%20Web&color=purple)](https://github.com/jesperancinha/project-signer/blob/master/project-signer-templates/Articles.md)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Webapp&message=Image%20Train%20Filters&color=6495ED)](http://itf.joaofilipesabinoesperancinha.nl/)
[![Generic badge](https://img.shields.io/static/v1.svg?label=All%20Badges&message=Badges&color=red "All badges")](https://joaofilipesabinoesperancinha.nl/badges)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Status&message=Project%20Status&color=red "Project statuses")](https://github.com/jesperancinha/project-signer/blob/master/project-signer-quality/Build.md)
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

[![VMware Spring Professional 2021](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/vmware-spring-professional-2021.png "VMware Spring Professional 2021")](https://www.credly.com/badges/762fa7a4-9cf4-417d-bd29-7e072d74cdb7)
[![Oracle Certified Professional, JEE 7 Developer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-professional-java-ee-7-application-developer-100.png "Oracle Certified Professional, JEE7 Developer")](https://www.credly.com/badges/27a14e06-f591-4105-91ca-8c3215ef39a2)
[![Oracle Certified Professional, Java SE 11 Programmer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/oracle-certified-professional-java-se-11-developer-100.png "Oracle Certified Professional, Java SE 11 Programmer")](https://www.credly.com/badges/87609d8e-27c5-45c9-9e42-60a5e9283280)
[![IBM Cybersecurity Analyst Professional](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/ibm-cybersecurity-analyst-professional-certificate-100.png "IBM Cybersecurity Analyst Professional")](https://www.credly.com/badges/ad1f4abe-3dfa-4a8c-b3c7-bae4669ad8ce)
[![Certified Advanced JavaScript Developer](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/cancanit-badge-1462-100.png "Certified Advanced JavaScript Developer")](https://cancanit.com/certified/1462/)
[![Certified Neo4j Professional](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/professional_neo4j_developer-100.png "Certified Neo4j Professional")](https://graphacademy.neo4j.com/certificates/c279afd7c3988bd727f8b3acb44b87f7504f940aac952495ff827dbfcac024fb.pdf)
[![Deep Learning](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/badges/deep-learning-100.png "Deep Learning")](https://www.credly.com/badges/8d27e38c-869d-4815-8df3-13762c642d64)
