package builder;

import java.util.List;

/**
 * Created by Administrator on 2018/11/17 0017.
 */
public class HouseABuilder extends HouseBuilder{

    public House decorateHouser() {
        HouserA houserA = new HouserA();
        List<HouseRoomEnum> decorateSeq = super.decorateSeq;
        for (HouseRoomEnum action : decorateSeq) {
            switch (action) {
                case KITCHEN:
                    houserA.decorateKitchen();
                    break;
                case LIVINGROOM:
                    houserA.decorateLivingRoom();
                    break;
                case BEDROOM:
                    houserA.decorateBedroom();
                    break;
                case BALCONY:
                    houserA.decorateBalcony();
                    break;
            }
        }

        return houserA;
    }
}
