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
    public static boolean c;
    public static boolean d;
    public static final /* synthetic */ int g = 0;
    public final List a;
    public static final Object b = new Object();
    public static final ag e = mq.d();
    public static final Set f = new HashSet(Arrays.asList(new String[0]));

    public j04(String str) {
        this.a = !l() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        s(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(ka.a(bArr));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void b(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        s(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void i() {
        synchronized (b) {
            c = false;
            d = false;
            k04.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void j(boolean z) {
        synchronized (b) {
            c = true;
            d = z;
        }
    }

    public static boolean k(Context context) {
        if (((Boolean) wa3.a.e()).booleanValue()) {
            try {
                return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
            } catch (Exception e2) {
                k04.zzk("Fail to determine debug setting.", e2);
                return false;
            }
        }
        return false;
    }

    public static boolean l() {
        boolean z;
        synchronized (b) {
            z = false;
            if (c && d) {
                z = true;
            }
        }
        return z;
    }

    public static boolean m() {
        boolean z;
        synchronized (b) {
            z = c;
        }
        return z;
    }

    public static synchronized void n(String str) {
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

    public static void s(JsonWriter jsonWriter, Map map) {
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
            if (!f.contains(str)) {
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

    public final void c(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (l()) {
            q(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void d(String str, String str2, Map map, byte[] bArr) {
        if (l()) {
            q(str, "GET", map, bArr);
        }
    }

    public final void e(HttpURLConnection httpURLConnection, int i) {
        if (l()) {
            String str = null;
            r(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    k04.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e2.getMessage())));
                }
                p(str);
            }
        }
    }

    public final void f(Map map, int i) {
        if (l()) {
            r(map, i);
            if (i < 200 || i >= 300) {
                p(null);
            }
        }
    }

    public final void g(String str) {
        if (l() && str != null) {
            h(str.getBytes());
        }
    }

    public final void h(final byte[] bArr) {
        o("onNetworkResponseBody", new i04() { // from class: com.daaw.h04
            @Override // com.daaw.i04
            public final void a(JsonWriter jsonWriter) {
                String str;
                byte[] bArr2 = bArr;
                int i = j04.g;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String a = ka.a(bArr2);
                if (length >= 10000) {
                    a = d04.j(a);
                    str = a != null ? "bodydigest" : "bodydigest";
                    jsonWriter.name("bodylength").value(length);
                    jsonWriter.endObject();
                }
                str = "body";
                jsonWriter.name(str).value(a);
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public final void o(String str, i04 i04Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.a) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            i04Var.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            k04.zzh("unable to log", e2);
        }
        n(stringWriter.toString());
    }

    public final void p(final String str) {
        o("onNetworkRequestError", new i04() { // from class: com.daaw.f04
            @Override // com.daaw.i04
            public final void a(JsonWriter jsonWriter) {
                String str2 = str;
                int i = j04.g;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    public final void q(final String str, final String str2, final Map map, final byte[] bArr) {
        o("onNetworkRequest", new i04() { // from class: com.daaw.g04
            @Override // com.daaw.i04
            public final void a(JsonWriter jsonWriter) {
                j04.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    public final void r(final Map map, final int i) {
        o("onNetworkResponse", new i04() { // from class: com.daaw.e04
            @Override // com.daaw.i04
            public final void a(JsonWriter jsonWriter) {
                j04.b(i, map, jsonWriter);
            }
        });
    }
}
