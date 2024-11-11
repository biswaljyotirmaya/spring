package com.jb.comp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dhl")
@Lazy(true)
public class DHL implements ICourier {

	@Override
	public String deliver(int oid) {
		return oid + " order items are kept delivery by DHL!";
	}

}
