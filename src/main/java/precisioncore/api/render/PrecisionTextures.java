package precisioncore.api.render;

import gregtech.api.util.GTLog;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import precisioncore.PrecisionCore;
import precisioncore.api.render.texture.RodHatchRenderer;

@Mod.EventBusSubscriber(modid = PrecisionCore.MODID, value = Side.CLIENT)
public class PrecisionTextures {

    public static SimpleOverlayRenderer[] MULTI_TANK_FLUID_STORAGE = new SimpleOverlayRenderer[4];
    public static SimpleOverlayRenderer[] IGLASS = new SimpleOverlayRenderer[16];
    public static SimpleOverlayRenderer PIPELINE;
    public static SimpleOverlayRenderer COMPUTER_CASING;
    public static SimpleOverlayRenderer SATELLITE_CASING;
    public static SimpleOverlayRenderer PARALLEL_HATCH_GREEN;
    public static SimpleOverlayRenderer PARALLEL_HATCH_YELLOW;
    public static SimpleOverlayRenderer PARALLEL_HATCH_RED;
    public static SimpleOverlayRenderer PARALLEL_RACK_EMPTY;
    public static SimpleOverlayRenderer PARALLEL_RACK_ACTIVE;
    public static SimpleOverlayRenderer PARALLEL_RACK_INACTIVE;
    public static SimpleOverlayRenderer REACTOR_CASING;
    public static SimpleOverlayRenderer NUCLEAR_FUEL_HATCH_ACTIVE;
    public static SimpleOverlayRenderer NUCLEAR_FUEL_HATCH_INACTIVE;
    public static SimpleOverlayRenderer ADVANCED_TURBINE_CASING;
    public static RodHatchRenderer ROD_HATCH_RENDERER = new RodHatchRenderer();



    public static void preInit() {
        GTLog.logger.info("Precision Core Pre Initializing Textures");
        for(int i = 1; i<=4;i++) MULTI_TANK_FLUID_STORAGE[i-1] = new SimpleOverlayRenderer("multi_tank/fluid_storage_t"+i);
        for(int i = 0; i<=15;i++) IGLASS[i] = new SimpleOverlayRenderer("iglass/iglass"+i);
        PIPELINE = new SimpleOverlayRenderer("blockpipeline/fluid");
        COMPUTER_CASING = new SimpleOverlayRenderer("parallel/casing_computer");
        SATELLITE_CASING = new SimpleOverlayRenderer("parallel/casing_satellite");
        PARALLEL_HATCH_GREEN = new SimpleOverlayRenderer("parallel/hatch_green");
        PARALLEL_HATCH_YELLOW = new SimpleOverlayRenderer("parallel/hatch_yellow");
        PARALLEL_HATCH_RED = new SimpleOverlayRenderer("parallel/hatch_red");
        PARALLEL_RACK_EMPTY = new SimpleOverlayRenderer("parallel/rack_overlay_empty");
        PARALLEL_RACK_ACTIVE = new SimpleOverlayRenderer("parallel/rack_overlay_active");
        PARALLEL_RACK_INACTIVE = new SimpleOverlayRenderer("parallel/rack_overlay_inactive");
        REACTOR_CASING = new SimpleOverlayRenderer("nuclear/casing_reactor");
        NUCLEAR_FUEL_HATCH_ACTIVE  = new SimpleOverlayRenderer("nuclear/hatch_overlay_active");
        NUCLEAR_FUEL_HATCH_INACTIVE  = new SimpleOverlayRenderer("nuclear/hatch_overlay_inactive");
        ADVANCED_TURBINE_CASING = new SimpleOverlayRenderer("nuclear/casing_advanced_turbine");
    }
}
