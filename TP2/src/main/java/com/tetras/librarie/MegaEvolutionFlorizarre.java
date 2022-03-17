package com.tetras.librarie;

public class MegaEvolutionFlorizarre extends Florizarre implements IEvolution{
    
    @Override
    public MegaPokemon evoluer() {
        return new MegaFlorizarre();
    }
    
}
