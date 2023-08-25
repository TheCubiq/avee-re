package com.daaw;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.conscrypt.NativeConstants;
/* loaded from: classes2.dex */
public final class h38 implements Runnable {

    /* renamed from: p */
    public final URL f12009p;

    /* renamed from: q */
    public final String f12010q;

    /* renamed from: r */
    public final /* synthetic */ k38 f12011r;

    /* renamed from: s */
    public final yo6 f12012s;

    public h38(k38 k38Var, String str, URL url, byte[] bArr, Map map, yo6 yo6Var, byte[] bArr2) {
        this.f12011r = k38Var;
        ry0.m10834f(str);
        ry0.m10830j(url);
        ry0.m10830j(yo6Var);
        this.f12009p = url;
        this.f12012s = yo6Var;
        this.f12010q = str;
    }

    /* renamed from: a */
    public final /* synthetic */ void m21043a(int i, Exception exc, byte[] bArr, Map map) {
        yo6 yo6Var = this.f12012s;
        yo6Var.f33901a.m24038f(this.f12010q, i, exc, bArr, map);
    }

    /* renamed from: b */
    public final void m21042b(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.f12011r.f25143a.mo3882r().m6978z(new Runnable() { // from class: com.daaw.v28
            @Override // java.lang.Runnable
            public final void run() {
                h38.this.m21043a(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.daaw.h38] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        ?? r4;
        ?? r42;
        Throwable th;
        int i;
        IOException e;
        InputStream inputStream;
        this.f12011r.mo6992e();
        try {
            k38 k38Var = this.f12011r;
            URLConnection openConnection = this.f12009p.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            k38Var.f25143a.m24020z();
            r4 = 60000;
            r42 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            k38Var.f25143a.m24020z();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i = httpURLConnection.getResponseCode();
            } catch (IOException e2) {
                e = e2;
                r42 = 0;
                e = e;
                i = 0;
                if (httpURLConnection != null) {
                }
                m21042b(i, e, null, r42);
            } catch (Throwable th2) {
                th = th2;
                r4 = 0;
                th = th;
                i = 0;
                if (httpURLConnection != null) {
                }
                m21042b(i, null, null, r4);
                throw th;
            }
            try {
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            byte[] bArr = new byte[NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    inputStream.close();
                                    httpURLConnection.disconnect();
                                    m21042b(i, null, byteArray, headerFields);
                                    return;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                    }
                } catch (IOException e3) {
                    e = e3;
                    r42 = 0;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m21042b(i, e, null, r42);
                } catch (Throwable th5) {
                    th = th5;
                    r4 = 0;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m21042b(i, null, null, r4);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                if (httpURLConnection != null) {
                }
                m21042b(i, e, null, r42);
            } catch (Throwable th6) {
                th = th6;
                if (httpURLConnection != null) {
                }
                m21042b(i, null, null, r4);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnection = null;
            r42 = 0;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
            r4 = 0;
        }
    }
}
