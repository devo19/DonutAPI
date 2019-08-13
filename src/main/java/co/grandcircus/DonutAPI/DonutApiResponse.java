package co.grandcircus.DonutAPI;

import java.util.List;

public class DonutApiResponse {
	
	private Integer count;
	private List<Donut> results;
	//private List<String> extras;
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Donut> getResults() {
		return results;
	}
	public void setResults(List<Donut> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "DonutApiResponse [count=" + count + ", results=" + results + "]";
	}
	
	
	
	
	

}
