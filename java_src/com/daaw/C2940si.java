package com.daaw;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.ts1;
import java.lang.ref.WeakReference;
import java.util.List;
/* renamed from: com.daaw.si */
/* loaded from: classes.dex */
public class C2940si implements ts1.InterfaceC3115a {

    /* renamed from: a */
    public WeakReference<oc0> f26257a = new WeakReference<>(null);

    /* renamed from: b */
    public C2942b[] f26258b;

    /* renamed from: c */
    public ts1.InterfaceC3115a[] f26259c;

    /* renamed from: d */
    public wc0[] f26260d;

    /* renamed from: e */
    public oc0[] f26261e;

    /* renamed from: com.daaw.si$a */
    /* loaded from: classes.dex */
    public class C2941a implements oc0 {

        /* renamed from: a */
        public int f26262a;

        public C2941a(int i) {
            this.f26262a = i;
        }

        @Override // com.daaw.oc0
        /* renamed from: a */
        public void mo8846a() {
            oc0 m10336b = C2940si.this.m10336b();
            if (m10336b != null) {
                m10336b.mo8846a();
            }
        }
    }

    /* renamed from: com.daaw.si$b */
    /* loaded from: classes.dex */
    public static class C2942b {

        /* renamed from: a */
        public final int f26264a;

        public C2942b(int i) {
            this.f26264a = i;
        }

        /* renamed from: a */
        public int m10334a() {
            return this.f26264a;
        }
    }

    public C2940si(C2942b[] c2942bArr, ts1.InterfaceC3115a[] interfaceC3115aArr, wc0[] wc0VarArr) {
        this.f26260d = wc0VarArr;
        this.f26258b = c2942bArr;
        this.f26259c = interfaceC3115aArr;
        this.f26261e = new oc0[interfaceC3115aArr.length];
        for (int i = 0; i < interfaceC3115aArr.length; i++) {
            this.f26261e[i] = new C2941a(i);
            interfaceC3115aArr[i].mo2243f(this.f26261e[i]);
        }
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: a */
    public int mo2250a() {
        int i = 0;
        for (int i2 = 0; i2 < this.f26259c.length; i2++) {
            i = this.f26260d[i2].mo3658z() ? i + this.f26259c[i2].mo2250a() + 1 : i + 1;
        }
        return i;
    }

    /* renamed from: b */
    public oc0 m10336b() {
        return this.f26257a.get();
    }

    /* renamed from: c */
    public lo1<Integer, Integer> m10335c(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < this.f26259c.length) {
            i3 = this.f26260d[i2].mo3658z() ? i3 + this.f26259c[i2].mo2250a() + 1 : i3 + 1;
            if (i < i3) {
                return new lo1<>(Integer.valueOf((i - i4) - 1), Integer.valueOf(i2));
            }
            i2++;
            i4 = i3;
        }
        return new lo1<>(-1, -1);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: f */
    public void mo2243f(oc0 oc0Var) {
        this.f26257a = new WeakReference<>(oc0Var);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    public int getItemViewType(int i) {
        lo1<Integer, Integer> m10335c = m10335c(i);
        return m10335c.f17576a.intValue() < 0 ? this.f26258b[m10335c.f17577b.intValue()].m10334a() : this.f26259c[m10335c.f17577b.intValue()].getItemViewType(m10335c.f17576a.intValue());
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: j */
    public void mo2237j(int i, int i2, List<Integer> list) {
        lo1<Integer, Integer> m10335c = m10335c(i);
        lo1<Integer, Integer> m10335c2 = m10335c(i2);
        if (m10335c.f17577b.equals(m10335c.f17576a)) {
            this.f26259c[m10335c2.f17577b.intValue()].mo2237j(m10335c.f17576a.intValue(), m10335c2.f17576a.intValue(), list);
            return;
        }
        lz1.m16363c("Assert posFrom.obj2 != posFrom.obj1");
        this.f26259c[m10335c2.f17577b.intValue()].mo2237j(m10335c.f17576a.intValue(), -1, list);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: k */
    public void mo2235k() {
        for (ts1.InterfaceC3115a interfaceC3115a : this.f26259c) {
            interfaceC3115a.mo2235k();
        }
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: r */
    public RecyclerView.AbstractC0376c0 mo2233r(ViewGroup viewGroup, int i) {
        return gt1.m21239a(viewGroup.getContext(), viewGroup, i, this.f26260d[0]);
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: t */
    public int mo2232t(int i) {
        return 0;
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: v */
    public void mo2231v(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        lo1<Integer, Integer> m10335c = m10335c(i);
        if (m10335c.f17576a.intValue() < 0) {
            ((AbstractC1172eb) abstractC0376c0).mo4018O(this.f26260d[m10335c.f17577b.intValue()], m10335c.f17577b.intValue());
        } else {
            this.f26259c[m10335c.f17577b.intValue()].mo2231v(abstractC0376c0, m10335c.f17576a.intValue());
        }
    }
}
