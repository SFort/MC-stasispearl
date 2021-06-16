package tf.ssf.sfort.stasispearl.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = EnderPearlEntity.class, priority = 162)
public abstract class Pearl extends ThrownItemEntity {
	public Pearl(EntityType<? extends ThrownItemEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	public void writeCustomDataToNbt(NbtCompound nbt) {
		super.writeCustomDataToNbt(nbt);
		nbt.remove("Owner");
	}
}
