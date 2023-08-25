package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.AsyncTask;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.o81;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.uw1;
import com.daaw.vw1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class yx0 {
    public t91 a = new t91();
    public p b = new p();
    public r c = new r();
    public List<Object> d = new ArrayList();

    /* loaded from: classes.dex */
    public class a implements uw1.a<Context, Long, long[], List<String>, Boolean> {
        public a() {
        }

        @Override // com.daaw.uw1.a
        /* renamed from: b */
        public void a(Context context, Long l, long[] jArr, List<String> list, Boolean bool) {
            int a = rx0.a(context, l.longValue(), jArr, bool.booleanValue());
            yx0.this.m();
            boolean booleanValue = bool.booleanValue();
            Resources resources = context.getResources();
            vy.a.a(booleanValue ? resources.getQuantityString(R.plurals.x_items_saved_in_playlist, a, Integer.valueOf(a)) : resources.getQuantityString(R.plurals.x_items_added_to_playlist, a, Integer.valueOf(a)));
        }
    }

    /* loaded from: classes.dex */
    public class b implements uw1.a<String, String, List<tx0>, Boolean, Boolean> {
        public b() {
        }

        @Override // com.daaw.uw1.a
        /* renamed from: b */
        public void a(String str, String str2, List<tx0> list, Boolean bool, Boolean bool2) {
            qw1<String> qw1Var;
            String e;
            wf1 wf1Var = new wf1();
            int b = lx0.h().b(wf1Var, str2, list, bool.booleanValue(), bool2.booleanValue());
            yx0.this.m();
            Context b2 = dx0.b();
            if (b2 != null) {
                if (b > 0) {
                    e = bool.booleanValue() ? b2.getResources().getQuantityString(R.plurals.x_items_saved_in_playlist, b, Integer.valueOf(b)) : b2.getResources().getQuantityString(R.plurals.x_items_added_to_playlist, b, Integer.valueOf(b));
                    qw1Var = vy.a;
                } else if (!wf1Var.f()) {
                    return;
                } else {
                    qw1Var = vy.a;
                    e = wf1Var.e();
                }
                qw1Var.a(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements tw1.a<Context, Long, String, al> {
        public c() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(Context context, Long l, String str, al alVar) {
            if (alVar.c() != null) {
                v31.a(alVar, l, str);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements sw1.a<Context, Long, String> {
        public d() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Context context, Long l, String str) {
            rx0.e(context, l.longValue(), str);
            yx0.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class e implements tw1.a<Context, Long, String, al> {
        public e() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(Context context, Long l, String str, al alVar) {
            yx0.this.k(context, l);
        }
    }

    /* loaded from: classes.dex */
    public class f implements vw1.a<er0<String, String>> {
        public f() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public er0<String, String> a() {
            Context e = dx0.e();
            if (e == null) {
                return null;
            }
            return j5.e().H(e);
        }
    }

    /* loaded from: classes.dex */
    public class g implements vw1.a<p> {
        public g() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public p a() {
            return yx0.this.b;
        }
    }

    /* loaded from: classes.dex */
    public class h implements pw1.a {
        public h() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            yx0.this.a.b(0);
        }
    }

    /* loaded from: classes.dex */
    public class i implements qw1.a<al> {
        public i() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(al alVar) {
            Context e = dx0.e();
            if (e == null) {
                return;
            }
            yx0.this.c.a = alVar;
            o81 c = o81.c(e, new File("/storage/"), new s(), new WeakReference(yx0.this.c));
            yx0.this.a.d(c, 0);
            c.i();
            if (alVar.a() != null) {
                n81.b(alVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements tw1.a<Context, String, String, al> {
        public j() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(Context context, String str, String str2, al alVar) {
            yx0.this.i(context, str, str2);
        }
    }

    /* loaded from: classes.dex */
    public class k implements sw1.a<long[], List<String>, al> {
        public k() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(long[] jArr, List<String> list, al alVar) {
            dn.a(alVar, jArr, list);
        }
    }

    /* loaded from: classes.dex */
    public class l implements sw1.a<long[], List<String>, al> {
        public l() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(long[] jArr, List<String> list, al alVar) {
            dn.a(alVar, jArr, list);
        }
    }

    /* loaded from: classes.dex */
    public class m implements sw1.a<String, long[], List<String>> {
        public m() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(String str, long[] jArr, List<String> list) {
            int b;
            if (str == null || str.length() <= 0) {
                return;
            }
            Context b2 = dx0.b();
            if (b2 != null && (b = rx0.b(b2, str, jArr)) > 0) {
                vy.a.a(b2.getResources().getQuantityString(R.plurals.x_items_saved_in_playlist, b, Integer.valueOf(b)));
            }
            yx0.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class n implements uw1.a<String, String, kx0, List<String>, Boolean> {
        public n() {
        }

        @Override // com.daaw.uw1.a
        /* renamed from: b */
        public void a(String str, String str2, kx0 kx0Var, List<String> list, Boolean bool) {
            Context b = dx0.b();
            if (b == null) {
                return;
            }
            if (str == null || str.length() <= 0) {
                str = j5.P(j5.e().p(b), "pref_playlistDefaultPath", "\\Playlists\\");
            }
            if (str2 == null || str2.length() <= 0) {
                return;
            }
            wf1 wf1Var = new wf1();
            String f = lx0.f(str, str2, kx0Var);
            int c = lx0.h().c(wf1Var, f, kx0Var, list, bool.booleanValue());
            if (c > 0) {
                vy.a.a(b.getResources().getQuantityString(R.plurals.x_items_saved_in_playlist, c, Integer.valueOf(c)));
            } else if (wf1Var.f()) {
                vy.a.a(wf1Var.e());
            }
            j5.e().E(b, f, true);
            yx0.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class o implements tw1.a<Context, List<tx0>, Boolean, al> {
        public o() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(Context context, List<tx0> list, Boolean bool, al alVar) {
            ox0.c(alVar, list, bool);
        }
    }

    /* loaded from: classes.dex */
    public static class p {
        public String a;
        public boolean b;
    }

    /* loaded from: classes.dex */
    public class q implements DialogInterface.OnClickListener {
        public List<String> p;

        public q(List<String> list) {
            this.p = list;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i != -1) {
                return;
            }
            yx0.this.j(this.p);
        }
    }

    /* loaded from: classes.dex */
    public class r implements o81.c {
        public al a = null;

        public r() {
        }

        @Override // com.daaw.o81.c
        public void a(AsyncTask asyncTask, boolean z, List<String> list) {
            al alVar;
            if (yx0.this.a.c(asyncTask, 0)) {
                yx0.this.b.b = false;
                yx0.this.b.a = "Finished";
                n81.d(yx0.this.b);
                if (!z || list == null || (alVar = this.a) == null) {
                    return;
                }
                yx0.this.l(alVar, list);
            }
        }

        @Override // com.daaw.o81.c
        public void b(AsyncTask asyncTask, String str) {
            if (yx0.this.a.c(asyncTask, 0)) {
                yx0.this.b.b = true;
                yx0.this.b.a = str;
                n81.d(yx0.this.b);
            }
        }

        @Override // com.daaw.o81.c
        public void c(AsyncTask asyncTask) {
            if (yx0.this.a.c(asyncTask, 0)) {
                yx0.this.b.b = true;
                yx0.this.b.a = "Starting";
                n81.d(yx0.this.b);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class s implements o81.b<File> {
        @Override // com.daaw.o81.b
        public String a(String str) {
            return str.toLowerCase();
        }

        @Override // com.daaw.o81.b
        /* renamed from: c */
        public boolean b(String str, File file) {
            return kx0.a(cr1.i(file));
        }
    }

    public yx0() {
        n81.r.b(new g(), this.d);
        n81.s.b(new h(), this.d);
        dj0.R.b(new i(), this.d);
        dj0.I.b(new j(), this.d);
        dj0.S.b(new k(), this.d);
        ox0.A.b(new l(), this.d);
        dn.p.b(new m(), this.d);
        dn.q.b(new n(), this.d);
        dj0.x.b(new o(), this.d);
        ox0.x.b(new a(), this.d);
        ox0.y.b(new b(), this.d);
        dj0.J.b(new c(), this.d);
        v31.p.b(new d(), this.d);
        dj0.K.b(new e(), this.d);
        ox0.z.b(new f(), this.d);
    }

    public final void i(Context context, String str, String str2) {
        j5.e().J(str, str2, context);
        m();
    }

    public final void j(List<String> list) {
        Context e2 = dx0.e();
        if (e2 == null) {
            return;
        }
        j5.e().F(e2, list, true);
        m();
    }

    public final void k(Context context, Long l2) {
        if (rx0.c(context, l2.longValue()) > 0) {
            vy.a.a(context.getResources().getString(R.string.playlist_deleted));
        }
        m();
    }

    public final void l(al alVar, List<String> list) {
        Activity a2 = alVar.a();
        if (a2 == null) {
            return;
        }
        er0<String, String> H = j5.e().H(a2);
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!H.k(str)) {
                arrayList.add(str);
            }
        }
        q qVar = new q(arrayList);
        int size = arrayList.size();
        String quantityString = a2.getResources().getQuantityString(R.plurals.x_items_found_playlist_scan, size, Integer.valueOf(size));
        if (a2.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(a2);
        builder.setTitle(R.string.dialog_playlist_scan_completed);
        builder.setMessage(quantityString);
        builder.setPositiveButton(R.string.dialog_ok, qVar);
        builder.create().show();
    }

    public final void m() {
        m30 o0 = MainActivity.o0();
        if (o0 != null) {
            o0.A();
        }
    }
}
