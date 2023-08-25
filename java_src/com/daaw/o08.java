package com.daaw;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class o08 extends AbstractServiceConnectionC1116do {

    /* renamed from: b */
    public final WeakReference f20913b;

    public o08(ia3 ia3Var, byte[] bArr) {
        this.f20913b = new WeakReference(ia3Var);
    }

    @Override // com.daaw.AbstractServiceConnectionC1116do
    /* renamed from: a */
    public final void mo14652a(ComponentName componentName, C0875bo c0875bo) {
        ia3 ia3Var = (ia3) this.f20913b.get();
        if (ia3Var != null) {
            ia3Var.m20006c(c0875bo);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ia3 ia3Var = (ia3) this.f20913b.get();
        if (ia3Var != null) {
            ia3Var.m20005d();
        }
    }
}
