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
    public static final Pattern v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final int e;
    public final int f;
    public final String g;
    public final kt6 h;
    public pa6 i;
    public HttpURLConnection j;
    public final Queue k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final long t;
    public final long u;

    public q64(String str, qz6 qz6Var, int i, int i2, long j, long j2) {
        super(true);
        uo4.c(str);
        this.g = str;
        this.h = new kt6();
        this.e = i;
        this.f = i2;
        this.k = new ArrayDeque();
        this.t = j;
        this.u = j2;
        if (qz6Var != null) {
            d(qz6Var);
        }
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.o;
            long j2 = this.p;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = i2;
            long j4 = this.u;
            long j5 = this.s;
            long j6 = j5 + 1;
            if (this.q + j2 + j3 + j4 > j6) {
                long j7 = this.r;
                if (j5 < j7) {
                    long min = Math.min(j7, Math.max(((this.t + j6) - j4) - 1, (-1) + j6 + j3));
                    n(j6, min, 2);
                    this.s = min;
                    j5 = min;
                }
            }
            int read = this.l.read(bArr, i, (int) Math.min(j3, ((j5 + 1) - this.q) - this.p));
            if (read != -1) {
                this.p += read;
                c(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new cq6(e, this.i, 2000, 2);
        }
    }

    @Override // com.daaw.p46
    public final long g(pa6 pa6Var) {
        long j;
        this.i = pa6Var;
        this.p = 0L;
        long j2 = pa6Var.f;
        long j3 = pa6Var.g;
        long min = j3 == -1 ? this.t : Math.min(this.t, j3);
        this.q = j2;
        HttpURLConnection n = n(j2, (min + j2) - 1, 1);
        this.j = n;
        String headerField = n.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = pa6Var.g;
                    if (j4 != -1) {
                        this.o = j4;
                        j = Math.max(parseLong, (this.q + j4) - 1);
                    } else {
                        this.o = parseLong2 - this.q;
                        j = parseLong2 - 1;
                    }
                    this.r = j;
                    this.s = parseLong;
                    this.m = true;
                    m(pa6Var);
                    return this.o;
                } catch (NumberFormatException unused) {
                    k04.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new o64(headerField, pa6Var);
    }

    public final HttpURLConnection n(long j, long j2, int i) {
        String uri = this.i.a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.e);
            httpURLConnection.setReadTimeout(this.f);
            for (Map.Entry entry : this.h.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.k.add(httpURLConnection);
            String uri2 = this.i.a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    o();
                    throw new p64(this.n, headerFields, this.i, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.l != null) {
                        inputStream = new SequenceInputStream(this.l, inputStream);
                    }
                    this.l = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    o();
                    throw new cq6(e, this.i, 2000, i);
                }
            } catch (IOException e2) {
                o();
                throw new cq6("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.i, 2000, i);
            }
        } catch (IOException e3) {
            throw new cq6("Unable to connect to ".concat(String.valueOf(uri)), e3, this.i, 2000, i);
        }
    }

    public final void o() {
        while (!this.k.isEmpty()) {
            try {
                ((HttpURLConnection) this.k.remove()).disconnect();
            } catch (Exception e) {
                k04.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.j = null;
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.daaw.p46
    public final void zzd() {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new cq6(e, this.i, 2000, 3);
                }
            }
        } finally {
            this.l = null;
            o();
            if (this.m) {
                this.m = false;
                k();
            }
        }
    }

    @Override // com.daaw.sx5, com.daaw.p46
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
