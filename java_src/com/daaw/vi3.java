package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzcbz;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class vi3 implements ff2 {
    public volatile ki3 a;
    public final Context b;

    public vi3(Context context) {
        this.b = context;
    }

    public static /* bridge */ /* synthetic */ void b(vi3 vi3Var) {
        if (vi3Var.a == null) {
            return;
        }
        vi3Var.a.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.daaw.ff2
    public final mf2 zza(qf2 qf2Var) {
        Parcelable.Creator<zzbrm> creator = zzbrm.CREATOR;
        Map zzl = qf2Var.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbrm zzbrmVar = new zzbrm(qf2Var.zzk(), strArr, strArr2);
        long b = zzt.zzB().b();
        try {
            e14 e14Var = new e14();
            this.a = new ki3(this.b, zzt.zzt().zzb(), new ti3(this, e14Var), new ui3(this, e14Var));
            this.a.checkAvailabilityAndConnect();
            ri3 ri3Var = new ri3(this, zzbrmVar);
            g77 g77Var = z04.a;
            f77 o = s67.o(s67.n(e14Var, ri3Var, g77Var), ((Integer) zzba.zzc().b(g93.W3)).intValue(), TimeUnit.MILLISECONDS, z04.d);
            o.f(new si3(this), g77Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) o.get();
            long b2 = zzt.zzB().b();
            zze.zza("Http assets remote cache took " + (b2 - b) + "ms");
            zzbro zzbroVar = (zzbro) new zzcbz(parcelFileDescriptor).h(zzbro.CREATOR);
            if (zzbroVar == null) {
                return null;
            }
            if (zzbroVar.p) {
                throw new zf2(zzbroVar.q);
            }
            if (zzbroVar.t.length != zzbroVar.u.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbroVar.t;
                if (i >= strArr3.length) {
                    return new mf2(zzbroVar.r, zzbroVar.s, hashMap, zzbroVar.v, zzbroVar.w);
                }
                hashMap.put(strArr3[i], zzbroVar.u[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            long b3 = zzt.zzB().b();
            zze.zza("Http assets remote cache took " + (b3 - b) + "ms");
            return null;
        } catch (Throwable th) {
            long b4 = zzt.zzB().b();
            zze.zza("Http assets remote cache took " + (b4 - b) + "ms");
            throw th;
        }
    }
}
