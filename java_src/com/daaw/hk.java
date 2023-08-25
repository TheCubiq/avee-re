package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.eh0;
import com.daaw.gh0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class hk extends on {
    public l0[] E;

    /* loaded from: classes.dex */
    public class a extends gh0.g.a {
        public a() {
        }

        @Override // com.daaw.gh0.g.a
        public void c(Context context, Object obj, List<tx0> list) {
            hk.Y(context, hk.this, ((h) obj).b, list);
        }
    }

    /* loaded from: classes.dex */
    public class b extends gh0.f.a {
        public b() {
        }

        @Override // com.daaw.gh0.f.a
        public void c(Context context, Object obj, List<tx0> list) {
            hk.Y(context, hk.this, ((h) obj).b, list);
        }
    }

    /* loaded from: classes.dex */
    public class c extends gh0.b.a {
        public c() {
        }

        @Override // com.daaw.gh0.b.a
        public void c(Context context, Object obj, List<tx0> list) {
            hk.Y(context, hk.this, ((h) obj).b, list);
        }
    }

    /* loaded from: classes.dex */
    public class d extends gh0.c.a {
        public d() {
        }

        @Override // com.daaw.gh0.c.a
        public void c(Context context, Object obj, List<tx0> list) {
            hk.Y(context, hk.this, ((h) obj).b, list);
        }
    }

    /* loaded from: classes.dex */
    public class e extends gh0.h.a {
        public e() {
        }

        @Override // com.daaw.gh0.h.a
        public void c(Context context, Object obj, List<tx0> list) {
            hk.Y(context, hk.this, ((h) obj).b, list);
        }
    }

    /* loaded from: classes.dex */
    public class f extends eh0.b.a {
        public f() {
        }

        @Override // com.daaw.eh0.b.a
        public void c(Context context, Object obj, er0<String, String> er0Var) {
            h hVar = (h) obj;
            er0Var.f(hVar.a, hVar.b);
        }
    }

    /* loaded from: classes.dex */
    public static class g implements r40<yj, er0<tx0, vd0>> {
        public String a;

        public g(String str) {
            this.a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public er0<tx0, vd0> a(yj yjVar) {
            return er0.m(hk.Y(dx0.e(), yjVar, this.a, null), null);
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public String a;
        public String b;

        public h(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof h) && this.a.equals(((h) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public hk(Context context, String str, int i) {
        super(context, str, context.getResources().getString(R.string.section_playlist_standalone), R.drawable.ic_playlist4, i);
        this.E = new l0[]{new a(), new b(), new c(), new d(), new e(), new f()};
        V(context);
    }

    public static List<tx0> Y(Context context, yj yjVar, String str, List<tx0> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        List<tx0> e2 = lx0.h().e(str);
        if (e2 != null) {
            c0(yjVar, e2);
            list.addAll(e2);
        }
        return list;
    }

    public static String Z(String str) {
        return cr1.l(str);
    }

    public static lo1<Cursor, String> b0(Context context, sd0 sd0Var) {
        er0<String, String> H = j5.e().H(context);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", ""});
        Iterator<lo1<String, String>> it = H.iterator();
        while (it.hasNext()) {
            lo1<String, String> next = it.next();
            matrixCursor.addRow(new String[]{next.a, next.b});
        }
        return new lo1<>(matrixCursor, "");
    }

    public static void c0(yj yjVar, List<tx0> list) {
        if (yj.s.a(Integer.valueOf(yjVar.I()), yjVar.J(), null).b) {
            Collections.reverse(list);
        }
    }

    @Override // com.daaw.yj
    public ts1 E(Context context, int i) {
        return new ts1(new d90(this, this, 6, 1), this);
    }

    @Override // com.daaw.yj
    public String H(int i) {
        return U(i).getString(0);
    }

    @Override // com.daaw.on
    public lo1<Cursor, String> P(Context context) {
        return b0(context, J());
    }

    @Override // com.daaw.on
    public lo1<Cursor, String> Q(Context context, String str) {
        return b0(context, J());
    }

    public void a0(Cursor cursor, int i, uk ukVar) {
        ukVar.b0(this, new h(U(i).getString(0), U(i).getString(1)), J());
        ukVar.w.setSelected(yj.x.a(ukVar.t, Boolean.FALSE).booleanValue());
        ukVar.X(this.E, -1, this);
        ukVar.x.setVisibility(0);
        ukVar.V(this.i);
        ukVar.W(R.drawable.ic_playlist4_file);
        ukVar.y.setVisibility(8);
        String string = cursor.getString(1);
        ukVar.z.setText(Z(string));
        ukVar.z.setTextColor(this.g);
        ukVar.d0(0);
        ukVar.c0(string);
        ukVar.B.setText("");
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void c(boolean z) {
        yj.v.a(Boolean.valueOf(z), hk.class);
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        int S = S("_id", str);
        String string = S >= 0 ? U(S).getString(1) : "";
        if (string.length() > 0) {
            qk qkVar = new qk(context, new g(string), p(str), Z(string), 0, this.l, false);
            qkVar.q(this.c);
            return qkVar.G(context, 0);
        }
        return null;
    }

    @Override // com.daaw.ts1.a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.ts1.a
    public void v(RecyclerView.c0 c0Var, int i) {
        Cursor U = U(i);
        uk ukVar = (uk) c0Var;
        ukVar.v = i;
        a0(U, i, ukVar);
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public boolean z() {
        return yj.u.a(hk.class, Boolean.FALSE).booleanValue();
    }
}
