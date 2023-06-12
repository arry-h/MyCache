package com.github.arry.api;

import java.util.Map;

/**
 * 缓存接口
 * @author arry
 * @since 1.0
 */
public interface ICache<K,V> extends Map<K,V> {


   /**
    * 设置过期时间
    * @param key key
    * @param timeInMills 时间戳
    * @return this
    * @since 1.0
    */
   ICache<K,V> expire(final K key,long timeInMills);
}
