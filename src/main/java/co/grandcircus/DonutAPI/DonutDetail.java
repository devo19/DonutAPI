package co.grandcircus.DonutAPI;

import java.util.List;

public class DonutDetail {
	
	private String name;
	private String calories;
	private List<String> extras;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCalories() {
		return calories;
	}
	public void setCalories(String calories) {
		this.calories = calories;
	}
	public List<String> getExtras() {
		return extras;
	}
	public void setExtras(List<String> extras) {
		this.extras = extras;
	}
	@Override
	public String toString() {
		return "DonutDetail [name=" + name + ", calories=" + calories + ", extras=" + extras + "]";
	}
	
	

}
