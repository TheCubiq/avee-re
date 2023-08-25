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

    /* renamed from: h */
    public static final Map f11934h = new C1370g6();

    /* renamed from: i */
    public static final String[] f11935i = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f11936a;

    /* renamed from: b */
    public final Uri f11937b;

    /* renamed from: c */
    public final Runnable f11938c;

    /* renamed from: d */
    public final ContentObserver f11939d;

    /* renamed from: e */
    public final Object f11940e;

    /* renamed from: f */
    public volatile Map f11941f;

    /* renamed from: g */
    public final List f11942g;

    public h08(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        ez7 ez7Var = new ez7(this, null);
        this.f11939d = ez7Var;
        this.f11940e = new Object();
        this.f11942g = new ArrayList();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f11936a = contentResolver;
        this.f11937b = uri;
        this.f11938c = runnable;
        contentResolver.registerContentObserver(uri, false, ez7Var);
    }

    /* renamed from: a */
    public static h08 m21116a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        h08 h08Var;
        synchronized (h08.class) {
            Map map = f11934h;
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

    /* renamed from: d */
    public static synchronized void m21113d() {
        synchronized (h08.class) {
            for (h08 h08Var : f11934h.values()) {
                h08Var.f11936a.unregisterContentObserver(h08Var.f11939d);
            }
            f11934h.clear();
        }
    }

    /* renamed from: b */
    public final Map m21115b() {
        Map map;
        Map map2 = this.f11941f;
        if (map2 == null) {
            synchronized (this.f11940e) {
                map2 = this.f11941f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) v08.m7557a(new y08() { // from class: com.daaw.cy7
                            @Override // com.daaw.y08
                            public final Object zza() {
                                return h08.this.m21114c();
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
                    this.f11941f = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    /* renamed from: c */
    public final /* synthetic */ Map m21114c() {
        Cursor query = this.f11936a.query(this.f11937b, f11935i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c1370g6 = count <= 256 ? new C1370g6(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                c1370g6.put(query.getString(0), query.getString(1));
            }
            return c1370g6;
        } finally {
            query.close();
        }
    }

    /* renamed from: e */
    public final void m21112e() {
        synchronized (this.f11940e) {
            this.f11941f = null;
            this.f11938c.run();
        }
        synchronized (this) {
            for (p08 p08Var : this.f11942g) {
                p08Var.zza();
            }
        }
    }

    @Override // com.daaw.b18
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) m21115b().get(str);
    }
}
