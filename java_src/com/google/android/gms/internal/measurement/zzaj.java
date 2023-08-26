package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzag;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzaj extends zzag.zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzag zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzag zzagVar, String str, String str2, Context context, Bundle bundle) {
        super(zzagVar);
        this.zzg = zzagVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:3:0x0002, B:5:0x0019, B:7:0x002a, B:13:0x003f, B:15:0x0054, B:17:0x0060, B:19:0x006e, B:30:0x0083), top: B:35:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:3:0x0002, B:5:0x0019, B:7:0x002a, B:13:0x003f, B:15:0x0054, B:17:0x0060, B:19:0x006e, B:30:0x0083), top: B:35:0x0002 }] */
    @Override // com.google.android.gms.internal.measurement.zzag.zzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza() {
        boolean zzc;
        String str;
        String str2;
        String str3;
        Boolean bool;
        boolean z;
        zzv zzvVar;
        int zzg;
        int zzf;
        boolean z2;
        int i;
        zzv zzvVar2;
        String str4;
        String str5;
        try {
            this.zzg.zzf = new ArrayList();
            zzag zzagVar = this.zzg;
            zzc = zzag.zzc(this.zzc, this.zzd);
            if (zzc) {
                String str6 = this.zzd;
                String str7 = this.zzc;
                str5 = this.zzg.zzc;
                str2 = str7;
                str3 = str6;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            zzag.zzh(this.zze);
            bool = zzag.zzh;
            if (!bool.booleanValue() && str2 == null) {
                z = false;
                this.zzg.zzm = this.zzg.zza(this.zze, z);
                zzvVar = this.zzg.zzm;
                if (zzvVar != null) {
                    str4 = this.zzg.zzc;
                    Log.w(str4, "Failed to connect to measurement client.");
                    return;
                }
                zzg = zzag.zzg(this.zze);
                zzf = zzag.zzf(this.zze);
                if (z) {
                    i = Math.max(zzg, zzf);
                    z2 = zzf < zzg;
                } else {
                    if (zzg > 0) {
                        zzf = zzg;
                    }
                    z2 = zzg > 0;
                    i = zzf;
                }
                zzae zzaeVar = new zzae(31049L, i, z2, str, str2, str3, this.zzf);
                zzvVar2 = this.zzg.zzm;
                zzvVar2.initialize(ObjectWrapper.wrap(this.zze), zzaeVar, this.zza);
                return;
            }
            z = true;
            this.zzg.zzm = this.zzg.zza(this.zze, z);
            zzvVar = this.zzg.zzm;
            if (zzvVar != null) {
            }
        } catch (Exception e) {
            this.zzg.zza(e, true, false);
        }
    }
}
