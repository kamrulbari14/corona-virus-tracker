package io.javabrains.coronavirus_tracker.models;

public class LocationStats {
	
	private String state;
	private String country;
	private int latestTotalCases;
	private int diffFormPrevDay;
	
	
	public int getDiffFormPrevDay() {
		return diffFormPrevDay;
	}

	public void setDiffFormPrevDay(int diffFormPrevDay) {
		this.diffFormPrevDay = diffFormPrevDay;
	}

	public String getState() {
		return state;
	} 
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}

	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ "]";
	}
	
	

}
