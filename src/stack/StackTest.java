package stack;

import stack.impl.Stack;

/**
 * @author wangchong
 * @date 2019/5/20 8:37
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class StackTest {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        System.out.println(minStack.getMin());
    }
}
