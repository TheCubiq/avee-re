package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.daaw.AbstractC3202uf;
import com.daaw.C1685ie;
import com.daaw.cl0;
import com.daaw.gl0;
import com.daaw.ls0;
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
/* renamed from: com.daaw.ie */
/* loaded from: classes.dex */
public final class C1685ie implements rn1 {

    /* renamed from: a */
    public final InterfaceC1603hp f13533a;

    /* renamed from: b */
    public final ConnectivityManager f13534b;

    /* renamed from: c */
    public final Context f13535c;

    /* renamed from: d */
    public final URL f13536d;

    /* renamed from: e */
    public final InterfaceC0951cg f13537e;

    /* renamed from: f */
    public final InterfaceC0951cg f13538f;

    /* renamed from: g */
    public final int f13539g;

    /* renamed from: com.daaw.ie$a */
    /* loaded from: classes.dex */
    public static final class C1686a {

        /* renamed from: a */
        public final URL f13540a;

        /* renamed from: b */
        public final AbstractC1673ib f13541b;

        /* renamed from: c */
        public final String f13542c;

        public C1686a(URL url, AbstractC1673ib abstractC1673ib, String str) {
            this.f13540a = url;
            this.f13541b = abstractC1673ib;
            this.f13542c = str;
        }

        /* renamed from: a */
        public C1686a m19899a(URL url) {
            return new C1686a(url, this.f13541b, this.f13542c);
        }
    }

    /* renamed from: com.daaw.ie$b */
    /* loaded from: classes.dex */
    public static final class C1687b {

        /* renamed from: a */
        public final int f13543a;

        /* renamed from: b */
        public final URL f13544b;

        /* renamed from: c */
        public final long f13545c;

        public C1687b(int i, URL url, long j) {
            this.f13543a = i;
            this.f13544b = url;
            this.f13545c = j;
        }
    }

    public C1685ie(Context context, InterfaceC0951cg interfaceC0951cg, InterfaceC0951cg interfaceC0951cg2) {
        this(context, interfaceC0951cg, interfaceC0951cg2, 130000);
    }

    public C1685ie(Context context, InterfaceC0951cg interfaceC0951cg, InterfaceC0951cg interfaceC0951cg2, int i) {
        this.f13533a = AbstractC1673ib.m19992b();
        this.f13535c = context;
        this.f13534b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f13536d = m19900n(C1177ed.f8350c);
        this.f13537e = interfaceC0951cg2;
        this.f13538f = interfaceC0951cg;
        this.f13539g = i;
    }

