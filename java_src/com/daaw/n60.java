package com.daaw;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.InputStream;
/* loaded from: classes.dex */
public class n60 implements d51<jf0, k60> {

    /* renamed from: g */
    public static final C2250b f19497g = new C2250b();

    /* renamed from: h */
    public static final C2249a f19498h = new C2249a();

    /* renamed from: a */
    public final d51<jf0, Bitmap> f19499a;

    /* renamed from: b */
    public final d51<InputStream, s60> f19500b;

    /* renamed from: c */
    public final InterfaceC0832bc f19501c;

    /* renamed from: d */
    public final C2250b f19502d;

    /* renamed from: e */
    public final C2249a f19503e;

    /* renamed from: f */
    public String f19504f;

    /* renamed from: com.daaw.n60$a */
    /* loaded from: classes.dex */
    public static class C2249a {
        /* renamed from: a */
        public InputStream m15504a(InputStream inputStream, byte[] bArr) {
            return new k31(inputStream, bArr);
        }
    }

    /* renamed from: com.daaw.n60$b */
    /* loaded from: classes.dex */
    public static class C2250b {
        /* renamed from: a */
        public ImageHeaderParser.ImageType m15503a(InputStream inputStream) {
            return new ImageHeaderParser(inputStream).m27812d();
        }
    }

    public n60(d51<jf0, Bitmap> d51Var, d51<InputStream, s60> d51Var2, InterfaceC0832bc interfaceC0832bc) {
        this(d51Var, d51Var2, interfaceC0832bc, f19497g, f19498h);
    }

    public n60(d51<jf0, Bitmap> d51Var, d51<InputStream, s60> d51Var2, InterfaceC0832bc interfaceC0832bc, C2250b c2250b, C2249a c2249a) {
        this.f19499a = d51Var;
        this.f19500b = d51Var2;
        this.f19501c = interfaceC0832bc;
        this.f19502d = c2250b;
        this.f19503e = c2249a;
    }

    /* renamed from: a */
    public final k60 m15509a(jf0 jf0Var, int i, int i2, byte[] bArr) {
        return jf0Var.m18540b() != null ? m15505f(jf0Var, i, i2, bArr) : m15507d(jf0Var, i, i2);
    }

    @Override // com.daaw.d51
    /* renamed from: b */
    public z41<k60> mo2793c(jf0 jf0Var, int i, int i2) {
        C0833bd m26226a = C0833bd.m26226a();
        byte[] m26225b = m26226a.m26225b();
        try {
            k60 m15509a = m15509a(jf0Var, i, i2, m26225b);
            if (m15509a != null) {
                return new m60(m15509a);
            }
            return null;
        } finally {
            m26226a.m26224c(m26225b);
        }
    }

    /* renamed from: d */
    public final k60 m15507d(jf0 jf0Var, int i, int i2) {
        z41<Bitmap> mo2793c = this.f19499a.mo2793c(jf0Var, i, i2);
        if (mo2793c != null) {
            return new k60(mo2793c, null);
        }
        return null;
    }

    /* renamed from: e */
    public final k60 m15506e(InputStream inputStream, int i, int i2) {
        z41<s60> mo2793c = this.f19500b.mo2793c(inputStream, i, i2);
        if (mo2793c != null) {
            s60 s60Var = mo2793c.get();
            return s60Var.m10680g() > 1 ? new k60(null, mo2793c) : new k60(new C1073dc(s60Var.m10681f(), this.f19501c), null);
        }
        return null;
    }

    /* renamed from: f */
    public final k60 m15505f(jf0 jf0Var, int i, int i2, byte[] bArr) {
        InputStream m15504a = this.f19503e.m15504a(jf0Var.m18540b(), bArr);
        m15504a.mark(2048);
        ImageHeaderParser.ImageType m15503a = this.f19502d.m15503a(m15504a);
        m15504a.reset();
        k60 m15506e = m15503a == ImageHeaderParser.ImageType.GIF ? m15506e(m15504a, i, i2) : null;
        return m15506e == null ? m15507d(new jf0(m15504a, jf0Var.m18541a()), i, i2) : m15506e;
    }

    @Override // com.daaw.d51
    public String getId() {
        if (this.f19504f == null) {
            this.f19504f = this.f19500b.getId() + this.f19499a.getId();
        }
        return this.f19504f;
    }
}
