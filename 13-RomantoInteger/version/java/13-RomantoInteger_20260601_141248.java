// Last updated: 6/1/2026, 2:12:48 PM
1class Solution {
2    public int romanToInt(String s) {
3       Map<Character, Integer> map = new HashMap<>();
4        map.put('I', 1);
5        map.put('V', 5);
6        map.put('X', 10);
7        map.put('L', 50);
8        map.put('C', 100);
9        map.put('D', 500);
10        map.put('M', 1000);
11
12        int result = 0;
13        for (int i = 0; i < s.length(); i++) {
14            int value = map.get(s.charAt(i));
15            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
16                result -= value; // subtract if smaller value comes before larger
17            } else {
18                result += value;
19            }
20        } 
21        return result;
22    }
23}