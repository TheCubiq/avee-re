package com.daaw;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.dh0;
import com.daaw.gh0;
import com.daaw.n91;
import com.daaw.ts1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class zj extends yj implements ts1.a {
    public static final String[] P = {"_id", "_display_name", tx0.e};
    public l0[] C;
    public String D;
    public int E;
    public File F;
    public String G;
    public String H;
    public String I;
    public boolean J;
    public List<s> K;
    public l0[] L;
    public l0[] M;
    public WeakReference<oc0> N;
    public n91.b O;

    /* loaded from: classes.dex */
    public class a extends gh0.c.a {
        public a() {
        }

        @Override // com.daaw.gh0.c.a
        public void c(Context context, Object obj, List<tx0> list) {
            tx0 h = ((t) obj).b.h();
            if (h == null) {
                return;
            }
            list.add(h);
        }
    }

    /* loaded from: classes.dex */
    public class b extends gh0.h.a {
        public b() {
        }

        @Override // com.daaw.gh0.h.a
        public void c(Context context, Object obj, List<tx0> list) {
            tx0 h = ((t) obj).b.h();
            if (h == null) {
                return;
            }
            list.add(h);
        }
    }

    /* loaded from: classes.dex */
    public class c extends gh0.j.a {
        public c() {
        }

        @Override // com.daaw.gh0.j.a
        public gh0.d c(Context context, Object obj) {
            tx0 h = ((t) obj).b.h();
            return h == null ? new gh0.d(null) : new gh0.d(h);
        }
    }

    /* loaded from: classes.dex */
    public class d extends gh0.i.a {
        public d() {
        }

        @Override // com.daaw.gh0.i.a
        public void c(Context context, Object obj, List<tx0> list) {
            tx0 h = ((t) obj).b.h();
            if (h == null) {
                return;
            }
            list.add(h);
        }
    }

    /* loaded from: classes.dex */
    public class e extends gh0.e.a {
        public e() {
        }

        @Override // com.daaw.gh0.e.a
        public mo1<Integer, be0, Boolean> c(Context context, Object obj, List<tx0> list, be0 be0Var, er0<tx0, vd0> er0Var) {
            zj.b0(context, zj.this.K, list);
            return new mo1<>(0, (be0) zj.this.J(), Boolean.FALSE);
        }
    }

    /* loaded from: classes.dex */
    public class f extends gh0.a.AbstractC0051a {
        public f() {
        }

        @Override // com.daaw.gh0.a.AbstractC0051a
        public void c(Context context, Object obj, List<tx0> list) {
            zj.b0(context, zj.this.K, list);
        }
    }

    /* loaded from: classes.dex */
    public class g implements n91.b {
        public g() {
        }

        @Override // com.daaw.n91.b
        public void a(AsyncTask asyncTask, boolean z) {
            if (d(asyncTask) && !zj.this.C("")) {
                zj.this.N(false, true);
                zj.this.A();
            }
        }

        @Override // com.daaw.n91.b
        public void b(AsyncTask asyncTask) {
            if (d(asyncTask) && !zj.this.C("")) {
                zj.this.N(true, false);
                zj.this.K.clear();
                zj.this.A();
            }
        }

        @Override // com.daaw.n91.b
        public void c(AsyncTask asyncTask, s sVar) {
            if (d(asyncTask) && !zj.this.C("")) {
                zj.this.f0(sVar);
            }
        }

        public boolean d(AsyncTask asyncTask) {
            return yj.y.a(asyncTask, Integer.valueOf(zj.this.E), Boolean.FALSE).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public class h implements r {
        public final /* synthetic */ int a;
        public final /* synthetic */ sd0 b;

        public h(int i, sd0 sd0Var) {
            this.a = i;
            this.b = sd0Var;
        }

        @Override // com.daaw.zj.r
        public boolean a(File file) {
            return yj.t.a(Integer.valueOf(this.a), this.b, file, Boolean.TRUE).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public class i extends gh0.g.a {
        public i() {
        }

        @Override // com.daaw.gh0.g.a
        public void c(Context context, Object obj, List<tx0> list) {
            int i = zj.this.E;
            sd0 J = zj.this.J();
            zj.c0(context, i, J, "" + ((t) obj).a(), list);
        }
    }

    /* loaded from: classes.dex */
    public class j extends gh0.f.a {
        public j() {
        }

        @Override // com.daaw.gh0.f.a
        public void c(Context context, Object obj, List<tx0> list) {
            int i = zj.this.E;
            sd0 J = zj.this.J();
            zj.c0(context, i, J, "" + ((t) obj).a(), list);
        }
    }

    /* loaded from: classes.dex */
    public class k extends gh0.b.a {
        public k() {
        }

        @Override // com.daaw.gh0.b.a
        public void c(Context context, Object obj, List<tx0> list) {
            int i = zj.this.E;
            sd0 J = zj.this.J();
            zj.c0(context, i, J, "" + ((t) obj).a(), list);
        }
    }

    /* loaded from: classes.dex */
    public class l extends gh0.c.a {
        public l() {
        }

        @Override // com.daaw.gh0.c.a
        public void c(Context context, Object obj, List<tx0> list) {
            int i = zj.this.E;
            sd0 J = zj.this.J();
            zj.c0(context, i, J, "" + ((t) obj).a(), list);
        }
    }

    /* loaded from: classes.dex */
    public class m extends gh0.h.a {
        public m() {
        }

        @Override // com.daaw.gh0.h.a
        public void c(Context context, Object obj, List<tx0> list) {
            int i = zj.this.E;
            sd0 J = zj.this.J();
            zj.c0(context, i, J, "" + ((t) obj).a(), list);
        }
    }

    /* loaded from: classes.dex */
    public class n extends dh0.a.AbstractC0048a {
        public n() {
        }

        @Override // com.daaw.dh0.a.AbstractC0048a
        public void c(Context context, Object obj, List<String> list) {
            list.add(((t) obj).a());
        }
    }

    /* loaded from: classes.dex */
    public class o extends gh0.e.a {
        public o() {
        }

        @Override // com.daaw.gh0.e.a
        public mo1<Integer, be0, Boolean> c(Context context, Object obj, List<tx0> list, be0 be0Var, er0<tx0, vd0> er0Var) {
            int a;
            t tVar = (t) obj;
            be0 be0Var2 = (be0) zj.this.J();
            int i = 0;
            if (be0Var != null && be0Var.equals(zj.this.J())) {
                tx0 h = tVar.b.h();
                int W = zj.W(zj.this.K, h, 0);
                tx0 tx0Var = null;
                if (W >= 0 && W < er0Var.size()) {
                    tx0Var = er0Var.o(W);
                }
                if (h != null && h.equals(tx0Var)) {
                    return new mo1<>(Integer.valueOf(W), be0Var2, Boolean.TRUE);
                }
            }
            int size = list.size();
            zj.b0(context, zj.this.K, list);
            tx0 h2 = tVar.b.h();
            if (h2 != null && (a = dr1.a(list, h2, size)) >= 0) {
                i = a;
            }
            return new mo1<>(Integer.valueOf(i), be0Var2, Boolean.FALSE);
        }
    }

    /* loaded from: classes.dex */
    public class p extends gh0.f.a {
        public p() {
        }

        @Override // com.daaw.gh0.f.a
        public void c(Context context, Object obj, List<tx0> list) {
            tx0 h = ((t) obj).b.h();
            if (h == null) {
                return;
            }
            list.add(h);
        }
    }

    /* loaded from: classes.dex */
    public class q extends gh0.b.a {
        public q() {
        }

        @Override // com.daaw.gh0.b.a
        public void c(Context context, Object obj, List<tx0> list) {
            tx0 h = ((t) obj).b.h();
            if (h == null) {
                return;
            }
            list.add(h);
        }
    }

    /* loaded from: classes.dex */
    public interface r {
        boolean a(File file);
    }

    /* loaded from: classes.dex */
    public static class s implements Comparable<s> {
        public int p;
        public final tx0 q;
        public final boolean r;
        public final String s;
        public final long t;
        public final String u;
        public final long v;

        public s(boolean z, String str, long j, String str2, long j2) {
            this(z, str, j, str2, j2, null);
        }

        public s(boolean z, String str, long j, String str2, long j2, tx0 tx0Var) {
            this.p = 0;
            this.r = z;
            this.s = str;
            this.t = j;
            this.u = str2;
            this.v = j2;
            this.q = tx0Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: c */
        public int compareTo(s sVar) {
            String str = this.s;
            if (str != null) {
                return str.toLowerCase().compareTo(sVar.f().toLowerCase());
            }
            throw new IllegalArgumentException();
        }

        public long d() {
            return this.t;
        }

        public long e() {
            return this.v;
        }

        public String f() {
            return this.s;
        }

        public String g() {
            return this.u;
        }

        public tx0 h() {
            return this.q;
        }

        public boolean i() {
            return this.r;
        }

        public void j(int i) {
            this.p = i;
        }
    }

    /* loaded from: classes.dex */
    public static class t {
        public int a;
        public s b;

        public t(s sVar, int i) {
            this.a = i;
            this.b = sVar;
        }

        public String a() {
            return this.b.g();
        }

        public boolean equals(Object obj) {
            return (obj instanceof t) && this.a == ((t) obj).a;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public zj(Context context, File file, String str, int i2) {
        super(context, str, new tr1(file.getName()), 0, i2);
        this.C = new l0[]{new i(), new j(), new k(), new l(), new m(), new n()};
        this.D = null;
        this.L = new l0[]{new o(), new p(), new q(), new a(), new b(), new c(), new d()};
        this.M = new l0[]{new e(), new f()};
        this.N = new WeakReference<>(null);
        this.O = new g();
        this.E = i2;
        this.F = file;
        this.K = new ArrayList();
        this.G = this.F.getName();
        this.H = this.F.getAbsolutePath();
        this.I = this.F.getPath();
        this.J = this.F.isDirectory();
        if (this.F.isDirectory() && this.H.length() > 0) {
            String str2 = this.H;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.H += "/";
            }
        }
        o(context, yj.r.a(Integer.valueOf(i2), J(), ""));
    }

    public static int W(List<s> list, tx0 tx0Var, int i2) {
        int i3 = 0;
        while (i2 < list.size()) {
            tx0 h2 = list.get(i2).h();
            if (h2 != null) {
                if (h2.d(tx0Var)) {
                    return i3;
                }
                i3++;
            }
            i2++;
        }
        return -1;
    }

    public static void a0(String str, List<s> list, Uri uri) {
        Cursor query = dx0.c().getContentResolver().query(uri, P, "_data LIKE ? AND _data NOT LIKE ?", new String[]{str + "%", str + "/%/%"}, null);
        if (query == null) {
            return;
        }
        int columnIndex = query.getColumnIndex("_id");
        int columnIndex2 = query.getColumnIndex("_display_name");
        int columnIndex3 = query.getColumnIndex(tx0.e);
        while (query.moveToNext()) {
            Uri withAppendedId = ContentUris.withAppendedId(uri, query.getLong(columnIndex));
            list.add(new s(false, query.getString(columnIndex2), query.getLong(columnIndex3), withAppendedId.toString(), 0L, new tx0(withAppendedId)));
        }
        query.close();
    }

    public static List<tx0> b0(Context context, List<s> list, List<tx0> list2) {
        if (list2 == null) {
            list2 = new ArrayList<>(list.size());
        }
        for (s sVar : list) {
            if (sVar.h() != null) {
                list2.add(sVar.h());
            }
        }
        return list2;
    }

    public static List<tx0> c0(Context context, int i2, sd0 sd0Var, String str, List<tx0> list) {
        return d0(context, i2, sd0Var, str, false, list);
    }

    public static List<tx0> d0(Context context, int i2, sd0 sd0Var, String str, boolean z, List<tx0> list) {
        return b0(context, g0(i2, sd0Var, new File(str), true), list);
    }

    public static List<s> g0(int i2, sd0 sd0Var, File file, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        h0(arrayList, arrayList2, file, z, new h(i2, sd0Var));
        Collections.sort(arrayList);
        Comparator<s> b2 = g10.b(yj.s.a(Integer.valueOf(i2), sd0Var, null), 0);
        if (b2 != null) {
            Collections.sort(arrayList2, b2);
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ((s) arrayList2.get(i3)).p = i3;
        }
        if (arrayList.size() > 0) {
            arrayList.addAll(arrayList2);
            return arrayList;
        }
        return arrayList2;
    }

    public static void h0(List<s> list, List<s> list2, File file, boolean z, r rVar) {
        File[] listFiles;
        File[] listFiles2 = file.listFiles();
        a0(file.getPath(), list2, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        a0(file.getPath(), list2, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        try {
            for (File file2 : listFiles2) {
                if (file2.isDirectory() && !z) {
                    if (rVar != null ? rVar.a(file2) : true) {
                        list.add(new s(true, file2.getName(), file2.listFiles() != null ? listFiles.length : 0, file2.getCanonicalPath(), file2.lastModified()));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.daaw.yj
    public boolean A() {
        if (B(Y(true).b, false)) {
            return true;
        }
        lo1<List<s>, String> Y = Y(false);
        List<s> list = Y.a;
        if (list == null) {
            i0(new ArrayList(), null);
        } else {
            i0(list, Y.b);
        }
        return true;
    }

    @Override // com.daaw.yj
    public ts1 E(Context context, int i2) {
        return new ts1(new d90(this, this, 11, 1), this);
    }

    @Override // com.daaw.yj
    public String H(int i2) {
        s Z = Z(i2);
        return Z.i() ? Z.f() : "";
    }

    public oc0 X() {
        return this.N.get();
    }

    public lo1<List<s>, String> Y(boolean z) {
        if (this.D == null) {
            return z ? new lo1<>(null, "") : new lo1<>(g0(this.E, J(), this.F, false), "");
        }
        List<s> list = z ? null : this.K;
        return new lo1<>(list, this.D + this.K.size());
    }

    public s Z(int i2) {
        return this.K.get(i2);
    }

    @Override // com.daaw.yj, com.daaw.wc0, com.daaw.ts1.a
    public int a() {
        return this.K.size();
    }

    @Override // com.daaw.wc0
    public ts1 d(Context context, String str) {
        if (str.length() > 0) {
            zj zjVar = new zj(context, new File(this.H + str), p(str), this.E);
            zjVar.q(this.c);
            return zjVar.F(context);
        }
        return null;
    }

    public void e0(s sVar, int i2, uk ukVar) {
        tx0 h2 = sVar.h();
        if (h2 != null) {
            qk.f0(this, new t(sVar, i2), h2, null, sVar.p, ukVar, this.L, 0);
            return;
        }
        ukVar.b0(this, new t(sVar, i2), J());
        ukVar.w.setSelected(yj.x.a(ukVar.t, Boolean.FALSE).booleanValue());
        ukVar.X(this.C, -1, this);
        ukVar.x.setVisibility(0);
        ukVar.V(this.i);
        ukVar.W(R.drawable.ic_folder4);
        ukVar.y.setVisibility(8);
        ukVar.z.setText(sVar.f());
        ukVar.z.setTextColor(this.g);
        ukVar.d0(8);
        TextView textView = ukVar.B;
        textView.setText("" + sVar.d());
    }

    @Override // com.daaw.ts1.a
    public void f(oc0 oc0Var) {
        this.N = new WeakReference<>(oc0Var);
    }

    public void f0(s sVar) {
        this.K.add(sVar);
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

    public void i0(List<s> list, String str) {
        if (B(str, true)) {
            return;
        }
        this.K = list;
        oc0 X = X();
        if (X != null) {
            X.a();
        }
    }

    @Override // com.daaw.ts1.a
    public void j(int i2, int i3, List<Integer> list) {
    }

    public void j0(Context context, String str) {
        n91 n91Var = new n91(context, this.F, new q91(context), new WeakReference(this.O));
        yj.z.a(n91Var, Integer.valueOf(this.E), str);
        n91Var.execute(str);
    }

    @Override // com.daaw.ts1.a
    public void k() {
    }

    @Override // com.daaw.wc0
    public void o(Context context, String str) {
        if (str == null || str.isEmpty()) {
            this.D = null;
            N(false, true);
            A();
            return;
        }
        this.D = str;
        N(true, false);
        A();
        j0(context, str);
    }

    @Override // com.daaw.ts1.a
    public RecyclerView.c0 r(ViewGroup viewGroup, int i2) {
        return gt1.a(viewGroup.getContext(), viewGroup, i2, this);
    }

    @Override // com.daaw.ts1.a
    public int t(int i2) {
        return i2;
    }

    @Override // com.daaw.ts1.a
    public void v(RecyclerView.c0 c0Var, int i2) {
        s Z = Z(i2);
        uk ukVar = (uk) c0Var;
        ukVar.v = i2;
        e0(Z, i2, ukVar);
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Folders_search);
        sd0VarArr[0] = J();
    }
}
