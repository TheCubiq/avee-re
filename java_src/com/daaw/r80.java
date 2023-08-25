package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public final class r80 extends s80 {
    private volatile r80 _immediate;

    /* renamed from: q */
    public final Handler f24955q;

    /* renamed from: r */
    public final String f24956r;

    /* renamed from: s */
    public final boolean f24957s;

    /* renamed from: t */
    public final r80 f24958t;

    public r80(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ r80(Handler handler, String str, int i, C2575pq c2575pq) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public r80(Handler handler, String str, boolean z) {
        super(null);
        this.f24955q = handler;
        this.f24956r = str;
        this.f24957s = z;
        this._immediate = z ? this : null;
        r80 r80Var = this._immediate;
        if (r80Var == null) {
            r80Var = new r80(handler, str, true);
            this._immediate = r80Var;
        }
        this.f24958t = r80Var;
    }

    @Override // com.daaw.AbstractC2557pl
    /* renamed from: T */
    public void mo5048T(InterfaceC2307nl interfaceC2307nl, Runnable runnable) {
        if (this.f24955q.post(runnable)) {
            return;
        }
        m11593Y(interfaceC2307nl, runnable);
    }

    @Override // com.daaw.AbstractC2557pl
    /* renamed from: U */
    public boolean mo11594U(InterfaceC2307nl interfaceC2307nl) {
        return (this.f24957s && ug0.m8273a(Looper.myLooper(), this.f24955q.getLooper())) ? false : true;
    }

    /* renamed from: Y */
    public final void m11593Y(InterfaceC2307nl interfaceC2307nl, Runnable runnable) {
        rh0.m11311a(interfaceC2307nl, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C1470gu.m21231a().mo5048T(interfaceC2307nl, runnable);
    }

    @Override // com.daaw.rm0
    /* renamed from: Z */
    public r80 mo11184W() {
        return this.f24958t;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r80) && ((r80) obj).f24955q == this.f24955q;
    }

    public int hashCode() {
        return System.identityHashCode(this.f24955q);
    }

    @Override // com.daaw.rm0, com.daaw.AbstractC2557pl
    public String toString() {
        String m11183X = m11183X();
        if (m11183X == null) {
            String str = this.f24956r;
            if (str == null) {
                str = this.f24955q.toString();
            }
            return this.f24957s ? ug0.m8262l(str, ".immediate") : str;
        }
        return m11183X;
    }
}
