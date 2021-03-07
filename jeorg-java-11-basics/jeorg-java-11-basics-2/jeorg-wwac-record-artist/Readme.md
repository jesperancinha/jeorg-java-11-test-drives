# wwac-record-artist

## Exercise

We are going to look at some of the Hot albums of 2020 and make maps with them. Our map will allow us to check immediately to which artist does the album belongs to. We are going to understand what
the [NavigableMap](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/NavigableMap.html), [SortedMap](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/SortedMap.html) and [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html)
interfaces have to provide. Two classes implement these interfaces: [ConcurrentSkipListMap](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ConcurrentSkipListMap.html) and [TreeMap](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/TreeMap.html)
. We will be looking at the TreeMap.

## Output

```text
++++++++++++++++++++++++++ Map Operations ++++++++++++++++++++++++++
[Dua Lipa, Madonna, Kylie Minogue, Cher, Gorillaz]
Smashing Pumpkins
[Dua Lipa, Smashing Pumpkins, Kylie Minogue, Cher, Gorillaz]
Lana Del Rey
[Dua Lipa, Smashing Pumpkins, Kylie Minogue, Cher, Gorillaz, Lana Del Rey]
Roisin Murphy
[Dua Lipa, Smashing Pumpkins, Kylie Minogue, Roisin Murphy, Gorillaz, Lana Del Rey]
true
[Club Future Nostalgia=Dua Lipa, Cyr=Smashing Pumpkins, Disco=Kylie Minogue, Róisín Machine=Roisin Murphy, Song Machine: Season One - Strange Timez=Gorillaz, Violet Bent Backwards over the Grass=Lana Del Rey]
Smashing Pumpkins
Madonna
false
[Club Future Nostalgia, Cyr, Disco, Róisín Machine, Song Machine: Season One - Strange Timez, Violet Bent Backwards over the Grass]
Maroon 5
Ellie Goulding
{Brightest Blue=Ellie Goulding, Club Future Nostalgia=Dua Lipa, Cyr=Smashing Pumpkins, Disco=Kylie Minogue, Róisín Machine=Roisin Murphy, Song Machine: Season One - Strange Timez=Gorillaz, Violet Bent Backwards over the Grass=Lana Del Rey}
false
true
{Brightest Blue=Ellie Goulding, Club Future Nostalgia=Dua Lipa, Cyr=Smashing Pumpkins, Disco=Kylie Minogue, Róisín Machine=Roisin Murphy, Song Machine: Season One - Strange Timez=Gorillaz, Violet Bent Backwards over the Grass=Lana Del Rey}
null
John Legend
John Legend
[Bigger Love=John Legend, Brightest Blue=Ellie Goulding, Club Future Nostalgia=Dua Lipa, Cyr=Smashing Pumpkins, Disco=Kylie Minogue, Róisín Machine=Roisin Murphy, Song Machine: Season One - Strange Timez=Gorillaz, Violet Bent Backwards over the Grass=Lana Del Rey]
John Legend
null
{Brightest Blue=Ellie Goulding, Club Future Nostalgia=Dua Lipa, Cyr=Smashing Pumpkins, Disco=Kylie Minogue, Róisín Machine=Roisin Murphy, Song Machine: Season One - Strange Timez=Gorillaz, Violet Bent Backwards over the Grass=Lana Del Rey}
false
{Brightest Blue=Ellie Goulding, Club Future Nostalgia=Dua Lipa, Cyr=Smashing Pumpkins, Disco=Kylie Minogue, Róisín Machine=Roisin Murphy, Song Machine: Season One - Strange Timez=Gorillaz, Violet Bent Backwards over the Grass=Lana Del Rey}
true
{Club Future Nostalgia=Dua Lipa, Cyr=Smashing Pumpkins, Disco=Kylie Minogue, Róisín Machine=Roisin Murphy, Song Machine: Season One - Strange Timez=Gorillaz, Violet Bent Backwards over the Grass=Lana Del Rey}
null
Kylie Minogue
{Club Future Nostalgia=Dua Lipa, Cyr=Smashing Pumpkins, Disco=Madonna, Róisín Machine=Roisin Murphy, Song Machine: Season One - Strange Timez=Gorillaz, Violet Bent Backwards over the Grass=Lana Del Rey}
true
{Club Future Nostalgia=Dua Lipa, Cyr=Smashing Pumpkins, Disco=Kylie Minogue, Róisín Machine=Roisin Murphy, Song Machine: Season One - Strange Timez=Gorillaz, Violet Bent Backwards over the Grass=Lana Del Rey}
6
Album: Club Future Nostalgia, Artist: Dua Lipa
Album: Cyr, Artist: Smashing Pumpkins
Album: Disco, Artist: Kylie Minogue
Album: Róisín Machine, Artist: Roisin Murphy
Album: Song Machine: Season One - Strange Timez, Artist: Gorillaz
Album: Violet Bent Backwards over the Grass, Artist: Lana Del Rey
++++++++++++++++++++++++++ SortedMap Operations ++++++++++++++++++++++++++
null
[Club Future Nostalgia=Dua Lipa, Cyr=Madonna, Disco=Kylie Minogue, Róisín Machine=Cher, Song Machine: Season One - Strange Timez=Gorillaz]
Club Future Nostalgia
{Club Future Nostalgia=Dua Lipa, Cyr=Madonna}
[Club Future Nostalgia, Cyr, Disco, Róisín Machine, Song Machine: Season One - Strange Timez]
Song Machine: Season One - Strange Timez
{Club Future Nostalgia=Dua Lipa, Cyr=Madonna, Disco=Kylie Minogue, Róisín Machine=Cher}
{Song Machine: Season One - Strange Timez=Gorillaz}
[Dua Lipa, Madonna, Kylie Minogue, Cher, Gorillaz]
++++++++++++++++++++++++++ NavigableMap Operations ++++++++++++++++++++++++++
[Dua Lipa, Madonna, Kylie Minogue, Cher, Gorillaz]
Disco=Kylie Minogue
Disco
[Song Machine: Season One - Strange Timez, Róisín Machine, Disco, Cyr, Club Future Nostalgia]
{Song Machine: Season One - Strange Timez=Gorillaz, Róisín Machine=Cher, Disco=Kylie Minogue, Cyr=Madonna, Club Future Nostalgia=Dua Lipa}
Club Future Nostalgia=Dua Lipa
Disco=Kylie Minogue
Disco
{Club Future Nostalgia=Dua Lipa, Cyr=Madonna, Disco=Kylie Minogue}
{Club Future Nostalgia=Dua Lipa, Cyr=Madonna}
Róisín Machine=Cher
Róisín Machine
Song Machine: Season One - Strange Timez=Gorillaz
Cyr=Madonna
Cyr
[Club Future Nostalgia, Cyr, Disco, Róisín Machine, Song Machine: Season One - Strange Timez]
Club Future Nostalgia=Dua Lipa
Song Machine: Season One - Strange Timez=Gorillaz
{Cyr=Madonna, Disco=Kylie Minogue, Róisín Machine=Cher}
{Cyr=Madonna, Disco=Kylie Minogue, Róisín Machine=Cher}
{Disco=Kylie Minogue, Róisín Machine=Cher}
{Cyr=Madonna, Disco=Kylie Minogue, Róisín Machine=Cher}
{Disco=Kylie Minogue, Róisín Machine=Cher}
++++++++++++++++++++++++++ TreeMap Operations ++++++++++++++++++++++++++
[Dua Lipa, Madonna, Kylie Minogue, Cher, Gorillaz]
Disco=Kylie Minogue
Disco
[Song Machine: Season One - Strange Timez, Róisín Machine, Disco, Cyr, Club Future Nostalgia]
{Song Machine: Season One - Strange Timez=Gorillaz, Róisín Machine=Cher, Disco=Kylie Minogue, Cyr=Madonna, Club Future Nostalgia=Dua Lipa}
Club Future Nostalgia=Dua Lipa
Disco=Kylie Minogue
Disco
{Club Future Nostalgia=Dua Lipa, Cyr=Madonna, Disco=Kylie Minogue}
{Club Future Nostalgia=Dua Lipa, Cyr=Madonna}
Róisín Machine=Cher
Róisín Machine
Song Machine: Season One - Strange Timez=Gorillaz
Cyr=Madonna
Cyr
[Club Future Nostalgia, Cyr, Disco, Róisín Machine, Song Machine: Season One - Strange Timez]
Club Future Nostalgia=Dua Lipa
Song Machine: Season One - Strange Timez=Gorillaz
{Cyr=Madonna, Disco=Kylie Minogue, Róisín Machine=Cher}
{Cyr=Madonna, Disco=Kylie Minogue, Róisín Machine=Cher}
{Disco=Kylie Minogue, Róisín Machine=Cher}
{Cyr=Madonna, Disco=Kylie Minogue, Róisín Machine=Cher}
{Disco=Kylie Minogue, Róisín Machine=Cher}

Process finished with exit code 0
```

