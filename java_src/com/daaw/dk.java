package com.daaw;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.dk;
import com.daaw.gh0;
import com.daaw.hh0;
import com.daaw.ir1;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class dk extends n10<tx0, List<tx0>> {
    public l0[] K;

    /* loaded from: classes.dex */
    public class a extends hh0.a.AbstractC0052a {
        public a() {
        }

        @Override // com.daaw.hh0.a.AbstractC0052a
        public void c(Context context, Object obj, List<tx0> list) {
            list.add(((h) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class b extends gh0.f.a {
        public b() {
        }

        @Override // com.daaw.gh0.f.a
        public void c(Context context, Object obj, List<tx0> list) {
            tx0 tx0Var = ((h) obj).b;
            if (tx0Var == null) {
                return;
            }
            list.add(tx0Var);
        }
    }

    /* loaded from: classes.dex */
    public class c extends gh0.b.a {
        public c() {
        }

        @Override // com.daaw.gh0.b.a
        public void c(Context context, Object obj, List<tx0> list) {
            tx0 tx0Var = ((h) obj).b;
            if (tx0Var == null) {
                return;
            }
            list.add(tx0Var);
        }
    }

    /* loaded from: classes.dex */
    public class d extends gh0.c.a {
        public d() {
        }

        @Override // com.daaw.gh0.c.a
        public void c(Context context, Object obj, List<tx0> list) {
            tx0 tx0Var = ((h) obj).b;
            if (tx0Var == null) {
                return;
            }
            list.add(tx0Var);
        }
    }

    /* loaded from: classes.dex */
    public class e extends gh0.h.a {
        public e() {
        }

        @Override // com.daaw.gh0.h.a
        public void c(Context context, Object obj, List<tx0> list) {
            tx0 tx0Var = ((h) obj).b;
            if (tx0Var == null) {
                return;
            }
            list.add(tx0Var);
        }
    }

    /* loaded from: classes.dex */
    public class f extends gh0.j.a {
        public f() {
        }

        @Override // com.daaw.gh0.j.a
        public gh0.d c(Context context, Object obj) {
            tx0 tx0Var = ((h) obj).b;
            return tx0Var == null ? new gh0.d(null) : new gh0.d(tx0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class g implements r40<yj, List<tx0>> {
        public er0<tx0, pf1> a = null;
        public ak1<lo1<er0<tx0, pf1>, wf1>> b = new ak1<>();

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(yj yjVar, lo1 lo1Var, boolean z) {
            if (z) {
                return;
            }
            er0<tx0, pf1> er0Var = null;
            if (lo1Var != null) {
                er0<tx0, pf1> er0Var2 = (er0) lo1Var.a;
                if (((wf1) lo1Var.b).f()) {
                    yjVar.O(((wf1) lo1Var.b).e());
                } else {
                    yjVar.O(null);
                }
                er0Var = er0Var2;
            } else {
                yjVar.O(null);
            }
            if (er0Var == null) {
                er0Var = new er0<>();
            }
            this.a = er0Var;
            yjVar.A();
        }

        @Override // com.daaw.r40
        /* renamed from: d */
        public List<tx0> a(final yj yjVar) {
            if (this.a != null || this.b.e(null)) {
                if (this.a == null) {
                    return null;
                }
                yjVar.L(false);
                e(yjVar, this.a);
                return this.a.w();
            }
            yjVar.L(true);
            this.b.a();
            this.b.b(null, pe0.a().a(), new ir1.b() { // from class: com.daaw.ek
                @Override // com.daaw.ir1.b
                public final void a(Object obj, boolean z) {
                    dk.g.this.c(yjVar, (lo1) obj, z);
                }
            });
            return null;
        }

        public final void e(yj yjVar, er0<tx0, pf1> er0Var) {
            Comparator d = tf1.d(yj.s.a(Integer.valueOf(yjVar.I()), yjVar.J(), null), 10);
            if (d != null) {
                try {
                    Collections.sort(er0Var, d);
                } catch (Exception e) {
                    lz1.c("Comparator<Tuple2<PlaylistSong, StationEntry>> exception");
                    e.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public int a;
        public tx0 b;

        public h(tx0 tx0Var, int i) {
            this.a = i;
            this.b = tx0Var;
        }

        public boolean equals(Object obj) {
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public dk(Context context, String str, String str2, int i, int i2) {
        super(context, new g(), new f6(), str, new tr1(str2), i, new q91(context), i2);
        this.K = new l0[]{new a(), new b(), new c(), new d(), new e(), new f()};
    }

    @Override // com.daaw.yj
    public ts1 E(Context context, int i) {
        return new ts1(new d90(this, this, 14, 15), this);
    }

    @Override // com.daaw.yj
    public String H(int i) {
        return "";
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        return null;
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void g(al alVar, int i) {
    }

    @Override // com.daaw.ts1.a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.wc0
    public void o(Context context, String str) {
        W(context, str, new q91(context));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    @Override // com.daaw.ts1.a
    public void v(RecyclerView.c0 c0Var, int i) {
        tx0 tx0Var = (tx0) S().get(i);
        uk ukVar = (uk) c0Var;
        ukVar.v = i;
        qk.g0(this, new h(tx0Var, i), tx0Var, null, i, ukVar, this.K, 0, false, false);
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Stations_search);
        sd0VarArr[0] = J();
    }
}
