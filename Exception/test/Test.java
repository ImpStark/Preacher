import static org.junit.Assert.assertEquals;

/**
 * Created by ust on 2015/12/27.
 * 23333 一次奇妙的测试哈哈
 */

public class Test {

    @org.junit.Test
    public void IntergerTest(){
        int a=1000,b=1000;
        assertEquals(true,a==b);
        Integer c=1000,d=1000;
        assertEquals(false,c==d);
        Integer e = 120,f=120;
        assertEquals(true,e==f);
    }
}
