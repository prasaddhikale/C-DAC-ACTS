#!/bin/bash

# Create a directory called 'one'
mkdir one

# Create any 2 files in the 'one' directory
touch one/Hello.txt
touch one/World.txt

# Create a directory called 'two' inside 'one'
mkdir one/two

# Copy the 2 files from 'one' to 'two'
cp one/Hello.txt one/two/
cp one/World.txt one/two/
