package com.zz.iterator;

import java.util.Iterator;

/**
 * @Author zhangzhen
 * @create 2023/2/4 21:18
 */
public interface Menu<T> {

    public Iterator<T> createIterator();

}
