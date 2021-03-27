package pl.cmpack.util;

import net.minecraft.client.model.ModelBiped;
import pl.cmpack.mod.hat.BasicHat;
import pl.cmpack.mod.hat.CrownHat;
import pl.cmpack.mod.hat.ObjHat;
import pl.cmpack.mod.hat.SantaHat;
import pl.cmpack.mod.item.Item;
import pl.cmpack.mod.wing.DragonWing;
import pl.cmpack.mod.wing.Wing;

public class CosmeticsBase {

    public final BasicHat basicHat;
    public final CrownHat crownHat;
    public final SantaHat santaHat;
    public final ObjHat objHat;
    public final Wing wing;
    public final Item item;
    public final DragonWing dragonWing;

    public CosmeticsBase(ModelBiped base) {
        this.basicHat = new BasicHat(base);
        this.crownHat = new CrownHat(base);
        this.santaHat = new SantaHat(base);
        this.objHat = new ObjHat();
        this.wing = new Wing();
        this.item = new Item(base);
        this.dragonWing = new DragonWing();
    }
}
