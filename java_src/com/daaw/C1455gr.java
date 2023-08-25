package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.daaw.gr */
/* loaded from: classes.dex */
public class C1455gr implements tb0 {

    /* renamed from: q */
    public static final Pattern f11592q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r */
    public static final AtomicReference<byte[]> f11593r = new AtomicReference<>();

    /* renamed from: a */
    public final boolean f11594a;

    /* renamed from: b */
    public final int f11595b;

    /* renamed from: c */
    public final int f11596c;

    /* renamed from: d */
    public final String f11597d;

    /* renamed from: e */
    public final vy0<String> f11598e;

    /* renamed from: f */
    public final tb0.C3041f f11599f;

    /* renamed from: g */
    public final tb0.C3041f f11600g = new tb0.C3041f();

    /* renamed from: h */
    public final bn1<? super C1455gr> f11601h;

    /* renamed from: i */
    public C2570pp f11602i;

    /* renamed from: j */
    public HttpURLConnection f11603j;

    /* renamed from: k */
    public InputStream f11604k;

    /* renamed from: l */
    public boolean f11605l;

    /* renamed from: m */
    public long f11606m;

    /* renamed from: n */
    public long f11607n;

    /* renamed from: o */
    public long f11608o;

    /* renamed from: p */
    public long f11609p;

