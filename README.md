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

3. best time to buy and sell stocks

4. Most Frequent Product Code
easy
12
63.0%
arrays
counting
hash table
implementation
Problem Statement:

An online store records the product code of every item sold during a flash sale. The codes are stored in an integer array.

The manager wants to identify the product code that occurred the maximum number of times.

If two or more product codes have the same maximum frequency, print the product code whose first occurrence appears earlier in the array.

Input Format:

The first line contains an integer N, the number of sold items.
The second line contains N space-separated product codes.
Output Format:

Print two space-separated values:

The selected product code.
Its frequency.
Constraints:

1 ≤ N ≤ 500
-106 ≤ arr[i] ≤ 106
Sample Input 1:

9
41 12 41 7 12 41 7 12 7
Sample Output 1:

41 3
Explanation:

41, 12 and 7 each occur 3 times. Since 41 appears first in the array before the other tied values, 41 is selected.

Sample Input 2:

8
5 9 5 2 9 9 5 9
Sample Output 2:

9 4
Example 1:
Input
⧉
9
41 12 41 7 12 41 7 12 7
Output
⧉
41 3
Example 2:
Input
⧉
8
5 9 5 2 9 9 5 9
Output
⧉
9 4
Example 3:
Input
⧉
6
1 2 3 4 5 6
Output
⧉
1 1


5. Circular Display Search
easy
10
27.0%
arrays
binary search
implementation
Problem Statement:

A railway station displays N distinct train numbers in ascending order. During a system restart, the display list is circularly shifted, so a portion from the beginning may move to the end.

You are given the currently displayed array and a train number K.

First determine whether the given array is a sorted and rotated array. A completely sorted array with no rotation is not considered sorted and rotated.

If the array is sorted and rotated, print the index of K in the current array. If K is absent, print -1.

If the array is not sorted and rotated, print Invalid.

Input Format:

The first line contains an integer N.
The second line contains N distinct space-separated integers.
The third line contains the train number K to search.
Output Format:

Print the index of K if the array is sorted and rotated and K is present.
Print -1 if the array is sorted and rotated but K is absent.
Print Invalid if the array is not sorted and rotated.
Constraints:

2 ≤ N ≤ 1000
-109 ≤ arr[i], K ≤ 109
All array elements are distinct.
Sample Input 1:

7
40 50 60 70 10 20 30
20
Sample Output 1:

5
Sample Input 2:

6
10 20 30 40 50 60
40
Sample Output 2:

Invalid
Example 1:
Input
⧉
7
40 50 60 70 10 20 30
20
Output
⧉
5
Example 2:
Input
⧉
6
10 20 30 40 50 60
40
Output
⧉
Invalid
Example 3:
Input
⧉
5
4 5 1 2 3
4
Output
⧉
0

6. Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.


7. You are given an integer array nums of length n and an integer k.

For each index i, calculate its instability score:

instability score =
maximum value from nums[0] to nums[i]
-
minimum value from nums[i] to nums[n-1]

An index i is called stable if:

instability score <= k

Return the smallest (first) stable index.

If there is no stable index, return -1.

Example 1
Input:
nums = [5, 0, 1, 4]
k = 3

Output:
3

Explanation:

Index 0:
max [5] = 5
min [5,0,1,4] = 0
score = 5 - 0 = 5
5 > 3 → Not stable

Index 1:
max [5,0] = 5
min [0,1,4] = 0
score = 5 - 0 = 5
5 > 3 → Not stable

Index 2:
max [5,0,1] = 5
min [1,4] = 1
score = 5 - 1 = 4
4 > 3 → Not stable

Index 3:
max [5,0,1,4] = 5
min [4] = 4
score = 5 - 4 = 1
1 <= 3 → Stable ✅

Answer = 3
Example 2
Input:
nums = [3, 2, 1]
k = 1

Output:
-1

All indices have:

maximum = 3
minimum = 1

score = 3 - 1 = 2

Since:

2 > 1

No index is stable.

Answer = -1
Example 3
Input:
nums = [0]
k = 0

Output:
0

At index 0:

max [0] = 0
min [0] = 0

score = 0 - 0 = 0

Since:

0 <= 0

Index 0 is stable.

Answer = 0
What you need to remember
For every index i:

1. Find MAX from 0 → i
2. Find MIN from i → n-1
3. Calculate MAX - MIN
4. If result <= k → return i
5. If nothing works → return -1


8. Find Most Frequent Vowel
easy
9
59.0%
counting
hash table
strings
Accenture
Problem Statement:

You are given a lowercase string S.

Your task is to determine the vowel that occurs most frequently in the string.

The vowels are:

a, e, i, o, u
Count the occurrences of each vowel and print the vowel having the highest frequency.

Important Note:

The string will always contain at least one vowel.
There will always be exactly one vowel with the highest frequency. Therefore, tie handling is not required.
The string contains only lowercase English letters.
Input Format:

The first line contains an integer N, representing the length of the string.
The second line contains the lowercase string S.
Output Format:

Print a single lowercase character representing the most frequently occurring vowel in the string.

Constraints:

1 ≤ N ≤ 105 Length of S = N S contains only lowercase English letters S contains at least one vowel
Sample Input:

11 abeaicaidao
Sample Output:

a
Explanation:

The frequencies of the vowels in the string abeaicaidao are:

Vowel	Frequency
a	4
e	1
i	2
o	1
u	0
The vowel a appears 4 times, which is more frequent than every other vowel.

Therefore, the output is a.

Example 1:
Input
⧉
abeaicaidao
Output
⧉
a

12. 
Code
Code
Code Sample
Testcase
Testcase
Test Result
940. Distinct Subsequences II
Solved
Hard
Topics
premium lock icon
Companies
Given a string s, return the number of distinct non-empty subsequences of s. Since the answer may be very large, return it modulo 109 + 7.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not.
 

Example 1:

Input: s = "abc"
Output: 7
Explanation: The 7 distinct subsequences are "a", "b", "c", "ab", "ac", "bc", and "abc".
Example 2:

Input: s = "aba"
Output: 6
Explanation: The 6 distinct subsequences are "a", "b", "ab", "aa", "ba", and "aba".
Example 3:

Input: s = "aaa"
Output: 3
Explanation: The 3 distinct subsequences are "a", "aa" and "aaa".

13. 3870. Count Commas in Range
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given an integer n.

Return the total number of commas used when writing all integers from [1, n] (inclusive) in standard number formatting.

In standard formatting:

A comma is inserted after every three digits from the right.
Numbers with fewer than 4 digits contain no commas.
 

Example 1:

Input: n = 1002

Output: 3

Explanation:

The numbers "1,000", "1,001", and "1,002" each contain one comma, giving a total of 3.

Example 2:

Input: n = 998

Output: 0

Explanation:

All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.
