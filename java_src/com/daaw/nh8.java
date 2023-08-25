package com.daaw;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class nh8 implements qo8 {

    /* renamed from: a */
    public final Executor f20130a;

    /* renamed from: b */
    public final Object f20131b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public ku0 f20132c;

    public nh8(Executor executor, ku0 ku0Var) {
        this.f20130a = executor;
        this.f20132c = ku0Var;
    }

    @Override // com.daaw.qo8
    /* renamed from: a */
    public final void mo5231a(rj1 rj1Var) {
        if (rj1Var.mo11236n()) {
            synchronized (this.f20131b) {
                if (this.f20132c == null) {
                    return;
                }
                this.f20130a.execute(new bf8(this, rj1Var));
            }
        }
    }
}
