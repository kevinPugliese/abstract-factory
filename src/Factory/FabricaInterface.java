package Factory;

import Model.Cachorro;
import Model.Gato;

public interface FabricaInterface {

    Cachorro getCachorro();

    Gato getGato();

}
