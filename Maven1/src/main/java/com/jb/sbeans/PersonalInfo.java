package com.jb.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pinfo")
@PropertySource(value = "com/jb/commons/pInfo.properties")
public class PersonalInfo {
	@Value("${per.id}")
	private Integer pid;
	@Value("${per.name}")
	private String pname;
	@Value("${per.add}")
	private String padd;
	
	@Value("${os.name}")
	private String os_name;
	@Value("${os.version}")
	private String os_ver;
	
	@Value("${Path}")
	private String path_data;

	@Override
	public String toString() {
		return "PersonalInfo [pid=" + pid + ", pname=" + pname + ", padd=" + padd + ", os_name=" + os_name + ", os_ver="
				+ os_ver + ", path_data=" + path_data + "]";
	}
	
	
}
