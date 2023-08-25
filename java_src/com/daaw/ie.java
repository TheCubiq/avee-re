package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.daaw.cl0;
import com.daaw.gl0;
import com.daaw.ie;
import com.daaw.ls0;
import com.daaw.uf;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
public final class ie implements rn1 {
    public final hp a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final cg e;
    public final cg f;
    public final int g;

    /* loaded from: classes.dex */
    public static final class a {
        public final URL a;
        public final ib b;
        public final String c;

        public a(URL url, ib ibVar, String str) {
            this.a = url;
            this.b = ibVar;
            this.c = str;
        }

        public a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public ie(Context context, cg cgVar, cg cgVar2) {
        this(context, cgVar, cgVar2, 130000);
    }

    public ie(Context context, cg cgVar, cg cgVar2, int i) {
        this.a = ib.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = n(ed.c);
        this.e = cgVar2;
        this.f = cgVar;
        this.g = i;
    }

    public static int f(NetworkInfo networkInfo) {
        ls0.b bVar;
        if (networkInfo == null) {
            bVar = ls0.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (ls0.b.a(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = ls0.b.COMBINED;
        }
        return bVar.b();
    }

    public static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? ls0.c.NONE.b() : networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            nl0.d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.b;
        if (url != null) {
            nl0.b("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.a(bVar.b);
        }
        return null;
    }

    public static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.daaw.rn1
    public da a(ca caVar) {
        ib i = i(caVar);
        URL url = this.d;
        if (caVar.c() != null) {
            try {
                ed d = ed.d(caVar.c());
                r3 = d.e() != null ? d.e() : null;
                if (d.f() != null) {
                    url = n(d.f());
                }
            } catch (IllegalArgumentException unused) {
                return da.a();
            }
        }
        try {
            b bVar = (b) t51.a(5, new a(url, i, r3), new j50() { // from class: com.daaw.ge
                @Override // com.daaw.j50
                public final Object apply(Object obj) {
                    ie.b e;
                    e = ie.this.e((ie.a) obj);
                    return e;
                }
            }, new u51() { // from class: com.daaw.he
                @Override // com.daaw.u51
                public final Object a(Object obj, Object obj2) {
                    ie.a l;
                    l = ie.l((ie.a) obj, (ie.b) obj2);
                    return l;
                }
            });
            int i2 = bVar.a;
            if (i2 == 200) {
                return da.e(bVar.c);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? da.d() : da.a();
            }
            return da.f();
        } catch (IOException e) {
            nl0.d("CctTransportBackend", "Could not make request to the backend", e);
            return da.f();
        }
    }

    @Override // com.daaw.rn1
    public by b(by byVar) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return byVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.c).getSimOperator()).c("application_build", Integer.toString(h(this.c))).d();
    }

    public final b e(a aVar) {
        nl0.f("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                nl0.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                nl0.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                nl0.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, null, hl0.b(new BufferedReader(new InputStreamReader(m))).c());
                    if (m != null) {
                        m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (cx e) {
            e = e;
            nl0.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            nl0.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            nl0.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            nl0.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final ib i(ca caVar) {
        cl0.a j;
        HashMap hashMap = new HashMap();
        for (by byVar : caVar.b()) {
            String j2 = byVar.j();
            if (hashMap.containsKey(j2)) {
                ((List) hashMap.get(j2)).add(byVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(byVar);
                hashMap.put(j2, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            by byVar2 = (by) ((List) entry.getValue()).get(0);
            gl0.a b2 = gl0.a().f(h01.DEFAULT).g(this.f.a()).h(this.e.a()).b(uf.a().c(uf.b.ANDROID_FIREBASE).b(z2.a().m(Integer.valueOf(byVar2.g("sdk-version"))).j(byVar2.b("model")).f(byVar2.b("hardware")).d(byVar2.b("device")).l(byVar2.b("product")).k(byVar2.b("os-uild")).h(byVar2.b("manufacturer")).e(byVar2.b("fingerprint")).c(byVar2.b("country")).g(byVar2.b("locale")).i(byVar2.b("mcc_mnc")).b(byVar2.b("application_build")).a()).a());
            try {
                b2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (by byVar3 : (List) entry.getValue()) {
                ww e = byVar3.e();
                bx b3 = e.b();
                if (b3.equals(bx.b("proto"))) {
                    j = cl0.j(e.a());
                } else if (b3.equals(bx.b("json"))) {
                    j = cl0.i(new String(e.a(), Charset.forName("UTF-8")));
                } else {
                    nl0.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b3);
                }
                j.c(byVar3.f()).d(byVar3.k()).h(byVar3.h("tz-offset")).e(ls0.a().c(ls0.c.a(byVar3.g("net-type"))).b(ls0.b.a(byVar3.g("mobile-subtype"))).a());
                if (byVar3.d() != null) {
                    j.b(byVar3.d());
                }
                arrayList3.add(j.a());
            }
            b2.c(arrayList3);
            arrayList2.add(b2.a());
        }
        return ib.a(arrayList2);
    }
}
