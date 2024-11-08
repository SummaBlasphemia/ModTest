package net.Alice.japanmod.item;

import net.Alice.japanmod.JapanMod;
import net.Alice.japanmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//FUNDAMENTOS:

//Aqui é mais simples, mas temos pontos importantes sobre a base da linguagem e o conceito de DeferredRegister.
//O DeferredRegister está relacionado ao registro de qualquer coisa no jogo (item, entidade, bloco etc.) que não será carregada imediatamente ao iniciar o jogo.
//Em vez disso, os objetos são registrados para serem utilizados quando necessário, dai que vem o "deferred" (adiado em português).
//Isso significa que todos os itens registrados aqui, mesmo que já estejam presentes desde o início (quando o mundo é gerado ou o mod é carregado),
// só são efetivamente carregados ou acessados quando o jogador interage com eles (por exemplo, ao pegar no inventário, usar no jogo ou ver no baú).
// Esse comportamento otimiza o desempenho e o carregamento do jogo, já que os itens são gerenciados conforme necessário.

//O RegistryObject<Item> serve, basicamente, como um contêiner seguro para o registro de itens no Forge.
// Aqui, estamos definindo apenas o "registro bruto" do item, ou seja, estamos associando o nome do item ao registro e informando que ele existirá no jogo com certas propriedades.
// No entanto, detalhes adicionais do item (como o sprite, comportamento e outras propriedades visuais ou de jogabilidade) serão definidos em outras partes, como arquivos .json ou por meio de scripts/modificações que vamos aplicar separadamente.
// Por enquanto, estamos apenas garantindo que o item seja reconhecido pelo jogo como existente e associando-o ao mod.

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JapanMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus){
                ITEMS.register(eventBus);
    }


}
