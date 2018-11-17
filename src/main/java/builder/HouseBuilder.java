package builder;

import java.util.List;

/**
 * Created by Administrator on 2018/11/17 0017.
 */
public abstract class HouseBuilder {
    protected List<HouseRoomEnum> decorateSeq;

    public void setDecorateSeq(List<HouseRoomEnum> decorateSeq) {
        this.decorateSeq = decorateSeq;
    }

    public abstract House decorateHouser();
}
