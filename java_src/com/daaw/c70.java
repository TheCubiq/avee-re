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

    /* renamed from: f */
    public static final C0938b f5588f = new C0938b();

    /* renamed from: g */
    public static final C0937a f5589g = new C0937a();

    /* renamed from: a */
    public final Context f5590a;

    /* renamed from: b */
    public final C0938b f5591b;

    /* renamed from: c */
    public final InterfaceC0832bc f5592c;

    /* renamed from: d */
    public final C0937a f5593d;

    /* renamed from: e */
    public final j60 f5594e;

    /* renamed from: com.daaw.c70$a */
    /* loaded from: classes.dex */
    public static class C0937a {

        /* renamed from: a */
        public final Queue<r60> f5595a = tq1.m8867d(0);

        /* renamed from: a */
        public synchronized r60 m25532a(r60.InterfaceC2829a interfaceC2829a) {
            r60 poll;
            poll = this.f5595a.poll();
            if (poll == null) {
                poll = new r60(interfaceC2829a);
            }
            return poll;
        }

        /* renamed from: b */
        public synchronized void m25531b(r60 r60Var) {
            r60Var.m11727b();
            this.f5595a.offer(r60Var);
        }
    }

    /* renamed from: com.daaw.c70$b */
    /* loaded from: classes.dex */
    public static class C0938b {

        /* renamed from: a */
        public final Queue<b70> f5596a = tq1.m8867d(0);

        /* renamed from: a */
        public synchronized b70 m25530a(byte[] bArr) {
            b70 poll;
            poll = this.f5596a.poll();
            if (poll == null) {
                poll = new b70();
            }
            return poll.m26427o(bArr);
        }

        /* renamed from: b */
        public synchronized void m25529b(b70 b70Var) {
            b70Var.m26441a();
            this.f5596a.offer(b70Var);
        }
    }

    public c70(Context context, InterfaceC0832bc interfaceC0832bc) {
        this(context, interfaceC0832bc, f5588f, f5589g);
    }

    public c70(Context context, InterfaceC0832bc interfaceC0832bc, C0938b c0938b, C0937a c0937a) {
        this.f5590a = context.getApplicationContext();
        this.f5592c = interfaceC0832bc;
        this.f5593d = c0937a;
        this.f5594e = new j60(interfaceC0832bc);
        this.f5591b = c0938b;
    }

    /* renamed from: e */
    public static byte[] m25533e(InputStream inputStream) {
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
    public u60 mo2793c(InputStream inputStream, int i, int i2) {
        byte[] m25533e = m25533e(inputStream);
        b70 m25530a = this.f5591b.m25530a(m25533e);
        r60 m25532a = this.f5593d.m25532a(this.f5594e);
        try {
            return m25535b(m25533e, i, i2, m25530a, m25532a);
        } finally {
            this.f5591b.m25529b(m25530a);
            this.f5593d.m25531b(m25532a);
        }
    }

    /* renamed from: b */
    public final u60 m25535b(byte[] bArr, int i, int i2, b70 b70Var, r60 r60Var) {
        Bitmap m25534d;
        a70 m26439c = b70Var.m26439c();
        if (m26439c.m27588a() <= 0 || m26439c.m27587b() != 0 || (m25534d = m25534d(r60Var, m26439c, bArr)) == null) {
            return null;
        }
        return new u60(new s60(this.f5590a, this.f5594e, this.f5592c, np1.m14899b(), i, i2, m26439c, bArr, m25534d));
    }

    /* renamed from: d */
    public final Bitmap m25534d(r60 r60Var, a70 a70Var, byte[] bArr) {
        r60Var.m11714o(a70Var, bArr);
        r60Var.m11728a();
        return r60Var.m11720i();
    }

    @Override // com.daaw.d51
    public String getId() {
        return "";
    }
}
