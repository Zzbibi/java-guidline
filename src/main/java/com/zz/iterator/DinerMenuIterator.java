package com.zz.iterator;

import java.util.Iterator;

/**
 * @Author zhangzhen
 * @create 2023/2/4 21:23
 */
public class DinerMenuIterator<T> implements Iterator<T> {

    private T[] items;
    private int position = 0;

    public DinerMenuIterator(T[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position > items.length || null == items[position]) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public T next() {
        T item = items[position];
        position += 1;
        return item;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (null != items[position - 1]) {
            for (int i = position - 1; i < items.length - 1; i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
