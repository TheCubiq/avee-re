package com.daaw;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class ox2 implements ty2 {
    public static final Pattern n = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference o = new AtomicReference();
    public final int a;
    public final int b;
    public final String c;
    public final sy2 d;
    public final zy2 e;
    public mx2 f;
    public HttpURLConnection g;
    public InputStream h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public long m;

    public ox2(String str, kz2 kz2Var, zy2 zy2Var, int i, int i2, boolean z, sy2 sy2Var) {
        az2.b(str);
        this.c = str;
        this.e = zy2Var;
        this.d = new sy2();
        this.a = i;
        this.b = i2;
    }

    @Override // com.daaw.kx2
    public final int a(byte[] bArr, int i, int i2) {
        try {
            if (this.l != this.j) {
                byte[] bArr2 = (byte[]) o.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.l;
                    long j2 = this.j;
                    if (j == j2) {
                        o.set(bArr2);
                        break;
                    }
                    int read = this.h.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.l += read;
                    zy2 zy2Var = this.e;
                    if (zy2Var != null) {
                        zy2Var.i(this, read);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.k;
            if (j3 != -1) {
                long j4 = j3 - this.m;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.h.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.k == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.m += read2;
            zy2 zy2Var2 = this.e;
            if (zy2Var2 != null) {
                zy2Var2.i(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e) {
            throw new px2(e, this.f, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
        if (r3 != 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fc A[Catch: IOException -> 0x024b, TryCatch #4 {IOException -> 0x024b, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:7:0x0042, B:9:0x0048, B:16:0x006c, B:18:0x0086, B:19:0x0097, B:20:0x009c, B:33:0x00d2, B:89:0x01f1, B:91:0x01fc, B:93:0x020d, B:96:0x0216, B:97:0x0225, B:99:0x022c, B:100:0x0233, B:101:0x0234, B:102:0x024a), top: B:115:0x000e }] */
    @Override // com.daaw.kx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.daaw.mx2 r20) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ox2.b(com.daaw.mx2):long");
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            this.g = null;
        }
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        try {
            if (this.h != null) {
                HttpURLConnection httpURLConnection = this.g;
                long j = this.k;
                if (j != -1) {
                    j -= this.m;
                }
                int i = pz2.a;
                if (i == 19 || i == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.h.close();
                } catch (IOException e) {
                    throw new px2(e, this.f, 3);
                }
            }
        } finally {
            this.h = null;
            c();
            if (this.i) {
                this.i = false;
            }
        }
    }

    @Override // com.daaw.ty2
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
