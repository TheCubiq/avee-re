package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final class u54 extends sx5 implements iu6 {

    /* renamed from: u */
    public static final Pattern f28558u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v */
    public static final AtomicReference f28559v = new AtomicReference();

    /* renamed from: e */
    public final SSLSocketFactory f28560e;

    /* renamed from: f */
    public final int f28561f;

    /* renamed from: g */
    public final int f28562g;

    /* renamed from: h */
    public final String f28563h;

    /* renamed from: i */
    public final kt6 f28564i;

    /* renamed from: j */
    public pa6 f28565j;

    /* renamed from: k */
    public HttpURLConnection f28566k;

    /* renamed from: l */
    public InputStream f28567l;

    /* renamed from: m */
    public boolean f28568m;

    /* renamed from: n */
    public int f28569n;

    /* renamed from: o */
    public long f28570o;

    /* renamed from: p */
    public long f28571p;

    /* renamed from: q */
    public long f28572q;

    /* renamed from: r */
    public long f28573r;

    /* renamed from: s */
    public int f28574s;

    /* renamed from: t */
    public final Set f28575t;

    public u54(String str, qz6 qz6Var, int i, int i2, int i3) {
        super(true);
        this.f28560e = new t54(this);
        this.f28575t = new HashSet();
        uo4.m7875c(str);
        this.f28563h = str;
        this.f28564i = new kt6();
        this.f28561f = i;
        this.f28562g = i2;
        this.f28574s = i3;
        if (qz6Var != null) {
            mo1979d(qz6Var);
        }
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        try {
            if (this.f28572q != this.f28570o) {
                byte[] bArr2 = (byte[]) f28559v.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.f28572q;
                    long j2 = this.f28570o;
                    if (j == j2) {
                        f28559v.set(bArr2);
                        break;
                    }
                    int read = this.f28567l.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f28572q += read;
                    m9782c(read);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f28571p;
            if (j3 != -1) {
                long j4 = j3 - this.f28573r;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.f28567l.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.f28571p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f28573r += read2;
            m9782c(read2);
            return read2;
        } catch (IOException e) {
            throw new cq6(e, this.f28565j, 2000, 2);
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
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo1978g(pa6 pa6Var) {
        int responseCode;
        String headerField;
        int responseCode2;
        long j;
        long parseLong;
        String headerField2;
        this.f28565j = pa6Var;
        long j2 = 0;
        this.f28573r = 0L;
        this.f28572q = 0L;
        try {
            URL url = new URL(pa6Var.f22769a.toString());
            long j3 = pa6Var.f22774f;
            long j4 = pa6Var.f22775g;
            boolean m13534b = pa6Var.m13534b(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f28560e);
                }
                httpURLConnection.setConnectTimeout(this.f28561f);
                httpURLConnection.setReadTimeout(this.f28562g);
                for (Map.Entry entry : this.f28564i.m17434a().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j3 == j2) {
                    if (j4 != -1) {
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.f28563h);
                    if (!m13534b) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f28566k = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.f28569n = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.f28566k.getHeaderFields();
                                m8564q();
                                hs6 hs6Var = new hs6(this.f28569n, null, null, headerFields, pa6Var, it5.f13996f);
                                if (this.f28569n == 416) {
                                    hs6Var.initCause(new s56(2008));
                                }
                                throw hs6Var;
                            }
                            if (responseCode2 == 200) {
                                j = pa6Var.f22774f;
                            }
                            j = 0;
                            this.f28570o = j;
                            boolean m13534b2 = pa6Var.m13534b(1);
                            long j5 = pa6Var.f22775g;
                            if (!m13534b2 && j5 == -1) {
                                HttpURLConnection httpURLConnection2 = this.f28566k;
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    try {
                                        parseLong = Long.parseLong(headerField3);
                                    } catch (NumberFormatException unused) {
                                        k04.zzg("Unexpected Content-Length [" + headerField3 + "]");
                                    }
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                        Matcher matcher = f28558u.matcher(headerField2);
                                        if (matcher.find()) {
                                            try {
                                                long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (parseLong < 0) {
                                                    parseLong = parseLong2;
                                                } else if (parseLong != parseLong2) {
                                                    k04.zzj("Inconsistent headers [" + headerField3 + "] [" + headerField2 + "]");
                                                    parseLong = Math.max(parseLong, parseLong2);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                k04.zzg("Unexpected Content-Range [" + headerField2 + "]");
                                            }
                                        }
                                    }
                                    j5 = parseLong != -1 ? parseLong - this.f28570o : -1L;
                                }
                                parseLong = -1;
                                headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField2)) {
                                }
                                j5 = parseLong != -1 ? parseLong - this.f28570o : -1L;
                            }
                            this.f28571p = j5;
                            try {
                                this.f28567l = this.f28566k.getInputStream();
                                this.f28568m = true;
                                m9779m(pa6Var);
                                return this.f28571p;
                            } catch (IOException e) {
                                m8564q();
                                throw new cq6(e, pa6Var, 2000, 1);
                            }
                        } catch (IOException e2) {
                            m8564q();
                            throw new cq6("Unable to connect to ".concat(String.valueOf(pa6Var.f22769a.toString())), e2, pa6Var, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j2 = 0;
                } else {
                    j2 = j3;
                }
                String str = "bytes=" + j2 + "-";
                if (j4 != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append((j2 + j4) - 1);
                    str = sb.toString();
                }
                httpURLConnection.setRequestProperty("Range", str);
                httpURLConnection.setRequestProperty("User-Agent", this.f28563h);
                if (!m13534b) {
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.f28566k = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.f28569n = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.f28566k.getHeaderFields();
                    m8564q();
                    hs6 hs6Var2 = new hs6(this.f28569n, null, null, headerFields2, pa6Var, it5.f13996f);
                    if (this.f28569n == 416) {
                    }
                    throw hs6Var2;
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e3) {
            throw new cq6("Unable to connect to ".concat(String.valueOf(pa6Var.f22769a.toString())), e3, pa6Var, 2000, 1);
        }
    }

    /* renamed from: p */
    public final void m8565p(int i) {
        this.f28574s = i;
        for (Socket socket : this.f28575t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f28574s);
                } catch (SocketException e) {
                    k04.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* renamed from: q */
    public final void m8564q() {
        HttpURLConnection httpURLConnection = this.f28566k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                k04.zzh("Unexpected error while disconnecting", e);
            }
            this.f28566k = null;
        }
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f28566k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.p46
    public final void zzd() {
        try {
            if (this.f28567l != null) {
                HttpURLConnection httpURLConnection = this.f28566k;
                long j = this.f28571p;
                if (j != -1) {
                    j -= this.f28573r;
                }
                int i = it5.f13991a;
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
                    this.f28567l.close();
                } catch (IOException e) {
                    throw new cq6(e, this.f28565j, 2000, 3);
                }
            }
        } finally {
            this.f28567l = null;
            m8564q();
            if (this.f28568m) {
                this.f28568m = false;
                m9781k();
            }
            this.f28575t.clear();
        }
    }

    @Override // com.daaw.sx5, com.daaw.p46
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f28566k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
