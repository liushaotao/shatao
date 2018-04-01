import myproxy.*;

/**
 * Created by liustc on 2018/4/1.
 */
public class Test {
    @org.junit.Test
    public void testName() throws Exception {
        Man man = new liushaotao();
        MyHandler myhandler = new MyHandler(man);
        Man proxyMan =(Man) MyProxy.newProxyInstance(new MyClassLoader("C:\\Users\\liustc\\Desktop" +
                "\\github\\shatao\\src\\main\\java\\myproxy",
                "myproxy"),Man.class,myhandler);
        System.out.print(proxyMan.getClass().getName());
        try {
            proxyMan.findObject();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
