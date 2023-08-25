package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class w06 implements i76 {
    public final i76 a;
    public final ri6 b;
    public final Context c;
    public final qz3 d;

    public w06(u26 u26Var, ri6 ri6Var, Context context, qz3 qz3Var) {
        this.a = u26Var;
        this.b = ri6Var;
        this.c = context;
        this.d = qz3Var;
    }

    public final /* synthetic */ x06 a(n76 n76Var) {
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        int i3;
        DisplayMetrics displayMetrics;
        zzq zzqVar = this.b.e;
        zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzq zzqVar2 : zzqVarArr) {
                boolean z4 = zzqVar2.zzi;
                if (!z4 && !z2) {
                    str = zzqVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzqVar.zza;
            z = zzqVar.zzi;
        }
        Resources resources = this.c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            float f2 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            str2 = this.d.h().zzm();
            i = i4;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z5 = false;
            for (zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i5 = zzqVar3.zze;
                    if (i5 == -1) {
                        i5 = f != 0.0f ? (int) (zzqVar3.zzf / f) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = zzqVar3.zzb;
                    if (i6 == -2) {
                        i6 = f != 0.0f ? (int) (zzqVar3.zzc / f) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new x06(zzqVar, str, z, sb.toString(), f, i, i2, str2, this.b.p);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 7;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.m(this.a.zzb(), new ey6() { // from class: com.daaw.v06
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return w06.this.a((n76) obj);
            }
        }, z04.f);
    }
}
