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
public class xb0 implements InterfaceC1744ip<InputStream> {

    /* renamed from: f */
    public static final InterfaceC3522c f32317f = new C3521b();

    /* renamed from: a */
    public final o70 f32318a;

    /* renamed from: b */
    public final InterfaceC3522c f32319b;

    /* renamed from: c */
    public HttpURLConnection f32320c;

    /* renamed from: d */
    public InputStream f32321d;

    /* renamed from: e */
    public volatile boolean f32322e;

    /* renamed from: com.daaw.xb0$b */
    /* loaded from: classes.dex */
    public static class C3521b implements InterfaceC3522c {
        public C3521b() {
        }

        @Override // com.daaw.xb0.InterfaceC3522c
        /* renamed from: a */
        public HttpURLConnection mo5314a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.daaw.xb0$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3522c {
        /* renamed from: a */
        HttpURLConnection mo5314a(URL url);
    }

    public xb0(o70 o70Var) {
        this(o70Var, f32317f);
    }

    public xb0(o70 o70Var, InterfaceC3522c interfaceC3522c) {
        this.f32318a = o70Var;
        this.f32319b = interfaceC3522c;
    }

    @Override // com.daaw.InterfaceC1744ip
    /* renamed from: b */
    public void mo4084b() {
        InputStream inputStream = this.f32321d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f32320c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: c */
    public final InputStream m5317c(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = C3342vk.m7099n(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got non empty content encoding: ");
                sb.append(httpURLConnection.getContentEncoding());
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.f32321d = inputStream;
        return this.f32321d;
    }

    @Override // com.daaw.InterfaceC1744ip
    public void cancel() {
        this.f32322e = true;
    }

    @Override // com.daaw.InterfaceC1744ip
    /* renamed from: d */
    public InputStream mo4085a(dz0 dz0Var) {
        return m5315e(this.f32318a.m14489e(), 0, null, this.f32318a.m14492b());
    }

    /* renamed from: e */
    public final InputStream m5315e(URL url, int i, URL url2, Map<String, String> map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new IOException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f32320c = this.f32319b.mo5314a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f32320c.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.f32320c.setConnectTimeout(2500);
            this.f32320c.setReadTimeout(2500);
            this.f32320c.setUseCaches(false);
            this.f32320c.setDoInput(true);
            this.f32320c.connect();
            if (this.f32322e) {
                return null;
            }
            int responseCode = this.f32320c.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                return m5317c(this.f32320c);
            }
            if (i2 != 3) {
                if (responseCode == -1) {
                    throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
                } else {
                    throw new IOException("Request failed " + responseCode + ": " + this.f32320c.getResponseMessage());
                }
            }
            String headerField = this.f32320c.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new IOException("Received empty or null redirect url");
            }
            return m5315e(new URL(url, headerField), i + 1, url, map);
        }
        throw new IOException("Too many (> 5) redirects!");
    }

    @Override // com.daaw.InterfaceC1744ip
    public String getId() {
        return this.f32318a.m14493a();
    }
}
