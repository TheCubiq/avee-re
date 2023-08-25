package com.daaw;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final class v34 implements ty2 {
    public static final Pattern q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference r = new AtomicReference();
    public final int b;
    public final int c;
    public final String d;
    public final sy2 e;
    public final zy2 f;
    public mx2 g;
    public HttpURLConnection h;
    public InputStream i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public int o;
    public final SSLSocketFactory a = new u34(this);
    public final Set p = new HashSet();

    public v34(String str, zy2 zy2Var, int i, int i2, int i3) {
        az2.b(str);
        this.d = str;
        this.f = zy2Var;
        this.e = new sy2();
        this.b = i;
        this.c = i2;
        this.o = i3;
    }

    @Override // com.daaw.kx2
    public final int a(byte[] bArr, int i, int i2) {
        try {
            if (this.m != this.k) {
                byte[] bArr2 = (byte[]) r.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.m;
                    long j2 = this.k;
                    if (j == j2) {
                        r.set(bArr2);
                        break;
                    }
                    int read = this.i.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.m += read;
                    zy2 zy2Var = this.f;
                    if (zy2Var != null) {
                        ((l44) zy2Var).j0(this, read);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.l;
            if (j3 != -1) {
                long j4 = j3 - this.n;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.i.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.l == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.n += read2;
            zy2 zy2Var2 = this.f;
            if (zy2Var2 != null) {
                ((l44) zy2Var2).j0(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e) {
            throw new px2(e, this.g, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
        if (r3 != 0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021a A[Catch: IOException -> 0x0269, TryCatch #0 {IOException -> 0x0269, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:8:0x002e, B:9:0x0036, B:10:0x004e, B:12:0x0054, B:19:0x0078, B:21:0x0092, B:22:0x00a3, B:23:0x00a8, B:36:0x00de, B:91:0x020f, B:93:0x021a, B:95:0x022b, B:98:0x0234, B:99:0x0243, B:101:0x024a, B:102:0x0251, B:103:0x0252, B:104:0x0268), top: B:109:0x000e }] */
    @Override // com.daaw.kx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.daaw.mx2 r20) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.v34.b(com.daaw.mx2):long");
    }

    public final void e(int i) {
        this.o = i;
        for (Socket socket : this.p) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.o);
                } catch (SocketException e) {
                    k04.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                k04.zzh("Unexpected error while disconnecting", e);
            }
            this.h = null;
        }
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        try {
            if (this.i != null) {
                HttpURLConnection httpURLConnection = this.h;
                long j = this.l;
                if (j != -1) {
                    j -= this.n;
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
                    this.i.close();
                } catch (IOException e) {
                    throw new px2(e, this.g, 3);
                }
            }
        } finally {
            this.i = null;
            f();
            if (this.j) {
                this.j = false;
            }
            this.p.clear();
        }
    }

    @Override // com.daaw.ty2
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
