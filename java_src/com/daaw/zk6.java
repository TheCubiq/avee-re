package com.daaw;

import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class zk6 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ cl6 f35185a;

    /* renamed from: b */
    public final /* synthetic */ dl6 f35186b;

    public zk6(dl6 dl6Var, cl6 cl6Var) {
        this.f35186b = dl6Var;
        this.f35185a = cl6Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        Void r4 = (Void) obj;
        synchronized (this.f35186b) {
            this.f35186b.f7435e = null;
            arrayDeque = this.f35186b.f7434d;
            arrayDeque.addFirst(this.f35185a);
            dl6 dl6Var = this.f35186b;
            i = dl6Var.f7436f;
            if (i == 1) {
                dl6Var.m24257h();
            }
        }
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        synchronized (this.f35186b) {
            this.f35186b.f7435e = null;
        }
    }
}
