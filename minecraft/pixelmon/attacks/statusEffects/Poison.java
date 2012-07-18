package pixelmon.attacks.statusEffects;

import java.util.ArrayList;

import pixelmon.ChatHandler;
import pixelmon.attacks.*;
import pixelmon.helpers.PixelmonEntityHelper;

import net.minecraft.src.DamageSource;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.ModLoader;

public class Poison extends StatusEffectBase {

	public Poison() {
		super(StatusEffectType.Poison,true,false,false);
	}

	@Override
	public void ApplyEffect(PixelmonEntityHelper user, PixelmonEntityHelper target, ArrayList<String> attackList) {
		if (checkChance()) {
			if (target.getType().contains(Type.Poison)){
				ChatHandler.sendChat(user.getOwner(), target.getOwner(), "no effect!");
				return;
			}
			for (StatusEffectBase e : target.getStatus())
				if (e.type == StatusEffectType.Poison || e.type == StatusEffectType.PoisonBadly) {
					ChatHandler.sendChat(user.getOwner(), target.getOwner(), target.getName() + " is already poisoned!");
					return;
				}
			target.getStatus().add(this);
			ChatHandler.sendChat(user.getOwner(), target.getOwner(), target.getName() + " has been poisoned!");
		} else
			ChatHandler.sendChat(user.getOwner(), target.getOwner(), user.getName() + " failed!");
	}

	@Override
	public void applyRepeatedEffect(PixelmonEntityHelper user, PixelmonEntityHelper target) {
		ChatHandler.sendChat(user.getOwner(), target.getOwner(), user.getName() + " is hurt by poison!");
		user.attackEntityFrom(DamageSource.causeMobDamage((EntityLiving) user.getEntity()), (int) (((float) user.getMaxHealth()) / 8));
	}

	@Override
	public boolean ClearsOnBattleEnd() {
		return false;
	}
}
