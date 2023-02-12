package com.zz.component;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Author zhangzhen
 * @create 2023/2/5 11:29
 */
public class CompositeIterator<T> implements Iterator<T> {

    private Stack<Iterator<T>> stack = new Stack<>();

    public CompositeIterator(Iterator<T> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator<T> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T next() {
        if (hasNext()) {
            Iterator<T> iterator = stack.peek();
            T t = iterator.next();
            if (t instanceof Menu) {
                stack.push((Iterator<T>) ((Menu) t).createIterator());
            }
            return t;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
