

Given a positive integer number (eg 42) determine
its Roman numeral representation as a String (eg "XLII").

You cannot write numerals like IM for 999.
Wikipedia states "Modern Roman numerals are written by
expressing each digit separately starting with the
leftmost digit and skipping any digit with a value of zero."

Examples:


| | | | |
|:-----------|:-------------|:--------------|:-----------|
|1 ->    "I" | 10 ->    "X" | 100 ->    "C" | 1000 ->    "M"|
|2 ->   "II" | 20 ->   "XX" | 200 ->   "CC" | 2000 ->   "MM"|
|3 ->  "III" | 30 ->  "XXX" | 300 ->  "CCC" | 3000 ->  "MMM"|
|4 ->   "IV" | 40 ->   "XL" | 400 ->   "CD" | 4000 -> "MMMM"|
|5 ->    "V" | 50 ->    "L" | 500 ->    "D" |  |
|6 ->   "VI" | 60 ->   "LX" | 600 ->   "DC" ||
|7 ->  "VII" | 70 ->  "LXX" | 700 ->  "DCC" ||
|8 -> "VIII" | 80 -> "LXXX" | 800 -> "DCCC" ||
|9 ->   "IX" | 90 ->   "XC" | 900 ->   "CM" ||


| | | 
|:-----------|:-------------|
|1990 -> "MCMXC" | (1000 -> "M"  + 900 -> "CM" + 90 -> "XC")|
|2008 -> "MMVIII" |(2000 -> "MM" + 8 -> "VIII")|
|  99 -> "XCIX"   |(90 -> "XC" + 9 -> "IX")|
| 47 -> "XLVII"  |(40 -> "XL" + 7 -> "VII")|





Given a Roman number as a string (eg "XX") determine
its integer value (eg 20).

You cannot write numerals like IM for 999.
Wikipedia states "Modern Roman numerals are written by
expressing each digit separately starting with the
leftmost digit and skipping any digit with a value of zero."

Examples:

| | | | |
|:-----------|:-------------|:--------------|:-----------|
|  "I" -> 1 |    "X" -> 10 |    "C" -> 100 |    "M" -> 1000 |
| "II" -> 2 |   "XX" -> 20 |   "CC" -> 200 |   "MM" -> 2000 |
| "III" -> 3 |  "XXX" -> 30 |  "CCC" -> 300 |  "MMM" -> 3000 |
|  "IV" -> 4 |   "XL" -> 40 |   "CD" -> 400 | "MMMM" -> 4000 |
|   "V" -> 5 |    "L" -> 50 |    "D" -> 500 | |
|  "VI" -> 6 |   "LX" -> 60 |   "DC" -> 600 | |
| "VII" -> 7 |  "LXX" -> 70 |  "DCC" -> 700 | |
|"VIII" -> 8 | "LXXX" -> 80 | "DCCC" -> 800 | |
|  "IX" -> 9 |   "XC" -> 90 |   "CM" -> 900 | |


| | | 
|:-----------|:-------------|
| "MCMXC" -> 1990 |("M" -> 1000 + "CM" -> 900 + "XC" -> 90)|
|"MMVIII" -> 2008 |("MM" -> 2000 + "VIII" -> 8)|
|  "XCIX" -> 99   |("XC" -> 90 + "IX" -> 9)|
| "XLVII" -> 47   |("XL" -> 40 + "VII" -> 7)|


