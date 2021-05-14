# eh0-catching-crows

## Exercise

In this exercise we will try to catch Crow exceptions and understand how the catch chains work. We will also have a look at how the auto closeable interface(s) work and the order all possible blocks are executed. Our data is inspired by dutch crows (known as kraaien in dutch 🇳🇱), and a hypothetical case of walking down the Museum Quarter in Amsterdam. We are scientists walking around in this are close to the [Rijksmuseum](https://www.youtube.com/user/RijksmuseumAmsterdam). We need to catch some crows to understand how they are doing healthwise and study their behaviour.

## Output

```text
org.jesperancinha.java11.catching.crows.CrowException: This crow is healty!
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.catchCrow(CatchingCrowsRunner.java:40)
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.main(CatchingCrowsRunner.java:12)
org.jesperancinha.java11.catching.crows.CrowException: This crow is healty!
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.catchCrow(CatchingCrowsRunner.java:40)
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.main(CatchingCrowsRunner.java:12)
org.jesperancinha.java11.catching.crows.CrowException: This crow is healty!
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.catchCrow(CatchingCrowsRunner.java:40)
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.main(CatchingCrowsRunner.java:12)
org.jesperancinha.java11.catching.crows.SuperSickCrowExcetion: This crow needs to go to the emergency room!
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.catchCrow(CatchingCrowsRunner.java:44)
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.main(CatchingCrowsRunner.java:12)
org.jesperancinha.java11.catching.crows.SickCrowException: This crow is sick
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.catchCrow(CatchingCrowsRunner.java:42)
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.main(CatchingCrowsRunner.java:12)
org.jesperancinha.java11.catching.crows.CrowException: This crow is healty!
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.catchCrow(CatchingCrowsRunner.java:40)
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.main(CatchingCrowsRunner.java:12)
org.jesperancinha.java11.catching.crows.SickCrowException: This crow is sick
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.catchCrow(CatchingCrowsRunner.java:42)
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.main(CatchingCrowsRunner.java:12)
org.jesperancinha.java11.catching.crows.SuperSickCrowExcetion: This crow needs to go to the emergency room!
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.catchCrow(CatchingCrowsRunner.java:44)
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.main(CatchingCrowsRunner.java:12)
org.jesperancinha.java11.catching.crows.SickCrowException: This crow is sick
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.catchCrow(CatchingCrowsRunner.java:42)
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.main(CatchingCrowsRunner.java:12)
org.jesperancinha.java11.catching.crows.SickCrowException: This crow is sick
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.catchCrow(CatchingCrowsRunner.java:42)
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.main(CatchingCrowsRunner.java:12)
org.jesperancinha.java11.catching.crows.CrowException: This crow is healty!
	at org.jesperancinha.java11.catching.crows.CrowCatcher.catchCrow(CrowCatcher.java:18)
	at org.jesperancinha.java11.catching.crows.CatchingCrowsRunner.main(CatchingCrowsRunner.java:28)
Super Sick crow found!
Sick crow found!
Sick crow found!
Super Sick crow found!
Sick crow found!
Sick crow found!
Let's use our favourite crow catcher!
We have found something. Notice that close is next!
Turning catcher off...

Process finished with exit code 0
```

## References

-   [Amsterdam, Museum Quarter (Museumplein) - 🇳🇱 Netherlands - 4K Walking Tour](https://www.youtube.com/watch?v=dh4l1qQ5RUs)

<div align="center">
      <a href="https://www.youtube.com/watch?v=dh4l1qQ5RUs">
     <img 
      src="https://img.youtube.com/vi/dh4l1qQ5RUs/0.jpg" 
      style="width:10%;">
      </a>
    </div>

-   [Kraai gebruikt stenen om beloning te verkrijgen](https://www.youtube.com/watch?v=Td4vwrIdBjU)

<div align="center">
      <a href="https://www.youtube.com/watch?v=Td4vwrIdBjU">
     <img 
      src="https://img.youtube.com/vi/Td4vwrIdBjU/0.jpg" 
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
