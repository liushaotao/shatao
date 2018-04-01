import myproxy.Man;
import myproxy.ManHandler;
import myproxy.liushaotao;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * Created by liustc on 2018/4/1.
 */
public class TestProxy {
    @org.junit.Test
    public void testName() throws Exception {
        Man man = new liushaotao();
        ManHandler manhandler = new ManHandler(man);
        Man proxyMan = (Man) Proxy.newProxyInstance(man.getClass().getClassLoader(), new Class[]{Man.class}, manhandler);
        System.out.print(proxyMan.getClass().getName());
        proxyMan.finObject();
        testName1(Man.class);
    }

    public void testName1(Class c) throws Exception {
        byte[] data = ProxyGenerator.generateProxyClass("$proxyshaotao", new Class[]{c});
        FileOutputStream file = new FileOutputStream("$proxyshaotao.class");
        file.write(data);
        file.close();
    }
}
