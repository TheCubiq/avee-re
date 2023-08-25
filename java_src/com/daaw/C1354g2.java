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
/* renamed from: com.daaw.g2 */
/* loaded from: classes.dex */
public class C1354g2 {

    /* renamed from: a */
    public static final boolean f10157a = !br1.f5068a;

    /* renamed from: b */
    public static ww1<Object, File> f10158b = new ww1<>();

    /* renamed from: c */
    public static final Drawable f10159c = null;

    /* renamed from: com.daaw.g2$a */
    /* loaded from: classes.dex */
    public class C1355a implements pj1<l70> {

        /* renamed from: p */
        public final /* synthetic */ af0 f10160p;

        /* renamed from: q */
        public final /* synthetic */ String f10161q;

        /* renamed from: r */
        public final /* synthetic */ String f10162r;

        /* renamed from: s */
        public final /* synthetic */ ye0 f10163s;

        /* renamed from: t */
        public final /* synthetic */ int f10164t;

        /* renamed from: u */
        public final /* synthetic */ int f10165u;

        public C1355a(af0 af0Var, String str, String str2, ye0 ye0Var, int i, int i2) {
            this.f10160p = af0Var;
            this.f10161q = str;
            this.f10162r = str2;
            this.f10163s = ye0Var;
            this.f10164t = i;
            this.f10165u = i2;
        }

        @Override // com.daaw.qj0
        /* renamed from: a */
        public void mo3969a() {
        }

        @Override // com.daaw.pj1
        /* renamed from: b */
        public void mo3968b(l41 l41Var) {
        }

        @Override // com.daaw.pj1
        /* renamed from: d */
        public void mo5506c(l70 l70Var, f70 f70Var) {
            C1354g2.m22064y(this.f10160p, l70Var, this.f10161q, this.f10162r, this.f10163s);
        }

        @Override // com.daaw.pj1
        /* renamed from: e */
        public void mo13330e(sd1 sd1Var) {
            int i;
            int i2 = this.f10164t;
            if (i2 <= 0 || (i = this.f10165u) <= 0) {
                sd1Var.mo10453f(256, 256);
            } else {
                sd1Var.mo10453f(i2, i);
            }
        }

        @Override // com.daaw.pj1
        /* renamed from: g */
        public void mo3967g(Exception exc, Drawable drawable) {
            this.f10160p.mo5907b(null, this.f10161q, this.f10162r);
        }

        @Override // com.daaw.qj0
        /* renamed from: h */
        public void mo3966h() {
        }

        @Override // com.daaw.pj1
        /* renamed from: i */
        public void mo3965i(Drawable drawable) {
        }

        @Override // com.daaw.pj1
        /* renamed from: j */
        public l41 mo3964j() {
            return null;
        }

        @Override // com.daaw.pj1
        /* renamed from: k */
        public void mo3963k(Drawable drawable) {
        }

        @Override // com.daaw.qj0
        public void onDestroy() {
        }
    }

    /* renamed from: com.daaw.g2$b */
    /* loaded from: classes.dex */
    public class C1356b implements d51<jf0, k60> {

        /* renamed from: a */
        public final InterfaceC0832bc f10167a;

        /* renamed from: b */
        public Context f10168b;

        /* renamed from: c */
        public boolean f10169c;

        /* renamed from: d */
        public final String f10170d;

        /* renamed from: e */
        public final String f10171e;

        /* renamed from: f */
        public final int f10172f;

        /* renamed from: g */
        public final int f10173g;

        /* renamed from: h */
        public final boolean f10174h;

        /* renamed from: i */
        public String f10175i;

        public C1356b(InterfaceC0832bc interfaceC0832bc, Context context, boolean z, String str, String str2, int i, int i2, boolean z2) {
            this.f10167a = interfaceC0832bc;
            this.f10168b = context;
            this.f10169c = z;
            this.f10170d = str;
            this.f10171e = str2;
            this.f10172f = i;
            this.f10173g = i2;
            this.f10174h = z2;
            StringBuilder sb = new StringBuilder();
            sb.append("src:");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            sb.append("t:");
            sb.append(z2 ? "t" : "f");
            this.f10175i = sb.toString();
        }

