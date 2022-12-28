package thaumcraft.client.renderers.models.gear;
import java.util.HashMap;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import thaumcraft.common.items.armor.ItemFortressArmor;


public class ModelFortressArmor extends ModelCustomArmor
{
    ModelRenderer OrnamentL;
    ModelRenderer OrnamentL2;
    ModelRenderer OrnamentR;
    ModelRenderer OrnamentR2;
    ModelRenderer Helmet;
    ModelRenderer HelmetR;
    ModelRenderer HelmetL;
    ModelRenderer HelmetB;
    ModelRenderer capsthingy;
    ModelRenderer flapR;
    ModelRenderer flapL;
    ModelRenderer Gemornament;
    ModelRenderer Gem;
    ModelRenderer[] Mask;
    ModelRenderer Goggles;
    ModelRenderer BeltR;
    ModelRenderer Mbelt;
    ModelRenderer MbeltL;
    ModelRenderer MbeltR;
    ModelRenderer BeltL;
    ModelRenderer Chestplate;
    ModelRenderer Scroll;
    ModelRenderer Backplate;
    ModelRenderer Book;
    ModelRenderer ShoulderR;
    ModelRenderer GauntletR;
    ModelRenderer GauntletstrapR1;
    ModelRenderer GauntletstrapR2;
    ModelRenderer ShoulderplateRtop;
    ModelRenderer ShoulderplateR1;
    ModelRenderer ShoulderplateR2;
    ModelRenderer ShoulderplateR3;
    ModelRenderer ShoulderL;
    ModelRenderer GauntletL;
    ModelRenderer Gauntletstrapl1;
    ModelRenderer GauntletstrapL2;
    ModelRenderer ShoulderplateLtop;
    ModelRenderer ShoulderplateL1;
    ModelRenderer ShoulderplateL2;
    ModelRenderer ShoulderplateL3;
    ModelRenderer LegpanelR1;
    ModelRenderer LegpanelR2;
    ModelRenderer LegpanelR3;
    ModelRenderer LegpanelR4;
    ModelRenderer LegpanelR5;
    ModelRenderer LegpanelR6;
    ModelRenderer SidepanelR1;
    ModelRenderer SidepanelR2;
    ModelRenderer SidepanelR3;
    ModelRenderer BackpanelR1;
    ModelRenderer BackpanelR2;
    ModelRenderer BackpanelR3;
    ModelRenderer BackpanelL3;
    ModelRenderer LegpanelL1;
    ModelRenderer LegpanelL2;
    ModelRenderer LegpanelL3;
    ModelRenderer LegpanelL4;
    ModelRenderer LegpanelL5;
    ModelRenderer LegpanelL6;
    ModelRenderer SidepanelL1;
    ModelRenderer SidepanelL2;
    ModelRenderer SidepanelL3;
    ModelRenderer BackpanelL1;
    ModelRenderer BackpanelL2;
    private static HashMap<Integer, Integer> hasSet;
    private static HashMap<Integer, Integer> hasMask;
    private static HashMap<Integer, Boolean> hasGoggles;
    
