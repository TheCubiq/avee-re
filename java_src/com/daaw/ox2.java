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
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class ox2 implements ty2 {

    /* renamed from: n */
    public static final Pattern f22074n = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: o */
    public static final AtomicReference f22075o = new AtomicReference();

    /* renamed from: a */
    public final int f22076a;

    /* renamed from: b */
    public final int f22077b;

    /* renamed from: c */
    public final String f22078c;

    /* renamed from: d */
    public final sy2 f22079d;

    /* renamed from: e */
    public final zy2 f22080e;

    /* renamed from: f */
    public mx2 f22081f;

    /* renamed from: g */
    public HttpURLConnection f22082g;

    /* renamed from: h */
    public InputStream f22083h;

    /* renamed from: i */
    public boolean f22084i;

    /* renamed from: j */
    public long f22085j;

    /* renamed from: k */
    public long f22086k;

    /* renamed from: l */
    public long f22087l;

    /* renamed from: m */
    public long f22088m;

    public ox2(String str, kz2 kz2Var, zy2 zy2Var, int i, int i2, boolean z, sy2 sy2Var) {
        az2.m26586b(str);
        this.f22078c = str;
        this.f22080e = zy2Var;
        this.f22079d = new sy2();
        this.f22076a = i;
        this.f22077b = i2;
    }

    @Override // com.daaw.kx2
    /* renamed from: a */
    public final int mo5585a(byte[] bArr, int i, int i2) {
        try {
            if (this.f22087l != this.f22085j) {
                byte[] bArr2 = (byte[]) f22075o.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.f22087l;
                    long j2 = this.f22085j;
                    if (j == j2) {
                        f22075o.set(bArr2);
                        break;
                    }
                    int read = this.f22083h.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f22087l += read;
                    zy2 zy2Var = this.f22080e;
                    if (zy2Var != null) {
                        zy2Var.mo1772i(this, read);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f22086k;
            if (j3 != -1) {
                long j4 = j3 - this.f22088m;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.f22083h.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.f22086k == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f22088m += read2;
            zy2 zy2Var2 = this.f22080e;
            if (zy2Var2 != null) {
                zy2Var2.mo1772i(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e) {
            throw new px2(e, this.f22081f, 2);
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
        this.f22081f = mx2Var;
        long j2 = 0;
        this.f22088m = 0L;
        this.f22087l = 0L;
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
                httpURLConnection.setConnectTimeout(this.f22076a);
                httpURLConnection.setReadTimeout(this.f22077b);
                for (Map.Entry entry : this.f22079d.m9709a().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j3 == j2) {
                    if (j4 != -1) {
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.f22078c);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f22082g = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.f22082g.getHeaderFields();
                                m13885c();
                                ry2 ry2Var = new ry2(responseCode2, headerFields, mx2Var);
                                if (responseCode2 == 416) {
                                    ry2Var.initCause(new lx2(0));
                                }
                                throw ry2Var;
                            }
                            this.f22082g.getContentType();
                            if (responseCode2 == 200) {
                                j = mx2Var.f19265c;
                            }
                            j = 0;
                            this.f22085j = j;
                            long j5 = mx2Var.f19266d;
                            if (j5 != -1) {
                                this.f22086k = j5;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f22082g;
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    try {
                                        parseLong = Long.parseLong(headerField3);
                                    } catch (NumberFormatException unused) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Unexpected Content-Length [");
                                        sb.append(headerField3);
                                        sb.append("]");
                                    }
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                        Matcher matcher = f22074n.matcher(headerField2);
                                        if (matcher.find()) {
                                            try {
                                                long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (parseLong < 0) {
                                                    parseLong = parseLong2;
                                                } else if (parseLong != parseLong2) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append("Inconsistent headers [");
                                                    sb2.append(headerField3);
                                                    sb2.append("] [");
                                                    sb2.append(headerField2);
                                                    sb2.append("]");
                                                    parseLong = Math.max(parseLong, parseLong2);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append("Unexpected Content-Range [");
                                                sb3.append(headerField2);
                                                sb3.append("]");
                                            }
                                        }
                                    }
                                    this.f22086k = parseLong != -1 ? parseLong - this.f22085j : -1L;
                                }
                                parseLong = -1;
                                headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField2)) {
                                }
                                this.f22086k = parseLong != -1 ? parseLong - this.f22085j : -1L;
                            }
                            try {
                                this.f22083h = this.f22082g.getInputStream();
                                this.f22084i = true;
                                zy2 zy2Var = this.f22080e;
                                if (zy2Var != null) {
                                    zy2Var.mo1771w(this, mx2Var);
                                }
                                return this.f22086k;
                            } catch (IOException e) {
                                m13885c();
                                throw new px2(e, mx2Var, 1);
                            }
                        } catch (IOException e2) {
                            m13885c();
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
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append((j2 + j4) - 1);
                    str = sb4.toString();
                }
                httpURLConnection.setRequestProperty("Range", str);
                httpURLConnection.setRequestProperty("User-Agent", this.f22078c);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.f22082g = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.f22082g.getHeaderFields();
                    m13885c();
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

    /* renamed from: c */
    public final void m13885c() {
        HttpURLConnection httpURLConnection = this.f22082g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
            this.f22082g = null;
        }
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f22082g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        try {
            if (this.f22083h != null) {
                HttpURLConnection httpURLConnection = this.f22082g;
                long j = this.f22086k;
                if (j != -1) {
                    j -= this.f22088m;
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
                    this.f22083h.close();
                } catch (IOException e) {
                    throw new px2(e, this.f22081f, 3);
                }
            }
        } finally {
            this.f22083h = null;
            m13885c();
            if (this.f22084i) {
                this.f22084i = false;
            }
        }
    }

    @Override // com.daaw.ty2
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f22082g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
