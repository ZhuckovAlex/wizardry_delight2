package net.sanberdir.wizardrydelight.server.procedures;

import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.items.ItemHandlerHelper;
import net.sanberdir.wizardrydelight.common.Items.InitItemsWD;

import javax.annotation.Nullable;


public class ChestGoldenProcedure {
    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.GOLDEN_CHEST_KING_PILLAGER.get()
                && !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.GOLDEN_CHEST_KING_PILLAGER.get())) {
            if (entity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.GOLDEN_CHEST_KING_PILLAGER.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (entity instanceof Player _player)
                _player.giveExperiencePoints((int) Mth.nextInt(RandomSource.create(), 800, 1000));
            if (Math.random() < 0.1) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.DIAMOND);
                    _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 2));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
                if (Math.random() < 0.5) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 20));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.95) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.EMERALD);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 3));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.3) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.EMERALD);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 17));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.4) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.8) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CHEESE.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 2));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.02) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CLEAR_DRAGOLIT_NUGGET.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
            }
           else if (Math.random() < 0.5) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
                    _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 20));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
                if (Math.random() < 0.5) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.DIAMOND);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 20));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.95) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.EMERALD);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 3));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.3) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.EMERALD);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 17));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.4) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.8) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CHEESE.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 2));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.02) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CLEAR_DRAGOLIT_NUGGET.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
            }
           else if (Math.random() <= 1) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.EMERALD);
                    _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 3));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
                if (Math.random() < 0.5) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 20));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.95) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.DIAMOND);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 3));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.3) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.EMERALD);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 17));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.4) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.8) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CHEESE.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 2));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.02) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CLEAR_DRAGOLIT_NUGGET.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
            }
           else if (Math.random() < 0.3) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.EMERALD);
                    _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 17));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
                if (Math.random() < 0.5) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 20));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.3) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.DIAMOND);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 17));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.4) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.8) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CHEESE.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 2));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.02) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CLEAR_DRAGOLIT_NUGGET.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
           }
           else if (Math.random() < 0.4) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get());
                    _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
                if (Math.random() < 0.5) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 20));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.95) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.EMERALD);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 3));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.3) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.EMERALD);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 17));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.4) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.DIAMOND);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.8) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CHEESE.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 2));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.02) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CLEAR_DRAGOLIT_NUGGET.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
           }
           else if (Math.random() <= 0.8) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(InitItemsWD.CHEESE.get());
                    _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 2));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
                if (Math.random() < 0.5) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 20));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.95) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.EMERALD);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 3));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.3) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.EMERALD);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 17));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.4) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.DIAMOND);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.6) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 2));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.02) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CLEAR_DRAGOLIT_NUGGET.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
           }
           else if (Math.random() < 0.02) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(InitItemsWD.CLEAR_DRAGOLIT_NUGGET.get());
                    _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 3));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
                if (Math.random() < 0.5) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 20));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.95) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.EMERALD);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 3));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.3) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.EMERALD);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 10, 17));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.4) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(Items.DIAMOND);
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() <= 0.6) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 2));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
                if (Math.random() < 0.02) {
                    if (entity instanceof Player _player) {
                        ItemStack _setstack = new ItemStack(InitItemsWD.CLEAR_DRAGOLIT_NUGGET.get());
                        _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 1));
                        ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                    }
                }
           }
           else {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get());
                    _setstack.setCount((int) Mth.nextInt(RandomSource.create(), 1, 2));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
        }
    }
}
