// Date: 4/24/2012 12:45:27 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.Pokemon;

import pixelmon.entities.*;
import net.minecraft.src.*;

public class ModelWartortle extends ModelBase {
	// fields
	ModelRenderer head;
	ModelRenderer Right_ear;
	ModelRenderer leftear;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer ShellBelly;
	ModelRenderer Shellback;
	ModelRenderer Tail;

	public ModelWartortle() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 52);
		head.addBox(-3F, -6F, -3F, 6, 6, 6);
		head.setRotationPoint(0F, 8F, 0F);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		Right_ear = new ModelRenderer(this, 53, 56);
		Right_ear.addBox(0F, 0F, 0F, 0, 6, 5);
		Right_ear.setRotationPoint(-3.5F, -4F, 0F);
		Right_ear.setTextureSize(64, 64);
		Right_ear.mirror = true;
		setRotation(Right_ear, 0.4537856F, -0.0872665F, -0.1919862F);
		leftear = new ModelRenderer(this, 53, 52);
		leftear.addBox(0F, 0F, 0F, 0, 6, 5);
		leftear.setRotationPoint(3.5F, -4F, 0F);
		leftear.setTextureSize(64, 64);
		leftear.mirror = true;
		setRotation(leftear, 0.4537856F, 0.0872665F, 0.1919862F);
		this.head.addChild(leftear);
		this.head.addChild(Right_ear);
		body = new ModelRenderer(this, 0, 38);
		body.addBox(-4F, 0F, -2F, 8, 10, 4);
		body.setRotationPoint(0F, 8F, 0F);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 24, 54);
		rightarm.addBox(-2F, -1F, -1.5F, 2, 7, 3);
		rightarm.setRotationPoint(-4F, 10F, 0F);
		rightarm.setTextureSize(64, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 0F, 0F, 0F);
		leftarm = new ModelRenderer(this, 24, 44);
		leftarm.addBox(0F, -1F, -1.5F, 2, 7, 3);
		leftarm.setRotationPoint(4F, 10F, 0F);
		leftarm.setTextureSize(64, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0F, 0F, 0F);
		rightleg = new ModelRenderer(this, 36, 54);
		rightleg.addBox(-2F, 0F, -2F, 3, 6, 3);
		rightleg.setRotationPoint(-2F, 18F, 0.5F);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 36, 44);
		leftleg.addBox(-2F, 0F, -2F, 3, 6, 3);
		leftleg.setRotationPoint(3F, 18F, 0.5F);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
		ShellBelly = new ModelRenderer(this, 0, 18);
		ShellBelly.addBox(-3F, -4F, -1F, 6, 8, 1);
		ShellBelly.setRotationPoint(0F, 13F, -1.933333F);
		ShellBelly.setTextureSize(64, 64);
		ShellBelly.mirror = true;
		setRotation(ShellBelly, 0F, 0F, 0F);
		Shellback = new ModelRenderer(this, 0, 27);
		Shellback.addBox(-3.5F, -4.5F, 0F, 7, 9, 2);
		Shellback.setRotationPoint(0F, 13F, 2F);
		Shellback.setTextureSize(64, 64);
		Shellback.mirror = true;
		setRotation(Shellback, 0F, 0F, 0F);
		Tail = new ModelRenderer(this, 24, 23);
		Tail.addBox(0F, -11F, 0F, 0, 12, 9);
		Tail.setRotationPoint(0F, 17F, 3F);
		Tail.setTextureSize(64, 64);
		Tail.mirror = true;
		setRotation(Tail, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		head.render(f5);
		// Right_ear.render(f5);
		// leftear.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		ShellBelly.render(f5);
		Shellback.render(f5);
		Tail.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
		// super.setRotationAngles(f, f1, f2, f3, f4, f5);
		head.rotateAngleY = f3 / (180F / (float) Math.PI);
		head.rotateAngleX = f4 / (180F / (float) Math.PI);
		rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 2.0F * f1 * 0.5F;
		leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
		rightarm.rotateAngleZ = 0.0F;
		leftarm.rotateAngleZ = 0.0F;
		rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.2F * f1;
		leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.2F * f1;
		rightleg.rotateAngleY = 0.0F;
		leftleg.rotateAngleY = 0.0F;
	}

}
