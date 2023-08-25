package com.daaw;

import java.io.Serializable;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class oy6 implements Serializable {
    public static oy6 c() {
        return ux6.p;
    }

    public static oy6 d(@CheckForNull Object obj) {
        return obj == null ? ux6.p : new xy6(obj);
    }

    public abstract oy6 a(ey6 ey6Var);

    public abstract Object b(Object obj);
}
