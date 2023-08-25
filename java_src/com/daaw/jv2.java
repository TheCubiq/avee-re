package com.daaw;

import android.net.Uri;
import java.util.List;
/* loaded from: classes.dex */
public class jv2 {
    public final Uri a;
    public final List c;
    public final y17 e;
    @Deprecated
    public final List f;
    public final Object g;
    public final String b = null;
    public final String d = null;

    public /* synthetic */ jv2(Uri uri, String str, ro2 ro2Var, zc2 zc2Var, List list, String str2, y17 y17Var, Object obj, lu2 lu2Var) {
        this.a = uri;
        this.c = list;
        this.e = y17Var;
        v17 o = y17.o();
        if (y17Var.size() > 0) {
            z23 z23Var = (z23) y17Var.get(0);
            throw null;
        }
        this.f = o.h();
        this.g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jv2) {
            jv2 jv2Var = (jv2) obj;
            return this.a.equals(jv2Var.a) && it5.t(null, null) && it5.t(null, null) && it5.t(null, null) && this.c.equals(jv2Var.c) && it5.t(null, null) && this.e.equals(jv2Var.e) && it5.t(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 923521) + this.c.hashCode()) * 961) + this.e.hashCode()) * 31;
    }
}
