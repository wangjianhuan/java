package ceshi;

import java.io.IOException;
import java.io.InputStream;

public class OneMoreStudy {
    public static void main(String[] args) throws Exception {
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream inputStream = getClass().getResourceAsStream(fileName);
                    if (inputStream == null) {
                        return super.loadClass(name);
                    }
                    byte[] array = new byte[inputStream.available()];
                    inputStream.read(array);
                    return defineClass(name, array, 0, array.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };
        Object object = myLoader.loadClass("OneMoreStudy").newInstance();

        System.out.println("class name: " + object.getClass().getName());
        System.out.println("instanceof: " + (object instanceof OneMoreStudy));
    }
}