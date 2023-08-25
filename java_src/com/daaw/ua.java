package com.daaw;

import android.os.Handler;
import com.daaw.bp0;
import com.daaw.cp0;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class ua implements bp0 {
    public final ArrayList<bp0.b> p = new ArrayList<>(1);
    public final cp0.a q = new cp0.a();
    public rz r;
    public nl1 s;
    public Object t;

    @Override // com.daaw.bp0
    public final void c(Handler handler, cp0 cp0Var) {
        this.q.a(handler, cp0Var);
    }

    @Override // com.daaw.bp0
    public final void f(rz rzVar, boolean z, bp0.b bVar) {
        rz rzVar2 = this.r;
        s6.a(rzVar2 == null || rzVar2 == rzVar);
        this.p.add(bVar);
        if (this.r == null) {
            this.r = rzVar;
            m(rzVar, z);
            return;
        }
        nl1 nl1Var = this.s;
        if (nl1Var != null) {
            bVar.d(this, nl1Var, this.t);
        }
    }

    @Override // com.daaw.bp0
    public final void h(bp0.b bVar) {
        this.p.remove(bVar);
        if (this.p.isEmpty()) {
            this.r = null;
            this.s = null;
            this.t = null;
            p();
        }
    }

    @Override // com.daaw.bp0
    public final void i(cp0 cp0Var) {
        this.q.u(cp0Var);
    }

    public final cp0.a j(bp0.a aVar) {
        return this.q.x(0, aVar, 0L);
    }

    public final cp0.a l(bp0.a aVar, long j) {
        s6.a(aVar != null);
        return this.q.x(0, aVar, j);
    }

    public abstract void m(rz rzVar, boolean z);

    public final void n(nl1 nl1Var, Object obj) {
        this.s = nl1Var;
        this.t = obj;
        Iterator<bp0.b> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().d(this, nl1Var, obj);
        }
    }

    public abstract void p();
}