        @Override // com.daaw.d51
        /* renamed from: d */
        public z41<k60> mo2793c(jf0 jf0Var, int i, int i2) {
            String str;
            Bitmap m22068u = (((this.f10172f & 4) != 0) || !this.f10174h || (str = this.f10170d) == null || str.length() <= 0) ? null : C1354g2.this.m22068u(this.f10170d);
            if (m22068u == null) {
                m22068u = C1354g2.this.m22065x(this.f10170d, this.f10171e, i, i2, this.f10172f, this.f10173g);
            }
            if (m22068u == null) {
                return null;
            }
            return new m60(new k60(C1073dc.m24559d(m22068u, this.f10167a), null));
        }

        @Override // com.daaw.d51
        public String getId() {
            return this.f10175i;
        }
    }

    /* renamed from: com.daaw.g2$c */
    /* loaded from: classes.dex */
    public class C1357c extends C1356b implements q41<Object, l70> {
        public C1357c(InterfaceC0832bc interfaceC0832bc, Context context, boolean z, String str, String str2, int i, int i2) {
            super(interfaceC0832bc, context, z, str, str2, i, i2, false);
        }

        @Override // com.daaw.q41
        /* renamed from: a */
        public boolean mo12777a(Exception exc, Object obj, pj1<l70> pj1Var, boolean z) {
            C2982su m11770u = C1354g2.this.m22076m(this.f10168b).m11770u(Integer.valueOf((int) R.drawable.dot1x1));
            if (!this.f10169c) {
                m11770u = m11770u.mo9853y(true);
            }
            m11770u.mo9858i(this).mo9854x(new bh1(this.f10175i)).mo9857j(EnumC3465wt.NONE).m22906r(pj1Var);
            return true;
        }

        @Override // com.daaw.q41
        /* renamed from: e */
        public boolean mo12776b(l70 l70Var, Object obj, pj1<l70> pj1Var, boolean z, boolean z2) {
            return false;
        }
    }

