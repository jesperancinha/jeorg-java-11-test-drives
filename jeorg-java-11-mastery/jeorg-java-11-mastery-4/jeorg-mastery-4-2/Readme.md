# mastery-4-2 - Mastery Module 4.2.

Welcome to my 8th mastery module. For this module we will master our Java knowledge with Java exercises based on the data of Spanish Pop Music. In this case we will have a look at some of the music that really had an influence on my life during my Spanish years. This is all about the spanish
pop/indie music history between the 70's going through the 80's, 90's and early 2000's.

## Exercise

1. Primitives Revised
2. Different ways to use `this`
3. The body of `switch`
4. The `java.desktop` module
5. Hiding and shadowing instance members
6. Bypassing overloading methods with different return types
7. Immutability standards and using `LocalDate` and `LocalDateTime`
8. Overwriting with `FileOutputStream`
9. Why use `putIfAbsent`?
10. Evaluation order of conditional operators
11. Method overloading and overriding with `extends`
12. Immutability with Guidelines 7 and 6
13. `Float.POSITIVE_INFINITY` vs `Float.NEGATIVE_INFINITY`
14. Static and instance initialization of final `members`
15. Iterating through a `CopyOnWriteArrayList` and the `UnsupportedOperationException`
16. NavigableMap and `pollLastEntry` and `pollFirstEntry`
17. `writeUTF` and where it is possible with `BufferedWriter` and `FileOutputWriter`
18. `Arrays` `binarySearch`
19. `try-with-resources` `open` and `close` methods.

## Preparation

If you are on a Unix based system or if you are running any sort of BSD, MAC-OS, then you are fine using filr [prepare.sh](prepare.sh). If you are using windows, then this will maybe work. I seldom use windows and not always I can test my work there. The point is that you need to have a `/tmp`
folder at this point.

```bash
./prepare.sh
```

## Output

