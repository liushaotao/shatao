package myproxy;

import java.lang.reflect.Method;

/**
 * Created by liustc on 2018/4/1.
 */
public class MyHandler implements MyInvocationHandler {
    private Man man;

    public MyHandler(Man man) {
        this.man = man;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(man, null);
        afer();
        return invoke;
    }


    public void before() {
        System.out.print("û���ҵ���֮ǰ��Ҫ���ڶ���������Լ�!");
    }

    private void afer() {
        System.out.print("�ҵ���֮��Ҫ�����మһ����!");
    }
}
