package player_data;

import player_data.enums.Cars;
import player_data.enums.Houses;

// This class covers anything that a player will obtain permanently
public class PlayerItem<T extends Enum<T>> // ensures T is of type Enum
{
    private String name;
    private int price;
    private T[] items;
    private final T currentItem;

    @SuppressWarnings("unchecked")
    public PlayerItem(T item)
    {
        this.currentItem = item;
        if(item instanceof Cars car)
        {
            this.name = car.getName();
            this.price = car.getPrice();
            this.items = (T[]) Cars.values(); // UNCHECKED CAST!!
        }
        else if(item instanceof Houses house)
        {
            this.name = house.getName();
            this.price = house.getPrice();
            this.items = (T[]) Houses.values(); // UNCHECKED CAST!!
        }
    }

    public void listAll() // lists all items
    {
        int i = 1;
        for (T item : items) {
            System.out.println("[" + i + "]" + item);
            i++;
        }
    }
    public int getItemOrdinal()
    {
        return this.currentItem.ordinal();
    }

    public T getCurrentItem()
    {
        return this.currentItem;
    }

    public String getTitle() // Return the enum constant name e.g. CAR1, CAR2
    {
        return this.currentItem.name();
    }

    public String getName() // Return the actual item name e.g. Lamborghini, Ferrari
    {
        return this.name;
    }

    public String toString()
    {
        return "Name: " + this.name + ", Price: " + this.price;
    }

    private String getCurrentItemInstance() //Gets instance of this object
    {
        if(this.currentItem instanceof Cars)
        {
            return "Car";
        }
        else if(this.currentItem instanceof Houses)
        {
            return "House";
        }
        return null;
    }
}
