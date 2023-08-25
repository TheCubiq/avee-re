package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.er0;
import com.daaw.fh0;
import com.daaw.gh0;
import com.daaw.tx0;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.daaw.qk */
/* loaded from: classes.dex */
public class C2719qk extends n10<lo1<tx0, vd0>, er0<tx0, vd0>> {

    /* renamed from: O */
    public static kw1<C3223uk, tx0.C3143b, Boolean> f24075O = new kw1<>();

    /* renamed from: P */
    public static Handler f24076P = new Handler(Looper.getMainLooper());

    /* renamed from: K */
    public final boolean f24077K;

    /* renamed from: L */
    public AbstractC2004l0[] f24078L;

    /* renamed from: M */
    public AbstractC2004l0[] f24079M;

    /* renamed from: N */
    public AbstractC2004l0[] f24080N;

    /* renamed from: com.daaw.qk$a */
    /* loaded from: classes.dex */
    public class C2720a extends fh0.C1281a.AbstractC1282a {
        public C2720a() {
        }

        @Override // com.daaw.fh0.C1281a.AbstractC1282a
        /* renamed from: c */
        public vd0 mo12372c(Context context, Object obj) {
            C2738s c2738s = (C2738s) obj;
            if (c2738s.f24101c == null) {
                lz1.m16363c("ThisItemIdentifier is null, in Queue");
            }
            return c2738s.f24101c;
        }
    }

    /* renamed from: com.daaw.qk$b */
    /* loaded from: classes.dex */
    public class C2721b extends gh0.C1411f.AbstractC1412a {
        public C2721b() {
        }

