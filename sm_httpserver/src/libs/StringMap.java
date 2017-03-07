package libs;

import java.util.HashMap;

public class StringMap extends HashMap<String, String>{

	private static final long serialVersionUID = 1L;
	
	
	public StringMap(){
		super();
	}
	
	public StringMap(String key, String value){
		super();
		put(key, value);
	}

	public String getJSONString(){
		return "";
	}

}
