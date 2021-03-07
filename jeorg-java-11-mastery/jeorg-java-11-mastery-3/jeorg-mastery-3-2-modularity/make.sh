#!/bin/bash

javac -encoding utf-8 --module-source-path src/main:../../../jtd-the-factory/consolerizer/src/main  -d out -m cataplana
java -p out -m cataplana/org.jesperancinha.java11.mastery3dot2.Mastery3Dot2ModularityRunner
jar --create --file jars/cataplana.jar -C out .
jdeps jars/cataplana.jar
