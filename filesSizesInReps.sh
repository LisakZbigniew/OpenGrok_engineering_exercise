#!/bin/bash
for file in $@
do  
    echo "Analysing: ./$file  ..."
    ./listFileSizes.sh "./$file" '*.java' > "$file.csv"
done
