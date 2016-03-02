package rest.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="event")
@NamedQueries({@NamedQuery(name = "Event.getAllEvents", query = "select e from Event e"),@NamedQuery(name = "Event.deleteAllEvents", query = "DELETE FROM Event"), @NamedQuery(name = "Event.searchByplace", query = "select e from Event e where e.place = :place"), @NamedQuery(name = "Event.searchByitemName", query = "select e from Event e where e.itemName = :itemName")})
public class Event
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String itemName;
	private String place;
	private int quantity;
	private boolean bought;
	public Event()
	{
		
	}
	public Event(String itemName, String place, int quantity)
	{

		this.itemName = itemName;
		this.place = place;
		this.quantity = quantity;
		this.bought = false;
	}

	public int getId()
	{
		return id;
	}

	public String getItemName()
	{
		return itemName;
	}

	public String getPlace()
	{
		return place;
	}

	public boolean isBought()
	{
		return bought;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	public void setPlace(String place)
	{
		this.place = place;
	}

	public void setBought(boolean bought)
	{
		this.bought = bought;
	}
	
	@Override
	public String toString(){
		return itemName + " at " + place;
	}

	
	
}
