package com.github.arry.support.proxy.cglib;

import com.github.arry.api.ICache;
import com.github.arry.support.proxy.ICacheProxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * CGLIB动态代理
 * @author arry
 * @since 1.0
 */
public class CglibProxy implements MethodInterceptor, ICacheProxy {
    /**
     * 被代理的真实对象
     */
    final private ICache target;

    public CglibProxy(ICache target) {
        this.target = target;
    }

    /**
     * 进行代理
     * @return
     */
    @Override
    public Object proxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }
}
