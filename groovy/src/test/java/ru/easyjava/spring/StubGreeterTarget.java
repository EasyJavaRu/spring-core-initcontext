package ru.easyjava.spring;

public class StubGreeterTarget implements GreeterTarget {
    @Override
    public String get() {
        return "TEST";
    }
}
