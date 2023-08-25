package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import com.daaw.r60;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
/* loaded from: classes.dex */
public class c70 implements d51<InputStream, s60> {
    public static final b f = new b();
    public static final a g = new a();
    public final Context a;
    public final b b;
    public final bc c;
    public final a d;
    public final j60 e;

    /* loaded from: classes.dex */
    public static class a {
        public final Queue<r60> a = tq1.d(0);

        public synchronized r60 a(r60.a aVar) {
            r60 poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new r60(aVar);
            }
            return poll;
        }

        public synchronized void b(r60 r60Var) {
            r60Var.b();
            this.a.offer(r60Var);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final Queue<b70> a = tq1.d(0);

        public synchronized b70 a(byte[] bArr) {
            b70 poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new b70();
            }
            return poll.o(bArr);
        }

        public synchronized void b(b70 b70Var) {
            b70Var.a();
            this.a.offer(b70Var);
        }
    }

    public c70(Context context, bc bcVar) {
        this(context, bcVar, f, g);
    }

    public c70(Context context, bc bcVar, b bVar, a aVar) {
        this.a = context.getApplicationContext();
        this.c = bcVar;
        this.d = aVar;
        this.e = new j60(bcVar);
        this.b = bVar;
    }

    public static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public u60 c(InputStream inputStream, int i, int i2) {
        byte[] e = e(inputStream);
        b70 a2 = this.b.a(e);
        r60 a3 = this.d.a(this.e);
        try {
            return b(e, i, i2, a2, a3);
        } finally {
            this.b.b(a2);
            this.d.b(a3);
        }
    }

    public final u60 b(byte[] bArr, int i, int i2, b70 b70Var, r60 r60Var) {
        Bitmap d;
        a70 c = b70Var.c();
        if (c.a() <= 0 || c.b() != 0 || (d = d(r60Var, c, bArr)) == null) {
            return null;
        }
        return new u60(new s60(this.a, this.e, this.c, np1.b(), i, i2, c, bArr, d));
    }

    public final Bitmap d(r60 r60Var, a70 a70Var, byte[] bArr) {
        r60Var.o(a70Var, bArr);
        r60Var.a();
        return r60Var.i();
    }

    @Override // com.daaw.d51
    public String getId() {
        return "";
    }
}
