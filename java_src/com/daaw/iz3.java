package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class iz3 {
    public long a = -1;
    public long b = -1;
    public final /* synthetic */ jz3 c;

    public iz3(jz3 jz3Var) {
        this.c = jz3Var;
    }

    public final long a() {
        return this.b;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.a);
        bundle.putLong("tclose", this.b);
        return bundle;
    }

    public final void c() {
        ag agVar;
        agVar = this.c.a;
        this.b = agVar.b();
    }

    public final void d() {
        ag agVar;
        agVar = this.c.a;
        this.a = agVar.b();
    }
}
