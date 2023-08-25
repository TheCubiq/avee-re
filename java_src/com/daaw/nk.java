package com.daaw;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.ir1;
import java.util.List;
/* loaded from: classes.dex */
public class nk extends n10<h60, List<h60>> {
    public l0[] K;
    public l0[] L;
    public String M;

    /* loaded from: classes.dex */
    public static class a implements r40<yj, List<sc1>> {
        public String a;
        public er0<tx0, sc1> b = null;
        public ak1<lo1<er0<tx0, sc1>, wf1>> c = new ak1<>();

        /* renamed from: com.daaw.nk$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0079a implements ir1.b<lo1<er0<tx0, sc1>, wf1>> {
            public final /* synthetic */ yj a;

            public C0079a(yj yjVar) {
                this.a = yjVar;
            }

            @Override // com.daaw.ir1.b
            /* renamed from: b */
            public void a(lo1<er0<tx0, sc1>, wf1> lo1Var, boolean z) {
                if (z) {
                    return;
                }
                er0<tx0, sc1> er0Var = null;
                if (lo1Var != null) {
                    er0<tx0, sc1> er0Var2 = lo1Var.a;
                    if (lo1Var.b.f()) {
                        this.a.O(lo1Var.b.e());
                    } else {
                        this.a.O(null);
                    }
                    er0Var = er0Var2;
                } else {
                    this.a.O(null);
                }
                if (er0Var == null) {
                    er0Var = new er0<>();
                }
                a.this.b = er0Var;
                this.a.A();
            }
        }

        public a(String str) {
            this.a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: c */
        public List<sc1> a(yj yjVar) {
            if (this.b != null || this.c.e(null)) {
                if (this.b == null) {
                    return null;
                }
                yjVar.L(false);
                lk.Z(yjVar, this.b);
                return this.b.x();
            }
            yjVar.L(true);
            this.c.a();
            this.c.b(null, tc1.e().f(this.a), new C0079a(yjVar));
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public h60 a;

        public b(h60 h60Var) {
            this.a = h60Var;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && this.a.b.equals(((b) obj).a.b);
        }

        public int hashCode() {
            return this.a.b.hashCode();
        }
    }

    public nk(Context context, String str, r40<yj, List<h60>> r40Var, String str2, me0<String> me0Var, int i, int i2) {
        super(context, r40Var, new f6(), str2, me0Var, i, new p91(context), i2);
        this.K = new l0[0];
        this.L = new l0[0];
        this.M = str;
    }

    public static String Y(Context context, String str) {
        return str.isEmpty() ? context.getString(R.string.unnamed_title) : str;
    }

    @Override // com.daaw.yj
    public ts1 E(Context context, int i) {
        return new ts1(new d90(this, this, 9, 15), this);
    }

    @Override // com.daaw.yj
    public String H(int i) {
        return ((h60) R(i)).b;
    }

    public void X(h60 h60Var, int i, uk ukVar) {
        ukVar.b0(this, new b(h60Var), J());
        ukVar.w.setSelected(yj.x.a(ukVar.t, Boolean.FALSE).booleanValue());
        ukVar.X(this.K, 0, this);
        ukVar.x.setVisibility(8);
        ukVar.U(null);
        ukVar.y.setVisibility(8);
        TextView textView = ukVar.z;
        textView.setText(Y(textView.getContext(), h60Var.a));
        ukVar.z.setTextColor(this.g);
        ukVar.d0(8);
        ukVar.B.setText("");
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        lk lkVar = new lk(context, new a(str), p(str), tc1.d(this.M, str), 0, this.l);
        lkVar.q(this.c);
        return lkVar.G(context, 0);
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void g(al alVar, int i) {
        l0[] l0VarArr = this.L;
        if (i < l0VarArr.length) {
            l0VarArr[i].a(alVar, null);
        }
    }

    @Override // com.daaw.ts1.a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.wc0
    public void o(Context context, String str) {
        W(context, str, new p91(context));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    @Override // com.daaw.ts1.a
    public void v(RecyclerView.c0 c0Var, int i) {
        uk ukVar = (uk) c0Var;
        ukVar.v = i;
        X((h60) S().get(i), i, ukVar);
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Stations_search);
        sd0VarArr[0] = J();
    }
}
