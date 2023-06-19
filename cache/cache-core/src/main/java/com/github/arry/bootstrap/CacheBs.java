package com.github.arry.bootstrap;

import com.github.arry.api.ICache;
import com.github.arry.core.Cache;
import com.github.arry.support.proxy.CacheProxy;
import com.github.arry.support.proxy.bootstrap.ICacheProxyBsContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author arry
 * @version 1.0
 * @date 2023/6/12 22:10
 * @description 缓存引导类
 */
public final class CacheBs<K, V> {

    private CacheBs() {
    }

    /**
     * 大小限制
     */
    private int size = Integer.MAX_VALUE;

    /**
     * map
     */
    private Map<K, V> map = new HashMap<>();

    /**
     * 创建一个缓存引导类实例
     *
     * @return
     */
    public static <K, V> CacheBs<K, V> newInstance() {
        return new CacheBs<>();
    }

    /**
     * 设置大小
     *
     * @param size
     * @return
     */
    public CacheBs size(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("size must be greater than zero!");
        }

        this.size = size;
        return this;
    }

    /**
     * 构建缓存
     *
     * @return
     */
    public ICache<K, V> build() {
        Cache<K, V> cache = new Cache<>();
        cache.map(map);

        //初始化
        cache.init();

        //开启代理
        CacheProxy.getProxy(cache);


        return cache;
    }


}
