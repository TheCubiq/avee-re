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

    /* renamed from: a */
    public volatile ki3 f30242a;

    /* renamed from: b */
    public final Context f30243b;

    public vi3(Context context) {
        this.f30243b = context;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m7137b(vi3 vi3Var) {
        if (vi3Var.f30242a == null) {
            return;
        }
        vi3Var.f30242a.disconnect();
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
        long mo15859b = zzt.zzB().mo15859b();
        try {
            e14 e14Var = new e14();
            this.f30242a = new ki3(this.f30243b, zzt.zzt().zzb(), new ti3(this, e14Var), new ui3(this, e14Var));
            this.f30242a.checkAvailabilityAndConnect();
            ri3 ri3Var = new ri3(this, zzbrmVar);
            g77 g77Var = z04.f34305a;
            f77 m10628o = s67.m10628o(s67.m10629n(e14Var, ri3Var, g77Var), ((Integer) zzba.zzc().m23658b(g93.f10585W3)).intValue(), TimeUnit.MILLISECONDS, z04.f34308d);
            m10628o.mo6515f(new si3(this), g77Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) m10628o.get();
            long mo15859b2 = zzt.zzB().mo15859b();
            zze.zza("Http assets remote cache took " + (mo15859b2 - mo15859b) + "ms");
            zzbro zzbroVar = (zzbro) new zzcbz(parcelFileDescriptor).m1096h(zzbro.CREATOR);
            if (zzbroVar == null) {
                return null;
            }
            if (zzbroVar.f36858p) {
                throw new zf2(zzbroVar.f36859q);
            }
            if (zzbroVar.f36862t.length != zzbroVar.f36863u.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbroVar.f36862t;
                if (i >= strArr3.length) {
                    return new mf2(zzbroVar.f36860r, zzbroVar.f36861s, hashMap, zzbroVar.f36864v, zzbroVar.f36865w);
                }
                hashMap.put(strArr3[i], zzbroVar.f36863u[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            long mo15859b3 = zzt.zzB().mo15859b();
            zze.zza("Http assets remote cache took " + (mo15859b3 - mo15859b) + "ms");
            return null;
        } catch (Throwable th) {
            long mo15859b4 = zzt.zzB().mo15859b();
            zze.zza("Http assets remote cache took " + (mo15859b4 - mo15859b) + "ms");
            throw th;
        }
    }
}
