package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class q64 extends sx5 implements iu6 {

    /* renamed from: v */
    public static final Pattern f23688v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e */
    public final int f23689e;

    /* renamed from: f */
    public final int f23690f;

    /* renamed from: g */
    public final String f23691g;

    /* renamed from: h */
    public final kt6 f23692h;

    /* renamed from: i */
    public pa6 f23693i;

    /* renamed from: j */
    public HttpURLConnection f23694j;

    /* renamed from: k */
    public final Queue f23695k;

    /* renamed from: l */
    public InputStream f23696l;

    /* renamed from: m */
    public boolean f23697m;

    /* renamed from: n */
    public int f23698n;

    /* renamed from: o */
    public long f23699o;

    /* renamed from: p */
    public long f23700p;

    /* renamed from: q */
    public long f23701q;

    /* renamed from: r */
    public long f23702r;

    /* renamed from: s */
    public long f23703s;

    /* renamed from: t */
    public final long f23704t;

    /* renamed from: u */
    public final long f23705u;

    public q64(String str, qz6 qz6Var, int i, int i2, long j, long j2) {
        super(true);
        uo4.m7875c(str);
        this.f23691g = str;
        this.f23692h = new kt6();
        this.f23689e = i;
        this.f23690f = i2;
        this.f23695k = new ArrayDeque();
        this.f23704t = j;
        this.f23705u = j2;
        if (qz6Var != null) {
            mo1979d(qz6Var);
        }
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f23699o;
            long j2 = this.f23700p;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = i2;
            long j4 = this.f23705u;
            long j5 = this.f23703s;
            long j6 = j5 + 1;
            if (this.f23701q + j2 + j3 + j4 > j6) {
                long j7 = this.f23702r;
                if (j5 < j7) {
                    long min = Math.min(j7, Math.max(((this.f23704t + j6) - j4) - 1, (-1) + j6 + j3));
                    m12741n(j6, min, 2);
                    this.f23703s = min;
                    j5 = min;
                }
            }
            int read = this.f23696l.read(bArr, i, (int) Math.min(j3, ((j5 + 1) - this.f23701q) - this.f23700p));
            if (read != -1) {
                this.f23700p += read;
                m9782c(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new cq6(e, this.f23693i, 2000, 2);
        }
    }

    @Override // com.daaw.p46
    /* renamed from: g */
    public final long mo1978g(pa6 pa6Var) {
        long j;
        this.f23693i = pa6Var;
        this.f23700p = 0L;
        long j2 = pa6Var.f22774f;
        long j3 = pa6Var.f22775g;
        long min = j3 == -1 ? this.f23704t : Math.min(this.f23704t, j3);
        this.f23701q = j2;
        HttpURLConnection m12741n = m12741n(j2, (min + j2) - 1, 1);
        this.f23694j = m12741n;
        String headerField = m12741n.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f23688v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = pa6Var.f22775g;
                    if (j4 != -1) {
                        this.f23699o = j4;
                        j = Math.max(parseLong, (this.f23701q + j4) - 1);
                    } else {
                        this.f23699o = parseLong2 - this.f23701q;
                        j = parseLong2 - 1;
                    }
                    this.f23702r = j;
                    this.f23703s = parseLong;
                    this.f23697m = true;
                    m9779m(pa6Var);
                    return this.f23699o;
                } catch (NumberFormatException unused) {
                    k04.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new o64(headerField, pa6Var);
    }

    /* renamed from: n */
    public final HttpURLConnection m12741n(long j, long j2, int i) {
        String uri = this.f23693i.f22769a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f23689e);
            httpURLConnection.setReadTimeout(this.f23690f);
            for (Map.Entry entry : this.f23692h.m17434a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.f23691g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f23695k.add(httpURLConnection);
            String uri2 = this.f23693i.f22769a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f23698n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    m12740o();
                    throw new p64(this.f23698n, headerFields, this.f23693i, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f23696l != null) {
                        inputStream = new SequenceInputStream(this.f23696l, inputStream);
                    }
                    this.f23696l = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    m12740o();
                    throw new cq6(e, this.f23693i, 2000, i);
                }
            } catch (IOException e2) {
                m12740o();
                throw new cq6("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.f23693i, 2000, i);
            }
        } catch (IOException e3) {
            throw new cq6("Unable to connect to ".concat(String.valueOf(uri)), e3, this.f23693i, 2000, i);
        }
    }

    /* renamed from: o */
    public final void m12740o() {
        while (!this.f23695k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f23695k.remove()).disconnect();
            } catch (Exception e) {
                k04.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.f23694j = null;
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f23694j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.p46
    public final void zzd() {
        try {
            InputStream inputStream = this.f23696l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new cq6(e, this.f23693i, 2000, 3);
                }
            }
        } finally {
            this.f23696l = null;
            m12740o();
            if (this.f23697m) {
                this.f23697m = false;
                m9781k();
            }
        }
    }

    @Override // com.daaw.sx5, com.daaw.p46
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f23694j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
