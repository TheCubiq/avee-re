package com.daaw;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.ir1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.mk */
/* loaded from: classes.dex */
public class C2181mk extends n10<h60, List<h60>> {

    /* renamed from: K */
    public AbstractC2004l0[] f18915K;

    /* renamed from: L */
    public AbstractC2004l0[] f18916L;

    /* renamed from: com.daaw.mk$a */
    /* loaded from: classes.dex */
    public static class C2182a implements r40<AbstractC3711yj, List<h60>> {

        /* renamed from: a */
        public String f18917a;

        /* renamed from: b */
        public List<h60> f18918b = null;

        /* renamed from: c */
        public ak1<lo1<List<h60>, wf1>> f18919c = new ak1<>();

        /* renamed from: com.daaw.mk$a$a */
        /* loaded from: classes.dex */
        public class C2183a implements ir1.InterfaceC1750b<lo1<List<h60>, wf1>> {

            /* renamed from: a */
            public final /* synthetic */ AbstractC3711yj f18920a;

            public C2183a(AbstractC3711yj abstractC3711yj) {
                this.f18920a = abstractC3711yj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
            @Override // com.daaw.ir1.InterfaceC1750b
            /* renamed from: b */
            public void mo15140a(lo1<List<h60>, wf1> lo1Var, boolean z) {
                if (z) {
                    return;
                }
                ArrayList arrayList = null;
                if (lo1Var != null) {
                    ?? r0 = (List) lo1Var.f17576a;
                    if (lo1Var.f17577b.m6091f()) {
                        this.f18920a.m3673O(lo1Var.f17577b.m6092e());
                    } else {
                        this.f18920a.m3673O(null);
                    }
                    arrayList = r0;
                } else {
                    this.f18920a.m3673O(null);
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C2182a.this.f18918b = arrayList;
                this.f18920a.mo2264A();
            }
        }

        public C2182a(String str) {
            this.f18917a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: c */
        public List<h60> mo5050a(AbstractC3711yj abstractC3711yj) {
            if (this.f18918b != null || this.f18919c.m27390e(null)) {
                if (this.f18918b == null) {
                    return null;
                }
                abstractC3711yj.m3676L(false);
                m15999d(abstractC3711yj, this.f18918b);
                return Collections.unmodifiableList(this.f18918b);
            }
            abstractC3711yj.m3676L(true);
            this.f18919c.m27394a();
            this.f18919c.m27393b(null, tc1.m9333c(this.f18917a), new C2183a(abstractC3711yj));
            return null;
        }

        /* renamed from: d */
        public final void m15999d(AbstractC3711yj abstractC3711yj, List<h60> list) {
        }
    }

    /* renamed from: com.daaw.mk$b */
    /* loaded from: classes.dex */
    public static class C2184b implements r40<AbstractC3711yj, List<h60>> {

        /* renamed from: a */
        public List<h60> f18922a = null;

        /* renamed from: b */
        public boolean f18923b = false;

        /* renamed from: c */
        public ak1<lo1<List<h60>, wf1>> f18924c = new ak1<>();

        /* renamed from: d */
        public rc1<lo1<tx0, sc1>, er0<tx0, sc1>, h60, List<h60>> f18925d = tc1.m9331e();

        /* renamed from: com.daaw.mk$b$a */
        /* loaded from: classes.dex */
        public class C2185a implements ir1.InterfaceC1750b<lo1<List<h60>, wf1>> {

            /* renamed from: a */
            public final /* synthetic */ AbstractC3711yj f18926a;

            public C2185a(AbstractC3711yj abstractC3711yj) {
                this.f18926a = abstractC3711yj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
            @Override // com.daaw.ir1.InterfaceC1750b
            /* renamed from: b */
            public void mo15140a(lo1<List<h60>, wf1> lo1Var, boolean z) {
                if (z) {
                    return;
                }
                ArrayList arrayList = null;
                if (lo1Var != null) {
                    ?? r0 = (List) lo1Var.f17576a;
                    if (lo1Var.f17577b.m6091f()) {
                        this.f18926a.m3673O(lo1Var.f17577b.m6092e());
                    } else {
                        this.f18926a.m3673O(null);
                    }
                    arrayList = r0;
                } else {
                    this.f18926a.m3673O(null);
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C2184b.this.f18922a = arrayList;
                this.f18926a.mo2264A();
            }
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public List<h60> mo5050a(AbstractC3711yj abstractC3711yj) {
            if (this.f18922a != null || this.f18924c.m27390e(null)) {
                if (this.f18922a == null) {
                    return null;
                }
                abstractC3711yj.m3676L(false);
                m15996c(abstractC3711yj, this.f18922a);
                return Collections.unmodifiableList(this.f18922a);
            }
            abstractC3711yj.m3676L(true);
            this.f18924c.m27394a();
            this.f18924c.m27393b(null, tc1.m9333c(null), new C2185a(abstractC3711yj));
            return null;
        }

        /* renamed from: c */
        public void m15996c(AbstractC3711yj abstractC3711yj, List<h60> list) {
        }
    }

    /* renamed from: com.daaw.mk$c */
    /* loaded from: classes.dex */
    public static class C2186c {

        /* renamed from: a */
        public h60 f18928a;

        public C2186c(h60 h60Var) {
            this.f18928a = h60Var;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2186c) && this.f18928a.f12080b.equals(((C2186c) obj).f18928a.f12080b);
        }

        public int hashCode() {
            return this.f18928a.f12080b.hashCode();
        }
    }

    public C2181mk(Context context, r40<AbstractC3711yj, List<h60>> r40Var, String str, me0<String> me0Var, int i, int i2) {
        super(context, r40Var, new C1252f6(), str, me0Var, i, new p91(context), i2);
        this.f18915K = new AbstractC2004l0[0];
        this.f18916L = new AbstractC2004l0[0];
    }

    /* renamed from: X */
    public static C2181mk m16004X(Context context, String str, me0<String> me0Var, int i, int i2) {
        return new C2181mk(context, new C2184b(), str, me0Var, i, i2);
    }

    /* renamed from: Z */
    public static String m16002Z(Context context, String str) {
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

    /* renamed from: Y */
    public void m16003Y(h60 h60Var, int i, C3223uk c3223uk) {
        c3223uk.m8086b0(this, new C2186c(h60Var), m3678J());
        c3223uk.f29121w.setSelected(AbstractC3711yj.f33708x.m5753a(c3223uk.f29118t, Boolean.FALSE).booleanValue());
        c3223uk.m8090X(this.f18915K, 0, this);
        c3223uk.f29122x.setVisibility(8);
        c3223uk.m8093U(null);
        c3223uk.f29123y.setVisibility(8);
        TextView textView = c3223uk.f29124z;
        textView.setText(m16002Z(textView.getContext(), h60Var.f12079a));
        c3223uk.f29124z.setTextColor(this.f33717g);
        c3223uk.m8084d0(8);
        c3223uk.f29112B.setText("");
    }

    @Override // com.daaw.wc0
    /* renamed from: d */
    public ts1 mo2246d(Context context, String str) {
        C2298nk c2298nk = new C2298nk(context, str, new C2182a(str), mo3664p(str), tc1.m9332d("", str), 0, this.f33722l);
        c2298nk.mo3663q(this.f33713c);
        return c2298nk.m3680G(context, 0);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: g */
    public void mo2241g(C0645al c0645al, int i) {
        AbstractC2004l0[] abstractC2004l0Arr = this.f18916L;
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
        m16003Y((h60) m26095S().get(i), i, c3223uk);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: x */
    public void mo2230x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Stations_search);
        sd0VarArr[0] = m3678J();
    }
}
