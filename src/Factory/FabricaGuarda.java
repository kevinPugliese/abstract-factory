package Factory;

import Model.Cachorro;
import Model.Gato;
import Model.Pastor;
import Model.RagDoll;

public class FabricaGuarda implements FabricaInterface {

    @Override
    public Cachorro getCachorro() {
        return new Pastor();
    }

    @Override
    public Gato getGato() {
        return new RagDoll();
    }
}
