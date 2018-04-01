package myproxy;

import java.lang.reflect.Method;

/**
 * Created by liustc on 2018/4/1.
 */
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method, Object args[]) throws Throwable;
}
