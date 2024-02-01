package uk.cosrnic.smallviewmodel.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import uk.cosrnic.smallviewmodel.SmallViewModel;

import static me.shedaniel.autoconfig.AutoConfig.getConfigHolder;

@Config(name = SmallViewModel.MODID)
public class SmallViewModelConfig implements ConfigData {

    //GENERAL
    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("General")
    @ConfigEntry.Gui.Tooltip()
    public boolean useSameScaleForOff = true;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("General")
    @ConfigEntry.Gui.Tooltip()
    public boolean useSameScaleForArm = false;


    // MAIN HAND

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Main Hand")
    @ConfigEntry.BoundedDiscrete(min = -3, max = 3)
    @ConfigEntry.Gui.PrefixText
    public float posXMain = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Main Hand")
    @ConfigEntry.BoundedDiscrete(min = -3, max = 3)
    public float posYMain = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Main Hand")
    @ConfigEntry.BoundedDiscrete(min = -3, max = 3)
    public float posZMain = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Main Hand")
    @ConfigEntry.BoundedDiscrete(min = -180, max = 180)
    @ConfigEntry.Gui.PrefixText
    public float rotXMain = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Main Hand")
    @ConfigEntry.BoundedDiscrete(min = -180, max = 180)
    public float rotYMain = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Main Hand")
    @ConfigEntry.BoundedDiscrete(min = -180, max = 180)
    public float rotZMain = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Main Hand")
    @ConfigEntry.BoundedDiscrete(max = 5)
    @ConfigEntry.Gui.PrefixText
    public float scaleXMain = 1f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Main Hand")
    @ConfigEntry.BoundedDiscrete(max = 5)
    public float scaleYMain = 1f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Main Hand")
    @ConfigEntry.BoundedDiscrete(max = 5)
    public float scaleZMain = 1f;

    // OFF HAND

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Off Hand")
    @ConfigEntry.BoundedDiscrete(min = -3, max = 3)
    @ConfigEntry.Gui.PrefixText
    public float posXOff = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Off Hand")
    @ConfigEntry.BoundedDiscrete(min = -3, max = 3)
    public float posYOff = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Off Hand")
    @ConfigEntry.BoundedDiscrete(min = -3, max = 3)
    public float posZOff = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Off Hand")
    @ConfigEntry.BoundedDiscrete(min = -180, max = 180)
    @ConfigEntry.Gui.PrefixText
    public float rotXOff = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Off Hand")
    @ConfigEntry.BoundedDiscrete(min = -180, max = 180)
    public float rotYOff = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Off Hand")
    @ConfigEntry.BoundedDiscrete(min = -180, max = 180)
    public float rotZOff = 0f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Off Hand")
    @ConfigEntry.BoundedDiscrete(max = 5)
    @ConfigEntry.Gui.PrefixText
    public float scaleXOff = 1f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Off Hand")
    @ConfigEntry.BoundedDiscrete(max = 5)
    public float scaleYOff = 1f;

    @ConfigEntry.Gui.TransitiveObject
    @ConfigEntry.Category("Off Hand")
    @ConfigEntry.BoundedDiscrete(max = 5)
    public float scaleZOff = 1f;

   // ARM

   @ConfigEntry.Gui.TransitiveObject
   @ConfigEntry.Category("Arm")
   @ConfigEntry.BoundedDiscrete(min = -3, max = 3)
   @ConfigEntry.Gui.PrefixText
   public float posXArm = 0f;

   @ConfigEntry.Gui.TransitiveObject
   @ConfigEntry.Category("Arm")
   @ConfigEntry.BoundedDiscrete(min = -3, max = 3)
   public float posYArm = 0f;

   @ConfigEntry.Gui.TransitiveObject
   @ConfigEntry.Category("Arm")
   @ConfigEntry.BoundedDiscrete(min = -3, max = 3)
   public float posZArm = 0f;

   @ConfigEntry.Gui.TransitiveObject
   @ConfigEntry.Category("Arm")
   @ConfigEntry.BoundedDiscrete(min = -180, max = 180)
   @ConfigEntry.Gui.PrefixText
   public float rotXArm = 0f;

   @ConfigEntry.Gui.TransitiveObject
   @ConfigEntry.Category("Arm")
   @ConfigEntry.BoundedDiscrete(min = -180, max = 180)
   public float rotYArm = 0f;

   @ConfigEntry.Gui.TransitiveObject
   @ConfigEntry.Category("Arm")
   @ConfigEntry.BoundedDiscrete(min = -180, max = 180)
   public float rotZArm = 0f;

   @ConfigEntry.Gui.TransitiveObject
   @ConfigEntry.Category("Arm")
   @ConfigEntry.BoundedDiscrete(max = 5)
   @ConfigEntry.Gui.PrefixText
   public float scaleXArm = 1f;

   @ConfigEntry.Gui.TransitiveObject
   @ConfigEntry.Category("Arm")
   @ConfigEntry.BoundedDiscrete( max = 5)
   public float scaleYArm = 1f;

   @ConfigEntry.Gui.TransitiveObject
   @ConfigEntry.Category("Arm")
   @ConfigEntry.BoundedDiscrete( max = 5)
   public float scaleZArm = 1f;

    public static void register() {
        AutoConfig.register(SmallViewModelConfig.class, GsonConfigSerializer::new);
    }

    public static SmallViewModelConfig get() {
        SmallViewModelConfig cfg = getConfigHolder(SmallViewModelConfig.class).getConfig(); //TODO: Maybe use a clone to prevent overwriting offhand and arm config values? idk im too lazy
        if (cfg.useSameScaleForOff) {
            cfg.posXOff = cfg.posXMain;
            cfg.posYOff = cfg.posYMain;
            cfg.posZOff = cfg.posZMain;

            cfg.rotXOff = cfg.rotXMain;
            cfg.rotYOff = cfg.rotYMain;
            cfg.rotZOff = cfg.rotZMain;

            cfg.scaleXOff = cfg.scaleXMain;
            cfg.scaleYOff = cfg.scaleYMain;
            cfg.scaleZOff = cfg.scaleZMain;

        }

        if (cfg.useSameScaleForArm) {
            cfg.posXArm = cfg.posXMain;
            cfg.posYArm = cfg.posYMain;
            cfg.posZArm = cfg.posZMain;

            cfg.rotXArm = cfg.rotXMain;
            cfg.rotYArm = cfg.rotYMain;
            cfg.rotZArm = cfg.rotZMain;

            cfg.scaleXArm = cfg.scaleXMain;
            cfg.scaleYArm = cfg.scaleYMain;
            cfg.scaleZArm = cfg.scaleZMain;
        }
        return cfg;
    }

    public static void save() {
        getConfigHolder(SmallViewModelConfig.class).save();
    }
}
