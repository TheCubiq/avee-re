package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import java.io.File;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzalt {
    private static zzv zzctf;
    private static final Object zzctg = new Object();
    @Deprecated
    private static final zzalz<Void> zzcth = new zzalu();

    public zzalt(Context context) {
        zzbb(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    private static zzv zzbb(Context context) {
        zzv zzvVar;
        zzv zzvVar2;
        synchronized (zzctg) {
            if (zzctf == null) {
                zznk.initialize(context);
                if (((Boolean) zzkb.zzik().zzd(zznk.zzbdv)).booleanValue()) {
                    zzvVar2 = zzaln.zzba(context);
                } else {
                    zzvVar2 = new zzv(new zzam(new File(context.getCacheDir(), "volley")), new zzaj((zzai) new zzas()));
                    zzvVar2.start();
                }
                zzctf = zzvVar2;
            }
            zzvVar = zzctf;
        }
        return zzvVar;
    }

    public final zzanz<String> zza(int i, String str, Map<String, String> map, byte[] bArr) {
        zzama zzamaVar = new zzama(null);
        zzalx zzalxVar = new zzalx(this, str, zzamaVar);
        zzamy zzamyVar = new zzamy(null);
        zzaly zzalyVar = new zzaly(this, i, str, zzamaVar, zzalxVar, bArr, map, zzamyVar);
        if (zzamy.isEnabled()) {
            try {
                zzamyVar.zza(str, ShareTarget.METHOD_GET, zzalyVar.getHeaders(), zzalyVar.zzg());
            } catch (zza e) {
                zzakb.zzdk(e.getMessage());
            }
        }
        zzctf.zze(zzalyVar);
        return zzamaVar;
    }

    @Deprecated
    public final <T> zzanz<T> zza(String str, zzalz<T> zzalzVar) {
        zzaoj zzaojVar = new zzaoj();
        zzctf.zze(new zzamb(str, zzaojVar));
        return zzano.zza(zzano.zza(zzaojVar, new zzalw(this, zzalzVar), zzaki.zzcrj), Throwable.class, new zzalv(this, zzalzVar), zzaoe.zzcvz);
    }

    public final zzanz<String> zzc(String str, Map<String, String> map) {
        return zza(0, str, map, null);
    }
}