```text
==================== Master Module mastery-4-2 ====================
----> Run with VM command -ea or -enableassertions for a more accurate run
----> Run with -skip to skip questions
----> Note that this mastery need the prepare.sh script to be run first.
--- 1. Primitives Revised
============
Case: Music group Fangoria was created in 1989.
The name of the group was inspired by the love the group members, Alaska and Nacho Canut have for the magazine of the same name
We'll have a look at numbers related to that magazine and explore java primitive types with it
##################
Byte - one byte - 2^8
Range from -128 to 127
If we look at the left side of the issn, we a small number.
164, is however, too big for the maximum allowed value for a byte.
In this case, we can use its octed representation, which in turn is a smaller number than a 164.
Octet radix numbers are represented with a 0 as a prefix.
This is our number as we would read it in decimal: 116
And this is what we want: 164
Note that we are able to pass a byte in the toString of Integer, just because the range of Integer covers the byte range
Also, bear in mind that primitive numbers without decimals are interpreted as integers. except for byte and short
##################
Short two bytes - 2^16
Range from -32768 to 32767
In early beginnings, Fangoria magazine wasn't selling that much.
The losses amounted to USD$20000 per issue
We cannot put this number in a byte. It just falls out of range
If we use a short though, we can safely accomodate it
This is our number as we would read it in decimal: 20000
Just for fun, we can look at its octal representation: 47040
Which if we use that in the code we get: 20000
Note that shor, just as byte, is often overlooked because it's just not common enough
However, the benefits of using primitives like these two for small numbers can represent an advantage
##################
Integer four bytes - 2^32
Range from -2147483648 to 2147483647
As reported by wikipedia, the OCLC is the Ohio College Library Center number.
We want to register this reference number for the publishing of issue 7 of Fangoria Magazine.
For this, we cannot use Short anymore. It falls out of the range needed.
We'll try with Integer.
This is our number as we would read it in decimal: 4618144
Just for fun, we can look at its octal representation: 21473640
Which if we use that in the code we get: 4618144
Important to note is again, how integer is always the type pointed out by the compiler
Especially if you look the octals, they are interpreted as int.
They only get converted when they match the range.
##################
Long eight bytes - 2^64
Range from -9223372036854775808 to 9223372036854775807
The first publication of Fangoria happened on a specific date.
We found the number in milliseconds.
If we convert that to some epoch representation, we then convert from 283996800000 to 1979-01-01T01:00
This is our number as we would read it in decimal: 283996800000
Just for fun, we can look at its octal representation: 4103741642000
Which if we use that in the code we get: 283996800000
You probably noticed that we are using L to specify that it is a long.
The compiler needs to know what do we actually mean if the number falls out of the integer range.
If it falls out of the range of Integer and we want it to be long, we specify that with an appended L or l.
##################
Float 4 bytes - 2^32
Range from 1.4E-45 to 3.4028235E38 with a min normal 1.17549435E-38
It stores up 6 to 7 significant numbers
Before continuing in this section you probably noticed a strange conversion.
A long to a float? Well that can happen simply because a long fits in a float range.
And although float occupies less amount of bytes (4) than long (8), its implementation allows this to happen.
This means that even with a float, the rule that it fits, is accepted is still valid.
The only difference is that we need to specify L if its bigger than an int.
If we convert that to some epoch representation from a float, we then convert from 283996815360,000000 to 1979-01-01T01:00:15.360
Notice that we had to upcast it to long. This is because the compiler does not understand that we are converting to a type with a lower range. Although the number fits, type float does not fit in the 
long range.
Let's imagine that 10 universes are working together.
The same thing happens in all of those 10 universes to our magazine.
The website gets 3 million visits per month
And we are calculating what would have happened if during the course of 30 years of existence, the numbers would have kept stable
In the end we get all of these hits: 1.08E10
Did you notice the f? f, means float. Without the f, the calculation would result in a numeric overflow warning from the compiler
Since one of the elements is now a float, the compiler will check if the result fits within the float range.
During runtime, well get a float as a result.
##################
Float 4 bytes - 2^32
Range from 4.9E-324 to 1.7976931348623157E308 with a min normal 2.2250738585072014E-308
In the same way with Float, we can make a calculation if we have 1.0E200 universes
Notice the d. Now we specify that the number is a double.
If the number is too big, we'll get a different lind of mathematical notation.
If we try with Infinity universes
A very high number is also considered a number, but Double specifies it as Infinity
Reminder: double values are 64 bit floating point numbers with a precision of 15 to 16 significant number digits.
Doubles range from
2.2250738585072014E-308 to 1.7976931348623157E308 in normal values
Doubles can also be: 4.9E-324 and be Infinity or -Infinity
1.08E10
1.08E209
Infinity
##################
Curiosities about primitive types:
double maxTest = 3.40282353482789473289473289477899659000892042934820984928423804e+38:
340282353482789470000000000000000000000,000000
float maxTest2 = 3.40282353482789473289473289477899659000892042934820984928423804e+38f:
340282346638528860000000000000000000000,000000
float maxTest3 = 3.40282353482789473289473289477899659000892042934820984928423804e+38f:
340282346638528860000000000000000000000,000000
double maxTest4 = 3.4028235e+38:
340282350000000000000000000000000000000,000000
double maxTest5 = 3.4028235111112222233333444444555555666666777788889999111122222e+38:
340282351111122240000000000000000000000,000000
double maxTest5 = 3.4028235111112222233333444444555555666666777788889999111122222e+38
3.4028235111112224E38
Float.MAX_VALUE:
340282346638528860000000000000000000000,000000
Double.MAX_VALUE:
17976931348623157000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000,000000
double maxTest6 = 1.79769313486231572234324324324e+308;
17976931348623157000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000,000000
Double.toString(Double.MAX_VALUE):
1.7976931348623157E308
Take-away
1. Primitive type conversion rules and ranges are not simple
2. A number without decimal is considered an integer and automatically converted to a lower range if it fits it, but only on instantiation assignment.
3. A value with a coma is considered a double. An f will specify that it is a float
4. d is needed when making calculations that result in very large numbers
5. d is also needed if our number without decimals results to be higher than long
6. f is also needed if our number without decimals results to be higher than long
7. f can take in any integer or long
8. d can take in any integer or long or float
9. Octals may not have digits higher than 8 otherwise the 0 before the number rule won't work!
--- 2. Different ways to use `this`
============
Case: In 1981, Hispavox edited and published single "Juntos" by Paloma San Basilio
Since then, this song has been sung and remixed by different artists.
We will register this event and see how can we use `this`.
The only reason why Company.this.company works is because Company is an enclosing class of Music.
Hispavox released single Juntos from Paloma San Basilio on the 1981-01-01T00:00
Take-away
1. `this` is more commonly used within a class to refer to the instance members
2. It cannot be used for static members
3. Although less common, we can use this to refer to the instance members of an enclosing class
4. Even though it looks like a static accessor, it is an instance member accessor
--- 3. The body of `switch`
============
Case: "¿A quién le importa?" is a single from 1984 sung by Alaska and Dinamara, and edited by Nacho Canut and Carlos Berlanga.
There have been a lot of switches in styles up until present for this song. Several covers.
The reason why this song is so popular is because later in the 80's, it found great recognition in marginalized groups.
Most importantly the LGBT community from spanish speaking countries.
The song gained such momentum in that community, that it is now celebrated in the same way as "I will survive" from Gloria Gaynor is.
It mainly has to do with the rebelious theme of the song in which it is said:
"Who cares as to what to I do? Who cares as to what do I say? I am like this, I will always be like this and I will never change."
In year 1984 version Alaska y Dinarama A Quién Le Importa (1984) - https://www.youtube.com/watch?v=N2L7cRsUA0E was released.
In year 2002 version Thalia - A Quien Le Importa - Video Oficial 2002 - https://www.youtube.com/watch?v=s0MG5mdwweU was released.
In year 2011 version Fangoria - A quien le importa 2011 - https://www.youtube.com/watch?v=XX_hWpPnd3I was released.
In year 2017 and month 6 version Himno World Pride Madrid 2017 - A quien le importa 2017
https://www.lasexta.com/especiales/world-pride-madrid/orgullo-lgtbi/a-quien-le-importa-asi-suena-el-himno-oficial-del-world-pride-madrid-2017_201706285953f2d20cf2a25c00ab7737.html was released.
In year 2017 and month 12 version A QUIÉN LE IMPORTA - Grupal | Gala 7 | OT 2017 - https://www.youtube.com/watch?v=hoH6OXQpmQY was released.
In year 2020 and month 6 version Rosa López · A quién le importa - 2020 - https://www.youtube.com/watch?v=NxlfzjWX2Z4 was released.
In year 2020 and month 7 version Camila Sodi - RUBÍ 2020, entrada completa a quien le importa - https://www.youtube.com/watch?v=aNMdaRbX_-k was released.
Curiosities about switch and other accolades:
        int k =0;
        for (; k < 100; k++) ;
        while(k < 100);
        do {} while (k<100);
        // Do while without a body is illegal
        // do while (k<100);
        // Switches without a body are illegal
        // switch(i);
Take-away
1. Switches must have a body!
2. Switches only accept int, short, long, byte, char, their boxed counterparts, Short, Long, Byte, Character, and String and enums as parameters.
3. do while is akin to a switch in the sense that it also cannot be done without a body.
4. for and while can be done without a body.
--- 4. The `java.desktop` module
============
Case: We want an app that lets us surf the web for short stories about Spanish music
We'll make our first prototype using the "Bandido". A famous spanish album from "Miguel Bosé" containing famous anthem "Amante bandido"
We'll use this as the name of our module: amante.bandido
Please find this module in the sources for mastery-4-3-swing and run it.
Take-away
1. Java SWING libraries, although part of the JDK, they are not part of the java.base module.
2. Because they are not part of the java.base module, they have to be required.
3. To require them, you need to require the java.desktop module. Example:
module amante.bandido {
    requires java.desktop;
    requires consolerizer;
}
--- 5. Hiding and shadowing instance members
============
Case: "Love of Lesbian" was founded in 1997.
Alaska actually started in a band called "Alaska y los Pegamoides" in 1979.
"Vetusta Morla" is another band which started in 1998.
We are going to register them and understand the concept of shadouwing of instance members.
This is band #1 -> Band{capacity=4, members=[Santi Balmes, Julián Saldarriaga, Jordi Roig, Joan Ramón Planell, Oriol Bonet], bandName='Love of Lesbian'}
This is band #2 -> QuintetBand{capacity=5}Band{capacity=4, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Carlos Berlanga], bandName='Alaska y los Pegamoides'}
This is band #3 -> GenericBand{capacity=6}Band{capacity=4, members=[Pucho, David "el Indio", Álvaro B. Baglietto, Jorge González, Guillermo Galván, Juanma Latorre], bandName='Vetusta Morla'}
We notice a few things that may sound odd.
1. Capacity is different for the subclasses of Band.
2. Capacity didn't limit the number of allowed members.
Band #1 has 4 members
Band #2 has 4 members
Band #3 has 4 members
Well, we know that for the last two bands this is not true. This is why we have our common getters.
Band #1 has 4 members
Band #2 has 5 members
Band #3 has 6 members
This is true, but do methods get overriden?
Band #1 has 4 members
Band #2 has 5 members
Band #3 has 6 members
Take-away
1. Shadowing involves covering another variable. There is no limitation on how this can be done
2. The overshadowing member will also overshadow the scope
3. Methods do get overridden regardless of @Override
4. Capacity in an ArrayList only means that the initial capacity of the Array is fixed.
5. An ArrayList will change size automatically. Capacity is just used in performance and memory usage fine tuning.
--- 6. Bypassing overloading methods with different return types
============
Case: We want to go one of the "La casa azul" concerts.
Time is running out to book them, we don't know to which one we can go to.
So we decide to buy a bunch of them.
Our first ticket is -> Ticket{venue='El Ejido, ES', ticketNumber='ES23424ES23432', localDateTime=2019-04-27T00:00}
Our second ticket is -> Ticket{venue='El Ejido, ES', ticketNumber='123232341342312', localDateTime=2019-04-27T00:00}
Our third ticket is -> Ticket{venue='Seville, ES', ticketNumber='193874567394857', localDateTime=2019-06-29T00:00}
We have all the tickets for "La casa azul":
[ES23424ES23432, 123232341342312, 193874567394857]
Some of them are just numbers:
[123232341342312, 193874567394857]
We realize that we can only go to the latest one!
Let's unregister te last two tickets
We've unregistered tickets
Ticket{venue='El Ejido, ES', ticketNumber='ES23424ES23432', localDateTime=2019-04-27T00:00}
and
Ticket{venue='El Ejido, ES', ticketNumber='123232341342312', localDateTime=2019-04-27T00:00}
We finally should only have one ticket in our reservation:
[193874567394857]
Hurrah! We are going to Seville, ES to watch La casa azul with ticket 193874567394857 on the 2019-06-29T00:00
Take-away
1. Methods can be overloaded if their parameters are different both in number and in types
2. The compiler cannot tell two methods apart if they differ only in their return type
3. This makes sense because if you call a method and do not assign its return value, you also would not be able to tell which method should be called would you?
4. By the previous point we can also infer that parameter naming will not play a role in overloading since we don't call methods via their parameters name in Java... Not yet at least 😊
--- 7. Immutability standards and using `LocalDate` and `LocalDateTime`
============
Case: Alaska started a show in 1984 based on the writings of Dolores Rico Oliver called "La bola de cristal".
"La bola de cristal", if yo haven't guessed already means "The cristal ball"
Cristal balls are always portrayed the same way
They are magic and they give information about the past, the present and the future.
Each cristal ball is also unique, but how do cristal balls make sure they are not tampered with?
In other words, what makes cristal balls immutable?
For our case we are just interested on the first 5 requirements for security guidelines 6 on Mutable classes: https://www.oracle.com/java/technologies/javase/seccodeguide.html
This is the Cristal Ball of Episode I
CristalBall{host='Alaska', localDate=1986-10-06, localDateTime=1986-10-06T00:00, date=Mon Oct 06 00:00:00 CET 1986, band=Band{capacity=4, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Ca
rlos Berlanga], bandName='Alaska y los Pegamoides'}, priv=sun.security.provider.DSAPrivateKey@fff269da, comment='null'}
We can get the from the available ones
Alaska
We can get it from the available ones
CristalBall{host='Alaska', localDate=1986-10-06, localDateTime=1986-10-06T00:00, date=Mon Oct 06 00:00:00 CET 1986, band=Band{capacity=4, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Ca
rlos Berlanga], bandName='Alaska y los Pegamoides'}, priv=sun.security.provider.DSAPrivateKey@fff269da, comment='null'}
We can also comment it out:
And then we get a comment on our Cristal Ball
CristalBall{host='Alaska', localDate=1986-10-06, localDateTime=1986-10-06T00:00, date=Mon Oct 06 00:00:00 CET 1986, band=Band{capacity=4, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Ca
rlos Berlanga], bandName='Alaska y los Pegamoides'}, priv=sun.security.provider.DSAPrivateKey@fff269da, comment='Me encanta este show! Super guay!!'}
And if we check if this is immutable:
We get that
Alaska had a band:
Band{capacity=4, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Carlos Berlanga], bandName='Alaska y los Pegamoides'}
and the pilot show aired on spanish television on the:Mon Oct 06 00:00:00 CET 1986
Mon Oct 06 00:00:00 CET 1986
1986-10-06
1986-10-06T00:00 
Let's tamper that and see if we can change it!
Note that LocalDate and LocalDateTime are already immutable
We did change the date objects and the capacity.
From the outside we get the impression that we changed our original cristal ball:
We get that
Alaska had a band:
Band{capacity=1000, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Carlos Berlanga], bandName='Alaska y los Pegamoides'}
and the pilot show aired on spanish television on the:Wed Oct 06 00:00:00 CEST 2100
Thu Jan 01 01:00:00 CET 1970
1986-10-06
1986-10-06T00:00 
But from the inside we see that nothing has changed:
We get that
Alaska had a band:
Band{capacity=4, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Carlos Berlanga], bandName='Alaska y los Pegamoides'}
and the pilot show aired on spanish television on the:Mon Oct 06 00:00:00 CET 1986
Mon Oct 06 00:00:00 CET 1986
1986-10-06
1986-10-06T00:00 
If we make a copy of it, we can use our method. Remember that we made a copy method to make a copy easy and follow the secuirty guidelines:
This is our copy:
CristalBall{host='Alaska', localDate=1986-10-06, localDateTime=1986-10-06T00:00, date=Mon Oct 06 00:00:00 CET 1986, band=Band{capacity=4, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Ca
rlos Berlanga], bandName='Alaska y los Pegamoides'}, priv=sun.security.provider.DSAPrivateKey@ffee1843, comment='Me encanta este show! Super guay!!'}
Take-away
1. We followed the Java Security Guidelines for Mutability from point 1 to 5, which are the most common
1.1 Guideline 6-1 / MUTABLE-1: Prefer immutability for value types
1.2 Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
1.3 Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values
1.4 Guideline 6-4 / MUTABLE-4: Support copy functionality for a mutable class
1.5 Guideline 6-5 / MUTABLE-5: Do not trust identity equality when overridable on input reference objects
--- 8. Overwriting with `FileOutputStream`
============
Case: "Sueño su boca" was the first big hit of Raúl Cuenca in Spain.
In the year 2000, this hit was being played all across spanish speaking countries and the rest of the latin world.
You want to save the lyrics and made it through to copying them to one friend
Now you you are making the second copy you make a mistake and only copy a bit of it to the same destination file.
Will there be a change?.
from https://genius.com/Raul-sueno-su-boca-lyrics
Paso firme y elegante, la mirada interesante
Van temblando las aceras, al pasar de sus caderas
Yo la observo cada día cuando cruza por mi calle
Y construye fantasías, de locuras y de amantes
Y yo no puedo entender, que me pasa con esa mujer
Hace tanto que sueño su boca
Que la vida se me ha vuelto loca
Cada noche imagino sus besos
Pero despierto y la vuelvo a perder
Hace tanto que vivo por ella
Hace tanto que muero sin ella
Pero se que aunque sea en mis sueños
Yo seré dueño de su alma y su piel
Check your file contents in the file system: /tmp/raul_lyrics2.txt.
Press ENTER twice to continue...
from https://genius.com/Raul-sueno-su-boca-lyrics
Paso firme y elegante, la mirada interesante
Van t
Take-away
1. By default, FileOutputStream is configured to have the appendMode to false.
2. If appendMode is disable, the file gets overwritten.
3. Overwriting a file means that the file is written all over again.
4. When we start again, we remove all original data.
--- 9. Why use `putIfAbsent`?
============
Case: Someone in your group of friends suggested to go to the next concert of Paulina Rubio.
Unfortunatelly you cannot go.
However your friends, Paco, Lori, Nere, Cristina, Viktor, Carlos and Andrea, are really excited to go!
We need to distribute the tickets as fast as possible and store them in a map.
The best ticket is the front row one, so in spite of being best friends, they will struggle to get the best one first!
Ticket office is open!
Assigning ticket Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES1028562319', localDateTime=2010-05-08T00:00} to Lori
Assigning ticket Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0384518495', localDateTime=2010-05-08T00:00} to Paco
Assigning ticket Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0174538594', localDateTime=2010-05-08T00:00} to Nere
Assigning ticket Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES3287451065', localDateTime=2010-05-08T00:00} to Cristina
Assigning ticket Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0102956473', localDateTime=2010-05-08T00:00} to Carlos
Assigning ticket Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES6674993217', localDateTime=2010-05-08T00:00} to Viktor
Assigning ticket Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES9928465748', localDateTime=2010-05-08T00:00} to Andrea
The result is 
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES1028562319', localDateTime=2010-05-08T00:00}=Lori
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0102956473', localDateTime=2010-05-08T00:00}=Carlos
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0174538594', localDateTime=2010-05-08T00:00}=Nere
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES3287451065', localDateTime=2010-05-08T00:00}=Cristina
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0384518495', localDateTime=2010-05-08T00:00}=Paco
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES6674993217', localDateTime=2010-05-08T00:00}=Viktor
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES9928465748', localDateTime=2010-05-08T00:00}=Andrea
We would get the same result if we had used putIfAbsent:
The new result is 
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES1028562319', localDateTime=2010-05-08T00:00}=Lori
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0102956473', localDateTime=2010-05-08T00:00}=Carlos
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0174538594', localDateTime=2010-05-08T00:00}=Nere
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES3287451065', localDateTime=2010-05-08T00:00}=Cristina
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0384518495', localDateTime=2010-05-08T00:00}=Paco
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES6674993217', localDateTime=2010-05-08T00:00}=Viktor
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES9928465748', localDateTime=2010-05-08T00:00}=Andrea
These operations will not fail for non-thread safe maps:
Assigning ticAssikegnt Tiincg tickekett {venue=Tic'VkAssigaldemninetg ticoroAssiket Ticket{v{venuegni - Mng t='Valdenue='emorickeadrit o - MadValdemororid - EspTickedt{venue='Vaña - M',aldem - Eor tadrickAo - MaAssspidrid ssigning tetNumber=id - España', ticke'Eicket Ti- EgningAssaña'igning tic tispckS10tNum28562et{añckket Tick, et{vet Ta', ticketven319',ber= lue='ValNuicket{venuet=icenue=mbdeoc'ES1almorer'Valdket'Valdemoro - Madrid - España', ticketNumNumbemoro - =o - DateTim02e=2010Mad'ES10Mader='ESber='ES102rid 2856ri-05-856208d -2319',- 85612028Esp loca EspT00319', l:00}aña',lDateTime=20aña'5623319'19, 10-05-08T0 ticketNumber='ES 10o28562to N0:ticketNumbe',, l localDater='00} to Ce31calDateT9', lre
risESTime=2oc010-10tina
ocaliDa28505-08T00al:00} to And6231teTime=2010-05-08me=2T00:00}9',r ea
DateTime=2local to 010-0VikDateTim010-e=tor
5-2010-05-08T005-080:00} 08TtoT00:00}  Ca00r:0losto Lor
0} to Paco
i
The new result is also what we are looking for:
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES1028562319', localDateTime=2010-05-08T00:00}=Lori
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0102956473', localDateTime=2010-05-08T00:00}=Carlos
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0174538594', localDateTime=2010-05-08T00:00}=Nere
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES3287451065', localDateTime=2010-05-08T00:00}=Cristina
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES0384518495', localDateTime=2010-05-08T00:00}=Paco
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES6674993217', localDateTime=2010-05-08T00:00}=Viktor
Ticket{venue='Valdemoro - Madrid - España', ticketNumber='ES9928465748', localDateTime=2010-05-08T00:00}=Andrea
Take-away
1. In order to add to a hashmap in a concurrent way, we should use an atomic operation.
2. putIfAbsent performs a check if exists and add then if not, it puts an element into the map in an atomic way.
3. This, also works in a non-thread safe map.
4. For that we do not have to combine our operation with a ConcurrentHashMap which is thread safe.
--- 10. Evaluation order of conditional operators
============
Case: Pepe is a manager that loves going to concerts.
In your team, you know that he is crazy about "Vetusta Morla".
However, sometimes, Pepe forgets to say to the team that is off.
Not only that, but at the same time that "Vetusta Morla" is playing, "Sidonie" is also playing in the same week.
If any of this is true, then we know that Pepe will be off the whole November of 2011.
We'll check this:
Pepe is going to see Sidonie on the 2011-11-24T00:00
Pepe won't be coming to work this november!
Take-away
1. Logic operators such as || and && can short circuit in Java
2. Short circuiting does not imply the evaluation of all operands
3. Since they are evaluated left to right and considering mathematical precedence, the runtime knows when further evaluation is not needed
4. When not all operands are evaluated, we call this  a short-circuit
--- 11. Method overloading and overriding with `extends`
============
Case: Some of us like music "Rosario Flores" style, others prefer something more edgy like "Dorian".
We now have to manage the upcoming dates and for that we have created just one BandManager abstraction
Further we have implemented 3 different ways to override and other two to overload the BandManager method.
We'll put these methods to the test for different times of music history.
These are our bands:
Band{capacity=4, members=[Santi Balmes, Julián Saldarriaga, Jordi Roig, Joan Ramón Planell, Oriol Bonet], bandName='Love of Lesbian'}
QuintetBand{capacity=5}Band{capacity=4, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Carlos Berlanga], bandName='Alaska y los Pegamoides'}
GenericBand{capacity=6}Band{capacity=4, members=[Pucho, David "el Indio", Álvaro B. Baglietto, Jorge González, Guillermo Galván, Juanma Latorre], bandName='Vetusta Morla'}
GenericBand{capacity=1}Band{capacity=4, members=[Paulina Rubio], bandName='Paulina Rubio'}
GenericBand{capacity=1}Band{capacity=4, members=[Rosario Flores], bandName='Rosario Flores'}
Overriden called!!
Overloaded called!!
Overloaded called!!
The first maps are now ready:
{Band{capacity=4, members=[Santi Balmes, Julián Saldarriaga, Jordi Roig, Joan Ramón Planell, Oriol Bonet], bandName='Love of Lesbian'}=2020-11-30T23:06:28.289730}
{GenericBand{capacity=6}Band{capacity=4, members=[Pucho, David "el Indio", Álvaro B. Baglietto, Jorge González, Guillermo Galván, Juanma Latorre], bandName='Vetusta Morla'}=2020-11-30T23:06:28.294804}
{QuintetBand{capacity=5}Band{capacity=4, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Carlos Berlanga], bandName='Alaska y los Pegamoides'}=2020-11-30}
Adding two more artists to this new concert we get:
{GenericBand{capacity=6}Band{capacity=4, members=[Pucho, David "el Indio", Álvaro B. Baglietto, Jorge González, Guillermo Galván, Juanma Latorre], bandName='Vetusta Morla'}=2020-11-30T23:06:28.294804,
 GenericBand{capacity=1}Band{capacity=4, members=[Paulina Rubio], bandName='Paulina Rubio'}=2020-11-30T23:06:28.299761, GenericBand{capacity=1}Band{capacity=4, members=[Rosario Flores], bandName='Rosa
rio Flores'}=2020-11-30T23:06:28.299851}
Overriden called!!
Overriden called!!
Had we used the overriden methods we would have gotten:
{GenericBand{capacity=6}Band{capacity=4, members=[Pucho, David "el Indio", Álvaro B. Baglietto, Jorge González, Guillermo Galván, Juanma Latorre], bandName='Vetusta Morla'}=2020-11-30T23:06:28.302292}
and
{QuintetBand{capacity=5}Band{capacity=4, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Carlos Berlanga], bandName='Alaska y los Pegamoides'}=2020-11-30}
Take-away
1. Overloading and overriding with extends obeys some specific rules
2. The base type is the parameter you have to use in order to override
3. Subclass types of the declared base parameter always results in overloading
4. The return parameters may be subclass types
5. Since they have to be subclasses or the same, the type cannot be erased when overriding
--- 12. Immutability with Guidelines 7 and 6
============
Case: We just made a much safer Cristal Ball for Alaska to use.
Let's give it a try!.
This is our new and improved cristal ball:
CristalBall{host='Alaska', localDate=1986-10-06, localDateTime=1986-10-06T00:00, date=Mon Oct 06 00:00:00 CET 1986, band=Band{capacity=4, members=[Alaska, Nacho Canut, Ana Curra, Eduardo Benavente, Ca
rlos Berlanga], bandName='Alaska y los Pegamoides'}, priv=sun.security.provider.DSAPrivateKey@fff90d5c, comment='null'}
Note that we've made this Cristal Ball so safe that it now obeys guidelines 6 and 7!
Therefore, for this module, there isn't much to test.
Please follow the code for a better understandinf of what's happening and namely have a look at the comments.
Of course read the guidelines here -> https://www.oracle.com/java/technologies/javase/seccodeguide.html
The reason why this exception is thrown is that our SecurityManager doesn't let us exit with an error:
java.lang.RuntimeException: Ahha! Not today you are not!
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner$2.checkExit(Mastery4Dot2Runner.java:435)
	at java.base/java.lang.Runtime.exit(Runtime.java:113)
	at java.base/java.lang.System.exit(System.java:1746)
	at org.jesperancinha.java11.mastery4dot2.show.SuperCristalBall.leaveEarth(SuperCristalBall.java:147)
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.exercise12(Mastery4Dot2Runner.java:447)
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.main(Mastery4Dot2Runner.java:96)

It's magic!
Take-away
1. We've made a few tests here, but this module will not be able to cover all of guidelines 6 and 7
2. Guideline 6 is about protecting Mutability
3. Guideline 7 is about protecting Object construction
4. Some guidelines may fuse with each other
5. Some are much more important than others
6. Guideline 7-1 / OBJECT-1: Avoid exposing constructors of sensitive classes
7. Guideline 7-2 / OBJECT-2: Prevent the unauthorized construction of sensitive classes
8. Guideline 7-4 / OBJECT-4: Prevent constructors from calling methods that can be overridden
9. Guideline 7-5 / OBJECT-5: Defend against cloning of non-final classes
--- 13. `Float.POSITIVE_INFINITY` vs `Float.NEGATIVE_INFINITY`
============
Case: Vetusta Morla publish in 2020 its fith studio album entitled "Mismo Sitio Distinto Lugar - Canciones dentro de canciones".
They came up with this original concept of songs within songs.
When you find a song within a song you are really up to infinity.
We can represent the infinity of songs Vetusta Morla can make by using Float and Double.
Infinity
-Infinity
But how can we generate infinite songs?
Infinity
-Infinity
Can we use double for this?
Infinity
-Infinity
But how can we generate double infinite songs?
Infinity
-Infinity
Sounds good, but how about that overflow Exception?
Nope, no Longs allowed! -> java.lang.ArithmeticException: / by zero
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.exercise13(Mastery4Dot2Runner.java:375)
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.main(Mastery4Dot2Runner.java:97)
Ok... and ints?
Nope, no ints either! -> java.lang.ArithmeticException: / by zero
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.exercise13(Mastery4Dot2Runner.java:381)
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.main(Mastery4Dot2Runner.java:97)
Shorts?
Shorts also won't do! -> java.lang.ArithmeticException: / by zero
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.exercise13(Mastery4Dot2Runner.java:387)
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.main(Mastery4Dot2Runner.java:97)
Then I guess Byte won't also work?
Bingo! -> java.lang.ArithmeticException: / by zero
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.exercise13(Mastery4Dot2Runner.java:393)
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.main(Mastery4Dot2Runner.java:97)
Take-away
1. There infinity representations for Float and Double calculations
2. Numbers without decimals cannot make a division by zero
3. Division by zero with Float and Double are akin to ∞ (infinity) in math.
--- 14. Static and instance initialization of final `members`
============
Case: We know that the band Dorian is mostly classified as being an Indie pop group.
We'll create its registry and see the many different ways we can initialize final values.
Have a look in the code. All these fields are mandatory and cannot change because they are final
This is our band Indie{harshVoice=false, sweetVoice=true, huskyVoice=true, digitalInstruments=true, name='Dorian', indieMusic=true}
Take-away
1. All final fields have to be initialized
2. There is no difference in this mandatory action between static and instance members
3. Members can be initialized using accolades
4. There isn't a lot of reasons to use accolades this way. Just know that they work
--- 15. Iterating through a `CopyOnWriteArrayList` and the `UnsupportedOperationException`
============
Case: Someone is compiling songs of the band Dorian for you.
Your other half is waiting impatiently for the mix result.
You keep getting a list, always updated, but you have to read it at the same time its being filled.
It's hard to keep up, and so you decide to make multiple reads.
This is our possible list:
Buenas Intenciones,Duele,La Tormenta de Arena,Los Amigos que Perdí,El Futuro no es de Nadie,Vicios y Defectos,Tristeza,A Cualquier Otra parte,Te Echamos de Menos (Undo Remix),Horas Bajas (Undo Remix),
El Temblor (Lovo Remix),Verte Amanecer
Got song A Cualquier Otra parte
One Iteration done!
Got song A Cualquier Otra parte
Got song Buenas Intenciones
Got song Duele
Got song El Futuro no es de Nadie
Got song El Temblor (Lovo Remix)
One Iteration done!
Got song A Cualquier Otra parte
Got song Buenas Intenciones
Got song Duele
Got song El Futuro no es de Nadie
Got song El Temblor (Lovo Remix)
Got song Horas Bajas (Undo Remix)
Got song La Tormenta de Arena
Got song Los Amigos que Perdí
Got song Te Echamos de Menos (Undo Remix)
Got song Tristeza
Got song Verte Amanecer
Got song Vicios y Defectos
Last iteration done!
No exception has occurred and everything went well.
Can we change the list with this iterator though?
We cannot! And this is because this iterator is working with an array that is allowed to be copied and discarded -> java.lang.UnsupportedOperationException
	at java.base/java.util.concurrent.CopyOnWriteArrayList$COWIterator.remove(CopyOnWriteArrayList.java:1120)
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.exercise15(Mastery4Dot2Runner.java:322)
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.main(Mastery4Dot2Runner.java:99)
Take-away
1. CopyOnWriteArrayList make a copy on every write operation
2. This way, there will be no concurrent type of exception thrown
3. The iterator of this type of List's does not support modifications
--- 16. NavigableMap and `pollLastEntry` and `pollFirstEntry`
============
Case: "Supersubmarina" is a band from Spain.
In 2008 and 2009, they've edited their first two EP(Extended Play)s
You'll show these vinyls to your friends
And then you will lend them
Ciento cero is Cientocero,Elástica galáctica,No es así,Cientocero (english),Cientocero (maqueta)
Supersubmarina is Supersubmarina,Ana,Supersubmarina,OCB
Let's tail this from Cientocero:
{Cientocero=[Cientocero, Elástica galáctica, No es así, Cientocero (english), Cientocero (maqueta)], Supersubmarina=[Supersubmarina, Ana, Supersubmarina, OCB]}
And now from Supersubmarina:
{Supersubmarina=[Supersubmarina, Ana, Supersubmarina, OCB]}
Let's head this from Cientocero:
{}
And now from Supersubmarina:
{Cientocero=[Cientocero, Elástica galáctica, No es así, Cientocero (english), Cientocero (maqueta)]}
We just took out the first album: Cientocero=[Cientocero, Elástica galáctica, No es así, Cientocero (english), Cientocero (maqueta)]
So the our album collection looks like this: {Supersubmarina=[Supersubmarina, Ana, Supersubmarina, OCB]}
We just took out the last album: Supersubmarina=[Supersubmarina, Ana, Supersubmarina, OCB]
So the our album collection should be empty now: {}
Take-away
1. Navigable maps are very simple
2. Important methods are pollFirstEntry, pollLastEntry, tailMap and headMaps
3. Head is exclusive, whiile tail is inclusive
--- 17. `writeUTF` and where it is possible with `BufferedWriter` and `FileOutputWriter`
============
Case: In the year 2000, spanish singer, Monica Naranjo, came into the music scene with her hit "Sobreviviré"
Given the raw energy of the lyrics of the songs and its meaning, "Sobreviviré" became an anthem of those who fight to be understood and accepted
In the video, Monica Naranjo depics just that.
We want to copy these lyrics from the source to new files.
We will do this in two ways. One with a BufferedWriter and the other with a FileOutputStream.
We just read the lyrics
from https://www.letras.mus.br/monica-naranjo/130411/
Tengo el ansia de la juventud
tengo miedo lo mismo que tú
Y cada amanecer me derrumbo al ver
La puta realidad
No hay en el mundo, no
Nadie más frágil que yo

Pelo acrílico, cuero y tacón
Maquillaje hasta en el corazón
Y al anochecer vuelve a florecer
Lúbrica la ciudad
No hay en el mundo, no
Nadie más dura que yo
We will now write this to file in UTF(Unicode Transformation Format) /tmp/mn1.txt
We just read this from file /tmp/mn1.txt
from https://www.letras.mus.br/monica-naranjo/130411/
Tengo el ansia de la juventud
tengo miedo lo mismo que tú
Y cada amanecer me derrumbo al ver
La puta realidad
No hay en el mundo, no
Nadie más frágil que yo

Pelo acrílico, cuero y tacón
Maquillaje hasta en el corazón
Y al anochecer vuelve a florecer
Lúbrica la ciudad
No hay en el mundo, no
Nadie más dura que yo
We just read this from file /tmp/mn2.txt
UTF-from https://www.letras.mus.br/monica-naranjo/130411/
Tengo el ansia de la juventud
tengo miedo lo mismo que tú
Y cada amanecer me derrumbo al ver
La puta realidad
No hay en el mundo, no
Nadie más frágil que yo

Pelo acrílico, cuero y tacón
Maquillaje hasta en el corazón
Y al anochecer vuelve a florecer
Lúbrica la ciudad
No hay en el mundo, no
Nadie más dura que yo
Take-away
We just read this from file /tmp/mn3.txt
from https://www.letras.mus.br/monica-naranjo/130411/
Tengo el ansia de la juventud
tengo miedo lo mismo que tú
Y cada amanecer me derrumbo al ver
La puta realidad
No hay en el mundo, no
Nadie más frágil que yo

Pelo acrílico, cuero y tacón
Maquillaje hasta en el corazón
Y al anochecer vuelve a florecer
Lúbrica la ciudad
No hay en el mundo, no
Nadie más dura que yo
1. We can specify UTF with FileWriter, OutputStreamWriter and with ObjectOutputStream
2. It is not mandatory to specify UTF with Writers. CharSet is optional
3. In the OutputStream we have methods that can write in UTF directly (writeUTF)
--- 18. `Arrays` `binarySearch`
============
Case: We have compiled a list of of all Lori Meyers albums we know
Lori Meyers started in 1998. You are now in possession of a lot of their records.
Now you want to organize them!.
Our record collection is:
[Viaje de estudios, Hostal Pimodán, Hostal Pimodán (reedición), Cronolánea, Viaje de estudios (reedición), Cuando el destino nos alcance, Impronta]
Our insertion point results in -7. This result makes no sense, purely because our array isn't sorted
After sorting, our record collection is:
[Cronolánea, Cuando el destino nos alcance, Hostal Pimodán, Hostal Pimodán (reedición), Impronta, Viaje de estudios, Viaje de estudios (reedición)]
Once sorted, we finally have insertion point -3. This is correct
Take-away
1. In order to make binarySearch for Arrays, we have to sort them first
2. Sorting arrays and therefore being able to perform a faster and more accurate binary search isn't specific to Java
3. The insertion point is an index. It is describe as a negative number
--- 19. `try-with-resources` `open` and `close` methods.
============
Case: We are at the end of our mastery module
If you noticed, drums are a part of almost all spanish music
We'll play one as a closeable instrument. Enjoy!
🥁 ¡Drums created! 🥁
Playing drums
 Oh no! I think I hit the wrong drum!
Keep playing and let the rhythm guide you! João Esperancinha
 It's all good! We failed to play, closing failed and this is expected -> org.jesperancinha.java11.mastery4dot2.instrument.DrumException: Drums failed!
	at org.jesperancinha.java11.mastery4dot2.instrument.Drums.playWrongDrum(Drums.java:17)
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.exercise19(Mastery4Dot2Runner.java:118)
	at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.main(Mastery4Dot2Runner.java:103)
	Suppressed: org.jesperancinha.java11.mastery4dot2.instrument.DrumsIOException: Drums failed closing!
		at org.jesperancinha.java11.mastery4dot2.instrument.Drums.close(Drums.java:23)
		at org.jesperancinha.java11.mastery4dot2.Mastery4Dot2Runner.exercise19(Mastery4Dot2Runner.java:116)
		... 1 more
Take-away
1. We can use try-with-resources even after we've created our autocloseable instance
2. A suppressed exception occurs when closing fails
3. The suppressed exception is the closing exception when one is thrown in the try block
4. The main exception is the one thrown during the try scope
5. If no exception is thrown during the try block, no suppressed exception is thrown
🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄
Hope you enjoyed this mastery into Java 11 with some Spanish Indie/Pop flavor to it.
Please keep coming back as I'll be creating more mastery modules.
Thank you!
🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄🦄

Process finished with exit code 0
```

