package com.generics;
public class OrderedPair<k,v> implements Pair<k,v> {
    private k key;
    private v value;

    public OrderedPair(k key, v value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public k getKey() {
        return key;
    }

    @Override
    public v getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "OrderedPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
