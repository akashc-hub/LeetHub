// class Solution {
//     public boolean isValid(String s) {
//         while(true)
//         {
//             if(s.contains("()"))
//             {
//                 s = s.replace("()", "");
//             }
//             else if(s.contains("{}"))
//             {
//                 s = s.replace("{}", "");
//             }
//             else if(s.contains("[]"))
//             {
//                 s = s.replace("[]", "");
//             }
//             else
//             {
//                 return s.isEmpty();
//             }
//         }
//     }
// }
class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2!=0)
        {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }

                char top = stack.peek();

                if(ch == ')' && top == '(')
                {
                    stack.pop();
                }
                else if(ch == ']' && top == '[')
                {
                    stack.pop();
                }
                else if(ch == '}' && top == '{')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}