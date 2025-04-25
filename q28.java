Algorithm:
1.	Divide the array into two parts.
2.	Each stack grows from opposite ends of the array.
  
Java Program:

public class Q28 {
    private int[] arr;
    private int top1, top2;
    public Q28(int size) {
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }
    public void push1(int val) {
        if (top1 + 1 == top2) throw new StackOverflowError();
        arr[++top1] = val;
    }
    public void push2(int val) {
        if (top2 - 1 == top1) throw new StackOverflowError();
        arr[--top2] = val;
    }
    public int pop1() {
        if (top1 == -1) throw new StackUnderflowError();
        return arr[top1--];
    }
    public int pop2() {
        if (top2 == arr.length) throw new StackUnderflowError();
        return arr[top2++];
    }
    public static void main(String[] args) {
        Q28 stack = new Q28(10);
        stack.push1(10);
        stack.push2(20);
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
    }
}

Time Complexity: O(1) for both push and pop operations
Space Complexity: O(1)
Example: Push 10 to stack1, 20 to stack2 → Output: 10, 20
