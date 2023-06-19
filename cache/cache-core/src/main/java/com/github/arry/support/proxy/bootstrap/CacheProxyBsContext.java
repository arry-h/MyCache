package com.github.arry.support.proxy.bootstrap;

import com.github.arry.api.ICache;

/**
 * 代理引导类上下文
 * @author arry
 * @since 1.0
 */
public class CacheProxyBsContext implements ICacheProxyBsContext {

    private ICache target;

    public static CacheProxyBsContext newInstance() {
        return new CacheProxyBsContext();
    }

    public CacheProxyBsContext target(ICache target){
        this.target = target;
        return this;
    }
}
