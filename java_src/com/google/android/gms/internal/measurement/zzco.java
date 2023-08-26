package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzco implements zzcs {
    private static final Map<Uri, zzco> zza = new ArrayMap();
    private static final String[] zzh = {"key", "value"};
    private final ContentResolver zzb;
    private final Uri zzc;
    private volatile Map<String, String> zzf;
    private final ContentObserver zzd = new zzcq(this, null);
    private final Object zze = new Object();
    private final List<zzct> zzg = new ArrayList();

    private zzco(ContentResolver contentResolver, Uri uri) {
        this.zzb = contentResolver;
        this.zzc = uri;
        contentResolver.registerContentObserver(uri, false, this.zzd);
    }

    public static zzco zza(ContentResolver contentResolver, Uri uri) {
        zzco zzcoVar;
        synchronized (zzco.class) {
            zzcoVar = zza.get(uri);
            if (zzcoVar == null) {
                try {
                    zzco zzcoVar2 = new zzco(contentResolver, uri);
                    try {
                        zza.put(uri, zzcoVar2);
                    } catch (SecurityException unused) {
                    }
                    zzcoVar = zzcoVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzcoVar;
    }

    public final Map<String, String> zza() {
        Map<String, String> map = this.zzf;
        if (map == null) {
            synchronized (this.zze) {
                map = this.zzf;
                if (map == null) {
                    map = zze();
                    this.zzf = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final void zzb() {
        synchronized (this.zze) {
            this.zzf = null;
            zzdc.zza();
        }
        synchronized (this) {
            for (zzct zzctVar : this.zzg) {
                zzctVar.zza();
            }
        }
    }

    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) zzcv.zza(new zzcu(this) { // from class: com.google.android.gms.internal.measurement.zzcr
                    private final zzco zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // com.google.android.gms.internal.measurement.zzcu
                    public final Object zza() {
                        return this.zza.zzd();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zzc() {
        synchronized (zzco.class) {
            for (zzco zzcoVar : zza.values()) {
                zzcoVar.zzb.unregisterContentObserver(zzcoVar.zzd);
            }
            zza.clear();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcs
    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map zzd() {
        Map hashMap;
        Cursor query = this.zzb.query(this.zzc, zzh, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new ArrayMap(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }
}
