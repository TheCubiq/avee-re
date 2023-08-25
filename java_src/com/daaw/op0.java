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
    public static final Charset b = Charset.forName("UTF-8");
    public final h10 a;

    public op0(h10 h10Var) {
        this.a = h10Var;
    }

    public static Map<String, String> d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, i(jSONObject, next));
        }
        return hashMap;
    }

    public static void h(File file) {
        if (file.exists() && file.delete()) {
            ml0 f = ml0.f();
            f.g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static String i(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.a.o(str, "internal-keys");
    }

    public File b(String str) {
        return this.a.o(str, "keys");
    }

    public File c(String str) {
        return this.a.o(str, "user-data");
    }

    public final String e(String str) {
        return i(new JSONObject(str), "userId");
    }

    public Map<String, String> f(String str, boolean z) {
        FileInputStream fileInputStream;
        Exception e;
        File a = z ? a(str) : b(str);
        if (!a.exists() || a.length() == 0) {
            h(a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(a);
            try {
                try {
                    Map<String, String> d = d(fh.A(fileInputStream));
                    fh.e(fileInputStream, "Failed to close user metadata file.");
                    return d;
                } catch (Exception e2) {
                    e = e2;
                    ml0.f().l("Error deserializing user metadata.", e);
                    h(a);
                    fh.e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                fh.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            fileInputStream = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            fh.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public String g(String str) {
        FileInputStream fileInputStream;
        File c = c(str);
        FileInputStream fileInputStream2 = null;
        if (!c.exists() || c.length() == 0) {
            ml0.f().b("No userId set for session " + str);
            h(c);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                try {
                    String e = e(fh.A(fileInputStream));
                    ml0.f().b("Loaded userId " + e + " for session " + str);
                    fh.e(fileInputStream, "Failed to close user metadata file.");
                    return e;
                } catch (Exception e2) {
                    e = e2;
                    ml0.f().l("Error deserializing user metadata.", e);
                    h(c);
                    fh.e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                fh.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fh.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
