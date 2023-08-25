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
public final class v34 implements ty2 {

    /* renamed from: q */
    public static final Pattern f29817q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r */
    public static final AtomicReference f29818r = new AtomicReference();

    /* renamed from: b */
    public final int f29820b;

    /* renamed from: c */
    public final int f29821c;

    /* renamed from: d */
    public final String f29822d;

    /* renamed from: e */
    public final sy2 f29823e;

    /* renamed from: f */
    public final zy2 f29824f;

    /* renamed from: g */
    public mx2 f29825g;

    /* renamed from: h */
    public HttpURLConnection f29826h;

    /* renamed from: i */
    public InputStream f29827i;

    /* renamed from: j */
    public boolean f29828j;

    /* renamed from: k */
    public long f29829k;

    /* renamed from: l */
    public long f29830l;

    /* renamed from: m */
    public long f29831m;

    /* renamed from: n */
    public long f29832n;

    /* renamed from: o */
    public int f29833o;

    /* renamed from: a */
    public final SSLSocketFactory f29819a = new u34(this);

    /* renamed from: p */
    public final Set f29834p = new HashSet();

    public v34(String str, zy2 zy2Var, int i, int i2, int i3) {
        az2.m26586b(str);
        this.f29822d = str;
        this.f29824f = zy2Var;
        this.f29823e = new sy2();
        this.f29820b = i;
        this.f29821c = i2;
        this.f29833o = i3;
    }

    @Override // com.daaw.kx2
    /* renamed from: a */
    public final int mo5585a(byte[] bArr, int i, int i2) {
        try {
            if (this.f29831m != this.f29829k) {
                byte[] bArr2 = (byte[]) f29818r.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.f29831m;
                    long j2 = this.f29829k;
                    if (j == j2) {
                        f29818r.set(bArr2);
                        break;
                    }
                    int read = this.f29827i.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f29831m += read;
                    zy2 zy2Var = this.f29824f;
                    if (zy2Var != null) {
                        ((l44) zy2Var).m17148j0(this, read);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f29830l;
            if (j3 != -1) {
                long j4 = j3 - this.f29832n;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.f29827i.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.f29830l == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f29832n += read2;
            zy2 zy2Var2 = this.f29824f;
            if (zy2Var2 != null) {
                ((l44) zy2Var2).m17148j0(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e) {
            throw new px2(e, this.f29825g, 2);
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo5584b(mx2 mx2Var) {
        int responseCode;
        String headerField;
        int responseCode2;
        long j;
        long parseLong;
        String headerField2;
        this.f29825g = mx2Var;
        long j2 = 0;
        this.f29832n = 0L;
        this.f29831m = 0L;
        try {
            URL url = new URL(mx2Var.f19263a.toString());
            long j3 = mx2Var.f19265c;
            long j4 = mx2Var.f19266d;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f29819a);
                }
                httpURLConnection.setConnectTimeout(this.f29820b);
                httpURLConnection.setReadTimeout(this.f29821c);
                for (Map.Entry entry : this.f29823e.m9709a().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j3 == j2) {
                    if (j4 != -1) {
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.f29822d);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f29826h = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.f29826h.getHeaderFields();
                                m7508f();
                                ry2 ry2Var = new ry2(responseCode2, headerFields, mx2Var);
                                if (responseCode2 == 416) {
                                    ry2Var.initCause(new lx2(0));
                                }
                                throw ry2Var;
                            }
                            if (responseCode2 == 200) {
                                j = mx2Var.f19265c;
                            }
                            j = 0;
                            this.f29829k = j;
                            long j5 = mx2Var.f19266d;
                            if (j5 != -1) {
                                this.f29830l = j5;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f29826h;
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    try {
                                        parseLong = Long.parseLong(headerField3);
                                    } catch (NumberFormatException unused) {
                                        k04.zzg("Unexpected Content-Length [" + headerField3 + "]");
                                    }
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                        Matcher matcher = f29817q.matcher(headerField2);
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
                                    this.f29830l = parseLong != -1 ? parseLong - this.f29829k : -1L;
                                }
                                parseLong = -1;
                                headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField2)) {
                                }
                                this.f29830l = parseLong != -1 ? parseLong - this.f29829k : -1L;
                            }
                            try {
                                this.f29827i = this.f29826h.getInputStream();
                                this.f29828j = true;
                                zy2 zy2Var = this.f29824f;
                                if (zy2Var != null) {
                                    ((l44) zy2Var).mo1771w(this, mx2Var);
                                }
                                return this.f29830l;
                            } catch (IOException e) {
                                m7508f();
                                throw new px2(e, mx2Var, 1);
                            }
                        } catch (IOException e2) {
                            m7508f();
                            throw new px2("Unable to connect to ".concat(String.valueOf(mx2Var.f19263a.toString())), e2, mx2Var, 1);
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
                httpURLConnection.setRequestProperty("User-Agent", this.f29822d);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.f29826h = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.f29826h.getHeaderFields();
                    m7508f();
                    ry2 ry2Var2 = new ry2(responseCode2, headerFields2, mx2Var);
                    if (responseCode2 == 416) {
                    }
                    throw ry2Var2;
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e3) {
            throw new px2("Unable to connect to ".concat(String.valueOf(mx2Var.f19263a.toString())), e3, mx2Var, 1);
        }
    }

    /* renamed from: e */
    public final void m7509e(int i) {
        this.f29833o = i;
        for (Socket socket : this.f29834p) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f29833o);
                } catch (SocketException e) {
                    k04.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m7508f() {
        HttpURLConnection httpURLConnection = this.f29826h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                k04.zzh("Unexpected error while disconnecting", e);
            }
            this.f29826h = null;
        }
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f29826h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        try {
            if (this.f29827i != null) {
                HttpURLConnection httpURLConnection = this.f29826h;
                long j = this.f29830l;
                if (j != -1) {
                    j -= this.f29832n;
                }
                int i = pz2.f23547a;
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
                    this.f29827i.close();
                } catch (IOException e) {
                    throw new px2(e, this.f29825g, 3);
                }
            }
        } finally {
            this.f29827i = null;
            m7508f();
            if (this.f29828j) {
                this.f29828j = false;
            }
            this.f29834p.clear();
        }
    }

    @Override // com.daaw.ty2
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f29826h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
