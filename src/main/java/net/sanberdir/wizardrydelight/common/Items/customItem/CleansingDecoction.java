package net.sanberdir.wizardrydelight.common.Items.customItem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

import java.util.Map;

public class CleansingDecoction extends Item {
    public CleansingDecoction(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ClearEnchant(entity);
        return ar;
    }
    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }
    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }

    public static void ClearEnchant(Entity entity) {
        {
            if (entity == null)
                return;
            {
                Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                if (_enchantments.containsKey(Enchantments.MENDING)) {
                    _enchantments.remove(Enchantments.MENDING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.VANISHING_CURSE)) {
                    _enchantments.remove(Enchantments.VANISHING_CURSE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
                    _enchantments.remove(Enchantments.SHARPNESS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.POWER_ARROWS)) {
                    _enchantments.remove(Enchantments.POWER_ARROWS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.AQUA_AFFINITY)) {
                    _enchantments.remove(Enchantments.AQUA_AFFINITY);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.ALL_DAMAGE_PROTECTION)) {
                    _enchantments.remove(Enchantments.ALL_DAMAGE_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BANE_OF_ARTHROPODS)) {
                    _enchantments.remove(Enchantments.BANE_OF_ARTHROPODS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BINDING_CURSE)) {
                    _enchantments.remove(Enchantments.BINDING_CURSE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BLAST_PROTECTION)) {
                    _enchantments.remove(Enchantments.BLAST_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
                    _enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BLOCK_FORTUNE)) {
                    _enchantments.remove(Enchantments.BLOCK_FORTUNE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.CHANNELING)) {
                    _enchantments.remove(Enchantments.CHANNELING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.DEPTH_STRIDER)) {
                    _enchantments.remove(Enchantments.DEPTH_STRIDER);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FALL_PROTECTION)) {
                    _enchantments.remove(Enchantments.FALL_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FIRE_ASPECT)) {
                    _enchantments.remove(Enchantments.FIRE_ASPECT);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FIRE_PROTECTION)) {
                    _enchantments.remove(Enchantments.FIRE_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FISHING_LUCK)) {
                    _enchantments.remove(Enchantments.FISHING_LUCK);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FISHING_SPEED)) {
                    _enchantments.remove(Enchantments.FISHING_SPEED);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FROST_WALKER)) {
                    _enchantments.remove(Enchantments.FROST_WALKER);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.IMPALING)) {
                    _enchantments.remove(Enchantments.IMPALING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.INFINITY_ARROWS)) {
                    _enchantments.remove(Enchantments.INFINITY_ARROWS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.KNOCKBACK)) {
                    _enchantments.remove(Enchantments.KNOCKBACK);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.LOYALTY)) {
                    _enchantments.remove(Enchantments.LOYALTY);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.MOB_LOOTING)) {
                    _enchantments.remove(Enchantments.MOB_LOOTING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.MULTISHOT)) {
                    _enchantments.remove(Enchantments.MULTISHOT);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.PIERCING)) {
                    _enchantments.remove(Enchantments.PIERCING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.PROJECTILE_PROTECTION)) {
                    _enchantments.remove(Enchantments.PROJECTILE_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.PUNCH_ARROWS)) {
                    _enchantments.remove(Enchantments.PUNCH_ARROWS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.QUICK_CHARGE)) {
                    _enchantments.remove(Enchantments.QUICK_CHARGE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.RESPIRATION)) {
                    _enchantments.remove(Enchantments.RESPIRATION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.RIPTIDE)) {
                    _enchantments.remove(Enchantments.RIPTIDE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SILK_TOUCH)) {
                    _enchantments.remove(Enchantments.SILK_TOUCH);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SMITE)) {
                    _enchantments.remove(Enchantments.SMITE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SOUL_SPEED)) {
                    _enchantments.remove(Enchantments.SOUL_SPEED);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SWEEPING_EDGE)) {
                    _enchantments.remove(Enchantments.SWEEPING_EDGE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SWIFT_SNEAK)) {
                    _enchantments.remove(Enchantments.SWIFT_SNEAK);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.THORNS)) {
                    _enchantments.remove(Enchantments.THORNS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.UNBREAKING)) {
                    _enchantments.remove(Enchantments.UNBREAKING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
            }

        }
    }

}
