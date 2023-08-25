package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class jv6 {
    public static jv6 c;
    public final String a;
    public final SharedPreferences b;

    public jv6(Context context) {
        this.a = context.getPackageName();
        this.b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public static jv6 b(Context context) {
        if (c == null) {
            c = new jv6(context);
        }
        return c;
    }

    public final long a(String str, long j) {
        return this.b.getLong(str, -1L);
    }

    @Nullable
    public final String c(String str, String str2) {
        return this.b.getString(str, null);
    }

    public final void d(String str, Object obj) {
        SharedPreferences.Editor putBoolean;
        if (obj instanceof String) {
            putBoolean = this.b.edit().putString(str, (String) obj);
        } else if (obj instanceof Long) {
            putBoolean = this.b.edit().putLong(str, ((Long) obj).longValue());
        } else if (!(obj instanceof Boolean)) {
            String valueOf = String.valueOf(obj.getClass());
            String str2 = this.a;
            throw new IllegalArgumentException("Unexpected object class " + valueOf + " for app " + str2);
        } else {
            putBoolean = this.b.edit().putBoolean(str, ((Boolean) obj).booleanValue());
        }
        if (putBoolean.commit()) {
            return;
        }
        String str3 = this.a;
        throw new IOException("Failed to store " + str + " for app " + str3);
    }

    public final void e(String str) {
        if (this.b.edit().remove(str).commit()) {
            return;
        }
        String str2 = this.a;
        throw new IOException("Failed to remove " + str + " for app " + str2);
    }

    public final boolean f(String str, boolean z) {
        return this.b.getBoolean(str, true);
    }

    public final boolean g(String str) {
        return this.b.contains(str);
    }
}
