#!/bin/bash

echo "Removing old files!"
rm /tmp/fishers-link.txt
rm /tmp/fishers-link2.txt
rm /tmp/fishers-world.txt
rm /tmp/fishersCatch.obj
rm /tmp/mastery3.3.obj
rm /tmp/bacalhau.a.bras.txt
echo "Done!"
echo "Copying Bacalhau à Brás recipe file \"bacalhau.a.bras.txt\" to /tmp"
cp ./docs/*.* /tmp
ls -l /tmp/bacalhau.a.bras.txt
echo "Done!"
