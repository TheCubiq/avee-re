package com.daaw;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final /* synthetic */ class f57 {
    /* renamed from: a */
    public static /* synthetic */ boolean m22914a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
