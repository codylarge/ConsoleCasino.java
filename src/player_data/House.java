package player_data;

import player_data.enums.Houses;

public class House extends PlayerItem<Houses>
{
    private final String location;
    public House(Houses house)
    {
        super(house);
        this.location = house.getLocation();
    }

    public String getLocation() {
        return location;
    }

    public String toString()
    {
        return super.toString() + ", Location: " + this.location;
    }

    /*
    @Override
    public Houses exists(int index) {
        {
            for (Houses s : Houses.values()) {
                if (s.ordinal() == index) {
                    return s;
                }
            }
            return null;
        }
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String writeToFile()
    {
        return this.name();
    }
    */

}
