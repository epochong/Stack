package stack.impl;

/**
 * @author wangchong
 * @date 2019/5/19 17:17
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public interface Stack<T> {
    boolean push(T v);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}
