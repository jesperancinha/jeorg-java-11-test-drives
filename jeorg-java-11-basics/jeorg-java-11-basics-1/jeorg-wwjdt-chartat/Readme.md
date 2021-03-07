# wwjdt-chartat

We will look at the critically acclaimed song "[Annie Lennox - No More "I Love You's"](https://www.youtube.com/watch?v=NSkboTTTmpg)". In concrete we will just play with the song title. We are going to discover some tricks regarding charAt which could be applied to any other method. When working with
primitive types we need to have present a couple of things:

1. Primitive values inside the range do not need cast (e.g. int to float does not need casting)
2. Primitive values outside the range imperatively need casting (e.g. float to int needs casting)
3. When the range is similar, but do not match, then a cast must happen regardless of the order (e.g. short to char and vice-versa)

## Tips

Remember that it is not a good idea to catch the utmost subclass of Exceptions. Always better to catch the subclass more common to what we are doing. In our case we will be catching StringIndexOutOfBoundsException... Well I did, you may actually catch ArrayIndexOutOfBoundsException. Let me know on
my twitter handle if you do! [@joaofse](https://twitter.com/joaofse). [![Twitter Follow](https://img.shields.io/twitter/follow/joaofse?label=João%20Esperancinha&style=social "Twitter")](https://twitter.com/joaofse). We know to a certain degree that the implementations may change but not exactly if
they are commonb enough. These are case by case issues, so we have just have to know them.

## Output

```text
**** The language is leaving me
java.lang.StringIndexOutOfBoundsException: String index out of range: 100000
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
	at java.base/java.lang.String.charAt(String.java:693)
	at org.jesperancinha.java11.charat.CharAtRunner.main(CharAtRunner.java:17)
**** Character is off the string. Exception: String index out of range: 100000
**** Exception type: class java.lang.StringIndexOutOfBoundsException
**** Character is off the string. Exception: String index out of range: 47
**** Exception type: class java.lang.StringIndexOutOfBoundsException
---- First character using int is N and the first character using char is N
---- 32nd character using int is e and the 32nd character using char is e
---- 46nd character using int is e and the 46nd character using char is e
java.lang.StringIndexOutOfBoundsException: String index out of range: 47
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
	at java.base/java.lang.String.charAt(String.java:693)
	at org.jesperancinha.java11.charat.CharAtRunner.main(CharAtRunner.java:25)

Process finished with exit code 0
```

## References

- [IndexOutOfBounds Exception Java String Class charAt Method]()https://stackoverflow.com/questions/27523604/indexoutofbounds-exception-java-string-class-charat-method
- [ASCII table](https://inf14manonr.weebly.com/binaire-getallen.html)

<div align="center">
      <a href="https://www.youtube.com/watch?v=NSkboTTTmpg">
     <img 
          src="https://img.youtube.com/vi/NSkboTTTmpg/0.jpg" 
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
