Problem Statement

John wrote a sequence of words in CamelCase as a string s, having the following properties:

The string is a concatenation of one or more English words.
The first word is entirely in lowercase.
For every subsequent word, the first character is uppercase and the remaining characters are lowercase.
Given s, print each word on a new line after converting:

Every uppercase character to lowercase.
Every lowercase character to uppercase.
Input Format

A single line containing the CamelCase string s.

Output Format

Print each converted word on a separate line.

Constraints

1 ≤ |s| ≤ 105

📄
Sample Test Cases

Input:
oneTwoThree
Expected Output:
ONE
tWO
tHREE
Input:
saveChangesInTheEditor
Expected Output:
SAVE
cHANGES
iN
tHE
eDITOR
