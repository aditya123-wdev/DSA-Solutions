import java.util.Stack;
class Solution {
    public Stack<Character> simplifiedPath(String path){
         Stack<Character> st = new Stack<>();
         int count=0;

        for(int i=0; i<path.length(); i++){
            char c= path.charAt(i);
            if(st.isEmpty()==false && st.peek()==c && c=='/' || (i==path.length()-1 && c=='/')){ continue; }
            if(c=='.'){
               count++;
               continue;
            }
            if(count>=3){ 
                while(count!=0){
                    st.push('.');
                    count--;
                }
            } 
            else{
                while(count!=0){
                    if(st.size()!=1){
                        if(count==1){
                            st.pop();
                            count=0;
                        }
                        if(count==2){
                            st.pop();
                            while(st.peek()!='/'){ 
                                st.pop(); 
                            }
                            count=0;
                        }  
                    }
                    else{ return st; }
                }
            }
            st.push(c);
        }
         return st;
    }
    public String simplifyPath(String path) {
       Stack<Character> st= simplifiedPath(path);
       StringBuilder result = new StringBuilder();
       while (!st.isEmpty()) {
            result.insert(0, st.pop()); // insert at beginning (less efficient)
        }
        return result.toString();
    }
}
