package main;

public enum Jobs {
	INTERN("INTERN/APPRENTICE"),
	MUSCIAN("PERFORMER/MUSICIAN");
	
	private final String job;
	
	Jobs(String job){
		this.job = job;
	}
	
	public String getFullJob() {
		return this.job;
	}
}
