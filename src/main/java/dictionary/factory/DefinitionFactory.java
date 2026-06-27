package main.java.dictionary.factory;
import main.java.dictionary.entity.Definition;
import main.java.dictionary.entity.DefinitionType;

public class DefinitionFactory {
    public Definition creatDefinition(
            String option,
            String meaning
    ){
        DefinitionType type;
        switch (option){
            case "-n":
            case "--noun":
                type= DefinitionType.NOUN;
                break;
            case "-p":
            case "--pronoun":
                type= DefinitionType.PRONUNCIATION;
                break;
            case "-adj":
            case "-a":
            case "--adjective":
                type = DefinitionType.ADJECTIVE;
                break;
            case "-v":
            case "--verb":
                type = DefinitionType.VERB;
                break;
            case "-s":
            case "--synonym":
                type= DefinitionType.SYNONYM;
                break;
            default:
                throw new IllegalArgumentException(
                        "loai dinh nghia ko hop le" + option
                );
        }
        return new Definition(type,meaning);
    }
}
