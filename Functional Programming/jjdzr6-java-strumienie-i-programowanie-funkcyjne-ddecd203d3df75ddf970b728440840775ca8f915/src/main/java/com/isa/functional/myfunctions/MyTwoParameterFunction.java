package com.isa.functional.myfunctions;
@FunctionalInterface
public interface MyTwoParameterFunction<T, R, Z> {
    Z apply (T t, R r);
}
