package Factory;

import Model.Cachorro;
import Model.Gato;
import Model.Persa;
import Model.Shitzu;

public class FabricaCompanhia implements FabricaInterface {
    @Override
    public Cachorro getCachorro() {
        return new Shitzu();
    }

    @Override
    public Gato getGato() {
        return new Persa();
    }
}
