
Anagram

Anagrams are words that have the same characters but in a different order.



## Acknowledgements

 - [Leetcode](https://leetcode.com/B171406/)
 - [Geek for Geeks]([https://github.com/matiassingers/awesome-readme](https://auth.geeksforgeeks.org/user/naveenpaezm5/practice))
 - [Hacker rank](https://www.hackerrank.com/naveenpallepu06)


## Appendix
This anagram Problem is very usefull to identify the logical thinking of coders
## Tech Stack

**Data structures:** HashMap, HashSet, ArrayList

**programming languages:** Java


## Documentation

[Documentation](https://linktodocumentation)


## Demo

Insert gif or link to demo


## Approaches
**Brute force approache :**

**step1 :**
initialize the one variable named as i and initially asign the value 0 and iterate the up to n(String array length) using for or while loop.

**step 2:**
intialize the another variable named as j and that variable start from i+1 to n(String array length) iterate j variable using for or while loop which means it is a nested loop.

**step 3:** chech the ith index string characters is equal to jth index string characters or not.if that both indexes characters are same then take one HashSet(which is use to store the unique characters)to store them.

**step 4:** if i th iteration is completed then if HashSet have the values then create  one arraylist. and add the HashSet values to arraylist. and the arraylist is added to the list  of list.

**step 5:** print the list of list.

**TC:** O(n2)

**SC:**



## Screenshots

![App Screenshot]([https://via.placeholder.com/468x300?text=App+Screenshot+Here](https://www.loom.com/share/cbd736dfbc524ab6bb6e625224823caa) )


## Screenshots

![App Screenshot](https://www.instagram.com/p/Cfd4cVyv9yS/?igshid=NTc4MTIwNjQ2YQ== )
![code](https://github.com/B171406/Anagram/assets/119347640/8d51ab05-62c6-4a47-a631-2f63c3694a59)

## Another approache
**step 1:**

Let take the one HashMap(which stores the data in key value pairs)

**step 2:**

initialize the key as String and values as a HashSet.

Sysntax:

HashMap<String,ArrayList> name=new HashMap<>();

**step 3:**
let initialize the one new variable named as i and iterate the 0 to n( String array length).

**step 4:**

Now the main thing is to find a way to keep Key maintained and same for similar anagrams. One way is to do sorting of the elements.

Like ->

ate -> ['a','t','e'] -> after sorting and combining -> aet.

tae -> ['t','a','e'] -> after sorting and combining -> aet.

(Sort the ith index String.and checks if that String is present in Hashmap keys or not. if it is presents then that String add to the that key's value(which means add to the hashset.because hear hashset is that key's value) else create the new key and new value(hashset) and add that string to key and add the that string to values(which means add to the hashset)).

**step 5:**

if total String array complted.then iterate the Hashmap and values will be added to arrayList and that arrayList added to list of list.

Sysntax:

ArrayList<String> name=new ArrayList<>();
HashSet<String>name=new HashSet<>();
List<ArrayList<String>>name=new ArrayList<>();

**Complexity**

**Time complexity**:

 O(n * k * log(k) ), where

n = length of array

k = length of string

**Space complexity**:

 O( n ) , size of map
## Final Approach

**step 1:**

Let take the one HashMap(which stores the data in key value pairs)

**step 2:**

initialize the key as HashMap and values as a HashSet.

Sysntax:

HashMap<HashMap<Character,Integer>,ArrayList> name=new HashMap<>();

**step 3:**
let initialize the one new variable named as i and iterate the 0 to n( String array length).

**step 4:**

Let calculate the frequency of each String. and if hashmap contains that string. then add tring to that keys's value(HashSet).else create the new key new value(HashSet).

**step 5:**

if total String array complted.then iterate the Hashmap and values will be added to arrayList and that arrayList added to list of list.

Sysntax:

ArrayList<String> name=new ArrayList<>();
HashSet<String>name=new HashSet<>();
List<ArrayList<String>>name=new ArrayList<>();

**Complexity**

**Time complexity**:

 O(n * k ), where

n = length of array

k = length of string

**Space complexity**:

 O( n ) , size of map
