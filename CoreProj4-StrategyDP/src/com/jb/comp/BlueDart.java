package com.jb.comp;

public class BlueDart implements ICourier {

	@Override
	public String deliver(int oid) {
		return oid + " order items are kept delivery by BlueDart!";
	}

}
