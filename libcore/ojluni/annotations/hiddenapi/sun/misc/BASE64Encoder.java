/*
 * Copyright (c) 1995, 1997, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package sun.misc;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class BASE64Encoder extends sun.misc.CharacterEncoder {

    @dalvik.annotation.compat.UnsupportedAppUsage
    public BASE64Encoder() {
        throw new RuntimeException("Stub!");
    }

    protected int bytesPerAtom() {
        throw new RuntimeException("Stub!");
    }

    protected int bytesPerLine() {
        throw new RuntimeException("Stub!");
    }

    protected void encodeAtom(java.io.OutputStream outStream, byte[] data, int offset, int len)
            throws java.io.IOException {
        throw new RuntimeException("Stub!");
    }

    @dalvik.annotation.compat.UnsupportedAppUsage private static final char[] pem_array;

    static {
        pem_array = new char[0];
    }
}
