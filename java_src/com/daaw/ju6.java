package com.daaw;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class ju6 {
    public final byte[] a;
    public int b;
    public int c;
    public final /* synthetic */ ku6 d;

    public /* synthetic */ ju6(ku6 ku6Var, byte[] bArr, fu6 fu6Var) {
        this.d = ku6Var;
        this.a = bArr;
    }

    public final ju6 a(int i) {
        this.c = i;
        return this;
    }

    public final ju6 b(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void c() {
        try {
            ku6 ku6Var = this.d;
            if (ku6Var.b) {
                ku6Var.a.w(this.a);
                this.d.a.C(this.b);
                this.d.a.c(this.c);
                this.d.a.E(null);
                this.d.a.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}
