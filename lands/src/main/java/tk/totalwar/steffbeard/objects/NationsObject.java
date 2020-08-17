package tk.totalwar.steffbeard.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import tk.totalwar.steffbeard.utils.CustomDataField;

/**
 * 
 * This structures the layout of objects... duh
 *
 */
public abstract class NationsObject implements Nameable {

	private String name;
	private Map<String, CustomDataField<?>> metadata = null;
	
	protected NationsObject(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public List<String> getTreeString(int depth) {

		return new ArrayList<>();
	}
}
