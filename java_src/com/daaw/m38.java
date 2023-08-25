package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
public final class m38 implements b18 {
    public static final Map b = new g6();
    public final SharedPreferences a;

    public static m38 a(Context context, String str, Runnable runnable) {
        m38 m38Var;
        if (wv7.b()) {
            throw null;
        }
        synchronized (m38.class) {
            m38Var = (m38) b.get(null);
            if (m38Var == null) {
                StrictMode.allowThreadDiskReads();
                throw null;
            }
        }
        return m38Var;
    }

    public static synchronized void b() {
        synchronized (m38.class) {
            Map map = b;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((m38) it.next()).a;
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
