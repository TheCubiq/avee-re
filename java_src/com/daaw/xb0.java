package com.daaw;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
/* loaded from: classes.dex */
public class xb0 implements ip<InputStream> {
    public static final c f = new b();
    public final o70 a;
    public final c b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    /* loaded from: classes.dex */
    public static class b implements c {
        public b() {
        }

        @Override // com.daaw.xb0.c
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        HttpURLConnection a(URL url);
    }

    public xb0(o70 o70Var) {
        this(o70Var, f);
    }

    public xb0(o70 o70Var, c cVar) {
        this.a = o70Var;
        this.b = cVar;
    }

    @Override // com.daaw.ip
    public void b() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final InputStream c(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = vk.n(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got non empty content encoding: ");
                sb.append(httpURLConnection.getContentEncoding());
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.d = inputStream;
        return this.d;
    }

    @Override // com.daaw.ip
    public void cancel() {
        this.e = true;
    }

    @Override // com.daaw.ip
    /* renamed from: d */
    public InputStream a(dz0 dz0Var) {
        return e(this.a.e(), 0, null, this.a.b());
    }

    public final InputStream e(URL url, int i, URL url2, Map<String, String> map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new IOException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.c = this.b.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.c.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.c.setConnectTimeout(2500);
            this.c.setReadTimeout(2500);
            this.c.setUseCaches(false);
            this.c.setDoInput(true);
            this.c.connect();
            if (this.e) {
                return null;
            }
            int responseCode = this.c.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                return c(this.c);
            }
            if (i2 != 3) {
                if (responseCode == -1) {
                    throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
                } else {
                    throw new IOException("Request failed " + responseCode + ": " + this.c.getResponseMessage());
                }
            }
            String headerField = this.c.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new IOException("Received empty or null redirect url");
            }
            return e(new URL(url, headerField), i + 1, url, map);
        }
        throw new IOException("Too many (> 5) redirects!");
    }

    @Override // com.daaw.ip
    public String getId() {
        return this.a.a();
    }
}
