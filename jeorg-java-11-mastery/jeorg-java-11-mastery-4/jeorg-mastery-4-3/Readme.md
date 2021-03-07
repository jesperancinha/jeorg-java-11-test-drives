# mastery-4-3 - Mastery Module 4.3. - And then Indie

Welcome to my 9th Mastery Module: "And then Indie"

## Exercise

1. Indexes in a `ResultSet`
2. Using `mapToObj`
3. Mutability Guidelines with focus on 6.6.
4. Valid modes in `RandomAccessFile`. Difference from using `append`
5. `Predicate` of types
6. Downcasting and Upcasting
7. `jdeps` alternative `commands` [mastery-4-3-modularity](../mastery-4-3-modularity)
8. Boxing and the difference between primitives
9. `++i` `i++` in a loop
10. Collecting duplicate entries to a `Map`
11. `readPassword` in `Console`
12. Complex `operands` and `operators`
13. Creating and filtering an `IntStream`
14. When to call `flush`
15. add `override` in an `ArrayList`
16. Overriding methods returning primitives
17. `jdeps` `--module-path` `-cp` `--class-path` and `-classpath`
18. Abstract classes and the `new` keyword
19. `String` `replace` old/new

## Preparation

If you are on a Unix based system or if you are running any sort of BSD, MAC-OS, then you are fine using filr [prepare.sh](prepare.sh). If you are using windows, then this will maybe work. I seldom use windows and not always I can test my work there. The point is that you need to have a `/tmp`
folder at this point.

```bash
./prepare.sh
```

## Output

