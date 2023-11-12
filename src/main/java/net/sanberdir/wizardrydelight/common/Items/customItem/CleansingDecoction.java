package net.sanberdir.wizardrydelight.common.Items.customItem;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

import java.util.List;
import java.util.Map;

public class CleansingDecoction extends Item {
    public CleansingDecoction(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();

        ClearEnchant(entity,world,x,y,z);
        ClearEnchantReverse(entity,world,x,y,z);
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
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
if (Screen.hasShiftDown()) {
    list.add(Component.translatable("wizardry_delight.press_shift").withStyle(ChatFormatting.DARK_GRAY));
    list.add(Component.translatable("wizardry_delight.cleansing_decoction").withStyle(ChatFormatting.GOLD));
}
else {
    list.add(Component.translatable("wizardry_delight.press_shift").withStyle(ChatFormatting.DARK_GRAY));
}
    }
    public static void ClearEnchant(Entity entity, LevelAccessor world, double x, double y, double z) {
        {
            if (entity == null)
                return;
            {
                Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                if (_enchantments.containsKey(Enchantments.MENDING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));

                    _enchantments.remove(Enchantments.MENDING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.VANISHING_CURSE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
                    _enchantments.remove(Enchantments.VANISHING_CURSE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));
                    _enchantments.remove(Enchantments.SHARPNESS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.POWER_ARROWS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.POWER_ARROWS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.AQUA_AFFINITY)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 20));
                    _enchantments.remove(Enchantments.AQUA_AFFINITY);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.ALL_DAMAGE_PROTECTION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
                    _enchantments.remove(Enchantments.ALL_DAMAGE_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BANE_OF_ARTHROPODS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.BANE_OF_ARTHROPODS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BINDING_CURSE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.BINDING_CURSE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BLAST_PROTECTION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.BLAST_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BLOCK_FORTUNE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.BLOCK_FORTUNE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.CHANNELING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.CHANNELING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.DEPTH_STRIDER)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.DEPTH_STRIDER);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FALL_PROTECTION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FALL_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FIRE_ASPECT)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FIRE_ASPECT);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FIRE_PROTECTION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FIRE_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FISHING_LUCK)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FISHING_LUCK);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FISHING_SPEED)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FISHING_SPEED);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FROST_WALKER)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FROST_WALKER);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.IMPALING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.IMPALING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.INFINITY_ARROWS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 25));
                    _enchantments.remove(Enchantments.INFINITY_ARROWS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.KNOCKBACK)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.KNOCKBACK);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.LOYALTY)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.LOYALTY);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.MOB_LOOTING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.MOB_LOOTING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.MULTISHOT)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.MULTISHOT);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.PIERCING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.PIERCING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.PROJECTILE_PROTECTION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.PROJECTILE_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.PUNCH_ARROWS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.PUNCH_ARROWS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.QUICK_CHARGE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.QUICK_CHARGE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.RESPIRATION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.RESPIRATION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.RIPTIDE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.RIPTIDE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SILK_TOUCH)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.SILK_TOUCH);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SMITE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
                    _enchantments.remove(Enchantments.SMITE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SOUL_SPEED)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
                    _enchantments.remove(Enchantments.SOUL_SPEED);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SWEEPING_EDGE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.SWEEPING_EDGE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SWIFT_SNEAK)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.SWIFT_SNEAK);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.THORNS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.THORNS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.UNBREAKING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
                    _enchantments.remove(Enchantments.UNBREAKING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
                }
            }

        }
    }
    public static void ClearEnchantReverse(Entity entity, LevelAccessor world, double x, double y, double z) {
        {
            if (entity == null)
                return;
            {
                Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                if (_enchantments.containsKey(Enchantments.MENDING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));

                    _enchantments.remove(Enchantments.MENDING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.VANISHING_CURSE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 5));
                    _enchantments.remove(Enchantments.VANISHING_CURSE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 10));
                    _enchantments.remove(Enchantments.SHARPNESS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.POWER_ARROWS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.POWER_ARROWS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.AQUA_AFFINITY)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 20));
                    _enchantments.remove(Enchantments.AQUA_AFFINITY);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.ALL_DAMAGE_PROTECTION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
                    _enchantments.remove(Enchantments.ALL_DAMAGE_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BANE_OF_ARTHROPODS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.BANE_OF_ARTHROPODS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BINDING_CURSE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.BINDING_CURSE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BLAST_PROTECTION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.BLAST_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.BLOCK_FORTUNE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.BLOCK_FORTUNE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.CHANNELING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.CHANNELING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.DEPTH_STRIDER)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.DEPTH_STRIDER);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FALL_PROTECTION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FALL_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FIRE_ASPECT)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FIRE_ASPECT);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FIRE_PROTECTION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FIRE_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FISHING_LUCK)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FISHING_LUCK);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FISHING_SPEED)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FISHING_SPEED);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.FROST_WALKER)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.FROST_WALKER);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.IMPALING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.IMPALING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.INFINITY_ARROWS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 25));
                    _enchantments.remove(Enchantments.INFINITY_ARROWS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.KNOCKBACK)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.KNOCKBACK);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.LOYALTY)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }
                    if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.LOYALTY);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.MOB_LOOTING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.MOB_LOOTING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.MULTISHOT)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.MULTISHOT);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.PIERCING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.PIERCING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.PROJECTILE_PROTECTION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.PROJECTILE_PROTECTION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.PUNCH_ARROWS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.PUNCH_ARROWS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.QUICK_CHARGE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.QUICK_CHARGE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.RESPIRATION)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.RESPIRATION);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.RIPTIDE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.RIPTIDE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SILK_TOUCH)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.SILK_TOUCH);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SMITE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
                    _enchantments.remove(Enchantments.SMITE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SOUL_SPEED)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
                    _enchantments.remove(Enchantments.SOUL_SPEED);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SWEEPING_EDGE)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.SWEEPING_EDGE);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.SWIFT_SNEAK)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.SWIFT_SNEAK);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.THORNS)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 15));
                    _enchantments.remove(Enchantments.THORNS);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
                else if (_enchantments.containsKey(Enchantments.UNBREAKING)) {
                    {
                        ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                        if (_ist.hurt(1, RandomSource.create(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                    }if (world instanceof Level _level && !_level.isClientSide())
                        _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
                    _enchantments.remove(Enchantments.UNBREAKING);
                    EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
                }
            }

        }
    }
}
