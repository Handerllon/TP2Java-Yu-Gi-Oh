package carta;

import carta.campo.Sogen;
import carta.campo.Wasteland;
import carta.excepciones.CartaInvalidaError;
import carta.magica.DarkHole;
import carta.magica.Fissure;
import carta.magica.PotOfGreed;
import carta.monstruo.*;
import carta.trampa.MagicCylinder;
import carta.trampa.Reinforcements;

import java.util.ArrayList;

public class FabricaCartas extends Carta
{

    public FabricaCartas()
    {
    }

    public ArrayList<String> obtenerNombresMonstruosNormales()
    {
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("AlexandriteDragon");
        nombres.add("AmphibianBeast");
        nombres.add("AncientBrain");
        nombres.add("AncientTool");
        nombres.add("Bitron");
        nombres.add("BlueEyesWhiteDragon");
        nombres.add("CharcoalInpachi");
        nombres.add("GaiaTheFierceKnight");

        return nombres;
    }

    public ArrayList<String> obtenerNombresMonstruosNoNormales()
    {
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("BlueEyesUltimateDragon");
        nombres.add("ExodiaTheForbiddenOne");
        nombres.add("Jinzo7");
        nombres.add("LeftArmOfTheForbiddenOne");
        nombres.add("LeftLegOfTheForbiddenOne");
        nombres.add("ManEaterBug");
        nombres.add("RightArmOfTheForbiddenOne");
        nombres.add("RightLegOfTheForbiddenOne");

        return nombres;
    }

    public ArrayList<String> obtenerNombresMagicas()
    {
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("DarkHole");
        nombres.add("Fissure");
        nombres.add("PotOfGreed");

        return nombres;
    }

    public ArrayList<String> obtenerNombresCampo()
    {
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Sogen");
        nombres.add("Wasteland");

        return nombres;
    }

    public ArrayList<String> obtenerNombresTrampas()
    {
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("MagicCylinder");
        nombres.add("Reinforcements");

        return nombres;
    }

    public Carta obtenerCarta(String nombreCarta)
    {
        switch (nombreCarta)
        {
            // Monstruos.
            case "AlexandriteDragon":
                return new AlexandriteDragon();
            case "AmphibianBeast":
                return new AmphibianBeast();
            case "AncientBrain":
                return new AncientBrain();
            case "AncientTool":
                return new AncientTool();
            case "Bitron":
                return new Bitron();
            case "BlueEyesUltimateDragon":
                return new BlueEyesUltimateDragon();
            case "BlueEyesWhiteDragon":
                return new BlueEyesWhiteDragon();
            case "CharcoalInpachi":
                return new CharcoalInpachi();
            case "ExodiaTheForbiddenOne":
                return new ExodiaTheForbiddenOne();
            case "GaiaTheFierceKnight":
                return new GaiaTheFierceKnight();
            case "Jinzo7":
                return new Jinzo7();
            case "LeftArmOfTheForbiddenOne":
                return new LeftArmOfTheForbiddenOne();
            case "LeftLegOfTheForbiddenOne":
                return new LeftLegOfTheForbiddenOne();
            case "ManEaterBug":
                return new ManEaterBug();
            case "RightArmOfTheForbiddenOne":
                return new RightArmOfTheForbiddenOne();
            case "RightLegOfTheForbiddenOne":
                return new RightLegOfTheForbiddenOne();
            // Magicas.
            case "DarkHole":
                return new DarkHole();
            case "Fissure":
                return new Fissure();
            case "PotOfGreed":
                return new PotOfGreed();
            // Campo.
            case "Sogen":
                return new Sogen();
            case "Wasteland":
                return new Wasteland();
            //Trampa.
            case "MagicCylinder":
                return new MagicCylinder();
            case "Reinforcements":
                return new Reinforcements();
            default:
                throw new CartaInvalidaError();
        }
    }
}
