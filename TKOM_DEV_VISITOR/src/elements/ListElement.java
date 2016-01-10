package elements;

import java.util.ArrayList;

public class ListElement extends Element<ArrayList<Integer>> {

	public ListElement(String id, ArrayList<Integer> content)
	{
		this.id = id;
		this.content = content;
	}
	
	public ListElement(String id, ArrayList<Integer> content,int level)
	{
		this.id = id;
		this.content = content;
		this.level = level;
	}
	public ListElement(ArrayList<Integer> content)
	{
		this.content = content;
	}

	@Override
	public String toString() {
		return "ListElement [id=" + id + ", content=" + content + "]";
	}
}
