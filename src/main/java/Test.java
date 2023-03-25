import com.google.common.collect.ArrayListMultimap;

import com.google.common.collect.Multimap;

public class Test {

    private String key;
    private int value;
    private static   Multimap<String,Integer> map = ArrayListMultimap.create();
    public Test() {
    }

    public Test(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public void setAllMap()
    {
        map.put(this.key,this.value);
    }
    public Multimap<String,Integer>  getAllMap()
    {
        return this.map;
    }


    /**
     * 获取
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * 设置
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "Test{key = " + key + ", value = " + value + "}";
    }
}
