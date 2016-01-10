package elements;


public class NumberElement extends Element<Integer> {

	public NumberElement(String id, Integer content)
	{
		this.id = id;
		this.content = content;
	}
	
	public NumberElement(String id, Integer content, int level)
	{
		this.id = id;
		this.content = content;
		this.level = level;
	}
	public NumberElement(Integer content)
	{
		this.content = content;
	}
}
