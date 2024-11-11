package com.jb.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bdart")
@Primary
public class BlueDart implements ICourier {

	@Override
	public String deliver(int oid) {
		return oid + " order items are kept delivery by BlueDart!";
	}

}
