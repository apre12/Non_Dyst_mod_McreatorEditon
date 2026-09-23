package net.mcreator.nondystopiamod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelneutron_piller<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("non_dystopia_mod_beta", "modelneutron_piller"), "main");
	public final ModelPart piller;

	public Modelneutron_piller(ModelPart root) {
		this.piller = root.getChild("piller");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition piller = partdefinition.addOrReplaceChild("piller", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -15.5F, -2.5F, 5.0F, 31.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
				.addBox(-1.5F, -15.5F, 2.5F, 3.0F, 31.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 0).addBox(-1.5F, -15.5F, -4.5F, 3.0F, 31.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 24.5F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r1 = piller.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(20, 33).addBox(-1.5F, -15.5F, -4.5F, 3.0F, 31.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 33).addBox(-1.5F, -15.5F, 2.5F, 3.0F, 31.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		piller.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
