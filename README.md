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
