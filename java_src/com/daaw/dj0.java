package com.daaw;

import android.app.Fragment;
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageView;
import com.daaw.gh0;
import com.daaw.ie1;
import com.daaw.jh0;
import com.daaw.qw1;
import com.daaw.tx0;
import com.daaw.wc0;
import java.io.File;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public class dj0 extends Fragment implements wc0.b {
    public static vw1<Integer> p = new vw1<>();
    public static rw1<String, String> q = new rw1<>();
    public static tw1<Integer, Boolean, String, sd0> r = new tw1<>();
    public static vw1<Integer> s = new vw1<>();
    public static rw1<Integer, View> t = new rw1<>();
    public static vw1<be0> u = gh0.a;
    public static vw1<er0<tx0, vd0>> v = gh0.b;
    public static qw1<Integer> w = gh0.e;
    public static tw1<Context, List<tx0>, Boolean, al> x = gh0.h;
    public static rw1<Collection<tx0>, Integer> y = gh0.f;
    public static sw1<List<tx0>, Integer, be0> z = gh0.g;
    public static rw1<al, List<gh0.d>> A = gh0.c;
    public static rw1<al, Collection<tx0>> B = gh0.d;
    public static qw1<vd0> C = fh0.d;
    public static qw1<List<vd0>> D = fh0.c;
    public static ww1<Integer, Boolean> E = fh0.a;
    public static qw1<al> F = fh0.b;
    public static sw1<List<tx0>, Integer, be0> G = hh0.a;
    public static sw1<List<tx0>, Integer, be0> H = ih0.a;
    public static tw1<Context, String, String, al> I = eh0.a;
    public static tw1<Context, Long, String, al> J = eh0.b;
    public static tw1<Context, Long, String, al> K = eh0.c;
    public static sw1<Context, String, String> L = dh0.a;
    public static rw1<Context, List<String>> M = dh0.b;
    public static sw1<l0[], Boolean, jh0.a<Object>> N = uk.H;
    public static vw1<Boolean> O = uk.I;
    public static qw1<Object> P = uk.J;
    public static sw1<al, Integer, View> Q = qa.y;
    public static qw1<al> R = qa.z;
    public static sw1<long[], List<String>, al> S = qa.A;
    public static vw1<Boolean> T = qa.u;
    public static rw1<al, View> U = qa.v;
    public static rw1<al, View> V = qa.w;
    public static rw1<al, View> W = qa.x;
    public static yw1<d1, Integer, Integer, Boolean> X = la.d;
    public static xw1<Integer, sd0, String> Y = yj.r;
    public static xw1<Integer, sd0, ie1.h> Z = yj.s;
    public static yw1<Integer, sd0, File, Boolean> a0 = yj.t;
    public static ww1<Class<?>, Boolean> b0 = yj.u;
    public static rw1<Boolean, Class<?>> c0 = yj.v;
    public static sw1<Integer, Integer, List<Integer>> d0 = yj.w;
    public static tw1<i2, ImageView, Boolean, Boolean> e0 = yj.p;
    public static vw1<Boolean> f0 = yj.q;
    public static ww1<jh0.a, Boolean> g0 = yj.x;
    public static xw1<AsyncTask, Integer, Boolean> h0 = yj.y;
    public static sw1<AsyncTask, Integer, Object> i0 = yj.z;
    public static qw1<Integer> j0 = yj.A;
    public static ww1<wc0, lo1<Integer, Boolean>> k0 = yj.B;
    public static kw1<uk, tx0.b, Boolean> l0 = qk.O;
    public static qw1<Integer> m0 = new qw1<>();
    public static qw1<Boolean> n0 = new qw1<>();
    public static qw1<Boolean> o0 = new qw1<>();

    public static m91 h(Context context, ts1 ts1Var) {
        if (ts1Var == null) {
            return m91.d;
        }
        String[] strArr = new String[1];
        sd0[] sd0VarArr = new sd0[1];
        ts1Var.z().x(context, strArr, sd0VarArr);
        if (strArr[0] == null || strArr[0].isEmpty()) {
            m91 m91Var = new m91();
            m91Var.a = false;
            m91Var.b = "";
            m91Var.c = null;
            return m91Var;
        }
        sd0 sd0Var = sd0VarArr[0];
        String str = strArr[0];
        m91 m91Var2 = new m91();
        m91Var2.a = true;
        m91Var2.b = str;
        m91Var2.c = sd0Var;
        return m91Var2;
    }

    public static void i(boolean z2) {
        n0.a(Boolean.valueOf(z2));
    }

    public static void j(boolean z2) {
        o0.a(Boolean.valueOf(z2));
    }

    public static void k(int i) {
        m0.a(Integer.valueOf(i));
    }

    @Override // com.daaw.wc0.b
    public void a(String str, String str2) {
        q.a(str, str2);
    }

    @Override // com.daaw.wc0.b
    public void b(qw1.a<Integer> aVar, List<Object> list) {
        m0.b(aVar, list);
    }

    @Override // com.daaw.wc0.b
    public int c() {
        return p.a(0).intValue();
    }

    @Override // com.daaw.wc0.b
    public int d() {
        return s.a(0).intValue();
    }

    @Override // com.daaw.wc0.b
    public void e(qw1.a<Boolean> aVar, List<Object> list) {
        n0.b(aVar, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    @Override // com.daaw.wc0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String f(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            int r0 = r7.length()
            if (r0 > 0) goto L7
            return r6
        L7:
            int r0 = r6.length()
            if (r0 > 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            return r6
        L1d:
            int r0 = r6.length()
            r1 = 1
            int r0 = r0 - r1
            char r0 = r6.charAt(r0)
            java.lang.String r2 = "/"
            r3 = 0
            r4 = 47
            if (r0 != r4) goto L4a
            char r0 = r7.charAt(r3)
            if (r0 == r4) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L61
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = r7.substring(r1)
            r0.append(r6)
            goto L67
        L4a:
            char r0 = r7.charAt(r3)
            if (r0 == r4) goto L5c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r2)
            goto L64
        L5c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L61:
            r0.append(r6)
        L64:
            r0.append(r7)
        L67:
            java.lang.String r6 = r0.toString()
            int r7 = r6.length()
            if (r7 <= 0) goto L79
            int r7 = r7 - r1
            char r7 = r6.charAt(r7)
            if (r7 != r4) goto L79
            return r6
        L79:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r2)
            java.lang.String r6 = r7.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.dj0.f(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.daaw.wc0.b
    public void g(qw1.a<Boolean> aVar, List<Object> list) {
        o0.b(aVar, list);
    }
}
