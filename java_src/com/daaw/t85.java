package com.daaw;

import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes.dex */
public final class t85 implements zg3 {
    public final WeakReference a;
    public final String b;
    public final zg3 c;
    public final /* synthetic */ u85 d;

    public /* synthetic */ t85(u85 u85Var, WeakReference weakReference, String str, zg3 zg3Var, s85 s85Var) {
        this.d = u85Var;
        this.a = weakReference;
        this.b = str;
        this.c = zg3Var;
    }

    @Override // com.daaw.zg3
    public final void a(Object obj, Map map) {
        Object obj2 = this.a.get();
        if (obj2 == null) {
            this.d.k(this.b, this);
        } else {
            this.c.a(obj2, map);
        }
    }
}
