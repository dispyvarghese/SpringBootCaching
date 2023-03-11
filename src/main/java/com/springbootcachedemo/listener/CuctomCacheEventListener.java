package com.springbootcachedemo.listener;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;

public class CuctomCacheEventListener implements CacheEventListener<Object, Object>{

	@Override
	public void onEvent(CacheEvent event) {
		System.out.println("event capured: "+ event.getKey()+ " "+event.getOldValue()
		+" "+event.getNewValue());
	}

}
