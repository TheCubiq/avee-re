package com.daaw;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.ir1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class mk extends n10<h60, List<h60>> {
    public l0[] K;
    public l0[] L;

    /* loaded from: classes.dex */
    public static class a implements r40<yj, List<h60>> {
        public String a;
        public List<h60> b = null;
        public ak1<lo1<List<h60>, wf1>> c = new ak1<>();

        /* renamed from: com.daaw.mk$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0076a implements ir1.b<lo1<List<h60>, wf1>> {
            public final /* synthetic */ yj a;

            public C0076a(yj yjVar) {
                this.a = yjVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
            @Override // com.daaw.ir1.b
            /* renamed from: b */
            public void a(lo1<List<h60>, wf1> lo1Var, boolean z) {
                if (z) {
                    return;
                }
                ArrayList arrayList = null;
                if (lo1Var != null) {
                    ?? r0 = (List) lo1Var.a;
                    if (lo1Var.b.f()) {
                        this.a.O(lo1Var.b.e());
                    } else {
                        this.a.O(null);
                    }
                    arrayList = r0;
                } else {
                    this.a.O(null);
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                a.this.b = arrayList;
                this.a.A();
            }
        }

        public a(String str) {
            this.a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: c */
        public List<h60> a(yj yjVar) {
            if (this.b != null || this.c.e(null)) {
                if (this.b == null) {
                    return null;
                }
                yjVar.L(false);
                d(yjVar, this.b);
                return Collections.unmodifiableList(this.b);
            }
            yjVar.L(true);
            this.c.a();
            this.c.b(null, tc1.c(this.a), new C0076a(yjVar));
            return null;
        }

        public final void d(yj yjVar, List<h60> list) {
        }
    }

    /* loaded from: classes.dex */
    public static class b implements r40<yj, List<h60>> {
        public List<h60> a = null;
        public boolean b = false;
        public ak1<lo1<List<h60>, wf1>> c = new ak1<>();
        public rc1<lo1<tx0, sc1>, er0<tx0, sc1>, h60, List<h60>> d = tc1.e();

        /* loaded from: classes.dex */
        public class a implements ir1.b<lo1<List<h60>, wf1>> {
            public final /* synthetic */ yj a;

            public a(yj yjVar) {
                this.a = yjVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
            @Override // com.daaw.ir1.b
            /* renamed from: b */
            public void a(lo1<List<h60>, wf1> lo1Var, boolean z) {
                if (z) {
                    return;
                }
                ArrayList arrayList = null;
                if (lo1Var != null) {
                    ?? r0 = (List) lo1Var.a;
                    if (lo1Var.b.f()) {
                        this.a.O(lo1Var.b.e());
                    } else {
                        this.a.O(null);
                    }
                    arrayList = r0;
                } else {
                    this.a.O(null);
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                b.this.a = arrayList;
                this.a.A();
            }
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public List<h60> a(yj yjVar) {
            if (this.a != null || this.c.e(null)) {
                if (this.a == null) {
                    return null;
                }
                yjVar.L(false);
                c(yjVar, this.a);
                return Collections.unmodifiableList(this.a);
            }
            yjVar.L(true);
            this.c.a();
            this.c.b(null, tc1.c(null), new a(yjVar));
            return null;
        }

        public void c(yj yjVar, List<h60> list) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public h60 a;

        public c(h60 h60Var) {
            this.a = h60Var;
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && this.a.b.equals(((c) obj).a.b);
        }

        public int hashCode() {
            return this.a.b.hashCode();
        }
    }

    public mk(Context context, r40<yj, List<h60>> r40Var, String str, me0<String> me0Var, int i, int i2) {
        super(context, r40Var, new f6(), str, me0Var, i, new p91(context), i2);
        this.K = new l0[0];
        this.L = new l0[0];
    }

    public static mk X(Context context, String str, me0<String> me0Var, int i, int i2) {
        return new mk(context, new b(), str, me0Var, i, i2);
    }

    public static String Z(Context context, String str) {
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

    public void Y(h60 h60Var, int i, uk ukVar) {
        ukVar.b0(this, new c(h60Var), J());
        ukVar.w.setSelected(yj.x.a(ukVar.t, Boolean.FALSE).booleanValue());
        ukVar.X(this.K, 0, this);
        ukVar.x.setVisibility(8);
        ukVar.U(null);
        ukVar.y.setVisibility(8);
        TextView textView = ukVar.z;
        textView.setText(Z(textView.getContext(), h60Var.a));
        ukVar.z.setTextColor(this.g);
        ukVar.d0(8);
        ukVar.B.setText("");
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        nk nkVar = new nk(context, str, new a(str), p(str), tc1.d("", str), 0, this.l);
        nkVar.q(this.c);
        return nkVar.G(context, 0);
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
        Y((h60) S().get(i), i, ukVar);
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Stations_search);
        sd0VarArr[0] = J();
    }
}
