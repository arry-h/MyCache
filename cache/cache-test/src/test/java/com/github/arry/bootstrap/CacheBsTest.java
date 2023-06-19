package com.github.arry.bootstrap;

import com.github.arry.api.ICache;
import org.junit.jupiter.api.Test;

/**
 * 缓存引导类测试
 */
public class CacheBsTest {

    /**
     * 指定大小测试
     */
    public void helloTset(){

    }

    /**
     * 指定过期时间测试
     */
    @Test
    public void expireTest(){
        ICache<String ,String> cache = CacheBs.<String ,String>newInstance().size(3).build();
        System.out.println("11");
    }
}
