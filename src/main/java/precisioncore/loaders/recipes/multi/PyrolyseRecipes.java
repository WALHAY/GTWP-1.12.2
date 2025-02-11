package precisioncore.loaders.recipes.multi;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static precisioncore.api.recipes.PrecisionRecipeMaps.PYROLYSE;

public class PyrolyseRecipes {

    public static void init(){
        PYROLYSE.recipeBuilder()
                .input(dust, Wood, 8)
                .timedFluidOutput(CarbonMonoxide.getFluid(72), 7*20)
                .timedFluidOutput(Hydrogen.getFluid(288), 14*20)
                .timedFluidOutput(Methane.getFluid(144), 21*20)
                .timedFluidOutput(CarbonDioxide.getFluid(216), 28*20)
                .fluidOutputs(WoodTar.getFluid(1440))
                .timedOutput(gem, Charcoal, 7*20)
                .timedOutput(gem, Charcoal, 14*20)
                .timedOutput(gem, Charcoal, 21*20)
                .timedOutput(gem, Charcoal, 28*20)
                .output(gem, Charcoal)
                .duration(35*20).EUt(128)
                .buildAndRegister();

        //CH4 -> C + 2H2
        PYROLYSE.recipeBuilder()
                .fluidInputs(Methane.getFluid(1000))
                .fluidOutputs(Hydrogen.getFluid(4000))
                .output(dust, Carbon)
                .duration(20*5).EUt(128)
                .buildAndRegister();

        //C2H4 -> C2H2 + H2

        //C2H6 -> C2H4 + H2
        PYROLYSE.recipeBuilder()
                .fluidInputs(Ethane.getFluid(1000))
                .fluidOutputs(Ethylene.getFluid(1000))
                .fluidOutputs(Hydrogen.getFluid(2000))
                .duration(20*8).EUt(128)
                .buildAndRegister();

        //C3H6 -> C2H2 + H2

        //C3H8 -> C2H4 + CH4
        PYROLYSE.recipeBuilder()
                .fluidInputs(Propane.getFluid(1000))
                .fluidOutputs(Ethylene.getFluid(1000))
                .fluidOutputs(Methane.getFluid(1000))
                .duration(20*11).EUt(128)
                .buildAndRegister();

        //C4H10 -> C2H6 + C2H4
        PYROLYSE.recipeBuilder()
                .fluidInputs(Butane.getFluid(1000))
                .fluidOutputs(Ethylene.getFluid(1000))
                .fluidOutputs(Ethane.getFluid(1000))
                .duration(14*20).EUt(128)
                .buildAndRegister();



    }
}























