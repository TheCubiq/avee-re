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
public final class u54 extends sx5 implements iu6 {
    public static final Pattern u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference v = new AtomicReference();
    public final SSLSocketFactory e;
    public final int f;
    public final int g;
    public final String h;
    public final kt6 i;
    public pa6 j;
    public HttpURLConnection k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public final Set t;

    public u54(String str, qz6 qz6Var, int i, int i2, int i3) {
        super(true);
        this.e = new t54(this);
        this.t = new HashSet();
        uo4.c(str);
        this.h = str;
        this.i = new kt6();
        this.f = i;
        this.g = i2;
        this.s = i3;
        if (qz6Var != null) {
            d(qz6Var);
        }
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        try {
            if (this.q != this.o) {
                byte[] bArr2 = (byte[]) v.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.q;
                    long j2 = this.o;
                    if (j == j2) {
                        v.set(bArr2);
                        break;
                    }
                    int read = this.l.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.q += read;
                    c(read);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.p;
            if (j3 != -1) {
                long j4 = j3 - this.r;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.l.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.r += read2;
            c(read2);
            return read2;
        } catch (IOException e) {
            throw new cq6(e, this.j, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (r2 != 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[Catch: IOException -> 0x028a, TryCatch #0 {IOException -> 0x028a, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:94:0x022f, B:96:0x023a, B:98:0x024b, B:101:0x0254, B:102:0x0263, B:104:0x026b, B:105:0x0272, B:106:0x0273, B:107:0x0289), top: B:112:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023a A[Catch: IOException -> 0x028a, TryCatch #0 {IOException -> 0x028a, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:94:0x022f, B:96:0x023a, B:98:0x024b, B:101:0x0254, B:102:0x0263, B:104:0x026b, B:105:0x0272, B:106:0x0273, B:107:0x0289), top: B:112:0x000e }] */
    @Override // com.daaw.p46
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(com.daaw.pa6 r21) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.u54.g(com.daaw.pa6):long");
    }

    public final void p(int i) {
        this.s = i;
        for (Socket socket : this.t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.s);
                } catch (SocketException e) {
                    k04.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                k04.zzh("Unexpected error while disconnecting", e);
            }
            this.k = null;
        }
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.p46
    public final void zzd() {
        try {
            if (this.l != null) {
                HttpURLConnection httpURLConnection = this.k;
                long j = this.p;
                if (j != -1) {
                    j -= this.r;
                }
                int i = it5.a;
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
                    this.l.close();
                } catch (IOException e) {
                    throw new cq6(e, this.j, 2000, 3);
                }
            }
        } finally {
            this.l = null;
            q();
            if (this.m) {
                this.m = false;
                k();
            }
            this.t.clear();
        }
    }

    @Override // com.daaw.sx5, com.daaw.p46
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
