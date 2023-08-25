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

    /* renamed from: o */
    public static volatile e70 f8205o = null;

    /* renamed from: p */
    public static boolean f8206p = true;

    /* renamed from: a */
    public final d60 f8207a;

    /* renamed from: b */
    public final C1336fx f8208b;

    /* renamed from: c */
    public final InterfaceC0832bc f8209c;

    /* renamed from: d */
    public final ep0 f8210d;

    /* renamed from: e */
    public final EnumC0988cq f8211e;

    /* renamed from: f */
    public final nf0 f8212f = new nf0();

    /* renamed from: g */
    public final an1 f8213g;

    /* renamed from: h */
    public final C1971kp f8214h;

    /* renamed from: i */
    public final C2542pe f8215i;

    /* renamed from: j */
    public final q60 f8216j;

    /* renamed from: k */
    public final j20 f8217k;

    /* renamed from: l */
    public final q60 f8218l;

    /* renamed from: m */
    public final Handler f8219m;

    /* renamed from: n */
    public final C0946cc f8220n;

    /* renamed from: com.daaw.e70$a */
    /* loaded from: classes.dex */
    public static class C1165a extends au1<View, Object> {
        public C1165a(View view) {
            super(view);
        }

        @Override // com.daaw.pj1
        /* renamed from: c */
        public void mo5506c(Object obj, f70<? super Object> f70Var) {
        }

        @Override // com.daaw.AbstractC3683ya, com.daaw.pj1
        /* renamed from: g */
        public void mo3967g(Exception exc, Drawable drawable) {
        }

        @Override // com.daaw.AbstractC3683ya, com.daaw.pj1
        /* renamed from: i */
        public void mo3965i(Drawable drawable) {
        }

        @Override // com.daaw.AbstractC3683ya, com.daaw.pj1
        /* renamed from: k */
        public void mo3963k(Drawable drawable) {
        }
    }

    public e70(C1336fx c1336fx, ep0 ep0Var, InterfaceC0832bc interfaceC0832bc, Context context, EnumC0988cq enumC0988cq) {
        an1 an1Var = new an1();
        this.f8213g = an1Var;
        this.f8208b = c1336fx;
        this.f8209c = interfaceC0832bc;
        this.f8210d = ep0Var;
        this.f8211e = enumC0988cq;
        this.f8207a = new d60(context);
        this.f8219m = new Handler(Looper.getMainLooper());
        this.f8220n = new C0946cc(ep0Var, interfaceC0832bc, enumC0988cq);
        C1971kp c1971kp = new C1971kp();
        this.f8214h = c1971kp;
        jg1 jg1Var = new jg1(interfaceC0832bc, enumC0988cq);
        c1971kp.m17566b(InputStream.class, Bitmap.class, jg1Var);
        w00 w00Var = new w00(interfaceC0832bc, enumC0988cq);
        c1971kp.m17566b(ParcelFileDescriptor.class, Bitmap.class, w00Var);
        gf0 gf0Var = new gf0(jg1Var, w00Var);
        c1971kp.m17566b(jf0.class, Bitmap.class, gf0Var);
        t60 t60Var = new t60(context, interfaceC0832bc);
        c1971kp.m17566b(InputStream.class, s60.class, t60Var);
        c1971kp.m17566b(jf0.class, k60.class, new hf0(gf0Var, t60Var, interfaceC0832bc));
        c1971kp.m17566b(InputStream.class, File.class, new ng1());
        m23677r(File.class, ParcelFileDescriptor.class, new y00.C3659a());
        m23677r(File.class, InputStream.class, new og1.C2439a());
        Class cls = Integer.TYPE;
        m23677r(cls, ParcelFileDescriptor.class, new a10.C0565a());
        m23677r(cls, InputStream.class, new sg1.C2938a());
        m23677r(Integer.class, ParcelFileDescriptor.class, new a10.C0565a());
        m23677r(Integer.class, InputStream.class, new sg1.C2938a());
        m23677r(String.class, ParcelFileDescriptor.class, new b10.C0801a());
        m23677r(String.class, InputStream.class, new tg1.C3074a());
        m23677r(Uri.class, ParcelFileDescriptor.class, new c10.C0910a());
        m23677r(Uri.class, InputStream.class, new vg1.C3329a());
        m23677r(URL.class, InputStream.class, new wg1.C3438a());
        m23677r(o70.class, InputStream.class, new yb0.C3685a());
        m23677r(byte[].class, InputStream.class, new lg1.C2038a());
        an1Var.m27331b(Bitmap.class, h70.class, new j70(context.getResources(), interfaceC0832bc));
        an1Var.m27331b(k60.class, l70.class, new l60(new j70(context.getResources(), interfaceC0832bc)));
        C2542pe c2542pe = new C2542pe(interfaceC0832bc);
        this.f8215i = c2542pe;
        this.f8216j = new q60(interfaceC0832bc, c2542pe);
        j20 j20Var = new j20(interfaceC0832bc);
        this.f8217k = j20Var;
        this.f8218l = new q60(interfaceC0832bc, j20Var);
    }

    /* renamed from: b */
    public static <T> mq0<T, ParcelFileDescriptor> m23693b(Class<T> cls, Context context) {
        return m23691d(cls, ParcelFileDescriptor.class, context);
    }

    /* renamed from: d */
    public static <T, Y> mq0<T, Y> m23691d(Class<T> cls, Class<Y> cls2, Context context) {
        if (cls == null) {
            return null;
        }
        return m23685j(context).m23680o().m24637a(cls, cls2);
    }

    /* renamed from: e */
    public static <T> mq0<T, InputStream> m23690e(Class<T> cls, Context context) {
        return m23691d(cls, InputStream.class, context);
    }

    /* renamed from: g */
    public static void m23688g(View view) {
        m23687h(new C1165a(view));
    }

    /* renamed from: h */
    public static void m23687h(pj1<?> pj1Var) {
        tq1.m8869b();
        l41 mo3964j = pj1Var.mo3964j();
        if (mo3964j != null) {
            mo3964j.clear();
            pj1Var.mo3968b(null);
        }
    }

    /* renamed from: j */
    public static e70 m23685j(Context context) {
        if (f8205o == null) {
            synchronized (e70.class) {
                if (f8205o == null) {
                    Context applicationContext = context.getApplicationContext();
                    k70 k70Var = new k70(applicationContext);
                    List<n70> m23678q = m23678q(applicationContext);
                    for (n70 n70Var : m23678q) {
                        n70Var.m15482a(applicationContext, k70Var);
                    }
                    f8205o = k70Var.m18009a();
                    for (n70 n70Var2 : m23678q) {
                        n70Var2.m15481b(applicationContext, f8205o);
                    }
                }
            }
        }
        return f8205o;
    }

    /* renamed from: q */
    public static List<n70> m23678q(Context context) {
        return f8206p ? new wm0(context).m6008a() : Collections.emptyList();
    }

    /* renamed from: t */
    public static r41 m23675t(Context context) {
        return t41.m9535f().m9537d(context);
    }

    /* renamed from: a */
    public <T, Z> InterfaceC1849jp<T, Z> m23694a(Class<T> cls, Class<Z> cls2) {
        return this.f8214h.m17567a(cls, cls2);
    }

    /* renamed from: c */
    public <R> pj1<R> m23692c(ImageView imageView, Class<R> cls) {
        return this.f8212f.m15201a(imageView, cls);
    }

    /* renamed from: f */
    public <Z, R> i51<Z, R> m23689f(Class<Z> cls, Class<R> cls2) {
        return this.f8213g.m27332a(cls, cls2);
    }

    /* renamed from: i */
    public void m23686i() {
        tq1.m8869b();
        this.f8210d.m23317d();
        this.f8209c.mo8068d();
    }

    /* renamed from: k */
    public InterfaceC0832bc m23684k() {
        return this.f8209c;
    }

    /* renamed from: l */
    public q60 m23683l() {
        return this.f8216j;
    }

    /* renamed from: m */
    public q60 m23682m() {
        return this.f8218l;
    }

    /* renamed from: n */
    public C1336fx m23681n() {
        return this.f8208b;
    }

    /* renamed from: o */
    public final d60 m23680o() {
        return this.f8207a;
    }

    /* renamed from: p */
    public Handler m23679p() {
        return this.f8219m;
    }

    /* renamed from: r */
    public <T, Y> void m23677r(Class<T> cls, Class<Y> cls2, nq0<T, Y> nq0Var) {
        nq0<T, Y> m24632f = this.f8207a.m24632f(cls, cls2, nq0Var);
        if (m24632f != null) {
            m24632f.mo3944b();
        }
    }

    /* renamed from: s */
    public void m23676s(int i) {
        tq1.m8869b();
        this.f8210d.mo3589c(i);
        this.f8209c.mo8069c(i);
    }
}
