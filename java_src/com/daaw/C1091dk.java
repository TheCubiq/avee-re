package com.daaw;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C1091dk;
import com.daaw.avee.R;
import com.daaw.gh0;
import com.daaw.hh0;
import com.daaw.ir1;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* renamed from: com.daaw.dk */
/* loaded from: classes.dex */
public class C1091dk extends n10<tx0, List<tx0>> {

    /* renamed from: K */
    public AbstractC2004l0[] f7202K;

    /* renamed from: com.daaw.dk$a */
    /* loaded from: classes.dex */
    public class C1092a extends hh0.C1536a.AbstractC1537a {
        public C1092a() {
        }

        @Override // com.daaw.hh0.C1536a.AbstractC1537a
        /* renamed from: c */
        public void mo20798c(Context context, Object obj, List<tx0> list) {
            list.add(((C1099h) obj).f7212b);
        }
    }

    /* renamed from: com.daaw.dk$b */
    /* loaded from: classes.dex */
    public class C1093b extends gh0.C1411f.AbstractC1412a {
        public C1093b() {
        }

        @Override // com.daaw.gh0.C1411f.AbstractC1412a
        /* renamed from: c */
        public void mo2217c(Context context, Object obj, List<tx0> list) {
            tx0 tx0Var = ((C1099h) obj).f7212b;
            if (tx0Var == null) {
                return;
            }
            list.add(tx0Var);
        }
    }

    /* renamed from: com.daaw.dk$c */
    /* loaded from: classes.dex */
    public class C1094c extends gh0.C1404b.AbstractC1405a {
        public C1094c() {
        }

        @Override // com.daaw.gh0.C1404b.AbstractC1405a
        /* renamed from: c */
        public void mo2216c(Context context, Object obj, List<tx0> list) {
            tx0 tx0Var = ((C1099h) obj).f7212b;
            if (tx0Var == null) {
                return;
            }
            list.add(tx0Var);
        }
    }

    /* renamed from: com.daaw.dk$d */
    /* loaded from: classes.dex */
    public class C1095d extends gh0.C1406c.AbstractC1407a {
        public C1095d() {
        }

        @Override // com.daaw.gh0.C1406c.AbstractC1407a
        /* renamed from: c */
        public void mo2221c(Context context, Object obj, List<tx0> list) {
            tx0 tx0Var = ((C1099h) obj).f7212b;
            if (tx0Var == null) {
                return;
            }
            list.add(tx0Var);
        }
    }

    /* renamed from: com.daaw.dk$e */
    /* loaded from: classes.dex */
    public class C1096e extends gh0.C1415h.AbstractC1416a {
        public C1096e() {
        }

        @Override // com.daaw.gh0.C1415h.AbstractC1416a
        /* renamed from: c */
        public void mo2220c(Context context, Object obj, List<tx0> list) {
            tx0 tx0Var = ((C1099h) obj).f7212b;
            if (tx0Var == null) {
                return;
            }
            list.add(tx0Var);
        }
    }

    /* renamed from: com.daaw.dk$f */
    /* loaded from: classes.dex */
    public class C1097f extends gh0.C1419j.AbstractC1420a {
        public C1097f() {
        }

        @Override // com.daaw.gh0.C1419j.AbstractC1420a
        /* renamed from: c */
        public gh0.C1408d mo2229c(Context context, Object obj) {
            tx0 tx0Var = ((C1099h) obj).f7212b;
            return tx0Var == null ? new gh0.C1408d(null) : new gh0.C1408d(tx0Var);
        }
    }

    /* renamed from: com.daaw.dk$g */
    /* loaded from: classes.dex */
    public static class C1098g implements r40<AbstractC3711yj, List<tx0>> {

        /* renamed from: a */
        public er0<tx0, pf1> f7209a = null;

