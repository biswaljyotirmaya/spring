package com.jb.comp;

public class DTDC implements ICourier {
	@Override
	public String deliver(int oid) {
		return oid + " order items are kept delivery by DTDC!";
	}

}
