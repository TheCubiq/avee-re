package com.daaw;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.InputStream;
/* loaded from: classes.dex */
public class n60 implements d51<jf0, k60> {
    public static final b g = new b();
    public static final a h = new a();
    public final d51<jf0, Bitmap> a;
    public final d51<InputStream, s60> b;
    public final bc c;
    public final b d;
    public final a e;
    public String f;

    /* loaded from: classes.dex */
    public static class a {
        public InputStream a(InputStream inputStream, byte[] bArr) {
            return new k31(inputStream, bArr);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public ImageHeaderParser.ImageType a(InputStream inputStream) {
            return new ImageHeaderParser(inputStream).d();
        }
    }

    public n60(d51<jf0, Bitmap> d51Var, d51<InputStream, s60> d51Var2, bc bcVar) {
        this(d51Var, d51Var2, bcVar, g, h);
    }

    public n60(d51<jf0, Bitmap> d51Var, d51<InputStream, s60> d51Var2, bc bcVar, b bVar, a aVar) {
        this.a = d51Var;
        this.b = d51Var2;
        this.c = bcVar;
        this.d = bVar;
        this.e = aVar;
    }

    public final k60 a(jf0 jf0Var, int i, int i2, byte[] bArr) {
        return jf0Var.b() != null ? f(jf0Var, i, i2, bArr) : d(jf0Var, i, i2);
    }

    @Override // com.daaw.d51
    /* renamed from: b */
    public z41<k60> c(jf0 jf0Var, int i, int i2) {
        bd a2 = bd.a();
        byte[] b2 = a2.b();
        try {
            k60 a3 = a(jf0Var, i, i2, b2);
            if (a3 != null) {
                return new m60(a3);
            }
            return null;
        } finally {
            a2.c(b2);
        }
    }

    public final k60 d(jf0 jf0Var, int i, int i2) {
        z41<Bitmap> c = this.a.c(jf0Var, i, i2);
        if (c != null) {
            return new k60(c, null);
        }
        return null;
    }

    public final k60 e(InputStream inputStream, int i, int i2) {
        z41<s60> c = this.b.c(inputStream, i, i2);
        if (c != null) {
            s60 s60Var = c.get();
            return s60Var.g() > 1 ? new k60(null, c) : new k60(new dc(s60Var.f(), this.c), null);
        }
        return null;
    }

    public final k60 f(jf0 jf0Var, int i, int i2, byte[] bArr) {
        InputStream a2 = this.e.a(jf0Var.b(), bArr);
        a2.mark(2048);
        ImageHeaderParser.ImageType a3 = this.d.a(a2);
        a2.reset();
        k60 e = a3 == ImageHeaderParser.ImageType.GIF ? e(a2, i, i2) : null;
        return e == null ? d(new jf0(a2, jf0Var.a()), i, i2) : e;
    }

    @Override // com.daaw.d51
    public String getId() {
        if (this.f == null) {
            this.f = this.b.getId() + this.a.getId();
        }
        return this.f;
    }
}
