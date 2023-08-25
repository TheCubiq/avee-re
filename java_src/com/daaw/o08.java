package com.daaw;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class o08 extends Cdo {
    public final WeakReference b;

    public o08(ia3 ia3Var, byte[] bArr) {
        this.b = new WeakReference(ia3Var);
    }

    @Override // com.daaw.Cdo
    public final void a(ComponentName componentName, bo boVar) {
        ia3 ia3Var = (ia3) this.b.get();
        if (ia3Var != null) {
            ia3Var.c(boVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ia3 ia3Var = (ia3) this.b.get();
        if (ia3Var != null) {
            ia3Var.d();
        }
    }
}