    public ModelFortressArmor(float f) {
        super(f, 0, 128, 64);
        textureWidth = 128;
        textureHeight = 64;
        Mask = new ModelRenderer[3];
        for (int a = 0; a < 3; ++a) {
            (Mask[a] = new ModelRenderer(this, 52 + a * 24, 2)).addBox(-4.5f, -5.0f, -4.6f, 9, 5, 1);
            Mask[a].setRotationPoint(0.0f, 0.0f, 0.0f);
            Mask[a].setTextureSize(128, 64);
            setRotation(Mask[a], 0.0f, 0.0f, 0.0f);
        }
        (Goggles = new ModelRenderer(this, 100, 18)).addBox(-4.5f, -5.0f, -4.25f, 9, 5, 1);
        Goggles.setRotationPoint(0.0f, 0.0f, 0.0f);
        Goggles.setTextureSize(128, 64);
        setRotation(Goggles, 0.0f, 0.0f, 0.0f);
        OrnamentL = new ModelRenderer(this, 78, 8);
        OrnamentL.mirror = true;
        OrnamentL.addBox(1.5f, -9.0f, -6.5f, 2, 2, 1);
        OrnamentL.setRotationPoint(0.0f, 0.0f, 0.0f);
        OrnamentL.setTextureSize(128, 64);
        setRotation(OrnamentL, -0.1396263f, 0.0f, 0.0f);
        OrnamentL2 = new ModelRenderer(this, 78, 8);
        OrnamentL2.mirror = true;
        OrnamentL2.addBox(3.5f, -10.0f, -6.5f, 1, 2, 1);
        OrnamentL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        OrnamentL2.setTextureSize(128, 64);
        setRotation(OrnamentL2, -0.1396263f, 0.0f, 0.0f);
        (OrnamentR = new ModelRenderer(this, 78, 8)).addBox(-3.5f, -9.0f, -6.5f, 2, 2, 1);
        OrnamentR.setRotationPoint(0.0f, 0.0f, 0.0f);
        OrnamentR.setTextureSize(128, 64);
        setRotation(OrnamentR, -0.1396263f, 0.0f, 0.0f);
        (OrnamentR2 = new ModelRenderer(this, 78, 8)).addBox(-4.5f, -10.0f, -6.5f, 1, 2, 1);
        OrnamentR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        OrnamentR2.setTextureSize(128, 64);
        setRotation(OrnamentR2, -0.1396263f, 0.0f, 0.0f);
        (Helmet = new ModelRenderer(this, 41, 8)).addBox(-4.5f, -9.0f, -4.5f, 9, 4, 9);
        Helmet.setRotationPoint(0.0f, 0.0f, 0.0f);
        Helmet.setTextureSize(128, 64);
        setRotation(Helmet, 0.0f, 0.0f, 0.0f);
        (HelmetR = new ModelRenderer(this, 21, 13)).addBox(-6.5f, -3.0f, -4.5f, 1, 5, 9);
        HelmetR.setRotationPoint(0.0f, 0.0f, 0.0f);
        HelmetR.setTextureSize(128, 64);
        setRotation(HelmetR, 0.0f, 0.0f, 0.5235988f);
        HelmetL = new ModelRenderer(this, 21, 13);
        HelmetL.mirror = true;
        HelmetL.addBox(5.5f, -3.0f, -4.5f, 1, 5, 9);
        HelmetL.setRotationPoint(0.0f, 0.0f, 0.0f);
        HelmetL.setTextureSize(128, 64);
        setRotation(HelmetL, 0.0f, 0.0f, -0.5235988f);
        (HelmetB = new ModelRenderer(this, 41, 21)).addBox(-4.5f, -3.0f, 5.5f, 9, 5, 1);
        HelmetB.setRotationPoint(0.0f, 0.0f, 0.0f);
        HelmetB.setTextureSize(128, 64);
        setRotation(HelmetB, 0.5235988f, 0.0f, 0.0f);
        (capsthingy = new ModelRenderer(this, 21, 0)).addBox(-4.5f, -6.0f, -6.5f, 9, 1, 2);
        capsthingy.setRotationPoint(0.0f, 0.0f, 0.0f);
        capsthingy.setTextureSize(128, 64);
        setRotation(capsthingy, 0.0f, 0.0f, 0.0f);
        (flapR = new ModelRenderer(this, 59, 10)).addBox(-10.0f, -2.0f, -1.0f, 3, 3, 1);
        flapR.setRotationPoint(0.0f, 0.0f, 0.0f);
        flapR.setTextureSize(128, 64);
        setRotation(flapR, 0.0f, -0.5235988f, 0.5235988f);
        flapL = new ModelRenderer(this, 59, 10);
        flapL.mirror = true;
        flapL.addBox(7.0f, -2.0f, -1.0f, 3, 3, 1);
        flapL.setRotationPoint(0.0f, 0.0f, 0.0f);
        flapL.setTextureSize(128, 64);
        setRotation(flapL, 0.0f, 0.5235988f, -0.5235988f);
        (Gemornament = new ModelRenderer(this, 68, 11)).addBox(-1.5f, -9.0f, -7.0f, 3, 3, 2);
        Gemornament.setRotationPoint(0.0f, 0.0f, 0.0f);
        Gemornament.setTextureSize(128, 64);
        setRotation(Gemornament, -0.1396263f, 0.0f, 0.0f);
        (Gem = new ModelRenderer(this, 72, 8)).addBox(-1.0f, -8.5f, -7.5f, 2, 2, 1);
        Gem.setRotationPoint(0.0f, 0.0f, 0.0f);
        Gem.setTextureSize(128, 64);
        setRotation(Gem, -0.1396263f, 0.0f, 0.0f);
        (BeltR = new ModelRenderer(this, 76, 44)).addBox(-5.0f, 4.0f, -3.0f, 1, 3, 6);
        BeltR.setRotationPoint(0.0f, 0.0f, 0.0f);
        BeltR.setTextureSize(128, 64);
        setRotation(BeltR, 0.0f, 0.0f, 0.0f);
        (Mbelt = new ModelRenderer(this, 56, 55)).addBox(-4.0f, 8.0f, -3.0f, 8, 4, 1);
        Mbelt.setRotationPoint(0.0f, 0.0f, 0.0f);
        Mbelt.setTextureSize(128, 64);
        setRotation(Mbelt, 0.0f, 0.0f, 0.0f);
        (MbeltL = new ModelRenderer(this, 76, 44)).addBox(4.0f, 8.0f, -3.0f, 1, 3, 6);
        MbeltL.setRotationPoint(0.0f, 0.0f, 0.0f);
        MbeltL.setTextureSize(128, 64);
        setRotation(MbeltL, 0.0f, 0.0f, 0.0f);
        (MbeltR = new ModelRenderer(this, 76, 44)).addBox(-5.0f, 8.0f, -3.0f, 1, 3, 6);
        MbeltR.setRotationPoint(0.0f, 0.0f, 0.0f);
        MbeltR.setTextureSize(128, 64);
        setRotation(MbeltR, 0.0f, 0.0f, 0.0f);
        (BeltL = new ModelRenderer(this, 76, 44)).addBox(4.0f, 4.0f, -3.0f, 1, 3, 6);
        BeltL.setRotationPoint(0.0f, 0.0f, 0.0f);
        BeltL.setTextureSize(128, 64);
        setRotation(BeltL, 0.0f, 0.0f, 0.0f);
        (Chestplate = new ModelRenderer(this, 56, 45)).addBox(-4.0f, 1.0f, -4.0f, 8, 7, 2);
        Chestplate.setRotationPoint(0.0f, 0.0f, 0.0f);
        Chestplate.setTextureSize(128, 64);
        setRotation(Chestplate, 0.0f, 0.0f, 0.0f);
        (Scroll = new ModelRenderer(this, 34, 27)).addBox(-2.0f, 9.5f, 4.0f, 8, 3, 3);
        Scroll.setRotationPoint(0.0f, 0.0f, 0.0f);
        Scroll.setTextureSize(128, 64);
        setRotation(Scroll, 0.0f, 0.0f, 0.1919862f);
        (Backplate = new ModelRenderer(this, 36, 45)).addBox(-4.0f, 1.0f, 2.0f, 8, 11, 2);
        Backplate.setRotationPoint(0.0f, 0.0f, 0.0f);
        Backplate.setTextureSize(128, 64);
        setRotation(Backplate, 0.0f, 0.0f, 0.0f);
        (Book = new ModelRenderer(this, 100, 8)).addBox(1.0f, -0.3f, 4.0f, 5, 7, 2);
        Book.setRotationPoint(0.0f, 0.0f, 0.0f);
        Book.setTextureSize(128, 64);
        setRotation(Book, 0.0f, 0.0f, 0.7679449f);
        (ShoulderR = new ModelRenderer(this, 56, 35)).addBox(-3.5f, -2.5f, -2.5f, 5, 5, 5);
        ShoulderR.setRotationPoint(0.0f, 0.0f, 0.0f);
        ShoulderR.setTextureSize(128, 64);
        setRotation(ShoulderR, 0.0f, 0.0f, 0.0f);
        (GauntletR = new ModelRenderer(this, 100, 26)).addBox(-3.5f, 3.5f, -2.5f, 2, 6, 5);
        GauntletR.setRotationPoint(0.0f, 0.0f, 0.0f);
        GauntletR.setTextureSize(128, 64);
        setRotation(GauntletR, 0.0f, 0.0f, 0.0f);
        (GauntletstrapR1 = new ModelRenderer(this, 84, 31)).addBox(-1.5f, 3.5f, -2.5f, 3, 1, 5);
        GauntletstrapR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        GauntletstrapR1.setTextureSize(128, 64);
        setRotation(GauntletstrapR1, 0.0f, 0.0f, 0.0f);
        (GauntletstrapR2 = new ModelRenderer(this, 84, 31)).addBox(-1.5f, 6.5f, -2.5f, 3, 1, 5);
        GauntletstrapR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        GauntletstrapR2.setTextureSize(128, 64);
        setRotation(GauntletstrapR2, 0.0f, 0.0f, 0.0f);
        (ShoulderplateRtop = new ModelRenderer(this, 110, 37)).addBox(-5.5f, -2.5f, -3.5f, 2, 1, 7);
        ShoulderplateRtop.setRotationPoint(0.0f, 0.0f, 0.0f);
        ShoulderplateRtop.setTextureSize(128, 64);
        setRotation(ShoulderplateRtop, 0.0f, 0.0f, 0.4363323f);
        (ShoulderplateR1 = new ModelRenderer(this, 110, 45)).addBox(-4.5f, -1.5f, -3.5f, 1, 4, 7);
        ShoulderplateR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        ShoulderplateR1.setTextureSize(128, 64);
        setRotation(ShoulderplateR1, 0.0f, 0.0f, 0.4363323f);
        (ShoulderplateR2 = new ModelRenderer(this, 94, 45)).addBox(-3.5f, 1.5f, -3.5f, 1, 3, 7);
        ShoulderplateR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        ShoulderplateR2.setTextureSize(128, 64);
        setRotation(ShoulderplateR2, 0.0f, 0.0f, 0.4363323f);
        (ShoulderplateR3 = new ModelRenderer(this, 94, 45)).addBox(-2.5f, 3.5f, -3.5f, 1, 3, 7);
        ShoulderplateR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        ShoulderplateR3.setTextureSize(128, 64);
        setRotation(ShoulderplateR3, 0.0f, 0.0f, 0.4363323f);
        ShoulderL = new ModelRenderer(this, 56, 35);
        ShoulderL.mirror = true;
        ShoulderL.addBox(-1.5f, -2.5f, -2.5f, 5, 5, 5);
        ShoulderL.setRotationPoint(0.0f, 0.0f, 0.0f);
        ShoulderL.setTextureSize(128, 64);
        setRotation(ShoulderL, 0.0f, 0.0f, 0.0f);
        (GauntletL = new ModelRenderer(this, 114, 26)).addBox(1.5f, 3.5f, -2.5f, 2, 6, 5);
        GauntletL.setRotationPoint(0.0f, 0.0f, 0.0f);
        GauntletL.setTextureSize(128, 64);
        setRotation(GauntletL, 0.0f, 0.0f, 0.0f);
        Gauntletstrapl1 = new ModelRenderer(this, 84, 31);
        Gauntletstrapl1.mirror = true;
        Gauntletstrapl1.addBox(-1.5f, 3.5f, -2.5f, 3, 1, 5);
        Gauntletstrapl1.setRotationPoint(0.0f, 0.0f, 0.0f);
        Gauntletstrapl1.setTextureSize(128, 64);
        setRotation(Gauntletstrapl1, 0.0f, 0.0f, 0.0f);
        GauntletstrapL2 = new ModelRenderer(this, 84, 31);
        GauntletstrapL2.mirror = true;
        GauntletstrapL2.addBox(-1.5f, 6.5f, -2.5f, 3, 1, 5);
        GauntletstrapL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        GauntletstrapL2.setTextureSize(128, 64);
        setRotation(GauntletstrapL2, 0.0f, 0.0f, 0.0f);
        ShoulderplateLtop = new ModelRenderer(this, 110, 37);
        ShoulderplateLtop.mirror = true;
        ShoulderplateLtop.addBox(3.5f, -2.5f, -3.5f, 2, 1, 7);
        ShoulderplateLtop.setRotationPoint(0.0f, 0.0f, 0.0f);
        ShoulderplateLtop.setTextureSize(128, 64);
        setRotation(ShoulderplateLtop, 0.0f, 0.0f, -0.4363323f);
        ShoulderplateL1 = new ModelRenderer(this, 110, 45);
        ShoulderplateL1.mirror = true;
        ShoulderplateL1.addBox(3.5f, -1.5f, -3.5f, 1, 4, 7);
        ShoulderplateL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        ShoulderplateL1.setTextureSize(128, 64);
        setRotation(ShoulderplateL1, 0.0f, 0.0f, -0.4363323f);
        ShoulderplateL2 = new ModelRenderer(this, 94, 45);
        ShoulderplateL2.mirror = true;
        ShoulderplateL2.addBox(2.5f, 1.5f, -3.5f, 1, 3, 7);
        ShoulderplateL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        ShoulderplateL2.setTextureSize(128, 64);
        setRotation(ShoulderplateL2, 0.0f, 0.0f, -0.4363323f);
        ShoulderplateL3 = new ModelRenderer(this, 94, 45);
        ShoulderplateL3.mirror = true;
        ShoulderplateL3.addBox(1.5f, 3.5f, -3.5f, 1, 3, 7);
        ShoulderplateL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        ShoulderplateL3.setTextureSize(128, 64);
        setRotation(ShoulderplateL3, 0.0f, 0.0f, -0.4363323f);
        (LegpanelR1 = new ModelRenderer(this, 0, 51)).addBox(-1.0f, 0.5f, -3.5f, 3, 4, 1);
        LegpanelR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelR1.setTextureSize(128, 64);
        setRotation(LegpanelR1, -0.4363323f, 0.0f, 0.0f);
        (LegpanelR2 = new ModelRenderer(this, 8, 51)).addBox(-1.0f, 3.5f, -2.5f, 3, 4, 1);
        LegpanelR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelR2.setTextureSize(128, 64);
        setRotation(LegpanelR2, -0.4363323f, 0.0f, 0.0f);
        (LegpanelR3 = new ModelRenderer(this, 0, 56)).addBox(-1.0f, 6.5f, -1.5f, 3, 3, 1);
        LegpanelR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelR3.setTextureSize(128, 64);
        setRotation(LegpanelR3, -0.4363323f, 0.0f, 0.0f);
        (LegpanelR4 = new ModelRenderer(this, 0, 43)).addBox(-3.0f, 0.5f, -3.5f, 2, 3, 1);
        LegpanelR4.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelR4.setTextureSize(128, 64);
        setRotation(LegpanelR4, -0.4363323f, 0.0f, 0.0f);
        (LegpanelR5 = new ModelRenderer(this, 0, 47)).addBox(-3.0f, 2.5f, -2.5f, 2, 3, 1);
        LegpanelR5.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelR5.setTextureSize(128, 64);
        setRotation(LegpanelR5, -0.4363323f, 0.0f, 0.0f);
        (LegpanelR6 = new ModelRenderer(this, 6, 43)).addBox(-3.0f, 4.5f, -1.5f, 2, 3, 1);
        LegpanelR6.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelR6.setTextureSize(128, 64);
        setRotation(LegpanelR6, -0.4363323f, 0.0f, 0.0f);
        (SidepanelR1 = new ModelRenderer(this, 0, 22)).addBox(-2.5f, 0.5f, -2.5f, 1, 4, 5);
        SidepanelR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        SidepanelR1.setTextureSize(128, 64);
        setRotation(SidepanelR1, 0.0f, 0.0f, 0.4363323f);
        (SidepanelR2 = new ModelRenderer(this, 0, 31)).addBox(-1.5f, 3.5f, -2.5f, 1, 3, 5);
        SidepanelR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        SidepanelR2.setTextureSize(128, 64);
        setRotation(SidepanelR2, 0.0f, 0.0f, 0.4363323f);
        (SidepanelR3 = new ModelRenderer(this, 12, 31)).addBox(-0.5f, 5.5f, -2.5f, 1, 3, 5);
        SidepanelR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        SidepanelR3.setTextureSize(128, 64);
        setRotation(SidepanelR3, 0.0f, 0.0f, 0.4363323f);
        (BackpanelR1 = new ModelRenderer(this, 0, 18)).addBox(-3.0f, 0.5f, 2.5f, 5, 3, 1);
        BackpanelR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        BackpanelR1.setTextureSize(128, 64);
        setRotation(BackpanelR1, 0.4363323f, 0.0f, 0.0f);
        (BackpanelR2 = new ModelRenderer(this, 0, 18)).addBox(-3.0f, 2.5f, 1.5f, 5, 3, 1);
        BackpanelR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        BackpanelR2.setTextureSize(128, 64);
        setRotation(BackpanelR2, 0.4363323f, 0.0f, 0.0f);
        (BackpanelR3 = new ModelRenderer(this, 0, 18)).addBox(-3.0f, 4.5f, 0.5f, 5, 3, 1);
        BackpanelR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        BackpanelR3.setTextureSize(128, 64);
        setRotation(BackpanelR3, 0.4363323f, 0.0f, 0.0f);
        BackpanelL3 = new ModelRenderer(this, 0, 18);
        BackpanelL3.mirror = true;
        BackpanelL3.addBox(-2.0f, 4.5f, 0.5f, 5, 3, 1);
        BackpanelL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        BackpanelL3.setTextureSize(128, 64);
        setRotation(BackpanelL3, 0.4363323f, 0.0f, 0.0f);
        LegpanelL1 = new ModelRenderer(this, 0, 51);
        LegpanelL1.mirror = true;
        LegpanelL1.addBox(-2.0f, 0.5f, -3.5f, 3, 4, 1);
        LegpanelL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelL1.setTextureSize(128, 64);
        setRotation(LegpanelL1, -0.4363323f, 0.0f, 0.0f);
        LegpanelL2 = new ModelRenderer(this, 8, 51);
        LegpanelL2.mirror = true;
        LegpanelL2.addBox(-2.0f, 3.5f, -2.5f, 3, 4, 1);
        LegpanelL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelL2.setTextureSize(128, 64);
        setRotation(LegpanelL2, -0.4363323f, 0.0f, 0.0f);
        LegpanelL3 = new ModelRenderer(this, 0, 56);
        LegpanelL3.mirror = true;
        LegpanelL3.addBox(-2.0f, 6.5f, -1.5f, 3, 3, 1);
        LegpanelL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelL3.setTextureSize(128, 64);
        setRotation(LegpanelL3, -0.4363323f, 0.0f, 0.0f);
        LegpanelL4 = new ModelRenderer(this, 0, 43);
        LegpanelL4.mirror = true;
        LegpanelL4.addBox(1.0f, 0.5f, -3.5f, 2, 3, 1);
        LegpanelL4.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelL4.setTextureSize(128, 64);
        setRotation(LegpanelL4, -0.4363323f, 0.0f, 0.0f);
        LegpanelL5 = new ModelRenderer(this, 0, 47);
        LegpanelL5.mirror = true;
        LegpanelL5.addBox(1.0f, 2.5f, -2.5f, 2, 3, 1);
        LegpanelL5.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelL5.setTextureSize(128, 64);
        setRotation(LegpanelL5, -0.4363323f, 0.0f, 0.0f);
        LegpanelL6 = new ModelRenderer(this, 6, 43);
        LegpanelL6.mirror = true;
        LegpanelL6.addBox(1.0f, 4.5f, -1.5f, 2, 3, 1);
        LegpanelL6.setRotationPoint(0.0f, 0.0f, 0.0f);
        LegpanelL6.setTextureSize(128, 64);
        setRotation(LegpanelL6, -0.4363323f, 0.0f, 0.0f);
        SidepanelL1 = new ModelRenderer(this, 0, 22);
        SidepanelL1.mirror = true;
        SidepanelL1.addBox(1.5f, 0.5f, -2.5f, 1, 4, 5);
        SidepanelL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        SidepanelL1.setTextureSize(128, 64);
        setRotation(SidepanelL1, 0.0f, 0.0f, -0.4363323f);
        SidepanelL2 = new ModelRenderer(this, 0, 31);
        SidepanelL2.mirror = true;
        SidepanelL2.addBox(0.5f, 3.5f, -2.5f, 1, 3, 5);
        SidepanelL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        SidepanelL2.setTextureSize(128, 64);
        setRotation(SidepanelL2, 0.0f, 0.0f, -0.4363323f);
        SidepanelL3 = new ModelRenderer(this, 12, 31);
        SidepanelL3.mirror = true;
        SidepanelL3.addBox(-0.5f, 5.5f, -2.5f, 1, 3, 5);
        SidepanelL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        SidepanelL3.setTextureSize(128, 64);
        setRotation(SidepanelL3, 0.0f, 0.0f, -0.4363323f);
        BackpanelL1 = new ModelRenderer(this, 0, 18);
        BackpanelL1.mirror = true;
        BackpanelL1.addBox(-2.0f, 0.5f, 2.5f, 5, 3, 1);
        BackpanelL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        BackpanelL1.setTextureSize(128, 64);
        setRotation(BackpanelL1, 0.4363323f, 0.0f, 0.0f);
        BackpanelL2 = new ModelRenderer(this, 0, 18);
        BackpanelL2.mirror = true;
        BackpanelL2.addBox(-2.0f, 2.5f, 1.5f, 5, 3, 1);
        BackpanelL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        BackpanelL2.setTextureSize(128, 64);
        setRotation(BackpanelL2, 0.4363323f, 0.0f, 0.0f);
        bipedHeadwear.cubeList.clear();
        bipedHead.cubeList.clear();
        bipedHead.addChild(OrnamentL);
        bipedHead.addChild(OrnamentL2);
        bipedHead.addChild(OrnamentR);
        bipedHead.addChild(OrnamentR2);
        bipedHead.addChild(Helmet);
        bipedHead.addChild(HelmetR);
        bipedHead.addChild(HelmetL);
        bipedHead.addChild(HelmetB);
        bipedHead.addChild(capsthingy);
        bipedHead.addChild(flapR);
        bipedHead.addChild(flapL);
        bipedHead.addChild(Gemornament);
        bipedHead.addChild(Gem);
        bipedHead.addChild(Goggles);
        bipedHead.addChild(Mask[0]);
        bipedHead.addChild(Mask[1]);
        bipedHead.addChild(Mask[2]);
        bipedBody.cubeList.clear();
        if (f < 1.0f) {
            bipedBody.addChild(Mbelt);
            bipedBody.addChild(MbeltL);
            bipedBody.addChild(MbeltR);
        }
        else {
            bipedBody.addChild(BeltR);
            bipedBody.addChild(BeltL);
            bipedBody.addChild(Chestplate);
            bipedBody.addChild(Scroll);
            bipedBody.addChild(Backplate);
            bipedBody.addChild(Book);
        }
        bipedRightArm.cubeList.clear();
        bipedRightArm.addChild(ShoulderR);
        bipedRightArm.addChild(GauntletR);
        bipedRightArm.addChild(GauntletstrapR1);
        bipedRightArm.addChild(GauntletstrapR2);
        bipedRightArm.addChild(ShoulderplateRtop);
        bipedRightArm.addChild(ShoulderplateR1);
        bipedRightArm.addChild(ShoulderplateR2);
        bipedRightArm.addChild(ShoulderplateR3);
        bipedLeftArm.cubeList.clear();
        bipedLeftArm.addChild(ShoulderL);
        bipedLeftArm.addChild(GauntletL);
        bipedLeftArm.addChild(Gauntletstrapl1);
        bipedLeftArm.addChild(GauntletstrapL2);
        bipedLeftArm.addChild(ShoulderplateLtop);
        bipedLeftArm.addChild(ShoulderplateL1);
        bipedLeftArm.addChild(ShoulderplateL2);
        bipedLeftArm.addChild(ShoulderplateL3);
        bipedRightLeg.cubeList.clear();
        bipedRightLeg.addChild(LegpanelR1);
        bipedRightLeg.addChild(LegpanelR2);
        bipedRightLeg.addChild(LegpanelR3);
        bipedRightLeg.addChild(LegpanelR4);
        bipedRightLeg.addChild(LegpanelR5);
        bipedRightLeg.addChild(LegpanelR6);
        bipedRightLeg.addChild(SidepanelR1);
        bipedRightLeg.addChild(SidepanelR2);
        bipedRightLeg.addChild(SidepanelR3);
        bipedRightLeg.addChild(BackpanelR1);
        bipedRightLeg.addChild(BackpanelR2);
        bipedRightLeg.addChild(BackpanelR3);
        bipedLeftLeg.cubeList.clear();
        bipedLeftLeg.addChild(BackpanelL3);
        bipedLeftLeg.addChild(LegpanelL1);
        bipedLeftLeg.addChild(LegpanelL2);
        bipedLeftLeg.addChild(LegpanelL3);
        bipedLeftLeg.addChild(LegpanelL4);
        bipedLeftLeg.addChild(LegpanelL5);
        bipedLeftLeg.addChild(LegpanelL6);
        bipedLeftLeg.addChild(SidepanelL1);
        bipedLeftLeg.addChild(SidepanelL2);
        bipedLeftLeg.addChild(SidepanelL3);
        bipedLeftLeg.addChild(BackpanelL1);
        bipedLeftLeg.addChild(BackpanelL2);
    }
    
