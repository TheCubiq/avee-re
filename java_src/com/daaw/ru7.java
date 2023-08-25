package com.daaw;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ru7 implements qo8 {

    /* renamed from: a */
    public final Executor f25633a;

    /* renamed from: b */
    public final Object f25634b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public zt0 f25635c;

    public ru7(Executor executor, zt0 zt0Var) {
        this.f25633a = executor;
        this.f25635c = zt0Var;
    }

    @Override // com.daaw.qo8
    /* renamed from: a */
    public final void mo5231a(rj1 rj1Var) {
        if (rj1Var.mo11238l()) {
            synchronized (this.f25634b) {
                if (this.f25635c == null) {
                    return;
                }
                this.f25633a.execute(new y07(this));
            }
        }
    }
}
