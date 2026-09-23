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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelGstick<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("non_dystopia_mod_beta", "model_gstick"), "main");
	public final ModelPart bone5;
	public final ModelPart bone;
	public final ModelPart bone3;
	public final ModelPart bone6;
	public final ModelPart bone7;
	public final ModelPart bone10;
	public final ModelPart bone9;

	public ModelGstick(ModelPart root) {
		this.bone5 = root.getChild("bone5");
		this.bone = root.getChild("bone");
		this.bone3 = root.getChild("bone3");
		this.bone6 = root.getChild("bone6");
		this.bone7 = root.getChild("bone7");
		this.bone10 = root.getChild("bone10");
		this.bone9 = root.getChild("bone9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -0.7048F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.5F, -2.2952F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.4F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1F, -0.15F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.0F, -0.1F, 0.85F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -0.1F, -1.15F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2F, -0.85F, 0.0F, 0.0F, -0.9163F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 0.1F, -1.7F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6347F, 0.387F, -0.15F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.6347F, 0.387F, 0.85F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6347F, 0.387F, -1.15F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, -0.85F, 0.0F, 0.0F, -0.9163F));
		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.1F, 24.3F, 0.0F));
		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1F, -0.15F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.0F, -0.1F, 0.85F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -0.1F, -1.15F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2F, -0.85F, 0.0F, 0.0F, -0.9163F));
		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2F, 0.1F, -1.7F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r4 = bone4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6347F, 0.387F, -0.15F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.6347F, 0.387F, 0.85F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6347F, 0.387F, -1.15F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.0F, -0.85F, 0.0F, 0.0F, -0.9163F));
		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-1.2F, 22.0F, -0.2952F));
		PartDefinition cube_r5 = bone6.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(3, 0).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4F, 0.4F, 0.0F, 0.5175F, 0.5467F, 0.2877F));
		PartDefinition cube_r6 = bone6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 0).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.0F, 0.5175F, -0.5467F, -0.2877F));
		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-1.1F, 22.65F, -3.35F));
		PartDefinition cube_r7 = bone7.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1F, -0.05F, -0.55F, 0.2F, 0.1F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8F, 0.0F, 0.0F, -0.7216F, 0.2324F, -0.2F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r8 = bone8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(0.7F, -0.05F, -0.55F, 0.2F, 0.1F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8F, 0.0F, 0.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition bone10 = partdefinition.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(-0.5F, 23.3F, -4.15F));
		PartDefinition cube_r9 = bone10.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1F, -0.15F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5272F, -0.9163F));
		PartDefinition bone9 = partdefinition.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.5F, 23.3F, -4.15F));
		PartDefinition cube_r10 = bone9.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.1F, -0.15F, 2.0F, 0.2F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -2.3126F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
