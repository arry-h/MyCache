package com.github.arry.core;

import com.github.arry.api.ICache;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @author arry
 * @version 1.0
 */
public class Cache<K,V> implements ICache<K,V> {

    /**
     * map信息
     * @since 1.0
     */
    private Map<K,V> map;


    /**
     * 设置map信息
     * @param map
     * @return
     */
    public Cache<K,V> map(Map<K,V> map){
        this.map = map;
        return this;
    }


    public ICache<K, V> expire(K key, long timeInMills) {
        return null;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public V get(Object key) {
        return null;
    }

    public V put(K key, V value) {
        return null;
    }

    public V remove(Object key) {
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> m) {

    }

    public void clear() {

    }

    public Set<K> keySet() {
        return null;
    }

    public Collection<V> values() {
        return null;
    }

    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    public void init() {

    }
}
