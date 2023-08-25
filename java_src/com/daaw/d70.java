package com.daaw;

import android.graphics.Bitmap;
import android.util.Log;
import com.daaw.r60;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class d70 implements e51<s60> {
    public static final a d = new a();
    public final r60.a a;
    public final bc b;
    public final a c;

    /* loaded from: classes.dex */
    public static class a {
        public r60 a(r60.a aVar) {
            return new r60(aVar);
        }

        public c3 b() {
            return new c3();
        }

        public z41<Bitmap> c(Bitmap bitmap, bc bcVar) {
            return new dc(bitmap, bcVar);
        }

        public b70 d() {
            return new b70();
        }
    }

    public d70(bc bcVar) {
        this(bcVar, d);
    }

    public d70(bc bcVar, a aVar) {
        this.b = bcVar;
        this.a = new j60(bcVar);
        this.c = aVar;
    }

    public final r60 b(byte[] bArr) {
        b70 d2 = this.c.d();
        d2.o(bArr);
        a70 c = d2.c();
        r60 a2 = this.c.a(this.a);
        a2.o(c, bArr);
        a2.a();
        return a2;
    }

    @Override // com.daaw.zw
    /* renamed from: c */
    public boolean a(z41<s60> z41Var, OutputStream outputStream) {
        long b = jl0.b();
        s60 s60Var = z41Var.get();
        cn1<Bitmap> h = s60Var.h();
        if (h instanceof np1) {
            return e(s60Var.d(), outputStream);
        }
        r60 b2 = b(s60Var.d());
        c3 b3 = this.c.b();
        if (b3.h(outputStream)) {
            for (int i = 0; i < b2.f(); i++) {
                z41<Bitmap> d2 = d(b2.i(), h, s60Var);
                try {
                    if (!b3.a(d2.get())) {
                        return false;
                    }
                    b3.f(b2.e(b2.d()));
                    b2.a();
                    d2.c();
                } finally {
                    d2.c();
                }
            }
            boolean d3 = b3.d();
            if (Log.isLoggable("GifEncoder", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encoded gif with ");
                sb.append(b2.f());
                sb.append(" frames and ");
                sb.append(s60Var.d().length);
                sb.append(" bytes in ");
                sb.append(jl0.a(b));
                sb.append(" ms");
            }
            return d3;
        }
        return false;
    }

    public final z41<Bitmap> d(Bitmap bitmap, cn1<Bitmap> cn1Var, s60 s60Var) {
        z41<Bitmap> c = this.c.c(bitmap, this.b);
        z41<Bitmap> a2 = cn1Var.a(c, s60Var.getIntrinsicWidth(), s60Var.getIntrinsicHeight());
        if (!c.equals(a2)) {
            c.c();
        }
        return a2;
    }

    public final boolean e(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.daaw.zw
    public String getId() {
        return "";
    }
}
