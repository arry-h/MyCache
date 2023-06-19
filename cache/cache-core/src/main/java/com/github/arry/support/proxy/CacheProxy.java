package com.github.arry.support.proxy;

import com.github.arry.api.ICache;
import com.github.arry.support.proxy.DynamicProxy.DynamicProxy;
import com.github.arry.support.proxy.none.NoneProxy;

import java.lang.reflect.Proxy;

/**
 * 代理信息
 * @author arry
 * @since 1.0
 */
public class CacheProxy {

    private CacheProxy() {
    }

    /**
     * 获取代理对象
     * @param <K> 泛型K
     * @param <V> 泛型V
     * @param cache 对象代理
     * @return
     */
    @SuppressWarnings("all")
    public static <K,V> ICache<K,V> getProxy(final ICache<K,V> cache){
        //如果传进来的对象为空，则不进行代理
        if (null == cache){
            return (ICache<K, V>) new NoneProxy(cache).proxy();
        }
        final Class clazz = cache.getClass();

        //如果clazz本身是个接口或者clazz是JDK proxy生成的，则使用JDK动态代理
        if (clazz.isInterface() || Proxy.isProxyClass(clazz)){
            return (ICache<K, V>) new DynamicProxy(cache).proxy();
        }

        //使用cglib代理
        return null;
    }
}
