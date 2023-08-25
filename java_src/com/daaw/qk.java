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
/* loaded from: classes.dex */
public class qk extends n10<lo1<tx0, vd0>, er0<tx0, vd0>> {
    public static kw1<uk, tx0.b, Boolean> O = new kw1<>();
    public static Handler P = new Handler(Looper.getMainLooper());
    public final boolean K;
    public l0[] L;
    public l0[] M;
    public l0[] N;

    /* loaded from: classes.dex */
    public class a extends fh0.a.AbstractC0050a {
        public a() {
        }

        @Override // com.daaw.fh0.a.AbstractC0050a
        public vd0 c(Context context, Object obj) {
            s sVar = (s) obj;
            if (sVar.c == null) {
                lz1.c("ThisItemIdentifier is null, in Queue");
            }
            return sVar.c;
        }
    }

    /* loaded from: classes.dex */
    public class b extends gh0.f.a {
        public b() {
        }

        @Override // com.daaw.gh0.f.a
        public void c(Context context, Object obj, List<tx0> list) {
            list.add(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class c extends gh0.b.a {
        public c() {
        }

        @Override // com.daaw.gh0.b.a
        public void c(Context context, Object obj, List<tx0> list) {
            list.add(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class d extends gh0.c.a {
        public d() {
        }

        @Override // com.daaw.gh0.c.a
        public void c(Context context, Object obj, List<tx0> list) {
            list.add(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class e extends gh0.h.a {
        public e() {
        }

        @Override // com.daaw.gh0.h.a
        public void c(Context context, Object obj, List<tx0> list) {
            list.add(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class f extends fh0.b.a {
        public f() {
        }

        @Override // com.daaw.fh0.b.a
        public void c(Context context, Object obj, List<Integer> list, List<vd0> list2) {
            s sVar = (s) obj;
            list.add(Integer.valueOf(sVar.a));
            list2.add(sVar.c);
        }
    }

    /* loaded from: classes.dex */
    public class g extends fh0.c.a {
        public g() {
        }
    }

    /* loaded from: classes.dex */
    public class h extends gh0.j.a {
        public h() {
        }

        @Override // com.daaw.gh0.j.a
        public gh0.d c(Context context, Object obj) {
            return new gh0.d(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class i extends gh0.i.a {
        public i() {
        }

        @Override // com.daaw.gh0.i.a
        public void c(Context context, Object obj, List<tx0> list) {
            list.add(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class j extends gh0.e.a {
        public j() {
        }

        @Override // com.daaw.gh0.e.a
        public mo1<Integer, be0, Boolean> c(Context context, Object obj, List<tx0> list, be0 be0Var, er0<tx0, vd0> er0Var) {
            s sVar = (s) obj;
            be0 be0Var2 = (be0) qk.this.J();
            if (be0Var != null && be0Var.equals(qk.this.J())) {
                int i = sVar.a;
                tx0 tx0Var = null;
                tx0 tx0Var2 = (i < 0 || i >= ((er0) qk.this.S()).size()) ? null : (tx0) ((er0) qk.this.S()).o(sVar.a);
                int i2 = sVar.a;
                if (i2 >= 0 && i2 < er0Var.size()) {
                    tx0Var = er0Var.o(sVar.a);
                }
                if (tx0Var2 != null && tx0Var2.equals(tx0Var)) {
                    return new mo1<>(Integer.valueOf(sVar.a), be0Var2, Boolean.TRUE);
                }
            }
            Iterator it = ((er0) qk.this.S()).iterator();
            while (it.hasNext()) {
                list.add((tx0) ((lo1) it.next()).a);
            }
            return new mo1<>(Integer.valueOf(sVar.a), be0Var2, Boolean.FALSE);
        }
    }

    /* loaded from: classes.dex */
    public class k extends gh0.f.a {
        public k() {
        }

        @Override // com.daaw.gh0.f.a
        public void c(Context context, Object obj, List<tx0> list) {
            list.add(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class l extends gh0.b.a {
        public l() {
        }

        @Override // com.daaw.gh0.b.a
        public void c(Context context, Object obj, List<tx0> list) {
            list.add(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class m extends gh0.c.a {
        public m() {
        }

        @Override // com.daaw.gh0.c.a
        public void c(Context context, Object obj, List<tx0> list) {
            list.add(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class n extends gh0.h.a {
        public n() {
        }

        @Override // com.daaw.gh0.h.a
        public void c(Context context, Object obj, List<tx0> list) {
            list.add(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class o extends gh0.j.a {
        public o() {
        }

        @Override // com.daaw.gh0.j.a
        public gh0.d c(Context context, Object obj) {
            return new gh0.d(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class p extends gh0.i.a {
        public p() {
        }

        @Override // com.daaw.gh0.i.a
        public void c(Context context, Object obj, List<tx0> list) {
            list.add(((s) obj).b);
        }
    }

    /* loaded from: classes.dex */
    public class q extends gh0.e.a {
        public q() {
        }

        @Override // com.daaw.gh0.e.a
        public mo1<Integer, be0, Boolean> c(Context context, Object obj, List<tx0> list, be0 be0Var, er0<tx0, vd0> er0Var) {
            be0 be0Var2 = (be0) qk.this.J();
            Iterator it = ((er0) qk.this.S()).iterator();
            while (it.hasNext()) {
                list.add((tx0) ((lo1) it.next()).a);
            }
            return new mo1<>(0, be0Var2, Boolean.FALSE);
        }
    }

    /* loaded from: classes.dex */
    public class r extends gh0.a.AbstractC0051a {
        public r() {
        }

        @Override // com.daaw.gh0.a.AbstractC0051a
        public void c(Context context, Object obj, List<tx0> list) {
            Iterator it = ((er0) qk.this.S()).iterator();
            while (it.hasNext()) {
                list.add((tx0) ((lo1) it.next()).a);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class s {
        public final int a;
        public final tx0 b;
        public vd0 c;

        public s(tx0 tx0Var, vd0 vd0Var, int i) {
            this.b = tx0Var;
            this.c = vd0Var;
            this.a = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof s) && this.a == ((s) obj).a;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public qk(Context context, r40<yj, er0<tx0, vd0>> r40Var, String str, String str2, int i2, int i3, boolean z) {
        super(context, r40Var, new er0.a(), str, new tr1(str2), i2, new o91(context), i3);
        this.L = new l0[]{new j(), new k(), new l(), new m(), new n(), new o(), new p()};
        this.M = new l0[]{new q(), new r()};
        this.N = new l0[]{new a(), new b(), new c(), new d(), new e(), new f(), new g(), new h(), new i()};
        this.K = z;
    }

    public qk(Context context, r40<yj, er0<tx0, vd0>> r40Var, String str, String str2, boolean z, int i2) {
        super(context, r40Var, new er0.a(), str, new tr1(str2), 0, new o91(context), i2);
        this.L = new l0[]{new j(), new k(), new l(), new m(), new n(), new o(), new p()};
        this.M = new l0[]{new q(), new r()};
        this.N = new l0[]{new a(), new b(), new c(), new d(), new e(), new f(), new g(), new h(), new i()};
        this.K = z;
    }

    public static void f0(yj yjVar, Object obj, tx0 tx0Var, vd0 vd0Var, int i2, uk ukVar, l0[] l0VarArr, int i3) {
        g0(yjVar, obj, tx0Var, vd0Var, i2, ukVar, l0VarArr, i3, false, false);
    }

    public static void g0(yj yjVar, Object obj, final tx0 tx0Var, final vd0 vd0Var, int i2, final uk ukVar, l0[] l0VarArr, int i3, final boolean z, boolean z2) {
        vw1<Boolean> vw1Var = yj.q;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = vw1Var.a(bool).booleanValue();
        ukVar.b0(yjVar, obj, yjVar.J());
        ukVar.u = tx0Var.g();
        ukVar.w.setSelected(yj.x.a(ukVar.t, bool).booleanValue());
        ukVar.Y(l0VarArr, i3, yjVar, z, z2, new e0() { // from class: com.daaw.ok
            @Override // com.daaw.e0
            public final void a(Object obj2) {
                qk.h0(z, ukVar, vd0Var, tx0Var, (uk) obj2);
            }
        });
        if (z2) {
            ukVar.T(R.drawable.ic_feather);
        }
        TextView textView = ukVar.y;
        if (booleanValue) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            ukVar.y.setText(String.format("%d.", Integer.valueOf(1 + i2)));
        }
        ukVar.R();
        tx0.b i4 = tx0Var.i(P, new tx0.d() { // from class: com.daaw.pk
            @Override // com.daaw.tx0.d
            public final void a(tx0.b bVar, Object obj2, Object obj3) {
                qk.i0(uk.this, bVar, obj2, obj3);
            }
        }, ukVar, ukVar.u);
        if (i4 != tx0.h) {
            O.a(ukVar, i4, Boolean.valueOf(booleanValue));
            return;
        }
        ImageView imageView = ukVar.x;
        if (booleanValue) {
            imageView.setVisibility(0);
            ukVar.V(-1);
            ukVar.W(R.drawable.placeholderart4);
        } else {
            imageView.setVisibility(8);
            ukVar.U(null);
        }
        ukVar.z.setText("...");
        ukVar.d0(8);
        ukVar.B.setText("");
    }

    public static /* synthetic */ void h0(boolean z, uk ukVar, vd0 vd0Var, tx0 tx0Var, uk ukVar2) {
        if (!z) {
            ukVar.w.setActivated(ww0.b.d(tx0Var));
            return;
        }
        vd0 vd0Var2 = ww0.c;
        ukVar.w.setActivated(vd0Var2 != null && vd0Var2.equals(vd0Var));
    }

    public static /* synthetic */ void i0(uk ukVar, tx0.b bVar, Object obj, Object obj2) {
        boolean booleanValue = yj.q.a(Boolean.FALSE).booleanValue();
        uk ukVar2 = (uk) obj;
        Object obj3 = ukVar.u;
        if (obj3 == null || !obj3.equals(obj2)) {
            return;
        }
        O.a(ukVar2, bVar, Boolean.valueOf(booleanValue));
    }

    @Override // com.daaw.yj
    public ts1 E(Context context, int i2) {
        if (i2 == 0) {
            return new ts1(new d90(this, this, 10, 1), this);
        }
        if (i2 == 1) {
            return new ts1(new d90(this, this, 4, 13), this);
        }
        q6.j();
        return null;
    }

    @Override // com.daaw.yj
    public String H(int i2) {
        return "";
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        return null;
    }

    public int e0(vd0 vd0Var) {
        er0 er0Var = (er0) S();
        for (int i2 = 0; i2 < er0Var.size(); i2++) {
            if (((vd0) er0Var.p(i2)).equals(vd0Var)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void g(al alVar, int i2) {
        l0[] l0VarArr = this.M;
        if (i2 < l0VarArr.length) {
            l0VarArr[i2].a(alVar, null);
        }
    }

    @Override // com.daaw.ts1.a
    public int getItemViewType(int i2) {
        return 0;
    }

    @Override // com.daaw.bk0, com.daaw.ts1.a
    public void j(int i2, int i3, List<Integer> list) {
        yj.w.a(Integer.valueOf(i2), Integer.valueOf(i3), list);
    }

    @Override // com.daaw.wc0
    public void o(Context context, String str) {
        W(context, str, new o91(context));
    }

    @Override // com.daaw.ts1.a
    public void v(RecyclerView.c0 c0Var, int i2) {
        lo1 lo1Var = ((er0) S()).get(i2);
        uk ukVar = (uk) c0Var;
        ukVar.v = i2;
        if (this.K) {
            g0(this, new s((tx0) lo1Var.a, (vd0) lo1Var.b, i2), (tx0) lo1Var.a, (vd0) lo1Var.b, ((vd0) ((er0) S()).p(i2)).a(), ukVar, this.N, 0, true, ((vd0) ((er0) S()).p(i2)).c() == -1);
        } else {
            g0(this, new s((tx0) lo1Var.a, (vd0) lo1Var.b, i2), (tx0) lo1Var.a, null, i2, ukVar, this.L, 0, false, false);
        }
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void x(Context context, String[] strArr, sd0[] sd0VarArr) {
        boolean z = this.K;
        Resources resources = context.getResources();
        if (z) {
            strArr[0] = resources.getString(R.string.libContainer_Queue_search);
        } else {
            strArr[0] = resources.getString(R.string.libContainer_Songs_search);
        }
        sd0VarArr[0] = J();
    }
}
