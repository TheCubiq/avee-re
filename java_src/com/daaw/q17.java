package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class q17 {
    /* renamed from: a */
    public static int m12804a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* renamed from: b */
    public static int m12803b(@CheckForNull Object obj) {
        return m12804a(obj == null ? 0 : obj.hashCode());
    }
}
