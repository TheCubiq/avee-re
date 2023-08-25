package com.daaw;

import android.net.Uri;
import com.daaw.tb0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class gr implements tb0 {
    public static final Pattern q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference<byte[]> r = new AtomicReference<>();
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final vy0<String> e;
    public final tb0.f f;
    public final tb0.f g = new tb0.f();
    public final bn1<? super gr> h;
    public pp i;
    public HttpURLConnection j;
    public InputStream k;
    public boolean l;
    public long m;
    public long n;
    public long o;
    public long p;

    public gr(String str, vy0<String> vy0Var, bn1<? super gr> bn1Var, int i, int i2, boolean z, tb0.f fVar) {
        this.d = s6.d(str);
        this.e = vy0Var;
        this.h = bn1Var;
        this.b = i;
        this.c = i2;
        this.a = z;
        this.f = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long f(java.net.HttpURLConnection r9) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r9.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            if (r1 != 0) goto L23
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L13
            goto L25
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Unexpected Content-Length ["
            r1.append(r3)
            r1.append(r0)
            r1.append(r2)
        L23:
            r3 = -1
        L25:
            java.lang.String r1 = "Content-Range"
            java.lang.String r9 = r9.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L8d
            java.util.regex.Pattern r1 = com.daaw.gr.q
            java.util.regex.Matcher r1 = r1.matcher(r9)
            boolean r5 = r1.find()
            if (r5 == 0) goto L8d
            r5 = 2
            java.lang.String r5 = r1.group(r5)     // Catch: java.lang.NumberFormatException -> L7d
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L7d
            r7 = 1
            java.lang.String r1 = r1.group(r7)     // Catch: java.lang.NumberFormatException -> L7d
            long r7 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L7d
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L5b
            r3 = r5
            goto L8d
        L5b:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L8d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L7d
            r1.<init>()     // Catch: java.lang.NumberFormatException -> L7d
            java.lang.String r7 = "Inconsistent headers ["
            r1.append(r7)     // Catch: java.lang.NumberFormatException -> L7d
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L7d
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L7d
            r1.append(r9)     // Catch: java.lang.NumberFormatException -> L7d
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L7d
            long r0 = java.lang.Math.max(r3, r5)     // Catch: java.lang.NumberFormatException -> L7d
            r3 = r0
            goto L8d
        L7d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r9)
            r0.append(r2)
        L8d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gr.f(java.net.HttpURLConnection):long");
    }

    public static URL g(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException("Unsupported protocol redirect: " + protocol);
        }
        throw new ProtocolException("Null location redirect");
    }

    public static void j(HttpURLConnection httpURLConnection, long j) {
        int i = sq1.a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final long a() {
        long j = this.n;
        return j == -1 ? j : j - this.p;
    }

    @Override // com.daaw.mp
    public int b(byte[] bArr, int i, int i2) {
        try {
            l();
            return k(bArr, i, i2);
        } catch (IOException e) {
            throw new tb0.c(e, this.i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    @Override // com.daaw.mp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long c(com.daaw.pp r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to connect to "
            r7.i = r8
            r1 = 0
            r7.p = r1
            r7.o = r1
            r3 = 1
            java.net.HttpURLConnection r4 = r7.h(r8)     // Catch: java.io.IOException -> Lc0
            r7.j = r4     // Catch: java.io.IOException -> Lc0
            int r0 = r4.getResponseCode()     // Catch: java.io.IOException -> La1
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 < r4) goto L85
            r5 = 299(0x12b, float:4.19E-43)
            if (r0 <= r5) goto L1e
            goto L85
        L1e:
            java.net.HttpURLConnection r5 = r7.j
            java.lang.String r5 = r5.getContentType()
            com.daaw.vy0<java.lang.String> r6 = r7.e
            if (r6 == 0) goto L38
            boolean r6 = r6.a(r5)
            if (r6 == 0) goto L2f
            goto L38
        L2f:
            r7.e()
            com.daaw.tb0$d r0 = new com.daaw.tb0$d
            r0.<init>(r5, r8)
            throw r0
        L38:
            if (r0 != r4) goto L41
            long r4 = r8.d
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L41
            r1 = r4
        L41:
            r7.m = r1
            boolean r0 = r8.a(r3)
            if (r0 != 0) goto L63
            long r0 = r8.e
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L52
            goto L65
        L52:
            java.net.HttpURLConnection r0 = r7.j
            long r0 = f(r0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L60
            long r4 = r7.m
            long r4 = r0 - r4
        L60:
            r7.n = r4
            goto L67
        L63:
            long r0 = r8.e
        L65:
            r7.n = r0
        L67:
            java.net.HttpURLConnection r0 = r7.j     // Catch: java.io.IOException -> L7b
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L7b
            r7.k = r0     // Catch: java.io.IOException -> L7b
            r7.l = r3
            com.daaw.bn1<? super com.daaw.gr> r0 = r7.h
            if (r0 == 0) goto L78
            r0.c(r7, r8)
        L78:
            long r0 = r7.n
            return r0
        L7b:
            r0 = move-exception
            r7.e()
            com.daaw.tb0$c r1 = new com.daaw.tb0$c
            r1.<init>(r0, r8, r3)
            throw r1
        L85:
            java.net.HttpURLConnection r1 = r7.j
            java.util.Map r1 = r1.getHeaderFields()
            r7.e()
            com.daaw.tb0$e r2 = new com.daaw.tb0$e
            r2.<init>(r0, r1, r8)
            r8 = 416(0x1a0, float:5.83E-43)
            if (r0 != r8) goto La0
            com.daaw.np r8 = new com.daaw.np
            r0 = 0
            r8.<init>(r0)
            r2.initCause(r8)
        La0:
            throw r2
        La1:
            r1 = move-exception
            r7.e()
            com.daaw.tb0$c r2 = new com.daaw.tb0$c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            android.net.Uri r0 = r8.a
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0, r1, r8, r3)
            throw r2
        Lc0:
            r1 = move-exception
            com.daaw.tb0$c r2 = new com.daaw.tb0$c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            android.net.Uri r0 = r8.a
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0, r1, r8, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gr.c(com.daaw.pp):long");
    }

    @Override // com.daaw.mp
    public void close() {
        try {
            if (this.k != null) {
                j(this.j, a());
                try {
                    this.k.close();
                } catch (IOException e) {
                    throw new tb0.c(e, this.i, 3);
                }
            }
        } finally {
            this.k = null;
            e();
            if (this.l) {
                this.l = false;
                bn1<? super gr> bn1Var = this.h;
                if (bn1Var != null) {
                    bn1Var.b(this);
                }
            }
        }
    }

    @Override // com.daaw.mp
    public Uri d() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void e() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            this.j = null;
        }
    }

    public final HttpURLConnection h(pp ppVar) {
        HttpURLConnection i;
        URL url = new URL(ppVar.a.toString());
        byte[] bArr = ppVar.b;
        long j = ppVar.d;
        long j2 = ppVar.e;
        boolean a = ppVar.a(1);
        if (this.a) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i3);
                }
                long j3 = j;
                i = i(url, bArr, j, j2, a, false);
                int responseCode = i.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    bArr = null;
                    String headerField = i.getHeaderField("Location");
                    i.disconnect();
                    url = g(url, headerField);
                    i2 = i3;
                    j = j3;
                }
            }
            return i;
        }
        return i(url, bArr, j, j2, a, true);
    }

    public final HttpURLConnection i(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        tb0.f fVar = this.f;
        if (fVar != null) {
            for (Map.Entry<String, String> entry : fVar.a().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.g.a().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final int k(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.n;
        if (j != -1) {
            long j2 = j - this.p;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = this.k.read(bArr, i, i2);
        if (read == -1) {
            if (this.n == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.p += read;
        bn1<? super gr> bn1Var = this.h;
        if (bn1Var != null) {
            bn1Var.a(this, read);
        }
        return read;
    }

    public final void l() {
        if (this.o == this.m) {
            return;
        }
        byte[] andSet = r.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.o;
            long j2 = this.m;
            if (j == j2) {
                r.set(andSet);
                return;
            }
            int read = this.k.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read == -1) {
                throw new EOFException();
            }
            this.o += read;
            bn1<? super gr> bn1Var = this.h;
            if (bn1Var != null) {
                bn1Var.a(this, read);
            }
        }
    }
}
