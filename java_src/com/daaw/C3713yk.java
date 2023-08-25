package com.daaw;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.daaw.yk */
/* loaded from: classes.dex */
public final class C3713yk {

    /* renamed from: a */
    public final Set<eu0> f33740a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public volatile Context f33741b;

    /* renamed from: a */
    public void m3635a(eu0 eu0Var) {
        if (this.f33741b != null) {
            eu0Var.mo6068a(this.f33741b);
        }
        this.f33740a.add(eu0Var);
    }

    /* renamed from: b */
    public void m3634b() {
        this.f33741b = null;
    }

    /* renamed from: c */
    public void m3633c(Context context) {
        this.f33741b = context;
        for (eu0 eu0Var : this.f33740a) {
            eu0Var.mo6068a(context);
        }
    }
}