## References

- [Implementig a Class Loader](https://docstore.mik.ua/orelly/java-ent/security/ch03_04.htm)
- [Installing Your Security Manager](https://www.cis.upenn.edu/~bcpierce/courses/629/papers/Java-tutorial/networking/security/installSMgr.html)
- [Writing a Security Manager](https://www.cis.upenn.edu/~bcpierce/courses/629/papers/Java-tutorial/networking/security/writingSMgr.html)
- [SecurityManager checkPackageAccess() Method](https://www.tutorialspoint.com/java/lang/securitymanager_checkpackageaccess.htm)
- [Rapid Tables](https://www.rapidtables.com/convert/number/decimal-to-octal.html)
- [Definition of Double in C, C++ and C#](https://www.thoughtco.com/definition-of-double-958065#:~:text=Double%20vs.&text=Its%20range%20is%20approximately%201.5,to%201.7%20%C3%97%2010308.)
- [Size of Floats](https://chortle.ccsu.edu/java5/Notes/chap11/ch11_2.html)
- [Java Security Practices Code Guide](https://www.oracle.com/java/technologies/javase/seccodeguide.html)
- [Naming of Automatic Module](https://www.tutorialspoint.com/what-are-automatic-modules-in-java-9)
- [Primitive Data Types by Docs@Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Java: Primitive data types](https://cs.fit.edu/~ryan/java/language/java-data.html)
- [Examples of Formatting Float or Double Numbers to String in Java](https://www.java67.com/2014/06/how-to-format-float-or-double-number-java-example.html)
- [Floating-Point Types, Formats, and Values](https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.2.3)

---

- [Lori Meyers](https://en.wikipedia.org/wiki/Lori_Meyers)
- [Sobreviviré (canción)](https://es.wikipedia.org/wiki/Sobrevivir%C3%A9_(canci%C3%B3n))
- [Sobreviviré - Monica Naranjo](https://www.letras.mus.br/monica-naranjo/130411/)
- [Supersubmarina](https://es.wikipedia.org/wiki/Supersubmarina)
- [TOP 15 MEJORES CANCIONES DE DORIAN](https://culturadiversa.es/2018/05/mejores-canciones-de-dorian.html)
- [Dorian_(banda)](https://es.wikipedia.org/wiki/Dorian_(banda))
- [Vetusta Morla y la infinidad de canciones que hay en una canción](https://www.elindependiente.com/tendencias/musica/2020/06/13/vetusta-morla-y-la-infinidad-de-canciones-que-hay-en-una-cancion/)
- [Rosario Flores](https://en.wikipedia.org/wiki/Rosario_Flores)
- [Paulina Rubio](https://nl.wikipedia.org/wiki/Paulina_Rubio)
- [Sidonie (2011) Teatro Circo Price. Madrid](https://www.mercadeopop.com/sidonie-2011-teatro-circo-price-madrid/)
- [Vetusta Morla en Concierto en Granada](https://www.granadamarcha.com/2011/11/07/vetusta-morla-en-concierto-en-granada/)
- [Arranca la gira española de Paulina Rubio](https://www.20minutos.es/noticia/700639/0/paulina/rubio/gira/)
- [Raúl - Sueño su boca](https://genius.com/Raul-sueno-su-boca-lyrics)
- [Raúl Fuentes Cuenca](https://en.wikipedia.org/wiki/Ra%C3%BAl_Fuentes_Cuenca)
- [La Bola de Cristal](https://en.wikipedia.org/wiki/La_Bola_de_Cristal)
- [La Casa Azul](https://en.wikipedia.org/wiki/La_Casa_Azul)
- [Alaska y los Pegamoides](https://es.wikipedia.org/wiki/Alaska_y_los_Pegamoides)
- [Vetusta Morla](https://es.wikipedia.org/wiki/Vetusta_Morla)
- [La Casa Azul](https://nl.wikipedia.org/wiki/La_Casa_Azul)
- [Love of Lesbian](https://en.wikipedia.org/wiki/Love_of_Lesbian)
- [RUBÍ 2020, entrada completa a quien le importa](https://www.youtube.com/watch?v=aNMdaRbX_-k)
- [Rosa López · A quién le importa - 2020](https://www.youtube.com/watch?v=NxlfzjWX2Z4)
- [A QUIÉN LE IMPORTA - Grupal | Gala 7 | OT 2017](https://www.youtube.com/watch?v=hoH6OXQpmQY)
- [Himno World Pride Madrid 2017 - A quien le importa 2017](https://www.lasexta.com/especiales/world-pride-madrid/orgullo-lgtbi/a-quien-le-importa-asi-suena-el-himno-oficial-del-world-pride-madrid-2017_201706285953f2d20cf2a25c00ab7737.html)
- [Fangoria - A quien le importa 2011](https://www.youtube.com/watch?v=XX_hWpPnd3I)
- [Thalia - A Quien Le Importa - Video Oficial 2002](https://www.youtube.com/watch?v=s0MG5mdwweU)
- [Alaska y Dinarama A Quién Le Importa (1984)](https://www.youtube.com/watch?v=N2L7cRsUA0E)
- [¿A quién le importa?](https://en.wikipedia.org/wiki/%C2%BFA_qui%C3%A9n_le_importa%3F)
- [Paloma San Basilio](https://nl.wikipedia.org/wiki/Paloma_San_Basilio)
- [Juntos Sencillo Paloma San Basilio @ Chordify](https://chordify.net/chords/juntos-sencillo-juntos-paloma-san-basilio-arturo-baez-velasquez)
- [Juntos (canción)](https://es.wikipedia.org/wiki/Juntos_(canci%C3%B3n))
- [Analysis of Fangoria by Prezi](https://prezi.com/goxtiwbslbm1/analysis-of-fangoria/)
- [The Bloody History of Fangoria, the Magazine That Changed the Way We View Horror Movies](https://www.mentalfloss.com/article/560144/how-fangoria-magazine-changed-horror-movies)
- [Fangoria magazine](https://en.wikipedia.org/wiki/Fangoria)
- [Fangoria band](https://en.wikipedia.org/wiki/Fangoria_(band))

<div align="center">
      <a href="https://www.youtube.com/watch?v=qSkcpM0zDnU">
         <img 
              src="https://img.youtube.com/vi/qSkcpM0zDnU/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=bt-92dlspc4">
         <img 
              src="https://img.youtube.com/vi/bt-92dlspc4/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=WbC2U48HhvQ">
         <img 
              src="https://img.youtube.com/vi/WbC2U48HhvQ/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=hDYNkas2z88">
         <img 
              src="https://img.youtube.com/vi/hDYNkas2z88/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=N1uTrIJCAOU">
         <img 
              src="https://img.youtube.com/vi/N1uTrIJCAOU/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=KKNwl0s6ap0">
         <img 
              src="https://img.youtube.com/vi/KKNwl0s6ap0/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=WdvKgZVgWWg">
         <img 
              src="https://img.youtube.com/vi/WdvKgZVgWWg/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=juNxwa6H3lI">
         <img 
              src="https://img.youtube.com/vi/juNxwa6H3lI/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=zvj1Lv9mVKw">
         <img 
              src="https://img.youtube.com/vi/zvj1Lv9mVKw/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=mTo7MiVDkPU">
         <img 
              src="https://img.youtube.com/vi/mTo7MiVDkPU/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=eHeRVD0Q_ig">
         <img 
              src="https://img.youtube.com/vi/eHeRVD0Q_ig/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=OnQeexb8bB8">
         <img 
              src="https://img.youtube.com/vi/OnQeexb8bB8/0.jpg" 
              style="width:10%;">
      </a>
</div>

<div align="center">
      <a href="https://www.youtube.com/watch?v=XX_hWpPnd3I">
         <img 
              src="https://img.youtube.com/vi/XX_hWpPnd3I/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=9DUokHPG5G8">
         <img 
              src="https://img.youtube.com/vi/9DUokHPG5G8/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=t3RzZHWmbBw">
         <img 
              src="https://img.youtube.com/vi/t3RzZHWmbBw/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=smfo5w7sKMY">
         <img 
              src="https://img.youtube.com/vi/smfo5w7sKMY/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=PaHaA7fQPKA">
         <img 
              src="https://img.youtube.com/vi/PaHaA7fQPKA/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=o2tLprSl14U">
         <img 
              src="https://img.youtube.com/vi/o2tLprSl14U/0.jpg" 
              style="width:10%;">
      </a>
</div>

<div align="center">
      <a href="https://www.youtube.com/watch?v=mNIuVRgnOWc">
         <img 
              src="https://img.youtube.com/vi/mNIuVRgnOWc/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=vng7HCs2fbE">
         <img 
              src="https://img.youtube.com/vi/vng7HCs2fbE/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=aa-NtA22sHc">
         <img 
              src="https://img.youtube.com/vi/aa-NtA22sHc/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=svvNRwAS8fY">
         <img 
              src="https://img.youtube.com/vi/svvNRwAS8fY/0.jpg" 
              style="width:10%;">
      </a>
</div>
<div align="center">
      <a href="https://www.youtube.com/watch?v=TRUHtSqZEG0">
         <img 
              src="https://img.youtube.com/vi/TRUHtSqZEG0/0.jpg" 
              style="width:10%;">
      </a>
      <a href="https://www.youtube.com/watch?v=xErS7G3-tCQ">
         <img 
              src="https://img.youtube.com/vi/xErS7G3-tCQ/0.jpg" 
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
