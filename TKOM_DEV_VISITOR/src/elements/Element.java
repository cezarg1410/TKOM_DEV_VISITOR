package elements;

public abstract class Element<T extends Object> {
	
	String id;
	T content;
	int level;
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	private String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}
}
