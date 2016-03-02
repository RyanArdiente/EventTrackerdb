package rest.pojos;

public class Search
{
	private String limit;
	private String text;
	public Search(){
		
	}
	public Search(String limit, String text)
	{
		super();
		this.limit = limit;
		this.text = text;
	}
	public String getLimit()
	{
		return limit;
	}
	public void setLimit(String limit)
	{
		this.limit = limit;
	}
	public String getText()
	{
		return text;
	}
	public void setText(String text)
	{
		this.text = text;
	}
}
