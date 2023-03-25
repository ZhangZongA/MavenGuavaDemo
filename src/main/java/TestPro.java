import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;

public class TestPro {
    public static void main(String[] args) {

    Test t1=new Test("张三",3);
        Test t2=new Test("lisi",7);
        Test t3=new Test("ss",9);
        Test t4=new Test("pp",30);
        t1.setAllMap();
        t2.setAllMap();
        t3.setAllMap();
        t4.setAllMap();
        Multimap<String,Integer> map=t4.getAllMap();
        System.out.println(map);

    }
}
