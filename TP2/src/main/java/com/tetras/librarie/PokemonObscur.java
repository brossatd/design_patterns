package com.tetras.librarie;
import java.util.List;
import java.util.ArrayList;

public class PokemonObscur {
    public Pokemon pokemon;
    private List<Type> ListTypes;

    public PokemonObscur(Pokemon pkmpur){
            List<Type> AncienType = new ArrayList<>();
            AncienType.addAll(pkmpur.getTypes());
            System.out.println(AncienType.get(1));
            if(AncienType.size()>=1){
                AncienType.remove(0);
                ListTypes = AncienType;
            }
    }

    public List<Type> getTypes() {
        return ListTypes;
    }


    public Pokemon purifier(){
            return pokemon;
    }
}
