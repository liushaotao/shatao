package myproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by liustc on 2018/4/1.
 */
public class ManHandler implements InvocationHandler {
    private Man man;

    public ManHandler(Man man) {
        this.man = man;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(man, null);
        afer();
        return null;
    }


    public void before() {
        System.out.print("û���ҵ���֮ǰ��Ҫ���ڶ���������Լ�!");
    }

    private void afer() {
        System.out.print("�ҵ���֮��Ҫ�����మһ����!");
    }
}
