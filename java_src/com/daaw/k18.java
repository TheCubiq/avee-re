package com.daaw;

import android.content.Context;
import android.database.ContentObserver;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class k18 implements b18 {

    /* renamed from: c */
    public static k18 f15603c;
    @Nullable

    /* renamed from: a */
    public final Context f15604a;
    @Nullable

    /* renamed from: b */
    public final ContentObserver f15605b;

    public k18() {
        this.f15604a = null;
        this.f15605b = null;
    }

    public k18(Context context) {
        this.f15604a = context;
        h18 h18Var = new h18(this, null);
        this.f15605b = h18Var;
        context.getContentResolver().registerContentObserver(tu7.f28079a, true, h18Var);
    }

    /* renamed from: a */
    public static k18 m18077a(Context context) {
        k18 k18Var;
        synchronized (k18.class) {
            if (f15603c == null) {
                f15603c = hw0.m20364b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new k18(context) : new k18();
            }
            k18Var = f15603c;
        }
        return k18Var;
    }

    /* renamed from: d */
    public static synchronized void m18074d() {
        Context context;
        synchronized (k18.class) {
            k18 k18Var = f15603c;
            if (k18Var != null && (context = k18Var.f15604a) != null && k18Var.f15605b != null) {
                context.getContentResolver().unregisterContentObserver(f15603c.f15605b);
            }
            f15603c = null;
        }
    }

    @Override // com.daaw.b18
    @Nullable
    /* renamed from: b */
    public final String zzb(final String str) {
        Context context = this.f15604a;
        if (context != null && !wv7.m5759a(context)) {
            try {
                return (String) v08.m7557a(new y08() { // from class: com.daaw.e18
                    @Override // com.daaw.y08
                    public final Object zza() {
                        return k18.this.m18075c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ String m18075c(String str) {
        return tu7.m8819a(this.f15604a.getContentResolver(), str, null);
    }
}
