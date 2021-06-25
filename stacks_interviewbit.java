/*

    Problem Description

In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added.(Wikipedia)

Syntax to create an Stack:

// Create Integer type stack
Stack < Integer > myStack = new Stack<>();
The above code create an stack named myStack which can store integers.

Some more functions which we can use with stack:

myStack.push(x) : Use push() to push an element into the stack.
myStack.pop() : To remove an element from the top of the stack, we use the pop() method.
myStack.peek() : The peek() method returns an object from the top of the stack.
myStack.empty() : To check whether a stack is empty or not, we use the empty() method.
 

Now, try to solve the below problem using stack :

Given a string A consisting only of '(' and ')'. 

You need to find whether parentheses in A is balanced or not ,if it is balanced then print 1 else print 0.

Examples of some correctly balanced strings are: "()()", "((()))", "((()))"

Examples of some unbalanced strings are: "()(", "(())", "((", ")(" etc.

 

Problem Constraints

1 <= Number of Testcases <= 100

1 <= |A| <= 105

 
Input Format

The first line of input consists of a single integer T denoting the number of test cases.

Each test case has a single line of input containing a string A.

Output Format

For each test case output a single line i.e print 1 if parantheses in the string are balanced else print 0.


Example Input

Input 1: 

 2
 "(()())"
 "(()"
 
Example Output

Output 1:

 1
 0

Example Explanation

Explanation 1: 

 Testcase 1: Given string (()()) is balanced so we print 1
 Testcase 2: Given string (() is not balanced so we print 0
 
 */
 
 import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int flag = 0;
    Stack<Character> stack; 
    for (int i = 0; i < n; i++) {
        flag = 0;
        stack = new Stack<Character>();
        String str = sc.nextLine();
        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            if (c =='(') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) {
                flag = 1;
                break;
            }
            if (c == ')') {
                stack.pop();
            }
        }
        if (stack.isEmpty() && flag == 0) {
            System.out.println('1');
        } else {
            System.out.println('0');
        }
    }
}
        
    }
