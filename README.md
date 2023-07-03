# codeWarsExercises
Repositório para guardar exercícios de logica do CodeWars. <br>
Abaixo estão o enunciado de cada exercício neste repostório.

## BreakCamalCase
Complete the solution so that the function will break up camel casing, using a space between words.

<strong>Example</strong>
```
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
```
<br>
<br>

## Build Tower
Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.

For example, a tower with 3 floors looks like this:
```
[
  "  *  ",
  " *** ", 
  "*****"
]
```
And a tower with 6 floors looks like this:
```
[
  "     *     ", 
  "    ***    ", 
  "   *****   ", 
  "  *******  ", 
  " ********* ", 
  "***********"
]
```
<br>
<br>

## Create Phone Number

Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

<strong>Example</strong>
```java
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
```
The returned format must be correct in order to complete this challenge.

Don't forget the space after the closing parentheses!
<br>
<br>
## ConvertStringToCamelCase

Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

<strong>Examples</strong> 
<br>
```"the-stealth-warrior"``` gets converted to ```"theStealthWarrior"```

```"The_Stealth_Warrior"``` gets converted to ```"TheStealthWarrior"```

```"The_Stealth-Warrior"``` gets converted to ```"TheStealthWarrior"```
<br>
<br>
## DuplicateEncoder
The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

<strong> Examples </strong>
```
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 
````
<strong>Notes</strong> <br>
Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
<br>
<br>

## Get the Middle Character
You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

<strong>Examples:</strong>
```
Kata.getMiddle("test") should return "es"

Kata.getMiddle("testing") should return "t"

Kata.getMiddle("middle") should return "dd"

Kata.getMiddle("A") should return "A"
```
<strong>Input</strong>

A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.

<strong>Output</strong>

The middle character(s) of the word represented as a string.
<br>
<br>
## Persistent Bugger
Write a function, persistence, that takes in a positive parameter `num` and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

For example <strong>(Input --> Output)</strong>:
```
39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)
```
## Vowel Count
Return the number (count) of vowels in the given string.

We will consider `a`, `e`, `i`, `o`, `u` as vowels for this Kata (but not `y`).

The input string will only consist of lower case letters and/or spaces.
<br>
<br>
## Printer Errors
In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from ``a to m``.

The colors used by the printer are recorded in a control string. For example a "good" control string would be ``aaabbbbhaijjjm`` meaning that the printer used three times color a, four times color b, one time color h then one time color a...

Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. ``aaaxbbbbyyhwawiwjjjwwm`` with letters not from ``a to m``.

You have to write a function ``printer_error`` which given a string will return the error rate of the printer as a <strong>string</strong> representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.

The string has a length greater or equal to one and contains only letters from ``a`` to ``z``.

<strong>Examples:</strong>
```
s="aaabbbbhaijjjm"
printer_error(s) => "0/14"

s="aaaxbbbbyyhwawiwjjjwwm"
printer_error(s) => "8/22"
```
## Sort the Odd
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions. <br>
<strong>Exemples</strong>
```
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
```
