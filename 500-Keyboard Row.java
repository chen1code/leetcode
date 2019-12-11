/*
Given a List of words, return the words that can be typed using letters of alphabet 
on only one row's of American keyboard like the image below.

Example:

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
*/

"""
Solution - Java
"""

class Solution {
    public String[] findWords(String[] words) {
        List<String> re = new ArrayList<>();
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        for(int i = 0; i < words.length; i++){
            int flag = 0;
            int old_flag = 0;
            for(int j = 0; j < words[i].length(); j++){
                String tmp = words[i].charAt(j) + "";
                tmp = tmp.toLowerCase();
                if(s1.indexOf(tmp) > -1) flag = 1;
                if(s2.indexOf(tmp) > -1) flag = 2;
                if(s3.indexOf(tmp) > -1) flag = 3;
                if(flag != old_flag && old_flag != 0) break;
                old_flag = flag;
                if(j == words[i].length()-1) re.add(words[i]);
            }
        }
        String[] re_s = new String[re.size()];
        // for(int i = 0; i < re.size(); i++){
        //     re_s[i] = re.get(i);
        // }
        re.toArray(re_s);
        return re_s;
    }
}

"""
Java8
"""

public String[] findWords(String[] words) {
    return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
}
