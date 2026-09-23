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

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeliron_pipe_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("non_dystopia_mod_beta", "modeliron_pipe_converted"), "main");
	public final ModelPart group2;
	public final ModelPart group3;
	public final ModelPart group4;
	public final ModelPart group;

	public Modeliron_pipe_Converted(ModelPart root) {
		this.group2 = root.getChild("group2");
		this.group3 = root.getChild("group3");
		this.group4 = root.getChild("group4");
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition group2 = partdefinition.addOrReplaceChild("group2", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition group3 = partdefinition.addOrReplaceChild("group3", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition cube_r1 = group3.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 10).addBox(-0.7F, -0.7F, -0.5F, 1.1F, 0.9F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 10).addBox(-0.7F, -0.4F, 0.1F, 1.1F, 0.9F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -2.1945F, -0.2475F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = group3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 18).addBox(-0.7F, -0.5F, -0.3F, 1.1F, 1.0F, 0.9F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -2.1945F, -0.2475F, -0.7854F, 0.0F, 0.0F));
		PartDefinition group4 = partdefinition.addOrReplaceChild("group4",
				CubeListBuilder.create().texOffs(12, 0).mirror().addBox(-0.2056F, -2.205F, -0.05F, 1.2F, 10.0F, 0.4F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
						.addBox(0.5944F, -2.205F, -0.85F, 0.4F, 10.0F, 0.8F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.2056F, -2.205F, -0.85F, 0.4F, 10.0F, 1.2F, new CubeDeformation(0.0F)).texOffs(13, 0).mirror()
						.addBox(0.1944F, -2.205F, -0.85F, 0.8F, 10.0F, 0.4F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition cube_r3 = group.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 11).addBox(-0.2F, 0.6F, -2.5F, 0.4F, 0.9F, 5.0F, new CubeDeformation(0.0F)).texOffs(13, 0).mirror().addBox(-0.9F, 0.6F, -2.5F, 1.1F, 0.4F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, -3.0F, 2.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r4 = group.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 11).addBox(-0.35F, -0.25F, -2.5F, 0.4F, 1.2F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 0).mirror().addBox(-0.35F, -0.25F, -2.5F, 1.2F, 0.4F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0556F, -2.505F, 2.5F, 0.0F, 0.0F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		group2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
