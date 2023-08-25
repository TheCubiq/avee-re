package com.daaw;

import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class zk6 implements o67 {
    public final /* synthetic */ cl6 a;
    public final /* synthetic */ dl6 b;

    public zk6(dl6 dl6Var, cl6 cl6Var) {
        this.b = dl6Var;
        this.a = cl6Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        Void r4 = (Void) obj;
        synchronized (this.b) {
            this.b.e = null;
            arrayDeque = this.b.d;
            arrayDeque.addFirst(this.a);
            dl6 dl6Var = this.b;
            i = dl6Var.f;
            if (i == 1) {
                dl6Var.h();
            }
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        synchronized (this.b) {
            this.b.e = null;
        }
    }
}
