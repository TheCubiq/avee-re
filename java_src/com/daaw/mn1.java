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

    /* renamed from: a0 */
    public int f18998a0;

    /* renamed from: Y */
    public ArrayList<in1> f18996Y = new ArrayList<>();

    /* renamed from: Z */
    public boolean f18997Z = true;

    /* renamed from: b0 */
    public boolean f18999b0 = false;

    /* renamed from: c0 */
    public int f19000c0 = 0;

    /* renamed from: com.daaw.mn1$a */
    /* loaded from: classes.dex */
    public class C2197a extends jn1 {

        /* renamed from: a */
        public final /* synthetic */ in1 f19001a;

        public C2197a(in1 in1Var) {
            this.f19001a = in1Var;
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: a */
        public void mo9244a(in1 in1Var) {
            this.f19001a.mo15918X();
            in1Var.mo15921T(this);
        }
    }

    /* renamed from: com.daaw.mn1$b */
    /* loaded from: classes.dex */
    public static class C2198b extends jn1 {

        /* renamed from: a */
        public mn1 f19003a;

        public C2198b(mn1 mn1Var) {
            this.f19003a = mn1Var;
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: a */
        public void mo9244a(in1 in1Var) {
            mn1 mn1Var = this.f19003a;
            int i = mn1Var.f18998a0 - 1;
            mn1Var.f18998a0 = i;
            if (i == 0) {
                mn1Var.f18999b0 = false;
                mn1Var.m19599t();
            }
            in1Var.mo15921T(this);
        }

        @Override // com.daaw.jn1, com.daaw.in1.InterfaceC1729f
        /* renamed from: d */
        public void mo15892d(in1 in1Var) {
            mn1 mn1Var = this.f19003a;
            if (mn1Var.f18999b0) {
                return;
            }
            mn1Var.m19604e0();
            this.f19003a.f18999b0 = true;
        }
    }

    @Override // com.daaw.in1
    /* renamed from: R */
    public void mo15922R(View view) {
        super.mo15922R(view);
        int size = this.f18996Y.size();
        for (int i = 0; i < size; i++) {
            this.f18996Y.get(i).mo15922R(view);
        }
    }

    @Override // com.daaw.in1
    /* renamed from: V */
    public void mo15919V(View view) {
        super.mo15919V(view);
        int size = this.f18996Y.size();
        for (int i = 0; i < size; i++) {
            this.f18996Y.get(i).mo15919V(view);
        }
    }

    @Override // com.daaw.in1
    /* renamed from: X */
    public void mo15918X() {
        if (this.f18996Y.isEmpty()) {
            m19604e0();
            m19599t();
            return;
        }
        m15893s0();
        if (this.f18997Z) {
            Iterator<in1> it = this.f18996Y.iterator();
            while (it.hasNext()) {
                it.next().mo15918X();
            }
            return;
        }
        for (int i = 1; i < this.f18996Y.size(); i++) {
            this.f18996Y.get(i - 1).mo15915a(new C2197a(this.f18996Y.get(i)));
        }
        in1 in1Var = this.f18996Y.get(0);
        if (in1Var != null) {
            in1Var.mo15918X();
        }
    }

    @Override // com.daaw.in1
    /* renamed from: Z */
    public void mo15916Z(in1.AbstractC1728e abstractC1728e) {
        super.mo15916Z(abstractC1728e);
        this.f19000c0 |= 8;
        int size = this.f18996Y.size();
        for (int i = 0; i < size; i++) {
            this.f18996Y.get(i).mo15916Z(abstractC1728e);
        }
    }

    @Override // com.daaw.in1
    /* renamed from: b0 */
    public void mo15912b0(aw0 aw0Var) {
        super.mo15912b0(aw0Var);
        this.f19000c0 |= 4;
        if (this.f18996Y != null) {
            for (int i = 0; i < this.f18996Y.size(); i++) {
                this.f18996Y.get(i).mo15912b0(aw0Var);
            }
        }
    }

    @Override // com.daaw.in1
    /* renamed from: c0 */
    public void mo15911c0(ln1 ln1Var) {
        super.mo15911c0(ln1Var);
        this.f19000c0 |= 2;
        int size = this.f18996Y.size();
        for (int i = 0; i < size; i++) {
            this.f18996Y.get(i).mo15911c0(ln1Var);
        }
    }

    @Override // com.daaw.in1
    /* renamed from: f0 */
    public String mo15909f0(String str) {
        String mo15909f0 = super.mo15909f0(str);
        for (int i = 0; i < this.f18996Y.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo15909f0);
            sb.append("\n");
            sb.append(this.f18996Y.get(i).mo15909f0(str + "  "));
            mo15909f0 = sb.toString();
        }
        return mo15909f0;
    }

    @Override // com.daaw.in1
    /* renamed from: g0 */
    public mn1 mo15915a(in1.InterfaceC1729f interfaceC1729f) {
        return (mn1) super.mo15915a(interfaceC1729f);
    }

    @Override // com.daaw.in1
    /* renamed from: h0 */
    public mn1 mo15913b(View view) {
        for (int i = 0; i < this.f18996Y.size(); i++) {
            this.f18996Y.get(i).mo15913b(view);
        }
        return (mn1) super.mo15913b(view);
    }

    @Override // com.daaw.in1
    /* renamed from: i */
    public void mo9259i(on1 on1Var) {
        if (m19616K(on1Var.f21676b)) {
            Iterator<in1> it = this.f18996Y.iterator();
            while (it.hasNext()) {
                in1 next = it.next();
                if (next.m19616K(on1Var.f21676b)) {
                    next.mo9259i(on1Var);
                    on1Var.f21677c.add(next);
                }
            }
        }
    }

    /* renamed from: i0 */
    public mn1 m15906i0(in1 in1Var) {
        m15905j0(in1Var);
        long j = this.f13831r;
        if (j >= 0) {
            in1Var.mo15917Y(j);
        }
        if ((this.f19000c0 & 1) != 0) {
            in1Var.mo15914a0(m19596w());
        }
        if ((this.f19000c0 & 2) != 0) {
            m19625A();
            in1Var.mo15911c0(null);
        }
        if ((this.f19000c0 & 4) != 0) {
            in1Var.mo15912b0(m19593z());
        }
        if ((this.f19000c0 & 8) != 0) {
            in1Var.mo15916Z(m19597v());
        }
        return this;
    }

    /* renamed from: j0 */
    public final void m15905j0(in1 in1Var) {
        this.f18996Y.add(in1Var);
        in1Var.f13814G = this;
    }

    @Override // com.daaw.in1
    /* renamed from: k */
    public void mo15904k(on1 on1Var) {
        super.mo15904k(on1Var);
        int size = this.f18996Y.size();
        for (int i = 0; i < size; i++) {
            this.f18996Y.get(i).mo15904k(on1Var);
        }
    }

    /* renamed from: k0 */
    public in1 m15903k0(int i) {
        if (i < 0 || i >= this.f18996Y.size()) {
            return null;
        }
        return this.f18996Y.get(i);
    }

    /* renamed from: l0 */
    public int m15902l0() {
        return this.f18996Y.size();
    }

    @Override // com.daaw.in1
    /* renamed from: m */
    public void mo9258m(on1 on1Var) {
        if (m19616K(on1Var.f21676b)) {
            Iterator<in1> it = this.f18996Y.iterator();
            while (it.hasNext()) {
                in1 next = it.next();
                if (next.m19616K(on1Var.f21676b)) {
                    next.mo9258m(on1Var);
                    on1Var.f21677c.add(next);
                }
            }
        }
    }

    @Override // com.daaw.in1
    /* renamed from: m0 */
    public mn1 mo15921T(in1.InterfaceC1729f interfaceC1729f) {
        return (mn1) super.mo15921T(interfaceC1729f);
    }

    @Override // com.daaw.in1
    /* renamed from: n0 */
    public mn1 mo15920U(View view) {
        for (int i = 0; i < this.f18996Y.size(); i++) {
            this.f18996Y.get(i).mo15920U(view);
        }
        return (mn1) super.mo15920U(view);
    }

    @Override // com.daaw.in1
    /* renamed from: o0 */
    public mn1 mo15917Y(long j) {
        ArrayList<in1> arrayList;
        super.mo15917Y(j);
        if (this.f13831r >= 0 && (arrayList = this.f18996Y) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f18996Y.get(i).mo15917Y(j);
            }
        }
        return this;
    }

    @Override // com.daaw.in1
    /* renamed from: p */
    public in1 clone() {
        mn1 mn1Var = (mn1) super.clone();
        mn1Var.f18996Y = new ArrayList<>();
        int size = this.f18996Y.size();
        for (int i = 0; i < size; i++) {
            mn1Var.m15905j0(this.f18996Y.get(i).clone());
        }
        return mn1Var;
    }

    @Override // com.daaw.in1
    /* renamed from: p0 */
    public mn1 mo15914a0(TimeInterpolator timeInterpolator) {
        this.f19000c0 |= 1;
        ArrayList<in1> arrayList = this.f18996Y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f18996Y.get(i).mo15914a0(timeInterpolator);
            }
        }
        return (mn1) super.mo15914a0(timeInterpolator);
    }

    /* renamed from: q0 */
    public mn1 m15896q0(int i) {
        if (i == 0) {
            this.f18997Z = true;
        } else if (i != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        } else {
            this.f18997Z = false;
        }
        return this;
    }

    @Override // com.daaw.in1
    /* renamed from: r0 */
    public mn1 mo15910d0(long j) {
        return (mn1) super.mo15910d0(j);
    }

    @Override // com.daaw.in1
    /* renamed from: s */
    public void mo15894s(ViewGroup viewGroup, pn1 pn1Var, pn1 pn1Var2, ArrayList<on1> arrayList, ArrayList<on1> arrayList2) {
        long m19623C = m19623C();
        int size = this.f18996Y.size();
        for (int i = 0; i < size; i++) {
            in1 in1Var = this.f18996Y.get(i);
            if (m19623C > 0 && (this.f18997Z || i == 0)) {
                long m19623C2 = in1Var.m19623C();
                if (m19623C2 > 0) {
                    in1Var.mo15910d0(m19623C2 + m19623C);
                } else {
                    in1Var.mo15910d0(m19623C);
                }
            }
            in1Var.mo15894s(viewGroup, pn1Var, pn1Var2, arrayList, arrayList2);
        }
    }

    /* renamed from: s0 */
    public final void m15893s0() {
        C2198b c2198b = new C2198b(this);
        Iterator<in1> it = this.f18996Y.iterator();
        while (it.hasNext()) {
            it.next().mo15915a(c2198b);
        }
        this.f18998a0 = this.f18996Y.size();
    }
}
