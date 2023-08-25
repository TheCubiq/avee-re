package com.daaw;

import android.os.Handler;
import com.daaw.bp0;
import com.daaw.cp0;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.daaw.ua */
/* loaded from: classes.dex */
public abstract class AbstractC3190ua implements bp0 {

    /* renamed from: p */
    public final ArrayList<bp0.InterfaceC0881b> f28815p = new ArrayList<>(1);

    /* renamed from: q */
    public final cp0.C0975a f28816q = new cp0.C0975a();

    /* renamed from: r */
    public InterfaceC2898rz f28817r;

    /* renamed from: s */
    public nl1 f28818s;

    /* renamed from: t */
    public Object f28819t;

    @Override // com.daaw.bp0
    /* renamed from: c */
    public final void mo8404c(Handler handler, cp0 cp0Var) {
        this.f28816q.m25167a(handler, cp0Var);
    }

    @Override // com.daaw.bp0
    /* renamed from: f */
    public final void mo8403f(InterfaceC2898rz interfaceC2898rz, boolean z, bp0.InterfaceC0881b interfaceC0881b) {
        InterfaceC2898rz interfaceC2898rz2 = this.f28817r;
        C2914s6.m10690a(interfaceC2898rz2 == null || interfaceC2898rz2 == interfaceC2898rz);
        this.f28815p.add(interfaceC0881b);
        if (this.f28817r == null) {
            this.f28817r = interfaceC2898rz;
            mo8398m(interfaceC2898rz, z);
            return;
        }
        nl1 nl1Var = this.f28818s;
        if (nl1Var != null) {
            interfaceC0881b.mo7613d(this, nl1Var, this.f28819t);
        }
    }

    @Override // com.daaw.bp0
    /* renamed from: h */
    public final void mo8402h(bp0.InterfaceC0881b interfaceC0881b) {
        this.f28815p.remove(interfaceC0881b);
        if (this.f28815p.isEmpty()) {
            this.f28817r = null;
            this.f28818s = null;
            this.f28819t = null;
            mo8396p();
        }
    }

    @Override // com.daaw.bp0
    /* renamed from: i */
    public final void mo8401i(cp0 cp0Var) {
        this.f28816q.m25147u(cp0Var);
    }

    /* renamed from: j */
    public final cp0.C0975a m8400j(bp0.C0880a c0880a) {
        return this.f28816q.m25144x(0, c0880a, 0L);
    }

    /* renamed from: l */
    public final cp0.C0975a m8399l(bp0.C0880a c0880a, long j) {
        C2914s6.m10690a(c0880a != null);
        return this.f28816q.m25144x(0, c0880a, j);
    }

    /* renamed from: m */
    public abstract void mo8398m(InterfaceC2898rz interfaceC2898rz, boolean z);

    /* renamed from: n */
    public final void m8397n(nl1 nl1Var, Object obj) {
        this.f28818s = nl1Var;
        this.f28819t = obj;
        Iterator<bp0.InterfaceC0881b> it = this.f28815p.iterator();
        while (it.hasNext()) {
            it.next().mo7613d(this, nl1Var, obj);
        }
    }

    /* renamed from: p */
    public abstract void mo8396p();
}
