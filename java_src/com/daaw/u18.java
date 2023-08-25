package com.daaw;
/* loaded from: classes2.dex */
public final class u18 implements Runnable {
    public final /* synthetic */ Boolean p;
    public final /* synthetic */ p28 q;

    public u18(p28 p28Var, Boolean bool) {
        this.q = p28Var;
        this.p = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.O(this.p, true);
    }
}
