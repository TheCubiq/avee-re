package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.ih0;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
/* renamed from: com.daaw.lk */
/* loaded from: classes.dex */
public class C2051lk extends n10<sc1, List<sc1>> {

    /* renamed from: L */
    public static kw1<C3223uk, sc1, Boolean> f17485L = new kw1<>();

    /* renamed from: K */
    public AbstractC2004l0[] f17486K;

    /* renamed from: com.daaw.lk$a */
    /* loaded from: classes.dex */
    public class C2052a extends ih0.C1705a.AbstractC1707b {
        public C2052a() {
        }

        @Override // com.daaw.ih0.C1705a.AbstractC1707b
        /* renamed from: c */
        public ir1<List<tx0>> mo16894c(Context context, Object obj) {
            C2053b c2053b = (C2053b) obj;
            return tc1.m9331e().m11422j(c2053b.f17489b.m10459c(), c2053b.f17489b.m10458d());
        }
    }

    /* renamed from: com.daaw.lk$b */
    /* loaded from: classes.dex */
    public static class C2053b {

        /* renamed from: a */
        public int f17488a;

        /* renamed from: b */
        public sc1 f17489b;

        public C2053b(sc1 sc1Var, int i) {
            this.f17488a = i;
            this.f17489b = sc1Var;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2053b) && this.f17488a == ((C2053b) obj).f17488a;
        }

        public int hashCode() {
            return this.f17488a;
        }
    }

    public C2051lk(Context context, r40<AbstractC3711yj, List<sc1>> r40Var, String str, me0<String> me0Var, int i, int i2) {
        super(context, r40Var, new C1252f6(), str, me0Var, i, new r91(context), i2);
        this.f17486K = new AbstractC2004l0[]{new C2052a()};
    }

    /* renamed from: Y */
    public static /* synthetic */ void m16896Y(C3223uk c3223uk) {
    }

    /* renamed from: Z */
    public static void m16895Z(AbstractC3711yj abstractC3711yj, er0<tx0, sc1> er0Var) {
        Comparator m9203d = tf1.m9203d(AbstractC3711yj.f33703s.m4425a(Integer.valueOf(abstractC3711yj.m3679I()), abstractC3711yj.m3678J(), null), 10);
        if (m9203d != null) {
            try {
                Collections.sort(er0Var, m9203d);
            } catch (Exception unused) {
                lz1.m16363c("Comparator<Tuple2<PlaylistSong, StationEntry>> exception");
            }
        }
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
        m15602W(context, str, new r91(context));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: v */
    public void mo2231v(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        sc1 sc1Var = (sc1) m26095S().get(i);
        C3223uk c3223uk = (C3223uk) abstractC0376c0;
        c3223uk.f29120v = i;
        vw1<Boolean> vw1Var = AbstractC3711yj.f33701q;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = vw1Var.m6692a(bool).booleanValue();
        c3223uk.m8086b0(this, new C2053b(sc1Var, i), m3678J());
        c3223uk.f29119u = sc1Var.f22890b;
        c3223uk.f29121w.setSelected(AbstractC3711yj.f33708x.m5753a(c3223uk.f29118t, bool).booleanValue());
        c3223uk.m8089Y(this.f17486K, 0, this, false, false, new InterfaceC1153e0() { // from class: com.daaw.kk
            @Override // com.daaw.InterfaceC1153e0
            /* renamed from: a */
            public final void mo7884a(Object obj) {
                C2051lk.m16896Y((C3223uk) obj);
            }
        });
        TextView textView = c3223uk.f29123y;
        if (booleanValue) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            c3223uk.f29123y.setText(String.format(Locale.getDefault(), "%d.", Integer.valueOf(1 + i)));
        }
        c3223uk.f29122x.setVisibility(0);
        c3223uk.m8092V(-1);
        C1652i2 c1652i2 = new C1652i2(Uri.parse(sc1Var.f22890b), "abc", sc1Var.f22889a);
        new C1354g2().m22069t(c1652i2.f13192a, c1652i2.f13193b, c1652i2.f13194c, c3223uk.f29122x, true);
        c3223uk.f29124z.setText(sc1Var.f22889a);
        c3223uk.m8084d0(0);
        c3223uk.m8085c0(sc1Var.m10460b());
        c3223uk.f29112B.setText("");
        c3223uk.m8096R();
        f17485L.m17382a(c3223uk, sc1Var, Boolean.valueOf(booleanValue));
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: x */
    public void mo2230x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Stations_search);
        sd0VarArr[0] = m3678J();
    }
}
