package stack;

import stack.impl.Stack;

/**
 * @author wangchong
 * @date 2019/5/20 8:48
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class SequenceStack<T> implements Stack<T> {
    Node headNode;
    int currentSize;

    public SequenceStack() {
        this.headNode = null;
        currentSize = 0;
    }

    private class Node {
        T value;
        Node nextNode;
    }


    @Override
    public boolean push(T v) {
        Node newNode = new Node();
        newNode.value = v;
        if (headNode == null) {
            headNode = newNode;
            currentSize++;
            return true;
        } else {
            newNode.nextNode = headNode;
            headNode = newNode;
            currentSize++;
            return true;
        }
    }

    @Override
    public T pop() {
        if (headNode == null) {
            return null;
        }
        currentSize--;
        T t = headNode.value;
        headNode = headNode.nextNode;
        return t;
    }

    @Override
    public T peek() {
        if (headNode == null) {
            return null;
        }
        return headNode.value;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public String toString() {
        return "SequenceStack{" +
                "headNode=" + headNode +
                ", currentSize=" + currentSize +
                '}';
    }
}
