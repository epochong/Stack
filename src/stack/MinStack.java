package stack;

import java.util.Arrays;

/**
 * @author wangchong
 * @date 2019/5/20 9:05
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class MinStack {
    int[] elementArray;
    int maxSize = 1;
    int currentSize;
    Node headNode;
    private class Node {
        int v;
        int index;
        Node nextNode;
    }
    /** initialize your data structure here. */
    public MinStack() {
        headNode = null;
        elementArray = new int[maxSize];
        currentSize = 0;
    }

    public void push(int x) {
        if (currentSize == maxSize) {
            int oldSize = maxSize;
            int newSize = oldSize << 1;
            maxSize = newSize;
            elementArray = Arrays.copyOf(elementArray,maxSize);
        }
        Node newNode = new Node();
        if (currentSize == 0) {
            newNode.v = x;
            newNode.index = currentSize;
            headNode = newNode;
            elementArray[currentSize++] = x;
        } else {
            if (x < headNode.v) {
                newNode.v = x;
                newNode.index = currentSize;
                newNode.nextNode = headNode;
                headNode = newNode;
            }
            elementArray[currentSize++] = x;
        }
    }

    public void pop() {
        if (currentSize == 0) {
            return;
        }
        if (top() == headNode.v && headNode.index == currentSize - 1) {
            headNode = headNode.nextNode;
        }
        currentSize--;
    }

    public int top() {
        if (currentSize == 0) {
            return 0;
        }
        return elementArray[currentSize - 1];
    }

    public int getMin() {
        return headNode.v;
    }
}