## References

- [List of 2020 albums](https://en.wikipedia.org/wiki/List_of_2020_albums)
- [Cyr](https://en.wikipedia.org/wiki/Cyr_(album))
- [Disco](https://en.wikipedia.org/wiki/Disco_(Kylie_Minogue_album))
- [Song Machine: Season One - Strange Timez](https://en.wikipedia.org/wiki/Song_Machine,_Season_One:_Strange_Timez)
- [Róisín Machine](https://en.wikipedia.org/wiki/R%C3%B3is%C3%ADn_Machine)
- [Club Future Nostalgia](https://en.wikipedia.org/wiki/Club_Future_Nostalgia)

<div align="center">
      <a href="https://www.youtube.com/watch?v=2AN_GRWlU7k">
         <img 
              src="https://img.youtube.com/vi/2AN_GRWlU7k/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=l73FJBnjp28">
         <img 
              src="https://img.youtube.com/vi/l73FJBnjp28/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=bbA5p54Rw2M">
         <img 
              src="https://img.youtube.com/vi/bbA5p54Rw2M/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=oEzBd-UCtNQ">
         <img 
              src="https://img.youtube.com/vi/oEzBd-UCtNQ/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=m5lp8S-YgrQ">
         <img 
              src="https://img.youtube.com/vi/m5lp8S-YgrQ/0.jpg" 
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
