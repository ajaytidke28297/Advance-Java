package org.ajay.annotations;

import java.lang.reflect.Method;

public class AnnotationMain {

    @MyCustomAnnotation(10)
    public void sayHello() {
        System.out.println("My custom annotation");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationMain annotationMain = new AnnotationMain();
        Method method = annotationMain.getClass().getMethod("sayHello");

        MyCustomAnnotation myCustomAnnotation = method.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is: " + myCustomAnnotation.value());
    }
}
