package com.daaw;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final /* synthetic */ class g57 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!f57.a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
