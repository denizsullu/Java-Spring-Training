package kodlama.io.Devs.devs.entities.concretes;

public class ProgLanguage {
	private int id;
	private String language;
	public ProgLanguage() {
		super();
	}
	public ProgLanguage(int id, String language) {
		this.id = id;
		this.language = language;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
