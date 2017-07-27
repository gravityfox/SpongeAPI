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
package org.spongepowered.api.command.managed;

import org.spongepowered.api.command.Command;
import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

/**
 * The possible behaviors of a {@link Command} built using
 * {@link Command.Builder} when a child command throws an exception.
 */
public final class ChildExceptionBehaviors {

    private ChildExceptionBehaviors() {}

    // SORTFIELDS:ON

    /**
     * If a child command throws an exception, rethrows it, preventing all
     * further command execution. This is the default.
     */
    public static final ChildExceptionBehavior RETHROW = DummyObjectProvider.createFor(ChildExceptionBehavior.class, "RETHROW");

    /**
     * If a child command throws an exception, stores it and continues with
     * the parent command, displaying the error if the command execution ends
     * due to an exception. Else, the exception will be swallowed.
     */
    public static final ChildExceptionBehavior STORE = DummyObjectProvider.createFor(ChildExceptionBehavior.class, "STORE");

    /**
     * If a child command throws an exception, suppresses it and executes the
     * parent command.
     */
    public static final ChildExceptionBehavior SUPPRESS = DummyObjectProvider.createFor(ChildExceptionBehavior.class, "SUPPRESS");

    // SORTFIELDS:OFF

}