1. Problem Statement

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


2. Quality Filter Cleanup
easy
12
81.0%
arrays
implementation
Problem Statement:

A manufacturing unit stores the quality score of N products in an array. A product is considered acceptable only if its score is greater than or equal to a given threshold K.

Remove every product score that is strictly less than K and print the remaining scores in their original order.

Special Case:

If no element remains after filtering, print -1.

Input Format:

The first line contains an integer N.
The second line contains N space-separated integer quality scores.
The third line contains the threshold K.
Output Format:

Print all scores greater than or equal to K in their original order. If none remain, print -1.

Constraints:

1 ≤ N ≤ 1000
-109 ≤ arr[i], K ≤ 109
Sample Input 1:

8
72 41 90 55 38 55 81 49
55
Sample Output 1:

72 90 55 55 81
Sample Input 2:

5
10 20 30 40 50
60
Sample Output 2:

-1
Example 1:
Input
⧉
8
72 41 90 55 38 55 81 49
55
Output
⧉
72 90 55 55 81
Example 2:
Input
⧉
5
10 20 30 40 50
60
Output
⧉
-1
Example 3:
Input
⧉
6
5 5 5 5 5 5
5
Output
⧉
5 5 5 5 5 5
