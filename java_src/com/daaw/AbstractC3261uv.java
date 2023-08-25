package com.daaw;

import com.daaw.AbstractC3118tv;
import com.daaw.C3239un;
import com.daaw.ad0;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.uv */
/* loaded from: classes.dex */
public abstract class AbstractC3261uv<T extends AbstractC3118tv, ChildC extends C3239un, ThisC extends ad0<ChildC>> extends AbstractC3118tv {

    /* renamed from: G */
    public List<T> f29555G;

    public AbstractC3261uv() {
        super(2, 1.0f, 1.0f);
        this.f29555G = new ArrayList();
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: G */
    public void mo7700G(de0 de0Var, e40 e40Var) {
        super.mo7700G(de0Var, e40Var);
        for (T t : this.f29555G) {
            if (t.mo5088W()) {
                t.mo7700G(de0Var, e40Var);
            }
        }
    }

    /* renamed from: Y */
    public abstract T mo5087Y(int i, String str, String str2);

    /* renamed from: Z */
    public void mo7699Z(T t) {
        C2691q6.m12755c("addChildAtEnd", null, t.f28122g);
        this.f29555G.add(t);
        t.f28122g = this;
    }

    /* renamed from: a0 */
    public void m7698a0(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        for (T t : this.f29555G) {
            t.mo2435y(de0Var, e40Var, vc0Var);
        }
    }

    /* renamed from: b0 */
    public boolean m7697b0(ThisC thisc, od0 od0Var) {
        if (thisc == null) {
            return false;
        }
        int size = this.f29555G.size();
        for (int i = 0; i < size; i++) {
            if (!this.f29555G.get(i).mo5085g((C3239un) thisc.mo7018b(), 0, od0Var)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c0 */
    public T m7696c0(int i) {
        T remove = this.f29555G.remove(i);
        remove.f28122g = null;
        return remove;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: d */
    public void mo7695d() {
        for (T t : this.f29555G) {
            t.mo7695d();
        }
        super.mo7695d();
    }

    /* renamed from: d0 */
    public void mo7694d0(y31 y31Var, e40 e40Var) {
        for (T t : this.f29555G) {
            if (t.mo5088W()) {
                t.mo2460B(y31Var, e40Var);
                t.m8811D(y31Var);
            } else {
                t.m8810E(y31Var, e40Var);
            }
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: e */
    public AbstractC3118tv mo7693e(int i) {
        AbstractC3118tv mo7693e = super.mo7693e(i);
        if (mo7693e != null) {
            return mo7693e;
        }
        for (T t : this.f29555G) {
            AbstractC3118tv mo7693e2 = t.mo7693e(i);
            if (mo7693e2 != null) {
                return mo7693e2;
            }
        }
        return null;
    }

    /* renamed from: e0 */
    public void m7692e0(y31 y31Var) {
        for (T t : this.f29555G) {
            if (t.mo5088W()) {
                t.mo5090F(y31Var);
            }
        }
    }

    /* renamed from: f0 */
    public boolean m7691f0(ThisC thisc) {
        if (thisc == null) {
            return false;
        }
        int mo7017c = thisc.mo7017c();
        int i = 0;
        for (int i2 = 0; i2 < mo7017c; i2++) {
            C3239un c3239un = (C3239un) thisc.mo7019a(i2);
            String m8003B = c3239un.m8003B();
            String m8001D = c3239un.m8001D();
            if (i >= this.f29555G.size()) {
                T mo5087Y = mo5087Y(i2, m8003B, m8001D);
                if (mo5087Y != null) {
                    mo7699Z(mo5087Y);
                    i = this.f29555G.size() - 1;
                }
            } else if (!sv1.m9824a(this.f29555G.get(i), m8003B, m8001D)) {
                this.f29555G.get(i).mo7695d();
                T mo5087Y2 = mo5087Y(i2, m8003B, m8001D);
                if (mo5087Y2 != null) {
                    this.f29555G.set(i, mo5087Y2);
                }
            }
            this.f29555G.get(i).mo5089K((C3239un) thisc.mo7019a(i2), i2);
            i++;
        }
        while (i < this.f29555G.size()) {
            List<T> list = this.f29555G;
            list.remove(list.size() - 1).mo7695d();
        }
        return true;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: l */
    public void mo2451l() {
        super.mo2451l();
        for (T t : this.f29555G) {
            t.mo2451l();
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.mo2435y(de0Var, e40Var, vc0Var);
        m7698a0(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void generalItemGen(C3239un c3239un, od0 od0Var) {
    }
}
