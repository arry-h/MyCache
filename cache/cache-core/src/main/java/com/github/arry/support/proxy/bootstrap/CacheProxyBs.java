package com.github.arry.support.proxy.bootstrap;

import com.github.arry.api.ICache;

/**
 * 代理引导类
 * @author arry
 * @since 1.0
 */
public class CacheProxyBs {

    /**
     * 被代理的对象
     */
    private ICache target;

    /**
     * 代理引导类上下文
     */
    private ICacheProxyBsContext context;

    public static CacheProxyBs newInstance(){
        return new CacheProxyBs();
    }

    public CacheProxyBs target(ICache target){
        this.target = target;
        return this;
    }

    public CacheProxyBs context(ICacheProxyBsContext context){
        this.context = context;
        return this;
    }

    /**
     * 执行目标方法
     * @return
     */
    public Object execute(){
        return null;
    }
}
