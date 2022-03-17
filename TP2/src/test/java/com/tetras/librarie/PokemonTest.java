package com.tetras.librarie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class PokemonTest {

    @Test
    public void testTest() {
        assertTrue(true);

    }

    @Test
    public void EvolutionBulbizarre() {
        Bulbizarre Test = new Bulbizarre(); 
        Pokemon Evolue = Test.evoluer();
        assertTrue(Evolue instanceof Herbizarre);
    }
    @Test
    public void EvolutionHerbizarre() {
        Herbizarre Test = new Herbizarre(); 
        Pokemon Evolue = Test.evoluer();
        assertTrue(Evolue instanceof Florizarre);
    }
    @Test
    public void MegaFlorizarre() {
        MegaEvolutionFlorizarre Test = new MegaEvolutionFlorizarre(); 
        Pokemon MegaEvolution = Test.evoluer();
        assertTrue(MegaEvolution instanceof MegaPokemon);
    }
    @Test
    public void TestdesTypes() {
        Herbizarre Test = new Herbizarre();
        List<Type> Types = Test.getTypes();
        assertEquals(Types.get(0), Type.Plante);
        assertEquals(Types.get(1), Type.Poison);
    }
    @Test
    public void TestObscur() {
        PokemonObscur BulbizarreObscur = new PokemonObscur(new Bulbizarre());
        assertEquals(Type.Poison, BulbizarreObscur.getTypes().get(0));
    }


}