        @Override // com.daaw.gh0.C1411f.AbstractC1412a
        /* renamed from: c */
        public void mo2217c(Context context, Object obj, List<tx0> list) {
            list.add(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$c */
    /* loaded from: classes.dex */
    public class C2722c extends gh0.C1404b.AbstractC1405a {
        public C2722c() {
        }

        @Override // com.daaw.gh0.C1404b.AbstractC1405a
        /* renamed from: c */
        public void mo2216c(Context context, Object obj, List<tx0> list) {
            list.add(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$d */
    /* loaded from: classes.dex */
    public class C2723d extends gh0.C1406c.AbstractC1407a {
        public C2723d() {
        }

        @Override // com.daaw.gh0.C1406c.AbstractC1407a
        /* renamed from: c */
        public void mo2221c(Context context, Object obj, List<tx0> list) {
            list.add(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$e */
    /* loaded from: classes.dex */
    public class C2724e extends gh0.C1415h.AbstractC1416a {
        public C2724e() {
        }

        @Override // com.daaw.gh0.C1415h.AbstractC1416a
        /* renamed from: c */
        public void mo2220c(Context context, Object obj, List<tx0> list) {
            list.add(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$f */
    /* loaded from: classes.dex */
    public class C2725f extends fh0.C1283b.AbstractC1284a {
        public C2725f() {
        }

        @Override // com.daaw.fh0.C1283b.AbstractC1284a
        /* renamed from: c */
        public void mo12371c(Context context, Object obj, List<Integer> list, List<vd0> list2) {
            C2738s c2738s = (C2738s) obj;
            list.add(Integer.valueOf(c2738s.f24099a));
            list2.add(c2738s.f24101c);
        }
    }

    /* renamed from: com.daaw.qk$g */
    /* loaded from: classes.dex */
    public class C2726g extends fh0.C1285c.AbstractC1286a {
        public C2726g() {
        }
    }

    /* renamed from: com.daaw.qk$h */
    /* loaded from: classes.dex */
    public class C2727h extends gh0.C1419j.AbstractC1420a {
        public C2727h() {
        }

        @Override // com.daaw.gh0.C1419j.AbstractC1420a
        /* renamed from: c */
        public gh0.C1408d mo2229c(Context context, Object obj) {
            return new gh0.C1408d(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$i */
    /* loaded from: classes.dex */
    public class C2728i extends gh0.C1417i.AbstractC1418a {
        public C2728i() {
        }

        @Override // com.daaw.gh0.C1417i.AbstractC1418a
        /* renamed from: c */
        public void mo2228c(Context context, Object obj, List<tx0> list) {
            list.add(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$j */
    /* loaded from: classes.dex */
    public class C2729j extends gh0.C1409e.AbstractC1410a {
        public C2729j() {
        }

        @Override // com.daaw.gh0.C1409e.AbstractC1410a
        /* renamed from: c */
        public mo1<Integer, be0, Boolean> mo2218c(Context context, Object obj, List<tx0> list, be0 be0Var, er0<tx0, vd0> er0Var) {
            C2738s c2738s = (C2738s) obj;
            be0 be0Var2 = (be0) C2719qk.this.m3678J();
            if (be0Var != null && be0Var.equals(C2719qk.this.m3678J())) {
                int i = c2738s.f24099a;
                tx0 tx0Var = null;
                tx0 tx0Var2 = (i < 0 || i >= ((er0) C2719qk.this.m26095S()).size()) ? null : (tx0) ((er0) C2719qk.this.m26095S()).m23268o(c2738s.f24099a);
                int i2 = c2738s.f24099a;
                if (i2 >= 0 && i2 < er0Var.size()) {
                    tx0Var = er0Var.m23268o(c2738s.f24099a);
                }
                if (tx0Var2 != null && tx0Var2.equals(tx0Var)) {
                    return new mo1<>(Integer.valueOf(c2738s.f24099a), be0Var2, Boolean.TRUE);
                }
            }
            Iterator it = ((er0) C2719qk.this.m26095S()).iterator();
            while (it.hasNext()) {
                list.add((tx0) ((lo1) it.next()).f17576a);
            }
            return new mo1<>(Integer.valueOf(c2738s.f24099a), be0Var2, Boolean.FALSE);
        }
    }

    /* renamed from: com.daaw.qk$k */
    /* loaded from: classes.dex */
    public class C2730k extends gh0.C1411f.AbstractC1412a {
        public C2730k() {
        }

        @Override // com.daaw.gh0.C1411f.AbstractC1412a
        /* renamed from: c */
        public void mo2217c(Context context, Object obj, List<tx0> list) {
            list.add(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$l */
    /* loaded from: classes.dex */
    public class C2731l extends gh0.C1404b.AbstractC1405a {
        public C2731l() {
        }

        @Override // com.daaw.gh0.C1404b.AbstractC1405a
        /* renamed from: c */
        public void mo2216c(Context context, Object obj, List<tx0> list) {
            list.add(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$m */
    /* loaded from: classes.dex */
    public class C2732m extends gh0.C1406c.AbstractC1407a {
        public C2732m() {
        }

        @Override // com.daaw.gh0.C1406c.AbstractC1407a
        /* renamed from: c */
        public void mo2221c(Context context, Object obj, List<tx0> list) {
            list.add(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$n */
    /* loaded from: classes.dex */
    public class C2733n extends gh0.C1415h.AbstractC1416a {
        public C2733n() {
        }

        @Override // com.daaw.gh0.C1415h.AbstractC1416a
        /* renamed from: c */
        public void mo2220c(Context context, Object obj, List<tx0> list) {
            list.add(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$o */
    /* loaded from: classes.dex */
    public class C2734o extends gh0.C1419j.AbstractC1420a {
        public C2734o() {
        }

        @Override // com.daaw.gh0.C1419j.AbstractC1420a
        /* renamed from: c */
        public gh0.C1408d mo2229c(Context context, Object obj) {
            return new gh0.C1408d(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$p */
    /* loaded from: classes.dex */
    public class C2735p extends gh0.C1417i.AbstractC1418a {
        public C2735p() {
        }

        @Override // com.daaw.gh0.C1417i.AbstractC1418a
        /* renamed from: c */
        public void mo2228c(Context context, Object obj, List<tx0> list) {
            list.add(((C2738s) obj).f24100b);
        }
    }

    /* renamed from: com.daaw.qk$q */
    /* loaded from: classes.dex */
    public class C2736q extends gh0.C1409e.AbstractC1410a {
        public C2736q() {
        }

        @Override // com.daaw.gh0.C1409e.AbstractC1410a
        /* renamed from: c */
        public mo1<Integer, be0, Boolean> mo2218c(Context context, Object obj, List<tx0> list, be0 be0Var, er0<tx0, vd0> er0Var) {
            be0 be0Var2 = (be0) C2719qk.this.m3678J();
            Iterator it = ((er0) C2719qk.this.m26095S()).iterator();
            while (it.hasNext()) {
                list.add((tx0) ((lo1) it.next()).f17576a);
            }
            return new mo1<>(0, be0Var2, Boolean.FALSE);
        }
    }

    /* renamed from: com.daaw.qk$r */
    /* loaded from: classes.dex */
    public class C2737r extends gh0.C1402a.AbstractC1403a {
        public C2737r() {
        }

        @Override // com.daaw.gh0.C1402a.AbstractC1403a
        /* renamed from: c */
        public void mo2227c(Context context, Object obj, List<tx0> list) {
            Iterator it = ((er0) C2719qk.this.m26095S()).iterator();
            while (it.hasNext()) {
                list.add((tx0) ((lo1) it.next()).f17576a);
            }
        }
    }

    /* renamed from: com.daaw.qk$s */
    /* loaded from: classes.dex */
    public static class C2738s {

        /* renamed from: a */
        public final int f24099a;

        /* renamed from: b */
        public final tx0 f24100b;

        /* renamed from: c */
        public vd0 f24101c;

        public C2738s(tx0 tx0Var, vd0 vd0Var, int i) {
            this.f24100b = tx0Var;
            this.f24101c = vd0Var;
            this.f24099a = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2738s) && this.f24099a == ((C2738s) obj).f24099a;
        }

        public int hashCode() {
            return this.f24099a;
        }
    }

    public C2719qk(Context context, r40<AbstractC3711yj, er0<tx0, vd0>> r40Var, String str, String str2, int i, int i2, boolean z) {
        super(context, r40Var, new er0.C1213a(), str, new tr1(str2), i, new o91(context), i2);
        this.f24078L = new AbstractC2004l0[]{new C2729j(), new C2730k(), new C2731l(), new C2732m(), new C2733n(), new C2734o(), new C2735p()};
        this.f24079M = new AbstractC2004l0[]{new C2736q(), new C2737r()};
        this.f24080N = new AbstractC2004l0[]{new C2720a(), new C2721b(), new C2722c(), new C2723d(), new C2724e(), new C2725f(), new C2726g(), new C2727h(), new C2728i()};
        this.f24077K = z;
    }

    public C2719qk(Context context, r40<AbstractC3711yj, er0<tx0, vd0>> r40Var, String str, String str2, boolean z, int i) {
        super(context, r40Var, new er0.C1213a(), str, new tr1(str2), 0, new o91(context), i);
        this.f24078L = new AbstractC2004l0[]{new C2729j(), new C2730k(), new C2731l(), new C2732m(), new C2733n(), new C2734o(), new C2735p()};
        this.f24079M = new AbstractC2004l0[]{new C2736q(), new C2737r()};
        this.f24080N = new AbstractC2004l0[]{new C2720a(), new C2721b(), new C2722c(), new C2723d(), new C2724e(), new C2725f(), new C2726g(), new C2727h(), new C2728i()};
        this.f24077K = z;
    }

    /* renamed from: f0 */
    public static void m12376f0(AbstractC3711yj abstractC3711yj, Object obj, tx0 tx0Var, vd0 vd0Var, int i, C3223uk c3223uk, AbstractC2004l0[] abstractC2004l0Arr, int i2) {
        m12375g0(abstractC3711yj, obj, tx0Var, vd0Var, i, c3223uk, abstractC2004l0Arr, i2, false, false);
    }

    /* renamed from: g0 */
    public static void m12375g0(AbstractC3711yj abstractC3711yj, Object obj, final tx0 tx0Var, final vd0 vd0Var, int i, final C3223uk c3223uk, AbstractC2004l0[] abstractC2004l0Arr, int i2, final boolean z, boolean z2) {
        vw1<Boolean> vw1Var = AbstractC3711yj.f33701q;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = vw1Var.m6692a(bool).booleanValue();
        c3223uk.m8086b0(abstractC3711yj, obj, abstractC3711yj.m3678J());
        c3223uk.f29119u = tx0Var.m8745g();
        c3223uk.f29121w.setSelected(AbstractC3711yj.f33708x.m5753a(c3223uk.f29118t, bool).booleanValue());
        c3223uk.m8089Y(abstractC2004l0Arr, i2, abstractC3711yj, z, z2, new InterfaceC1153e0() { // from class: com.daaw.ok
            @Override // com.daaw.InterfaceC1153e0
            /* renamed from: a */
            public final void mo7884a(Object obj2) {
                C2719qk.m12374h0(z, c3223uk, vd0Var, tx0Var, (C3223uk) obj2);
            }
        });
        if (z2) {
            c3223uk.m8094T(R.drawable.ic_feather);
        }
        TextView textView = c3223uk.f29123y;
        if (booleanValue) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            c3223uk.f29123y.setText(String.format("%d.", Integer.valueOf(1 + i)));
        }
        c3223uk.m8096R();
        tx0.C3143b m8743i = tx0Var.m8743i(f24076P, new tx0.InterfaceC3145d() { // from class: com.daaw.pk
            @Override // com.daaw.tx0.InterfaceC3145d
            /* renamed from: a */
            public final void mo8722a(tx0.C3143b c3143b, Object obj2, Object obj3) {
                C2719qk.m12373i0(C3223uk.this, c3143b, obj2, obj3);
            }
        }, c3223uk, c3223uk.f29119u);
        if (m8743i != tx0.f28188h) {
            f24075O.m17382a(c3223uk, m8743i, Boolean.valueOf(booleanValue));
            return;
        }
        ImageView imageView = c3223uk.f29122x;
        if (booleanValue) {
            imageView.setVisibility(0);
            c3223uk.m8092V(-1);
            c3223uk.m8091W(R.drawable.placeholderart4);
        } else {
            imageView.setVisibility(8);
            c3223uk.m8093U(null);
        }
        c3223uk.f29124z.setText("...");
        c3223uk.m8084d0(8);
        c3223uk.f29112B.setText("");
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m12374h0(boolean z, C3223uk c3223uk, vd0 vd0Var, tx0 tx0Var, C3223uk c3223uk2) {
        if (!z) {
            c3223uk.f29121w.setActivated(ww0.f31595b.m8748d(tx0Var));
            return;
        }
        vd0 vd0Var2 = ww0.f31596c;
        c3223uk.f29121w.setActivated(vd0Var2 != null && vd0Var2.equals(vd0Var));
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m12373i0(C3223uk c3223uk, tx0.C3143b c3143b, Object obj, Object obj2) {
        boolean booleanValue = AbstractC3711yj.f33701q.m6692a(Boolean.FALSE).booleanValue();
        C3223uk c3223uk2 = (C3223uk) obj;
        Object obj3 = c3223uk.f29119u;
        if (obj3 == null || !obj3.equals(obj2)) {
            return;
        }
        f24075O.m17382a(c3223uk2, c3143b, Boolean.valueOf(booleanValue));
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: E */
    public ts1 mo2263E(Context context, int i) {
        if (i == 0) {
            return new ts1(new d90(this, this, 10, 1), this);
        }
        if (i == 1) {
            return new ts1(new d90(this, this, 4, 13), this);
        }
        C2691q6.m12748j();
        return null;
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

    /* renamed from: e0 */
    public int m12377e0(vd0 vd0Var) {
        er0 er0Var = (er0) m26095S();
        for (int i = 0; i < er0Var.size(); i++) {
            if (((vd0) er0Var.m23267p(i)).equals(vd0Var)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: g */
    public void mo2241g(C0645al c0645al, int i) {
        AbstractC2004l0[] abstractC2004l0Arr = this.f24079M;
        if (i < abstractC2004l0Arr.length) {
            abstractC2004l0Arr[i].m17274a(c0645al, null);
        }
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.bk0, com.daaw.ts1.InterfaceC3115a
    /* renamed from: j */
    public void mo2237j(int i, int i2, List<Integer> list) {
        AbstractC3711yj.f33707w.m9795a(Integer.valueOf(i), Integer.valueOf(i2), list);
    }

    @Override // com.daaw.wc0
    /* renamed from: o */
    public void mo2234o(Context context, String str) {
        m15602W(context, str, new o91(context));
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: v */
    public void mo2231v(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        lo1 lo1Var = ((er0) m26095S()).get(i);
        C3223uk c3223uk = (C3223uk) abstractC0376c0;
        c3223uk.f29120v = i;
        if (this.f24077K) {
            m12375g0(this, new C2738s((tx0) lo1Var.f17576a, (vd0) lo1Var.f17577b, i), (tx0) lo1Var.f17576a, (vd0) lo1Var.f17577b, ((vd0) ((er0) m26095S()).m23267p(i)).mo7247a(), c3223uk, this.f24080N, 0, true, ((vd0) ((er0) m26095S()).m23267p(i)).mo7245c() == -1);
        } else {
            m12375g0(this, new C2738s((tx0) lo1Var.f17576a, (vd0) lo1Var.f17577b, i), (tx0) lo1Var.f17576a, null, i, c3223uk, this.f24078L, 0, false, false);
        }
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: x */
    public void mo2230x(Context context, String[] strArr, sd0[] sd0VarArr) {
        boolean z = this.f24077K;
        Resources resources = context.getResources();
        if (z) {
            strArr[0] = resources.getString(R.string.libContainer_Queue_search);
        } else {
            strArr[0] = resources.getString(R.string.libContainer_Songs_search);
        }
        sd0VarArr[0] = m3678J();
    }
}
