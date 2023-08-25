package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class jv6 {

    /* renamed from: c */
    public static jv6 f15464c;

    /* renamed from: a */
    public final String f15465a;

    /* renamed from: b */
    public final SharedPreferences f15466b;

    public jv6(Context context) {
        this.f15465a = context.getPackageName();
        this.f15466b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    /* renamed from: b */
    public static jv6 m18218b(Context context) {
        if (f15464c == null) {
            f15464c = new jv6(context);
        }
        return f15464c;
    }

    /* renamed from: a */
    public final long m18219a(String str, long j) {
        return this.f15466b.getLong(str, -1L);
    }

    @Nullable
    /* renamed from: c */
    public final String m18217c(String str, String str2) {
        return this.f15466b.getString(str, null);
    }

    /* renamed from: d */
    public final void m18216d(String str, Object obj) {
        SharedPreferences.Editor putBoolean;
        if (obj instanceof String) {
            putBoolean = this.f15466b.edit().putString(str, (String) obj);
        } else if (obj instanceof Long) {
            putBoolean = this.f15466b.edit().putLong(str, ((Long) obj).longValue());
        } else if (!(obj instanceof Boolean)) {
            String valueOf = String.valueOf(obj.getClass());
            String str2 = this.f15465a;
            throw new IllegalArgumentException("Unexpected object class " + valueOf + " for app " + str2);
        } else {
            putBoolean = this.f15466b.edit().putBoolean(str, ((Boolean) obj).booleanValue());
        }
        if (putBoolean.commit()) {
            return;
        }
        String str3 = this.f15465a;
        throw new IOException("Failed to store " + str + " for app " + str3);
    }

    /* renamed from: e */
    public final void m18215e(String str) {
        if (this.f15466b.edit().remove(str).commit()) {
            return;
        }
        String str2 = this.f15465a;
        throw new IOException("Failed to remove " + str + " for app " + str2);
    }

    /* renamed from: f */
    public final boolean m18214f(String str, boolean z) {
        return this.f15466b.getBoolean(str, true);
    }

    /* renamed from: g */
    public final boolean m18213g(String str) {
        return this.f15466b.contains(str);
    }
}
