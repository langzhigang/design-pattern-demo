package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/11/17 0017.
 */
public class Test {
    public static void main(String[] args){
        //房子A 有3个卧室
        List<HouseRoomEnum> seqA = new ArrayList<>();
        seqA.add(HouseRoomEnum.KITCHEN);
        seqA.add(HouseRoomEnum.BALCONY);
        seqA.add(HouseRoomEnum.LIVINGROOM);
        seqA.add(HouseRoomEnum.BEDROOM);
        seqA.add(HouseRoomEnum.BEDROOM);
        seqA.add(HouseRoomEnum.BEDROOM);
        Director.decorateHouseA(seqA);

        //房子A 有1个卧室，而且没有阳台
        List<HouseRoomEnum> seqB = new ArrayList<>();
        seqB.add(HouseRoomEnum.KITCHEN);
        seqB.add(HouseRoomEnum.LIVINGROOM);
        seqB.add(HouseRoomEnum.BEDROOM);
        Director.decorateHouseB(seqB);
    }
}
