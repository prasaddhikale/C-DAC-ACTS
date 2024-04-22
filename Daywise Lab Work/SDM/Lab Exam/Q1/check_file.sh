#!/bin/bash

filename="abc.txt"

# Check if the file exists
if find . -type f -name "$filename" | grep -q "$filename"; then
    echo "File $filename exists in the current directory or its subdirectories."
else
    echo "File $filename does not exist."
fi
