package net.mcreator.nondystopiamod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.nondystopiamod.world.inventory.MicrowaveGUIMenu;
import net.mcreator.nondystopiamod.network.MicrowaveGUIButtonMessage;
import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MicrowaveGUIScreen extends AbstractContainerScreen<MicrowaveGUIMenu> {
	private final static HashMap<String, Object> guistate = MicrowaveGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_o_mode;

	public MicrowaveGUIScreen(MicrowaveGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 177;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("non_dystopia_mod_beta:textures/screens/microwave_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_o_mode = Button.builder(Component.translatable("gui.non_dystopia_mod_beta.microwave_gui.button_o_mode"), e -> {
			if (true) {
				NonDystopiaModBetaMod.PACKET_HANDLER.sendToServer(new MicrowaveGUIButtonMessage(0, x, y, z));
				MicrowaveGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 30, 56, 20).build();
		guistate.put("button:button_o_mode", button_o_mode);
		this.addRenderableWidget(button_o_mode);
	}
}
