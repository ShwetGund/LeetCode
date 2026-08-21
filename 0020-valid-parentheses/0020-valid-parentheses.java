import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        Stack<Character>st=new Stack();

        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' ||ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char temp=st.pop();
                if(ch==')' && temp!='('){
                    return false;
                }if(ch==']'&& temp!='['){
                    return false;
                }if(ch=='}' && temp!='{'){
                    return false;
                }

            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;      
    }
}