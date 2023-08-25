package com.daaw;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
/* loaded from: classes.dex */
public class iv6 {

    /* renamed from: g */
    public static final String f14054g = new UUID(0, 0).toString();

    /* renamed from: a */
    public final String f14055a;

    /* renamed from: b */
    public final String f14056b;

    /* renamed from: c */
    public final String f14057c;

    /* renamed from: d */
    public final String f14058d;

    /* renamed from: e */
    public final String f14059e;

    /* renamed from: f */
    public final jv6 f14060f;

    public iv6(Context context, String str, String str2, String str3) {
        this.f14060f = jv6.m18218b(context);
        this.f14055a = str;
        this.f14056b = str.concat("_3p");
        this.f14057c = str2;
        this.f14058d = str2.concat("_3p");
        this.f14059e = str3;
    }

    /* renamed from: a */
    public final long m19325a(boolean z) {
        return this.f14060f.m18219a(z ? this.f14058d : this.f14057c, -1L);
    }

    /* renamed from: b */
    public final hv6 m19324b(String str, String str2, long j, boolean z) {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f14054g)) {
                    String m19321e = m19321e(true);
                    String m18217c = this.f14060f.m18217c("paid_3p_hash_key", null);
                    if (m19321e != null && m18217c != null && !m19321e.equals(m19318h(str, str2, m18217c))) {
                        return m19323c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new hv6();
        }
        boolean z2 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long m19325a = m19325a(z2);
            if (m19325a != -1) {
                if (currentTimeMillis < m19325a) {
                    this.f14060f.m18216d(z2 ? this.f14058d : this.f14057c, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= m19325a + j) {
                    return m19323c(str, str2);
                }
            }
            String m19321e2 = m19321e(z2);
            return (m19321e2 != null || z) ? new hv6(m19321e2, m19325a(z2)) : m19323c(str, str2);
        }
        throw new IllegalStateException(this.f14059e.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    /* renamed from: c */
    public final hv6 m19323c(String str, String str2) {
        String m19318h;
        boolean z;
        if (str == null) {
            m19318h = UUID.randomUUID().toString();
            z = false;
        } else {
            String uuid = UUID.randomUUID().toString();
            this.f14060f.m18216d("paid_3p_hash_key", uuid);
            m19318h = m19318h(str, str2, uuid);
            z = true;
        }
        return m19322d(m19318h, z);
    }

    /* renamed from: d */
    public final hv6 m19322d(String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            this.f14060f.m18216d(z ? this.f14058d : this.f14057c, Long.valueOf(currentTimeMillis));
            this.f14060f.m18216d(z ? this.f14056b : this.f14055a, str);
            return new hv6(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.f14059e.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    /* renamed from: e */
    public final String m19321e(boolean z) {
        return this.f14060f.m18217c(z ? this.f14056b : this.f14055a, null);
    }

    /* renamed from: f */
    public final void m19320f(boolean z) {
        this.f14060f.m18215e(z ? this.f14058d : this.f14057c);
        this.f14060f.m18215e(z ? this.f14056b : this.f14055a);
    }

    /* renamed from: g */
    public final boolean m19319g(boolean z) {
        return this.f14060f.m18213g(this.f14055a);
    }

    /* renamed from: h */
    public final String m19318h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f14059e;
        String str5 = str2 == null ? "null" : "not null";
        String str6 = str3 != null ? "not null" : "null";
        throw new IllegalArgumentException(str4 + ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is " + str5 + ", hashKey is " + str6);
    }
}
