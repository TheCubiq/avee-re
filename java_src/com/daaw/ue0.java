package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class ue0 implements hg0 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final jg0 a;
    public final Context b;
    public final String c;
    public final e20 d;
    public final ep e;
    public String f;

    public ue0(Context context, String str, e20 e20Var, ep epVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = e20Var;
        this.e = epVar;
        this.a = new jg0();
    }

    public static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    @Override // com.daaw.hg0
    public synchronized String a() {
        String l;
        String str = this.f;
        if (str != null) {
            return str;
        }
        ml0.f().i("Determining Crashlytics installation ID...");
        SharedPreferences r = fh.r(this.b);
        String string = r.getString("firebase.installation.id", null);
        ml0 f = ml0.f();
        f.i("Cached Firebase Installation ID: " + string);
        if (this.e.d()) {
            String d = d();
            ml0 f2 = ml0.f();
            f2.i("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                d = string == null ? c() : string;
            }
            l = d.equals(string) ? l(r) : b(d, r);
        } else {
            l = k(string) ? l(r) : b(c(), r);
        }
        this.f = l;
        if (this.f == null) {
            ml0.f().k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f = b(c(), r);
        }
        ml0 f3 = ml0.f();
        f3.i("Crashlytics installation ID: " + this.f);
        return this.f;
    }

    public final synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = e(UUID.randomUUID().toString());
        ml0 f = ml0.f();
        f.i("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
        return e;
    }

    public final String d() {
        try {
            return (String) yq1.d(this.d.getId());
        } catch (Exception e) {
            ml0.f().l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.a.a(this.b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }

    public final String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String m(String str) {
        return str.replaceAll(h, "");
    }
}
