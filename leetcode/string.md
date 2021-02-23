# String

+ [Group Anagrams](#group-anagrams)

[MDLink]: <>

## Group Anagrams

https://leetcode.com/problems/group-anagrams/

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(str);
        }
        return new ArrayList(ans.values());
    }
}
```

[Solution]: <>