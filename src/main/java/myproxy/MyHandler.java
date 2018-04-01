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
        System.out.print("没有找到你之前，要从内而外的做好自己!");
    }

    private void afer() {
        System.out.print("找到你之后要相亲相爱一辈子!");
    }
}
