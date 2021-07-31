package org.ajay.generics;

public class SingleGenericHolder<T> {
    T obj;

    SingleGenericHolder(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    public static void main(String[] args) {
        SingleGenericHolder<Integer> iObj = new SingleGenericHolder<>(10);
        System.out.println(iObj.getObj());

        SingleGenericHolder<String> sObj = new SingleGenericHolder<>("Ajay");
        System.out.println(sObj.getObj());
    }
}
