package com.daaw;

import android.net.Uri;
import java.util.List;
/* loaded from: classes.dex */
public class jv2 {

    /* renamed from: a */
    public final Uri f15455a;

    /* renamed from: c */
    public final List f15457c;

    /* renamed from: e */
    public final y17 f15459e;
    @Deprecated

    /* renamed from: f */
    public final List f15460f;

    /* renamed from: g */
    public final Object f15461g;

    /* renamed from: b */
    public final String f15456b = null;

    /* renamed from: d */
    public final String f15458d = null;

    public /* synthetic */ jv2(Uri uri, String str, ro2 ro2Var, zc2 zc2Var, List list, String str2, y17 y17Var, Object obj, lu2 lu2Var) {
        this.f15455a = uri;
        this.f15457c = list;
        this.f15459e = y17Var;
        v17 m4266o = y17.m4266o();
        if (y17Var.size() > 0) {
            z23 z23Var = (z23) y17Var.get(0);
            throw null;
        }
        this.f15460f = m4266o.m7546h();
        this.f15461g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jv2) {
            jv2 jv2Var = (jv2) obj;
            return this.f15455a.equals(jv2Var.f15455a) && it5.m19376t(null, null) && it5.m19376t(null, null) && it5.m19376t(null, null) && this.f15457c.equals(jv2Var.f15457c) && it5.m19376t(null, null) && this.f15459e.equals(jv2Var.f15459e) && it5.m19376t(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15455a.hashCode() * 923521) + this.f15457c.hashCode()) * 961) + this.f15459e.hashCode()) * 31;
    }
}
