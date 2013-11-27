package ThePlayerHaze.UnnamedMod;

// This Import list will grow longer with each additional tutorial.
// It's not pruned between full class postings, unlike other tutorial code.
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.*;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
@Mod(modid="YargMod", name="Yarg Mod", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class YargMod {
       
       
        @Instance("YargMod")
        public static YargMod instance;
        
      //Tool Materials                                                  Name harvestLevel durabiliy efficiency mobDamage encahtibility
        //EnumToolMaterial Mogitemat = EnumHelper.addToolMaterial(Mogitemat, 9999, 9999, 9999, 9999, 9999);
        
       //Creative Tabs
        //Ingots/Resources
        public static CreativeTabs YargModMaterialsTab = new CreativeTabs("tabMaterials"){
        	public ItemStack getIconItemStack(){
        		return new ItemStack(MogiteIngot);
        	}
        };
        public static CreativeTabs YargModIngotTab = new CreativeTabs("tabIngots"){
        	public ItemStack getIconItemStack(){
        		return new ItemStack(MogiteIngot);
        	}
        };
        public static CreativeTabs YargModToolsTab = new CreativeTabs("tabTools"){
        	public ItemStack getIconItemStack(){
        		return new ItemStack(MogitePick);
        	}
        };
        //Blocks
        public static CreativeTabs YargModBlocksTab = new CreativeTabs("tabBlocks"){
        	public ItemStack getIconItemStack(){
        		return new ItemStack(blockMogite);
        	}
        };


       //Items
        public final static Item MogiteIngot = new YargBasicItems(5001) .setMaxStackSize(64).setTextureName("YargMod:MogiteIngot").setCreativeTab(YargModMaterialsTab);
        public final static Item CleariteIngot = new YargBasicItems(5002) .setMaxStackSize(16).setTextureName("YargMod:CleariteIngot").setCreativeTab(YargModIngotTab);
        public final static Item EunoianiteIngot = new YargBasicItems(5005) .setMaxStackSize(16).setTextureName("YargMod:EunoianiteIngot").setCreativeTab(YargModIngotTab);
        public final static Item MogitePick = new YargBasicItems(5003) .setMaxStackSize(1).setTextureName("YargMod:MogitePick").setCreativeTab(YargModToolsTab).setUnlocalizedName("MogitePick");
        public final static Item MogiteShovel = new YargBasicItems(5004) .setMaxStackSize(1).setTextureName("YargMod:MogiteShovel").setCreativeTab(YargModToolsTab).setUnlocalizedName("MogiteShovel");

        //blocks
        public final static Block blockMogite = new blockMogite(2002, Material.rock).setUnlocalizedName("blockMogite").setHardness(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(YargModBlocksTab).setTextureName("yargmod:MogiteBlock");
        public final static Block blockClearite = new blockClearite(2004, Material.iron).setUnlocalizedName("blockClearite").setHardness(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(YargModBlocksTab).setTextureName("yargmod:MogiteBlock");
        

        public final static Block blockMogiteOre = new blockMogiteOre(2003, Material.rock).setUnlocalizedName("blockMogiteOre").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(YargModBlocksTab).setTextureName("yargmod:MogiteOre");
        public final static Block blockCleariteOre = new blockCleariteOre(2005, Material.iron).setUnlocalizedName("blockCleariteOre").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(YargModBlocksTab).setTextureName("yargmod:MogiteOre");
        public final static Block blockEunoianiteOre = new blockEunoianiteOre(2006, Material.rock).setUnlocalizedName("blockEunoianiteOre").setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(YargModBlocksTab).setTextureName("yargmod:EunoianiteOre");

        
        @SidedProxy(clientSide="ThePlayerHaze.UnnamedMod.client.ClientProxy",
                        serverSide="tutorial.generic.CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
        	
        	    //Creative Tabs
        	    LanguageRegistry.instance().addStringLocalization("itemGroup.tabMaterials", "en_US", "YargMod Materials");
        	    LanguageRegistry.instance().addStringLocalization("itemGroup.tabBlocks", "en_US", "YargMod Blocks");
        	    
        	    
        	    //items
                LanguageRegistry.addName(MogiteIngot, "Mogite Ingot");
                LanguageRegistry.addName(EunoianiteIngot, "Eunoianite Ingot");
                LanguageRegistry.addName(CleariteIngot, "Clearite Ingot");
                LanguageRegistry.addName(MogitePick, "Mogite Pick");
                LanguageRegistry.addName(MogiteShovel, "Mogite Shovel");

                //blocks
                GameRegistry.registerBlock(blockMogite, "blockMogite");
                LanguageRegistry.addName(blockMogite, "Mogite Block");
                MinecraftForge.setBlockHarvestLevel(blockMogite, "pickaxe", 2);
                
                
                //Ores
                GameRegistry.registerBlock(blockMogiteOre, "MogiteOre");
                LanguageRegistry.addName(blockMogiteOre, "Mogite Ore");
                MinecraftForge.setBlockHarvestLevel(blockMogiteOre, "pickaxe", 2);
                
                GameRegistry.registerBlock(blockEunoianiteOre, "EunoianiteOre");
                LanguageRegistry.addName(blockEunoianiteOre, "Eunoianite Ore");
                MinecraftForge.setBlockHarvestLevel(blockEunoianiteOre, "pickaxe", 2);
                
                
                //Crafting
                GameRegistry.addRecipe(new ItemStack(blockMogite), "MMM", "MMM", "MMM",
                		'M', MogiteIngot);
                GameRegistry.addRecipe(new ItemStack(MogitePick), "MMM", " S ", " S ",
                		'M', MogiteIngot, 'S', Item.stick);
                GameRegistry.addRecipe(new ItemStack(MogiteShovel), " M ", " S ", " S ",
                		'M', MogiteIngot, 'S', Item.stick);
                
                
               //Smelting
                GameRegistry.addSmelting(blockMogiteOre.blockID, new ItemStack(MogiteIngot), 0.1F);
                GameRegistry.addSmelting(blockEunoianiteOre.blockID, new ItemStack(EunoianiteIngot), 0.1F);
               
                
               //Generation
                GameRegistry.registerWorldGenerator(new WorldGeneratorYM());
              
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}

