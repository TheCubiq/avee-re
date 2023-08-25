package com.daaw;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class q48 {
    public static e48 a(e48 e48Var) {
        return ((e48Var instanceof k48) || (e48Var instanceof h48)) ? e48Var : e48Var instanceof Serializable ? new h48(e48Var) : new k48(e48Var);
    }

    public static e48 b(Object obj) {
        return new n48(obj);
    }
}