        /* renamed from: b */
        public ak1<lo1<er0<tx0, pf1>, wf1>> f7210b = new ak1<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m24311c(AbstractC3711yj abstractC3711yj, lo1 lo1Var, boolean z) {
            if (z) {
                return;
            }
            er0<tx0, pf1> er0Var = null;
            if (lo1Var != null) {
                er0<tx0, pf1> er0Var2 = (er0) lo1Var.f17576a;
                if (((wf1) lo1Var.f17577b).m6091f()) {
                    abstractC3711yj.m3673O(((wf1) lo1Var.f17577b).m6092e());
                } else {
                    abstractC3711yj.m3673O(null);
                }
                er0Var = er0Var2;
            } else {
                abstractC3711yj.m3673O(null);
            }
            if (er0Var == null) {
                er0Var = new er0<>();
            }
            this.f7209a = er0Var;
            abstractC3711yj.mo2264A();
        }

        @Override // com.daaw.r40
        /* renamed from: d */
        public List<tx0> mo5050a(final AbstractC3711yj abstractC3711yj) {
            if (this.f7209a != null || this.f7210b.m27390e(null)) {
                if (this.f7209a == null) {
                    return null;
                }
                abstractC3711yj.m3676L(false);
                m24309e(abstractC3711yj, this.f7209a);
                return this.f7209a.m23260w();
            }
            abstractC3711yj.m3676L(true);
            this.f7210b.m27394a();
            this.f7210b.m27393b(null, pe0.m13430a().m14325a(), new ir1.InterfaceC1750b() { // from class: com.daaw.ek
                @Override // com.daaw.ir1.InterfaceC1750b
                /* renamed from: a */
                public final void mo15140a(Object obj, boolean z) {
                    C1091dk.C1098g.this.m24311c(abstractC3711yj, (lo1) obj, z);
                }
            });
            return null;
        }

        /* renamed from: e */
        public final void m24309e(AbstractC3711yj abstractC3711yj, er0<tx0, pf1> er0Var) {
            Comparator m9203d = tf1.m9203d(AbstractC3711yj.f33703s.m4425a(Integer.valueOf(abstractC3711yj.m3679I()), abstractC3711yj.m3678J(), null), 10);
            if (m9203d != null) {
                try {
                    Collections.sort(er0Var, m9203d);
                } catch (Exception e) {
                    lz1.m16363c("Comparator<Tuple2<PlaylistSong, StationEntry>> exception");
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.daaw.dk$h */
    /* loaded from: classes.dex */
    public static class C1099h {

        /* renamed from: a */
        public int f7211a;

        /* renamed from: b */
        public tx0 f7212b;

        public C1099h(tx0 tx0Var, int i) {
            this.f7211a = i;
            this.f7212b = tx0Var;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1099h) && this.f7211a == ((C1099h) obj).f7211a;
        }

        public int hashCode() {
            return this.f7211a;
        }
    }

    public C1091dk(Context context, String str, String str2, int i, int i2) {
        super(context, new C1098g(), new C1252f6(), str, new tr1(str2), i, new q91(context), i2);
        this.f7202K = new AbstractC2004l0[]{new C1092a(), new C1093b(), new C1094c(), new C1095d(), new C1096e(), new C1097f()};
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: E */
    public ts1 mo2263E(Context context, int i) {
        return new ts1(new d90(this, this, 14, 15), this);
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: H */
    public String mo2262H(int i) {
        return "";
    }

    @Override // com.daaw.wc0
    /* renamed from: d */
    public ts1 mo2246d(Context context, String str) {
        return null;
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: g */
    public void mo2241g(C0645al c0645al, int i) {
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.wc0
    /* renamed from: o */
    public void mo2234o(Context context, String str) {
        m15602W(context, str, new q91(context));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: v */
    public void mo2231v(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        tx0 tx0Var = (tx0) m26095S().get(i);
        C3223uk c3223uk = (C3223uk) abstractC0376c0;
        c3223uk.f29120v = i;
        C2719qk.m12375g0(this, new C1099h(tx0Var, i), tx0Var, null, i, c3223uk, this.f7202K, 0, false, false);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: x */
    public void mo2230x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Stations_search);
        sd0VarArr[0] = m3678J();
    }
}
