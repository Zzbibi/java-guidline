package com.zz.component;

import java.util.Iterator;

/**
 * @Author zhangzhen
 * @create 2023/2/5 11:42
 */
public class NullIterator<T> implements Iterator<T> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
