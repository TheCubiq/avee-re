package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class q17 {
    public static int a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int b(@CheckForNull Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
