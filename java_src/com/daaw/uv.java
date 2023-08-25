package com.daaw;

import com.daaw.ad0;
import com.daaw.tv;
import com.daaw.un;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class uv<T extends tv, ChildC extends un, ThisC extends ad0<ChildC>> extends tv {
    public List<T> G;

    public uv() {
        super(2, 1.0f, 1.0f);
        this.G = new ArrayList();
    }

    @Override // com.daaw.tv
    public void G(de0 de0Var, e40 e40Var) {
        super.G(de0Var, e40Var);
        for (T t : this.G) {
            if (t.W()) {
                t.G(de0Var, e40Var);
            }
        }
    }

    public abstract T Y(int i, String str, String str2);

    public void Z(T t) {
        q6.c("addChildAtEnd", null, t.g);
        this.G.add(t);
        t.g = this;
    }

    public void a0(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        for (T t : this.G) {
            t.y(de0Var, e40Var, vc0Var);
        }
    }

    public boolean b0(ThisC thisc, od0 od0Var) {
        if (thisc == null) {
            return false;
        }
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            if (!this.G.get(i).g((un) thisc.b(), 0, od0Var)) {
                return false;
            }
        }
        return true;
    }

    public T c0(int i) {
        T remove = this.G.remove(i);
        remove.g = null;
        return remove;
    }

    @Override // com.daaw.tv
    public void d() {
        for (T t : this.G) {
            t.d();
        }
        super.d();
    }

    public void d0(y31 y31Var, e40 e40Var) {
        for (T t : this.G) {
            if (t.W()) {
                t.B(y31Var, e40Var);
                t.D(y31Var);
            } else {
                t.E(y31Var, e40Var);
            }
        }
    }

    @Override // com.daaw.tv
    public tv e(int i) {
        tv e = super.e(i);
        if (e != null) {
            return e;
        }
        for (T t : this.G) {
            tv e2 = t.e(i);
            if (e2 != null) {
                return e2;
            }
        }
        return null;
    }

    public void e0(y31 y31Var) {
        for (T t : this.G) {
            if (t.W()) {
                t.F(y31Var);
            }
        }
    }

    public boolean f0(ThisC thisc) {
        if (thisc == null) {
            return false;
        }
        int c = thisc.c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            un unVar = (un) thisc.a(i2);
            String B = unVar.B();
            String D = unVar.D();
            if (i >= this.G.size()) {
                T Y = Y(i2, B, D);
                if (Y != null) {
                    Z(Y);
                    i = this.G.size() - 1;
                }
            } else if (!sv1.a(this.G.get(i), B, D)) {
                this.G.get(i).d();
                T Y2 = Y(i2, B, D);
                if (Y2 != null) {
                    this.G.set(i, Y2);
                }
            }
            this.G.get(i).K((un) thisc.a(i2), i2);
            i++;
        }
        while (i < this.G.size()) {
            List<T> list = this.G;
            list.remove(list.size() - 1).d();
        }
        return true;
    }

    @Override // com.daaw.tv
    public void l() {
        super.l();
        for (T t : this.G) {
            t.l();
        }
    }

    @Override // com.daaw.tv
    public void t(un unVar) {
    }

    @Override // com.daaw.tv
    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.y(de0Var, e40Var, vc0Var);
        a0(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.tv
    public void z(un unVar, od0 od0Var) {
    }
}
