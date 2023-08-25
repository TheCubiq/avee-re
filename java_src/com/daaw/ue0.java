package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class ue0 implements hg0 {

    /* renamed from: g */
    public static final Pattern f29001g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    public static final String f29002h = Pattern.quote("/");

    /* renamed from: a */
    public final jg0 f29003a;

    /* renamed from: b */
    public final Context f29004b;

    /* renamed from: c */
    public final String f29005c;

    /* renamed from: d */
    public final e20 f29006d;

    /* renamed from: e */
    public final C1209ep f29007e;

    /* renamed from: f */
    public String f29008f;

    public ue0(Context context, String str, e20 e20Var, C1209ep c1209ep) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f29004b = context;
        this.f29005c = str;
        this.f29006d = e20Var;
        this.f29007e = c1209ep;
        this.f29003a = new jg0();
    }

    /* renamed from: c */
    public static String m8302c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: e */
    public static String m8300e(String str) {
        if (str == null) {
            return null;
        }
        return f29001g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    public static boolean m8294k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    @Override // com.daaw.hg0
    /* renamed from: a */
    public synchronized String mo8304a() {
        String m8293l;
        String str = this.f29008f;
        if (str != null) {
            return str;
        }
        ml0.m15976f().m15973i("Determining Crashlytics installation ID...");
        SharedPreferences m22649r = C1279fh.m22649r(this.f29004b);
        String string = m22649r.getString("firebase.installation.id", null);
        ml0 m15976f = ml0.m15976f();
        m15976f.m15973i("Cached Firebase Installation ID: " + string);
        if (this.f29007e.m23322d()) {
            String m8301d = m8301d();
            ml0 m15976f2 = ml0.m15976f();
            m15976f2.m15973i("Fetched Firebase Installation ID: " + m8301d);
            if (m8301d == null) {
                m8301d = string == null ? m8302c() : string;
            }
            m8293l = m8301d.equals(string) ? m8293l(m22649r) : m8303b(m8301d, m22649r);
        } else {
            m8293l = m8294k(string) ? m8293l(m22649r) : m8303b(m8302c(), m22649r);
        }
        this.f29008f = m8293l;
        if (this.f29008f == null) {
            ml0.m15976f().m15971k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f29008f = m8303b(m8302c(), m22649r);
        }
        ml0 m15976f3 = ml0.m15976f();
        m15976f3.m15973i("Crashlytics installation ID: " + this.f29008f);
        return this.f29008f;
    }

    /* renamed from: b */
    public final synchronized String m8303b(String str, SharedPreferences sharedPreferences) {
        String m8300e;
        m8300e = m8300e(UUID.randomUUID().toString());
        ml0 m15976f = ml0.m15976f();
        m15976f.m15973i("Created new Crashlytics installation ID: " + m8300e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", m8300e).putString("firebase.installation.id", str).apply();
        return m8300e;
    }

    /* renamed from: d */
    public final String m8301d() {
        try {
            return (String) yq1.m3444d(this.f29006d.getId());
        } catch (Exception e) {
            ml0.m15976f().m15970l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: f */
    public String m8299f() {
        return this.f29005c;
    }

    /* renamed from: g */
    public String m8298g() {
        return this.f29003a.m18529a(this.f29004b);
    }

    /* renamed from: h */
    public String m8297h() {
        return String.format(Locale.US, "%s/%s", m8292m(Build.MANUFACTURER), m8292m(Build.MODEL));
    }

    /* renamed from: i */
    public String m8296i() {
        return m8292m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String m8295j() {
        return m8292m(Build.VERSION.RELEASE);
    }

    /* renamed from: l */
    public final String m8293l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* renamed from: m */
    public final String m8292m(String str) {
        return str.replaceAll(f29002h, "");
    }
}
