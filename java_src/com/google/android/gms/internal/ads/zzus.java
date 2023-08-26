package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public abstract class zzus<ReferenceT> {
    private final Map<String, CopyOnWriteArrayList<com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT>>> zzbpn = new HashMap();

    private final synchronized void zzb(String str, final Map<String, String> map) {
        if (zzakb.isLoggable(2)) {
            String valueOf = String.valueOf(str);
            zzakb.v(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                zzakb.v(sb.toString());
            }
        }
        CopyOnWriteArrayList<com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT>> copyOnWriteArrayList = this.zzbpn.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator<com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                final com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT> next = it.next();
                zzaoe.zzcvy.execute(new Runnable(this, next, map) { // from class: com.google.android.gms.internal.ads.zzut
                    private final zzus zzbpo;
                    private final com.google.android.gms.ads.internal.gmsg.zzv zzbpp;
                    private final Map zzbpq;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzbpo = this;
                        this.zzbpp = next;
                        this.zzbpq = map;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzus zzusVar = this.zzbpo;
                        this.zzbpp.zza(zzusVar.getReference(), this.zzbpq);
                    }
                });
            }
        }
    }

    public abstract ReferenceT getReference();

    public synchronized void reset() {
        this.zzbpn.clear();
    }

    public final synchronized void zza(String str, com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT> zzvVar) {
        CopyOnWriteArrayList<com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT>> copyOnWriteArrayList = this.zzbpn.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.zzbpn.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzvVar);
    }

    public final synchronized void zza(String str, Predicate<com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT>> predicate) {
        CopyOnWriteArrayList<com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT>> copyOnWriteArrayList = this.zzbpn.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT> next = it.next();
            if (predicate.apply(next)) {
                arrayList.add(next);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    public final synchronized void zzb(String str, com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT> zzvVar) {
        CopyOnWriteArrayList<com.google.android.gms.ads.internal.gmsg.zzv<? super ReferenceT>> copyOnWriteArrayList = this.zzbpn.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(zzvVar);
    }

    public final boolean zzf(Uri uri) {
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            String path = uri.getPath();
            com.google.android.gms.ads.internal.zzbv.zzek();
            zzb(path, zzakk.zzg(uri));
            return true;
        }
        return false;
    }
}
