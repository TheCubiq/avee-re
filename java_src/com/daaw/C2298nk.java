package com.daaw;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.ir1;
import java.util.List;
/* renamed from: com.daaw.nk */
/* loaded from: classes.dex */
public class C2298nk extends n10<h60, List<h60>> {

    /* renamed from: K */
    public AbstractC2004l0[] f20169K;

    /* renamed from: L */
    public AbstractC2004l0[] f20170L;

    /* renamed from: M */
    public String f20171M;

    /* renamed from: com.daaw.nk$a */
    /* loaded from: classes.dex */
    public static class C2299a implements r40<AbstractC3711yj, List<sc1>> {

        /* renamed from: a */
        public String f20172a;

        /* renamed from: b */
        public er0<tx0, sc1> f20173b = null;

        /* renamed from: c */
        public ak1<lo1<er0<tx0, sc1>, wf1>> f20174c = new ak1<>();

        /* renamed from: com.daaw.nk$a$a */
        /* loaded from: classes.dex */
        public class C2300a implements ir1.InterfaceC1750b<lo1<er0<tx0, sc1>, wf1>> {

            /* renamed from: a */
            public final /* synthetic */ AbstractC3711yj f20175a;

            public C2300a(AbstractC3711yj abstractC3711yj) {
                this.f20175a = abstractC3711yj;
            }

            @Override // com.daaw.ir1.InterfaceC1750b
            /* renamed from: b */
            public void mo15140a(lo1<er0<tx0, sc1>, wf1> lo1Var, boolean z) {
                if (z) {
                    return;
                }
                er0<tx0, sc1> er0Var = null;
                if (lo1Var != null) {
                    er0<tx0, sc1> er0Var2 = lo1Var.f17576a;
                    if (lo1Var.f17577b.m6091f()) {
                        this.f20175a.m3673O(lo1Var.f17577b.m6092e());
                    } else {
                        this.f20175a.m3673O(null);
                    }
                    er0Var = er0Var2;
                } else {
                    this.f20175a.m3673O(null);
                }
                if (er0Var == null) {
                    er0Var = new er0<>();
                }
                C2299a.this.f20173b = er0Var;
                this.f20175a.mo2264A();
            }
        }

        public C2299a(String str) {
            this.f20172a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: c */
        public List<sc1> mo5050a(AbstractC3711yj abstractC3711yj) {
            if (this.f20173b != null || this.f20174c.m27390e(null)) {
                if (this.f20173b == null) {
                    return null;
                }
                abstractC3711yj.m3676L(false);
                C2051lk.m16895Z(abstractC3711yj, this.f20173b);
                return this.f20173b.m23259x();
            }
            abstractC3711yj.m3676L(true);
            this.f20174c.m27394a();
            this.f20174c.m27393b(null, tc1.m9331e().m11426f(this.f20172a), new C2300a(abstractC3711yj));
            return null;
        }
    }

    /* renamed from: com.daaw.nk$b */
    /* loaded from: classes.dex */
    public static class C2301b {

        /* renamed from: a */
        public h60 f20177a;

        public C2301b(h60 h60Var) {
            this.f20177a = h60Var;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2301b) && this.f20177a.f12080b.equals(((C2301b) obj).f20177a.f12080b);
        }

        public int hashCode() {
            return this.f20177a.f12080b.hashCode();
        }
    }

    public C2298nk(Context context, String str, r40<AbstractC3711yj, List<h60>> r40Var, String str2, me0<String> me0Var, int i, int i2) {
        super(context, r40Var, new C1252f6(), str2, me0Var, i, new p91(context), i2);
        this.f20169K = new AbstractC2004l0[0];
        this.f20170L = new AbstractC2004l0[0];
        this.f20171M = str;
    }

    /* renamed from: Y */
    public static String m15143Y(Context context, String str) {
        return str.isEmpty() ? context.getString(R.string.unnamed_title) : str;
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: E */
    public ts1 mo2263E(Context context, int i) {
        return new ts1(new d90(this, this, 9, 15), this);
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: H */
    public String mo2262H(int i) {
        return ((h60) m26096R(i)).f12080b;
    }

    /* renamed from: X */
    public void m15144X(h60 h60Var, int i, C3223uk c3223uk) {
        c3223uk.m8086b0(this, new C2301b(h60Var), m3678J());
        c3223uk.f29121w.setSelected(AbstractC3711yj.f33708x.m5753a(c3223uk.f29118t, Boolean.FALSE).booleanValue());
        c3223uk.m8090X(this.f20169K, 0, this);
        c3223uk.f29122x.setVisibility(8);
        c3223uk.m8093U(null);
        c3223uk.f29123y.setVisibility(8);
        TextView textView = c3223uk.f29124z;
        textView.setText(m15143Y(textView.getContext(), h60Var.f12079a));
        c3223uk.f29124z.setTextColor(this.f33717g);
        c3223uk.m8084d0(8);
        c3223uk.f29112B.setText("");
    }

    @Override // com.daaw.wc0
    /* renamed from: d */
    public ts1 mo2246d(Context context, String str) {
        C2051lk c2051lk = new C2051lk(context, new C2299a(str), mo3664p(str), tc1.m9332d(this.f20171M, str), 0, this.f33722l);
        c2051lk.mo3663q(this.f33713c);
        return c2051lk.m3680G(context, 0);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: g */
    public void mo2241g(C0645al c0645al, int i) {
        AbstractC2004l0[] abstractC2004l0Arr = this.f20170L;
        if (i < abstractC2004l0Arr.length) {
            abstractC2004l0Arr[i].m17274a(c0645al, null);
        }
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.wc0
    /* renamed from: o */
    public void mo2234o(Context context, String str) {
        m15602W(context, str, new p91(context));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: v */
    public void mo2231v(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        C3223uk c3223uk = (C3223uk) abstractC0376c0;
        c3223uk.f29120v = i;
        m15144X((h60) m26095S().get(i), i, c3223uk);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: x */
    public void mo2230x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Stations_search);
        sd0VarArr[0] = m3678J();
    }
}
