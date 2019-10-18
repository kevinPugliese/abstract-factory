import Factory.FabricaCompanhia;
import Factory.FabricaGuarda;
import Factory.FabricaInterface;

import java.util.Scanner;

public class AbstractFactory {

    private static FabricaInterface fabricaInterface;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextByte();

        switch (opt) {
            case 1 : fabricaInterface = new FabricaCompanhia(); break;
            case 2 : fabricaInterface = new FabricaGuarda(); break;
        }

        System.out.println(fabricaInterface.getCachorro());
        System.out.println(fabricaInterface.getGato());
    }
}
