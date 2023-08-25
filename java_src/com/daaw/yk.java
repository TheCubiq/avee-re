package com.daaw;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class yk {
    public final Set<eu0> a = new CopyOnWriteArraySet();
    public volatile Context b;

    public void a(eu0 eu0Var) {
        if (this.b != null) {
            eu0Var.a(this.b);
        }
        this.a.add(eu0Var);
    }

    public void b() {
        this.b = null;
    }

    public void c(Context context) {
        this.b = context;
        for (eu0 eu0Var : this.a) {
            eu0Var.a(context);
        }
    }
}
