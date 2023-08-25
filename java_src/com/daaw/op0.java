package com.daaw;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class op0 {

    /* renamed from: b */
    public static final Charset f21792b = Charset.forName("UTF-8");

    /* renamed from: a */
    public final h10 f21793a;

    public op0(h10 h10Var) {
        this.f21793a = h10Var;
    }

    /* renamed from: d */
    public static Map<String, String> m14109d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m14104i(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m14105h(File file) {
        if (file.exists() && file.delete()) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15975g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: i */
    public static String m14104i(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public File m14112a(String str) {
        return this.f21793a.m21097o(str, "internal-keys");
    }

    /* renamed from: b */
    public File m14111b(String str) {
        return this.f21793a.m21097o(str, "keys");
    }

    /* renamed from: c */
    public File m14110c(String str) {
        return this.f21793a.m21097o(str, "user-data");
    }

    /* renamed from: e */
    public final String m14108e(String str) {
        return m14104i(new JSONObject(str), "userId");
    }

    /* renamed from: f */
    public Map<String, String> m14107f(String str, boolean z) {
        FileInputStream fileInputStream;
        Exception e;
        File m14112a = z ? m14112a(str) : m14111b(str);
        if (!m14112a.exists() || m14112a.length() == 0) {
            m14105h(m14112a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(m14112a);
            try {
                try {
                    Map<String, String> m14109d = m14109d(C1279fh.m22667A(fileInputStream));
                    C1279fh.m22662e(fileInputStream, "Failed to close user metadata file.");
                    return m14109d;
                } catch (Exception e2) {
                    e = e2;
                    ml0.m15976f().m15970l("Error deserializing user metadata.", e);
                    m14105h(m14112a);
                    C1279fh.m22662e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                C1279fh.m22662e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            fileInputStream = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            C1279fh.m22662e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: g */
    public String m14106g(String str) {
        FileInputStream fileInputStream;
        File m14110c = m14110c(str);
        FileInputStream fileInputStream2 = null;
        if (!m14110c.exists() || m14110c.length() == 0) {
            ml0.m15976f().m15980b("No userId set for session " + str);
            m14105h(m14110c);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(m14110c);
            try {
                try {
                    String m14108e = m14108e(C1279fh.m22667A(fileInputStream));
                    ml0.m15976f().m15980b("Loaded userId " + m14108e + " for session " + str);
                    C1279fh.m22662e(fileInputStream, "Failed to close user metadata file.");
                    return m14108e;
                } catch (Exception e) {
                    e = e;
                    ml0.m15976f().m15970l("Error deserializing user metadata.", e);
                    m14105h(m14110c);
                    C1279fh.m22662e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                C1279fh.m22662e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            C1279fh.m22662e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
