package stack;

import stack.impl.Stack;

import java.util.Arrays;

/**
 * @author wangchong
 * @date 2019/5/19 17:20
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class ArrayStack implements Stack {
    Object[] elementArray;
    int maxSize;
    int currentSize;

    public ArrayStack() {
        elementArray = new Object[10];
        this.maxSize = 10;
        this.currentSize = 0;
    }

    public ArrayStack(int maxSize) {
        elementArray = new Object[maxSize];
        this.currentSize = 0;
        this.maxSize = maxSize;
    }

    @Override
    public boolean push(Object v) {
        if (currentSize == maxSize) {
            int oldSize = maxSize;
            int newSize = oldSize << 2;
            if (newSize + 8 - Integer.MAX_VALUE > 0) {
                return false;
            }
            maxSize = newSize;
            elementArray = Arrays.copyOf(elementArray,newSize);
        }
        currentSize++;
        elementArray[currentSize++] = v;
        return true;
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
