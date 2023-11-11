package net.sanberdir.wizardrydelight.server.procedures;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraftforge.items.ItemHandlerHelper;
import net.sanberdir.wizardrydelight.common.Items.InitItemsWD;
import top.theillusivec4.curios.api.CuriosApi;


public class RingSupplyProcedure {
    public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
        if (entity == null)
            return;
        if (entity instanceof LivingEntity lv) {
            CuriosApi.getCuriosHelper().findCurios(lv, InitItemsWD.RING_SUPPLY.get()).forEach(item -> {
                ItemStack itemstackiterator = item.stack();
                if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
                    if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
                        _entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 60, 6));
                    {
                        ItemStack _ist = itemstackiterator;
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if ((itemstackiterator).getDamageValue() == (itemstack).getMaxDamage()) {
                        if (entity instanceof Player _player) {
                            ItemStack _setstack = new ItemStack(InitItemsWD.RING_SUPPLY_DISCHARGED.get());
                            _setstack.setCount(1);
                            ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                        }
                    }
                }
            });
        }
    }
}
