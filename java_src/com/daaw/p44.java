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
public final class p44 implements ty2 {

    /* renamed from: r */
    public static final Pattern f22587r = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: a */
    public final int f22588a;

    /* renamed from: b */
    public final int f22589b;

    /* renamed from: c */
    public final String f22590c;

    /* renamed from: d */
    public final sy2 f22591d;

    /* renamed from: e */
    public final zy2 f22592e;

    /* renamed from: f */
    public mx2 f22593f;

    /* renamed from: g */
    public HttpURLConnection f22594g;

    /* renamed from: h */
    public final Queue f22595h;

    /* renamed from: i */
    public InputStream f22596i;

    /* renamed from: j */
    public boolean f22597j;

    /* renamed from: k */
    public long f22598k;

    /* renamed from: l */
    public long f22599l;

    /* renamed from: m */
    public long f22600m;

    /* renamed from: n */
    public long f22601n;

    /* renamed from: o */
    public long f22602o;

    /* renamed from: p */
    public final long f22603p;

    /* renamed from: q */
    public final long f22604q;

    public p44(String str, zy2 zy2Var, int i, int i2, long j, long j2) {
        az2.m26586b(str);
        this.f22590c = str;
        this.f22592e = zy2Var;
        this.f22591d = new sy2();
        this.f22588a = i;
        this.f22589b = i2;
        this.f22595h = new ArrayDeque();
        this.f22603p = j;
        this.f22604q = j2;
    }

    @Override // com.daaw.kx2
    /* renamed from: a */
    public final int mo5585a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f22598k;
            long j2 = this.f22599l;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = i2;
            long j4 = this.f22604q;
            long j5 = this.f22602o;
            long j6 = j5 + 1;
            if (this.f22600m + j2 + j3 + j4 > j6) {
                long j7 = this.f22601n;
                if (j5 < j7) {
                    long min = Math.min(j7, Math.max(((this.f22603p + j6) - j4) - 1, (-1) + j6 + j3));
                    m13639c(j6, min, 2);
                    this.f22602o = min;
                    j5 = min;
                }
            }
            int read = this.f22596i.read(bArr, i, (int) Math.min(j3, ((j5 + 1) - this.f22600m) - this.f22599l));
            if (read != -1) {
                this.f22599l += read;
                zy2 zy2Var = this.f22592e;
                if (zy2Var != null) {
                    ((l44) zy2Var).m17148j0(this, read);
                }
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new px2(e, this.f22593f, 2);
        }
    }

    @Override // com.daaw.kx2
    /* renamed from: b */
    public final long mo5584b(mx2 mx2Var) {
        long j;
        this.f22593f = mx2Var;
        this.f22599l = 0L;
        long j2 = mx2Var.f19265c;
        long j3 = mx2Var.f19266d;
        long min = j3 == -1 ? this.f22603p : Math.min(this.f22603p, j3);
        this.f22600m = j2;
        HttpURLConnection m13639c = m13639c(j2, (min + j2) - 1, 1);
        this.f22594g = m13639c;
        String headerField = m13639c.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f22587r.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = mx2Var.f19266d;
                    if (j4 != -1) {
                        this.f22598k = j4;
                        j = Math.max(parseLong, (this.f22600m + j4) - 1);
                    } else {
                        this.f22598k = parseLong2 - this.f22600m;
                        j = parseLong2 - 1;
                    }
                    this.f22601n = j;
                    this.f22602o = parseLong;
                    this.f22597j = true;
                    zy2 zy2Var = this.f22592e;
                    if (zy2Var != null) {
                        ((l44) zy2Var).mo1771w(this, mx2Var);
                    }
                    return this.f22598k;
                } catch (NumberFormatException unused) {
                    k04.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new n44(headerField, mx2Var);
    }

    /* renamed from: c */
    public final HttpURLConnection m13639c(long j, long j2, int i) {
        String uri = this.f22593f.f19263a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f22588a);
            httpURLConnection.setReadTimeout(this.f22589b);
            for (Map.Entry entry : this.f22591d.m9709a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.f22590c);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f22595h.add(httpURLConnection);
            String uri2 = this.f22593f.f19263a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    m13638d();
                    throw new o44(responseCode, headerFields, this.f22593f, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f22596i != null) {
                        inputStream = new SequenceInputStream(this.f22596i, inputStream);
                    }
                    this.f22596i = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    m13638d();
                    throw new px2(e, this.f22593f, i);
                }
            } catch (IOException e2) {
                m13638d();
                throw new px2("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.f22593f, i);
            }
        } catch (IOException e3) {
            throw new px2("Unable to connect to ".concat(String.valueOf(uri)), e3, this.f22593f, i);
        }
    }

    /* renamed from: d */
    public final void m13638d() {
        while (!this.f22595h.isEmpty()) {
            try {
                ((HttpURLConnection) this.f22595h.remove()).disconnect();
            } catch (Exception e) {
                k04.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.f22594g = null;
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f22594g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        try {
            InputStream inputStream = this.f22596i;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new px2(e, this.f22593f, 3);
                }
            }
        } finally {
            this.f22596i = null;
            m13638d();
            if (this.f22597j) {
                this.f22597j = false;
            }
        }
    }

    @Override // com.daaw.ty2
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f22594g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
