package com.daaw;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.in1;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class mn1 extends in1 {
    public int a0;
    public ArrayList<in1> Y = new ArrayList<>();
    public boolean Z = true;
    public boolean b0 = false;
    public int c0 = 0;

    /* loaded from: classes.dex */
    public class a extends jn1 {
        public final /* synthetic */ in1 a;

        public a(in1 in1Var) {
            this.a = in1Var;
        }

        @Override // com.daaw.in1.f
        public void a(in1 in1Var) {
            this.a.X();
            in1Var.T(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends jn1 {
        public mn1 a;

        public b(mn1 mn1Var) {
            this.a = mn1Var;
        }

        @Override // com.daaw.in1.f
        public void a(in1 in1Var) {
            mn1 mn1Var = this.a;
            int i = mn1Var.a0 - 1;
            mn1Var.a0 = i;
            if (i == 0) {
                mn1Var.b0 = false;
                mn1Var.t();
            }
            in1Var.T(this);
        }

        @Override // com.daaw.jn1, com.daaw.in1.f
        public void d(in1 in1Var) {
            mn1 mn1Var = this.a;
            if (mn1Var.b0) {
                return;
            }
            mn1Var.e0();
            this.a.b0 = true;
        }
    }

    @Override // com.daaw.in1
    public void R(View view) {
        super.R(view);
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).R(view);
        }
    }

    @Override // com.daaw.in1
    public void V(View view) {
        super.V(view);
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).V(view);
        }
    }

    @Override // com.daaw.in1
    public void X() {
        if (this.Y.isEmpty()) {
            e0();
            t();
            return;
        }
        s0();
        if (this.Z) {
            Iterator<in1> it = this.Y.iterator();
            while (it.hasNext()) {
                it.next().X();
            }
            return;
        }
        for (int i = 1; i < this.Y.size(); i++) {
            this.Y.get(i - 1).a(new a(this.Y.get(i)));
        }
        in1 in1Var = this.Y.get(0);
        if (in1Var != null) {
            in1Var.X();
        }
    }

    @Override // com.daaw.in1
    public void Z(in1.e eVar) {
        super.Z(eVar);
        this.c0 |= 8;
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).Z(eVar);
        }
    }

    @Override // com.daaw.in1
    public void b0(aw0 aw0Var) {
        super.b0(aw0Var);
        this.c0 |= 4;
        if (this.Y != null) {
            for (int i = 0; i < this.Y.size(); i++) {
                this.Y.get(i).b0(aw0Var);
            }
        }
    }

    @Override // com.daaw.in1
    public void c0(ln1 ln1Var) {
        super.c0(ln1Var);
        this.c0 |= 2;
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).c0(ln1Var);
        }
    }

    @Override // com.daaw.in1
    public String f0(String str) {
        String f0 = super.f0(str);
        for (int i = 0; i < this.Y.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(f0);
            sb.append("\n");
            sb.append(this.Y.get(i).f0(str + "  "));
            f0 = sb.toString();
        }
        return f0;
    }

    @Override // com.daaw.in1
    /* renamed from: g0 */
    public mn1 a(in1.f fVar) {
        return (mn1) super.a(fVar);
    }

    @Override // com.daaw.in1
    /* renamed from: h0 */
    public mn1 b(View view) {
        for (int i = 0; i < this.Y.size(); i++) {
            this.Y.get(i).b(view);
        }
        return (mn1) super.b(view);
    }

    @Override // com.daaw.in1
    public void i(on1 on1Var) {
        if (K(on1Var.b)) {
            Iterator<in1> it = this.Y.iterator();
            while (it.hasNext()) {
                in1 next = it.next();
                if (next.K(on1Var.b)) {
                    next.i(on1Var);
                    on1Var.c.add(next);
                }
            }
        }
    }

    public mn1 i0(in1 in1Var) {
        j0(in1Var);
        long j = this.r;
        if (j >= 0) {
            in1Var.Y(j);
        }
        if ((this.c0 & 1) != 0) {
            in1Var.a0(w());
        }
        if ((this.c0 & 2) != 0) {
            A();
            in1Var.c0(null);
        }
        if ((this.c0 & 4) != 0) {
            in1Var.b0(z());
        }
        if ((this.c0 & 8) != 0) {
            in1Var.Z(v());
        }
        return this;
    }

    public final void j0(in1 in1Var) {
        this.Y.add(in1Var);
        in1Var.G = this;
    }

    @Override // com.daaw.in1
    public void k(on1 on1Var) {
        super.k(on1Var);
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).k(on1Var);
        }
    }

    public in1 k0(int i) {
        if (i < 0 || i >= this.Y.size()) {
            return null;
        }
        return this.Y.get(i);
    }

    public int l0() {
        return this.Y.size();
    }

    @Override // com.daaw.in1
    public void m(on1 on1Var) {
        if (K(on1Var.b)) {
            Iterator<in1> it = this.Y.iterator();
            while (it.hasNext()) {
                in1 next = it.next();
                if (next.K(on1Var.b)) {
                    next.m(on1Var);
                    on1Var.c.add(next);
                }
            }
        }
    }

    @Override // com.daaw.in1
    /* renamed from: m0 */
    public mn1 T(in1.f fVar) {
        return (mn1) super.T(fVar);
    }

    @Override // com.daaw.in1
    /* renamed from: n0 */
    public mn1 U(View view) {
        for (int i = 0; i < this.Y.size(); i++) {
            this.Y.get(i).U(view);
        }
        return (mn1) super.U(view);
    }

    @Override // com.daaw.in1
    /* renamed from: o0 */
    public mn1 Y(long j) {
        ArrayList<in1> arrayList;
        super.Y(j);
        if (this.r >= 0 && (arrayList = this.Y) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.Y.get(i).Y(j);
            }
        }
        return this;
    }

    @Override // com.daaw.in1
    /* renamed from: p */
    public in1 clone() {
        mn1 mn1Var = (mn1) super.clone();
        mn1Var.Y = new ArrayList<>();
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            mn1Var.j0(this.Y.get(i).clone());
        }
        return mn1Var;
    }

    @Override // com.daaw.in1
    /* renamed from: p0 */
    public mn1 a0(TimeInterpolator timeInterpolator) {
        this.c0 |= 1;
        ArrayList<in1> arrayList = this.Y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.Y.get(i).a0(timeInterpolator);
            }
        }
        return (mn1) super.a0(timeInterpolator);
    }

    public mn1 q0(int i) {
        if (i == 0) {
            this.Z = true;
        } else if (i != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        } else {
            this.Z = false;
        }
        return this;
    }

    @Override // com.daaw.in1
    /* renamed from: r0 */
    public mn1 d0(long j) {
        return (mn1) super.d0(j);
    }

    @Override // com.daaw.in1
    public void s(ViewGroup viewGroup, pn1 pn1Var, pn1 pn1Var2, ArrayList<on1> arrayList, ArrayList<on1> arrayList2) {
        long C = C();
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            in1 in1Var = this.Y.get(i);
            if (C > 0 && (this.Z || i == 0)) {
                long C2 = in1Var.C();
                if (C2 > 0) {
                    in1Var.d0(C2 + C);
                } else {
                    in1Var.d0(C);
                }
            }
            in1Var.s(viewGroup, pn1Var, pn1Var2, arrayList, arrayList2);
        }
    }

    public final void s0() {
        b bVar = new b(this);
        Iterator<in1> it = this.Y.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.a0 = this.Y.size();
    }
}
