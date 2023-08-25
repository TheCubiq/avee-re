package com.daaw;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class xc8 implements qo8 {

    /* renamed from: a */
    public final Executor f32572a;

    /* renamed from: b */
    public final Object f32573b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public gu0 f32574c;

    public xc8(Executor executor, gu0 gu0Var) {
        this.f32572a = executor;
        this.f32574c = gu0Var;
    }

    @Override // com.daaw.qo8
    /* renamed from: a */
    public final void mo5231a(rj1 rj1Var) {
        if (rj1Var.mo11236n() || rj1Var.mo11238l()) {
            return;
        }
        synchronized (this.f32573b) {
            if (this.f32574c == null) {
                return;
            }
            this.f32572a.execute(new t98(this, rj1Var));
        }
    }
}
