package com.daaw;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
/* loaded from: classes.dex */
public final class mj6 extends sx5 implements iu6 {

    /* renamed from: e */
    public final boolean f18902e;

    /* renamed from: f */
    public final int f18903f;

    /* renamed from: g */
    public final int f18904g;

    /* renamed from: h */
    public final String f18905h;

    /* renamed from: i */
    public final kt6 f18906i;

    /* renamed from: j */
    public final kt6 f18907j;

    /* renamed from: k */
    public pa6 f18908k;

    /* renamed from: l */
    public HttpURLConnection f18909l;

    /* renamed from: m */
    public InputStream f18910m;

    /* renamed from: n */
    public boolean f18911n;

    /* renamed from: o */
    public int f18912o;

    /* renamed from: p */
    public long f18913p;

    /* renamed from: q */
    public long f18914q;

    public mj6(String str, int i, int i2, boolean z, kt6 kt6Var, ty6 ty6Var, boolean z2) {
        super(true);
        this.f18905h = str;
        this.f18903f = i;
        this.f18904g = i2;
        this.f18902e = z;
        this.f18906i = kt6Var;
        this.f18907j = new kt6();
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f18913p;
            if (j != -1) {
                long j2 = j - this.f18914q;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.f18910m;
            int i3 = it5.f13991a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.f18914q += read;
            m9782c(read);
            return read;
        } catch (IOException e) {
            pa6 pa6Var = this.f18908k;
            int i4 = it5.f13991a;
            throw cq6.m25116a(e, pa6Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ca, code lost:
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ec, code lost:
        throw new com.daaw.cq6(new java.net.NoRouteToHostException("Too many redirects: " + r6), r25, 2001, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
        if (r8 != 0) goto L15;
     */
    @Override // com.daaw.p46
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo1978g(pa6 pa6Var) {
        int i;
        URL url;
        long j;
        long j2;
        boolean m13534b;
        HttpURLConnection httpURLConnection;
        String str;
        byte[] bArr;
        long j3;
        this.f18908k = pa6Var;
        this.f18914q = 0L;
        this.f18913p = 0L;
        m9780l(pa6Var);
        try {
            url = new URL(pa6Var.f22769a.toString());
            j = pa6Var.f22774f;
            j2 = pa6Var.f22775g;
            m13534b = pa6Var.m13534b(1);
        } catch (IOException e) {
            e = e;
            i = 1;
        }
        if (this.f18902e) {
            URL url2 = url;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 > 20) {
                    break;
                }
                long j4 = j2;
                long j5 = j;
                URL url3 = url2;
                HttpURLConnection m16014n = m16014n(url2, 1, null, j, j2, m13534b, false, pa6Var.f22772d);
                int responseCode = m16014n.getResponseCode();
                String headerField = m16014n.getHeaderField("Location");
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    httpURLConnection = m16014n;
                    break;
                }
                i = 1;
                try {
                    m16014n.disconnect();
                    url2 = m16013o(url3, headerField, pa6Var);
                    i2 = i3;
                    j2 = j4;
                    j = j5;
                } catch (IOException e2) {
                    e = e2;
                }
                e = e2;
                m16012p();
                throw cq6.m25116a(e, pa6Var, i);
            }
        }
        httpURLConnection = m16014n(url, 1, null, j, j2, m13534b, true, pa6Var.f22772d);
        this.f18909l = httpURLConnection;
        this.f18912o = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        int i4 = this.f18912o;
        if (i4 < 200 || i4 > 299) {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (this.f18912o == 416) {
                str = responseMessage;
                if (pa6Var.f22774f == ev6.m23167b(httpURLConnection.getHeaderField("Content-Range"))) {
                    this.f18911n = true;
                    m9779m(pa6Var);
                    long j6 = pa6Var.f22775g;
                    if (j6 != -1) {
                        return j6;
                    }
                    return 0L;
                }
            } else {
                str = responseMessage;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                bArr = errorStream != null ? it5.m19429C(errorStream) : it5.f13996f;
            } catch (IOException unused) {
                bArr = it5.f13996f;
            }
            byte[] bArr2 = bArr;
            m16012p();
            throw new hs6(this.f18912o, str, this.f18912o == 416 ? new s56(2008) : null, headerFields, pa6Var, bArr2);
        }
        httpURLConnection.getContentType();
        if (this.f18912o == 200) {
            j3 = pa6Var.f22774f;
        }
        j3 = 0;
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
        if (equalsIgnoreCase) {
            this.f18913p = pa6Var.f22775g;
        } else {
            long j7 = pa6Var.f22775g;
            if (j7 != -1) {
                this.f18913p = j7;
            } else {
                long m23168a = ev6.m23168a(httpURLConnection.getHeaderField("Content-Length"), httpURLConnection.getHeaderField("Content-Range"));
                this.f18913p = m23168a != -1 ? m23168a - j3 : -1L;
            }
        }
        try {
            this.f18910m = httpURLConnection.getInputStream();
            if (equalsIgnoreCase) {
                this.f18910m = new GZIPInputStream(this.f18910m);
            }
            this.f18911n = true;
            m9779m(pa6Var);
            if (j3 != 0) {
                try {
                    byte[] bArr3 = new byte[4096];
                    while (j3 > 0) {
                        int min = (int) Math.min(j3, 4096L);
                        InputStream inputStream = this.f18910m;
                        int i5 = it5.f13991a;
                        int read = inputStream.read(bArr3, 0, min);
                        if (Thread.currentThread().isInterrupted()) {
                            throw new cq6(new InterruptedIOException(), pa6Var, 2000, 1);
                        }
                        if (read == -1) {
                            throw new cq6(pa6Var, 2008, 1);
                        }
                        j3 -= read;
                        m9782c(read);
                    }
                } catch (IOException e3) {
                    m16012p();
                    if (e3 instanceof cq6) {
                        throw ((cq6) e3);
                    }
                    throw new cq6(e3, pa6Var, 2000, 1);
                }
            }
            return this.f18913p;
        } catch (IOException e4) {
            m16012p();
            throw new cq6(e4, pa6Var, 2000, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection m16014n(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f18903f);
        httpURLConnection.setReadTimeout(this.f18904g);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f18906i.m17434a());
        hashMap.putAll(this.f18907j.m17434a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty("Range", sb);
                }
                str = this.f18905h;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", true == z ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setRequestMethod(pa6.m13535a(1));
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j);
        sb2.append("-");
        if (j2 != -1) {
            sb2.append((j + j2) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.f18905h;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true == z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(pa6.m13535a(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* renamed from: o */
    public final URL m16013o(URL url, String str, pa6 pa6Var) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if ("https".equals(protocol) || "http".equals(protocol)) {
                    if (this.f18902e || protocol.equals(url.getProtocol())) {
                        return url2;
                    }
                    String protocol2 = url.getProtocol();
                    throw new cq6("Disallowed cross-protocol redirect (" + protocol2 + " to " + protocol + ")", pa6Var, 2001, 1);
                }
                throw new cq6("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), pa6Var, 2001, 1);
            } catch (MalformedURLException e) {
                throw new cq6(e, pa6Var, 2001, 1);
            }
        }
        throw new cq6("Null location redirect", pa6Var, 2001, 1);
    }

    /* renamed from: p */
    public final void m16012p() {
        HttpURLConnection httpURLConnection = this.f18909l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                s95.m10495c("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f18909l = null;
        }
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f18909l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.p46
    public final void zzd() {
        try {
            InputStream inputStream = this.f18910m;
            if (inputStream != null) {
                long j = this.f18913p;
                long j2 = j == -1 ? -1L : j - this.f18914q;
                HttpURLConnection httpURLConnection = this.f18909l;
                try {
                    if (httpURLConnection != null) {
                        if (it5.f13991a <= 20) {
                            try {
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                if (j2 == -1) {
                                    if (inputStream2.read() != -1) {
                                    }
                                } else if (j2 <= 2048) {
                                }
                                String name = inputStream2.getClass().getName();
                                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                    Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                    Objects.requireNonNull(superclass);
                                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream2, new Object[0]);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        inputStream.close();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    pa6 pa6Var = this.f18908k;
                    int i = it5.f13991a;
                    throw new cq6(e, pa6Var, 2000, 3);
                }
            }
        } finally {
            this.f18910m = null;
            m16012p();
            if (this.f18911n) {
                this.f18911n = false;
                m9781k();
            }
        }
    }

    @Override // com.daaw.sx5, com.daaw.p46
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f18909l;
        return httpURLConnection == null ? b27.m26518d() : new hh6(httpURLConnection.getHeaderFields());
    }
}
