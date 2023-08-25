package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import com.daaw.bm1;
import com.daaw.f20;
import com.daaw.ig0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class z10 {

    /* renamed from: d */
    public static final Pattern f34325d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    public static final Charset f34326e = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f34327a;

    /* renamed from: b */
    public final b01<va0> f34328b;

    /* renamed from: c */
    public final p41 f34329c = new p41();

    public z10(Context context, b01<va0> b01Var) {
        this.f34327a = context;
        this.f34328b = b01Var;
    }

    /* renamed from: a */
    public static String m3001a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    public static JSONObject m3000b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public static JSONObject m2999c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: h */
    public static byte[] m2994h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    public static boolean m2993i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    public static void m2992j() {
    }

    /* renamed from: k */
    public static void m2991k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        if (TextUtils.isEmpty(m2987o(httpURLConnection))) {
            return;
        }
        m3001a(str, str2, str3);
    }

    /* renamed from: m */
    public static long m2989m(String str) {
        ry0.m10838b(f34325d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: o */
    public static String m2987o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f34326e));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    /* renamed from: s */
    public static void m2983s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public ig0 m2998d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        ig0 m2988n;
        if (this.f34329c.m13645b()) {
            URL m2995g = m2995g(String.format("projects/%s/installations", str3));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection m2990l = m2990l(m2995g, str);
                try {
                    m2990l.setRequestMethod("POST");
                    m2990l.setDoOutput(true);
                    if (str5 != null) {
                        m2990l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m2985q(m2990l, str2, str4);
                    responseCode = m2990l.getResponseCode();
                    this.f34329c.m13641f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m2990l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (m2993i(responseCode)) {
                    m2988n = m2988n(m2990l);
                } else {
                    m2991k(m2990l, str4, str, str3);
                    if (responseCode == 429) {
                        throw new f20("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", f20.EnumC1246a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        m2992j();
                        m2988n = ig0.m19840a().mo19830e(ig0.EnumC1703b.BAD_CONFIG).mo19834a();
                    } else {
                        m2990l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                m2990l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m2988n;
            }
            throw new f20("Firebase Installations Service is unavailable. Please try again later.", f20.EnumC1246a.UNAVAILABLE);
        }
        throw new f20("Firebase Installations Service is unavailable. Please try again later.", f20.EnumC1246a.UNAVAILABLE);
    }

    /* renamed from: e */
    public bm1 m2997e(String str, String str2, String str3, String str4) {
        int responseCode;
        bm1 m2986p;
        bm1.AbstractC0872a mo7322b;
        if (this.f34329c.m13645b()) {
            URL m2995g = m2995g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection m2990l = m2990l(m2995g, str);
                try {
                    m2990l.setRequestMethod("POST");
                    m2990l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m2990l.setDoOutput(true);
                    m2984r(m2990l);
                    responseCode = m2990l.getResponseCode();
                    this.f34329c.m13641f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m2990l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (m2993i(responseCode)) {
                    m2986p = m2986p(m2990l);
                } else {
                    m2991k(m2990l, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new f20("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", f20.EnumC1246a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            m2992j();
                            mo7322b = bm1.m25997a().mo7322b(bm1.EnumC0873b.BAD_CONFIG);
                            m2986p = mo7322b.mo7323a();
                        } else {
                            m2990l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    mo7322b = bm1.m25997a().mo7322b(bm1.EnumC0873b.AUTH_ERROR);
                    m2986p = mo7322b.mo7323a();
                }
                m2990l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m2986p;
            }
            throw new f20("Firebase Installations Service is unavailable. Please try again later.", f20.EnumC1246a.UNAVAILABLE);
        }
        throw new f20("Firebase Installations Service is unavailable. Please try again later.", f20.EnumC1246a.UNAVAILABLE);
    }

    /* renamed from: f */
    public final String m2996f() {
        try {
            Context context = this.f34327a;
            byte[] m26515a = C0803b3.m26515a(context, context.getPackageName());
            if (m26515a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not get fingerprint hash for package: ");
                sb.append(this.f34327a.getPackageName());
                return null;
            }
            return db0.m24573b(m26515a, false);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.f34327a.getPackageName());
            return null;
        }
    }

    /* renamed from: g */
    public final URL m2995g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new f20(e.getMessage(), f20.EnumC1246a.UNAVAILABLE);
        }
    }

    /* renamed from: l */
    public final HttpURLConnection m2990l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f34327a.getPackageName());
            va0 va0Var = this.f34328b.get();
            if (va0Var != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) dk1.m24308a(va0Var.mo7304a()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m2996f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new f20("Firebase Installations Service is unavailable. Please try again later.", f20.EnumC1246a.UNAVAILABLE);
        }
    }

    /* renamed from: n */
    public final ig0 m2988n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f34326e));
        bm1.AbstractC0872a m25997a = bm1.m25997a();
        ig0.AbstractC1702a m19840a = ig0.m19840a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                m19840a.mo19829f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m19840a.mo19832c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m19840a.mo19831d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m25997a.mo7321c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m25997a.mo7320d(m2989m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m19840a.mo19833b(m25997a.mo7323a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m19840a.mo19830e(ig0.EnumC1703b.OK).mo19834a();
    }

    /* renamed from: p */
    public final bm1 m2986p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f34326e));
        bm1.AbstractC0872a m25997a = bm1.m25997a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m25997a.mo7321c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m25997a.mo7320d(m2989m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m25997a.mo7322b(bm1.EnumC0873b.OK).mo7323a();
    }

    /* renamed from: q */
    public final void m2985q(HttpURLConnection httpURLConnection, String str, String str2) {
        m2983s(httpURLConnection, m2994h(m3000b(str, str2)));
    }

    /* renamed from: r */
    public final void m2984r(HttpURLConnection httpURLConnection) {
        m2983s(httpURLConnection, m2994h(m2999c()));
    }
}
