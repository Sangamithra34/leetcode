// Last updated: 6/1/2026, 3:21:20 PM
1class MinStack {
2    Stack<Long> s = new Stack<>();
3    long minEle;
4    public void push(int val) {
5        if (s.isEmpty()) { 
6            s.push((long)val); 
7            minEle = val; 
8        }
9        else if (val < minEle) { 
10            s.push(2L*val - minEle); 
11            minEle = val; 
12        }
13        else s.push((long)val);
14    }
15    public void pop() {
16        long t = s.pop();
17        if (t < minEle) 
18            minEle = 2*minEle - t;
19    }
20    public int top() {
21        long t = s.peek();
22        return t < minEle ? (int)minEle : (int)t;
23    }
24    public int getMin() { 
25        return (int)minEle; 
26    }
27}