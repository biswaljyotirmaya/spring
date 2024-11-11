package com.jb.sbeans;

import org.springframework.stereotype.Component;

@Component
public interface IEngine {
	public String startEnginne();

	public String stopEngine();
}
