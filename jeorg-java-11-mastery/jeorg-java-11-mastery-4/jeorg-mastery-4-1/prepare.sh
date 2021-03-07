#!/bin/bash

echo "Copying Pentagon exercise files to /tmp"
rm /tmp/pentagon_paper1.txt
rm /tmp/pentagon_paper2.txt
rm /tmp/pentagon_paper3.txt
cp ./docs/*.* /tmp
rm -r /tmp/tmp
ls -l /tmp/pentagon_paper1.txt
ls -l /tmp/pentagon_paper2.txt
ls -l /tmp/pentagon_paper3.txt
mkdir /tmp/tmp
echo "Done!"
