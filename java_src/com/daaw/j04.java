package com.daaw;

import android.content.Context;
import android.provider.Settings;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public final class j04 {

    /* renamed from: c */
    public static boolean f14151c;

    /* renamed from: d */
    public static boolean f14152d;

    /* renamed from: g */
    public static final /* synthetic */ int f14155g = 0;

    /* renamed from: a */
    public final List f14156a;

    /* renamed from: b */
    public static final Object f14150b = new Object();

    /* renamed from: e */
    public static final InterfaceC0623ag f14153e = C2202mq.m15857d();

    /* renamed from: f */
    public static final Set f14154f = new HashSet(Arrays.asList(new String[0]));

    public j04(String str) {
        this.f14156a = !m19188l() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    /* renamed from: a */
    public static /* synthetic */ void m19199a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m19181s(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(C1926ka.m17934a(bArr));
        }
        jsonWriter.endObject();
    }

    /* renamed from: b */
    public static /* synthetic */ void m19198b(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        m19181s(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: i */
    public static void m19191i() {
        synchronized (f14150b) {
            f14151c = false;
            f14152d = false;
            k04.zzj("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: j */
    public static void m19190j(boolean z) {
        synchronized (f14150b) {
            f14151c = true;
            f14152d = z;
        }
    }

    /* renamed from: k */
    public static boolean m19189k(Context context) {
        if (((Boolean) wa3.f31100a.m16137e()).booleanValue()) {
            try {
                return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
            } catch (Exception e) {
                k04.zzk("Fail to determine debug setting.", e);
                return false;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m19188l() {
        boolean z;
        synchronized (f14150b) {
            z = false;
            if (f14151c && f14152d) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: m */
    public static boolean m19187m() {
        boolean z;
        synchronized (f14150b) {
            z = f14151c;
        }
        return z;
    }

    /* renamed from: n */
    public static synchronized void m19186n(String str) {
        synchronized (j04.class) {
            k04.zzi("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                k04.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i, Math.min(i2, str.length())))));
                i = i2;
            }
            k04.zzi("GMA Debug FINISH");
        }
    }

    /* renamed from: s */
    public static void m19181s(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f14154f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        k04.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    /* renamed from: c */
    public final void m19197c(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (m19188l()) {
            m19183q(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* renamed from: d */
    public final void m19196d(String str, String str2, Map map, byte[] bArr) {
        if (m19188l()) {
            m19183q(str, "GET", map, bArr);
        }
    }

    /* renamed from: e */
    public final void m19195e(HttpURLConnection httpURLConnection, int i) {
        if (m19188l()) {
            String str = null;
            m19182r(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    k04.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
                }
                m19184p(str);
            }
        }
    }

    /* renamed from: f */
    public final void m19194f(Map map, int i) {
        if (m19188l()) {
            m19182r(map, i);
            if (i < 200 || i >= 300) {
                m19184p(null);
            }
        }
    }

    /* renamed from: g */
    public final void m19193g(String str) {
        if (m19188l() && str != null) {
            m19192h(str.getBytes());
        }
    }

    /* renamed from: h */
    public final void m19192h(final byte[] bArr) {
        m19185o("onNetworkResponseBody", new i04() { // from class: com.daaw.h04
            @Override // com.daaw.i04
            /* renamed from: a */
            public final void mo20228a(JsonWriter jsonWriter) {
                String str;
                byte[] bArr2 = bArr;
                int i = j04.f14155g;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String m17934a = C1926ka.m17934a(bArr2);
                if (length >= 10000) {
                    m17934a = d04.m24822j(m17934a);
                    str = m17934a != null ? "bodydigest" : "bodydigest";
                    jsonWriter.name("bodylength").value(length);
                    jsonWriter.endObject();
                }
                str = "body";
                jsonWriter.name(str).value(m17934a);
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    /* renamed from: o */
    public final void m19185o(String str, i04 i04Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f14153e.mo15860a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.f14156a) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            i04Var.mo20228a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            k04.zzh("unable to log", e);
        }
        m19186n(stringWriter.toString());
    }

    /* renamed from: p */
    public final void m19184p(final String str) {
        m19185o("onNetworkRequestError", new i04() { // from class: com.daaw.f04
            @Override // com.daaw.i04
            /* renamed from: a */
            public final void mo20228a(JsonWriter jsonWriter) {
                String str2 = str;
                int i = j04.f14155g;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    /* renamed from: q */
    public final void m19183q(final String str, final String str2, final Map map, final byte[] bArr) {
        m19185o("onNetworkRequest", new i04() { // from class: com.daaw.g04
            @Override // com.daaw.i04
            /* renamed from: a */
            public final void mo20228a(JsonWriter jsonWriter) {
                j04.m19199a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    /* renamed from: r */
    public final void m19182r(final Map map, final int i) {
        m19185o("onNetworkResponse", new i04() { // from class: com.daaw.e04
            @Override // com.daaw.i04
            /* renamed from: a */
            public final void mo20228a(JsonWriter jsonWriter) {
                j04.m19198b(i, map, jsonWriter);
            }
        });
    }
}
