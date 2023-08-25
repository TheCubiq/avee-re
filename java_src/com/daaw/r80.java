package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public final class r80 extends s80 {
    private volatile r80 _immediate;
    public final Handler q;
    public final String r;
    public final boolean s;
    public final r80 t;

    public r80(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ r80(Handler handler, String str, int i, pq pqVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public r80(Handler handler, String str, boolean z) {
        super(null);
        this.q = handler;
        this.r = str;
        this.s = z;
        this._immediate = z ? this : null;
        r80 r80Var = this._immediate;
        if (r80Var == null) {
            r80Var = new r80(handler, str, true);
            this._immediate = r80Var;
        }
        this.t = r80Var;
    }

    @Override // com.daaw.pl
    public void T(nl nlVar, Runnable runnable) {
        if (this.q.post(runnable)) {
            return;
        }
        Y(nlVar, runnable);
    }

    @Override // com.daaw.pl
    public boolean U(nl nlVar) {
        return (this.s && ug0.a(Looper.myLooper(), this.q.getLooper())) ? false : true;
    }

    public final void Y(nl nlVar, Runnable runnable) {
        rh0.a(nlVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        gu.a().T(nlVar, runnable);
    }

    @Override // com.daaw.rm0
    /* renamed from: Z */
    public r80 W() {
        return this.t;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r80) && ((r80) obj).q == this.q;
    }

    public int hashCode() {
        return System.identityHashCode(this.q);
    }

    @Override // com.daaw.rm0, com.daaw.pl
    public String toString() {
        String X = X();
        if (X == null) {
            String str = this.r;
            if (str == null) {
                str = this.q.toString();
            }
            return this.s ? ug0.l(str, ".immediate") : str;
        }
        return X;
    }
}
