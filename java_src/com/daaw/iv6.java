package com.daaw;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
/* loaded from: classes.dex */
public class iv6 {
    public static final String g = new UUID(0, 0).toString();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final jv6 f;

    public iv6(Context context, String str, String str2, String str3) {
        this.f = jv6.b(context);
        this.a = str;
        this.b = str.concat("_3p");
        this.c = str2;
        this.d = str2.concat("_3p");
        this.e = str3;
    }

    public final long a(boolean z) {
        return this.f.a(z ? this.d : this.c, -1L);
    }

    public final hv6 b(String str, String str2, long j, boolean z) {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(g)) {
                    String e = e(true);
                    String c = this.f.c("paid_3p_hash_key", null);
                    if (e != null && c != null && !e.equals(h(str, str2, c))) {
                        return c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new hv6();
        }
        boolean z2 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long a = a(z2);
            if (a != -1) {
                if (currentTimeMillis < a) {
                    this.f.d(z2 ? this.d : this.c, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= a + j) {
                    return c(str, str2);
                }
            }
            String e2 = e(z2);
            return (e2 != null || z) ? new hv6(e2, a(z2)) : c(str, str2);
        }
        throw new IllegalStateException(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final hv6 c(String str, String str2) {
        String h;
        boolean z;
        if (str == null) {
            h = UUID.randomUUID().toString();
            z = false;
        } else {
            String uuid = UUID.randomUUID().toString();
            this.f.d("paid_3p_hash_key", uuid);
            h = h(str, str2, uuid);
            z = true;
        }
        return d(h, z);
    }

    public final hv6 d(String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            this.f.d(z ? this.d : this.c, Long.valueOf(currentTimeMillis));
            this.f.d(z ? this.b : this.a, str);
            return new hv6(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final String e(boolean z) {
        return this.f.c(z ? this.b : this.a, null);
    }

    public final void f(boolean z) {
        this.f.e(z ? this.d : this.c);
        this.f.e(z ? this.b : this.a);
    }

    public final boolean g(boolean z) {
        return this.f.g(this.a);
    }

    public final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.e;
        String str5 = str2 == null ? "null" : "not null";
        String str6 = str3 != null ? "not null" : "null";
        throw new IllegalArgumentException(str4 + ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is " + str5 + ", hashKey is " + str6);
    }
}
