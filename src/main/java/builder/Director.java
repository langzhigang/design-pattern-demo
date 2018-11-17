package builder;

import java.util.List;

/**
 * Created by Administrator on 2018/11/17 0017.
 */
public class Director {
    public static House decorateHouseA(List<HouseRoomEnum> seq){
        HouseBuilder houseBuilder = new HouseABuilder();
        houseBuilder.setDecorateSeq(seq);
        House house = houseBuilder.decorateHouser();
        return house;
    }
    public static House decorateHouseB(List<HouseRoomEnum> seq){
        HouseBuilder houseBuilder = new HouseBBuilder();
        houseBuilder.setDecorateSeq(seq);
        House house = houseBuilder.decorateHouser();
        return house;
    }
}
