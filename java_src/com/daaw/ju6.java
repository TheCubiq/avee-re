package com.daaw;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class ju6 {

    /* renamed from: a */
    public final byte[] f15421a;

    /* renamed from: b */
    public int f15422b;

    /* renamed from: c */
    public int f15423c;

    /* renamed from: d */
    public final /* synthetic */ ku6 f15424d;

    public /* synthetic */ ju6(ku6 ku6Var, byte[] bArr, fu6 fu6Var) {
        this.f15424d = ku6Var;
        this.f15421a = bArr;
    }

    /* renamed from: a */
    public final ju6 m18239a(int i) {
        this.f15423c = i;
        return this;
    }

    /* renamed from: b */
    public final ju6 m18238b(int i) {
        this.f15422b = i;
        return this;
    }

    /* renamed from: c */
    public final synchronized void m18237c() {
        try {
            ku6 ku6Var = this.f15424d;
            if (ku6Var.f16754b) {
                ku6Var.f16753a.mo13924w(this.f15421a);
                this.f15424d.f16753a.mo13928C(this.f15422b);
                this.f15424d.f16753a.mo13926c(this.f15423c);
                this.f15424d.f16753a.mo13927E(null);
                this.f15424d.f16753a.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}
