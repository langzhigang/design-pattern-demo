package builder;

import java.util.List;

/**
 * Created by Administrator on 2018/11/17 0017.
 */
public class HouseBBuilder extends HouseBuilder {

    public House decorateHouser() {
        HouserB houserB = new HouserB();
        List<HouseRoomEnum> decorateSeq = super.decorateSeq;
        for (HouseRoomEnum action : decorateSeq) {
            switch (action) {
                case KITCHEN:
                    houserB.decorateKitchen();
                    break;
                case LIVINGROOM:
                    houserB.decorateLivingRoom();
                    break;
                case BEDROOM:
                    houserB.decorateBedroom();
                    break;
                case BALCONY:
                    houserB.decorateBalcony();
                    break;
            }
        }

        return houserB;
    }
}
