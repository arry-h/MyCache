package com.github.arry.support.proxy.DynamicProxy;

import com.github.arry.api.ICache;
import com.github.arry.support.proxy.ICacheProxy;
import com.github.arry.support.proxy.bootstrap.CacheProxyBs;
import com.github.arry.support.proxy.bootstrap.CacheProxyBsContext;
import com.github.arry.support.proxy.bootstrap.ICacheProxyBsContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * @author arry
 * @since 1.0
 */
public class DynamicProxy implements InvocationHandler,ICacheProxy {

    /**
     * 被代理的对象
     */
    private final ICache target;

    public DynamicProxy(ICache target) {
        this.target = target;
    }

    /**
     * 进行代理,要代理哪个对象，就将该对象传进去
     * @return
     */
    @Override
    public Object proxy() {
        InvocationHandler handler = new DynamicProxy(target);
        return Proxy.newProxyInstance(handler.getClass().getClassLoader(), handler.getClass().getInterfaces(), handler);
    }

    /**
     * 执行目标方法
     * @param proxy 代理对象
     * @param method 目标方法
     * @param args 方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ICacheProxyBsContext context = CacheProxyBsContext.newInstance().target(target);
        return CacheProxyBs.newInstance().context(context).execute();
    }
}
