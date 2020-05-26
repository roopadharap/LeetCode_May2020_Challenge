# LeetCode_Problems

1. singleNonDuplicate.java : </br>
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once. 
2. badVersion.java : </br>
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
3. numJewelsInStones.java : </br>
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels. 
The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
4. arrangeWords.java : </br>
Given a sentence text (A sentence is a string of space-separated words) in the following format:
    First letter is in upper case.
    Each word in text are separated by a single space.
Your task is to rearrange the words in text such that all words are rearranged in an increasing order of their lengths. If two words have the same length, arrange them in their original order. Return the new text following the format shown above.
Example 1:
Input: text = "Leetcode is cool"
Output: "Is cool leetcode"
Explanation: There are 3 words, "Leetcode" of length 8, "is" of length 2 and "cool" of length 4.
Output is ordered by length and the new first word starts with capital letter.
5. bstFromPreorder.java : </br>
Construct Binary Search Tree from Preorder Traversal. Return the root node of a binary search tree that matches the given preorder traversal.
6. checkInclusion.java : </br>
Permutation in String : Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
Example 1: Input: s1 = "ab" s2 = "eidbaooo" Output: True
Explanation: s2 contains one permutation of s1 ("ba").
Example 2: Input:s1= "ab" s2 = "eidboaoo"   Output: False
7. countSquares.java : </br>
Count Square Submatrices with All Ones. Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
Input: matrix =
[[0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]]
Output: 15
Explanation: 
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.
8. findAnagrams.java : </br>
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
The order of output does not matter.
Input: s: "cbaebabacd" p: "abc" Output: [0, 6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc". 
9. findMaxLength.java : </br>
Contiguous Array :  Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1. 
Input: [0,1]  Output: 2
10. frequencySort.java : </br>
Sort Characters By Frequency .  Given a string, sort it in decreasing order based on the frequency of characters.
Example 1: Input: "tree"  Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once. So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
