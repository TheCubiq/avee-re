package com.daaw;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.conscrypt.NativeConstants;
/* loaded from: classes2.dex */
public final class es5 implements Runnable {

    /* renamed from: p */
    public final URL f8733p;

    /* renamed from: q */
    public final byte[] f8734q;

    /* renamed from: r */
    public final vo5 f8735r;

    /* renamed from: s */
    public final String f8736s;

    /* renamed from: t */
    public final Map f8737t;

    /* renamed from: u */
    public final /* synthetic */ ht5 f8738u;

    public es5(ht5 ht5Var, String str, URL url, byte[] bArr, Map map, vo5 vo5Var) {
        this.f8738u = ht5Var;
        ry0.m10834f(str);
        ry0.m10830j(url);
        ry0.m10830j(vo5Var);
        this.f8733p = url;
        this.f8734q = bArr;
        this.f8735r = vo5Var;
        this.f8736s = str;
        this.f8737t = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fa: MOVE  (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:42:0x00f8 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0100: MOVE  (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:44:0x00fd */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException e;
        Map map2;
        int i;
        br5 br5Var;
        vn6 vn6Var;
        IOException iOException;
        int i2;
        ht5 ht5Var;
        URLConnection openConnection;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        this.f8738u.mo6992e();
        OutputStream outputStream = null;
        try {
            ht5Var = this.f8738u;
            openConnection = this.f8733p.openConnection();
        } catch (IOException e2) {
            e = e2;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            map = null;
        }
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        ht5Var.f25143a.m24020z();
        httpURLConnection.setConnectTimeout(60000);
        ht5Var.f25143a.m24020z();
        httpURLConnection.setReadTimeout(61000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        try {
            Map map5 = this.f8737t;
            if (map5 != null) {
                for (Map.Entry entry : map5.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (this.f8734q != null) {
                byte[] m23589O = this.f8738u.f19771b.m3898g0().m23589O(this.f8734q);
                hk5 m14156v = this.f8738u.f25143a.mo3895i().m14156v();
                int length = m23589O.length;
                m14156v.m20652b("Uploading data. size", Integer.valueOf(length));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.connect();
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(m23589O);
                    outputStream2.close();
                } catch (IOException e3) {
                    e = e3;
                    map2 = null;
                    outputStream = outputStream2;
                    iOException = e;
                    i2 = 0;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            this.f8738u.f25143a.mo3895i().m14160q().m20651c("Error closing HTTP compressed POST connection output stream. appId", om5.m14152z(this.f8736s), e4);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    vn6Var = this.f8738u.f25143a.mo3882r();
                    br5Var = new br5(this.f8736s, this.f8735r, i2, iOException, null, map2, null);
                    vn6Var.m6978z(br5Var);
                } catch (Throwable th3) {
                    th = th3;
                    map = null;
                    outputStream = outputStream2;
                    i = 0;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e5) {
                            this.f8738u.f25143a.mo3895i().m14160q().m20651c("Error closing HTTP compressed POST connection output stream. appId", om5.m14152z(this.f8736s), e5);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f8738u.f25143a.mo3882r().m6978z(new br5(this.f8736s, this.f8735r, i, null, null, map, null));
                    throw th;
                }
            }
            responseCode = httpURLConnection.getResponseCode();
        } catch (IOException e6) {
            map2 = null;
            iOException = e6;
            i2 = 0;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            vn6Var = this.f8738u.f25143a.mo3882r();
            br5Var = new br5(this.f8736s, this.f8735r, i2, iOException, null, map2, null);
            vn6Var.m6978z(br5Var);
        } catch (Throwable th4) {
            map = null;
            th = th4;
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
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        inputStream.close();
                        httpURLConnection.disconnect();
                        vn6Var = this.f8738u.f25143a.mo3882r();
                        br5Var = new br5(this.f8736s, this.f8735r, responseCode, null, byteArray, headerFields, null);
                    } catch (Throwable th5) {
                        th = th5;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    inputStream = null;
                }
            } catch (IOException e7) {
                map2 = null;
                iOException = e7;
                i2 = responseCode;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                vn6Var = this.f8738u.f25143a.mo3882r();
                br5Var = new br5(this.f8736s, this.f8735r, i2, iOException, null, map2, null);
                vn6Var.m6978z(br5Var);
            } catch (Throwable th7) {
                th = th7;
                map = null;
                i = responseCode;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.f8738u.f25143a.mo3882r().m6978z(new br5(this.f8736s, this.f8735r, i, null, null, map, null));
                throw th;
            }
        } catch (IOException e8) {
            iOException = e8;
            i2 = responseCode;
            map2 = map4;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            vn6Var = this.f8738u.f25143a.mo3882r();
            br5Var = new br5(this.f8736s, this.f8735r, i2, iOException, null, map2, null);
            vn6Var.m6978z(br5Var);
        } catch (Throwable th8) {
            th = th8;
            i = responseCode;
            map = map3;
            if (outputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            this.f8738u.f25143a.mo3882r().m6978z(new br5(this.f8736s, this.f8735r, i, null, null, map, null));
            throw th;
        }
        vn6Var.m6978z(br5Var);
    }
}
