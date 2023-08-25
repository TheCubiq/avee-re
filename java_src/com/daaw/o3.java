package com.daaw;

import com.daaw.k3;
import com.daaw.k3.d;
/* loaded from: classes.dex */
public final class o3<O extends k3.d> {
    public final int a;
    public final k3<O> b;
    public final O c;
    public final String d;

    public o3(k3<O> k3Var, O o, String str) {
        this.b = k3Var;
        this.c = o;
        this.d = str;
        this.a = ot0.b(k3Var, o, str);
    }

    public static <O extends k3.d> o3<O> a(k3<O> k3Var, O o, String str) {
        return new o3<>(k3Var, o, str);
    }

    public final String b() {
        return this.b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof o3) {
            o3 o3Var = (o3) obj;
            return ot0.a(this.b, o3Var.b) && ot0.a(this.c, o3Var.c) && ot0.a(this.d, o3Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
