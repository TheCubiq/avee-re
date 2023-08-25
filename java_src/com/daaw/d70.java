package com.daaw;

import android.graphics.Bitmap;
import android.util.Log;
import com.daaw.r60;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class d70 implements e51<s60> {

    /* renamed from: d */
    public static final C1058a f6569d = new C1058a();

    /* renamed from: a */
    public final r60.InterfaceC2829a f6570a;

    /* renamed from: b */
    public final InterfaceC0832bc f6571b;

    /* renamed from: c */
    public final C1058a f6572c;

    /* renamed from: com.daaw.d70$a */
    /* loaded from: classes.dex */
    public static class C1058a {
        /* renamed from: a */
        public r60 m24614a(r60.InterfaceC2829a interfaceC2829a) {
            return new r60(interfaceC2829a);
        }

        /* renamed from: b */
        public C0912c3 m24613b() {
            return new C0912c3();
        }

        /* renamed from: c */
        public z41<Bitmap> m24612c(Bitmap bitmap, InterfaceC0832bc interfaceC0832bc) {
            return new C1073dc(bitmap, interfaceC0832bc);
        }

        /* renamed from: d */
        public b70 m24611d() {
            return new b70();
        }
    }

    public d70(InterfaceC0832bc interfaceC0832bc) {
        this(interfaceC0832bc, f6569d);
    }

    public d70(InterfaceC0832bc interfaceC0832bc, C1058a c1058a) {
        this.f6571b = interfaceC0832bc;
        this.f6570a = new j60(interfaceC0832bc);
        this.f6572c = c1058a;
    }

    /* renamed from: b */
    public final r60 m24618b(byte[] bArr) {
        b70 m24611d = this.f6572c.m24611d();
        m24611d.m26427o(bArr);
        a70 m26439c = m24611d.m26439c();
        r60 m24614a = this.f6572c.m24614a(this.f6570a);
        m24614a.m11714o(m26439c, bArr);
        m24614a.m11728a();
        return m24614a;
    }

    @Override // com.daaw.InterfaceC3911zw
    /* renamed from: c */
    public boolean mo1827a(z41<s60> z41Var, OutputStream outputStream) {
        long m18440b = jl0.m18440b();
        s60 s60Var = z41Var.get();
        cn1<Bitmap> m10679h = s60Var.m10679h();
        if (m10679h instanceof np1) {
            return m24615e(s60Var.m10683d(), outputStream);
        }
        r60 m24618b = m24618b(s60Var.m10683d());
        C0912c3 m24613b = this.f6572c.m24613b();
        if (m24613b.m25662h(outputStream)) {
            for (int i = 0; i < m24618b.m11723f(); i++) {
                z41<Bitmap> m24616d = m24616d(m24618b.m11720i(), m10679h, s60Var);
                try {
                    if (!m24613b.m25669a(m24616d.get())) {
                        return false;
                    }
                    m24613b.m25664f(m24618b.m11724e(m24618b.m11725d()));
                    m24618b.m11728a();
                    m24616d.mo2827c();
                } finally {
                    m24616d.mo2827c();
                }
            }
            boolean m25666d = m24613b.m25666d();
            if (Log.isLoggable("GifEncoder", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encoded gif with ");
                sb.append(m24618b.m11723f());
                sb.append(" frames and ");
                sb.append(s60Var.m10683d().length);
                sb.append(" bytes in ");
                sb.append(jl0.m18441a(m18440b));
                sb.append(" ms");
            }
            return m25666d;
        }
        return false;
    }

    /* renamed from: d */
    public final z41<Bitmap> m24616d(Bitmap bitmap, cn1<Bitmap> cn1Var, s60 s60Var) {
        z41<Bitmap> m24612c = this.f6572c.m24612c(bitmap, this.f6571b);
        z41<Bitmap> mo7395a = cn1Var.mo7395a(m24612c, s60Var.getIntrinsicWidth(), s60Var.getIntrinsicHeight());
        if (!m24612c.equals(mo7395a)) {
            m24612c.mo2827c();
        }
        return mo7395a;
    }

    /* renamed from: e */
    public final boolean m24615e(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.daaw.InterfaceC3911zw
    public String getId() {
        return "";
    }
}