    /* renamed from: n */
    public static /* synthetic */ l70 m22075n(C2982su c2982su, int i, int i2, ir1 ir1Var) {
        try {
            return c2982su.m22907o(i, i2).get(9000L, TimeUnit.MILLISECONDS);
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

    /* renamed from: p */
    public static /* synthetic */ void m22073p(l31 l31Var, l31 l31Var2) {
        l31Var.f16995a = null;
        T t = l31Var2.f16995a;
        if (t != 0) {
            ((Bitmap) t).recycle();
        }
        l31Var2.f16995a = null;
    }

    /* renamed from: q */
    public static /* synthetic */ Bitmap m22072q(Object obj, r60 r60Var, ye0 ye0Var, l31 l31Var, l31 l31Var2) {
        Bitmap m7192d;
        synchronized (obj) {
            m7192d = C3328vg.m7192d(r60Var.m11720i(), ye0Var, l31Var, l31Var2);
        }
        return m7192d;
    }

    /* renamed from: r */
    public static /* synthetic */ void m22071r(Object obj, l31 l31Var, l31 l31Var2) {
        synchronized (obj) {
            l31Var.f16995a = null;
            T t = l31Var2.f16995a;
            if (t != 0) {
                ((Bitmap) t).recycle();
            }
            l31Var2.f16995a = null;
        }
    }

    /* renamed from: y */
    public static void m22064y(af0 af0Var, l70 l70Var, String str, String str2, final ye0 ye0Var) {
        df0 ef0Var;
        if (l70Var == null) {
            af0Var.mo5907b(new df0(null), str, str2);
            return;
        }
        if (l70Var instanceof h70) {
            final l31 l31Var = new l31(null);
            final l31 l31Var2 = new l31(null);
            ef0Var = new df0(C3328vg.m7192d(((h70) l70Var).m20983d(), ye0Var, l31Var2, l31Var), new InterfaceC1492h0() { // from class: com.daaw.a2
                @Override // com.daaw.InterfaceC1492h0
                /* renamed from: a */
                public final void mo3002a() {
                    C1354g2.m22073p(l31.this, l31Var2);
                }
            });
        } else if (!(l70Var instanceof s60)) {
            return;
        } else {
            s60 s60Var = (s60) l70Var;
            final r60 m10682e = s60Var.m10682e();
            final Object obj = new Object();
            final l31 l31Var3 = new l31(null);
            final l31 l31Var4 = new l31(null);
            Bitmap m10681f = s60Var.m10681f();
            Objects.requireNonNull(m10682e);
            ef0Var = new ef0(m10681f, new w40() { // from class: com.daaw.c2
                @Override // com.daaw.w40
                /* renamed from: a */
                public final Object mo3478a() {
                    return Integer.valueOf(r60.this.m11723f());
                }
            }, new InterfaceC1492h0() { // from class: com.daaw.z1
                @Override // com.daaw.InterfaceC1492h0
                /* renamed from: a */
                public final void mo3002a() {
                    r60.this.m11716m();
                }
            }, new InterfaceC1492h0() { // from class: com.daaw.y1
                @Override // com.daaw.InterfaceC1492h0
                /* renamed from: a */
                public final void mo3002a() {
                    r60.this.m11728a();
                }
            }, new w40() { // from class: com.daaw.d2
                @Override // com.daaw.w40
                /* renamed from: a */
                public final Object mo3478a() {
                    Bitmap m22072q;
                    m22072q = C1354g2.m22072q(obj, m10682e, ye0Var, l31Var4, l31Var3);
                    return m22072q;
                }
            }, new InterfaceC1492h0() { // from class: com.daaw.b2
                @Override // com.daaw.InterfaceC1492h0
                /* renamed from: a */
                public final void mo3002a() {
                    C1354g2.m22071r(obj, l31Var3, l31Var4);
                }
            });
        }
        af0Var.mo5907b(ef0Var, str, str2);
    }

    /* renamed from: A */
    public C2982su<?> m22091A(Uri uri, boolean z, InterfaceC0832bc interfaceC0832bc, Context context, boolean z2, String str, String str2, int i, int i2) {
        C2982su<Uri> mo9857j = m22076m(context).m11771t(uri).m9866N(R.drawable.placeholderart4).m9871I(R.drawable.placeholderart4).mo9857j(EnumC3465wt.NONE);
        if (z) {
            mo9857j.m9870J();
        }
        C1357c c1357c = new C1357c(interfaceC0832bc, context, z2, str, str2, i, i2);
        mo9857j.mo9854x(new bh1(c1357c.f10175i));
        mo9857j.m9869K(c1357c);
        mo9857j.mo9858i(m22077l(context, interfaceC0832bc));
        return mo9857j;
    }

    /* renamed from: B */
    public C2982su<?> m22090B(Integer num, boolean z, InterfaceC0832bc interfaceC0832bc, Context context, boolean z2, String str, String str2, int i, int i2) {
        C2982su<Integer> mo9857j = m22076m(context).m11770u(num).m9866N(R.drawable.placeholderart4).m9871I(R.drawable.placeholderart4).mo9857j(EnumC3465wt.NONE);
        if (z) {
            mo9857j.m9870J();
        }
        C1357c c1357c = new C1357c(interfaceC0832bc, context, z2, str, str2, i, i2);
        mo9857j.mo9854x(new bh1(c1357c.f10175i));
        mo9857j.m9869K(c1357c);
        return mo9857j;
    }

    /* renamed from: C */
    public final boolean m22089C(String str) {
        Uri parse;
        if (str == null || str.length() <= 0 || (parse = Uri.parse(str)) == null) {
            return false;
        }
        return "mp3".equals(cr1.m25070j(parse.getPath()));
    }

    /* renamed from: j */
    public void m22079j(ImageView imageView) {
        e70.m23688g(imageView);
    }

    /* renamed from: k */
    public final InterfaceC0832bc m22078k(Context context) {
        return e70.m23685j(context).m23684k();
    }

    /* renamed from: l */
    public final d51<jf0, k60> m22077l(Context context, InterfaceC0832bc interfaceC0832bc) {
        EnumC0988cq enumC0988cq = EnumC0988cq.PREFER_ARGB_8888;
        return new n60(new ff0(new kg1(interfaceC0832bc, enumC0988cq), new x00(interfaceC0832bc, enumC0988cq)), new c70(context, interfaceC0832bc), interfaceC0832bc);
    }

    /* renamed from: m */
    public final r41 m22076m(Context context) {
        return e70.m23675t(context);
    }

    /* renamed from: s */
    public final void m22070s(boolean z, Uri uri, final String str, String str2, final af0 af0Var, final int i, final int i2, int i3, int i4, boolean z2, final ye0 ye0Var, Object obj) {
        Context context;
        String str3;
        l70 l70Var;
        String str4;
        final C2982su<?> c2982su;
        String str5;
        String str6;
        ye0 ye0Var2;
        l70 l70Var2;
        String str7;
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        final String decode = Uri.decode(uri.toString());
        Bitmap m22066w = m22066w(m23837e, uri, i, i2);
        if (m22066w != null) {
            af0Var.mo5907b(new df0(m22066w), decode, str);
            return;
        }
        boolean m22089C = m22089C(decode);
        C1355a c1355a = new C1355a(af0Var, decode, str, ye0Var, i, i2);
        af0Var.mo5908a(c1355a);
        String str8 = (i3 & 4) != 0 ? "file://" : str;
        boolean z3 = Looper.myLooper() == Looper.getMainLooper();
        InterfaceC0832bc m22078k = m22078k(m23837e);
        int m12555a = qg0.m12555a(str8);
        if (m12555a > 0) {
            context = m23837e;
            c2982su = m22090B(Integer.valueOf(m12555a), true, m22078k, m23837e, z2, decode, str2, i3, i4);
            c2982su.m9872H();
            str4 = str8;
            str3 = "file://";
            l70Var = null;
        } else {
            context = m23837e;
            if (str8 != null && str8.length() > 0) {
                String m13321a = pk0.m13321a(str8);
                if (obj != null && m13321a != null) {
                    String absolutePath = new File(f10158b.m5753a(obj, null), m13321a).getAbsolutePath();
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
                    c2982su = m22091A(Uri.parse(str9), true, m22078k, context, z2, decode, str2, i3, i4);
                    c2982su.m9872H();
                    str4 = str9;
                }
            }
            str3 = "file://";
            l70Var = null;
            str4 = str8;
            c2982su = null;
        }
        if (c2982su == null) {
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
            c2982su = m22089C ? m22063z(true, m22078k, context, z2, decode, str2, i3, i4) : m22091A(Uri.parse(str10), true, m22078k, context, z2, decode, str2, i3, i4);
            c2982su.m9872H();
        }
        if (z3) {
            c2982su.m22906r(c1355a);
        } else if (!z) {
            new ir1(new ir1.InterfaceC1751c() { // from class: com.daaw.f2
                @Override // com.daaw.ir1.InterfaceC1751c
                /* renamed from: a */
                public final Object mo9328a(ir1 ir1Var) {
                    l70 m22075n;
                    m22075n = C1354g2.m22075n(C2982su.this, i, i2, ir1Var);
                    return m22075n;
                }
            }).m19487b(new ir1.InterfaceC1750b() { // from class: com.daaw.e2
                @Override // com.daaw.ir1.InterfaceC1750b
                /* renamed from: a */
                public final void mo15140a(Object obj2, boolean z4) {
                    C1354g2.m22064y(af0.this, (l70) obj2, decode, str, ye0Var);
                }
            });
        } else {
            try {
                l70Var2 = c2982su.m22907o(i, i2).get(1500L, TimeUnit.MILLISECONDS);
                str6 = decode;
                ye0Var2 = ye0Var;
            } catch (Exception e) {
                lz1.m16363c(e.getMessage());
                str6 = decode;
                ye0Var2 = ye0Var;
                l70Var2 = l70Var;
            }
            m22064y(af0Var, l70Var2, str6, str, ye0Var2);
        }
    }

    /* renamed from: t */
    public void m22069t(Uri uri, String str, String str2, ImageView imageView, boolean z) {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        Bitmap m22066w = m22066w(m23837e, uri, imageView.getWidth(), imageView.getHeight());
        if (m22066w != null) {
            imageView.setImageBitmap(m22066w);
            return;
        }
        String decode = Uri.decode(uri.toString());
        boolean m22089C = m22089C(decode);
        if (str != null && str.length() > 0 && str.charAt(0) == '/') {
            str = "file://" + str;
        }
        Uri parse = Uri.parse(str != null ? str : "file://");
        InterfaceC0832bc m22078k = m22078k(m23837e);
        (m22089C ? m22063z(z, m22078k, m23837e, true, decode, str2, 0, -1) : m22091A(parse, z, m22078k, m23837e, true, decode, str2, 0, -1)).mo9856p(imageView);
    }

    /* renamed from: u */
    public final Bitmap m22068u(String str) {
        byte[] mo17286a;
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                uq0 uq0Var = new uq0(parse.getPath());
                if (!uq0Var.m7824f() || (mo17286a = uq0Var.m7826d().mo17286a()) == null) {
                    return null;
                }
                return BitmapFactory.decodeStream(new ByteArrayInputStream(mo17286a));
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: v */
    public void m22067v(boolean z, Uri uri, String str, String str2, af0 af0Var, int i, int i2, int i3, int i4, boolean z2, ye0 ye0Var, Object obj) {
        int i5 = i2;
        int i6 = i;
        if (i6 < 2) {
            i6 = Math.max(2, Math.max(i, i2));
        }
        int i7 = i6;
        if (i5 < 2) {
            i5 = Math.max(2, Math.max(i7, i5));
        }
        m22070s(z, uri, str, str2, af0Var, i7, i5, i3, i4, z2, ye0Var, obj);
    }

    /* renamed from: w */
    public final Bitmap m22066w(Context context, Uri uri, int i, int i2) {
        if (f10157a) {
            boolean z = i < 1;
            boolean z2 = i2 < 1;
            if (z2 || z) {
                lz1.m16363c("Dimensions were too small");
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
                lz1.m16364b(e, "");
            }
        }
        return null;
    }

    /* renamed from: x */
    public final Bitmap m22065x(String str, String str2, int i, int i2, int i3, int i4) {
        Bitmap m13203a;
        Uri parse = Uri.parse(str);
        boolean z = (i3 & 1) != 0;
        boolean z2 = (i3 & 4) != 0;
        boolean z3 = (i3 & 2) != 0;
        if (!z2 && parse != null) {
            String path = parse.getPath();
            String m25070j = cr1.m25070j(path);
            if (!"mp3".equals(m25070j) && !"wav".equals(m25070j) && !"ogg".equals(m25070j) && (m13203a = pr0.m13203a(path, 3)) != null) {
                return m13203a;
            }
        }
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        float[] fArr = new float[3];
        C3838zg.m2350d(i4, fArr);
        if (fArr[2] > 0.99f) {
            fArr[1] = 1.0f;
        }
        int alpha = Color.alpha(i4);
        float m16081e = (md1.m16081e(str2.charAt(0)) * 360.0f) + (z ? 15.0f : 0.0f);
        return md1.m16083c(i, i2, str2, C3838zg.m2344j(C3838zg.m2353a(new float[]{0.0f + m16081e, 0.2f, 1.0f}), z3 ? 0 : 255), C3838zg.m2344j(C3838zg.m2353a(new float[]{m16081e, 0.9f, fArr[2] * 0.6f}), alpha), C3838zg.m2344j(C3838zg.m2353a(new float[]{(((int) m16081e) + 30) % 360, 0.9f, fArr[2] * 0.4f}), alpha), f10159c);
    }

    /* renamed from: z */
    public C2982su<?> m22063z(boolean z, InterfaceC0832bc interfaceC0832bc, Context context, boolean z2, String str, String str2, int i, int i2) {
        C2982su m11770u = m22076m(context).m11770u(Integer.valueOf((int) R.drawable.ic_launcher));
        m11770u.m9866N(R.drawable.placeholderart4);
        m11770u.m9871I(R.drawable.placeholderart4);
        if (z) {
            m11770u.m9870J();
        }
        if (!z2) {
            m11770u = m11770u.mo9853y(true);
        }
        C2982su c2982su = m11770u;
        C1356b c1356b = new C1356b(interfaceC0832bc, context, z2, str, str2, i, i2, true);
        c2982su.mo9854x(new bh1(c1356b.f10175i));
        c2982su.mo9858i(c1356b);
        c2982su.mo9857j(EnumC3465wt.NONE);
        return c2982su;
    }
}
