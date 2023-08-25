package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
public final class m38 implements b18 {

    /* renamed from: b */
    public static final Map f18429b = new C1370g6();

    /* renamed from: a */
    public final SharedPreferences f18430a;

    /* renamed from: a */
    public static m38 m16237a(Context context, String str, Runnable runnable) {
        m38 m38Var;
        if (wv7.m5758b()) {
            throw null;
        }
        synchronized (m38.class) {
            m38Var = (m38) f18429b.get(null);
            if (m38Var == null) {
                StrictMode.allowThreadDiskReads();
                throw null;
            }
        }
        return m38Var;
    }

    /* renamed from: b */
    public static synchronized void m16236b() {
        synchronized (m38.class) {
            Map map = f18429b;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((m38) it.next()).f18430a;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.daaw.b18
    public final Object zzb(String str) {
        throw null;
    }
}
