package com.daaw;

import android.content.Context;
import android.database.ContentObserver;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class k18 implements b18 {
    public static k18 c;
    @Nullable
    public final Context a;
    @Nullable
    public final ContentObserver b;

    public k18() {
        this.a = null;
        this.b = null;
    }

    public k18(Context context) {
        this.a = context;
        h18 h18Var = new h18(this, null);
        this.b = h18Var;
        context.getContentResolver().registerContentObserver(tu7.a, true, h18Var);
    }

    public static k18 a(Context context) {
        k18 k18Var;
        synchronized (k18.class) {
            if (c == null) {
                c = hw0.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new k18(context) : new k18();
            }
            k18Var = c;
        }
        return k18Var;
    }

    public static synchronized void d() {
        Context context;
        synchronized (k18.class) {
            k18 k18Var = c;
            if (k18Var != null && (context = k18Var.a) != null && k18Var.b != null) {
                context.getContentResolver().unregisterContentObserver(c.b);
            }
            c = null;
        }
    }

    @Override // com.daaw.b18
    @Nullable
    /* renamed from: b */
    public final String zzb(final String str) {
        Context context = this.a;
        if (context != null && !wv7.a(context)) {
            try {
                return (String) v08.a(new y08() { // from class: com.daaw.e18
                    @Override // com.daaw.y08
                    public final Object zza() {
                        return k18.this.c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    public final /* synthetic */ String c(String str) {
        return tu7.a(this.a.getContentResolver(), str, null);
    }
}