```text
/Users/jofisaes/Downloads/jdk-15.jdk2/Contents/Home/bin/java -javaagent:/Users/jofisaes/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/203.5981.155/IntelliJ IDEA 2020.3 EAP.app/Contents/lib/idea_rt.jar=61406:/Users/jofisaes/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/203.5981.155/IntelliJ IDEA 2020.3 EAP.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/jofisaes/dev/src/jofisaes/java-test-drives/ocp11/java-11-mastery-4/mastery-4-3/target/classes:/Users/jofisaes/dev/src/jofisaes/java-test-drives/jtd-the-factory/consolerizer/target/classes:/Users/jofisaes/.m2/repository/com/h2database/h2/1.4.200/h2-1.4.200.jar:/Users/jofisaes/.m2/repository/org/junit/jupiter/junit-jupiter/5.5.1/junit-jupiter-5.5.1.jar:/Users/jofisaes/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.5.1/junit-jupiter-api-5.5.1.jar:/Users/jofisaes/.m2/repository/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar:/Users/jofisaes/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/jofisaes/.m2/repository/org/junit/platform/junit-platform-commons/1.5.1/junit-platform-commons-1.5.1.jar:/Users/jofisaes/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.5.1/junit-jupiter-params-5.5.1.jar:/Users/jofisaes/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.5.1/junit-jupiter-engine-5.5.1.jar:/Users/jofisaes/.m2/repository/org/junit/platform/junit-platform-engine/1.5.1/junit-platform-engine-1.5.1.jar:/Users/jofisaes/.m2/repository/org/assertj/assertj-core/3.13.2/assertj-core-3.13.2.jar org.jesperancinha.java11.mastery4dot3.Mastery4Dot3Runner -skip
==================== Master Module mastery-4-3 And Then Indie ====================
----> Run with VM command -ea or -enableassertions for a more accurate run
----> Run with -skip to skip questions
----> Note that this mastery need the prepare.sh script to be run first.
========================================================================================================================
--- 1. Indexes in a `ResultSet`
========================================================================================================================
Case: We are wondering what happened to MGMT and why we don't hear about them anymore.
On this first exercise we will investigate their triad of hits.
MGMT came into the Indie music scene in 2008 with their album Oracular Spectacular.
------------------------------------------------------------------------------------------------------------------------
resultSet.getString("SONG"); -> Time to pretend
resultSet.getString(1); -> Time to pretend
resultSet.getString("BAND"); -> MGMT
resultSet.getString(2); -> MGMT
resultSet.getArray("BAND"); -> ar0: ['MGMT']
resultSet.getArray(2);-> ar1: ['MGMT']
resultSet.getLong("HITYEAR");-> 2008
resultSet.getLong(3); -> 2008
resultSet.getInt("HITYEAR");-> 2008
resultSet.getInt(3);-> 2008
resultSet.getBigDecimal("HITYEAR");-> 2008
resultSet.getBigDecimal(3); -> 2008
resultSet.getFloat("HITYEAR");-> 2008.0
resultSet.getFloat(3); -> 2008.0
resultSet.getArray("HITYEAR");-> ar2: [2008]
resultSet.getArray(3); -> ar3: [2008]
------------------------------------------------------------------------------------------------------------------------
resultSet.getString("SONG"); -> Kids
resultSet.getString(1); -> Kids
resultSet.getString("BAND"); -> MGMT
resultSet.getString(2); -> MGMT
resultSet.getArray("BAND"); -> ar4: ['MGMT']
resultSet.getArray(2);-> ar5: ['MGMT']
resultSet.getLong("HITYEAR");-> 2008
resultSet.getLong(3); -> 2008
resultSet.getInt("HITYEAR");-> 2008
resultSet.getInt(3);-> 2008
resultSet.getBigDecimal("HITYEAR");-> 2008
resultSet.getBigDecimal(3); -> 2008
resultSet.getFloat("HITYEAR");-> 2008.0
resultSet.getFloat(3); -> 2008.0
resultSet.getArray("HITYEAR");-> ar6: [2008]
resultSet.getArray(3); -> ar7: [2008]
------------------------------------------------------------------------------------------------------------------------
resultSet.getString("SONG"); -> Electric Feel
resultSet.getString(1); -> Electric Feel
resultSet.getString("BAND"); -> MGMT
resultSet.getString(2); -> MGMT
resultSet.getArray("BAND"); -> ar8: ['MGMT']
resultSet.getArray(2);-> ar9: ['MGMT']
resultSet.getLong("HITYEAR");-> 2008
resultSet.getLong(3); -> 2008
resultSet.getInt("HITYEAR");-> 2008
resultSet.getInt(3);-> 2008
resultSet.getBigDecimal("HITYEAR");-> 2008
resultSet.getBigDecimal(3); -> 2008
resultSet.getFloat("HITYEAR");-> 2008.0
resultSet.getFloat(3); -> 2008.0
resultSet.getArray("HITYEAR");-> ar10: [2008]
resultSet.getArray(3); -> ar11: [2008]
------------------------------------------------------------------------------------------------------------------------
Take-away
1. In Result sets, indexes are 1 based
2. Conversions happen automatically if they match
3. An Int if convertible to Integer, Long, Float, Double and Big Integer
4. We can even get a special java.sql.Array type, which  returns the data in an array form valid for all types
========================================================================================================================
--- 2. Using `mapToObj`
========================================================================================================================
Case: Oracular Spectacular reached interesting top positions world-wide.
Let's have a look at the math behind it
This is their peak register on the charts on the  16th November 2020
{FRA=22, US=38, CAN=24, BEL=10, AUS=6, NZ=13, UK=8, IRL=5, GER=65, SWI=68}
------------------------------------------------------------------------------------------------------------------------
When our stream is sequential, we can see things nicely, but performance goes away:
Adding value 22
When our stream is sequential, we can see things nicely, but performance goes away:
Adding value 38
When our stream is sequential, we can see things nicely, but performance goes away:
Adding value 24
When our stream is sequential, we can see things nicely, but performance goes away:
Adding value 10
When our stream is sequential, we can see things nicely, but performance goes away:
Adding value 6
When our stream is sequential, we can see things nicely, but performance goes away:
Adding value 13
When our stream is sequential, we can see things nicely, but performance goes away:
Adding value 8
When our stream is sequential, we can see things nicely, but performance goes away:
Adding value 5
When our stream is sequential, we can see things nicely, but performance goes away:
Adding value 65
When our stream is sequential, we can see things nicely, but performance goes away:
Adding value 68
------------------------------------------------------------------------------------------------------------------------
8
3 22
 810
24
6

   13 
 5
 68
I'65
m re achiI'm rea I'chingng m rI'mthis now, be tcause I' reaceaching m his na this now, bhiecauseparow, bal I'm a ngparleecal all thiel stusrests reaam!e 
m! now
I'm , b a ecparallelau st[65]se I'[13m a 
ream!
  pa]
 rallel stream[6!
 [2[8]
8]
2]
  [10]
  I'm reaching this now,[38[6]
 bec]
 au se I'm a parallel stream!
 I'm reaching this now, because I'm a paral[5lel]
 stream!
  [24]
[65, 68]
  [10I'm reaching, 6]
 thi s now, because I'm a parallel stream!
 I'm reaching this now, because I'[1m 3,a  8pa]
rallel  stream!
 [5, 65, 68[22, 3]
 8]
 [24, 10, 6]
 I'm reaching this now, because I'm a parallel stream!
 [22, 38, 24, 10, 6]
 [13, 8, 5, 65, 68]
 I'm reaching this now, because I'm a parallel stream!
 [22, 38, 24, 10, 6, 13, 8, 5, 65, 68]
 []
 ------------------------------------------------------------------------------------------------------------------------
Sequential list result -> [22, 38, 24, 10, 6, 13, 8, 5, 65, 68]
Sequential list result -> [22, 38, 24, 10, 6, 13, 8, 5, 65, 68]
------------------------------------------------------------------------------------------------------------------------
If we want to calculate the average this way and with high performance, we can!
This is the result -> 25,900000
------------------------------------------------------------------------------------------------------------------------
However, Number streams, already contain average methods. This is the reason why a collector doesn't make sense to have in a Number stream
Oracle Spectacular reached an average peak of 25,900000 around the world
Oracle Spectacular reached an average peak of 25,900000 around the world
Oracle Spectacular reached an average peak of 25,900000 around the world
Oracle Spectacular reached an average peak of 25,900000 around the world
Oracle Spectacular reached an average peak of 25,900000 around the world
Oracle Spectacular reached an average peak of 25,900000 around the world
Oracle Spectacular reached an average peak of 25,900000 around the world
Oracle Spectacular reached an average peak of 25,900000 around the world
------------------------------------------------------------------------------------------------------------------------
Curiosity 1 (Forcing Doubles) ->  12,813333
Curiosity 2 (Forcing Longs) ->  12,333333
Curiosity 3 (Forcing Ints) ->  12,333333
Curiosity 4 (no values) ->  0,000000
Note that the double average is more accurate because Long and Int have round up the decimals to unit.
------------------------------------------------------------------------------------------------------------------------
Take-away
1. Calculating average can be done in different ways.
2. All ways require the return value to double in the end unless we make our custom calculation.
3. Using collectors, the result in never an Optional and this is because that is the way collectors work.
4. Number streams do have collectors. We calculated avg using our own average implementation, but it will always be less efficient.
5. The collector of the Number streams are used to solve value accumulation issues. They are perfect for custom reduce operations.
6. The BiConsumer of a Number stream collector is called only during `parallel` stream operations. It is not called at all otherwise.
7. The `average` method of a Number stream is there to solve this problem. However, it returns an `OptionalDouble`. We then call getAsDouble to know the value.
========================================================================================================================
--- 3. Mutability Guidelines with focus on 6.6.
========================================================================================================================
Case: In January 2020, Vampire Weekend won the best Album of the Year at the Grammy's.
At the same time they have had already released a limited edition orange vinyl version of this album.
No doubt that with such great success, this limited will have its price inflated through the years.
You bought this record, and now, years later, a friend asks you if you can lend they your record.
You are very protective of such a music gem and so you decide to make a copy of it, and give lend that to your friend.
Your friend's intention turns out to be something else in the end. They was going to scratch it for you
------------------------------------------------------------------------------------------------------------------------
This is the album you were about to lend:
Album{albumName='Father of the Bride (Vinyl - Orange, Limited Edition)', band='Vampire Weekend', songs=I know the reason why you think you gotta leave, We took a vow in summertime}
If you had lend it to Frenemy{name='Frenemy'}
Thanks for the album!
Album{albumName='Father of the Bride (Vinyl - Orange, Limited Edition)', band='Vampire Weekend', songs=I know the reason why you think you gotta leave, We took a vow in summertime}
This would be the returned album:
Album{albumName='Father of the Bride (Vinyl - Orange, Limited Edition)', band='Vampire Weekend', songs=,}
------------------------------------------------------------------------------------------------------------------------
But since you are pretty safe in what you do, you are going to lend:
Thanks for the album!
Album{albumName='Father of the Bride (Vinyl - Orange, Limited Edition)', band='Vampire Weekend', songs=I know the reason why you think you gotta leave, We took a vow in summertime}
And so, although your friend did this to your copy:
Album{albumName='Father of the Bride (Vinyl - Orange, Limited Edition)', band='Vampire Weekend', songs=,}
Your original is still there 😉!!
Album{albumName='Father of the Bride (Vinyl - Orange, Limited Edition)', band='Vampire Weekend', songs=I know the reason why you think you gotta leave, We took a vow in summertime}
------------------------------------------------------------------------------------------------------------------------
Take-away
1. Guideline 6-6 / MUTABLE-6: Treat passing input to untrusted object as output
2. More info: https://www.oracle.com/java/technologies/javase/seccodeguide.html
========================================================================================================================
--- 4. Valid modes in `RandomAccessFile`. Difference from using `append`
========================================================================================================================
Case: We are writing the lyrics to Contra
We will use alternative methods to do so and alternate
file will be located in /tmp/contra.txt
------------------------------------------------------------------------------------------------------------------------
https://www.songteksten.nl/songteksten/302818/vampire-weekend/i-think-ur-a-contra.html
Never pick sides
Never choose between two
But I just wanted you
I just wanted you
Said never pick sides
Never choose between two
But I just wanted you
I just wanted you
I think you're a contra
I think that you've lied
Don't call me a contra
Till you've tried
------------------------------------------------------------------------------------------------------------------------
Take-away
1. With RandomAccessFile, we can use seek to get to a point in the file.
2. With RandomAccessFile, we know how many bytes exist in the file.
3. With RandomAccessFile, the position after the end of the file has an index number equal to the file size.
4. The index is based on an inclusive start index and an exclusive end index.
5. With FileOutputStream we can append data at the end of the file without the need for seek. The append option does this for us.
========================================================================================================================
--- 5. `Predicate` of types
========================================================================================================================
Case: Vampire Weekend had 2 wind by the Grammys for two of their albums.
We'll build some predicates based on this and see the small differences.
Albunm Album{albumName='Father of the Bride (Vinyl - Orange, Limited Edition)', band='Vampire Weekend', songs=} won the grammys -> true
Album Album{albumName='Modern Vampires of The City', band='Vampire Weekend', songs=} won the grammys -> true
Album Album{albumName='Contra', band='Vampire Weekend', songs=} won the grammys -> false
Take-away
1. Predicate with types are checked and therefore the reference much be checked as well for type
2. Predicate without types are unchecked and unsafe and therefore the reference cannot be typed.
3. You don't have to define the type of the input parameter if you already have done so for the reference.
4. The previous rule works the same way as the diamond notation works.
--- 6. Downcasting and Upcasting
========================================================================================================================
Case: Hercules and Love Affair is on tour and you are going to see them in the backstage!
Can you go on their trailer? Probably not ☹️. We'll look into the not case.
This is the band in the trailer: Trailer{band='Hercules and Love Affair'}
You and your friends Limousine{fans=[You, Joan, Edith, Margaret, Dorothy]} are now in the limo!
The Transport for the Trailer is Trailer{band='Hercules and Love Affair'}
The Transport for the Limousine is Limousine{fans=[You, Joan, Edith, Margaret, Dorothy]}
This is expected java.lang.ClassCastException: class org.jesperancinha.java11.mastery4dot3.transport.Limousine cannot be cast to class org.jesperancinha.java11.mastery4dot3.transport.TourTrailer (org.je
sperancinha.ocp11.mastery4dot3.transport.Limousine and org.jesperancinha.java11.mastery4dot3.transport.TourTrailer are in unnamed module of loader 'app')
	at org.jesperancinha.java11.mastery4dot3.Mastery4Dot3Runner.exercise6(Mastery4Dot3Runner.java:565)
	at org.jesperancinha.java11.mastery4dot3.Mastery4Dot3Runner.main(Mastery4Dot3Runner.java:82)
There is no compilation error, because we are downcasting from transportFriends, which is a reference to a Transport interface
Transport interfaces can be Trailers but of course they can also be Limousines.
If the instance is a Limousine, then it cannot be a Trailer at the same time.
Finally a tour trailer HLA is also just a trailer
The subclass TourTrailer is just a more specific case of Trailer
And so we have the Trailer as Trailer{band='Hercules and Love Affair'}
Take-away
1. var declaration plays a smaller role in downcasting and upcasting, since the type is assigned on the right side.
2. Upcasting is automatic, when the subtype is known.
3. Casting in general has to be explicit if the subtype is unknown.
4. Compilation errors occurs when the subtype is known and doesn't match the type being cast to.
5. If it is possible to downcast, the compiler has no way to differentiate the actual instance being referenced to.
6. The later results in a ClassCastException, which is a RuntimeException because only during runtime will the actual cast be attempted.
========================================================================================================================
--- 7. `jdeps` alternative `commands`
========================================================================================================================
Case: Let's examine jdeps by looking at Song "Cousins" from Vampire Weekend
Please run mastery-4-3-modularity in order to fulfill this exercise.
Take-away
1. You can call jdeps with -cp -classpath or --class-path.
2. Classpath only works with unamed modules/automatic modules and their dependencies.
3. Classpath does not work for modules that depend on automatic modules.
========================================================================================================================
--- 8. Boxing and the difference between primitives
========================================================================================================================
Case: The album "Hercules and The Love Affair" of the band of the same name was published on the 10th of March 2008.
We are going to use the numerology related to this album to explore boxing from primitive values
This album lasts for 46m 29s.
Which in minutes can also be:
46.483333333333334 46.0 46.483333333333334 (minutes) in double
or
46.483334 46.0 46.483334 (minutes) in double
This album was published on the year 2008 and 2008
The album starts with letter 'H' which is an 72 in the integer form.
Since the duration is shorter than 127, we can register it in a Byte 46.
Finally the published year can be registered in a two byte type like Short 2008.
Take-away
1. In Boxing, the only possible conversions are from int to Byte, Short, Character and Integer.
2. Long needs an L at the end of it.There is no automatic conversion.
3. Double and Float need D and F respectively. There is no automatic conversion.
========================================================================================================================
--- 9. `++i` `i++` in a loop
========================================================================================================================
Case: We are going to count the number of songs in "Hercules and The Love Affair" album.
There are 10 in the normal edition and we are two people counting!
I count 0 and my friend counts 0
I count 1 and my friend counts 1
I count 2 and my friend counts 2
I count 3 and my friend counts 3
I count 4 and my friend counts 4
I count 5 and my friend counts 5
I count 6 and my friend counts 6
I count 7 and my friend counts 7
I count 8 and my friend counts 8
I count 9 and my friend counts 9
I counted 10 and my friend counted 10
I count 0 and my friend counts 0
I count 1 and my friend counts 1
I count 2 and my friend counts 2
I count 3 and my friend counts 3
I count 4 and my friend counts 4
I count 5 and my friend counts 5
I count 6 and my friend counts 6
I count 7 and my friend counts 7
I count 8 and my friend counts 8
I count 9 and my friend counts 9
I counted 10 and my friend counted 10
Take-away
1. Although may look confusing, the point of this exercise is to show that ++ on the left side or on the right side, do not make a difference in an ordinary for loop.
2. When ++ is on the left, we sum first, then read and then return the result. This result goes in the loop.
3. When ++ is on the right, we read first, then sum and then return the result. This result goes in the loop.
========================================================================================================================
--- 10. Collecting duplicate entries to a `Map`
========================================================================================================================
Case: We have a collection of Capital Cities CD's
Now we want put those in a Map so that we have a reference to the year we bought them.
However, we made mistake and put two entries of the same album.
Can we still collect this into a Map?
Our album list:
[AlbumForSale{name='In a Tidal Wave of Mystery', yearOfPurchase=2016}, AlbumForSale{name='Solarize', yearOfPurchase=2019}, AlbumForSale{name='Solarize', yearOfPurchase=2018}]
This is expected. We have two elements of the same key. The runtime does not know how to solve these ambiguities -> java.lang.IllegalStateException: Duplicate key Solarize (attempted merging values 20
19 and 2018)
	at java.base/java.util.stream.Collectors.duplicateKeyException(Collectors.java:133)
	at java.base/java.util.stream.Collectors.lambda$uniqKeysMapAccumulator$1(Collectors.java:180)
	at java.base/java.util.stream.ReduceOps$3ReducingSink.accept(ReduceOps.java:169)
	at java.base/java.util.AbstractList$RandomAccessSpliterator.forEachRemaining(AbstractList.java:720)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at org.jesperancinha.java11.mastery4dot3.Mastery4Dot3Runner.exercise10(Mastery4Dot3Runner.java:430)
	at org.jesperancinha.java11.mastery4dot3.Mastery4Dot3Runner.main(Mastery4Dot3Runner.java:86)
We can't go back, so now we have to define a way to disambiguate this.
We do that with a merge function which is a BinaryOperator.
We'll consider the most recent purchase year.
We finally get our disambiguated map:
{In a Tidal Wave of Mystery=2016, Solarize=2019}
Take-away
1. If there are repeated keys, the map collection fails by default.
2. A merge strategy can be implemented.
3. The merge strategy is of type BinaryOperator, which is characterized by have the input and return parameters of the same type.
4. The later is how we distinguish between operators and functions..
========================================================================================================================
--- 11. `readPassword` in `Console`
========================================================================================================================
Case: Capital Cities made a funny video, where to get to their video set, a password is asked at the entrance.
See the video here: https://www.youtube.com/watch?v=w7JFSLu8OHI
So, what's the password?
Unfortunately, console is only available if you invoke this program via the command line
Please build this project and run:
java  -jar target/mastery-4-3-1.0.0-SNAPSHOT.jar 
========================================================================================================================
--- 12. Complex `operands` and `operators`
========================================================================================================================
Case: In this case, there isn't really much we can do in terms of our Indie Theme.
In this exercise we just want to make a random execution flow and guess what is happening.
        int z = 10;
        int w = 20;
        z= ++w;
        w += --z;
        if( (w == w + 4 - z--) & ( w == --z)){
            z -=20;
        }
Please guess what is the value of z at the end of this execution:
 18
You got it right!
18
Take-away
1. Operand evaluation is difficult. Keep an eye out for module java-11-mastery-logics for more exercises like this.
2. Operations follow typical Math operation and follow accolade definitions.
3. Operands get evaluated first, before the operations.
4. Disambiguation happens from left to right.
========================================================================================================================
--- 13. Creating and filtering an `IntStream`
========================================================================================================================
Case: We will examine the position on the charts for Animal Collective at present: 2020/12/06
Specifically we'll look at peal positions for the "Merriweather Post Pavilion" album.
These are the peak positions for differenct countries:
[13, 4, 63, 31, 25, 46, 58, 21, 37, 26]
This many counties reached the top ten:
1
If we want to specify type, we can, but its not needed:
1
We can also pretend that they reached number 1 with a mapping trick:
[10, 1, 60, 28, 22, 43, 55, 18, 34, 23]
Take-away
1. IntStream is different than Stream.
2. We know that collect does not take a Collector. It takes a Supplier, a ObjIntConsumer and a BiConsumer.
3. BiConsumer only works for parallel streams.
4. IntStream filters work with IntPredicates. They differ from normal predicates in that they only accept integers.
5. We cannot use a common Predicate in place of a IntPredicate. They are different.
6. We can map using a IntUnaryOperator.
7. IntStreams only accept int or varargs of type int. Lists are not allowed. Only arrays.
========================================================================================================================
--- 14. When to call `flush`
========================================================================================================================
Case: We'll save lyrics of Animal Collective's single "FloriDada" from 2016 into a file.
Do we need to flush it?
Lyrics have  been written to "/tmp/floridada.txt".
from: https://www.azlyrics.com/lyrics/animalcollective/floridada.html
Child
Of limousines
What's the best place
That you have seen
All of the hands
That you have shook
Home of the queen of everything fancy
Is there a smell
That you can tell
Gives you some peace
Sends you to hell
All of the beds
That you have yearned
Is there a dream to
Where you'd return
Where is the plight
With the most stars
Where do you drink
Please check file contents!
Take-away
1. The underlying close operation flushes the content to file.
2. Flush is usually called if you want to write sequentially to a file and not in one go.
3. This way, we can hold  the buffer in memory and possibly perform changes before  flushing it to a file.
4. We can also use flush, if we want to keep the buffer available for future writes to a file.
========================================================================================================================
--- 15. add `override` in an `ArrayList`
========================================================================================================================
Case: We are going to store our Animal Collective record collection in and ArrayList.
But is isn't no ordinary list! This is a AnimalCollectiveList!
We would have gotten something different if we tried to override with add(Object)
     'add(E)' in 'java.util.ArrayList' clashes with 'add(Object)' in 'org.jesperancinha.java11.mastery4dot3.record.AnimalCollectiveList';
     both methods have same erasure, yet neither overrides the other
This is our record collection:
[Feels, Strawberry Jam, Merriweather Post Pavilion]
Take-away
1. We cannot overload or override any of the original ArrayList methods with Object because of type erasure.
2. Type erasure "Replace all type parameters in generic types with their bounds or Object if the type parameters are unbounded"
3. If for example we attempt to override with add(Object), this won't work
4. Type erasure will replace add(T) with add(Object) and this will conflict with our own add(Object)
5. Since they don't override each other, this becomes impossible to do.
========================================================================================================================
--- 16. Overriding methods returning primitives
========================================================================================================================
Case: We are going to see how many songs per record, on average, are Animal Collective developing.
We want one or more methods that return different types: Byte, Short, Character, Integer, Long, Float and Double
We will use the AlbumCalculator for that
This is our album collection:
AlbumCalculator{songsPerAlbum={Merriweather Post Pavilion=11, Sung Tongs=12, Centipede Hz=11, Feels=9, Campfire Songs=5, Danse Manatee=12, Here Comes the Indian=7, Strawberry Jam=9, Painting With=12, 
Spirit They're Gone, Spirit They've Vanished=10}}
And here are different ways to calculate average songs per album:
Byte -> 9
Character ->
Double -> 9.8
Float -> 9.8
Integer -> 9
Long -> 9
Short -> 9
Take-away
1. Methods with primitive return types can only be overridden by methods of the same return type.
2. There is no averagingFloat collector.
3. Look into the code and bear in mind the different ways to calculate average.
========================================================================================================================
--- 17. `jdeps` `--module-path` `-cp` `--class-path` and `-classpath`
========================================================================================================================
Case: Let's examine jdeps by looking at Song "Cousins" from Vampire Weekend..,Again!
Please run mastery-4-3-modularity in order to fulfill this exercise.
Take-away
1. You can call jdeps with -cp -classpath or --class-path.
2. The last element of the command can be converted to an automatic module.
3. Elements in class path are considered normal jars.
4. Automatic modules can still read from the class path.
5. Named modules cannot.
6. The later two are the reason why the firs command works well and the following doesn't.
========================================================================================================================
--- 18. Abstract classes and the `new` keyword
========================================================================================================================
Case: We have a plan for a guitar. It is probably the most important instrument in Indie music.
Deadline is approaching and you have to deliver it! It's not ready!
You do have an initial Blueprint and so we'll create our guitar like that!
This is our guitar at the moment -> This guitar isn't ready!
Take-away
1. Although a very simple concept, it is important to notice that no abstractions may exist in instances.
2. This is why, when we crate instances of anonymous classes, we are force to implement whatever is left from the abstraction.
========================================================================================================================
--- 19. `String` `replace` old/new 
========================================================================================================================
Case: We are closing this module with "After the Curtain" from musical group Beirut.
After this module, please continue your studies. Look out for new modules as they will keep coming
Testing "After the curtain" with Strings:
false
Testing "After the curtain" with Character:
true
This strange phenomenon happen because of this:
    public String replace(char oldChar, char newChar) {
        if (oldChar != newChar) {
            String ret = isLatin1() ? StringLatin1.replace(value, oldChar, newChar)
                                    : StringUTF16.replace(value, oldChar, newChar);
            if (ret != null) {
                return ret;
            }
        }
        return this;
    }
Take-away
1. String constants can be compared with the equals logical operator.
2. The `replace` method, with string, always returns a new string, which invalidates the use of the logic operator.
3. The `replace` method, with a char, returns a new string, if the chars are different, which not always invalidates the use of the logic operator.
4. Replacing with the same character returns the same String.
------------------------------------------------------------------------------------------------------------------------------------------------------
🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄
------------------------------------------------------------------------------------------------------------------------------------------------------
Hope you enjoyed this mastery into Java 11 with some Indie/Pop flavor to it.
Please keep coming back as I'll be creating more mastery modules.
Thank you!
------------------------------------------------------------------------------------------------------------------------------------------------------
🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄
------------------------------------------------------------------------------------------------------------------------------------------------------

Process finished with exit code 
```

