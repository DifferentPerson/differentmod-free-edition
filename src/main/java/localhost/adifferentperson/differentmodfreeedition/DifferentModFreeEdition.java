package localhost.adifferentperson.differentmodfreeedition;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = "differentmod-free-edition", name = "DifferentMod Free Edition", version = "1.0")
@Mod.EventBusSubscriber
public class DifferentModFreeEdition {

    @SubscribeEvent
    public static void overlay(RenderGameOverlayEvent.Post event) {
        if (event.getType() == RenderGameOverlayEvent.ElementType.EXPERIENCE) {
            Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("DifferentMod Free Edition", 2, 2, 0xff8000);
        }
    }

}
