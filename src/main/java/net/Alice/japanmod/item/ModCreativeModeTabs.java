package net.Alice.japanmod.item;

import net.Alice.japanmod.JapanMod;
import net.Alice.japanmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;
//Aqui podemos ajustar uma nova aba para nossos items no modo criativo.
//"Japan_Mod_TAB = CREATIVE_MODE_TABS.register("japan_mod",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))"
//                  .title(Component.translatable("Creativetab.JapanMod"))
//Aqui acima, estamos ajustando o ícone para o nosso mod, assim como seu título.
//" pOutput.accept(ModItems.RAW_SAPPHIRE.get());" ou "pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());"
//Estamos registrando quais blocos e itens farão parte da nossa aba, com o pOutput.accept sendo a parte que diz: "Tudo o que estiver dentro dos parênteses ()` a seguir será aceito nesta aba."
//A ordem dentro dos parênteses é: (Nome do script).(Nome do bloco, item ou entidade).get();

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JapanMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> Japan_Mod_TAB = CREATIVE_MODE_TABS.register("japan_mod",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("Creativetab.JapanMod"))
                    .displayItems((pParameters, pOutput) -> {
                       pOutput.accept(ModItems.SAPPHIRE.get());
                       pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                       pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
    })
                     .build());



    public static void register(IEventBus eventBus) {
       CREATIVE_MODE_TABS.register(eventBus);
    }
}
