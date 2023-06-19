package com.github.arry.support.proxy.none;

import com.github.arry.api.ICache;
import com.github.arry.support.proxy.ICacheProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 无代理模式
 * @author arry
 * @since 1.0
 */
public class NoneProxy implements InvocationHandler, ICacheProxy {

    private final ICache target;

    public NoneProxy(ICache target) {
        this.target = target;
    }

    /**
     * 代理
     * @return
     */
    @Override
    public Object proxy() {
        return this.target;
    }

    /**
     * 代理对象执行方法
     * @param proxy 代理对象
     * @param method 目标方法
     * @param args 方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxy,args);
    }
}
