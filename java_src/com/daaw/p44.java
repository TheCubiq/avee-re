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
    public static final Pattern r = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final int a;
    public final int b;
    public final String c;
    public final sy2 d;
    public final zy2 e;
    public mx2 f;
    public HttpURLConnection g;
    public final Queue h;
    public InputStream i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public final long p;
    public final long q;

    public p44(String str, zy2 zy2Var, int i, int i2, long j, long j2) {
        az2.b(str);
        this.c = str;
        this.e = zy2Var;
        this.d = new sy2();
        this.a = i;
        this.b = i2;
        this.h = new ArrayDeque();
        this.p = j;
        this.q = j2;
    }

    @Override // com.daaw.kx2
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.k;
            long j2 = this.l;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = i2;
            long j4 = this.q;
            long j5 = this.o;
            long j6 = j5 + 1;
            if (this.m + j2 + j3 + j4 > j6) {
                long j7 = this.n;
                if (j5 < j7) {
                    long min = Math.min(j7, Math.max(((this.p + j6) - j4) - 1, (-1) + j6 + j3));
                    c(j6, min, 2);
                    this.o = min;
                    j5 = min;
                }
            }
            int read = this.i.read(bArr, i, (int) Math.min(j3, ((j5 + 1) - this.m) - this.l));
            if (read != -1) {
                this.l += read;
                zy2 zy2Var = this.e;
                if (zy2Var != null) {
                    ((l44) zy2Var).j0(this, read);
                }
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new px2(e, this.f, 2);
        }
    }

    @Override // com.daaw.kx2
    public final long b(mx2 mx2Var) {
        long j;
        this.f = mx2Var;
        this.l = 0L;
        long j2 = mx2Var.c;
        long j3 = mx2Var.d;
        long min = j3 == -1 ? this.p : Math.min(this.p, j3);
        this.m = j2;
        HttpURLConnection c = c(j2, (min + j2) - 1, 1);
        this.g = c;
        String headerField = c.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = r.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = mx2Var.d;
                    if (j4 != -1) {
                        this.k = j4;
                        j = Math.max(parseLong, (this.m + j4) - 1);
                    } else {
                        this.k = parseLong2 - this.m;
                        j = parseLong2 - 1;
                    }
                    this.n = j;
                    this.o = parseLong;
                    this.j = true;
                    zy2 zy2Var = this.e;
                    if (zy2Var != null) {
                        ((l44) zy2Var).w(this, mx2Var);
                    }
                    return this.k;
                } catch (NumberFormatException unused) {
                    k04.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new n44(headerField, mx2Var);
    }

    public final HttpURLConnection c(long j, long j2, int i) {
        String uri = this.f.a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.a);
            httpURLConnection.setReadTimeout(this.b);
            for (Map.Entry entry : this.d.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.c);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.h.add(httpURLConnection);
            String uri2 = this.f.a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    d();
                    throw new o44(responseCode, headerFields, this.f, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.i != null) {
                        inputStream = new SequenceInputStream(this.i, inputStream);
                    }
                    this.i = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    d();
                    throw new px2(e, this.f, i);
                }
            } catch (IOException e2) {
                d();
                throw new px2("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.f, i);
            }
        } catch (IOException e3) {
            throw new px2("Unable to connect to ".concat(String.valueOf(uri)), e3, this.f, i);
        }
    }

    public final void d() {
        while (!this.h.isEmpty()) {
            try {
                ((HttpURLConnection) this.h.remove()).disconnect();
            } catch (Exception e) {
                k04.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.g = null;
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        try {
            InputStream inputStream = this.i;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new px2(e, this.f, 3);
                }
            }
        } finally {
            this.i = null;
            d();
            if (this.j) {
                this.j = false;
            }
        }
    }

    @Override // com.daaw.ty2
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
