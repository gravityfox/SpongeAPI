/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.item.inventory.query;

import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.inventory.Inventory;
import org.spongepowered.api.item.inventory.InventoryProperty;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.text.translation.Translation;
import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

import java.util.function.Predicate;

public final class QueryOperationTypes {

    // SORTFIELDS:ON

    public static final QueryOperationType<InventoryProperty<?, ?>> INVENTORY_PROPERTY = DummyObjectProvider.createFor(QueryOperationType.class,
            "INVENTORY_PROPERTY");

    public static final QueryOperationType<Translation> INVENTORY_TITLE = DummyObjectProvider.createFor(QueryOperationType.class, "INVENTORY_TITLE");

    public static final QueryOperationType<Class<? extends Inventory>> INVENTORY_TYPE = DummyObjectProvider.createFor(QueryOperationType.class,
            "INVENTORY_TYPE");

    public static final QueryOperationType<Predicate<ItemStack>> ITEM_STACK_CUSTOM = DummyObjectProvider.createFor(QueryOperationType.class,
            "ITEM_STACK_CUSTOM");

    public static final QueryOperationType<ItemStack> ITEM_STACK_EXACT = DummyObjectProvider.createFor(QueryOperationType.class, "ITEM_STACK_EXACT");

    public static final QueryOperationType<ItemStack> ITEM_STACK_IGNORE_QUANTITY = DummyObjectProvider.createFor(QueryOperationType.class,
            "ITEM_STACK_IGNORE_QUANTITY");

    public static final QueryOperationType<ItemType> ITEM_TYPE = DummyObjectProvider.createFor(QueryOperationType.class, "ITEM_TYPE");

    // SORTFIELDS:OFF

    private QueryOperationTypes() {}
}