    private void checkSet(Entity entity) {
        if (entity instanceof EntityLivingBase && entity.ticksExisted % 20 == 0) {
            int set = 0;
            for (int a = 2; a < 5; ++a) {
                ItemStack piece = ((EntityLivingBase)entity).getItemStackFromSlot(EntityEquipmentSlot.values()[a + 1]);
                if (piece != null && piece.getItem() instanceof ItemFortressArmor) {
                    ++set;
                    if (a == 4) {
                        if (piece.hasTagCompound() && piece.getTagCompound().hasKey("mask")) {
                            ModelFortressArmor.hasMask.put(entity.getEntityId(), piece.getTagCompound().getInteger("mask"));
                        }
                        else {
                            ModelFortressArmor.hasMask.remove(entity.getEntityId());
                        }
                        if (piece.hasTagCompound() && piece.getTagCompound().hasKey("goggles")) {
                            ModelFortressArmor.hasGoggles.put(entity.getEntityId(), true);
                        }
                        else {
                            ModelFortressArmor.hasGoggles.remove(entity.getEntityId());
                        }
                    }
                }
            }
            if (set > 0) {
                ModelFortressArmor.hasSet.put(entity.getEntityId(), set);
            }
            else {
                ModelFortressArmor.hasSet.remove(entity.getEntityId());
            }
        }
    }
    
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        checkSet(entity);
        int set = ModelFortressArmor.hasSet.containsKey(entity.getEntityId()) ? ModelFortressArmor.hasSet.get(entity.getEntityId()) : -1;
        int mask = ModelFortressArmor.hasMask.containsKey(entity.getEntityId()) ? ModelFortressArmor.hasMask.get(entity.getEntityId()) : -1;
        Goggles.isHidden = !ModelFortressArmor.hasGoggles.containsKey(entity.getEntityId());
        for (int a = 0; a < 3; ++a) {
            if (mask == a) {
                Mask[a].isHidden = false;
            }
            else {
                Mask[a].isHidden = true;
            }
        }
        Scroll.isHidden = (set < 3);
        Book.isHidden = (set < 2);
        OrnamentL.isHidden = (set < 3);
        OrnamentL2.isHidden = (set < 3);
        OrnamentR.isHidden = (set < 3);
        OrnamentR2.isHidden = (set < 3);
        Gemornament.isHidden = (set < 3);
        Gem.isHidden = (set < 3);
        flapL.isHidden = (set < 2);
        flapR.isHidden = (set < 2);
        ShoulderplateLtop.isHidden = (set < 2);
        ShoulderplateL1.isHidden = (set < 2);
        ShoulderplateL2.isHidden = (set < 3);
        ShoulderplateL3.isHidden = (set < 3);
        ShoulderplateRtop.isHidden = (set < 2);
        ShoulderplateR1.isHidden = (set < 2);
        ShoulderplateR2.isHidden = (set < 3);
        ShoulderplateR3.isHidden = (set < 3);
        SidepanelR2.isHidden = (set < 2);
        SidepanelL2.isHidden = (set < 2);
        SidepanelR3.isHidden = (set < 3);
        SidepanelL3.isHidden = (set < 3);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (isChild) {
            float f6 = 2.0f;
            GL11.glPushMatrix();
            GL11.glScalef(1.5f / f6, 1.5f / f6, 1.5f / f6);
            GL11.glTranslatef(0.0f, 16.0f * f5, 0.0f);
            bipedHead.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0f / f6, 1.0f / f6, 1.0f / f6);
            GL11.glTranslatef(0.0f, 24.0f * f5, 0.0f);
            bipedBody.render(f5);
            bipedRightArm.render(f5);
            bipedLeftArm.render(f5);
            bipedRightLeg.render(f5);
            bipedLeftLeg.render(f5);
            bipedHeadwear.render(f5);
            GL11.glPopMatrix();
        }
        else {
            GL11.glPushMatrix();
            GL11.glScalef(1.01f, 1.01f, 1.01f);
            bipedHead.render(f5);
            GL11.glPopMatrix();
            bipedBody.render(f5);
            bipedRightArm.render(f5);
            bipedLeftArm.render(f5);
            bipedRightLeg.render(f5);
            bipedLeftLeg.render(f5);
            bipedHeadwear.render(f5);
        }
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    static {
        ModelFortressArmor.hasSet = new HashMap<Integer, Integer>();
        ModelFortressArmor.hasMask = new HashMap<Integer, Integer>();
        ModelFortressArmor.hasGoggles = new HashMap<Integer, Boolean>();
    }
}
