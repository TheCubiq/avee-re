package com.daaw;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class k68 implements qo8 {

    /* renamed from: a */
    public final Executor f15717a;

    /* renamed from: b */
    public final Object f15718b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public cu0 f15719c;

    public k68(Executor executor, cu0 cu0Var) {
        this.f15717a = executor;
        this.f15719c = cu0Var;
    }

    @Override // com.daaw.qo8
    /* renamed from: a */
    public final void mo5231a(rj1 rj1Var) {
        synchronized (this.f15718b) {
            if (this.f15719c == null) {
                return;
            }
            this.f15717a.execute(new e38(this, rj1Var));
        }
    }
}