## References

- [Type Erasure](https://docs.oracle.com/javase/tutorial/java/generics/erasure.html)

---

- [Animal Collective Lyrics FloriDada](https://www.azlyrics.com/lyrics/animalcollective/floridada.html)
- [Animal Collective discography](https://en.wikipedia.org/wiki/Animal_Collective_discography)
- [Animal Collective](https://en.wikipedia.org/wiki/Animal_Collective)
- [Capital Cities - What's the password?](https://www.youtube.com/watch?v=w7JFSLu8OHI)
- [Capital Cities (band)](https://en.wikipedia.org/wiki/Capital_Cities_(band))
- [Hercules and Love Affair (album)](https://en.wikipedia.org/wiki/Hercules_and_Love_Affair_(album))
- [Hercules and Love Affair Homepage](https://www.herculesandloveaffair.net/home/)
- [VAMPIRE WEEKEND @ The Grammys](https://www.grammy.com/grammys/artists/vampire-weekend/10722)
- [Vampire Weekend release new album ‘Father of the Bride’](https://www.sonymusic.co.uk/vampire-weekend-release-new-album-father-of-the-bride/)
- [MGMT discography](https://en.wikipedia.org/wiki/MGMT_discography)
- [Electric Feel](https://en.wikipedia.org/wiki/Electric_Feel)
- [Kids (MGMT song)](https://en.wikipedia.org/wiki/Kids_(MGMT_song))
- [Time to Pretend](https://en.wikipedia.org/wiki/Time_to_Pretend)
- [MGMT and their Little Dark Age](https://www.youtube.com/watch?v=IMMlwjWyHxA)

<div align="center">
      <a href="https://www.youtube.com/watch?v=GJ78MJg3UdE">
         <img 
              src="https://img.youtube.com/vi/GJ78MJg3UdE/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=0fizVDRsvOI">
         <img 
              src="https://img.youtube.com/vi/0fizVDRsvOI/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=IMMlwjWyHxA">
         <img 
              src="https://img.youtube.com/vi/IMMlwjWyHxA/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=IlkTVMMkCP4">
         <img 
              src="https://img.youtube.com/vi/IlkTVMMkCP4/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=47dtFZ8CFo8">
         <img 
              src="https://img.youtube.com/vi/47dtFZ8CFo8/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=JozUoRIbsEE">
         <img 
              src="https://img.youtube.com/vi/JozUoRIbsEE/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=AIIovpUQiro">
         <img 
              src="https://img.youtube.com/vi/AIIovpUQiro/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=IPKAwJKGSDc">
         <img 
              src="https://img.youtube.com/vi/IPKAwJKGSDc/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=mGu0IYyncZ4">
         <img 
              src="https://img.youtube.com/vi/mGu0IYyncZ4/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=xozfkEPxDqk">
         <img 
              src="https://img.youtube.com/vi/xozfkEPxDqk/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=bccKotFwzoY">
         <img 
              src="https://img.youtube.com/vi/bccKotFwzoY/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=1e0u11rgd9Q">
         <img 
              src="https://img.youtube.com/vi/1e0u11rgd9Q/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=X61BVv6pLtw">
         <img 
              src="https://img.youtube.com/vi/X61BVv6pLtw/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=cdHnMYUPh6s">
         <img 
              src="https://img.youtube.com/vi/cdHnMYUPh6s/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=MmZexg8sxyk">
         <img 
              src="https://img.youtube.com/vi/MmZexg8sxyk/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=WiGI_UsWcWs">
         <img 
              src="https://img.youtube.com/vi/WiGI_UsWcWs/0.jpg" 
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
