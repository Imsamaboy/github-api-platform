# String

+ [Valid Palindrome](#valid-palindrome)

[MDLink]: <>

## Valid Palindrome

https://leetcode.com/problems/valid-palindrome/

```java
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder buffer = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c >= 65 && c <= 90 || c >= 48 && c <= 57 || c >=97 && c <= 122)
                buffer.append(c);
        }
        return buffer.toString().equalsIgnoreCase(buffer.reverse().toString());
    }
}
```

[Solution]: <>