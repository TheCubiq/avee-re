package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.widget.ImageView;
import com.daaw.a10;
import com.daaw.b10;
import com.daaw.c10;
import com.daaw.lg1;
import com.daaw.og1;
import com.daaw.sg1;
import com.daaw.tg1;
import com.daaw.vg1;
import com.daaw.wg1;
import com.daaw.y00;
import com.daaw.yb0;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class e70 {
    public static volatile e70 o = null;
    public static boolean p = true;
    public final d60 a;
    public final fx b;
    public final bc c;
    public final ep0 d;
    public final cq e;
    public final nf0 f = new nf0();
    public final an1 g;
    public final kp h;
    public final pe i;
    public final q60 j;
    public final j20 k;
    public final q60 l;
    public final Handler m;
    public final cc n;

    /* loaded from: classes.dex */
    public static class a extends au1<View, Object> {
        public a(View view) {
            super(view);
        }

        @Override // com.daaw.pj1
        public void c(Object obj, f70<? super Object> f70Var) {
        }

        @Override // com.daaw.ya, com.daaw.pj1
        public void g(Exception exc, Drawable drawable) {
        }

        @Override // com.daaw.ya, com.daaw.pj1
        public void i(Drawable drawable) {
        }

        @Override // com.daaw.ya, com.daaw.pj1
        public void k(Drawable drawable) {
        }
    }

    public e70(fx fxVar, ep0 ep0Var, bc bcVar, Context context, cq cqVar) {
        an1 an1Var = new an1();
        this.g = an1Var;
        this.b = fxVar;
        this.c = bcVar;
        this.d = ep0Var;
        this.e = cqVar;
        this.a = new d60(context);
        this.m = new Handler(Looper.getMainLooper());
        this.n = new cc(ep0Var, bcVar, cqVar);
        kp kpVar = new kp();
        this.h = kpVar;
        jg1 jg1Var = new jg1(bcVar, cqVar);
        kpVar.b(InputStream.class, Bitmap.class, jg1Var);
        w00 w00Var = new w00(bcVar, cqVar);
        kpVar.b(ParcelFileDescriptor.class, Bitmap.class, w00Var);
        gf0 gf0Var = new gf0(jg1Var, w00Var);
        kpVar.b(jf0.class, Bitmap.class, gf0Var);
        t60 t60Var = new t60(context, bcVar);
        kpVar.b(InputStream.class, s60.class, t60Var);
        kpVar.b(jf0.class, k60.class, new hf0(gf0Var, t60Var, bcVar));
        kpVar.b(InputStream.class, File.class, new ng1());
        r(File.class, ParcelFileDescriptor.class, new y00.a());
        r(File.class, InputStream.class, new og1.a());
        Class cls = Integer.TYPE;
        r(cls, ParcelFileDescriptor.class, new a10.a());
        r(cls, InputStream.class, new sg1.a());
        r(Integer.class, ParcelFileDescriptor.class, new a10.a());
        r(Integer.class, InputStream.class, new sg1.a());
        r(String.class, ParcelFileDescriptor.class, new b10.a());
        r(String.class, InputStream.class, new tg1.a());
        r(Uri.class, ParcelFileDescriptor.class, new c10.a());
        r(Uri.class, InputStream.class, new vg1.a());
        r(URL.class, InputStream.class, new wg1.a());
        r(o70.class, InputStream.class, new yb0.a());
        r(byte[].class, InputStream.class, new lg1.a());
        an1Var.b(Bitmap.class, h70.class, new j70(context.getResources(), bcVar));
        an1Var.b(k60.class, l70.class, new l60(new j70(context.getResources(), bcVar)));
        pe peVar = new pe(bcVar);
        this.i = peVar;
        this.j = new q60(bcVar, peVar);
        j20 j20Var = new j20(bcVar);
        this.k = j20Var;
        this.l = new q60(bcVar, j20Var);
    }

    public static <T> mq0<T, ParcelFileDescriptor> b(Class<T> cls, Context context) {
        return d(cls, ParcelFileDescriptor.class, context);
    }

    public static <T, Y> mq0<T, Y> d(Class<T> cls, Class<Y> cls2, Context context) {
        if (cls == null) {
            return null;
        }
        return j(context).o().a(cls, cls2);
    }

    public static <T> mq0<T, InputStream> e(Class<T> cls, Context context) {
        return d(cls, InputStream.class, context);
    }

    public static void g(View view) {
        h(new a(view));
    }

    public static void h(pj1<?> pj1Var) {
        tq1.b();
        l41 j = pj1Var.j();
        if (j != null) {
            j.clear();
            pj1Var.b(null);
        }
    }

    public static e70 j(Context context) {
        if (o == null) {
            synchronized (e70.class) {
                if (o == null) {
                    Context applicationContext = context.getApplicationContext();
                    k70 k70Var = new k70(applicationContext);
                    List<n70> q = q(applicationContext);
                    for (n70 n70Var : q) {
                        n70Var.a(applicationContext, k70Var);
                    }
                    o = k70Var.a();
                    for (n70 n70Var2 : q) {
                        n70Var2.b(applicationContext, o);
                    }
                }
            }
        }
        return o;
    }

    public static List<n70> q(Context context) {
        return p ? new wm0(context).a() : Collections.emptyList();
    }

    public static r41 t(Context context) {
        return t41.f().d(context);
    }

    public <T, Z> jp<T, Z> a(Class<T> cls, Class<Z> cls2) {
        return this.h.a(cls, cls2);
    }

    public <R> pj1<R> c(ImageView imageView, Class<R> cls) {
        return this.f.a(imageView, cls);
    }

    public <Z, R> i51<Z, R> f(Class<Z> cls, Class<R> cls2) {
        return this.g.a(cls, cls2);
    }

    public void i() {
        tq1.b();
        this.d.d();
        this.c.d();
    }

    public bc k() {
        return this.c;
    }

    public q60 l() {
        return this.j;
    }

    public q60 m() {
        return this.l;
    }

    public fx n() {
        return this.b;
    }

    public final d60 o() {
        return this.a;
    }

    public Handler p() {
        return this.m;
    }

    public <T, Y> void r(Class<T> cls, Class<Y> cls2, nq0<T, Y> nq0Var) {
        nq0<T, Y> f = this.a.f(cls, cls2, nq0Var);
        if (f != null) {
            f.b();
        }
    }

    public void s(int i) {
        tq1.b();
        this.d.c(i);
        this.c.c(i);
    }
}
