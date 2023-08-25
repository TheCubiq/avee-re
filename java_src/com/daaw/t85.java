package com.daaw;

import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes.dex */
public final class t85 implements zg3 {

    /* renamed from: a */
    public final WeakReference f27120a;

    /* renamed from: b */
    public final String f27121b;

    /* renamed from: c */
    public final zg3 f27122c;

    /* renamed from: d */
    public final /* synthetic */ u85 f27123d;

    public /* synthetic */ t85(u85 u85Var, WeakReference weakReference, String str, zg3 zg3Var, s85 s85Var) {
        this.f27123d = u85Var;
        this.f27120a = weakReference;
        this.f27121b = str;
        this.f27122c = zg3Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
        Object obj2 = this.f27120a.get();
        if (obj2 == null) {
            this.f27123d.m8423k(this.f27121b, this);
        } else {
            this.f27122c.mo2341a(obj2, map);
        }
    }
}
