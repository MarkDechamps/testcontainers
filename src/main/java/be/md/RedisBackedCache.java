package be.md;

import redis.clients.jedis.Jedis;

public class RedisBackedCache {

    Jedis jedis ;

    public RedisBackedCache(String address, Integer port) {
        jedis  = new Jedis(address,port);
    }

    public void  put(String toCacheKey,String toCacheValue){
        jedis.set(toCacheKey, toCacheValue);
    }
    public String get(String key){
        return jedis.get(key);
    }
}
