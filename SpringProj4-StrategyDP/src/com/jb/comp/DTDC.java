package com.jb.comp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy(true)
public class DTDC implements ICourier {
	@Override
	public String deliver(int oid) {
		return oid + " order items are kept delivery by DTDC!";
	}

}
