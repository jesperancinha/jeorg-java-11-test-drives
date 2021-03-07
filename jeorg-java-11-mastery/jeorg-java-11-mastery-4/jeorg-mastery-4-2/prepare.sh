#!/bin/bash

echo "Copying lyric files to /tmp"
rm /tmp/raul_lyrics.txt
rm /tmp/monica_naranjo_lyrics.txt
cp ./docs/*.* /tmp
ls -l /tmp/raul_lyrics.txt
ls -l /tmp/monica_naranjo_lyrics.txt
echo "Done!"
