package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.Size;
import android.widget.ImageView;
import com.daaw.avee.R;
import com.daaw.ir1;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class g2 {
    public static final boolean a = !br1.a;
    public static ww1<Object, File> b = new ww1<>();
    public static final Drawable c = null;

    /* loaded from: classes.dex */
    public class a implements pj1<l70> {
        public final /* synthetic */ af0 p;
        public final /* synthetic */ String q;
        public final /* synthetic */ String r;
        public final /* synthetic */ ye0 s;
        public final /* synthetic */ int t;
        public final /* synthetic */ int u;

        public a(af0 af0Var, String str, String str2, ye0 ye0Var, int i, int i2) {
            this.p = af0Var;
            this.q = str;
            this.r = str2;
            this.s = ye0Var;
            this.t = i;
            this.u = i2;
        }

        @Override // com.daaw.qj0
        public void a() {
        }

        @Override // com.daaw.pj1
        public void b(l41 l41Var) {
        }

        @Override // com.daaw.pj1
        /* renamed from: d */
        public void c(l70 l70Var, f70 f70Var) {
            g2.y(this.p, l70Var, this.q, this.r, this.s);
        }

        @Override // com.daaw.pj1
        public void e(sd1 sd1Var) {
            int i;
            int i2 = this.t;
            if (i2 <= 0 || (i = this.u) <= 0) {
                sd1Var.f(256, 256);
            } else {
                sd1Var.f(i2, i);
            }
        }

        @Override // com.daaw.pj1
        public void g(Exception exc, Drawable drawable) {
            this.p.b(null, this.q, this.r);
        }

        @Override // com.daaw.qj0
        public void h() {
        }

        @Override // com.daaw.pj1
        public void i(Drawable drawable) {
        }

        @Override // com.daaw.pj1
        public l41 j() {
            return null;
        }

        @Override // com.daaw.pj1
        public void k(Drawable drawable) {
        }

        @Override // com.daaw.qj0
        public void onDestroy() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements d51<jf0, k60> {
        public final bc a;
        public Context b;
        public boolean c;
        public final String d;
        public final String e;
        public final int f;
        public final int g;
        public final boolean h;
        public String i;

        public b(bc bcVar, Context context, boolean z, String str, String str2, int i, int i2, boolean z2) {
            this.a = bcVar;
            this.b = context;
            this.c = z;
            this.d = str;
            this.e = str2;
            this.f = i;
            this.g = i2;
            this.h = z2;
            StringBuilder sb = new StringBuilder();
            sb.append("src:");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            sb.append("t:");
            sb.append(z2 ? "t" : "f");
            this.i = sb.toString();
        }

        @Override // com.daaw.d51
        /* renamed from: d */
        public z41<k60> c(jf0 jf0Var, int i, int i2) {
            String str;
            Bitmap u = (((this.f & 4) != 0) || !this.h || (str = this.d) == null || str.length() <= 0) ? null : g2.this.u(this.d);
            if (u == null) {
                u = g2.this.x(this.d, this.e, i, i2, this.f, this.g);
            }
            if (u == null) {
                return null;
            }
            return new m60(new k60(dc.d(u, this.a), null));
        }

        @Override // com.daaw.d51
        public String getId() {
            return this.i;
        }
    }

    /* loaded from: classes.dex */
    public class c extends b implements q41<Object, l70> {
        public c(bc bcVar, Context context, boolean z, String str, String str2, int i, int i2) {
            super(bcVar, context, z, str, str2, i, i2, false);
        }

        @Override // com.daaw.q41
        public boolean a(Exception exc, Object obj, pj1<l70> pj1Var, boolean z) {
            su u = g2.this.m(this.b).u(Integer.valueOf((int) R.drawable.dot1x1));
            if (!this.c) {
                u = u.y(true);
            }
            u.i(this).x(new bh1(this.i)).j(wt.NONE).r(pj1Var);
            return true;
        }

        @Override // com.daaw.q41
        /* renamed from: e */
        public boolean b(l70 l70Var, Object obj, pj1<l70> pj1Var, boolean z, boolean z2) {
            return false;
        }
    }

    public static /* synthetic */ l70 n(su suVar, int i, int i2, ir1 ir1Var) {
        try {
            return suVar.o(i, i2).get(9000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            return null;
        } catch (TimeoutException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ void p(l31 l31Var, l31 l31Var2) {
        l31Var.a = null;
        T t = l31Var2.a;
        if (t != 0) {
            ((Bitmap) t).recycle();
        }
        l31Var2.a = null;
    }

    public static /* synthetic */ Bitmap q(Object obj, r60 r60Var, ye0 ye0Var, l31 l31Var, l31 l31Var2) {
        Bitmap d;
        synchronized (obj) {
            d = vg.d(r60Var.i(), ye0Var, l31Var, l31Var2);
        }
        return d;
    }

    public static /* synthetic */ void r(Object obj, l31 l31Var, l31 l31Var2) {
        synchronized (obj) {
            l31Var.a = null;
            T t = l31Var2.a;
            if (t != 0) {
                ((Bitmap) t).recycle();
            }
            l31Var2.a = null;
        }
    }

    public static void y(af0 af0Var, l70 l70Var, String str, String str2, final ye0 ye0Var) {
        df0 ef0Var;
        if (l70Var == null) {
            af0Var.b(new df0(null), str, str2);
            return;
        }
        if (l70Var instanceof h70) {
            final l31 l31Var = new l31(null);
            final l31 l31Var2 = new l31(null);
            ef0Var = new df0(vg.d(((h70) l70Var).d(), ye0Var, l31Var2, l31Var), new h0() { // from class: com.daaw.a2
                @Override // com.daaw.h0
                public final void a() {
                    g2.p(l31.this, l31Var2);
                }
            });
        } else if (!(l70Var instanceof s60)) {
            return;
        } else {
            s60 s60Var = (s60) l70Var;
            final r60 e = s60Var.e();
            final Object obj = new Object();
            final l31 l31Var3 = new l31(null);
            final l31 l31Var4 = new l31(null);
            Bitmap f = s60Var.f();
            Objects.requireNonNull(e);
            ef0Var = new ef0(f, new w40() { // from class: com.daaw.c2
                @Override // com.daaw.w40
                public final Object a() {
                    return Integer.valueOf(r60.this.f());
                }
            }, new h0() { // from class: com.daaw.z1
                @Override // com.daaw.h0
                public final void a() {
                    r60.this.m();
                }
            }, new h0() { // from class: com.daaw.y1
                @Override // com.daaw.h0
                public final void a() {
                    r60.this.a();
                }
            }, new w40() { // from class: com.daaw.d2
                @Override // com.daaw.w40
                public final Object a() {
                    Bitmap q;
                    q = g2.q(obj, e, ye0Var, l31Var4, l31Var3);
                    return q;
                }
            }, new h0() { // from class: com.daaw.b2
                @Override // com.daaw.h0
                public final void a() {
                    g2.r(obj, l31Var3, l31Var4);
                }
            });
        }
        af0Var.b(ef0Var, str, str2);
    }

    public su<?> A(Uri uri, boolean z, bc bcVar, Context context, boolean z2, String str, String str2, int i, int i2) {
        su<Uri> j = m(context).t(uri).N(R.drawable.placeholderart4).I(R.drawable.placeholderart4).j(wt.NONE);
        if (z) {
            j.J();
        }
        c cVar = new c(bcVar, context, z2, str, str2, i, i2);
        j.x(new bh1(cVar.i));
        j.K(cVar);
        j.i(l(context, bcVar));
        return j;
    }

    public su<?> B(Integer num, boolean z, bc bcVar, Context context, boolean z2, String str, String str2, int i, int i2) {
        su<Integer> j = m(context).u(num).N(R.drawable.placeholderart4).I(R.drawable.placeholderart4).j(wt.NONE);
        if (z) {
            j.J();
        }
        c cVar = new c(bcVar, context, z2, str, str2, i, i2);
        j.x(new bh1(cVar.i));
        j.K(cVar);
        return j;
    }

    public final boolean C(String str) {
        Uri parse;
        if (str == null || str.length() <= 0 || (parse = Uri.parse(str)) == null) {
            return false;
        }
        return "mp3".equals(cr1.j(parse.getPath()));
    }

    public void j(ImageView imageView) {
        e70.g(imageView);
    }

    public final bc k(Context context) {
        return e70.j(context).k();
    }

    public final d51<jf0, k60> l(Context context, bc bcVar) {
        cq cqVar = cq.PREFER_ARGB_8888;
        return new n60(new ff0(new kg1(bcVar, cqVar), new x00(bcVar, cqVar)), new c70(context, bcVar), bcVar);
    }

    public final r41 m(Context context) {
        return e70.t(context);
    }

    public final void s(boolean z, Uri uri, final String str, String str2, final af0 af0Var, final int i, final int i2, int i3, int i4, boolean z2, final ye0 ye0Var, Object obj) {
        Context context;
        String str3;
        l70 l70Var;
        String str4;
        final su<?> suVar;
        String str5;
        String str6;
        ye0 ye0Var2;
        l70 l70Var2;
        String str7;
        Context e = dx0.e();
        if (e == null) {
            return;
        }
        final String decode = Uri.decode(uri.toString());
        Bitmap w = w(e, uri, i, i2);
        if (w != null) {
            af0Var.b(new df0(w), decode, str);
            return;
        }
        boolean C = C(decode);
        a aVar = new a(af0Var, decode, str, ye0Var, i, i2);
        af0Var.a(aVar);
        String str8 = (i3 & 4) != 0 ? "file://" : str;
        boolean z3 = Looper.myLooper() == Looper.getMainLooper();
        bc k = k(e);
        int a2 = qg0.a(str8);
        if (a2 > 0) {
            context = e;
            suVar = B(Integer.valueOf(a2), true, k, e, z2, decode, str2, i3, i4);
            suVar.H();
            str4 = str8;
            str3 = "file://";
            l70Var = null;
        } else {
            context = e;
            if (str8 != null && str8.length() > 0) {
                String a3 = pk0.a(str8);
                if (obj != null && a3 != null) {
                    String absolutePath = new File(b.a(obj, null), a3).getAbsolutePath();
                    if (absolutePath == null || absolutePath.length() <= 0) {
                        str5 = "file://";
                    } else if (absolutePath.charAt(0) == '/') {
                        StringBuilder sb = new StringBuilder();
                        str5 = "file://";
                        sb.append(str5);
                        sb.append(absolutePath);
                        absolutePath = sb.toString();
                    } else {
                        str5 = "file://";
                    }
                    String str9 = absolutePath;
                    str3 = str5;
                    l70Var = null;
                    suVar = A(Uri.parse(str9), true, k, context, z2, decode, str2, i3, i4);
                    suVar.H();
                    str4 = str9;
                }
            }
            str3 = "file://";
            l70Var = null;
            str4 = str8;
            suVar = null;
        }
        if (suVar == null) {
            if (str4 == null || str4.length() <= 0 || str4.charAt(0) != '/') {
                str7 = str3;
            } else {
                StringBuilder sb2 = new StringBuilder();
                str7 = str3;
                sb2.append(str7);
                sb2.append(str);
                str4 = sb2.toString();
            }
            String str10 = str4;
            if (str10 == null || str10.length() <= 0) {
                str10 = str7;
            }
            suVar = C ? z(true, k, context, z2, decode, str2, i3, i4) : A(Uri.parse(str10), true, k, context, z2, decode, str2, i3, i4);
            suVar.H();
        }
        if (z3) {
            suVar.r(aVar);
        } else if (!z) {
            new ir1(new ir1.c() { // from class: com.daaw.f2
                @Override // com.daaw.ir1.c
                public final Object a(ir1 ir1Var) {
                    l70 n;
                    n = g2.n(su.this, i, i2, ir1Var);
                    return n;
                }
            }).b(new ir1.b() { // from class: com.daaw.e2
                @Override // com.daaw.ir1.b
                public final void a(Object obj2, boolean z4) {
                    g2.y(af0.this, (l70) obj2, decode, str, ye0Var);
                }
            });
        } else {
            try {
                l70Var2 = suVar.o(i, i2).get(1500L, TimeUnit.MILLISECONDS);
                str6 = decode;
                ye0Var2 = ye0Var;
            } catch (Exception e2) {
                lz1.c(e2.getMessage());
                str6 = decode;
                ye0Var2 = ye0Var;
                l70Var2 = l70Var;
            }
            y(af0Var, l70Var2, str6, str, ye0Var2);
        }
    }

    public void t(Uri uri, String str, String str2, ImageView imageView, boolean z) {
        Context e = dx0.e();
        if (e == null) {
            return;
        }
        Bitmap w = w(e, uri, imageView.getWidth(), imageView.getHeight());
        if (w != null) {
            imageView.setImageBitmap(w);
            return;
        }
        String decode = Uri.decode(uri.toString());
        boolean C = C(decode);
        if (str != null && str.length() > 0 && str.charAt(0) == '/') {
            str = "file://" + str;
        }
        Uri parse = Uri.parse(str != null ? str : "file://");
        bc k = k(e);
        (C ? z(z, k, e, true, decode, str2, 0, -1) : A(parse, z, k, e, true, decode, str2, 0, -1)).p(imageView);
    }

    public final Bitmap u(String str) {
        byte[] a2;
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                uq0 uq0Var = new uq0(parse.getPath());
                if (!uq0Var.f() || (a2 = uq0Var.d().a()) == null) {
                    return null;
                }
                return BitmapFactory.decodeStream(new ByteArrayInputStream(a2));
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void v(boolean z, Uri uri, String str, String str2, af0 af0Var, int i, int i2, int i3, int i4, boolean z2, ye0 ye0Var, Object obj) {
        int i5 = i2;
        int i6 = i;
        if (i6 < 2) {
            i6 = Math.max(2, Math.max(i, i2));
        }
        int i7 = i6;
        if (i5 < 2) {
            i5 = Math.max(2, Math.max(i7, i5));
        }
        s(z, uri, str, str2, af0Var, i7, i5, i3, i4, z2, ye0Var, obj);
    }

    public final Bitmap w(Context context, Uri uri, int i, int i2) {
        if (a) {
            boolean z = i < 1;
            boolean z2 = i2 < 1;
            if (z2 || z) {
                lz1.c("Dimensions were too small");
            }
            if (z) {
                i = 200;
            }
            if (z2) {
                i2 = 200;
            }
            try {
                return context.getContentResolver().loadThumbnail(uri, new Size(i, i2), null);
            } catch (IOException e) {
                lz1.b(e, "");
            }
        }
        return null;
    }

    public final Bitmap x(String str, String str2, int i, int i2, int i3, int i4) {
        Bitmap a2;
        Uri parse = Uri.parse(str);
        boolean z = (i3 & 1) != 0;
        boolean z2 = (i3 & 4) != 0;
        boolean z3 = (i3 & 2) != 0;
        if (!z2 && parse != null) {
            String path = parse.getPath();
            String j = cr1.j(path);
            if (!"mp3".equals(j) && !"wav".equals(j) && !"ogg".equals(j) && (a2 = pr0.a(path, 3)) != null) {
                return a2;
            }
        }
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        float[] fArr = new float[3];
        zg.d(i4, fArr);
        if (fArr[2] > 0.99f) {
            fArr[1] = 1.0f;
        }
        int alpha = Color.alpha(i4);
        float e = (md1.e(str2.charAt(0)) * 360.0f) + (z ? 15.0f : 0.0f);
        return md1.c(i, i2, str2, zg.j(zg.a(new float[]{0.0f + e, 0.2f, 1.0f}), z3 ? 0 : 255), zg.j(zg.a(new float[]{e, 0.9f, fArr[2] * 0.6f}), alpha), zg.j(zg.a(new float[]{(((int) e) + 30) % 360, 0.9f, fArr[2] * 0.4f}), alpha), c);
    }

    public su<?> z(boolean z, bc bcVar, Context context, boolean z2, String str, String str2, int i, int i2) {
        su u = m(context).u(Integer.valueOf((int) R.drawable.ic_launcher));
        u.N(R.drawable.placeholderart4);
        u.I(R.drawable.placeholderart4);
        if (z) {
            u.J();
        }
        if (!z2) {
            u = u.y(true);
        }
        su suVar = u;
        b bVar = new b(bcVar, context, z2, str, str2, i, i2, true);
        suVar.x(new bh1(bVar.i));
        suVar.i(bVar);
        suVar.j(wt.NONE);
        return suVar;
    }
}