    public C1455gr(String str, vy0<String> vy0Var, bn1<? super C1455gr> bn1Var, int i, int i2, boolean z, tb0.C3041f c3041f) {
        this.f11597d = C2914s6.m10687d(str);
        this.f11598e = vy0Var;
        this.f11601h = bn1Var;
        this.f11595b = i;
        this.f11596c = i2;
        this.f11594a = z;
        this.f11599f = c3041f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m21341f(HttpURLConnection httpURLConnection) {
        long parseLong;
        String headerField;
        String headerField2 = httpURLConnection.getHeaderField("Content-Length");
        if (!TextUtils.isEmpty(headerField2)) {
            try {
                parseLong = Long.parseLong(headerField2);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected Content-Length [");
                sb.append(headerField2);
                sb.append("]");
            }
            headerField = httpURLConnection.getHeaderField("Content-Range");
            if (TextUtils.isEmpty(headerField)) {
                Matcher matcher = f11592q.matcher(headerField);
                if (matcher.find()) {
                    try {
                        long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                        if (parseLong < 0) {
                            return parseLong2;
                        }
                        if (parseLong != parseLong2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Inconsistent headers [");
                            sb2.append(headerField2);
                            sb2.append("] [");
                            sb2.append(headerField);
                            sb2.append("]");
                            return Math.max(parseLong, parseLong2);
                        }
                        return parseLong;
                    } catch (NumberFormatException unused2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Unexpected Content-Range [");
                        sb3.append(headerField);
                        sb3.append("]");
                        return parseLong;
                    }
                }
                return parseLong;
            }
            return parseLong;
        }
        parseLong = -1;
        headerField = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField)) {
        }
    }

    /* renamed from: g */
    public static URL m21340g(URL url, String str) {
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

    /* renamed from: j */
    public static void m21337j(HttpURLConnection httpURLConnection, long j) {
        int i = sq1.f26525a;
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

    /* renamed from: a */
    public final long m21343a() {
        long j = this.f11607n;
        return j == -1 ? j : j - this.f11609p;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: b */
    public int mo8642b(byte[] bArr, int i, int i2) {
        try {
            m21335l();
            return m21336k(bArr, i, i2);
        } catch (IOException e) {
            throw new tb0.C3038c(e, this.f11602i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo8641c(C2570pp c2570pp) {
        long j;
        bn1<? super C1455gr> bn1Var;
        this.f11602i = c2570pp;
        long j2 = 0;
        this.f11609p = 0L;
        this.f11608o = 0L;
        try {
            HttpURLConnection m21339h = m21339h(c2570pp);
            this.f11603j = m21339h;
            try {
                int responseCode = m21339h.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = this.f11603j.getHeaderFields();
                    m21342e();
                    tb0.C3040e c3040e = new tb0.C3040e(responseCode, headerFields, c2570pp);
                    if (responseCode == 416) {
                        c3040e.initCause(new C2357np(0));
                    }
                    throw c3040e;
                }
                String contentType = this.f11603j.getContentType();
                vy0<String> vy0Var = this.f11598e;
                if (vy0Var != null && !vy0Var.m6671a(contentType)) {
                    m21342e();
                    throw new tb0.C3039d(contentType, c2570pp);
                }
                if (responseCode == 200) {
                    long j3 = c2570pp.f23118d;
                    if (j3 != 0) {
                        j2 = j3;
                    }
                }
                this.f11606m = j2;
                try {
                    if (c2570pp.m13249a(1)) {
                        j = c2570pp.f23119e;
                    } else {
                        j = c2570pp.f23119e;
                        if (j == -1) {
                            long m21341f = m21341f(this.f11603j);
                            this.f11607n = m21341f != -1 ? m21341f - this.f11606m : -1L;
                            this.f11604k = this.f11603j.getInputStream();
                            this.f11605l = true;
                            bn1Var = this.f11601h;
                            if (bn1Var != null) {
                                bn1Var.mo16678c(this, c2570pp);
                            }
                            return this.f11607n;
                        }
                    }
                    this.f11604k = this.f11603j.getInputStream();
                    this.f11605l = true;
                    bn1Var = this.f11601h;
                    if (bn1Var != null) {
                    }
                    return this.f11607n;
                } catch (IOException e) {
                    m21342e();
                    throw new tb0.C3038c(e, c2570pp, 1);
                }
                this.f11607n = j;
            } catch (IOException e2) {
                m21342e();
                throw new tb0.C3038c("Unable to connect to " + c2570pp.f23115a.toString(), e2, c2570pp, 1);
            }
        } catch (IOException e3) {
            throw new tb0.C3038c("Unable to connect to " + c2570pp.f23115a.toString(), e3, c2570pp, 1);
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    public void close() {
        try {
            if (this.f11604k != null) {
                m21337j(this.f11603j, m21343a());
                try {
                    this.f11604k.close();
                } catch (IOException e) {
                    throw new tb0.C3038c(e, this.f11602i, 3);
                }
            }
        } finally {
            this.f11604k = null;
            m21342e();
            if (this.f11605l) {
                this.f11605l = false;
                bn1<? super C1455gr> bn1Var = this.f11601h;
                if (bn1Var != null) {
                    bn1Var.mo16679b(this);
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: d */
    public Uri mo8640d() {
        HttpURLConnection httpURLConnection = this.f11603j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: e */
    public final void m21342e() {
        HttpURLConnection httpURLConnection = this.f11603j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            this.f11603j = null;
        }
    }

    /* renamed from: h */
    public final HttpURLConnection m21339h(C2570pp c2570pp) {
        HttpURLConnection m21338i;
        URL url = new URL(c2570pp.f23115a.toString());
        byte[] bArr = c2570pp.f23116b;
        long j = c2570pp.f23118d;
        long j2 = c2570pp.f23119e;
        boolean m13249a = c2570pp.m13249a(1);
        if (this.f11594a) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
                long j3 = j;
                m21338i = m21338i(url, bArr, j, j2, m13249a, false);
                int responseCode = m21338i.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    bArr = null;
                    String headerField = m21338i.getHeaderField("Location");
                    m21338i.disconnect();
                    url = m21340g(url, headerField);
                    i = i2;
                    j = j3;
                }
            }
            return m21338i;
        }
        return m21338i(url, bArr, j, j2, m13249a, true);
    }

    /* renamed from: i */
    public final HttpURLConnection m21338i(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f11595b);
        httpURLConnection.setReadTimeout(this.f11596c);
        tb0.C3041f c3041f = this.f11599f;
        if (c3041f != null) {
            for (Map.Entry<String, String> entry : c3041f.m9373a().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.f11600g.m9373a().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f11597d);
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

    /* renamed from: k */
    public final int m21336k(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f11607n;
        if (j != -1) {
            long j2 = j - this.f11609p;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = this.f11604k.read(bArr, i, i2);
        if (read == -1) {
            if (this.f11607n == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f11609p += read;
        bn1<? super C1455gr> bn1Var = this.f11601h;
        if (bn1Var != null) {
            bn1Var.mo16680a(this, read);
        }
        return read;
    }

    /* renamed from: l */
    public final void m21335l() {
        if (this.f11608o == this.f11606m) {
            return;
        }
        byte[] andSet = f11593r.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.f11608o;
            long j2 = this.f11606m;
            if (j == j2) {
                f11593r.set(andSet);
                return;
            }
            int read = this.f11604k.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read == -1) {
                throw new EOFException();
            }
            this.f11608o += read;
            bn1<? super C1455gr> bn1Var = this.f11601h;
            if (bn1Var != null) {
                bn1Var.mo16680a(this, read);
            }
        }
    }
}
