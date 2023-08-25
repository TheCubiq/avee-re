package com.daaw;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class h08 implements b18 {
    public static final Map h = new g6();
    public static final String[] i = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final ContentObserver d;
    public final Object e;
    public volatile Map f;
    public final List g;

    public h08(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        ez7 ez7Var = new ez7(this, null);
        this.d = ez7Var;
        this.e = new Object();
        this.g = new ArrayList();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, ez7Var);
    }

    public static h08 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        h08 h08Var;
        synchronized (h08.class) {
            Map map = h;
            h08Var = (h08) map.get(uri);
            if (h08Var == null) {
                try {
                    h08 h08Var2 = new h08(contentResolver, uri, runnable);
                    try {
                        map.put(uri, h08Var2);
                    } catch (SecurityException unused) {
                    }
                    h08Var = h08Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return h08Var;
    }

    public static synchronized void d() {
        synchronized (h08.class) {
            for (h08 h08Var : h.values()) {
                h08Var.a.unregisterContentObserver(h08Var.d);
            }
            h.clear();
        }
    }

    public final Map b() {
        Map map;
        Map map2 = this.f;
        if (map2 == null) {
            synchronized (this.e) {
                map2 = this.f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) v08.a(new y08() { // from class: com.daaw.cy7
                            @Override // com.daaw.y08
                            public final Object zza() {
                                return h08.this.c();
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                    this.f = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    public final /* synthetic */ Map c() {
        Cursor query = this.a.query(this.b, i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map g6Var = count <= 256 ? new g6(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                g6Var.put(query.getString(0), query.getString(1));
            }
            return g6Var;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.e) {
            this.f = null;
            this.c.run();
        }
        synchronized (this) {
            for (p08 p08Var : this.g) {
                p08Var.zza();
            }
        }
    }

    @Override // com.daaw.b18
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) b().get(str);
    }
}