    /* renamed from: f */
    public static int m19908f(NetworkInfo networkInfo) {
        ls0.EnumC2113b enumC2113b;
        if (networkInfo == null) {
            enumC2113b = ls0.EnumC2113b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (ls0.EnumC2113b.m16613a(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            enumC2113b = ls0.EnumC2113b.COMBINED;
        }
        return enumC2113b.m16612b();
    }

    /* renamed from: g */
    public static int m19907g(NetworkInfo networkInfo) {
        return networkInfo == null ? ls0.EnumC2114c.NONE.m16610b() : networkInfo.getType();
    }

    /* renamed from: h */
    public static int m19906h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            nl0.m15086d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: j */
    public static TelephonyManager m19904j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    public static long m19903k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* renamed from: l */
    public static /* synthetic */ C1686a m19902l(C1686a c1686a, C1687b c1687b) {
        URL url = c1687b.f13544b;
        if (url != null) {
            nl0.m15088b("CctTransportBackend", "Following redirect to: %s", url);
            return c1686a.m19899a(c1687b.f13544b);
        }
        return null;
    }

    /* renamed from: m */
    public static InputStream m19901m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    public static URL m19900n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.daaw.rn1
    /* renamed from: a */
    public AbstractC1066da mo11156a(AbstractC0943ca abstractC0943ca) {
        AbstractC1673ib m19905i = m19905i(abstractC0943ca);
        URL url = this.f13536d;
        if (abstractC0943ca.mo25477c() != null) {
            try {
                C1177ed m23572d = C1177ed.m23572d(abstractC0943ca.mo25477c());
                r3 = m23572d.m23571e() != null ? m23572d.m23571e() : null;
                if (m23572d.m23570f() != null) {
                    url = m19900n(m23572d.m23570f());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC1066da.m24587a();
            }
        }
        try {
            C1687b c1687b = (C1687b) t51.m9520a(5, new C1686a(url, m19905i, r3), new j50() { // from class: com.daaw.ge
                @Override // com.daaw.j50
                public final Object apply(Object obj) {
                    C1685ie.C1687b m19909e;
                    m19909e = C1685ie.this.m19909e((C1685ie.C1686a) obj);
                    return m19909e;
                }
            }, new u51() { // from class: com.daaw.he
                @Override // com.daaw.u51
                /* renamed from: a */
                public final Object mo8579a(Object obj, Object obj2) {
                    C1685ie.C1686a m19902l;
                    m19902l = C1685ie.m19902l((C1685ie.C1686a) obj, (C1685ie.C1687b) obj2);
                    return m19902l;
                }
            });
            int i = c1687b.f13543a;
            if (i == 200) {
                return AbstractC1066da.m24583e(c1687b.f13545c);
            }
            if (i < 500 && i != 404) {
                return i == 400 ? AbstractC1066da.m24584d() : AbstractC1066da.m24587a();
            }
            return AbstractC1066da.m24582f();
        } catch (IOException e) {
            nl0.m15086d("CctTransportBackend", "Could not make request to the backend", e);
            return AbstractC1066da.m24582f();
        }
    }

    @Override // com.daaw.rn1
    /* renamed from: b */
    public AbstractC0896by mo11155b(AbstractC0896by abstractC0896by) {
        NetworkInfo activeNetworkInfo = this.f13534b.getActiveNetworkInfo();
        return abstractC0896by.m25743l().m25742a("sdk-version", Build.VERSION.SDK_INT).m25740c("model", Build.MODEL).m25740c("hardware", Build.HARDWARE).m25740c("device", Build.DEVICE).m25740c("product", Build.PRODUCT).m25740c("os-uild", Build.ID).m25740c("manufacturer", Build.MANUFACTURER).m25740c("fingerprint", Build.FINGERPRINT).m25741b("tz-offset", m19903k()).m25742a("net-type", m19907g(activeNetworkInfo)).m25742a("mobile-subtype", m19908f(activeNetworkInfo)).m25740c("country", Locale.getDefault().getCountry()).m25740c("locale", Locale.getDefault().getLanguage()).m25740c("mcc_mnc", m19904j(this.f13535c).getSimOperator()).m25740c("application_build", Integer.toString(m19906h(this.f13535c))).mo25500d();
    }

    /* renamed from: e */
    public final C1687b m19909e(C1686a c1686a) {
        nl0.m15084f("CctTransportBackend", "Making request to: %s", c1686a.f13540a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) c1686a.f13540a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f13539g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = c1686a.f13542c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f13533a.mo2309a(c1686a.f13541b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                nl0.m15084f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                nl0.m15088b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                nl0.m15088b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C1687b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new C1687b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m19901m = m19901m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C1687b c1687b = new C1687b(responseCode, null, hl0.m20644b(new BufferedReader(new InputStreamReader(m19901m))).mo18725c());
                    if (m19901m != null) {
                        m19901m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return c1687b;
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
        } catch (C1012cx e) {
            e = e;
            nl0.m15086d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C1687b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            nl0.m15086d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C1687b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            nl0.m15086d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C1687b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            nl0.m15086d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C1687b(400, null, 0L);
        }
    }

    /* renamed from: i */
    public final AbstractC1673ib m19905i(AbstractC0943ca abstractC0943ca) {
        cl0.AbstractC0968a m25252j;
        HashMap hashMap = new HashMap();
        for (AbstractC0896by abstractC0896by : abstractC0943ca.mo25478b()) {
            String mo25502j = abstractC0896by.mo25502j();
            if (hashMap.containsKey(mo25502j)) {
                ((List) hashMap.get(mo25502j)).add(abstractC0896by);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC0896by);
                hashMap.put(mo25502j, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC0896by abstractC0896by2 = (AbstractC0896by) ((List) entry.getValue()).get(0);
            gl0.AbstractC1439a mo20019b = gl0.m21499a().mo20015f(h01.DEFAULT).mo20014g(this.f13538f.mo21345a()).mo20013h(this.f13537e.mo21345a()).mo20019b(AbstractC3202uf.m8285a().mo8280c(AbstractC3202uf.EnumC3204b.ANDROID_FIREBASE).mo8281b(AbstractC3792z2.m2980a().mo2766m(Integer.valueOf(abstractC0896by2.m25746g("sdk-version"))).mo2769j(abstractC0896by2.m25747b("model")).mo2773f(abstractC0896by2.m25747b("hardware")).mo2775d(abstractC0896by2.m25747b("device")).mo2767l(abstractC0896by2.m25747b("product")).mo2768k(abstractC0896by2.m25747b("os-uild")).mo2771h(abstractC0896by2.m25747b("manufacturer")).mo2774e(abstractC0896by2.m25747b("fingerprint")).mo2776c(abstractC0896by2.m25747b("country")).mo2772g(abstractC0896by2.m25747b("locale")).mo2770i(abstractC0896by2.m25747b("mcc_mnc")).mo2777b(abstractC0896by2.m25747b("application_build")).mo2778a()).mo8282a());
            try {
                mo20019b.m21498i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                mo20019b.m21497j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC0896by abstractC0896by3 : (List) entry.getValue()) {
                C3475ww mo25504e = abstractC0896by3.mo25504e();
                C0892bx m5755b = mo25504e.m5755b();
                if (m5755b.equals(C0892bx.m25779b("proto"))) {
                    m25252j = cl0.m25252j(mo25504e.m5756a());
                } else if (m5755b.equals(C0892bx.m25779b("json"))) {
                    m25252j = cl0.m25253i(new String(mo25504e.m5756a(), Charset.forName("UTF-8")));
                } else {
                    nl0.m15083g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m5755b);
                }
                m25252j.mo20933c(abstractC0896by3.mo25503f()).mo20932d(abstractC0896by3.mo25501k()).mo20928h(abstractC0896by3.m25745h("tz-offset")).mo20931e(ls0.m16619a().mo16614c(ls0.EnumC2114c.m16611a(abstractC0896by3.m25746g("net-type"))).mo16615b(ls0.EnumC2113b.m16613a(abstractC0896by3.m25746g("mobile-subtype"))).mo16616a());
                if (abstractC0896by3.mo25505d() != null) {
                    m25252j.mo20934b(abstractC0896by3.mo25505d());
                }
                arrayList3.add(m25252j.mo20935a());
            }
            mo20019b.mo20018c(arrayList3);
            arrayList2.add(mo20019b.mo20020a());
        }
        return AbstractC1673ib.m19993a(arrayList2);
    }
}
