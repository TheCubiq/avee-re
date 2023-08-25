package com.google.android.gms.ads.internal.client;

import com.daaw.af3;
import com.daaw.bf3;
import com.daaw.d04;
import com.daaw.er3;
import com.daaw.iw3;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Random;
/* loaded from: classes.dex */
public final class zzay {
    public static final zzay f = new zzay();
    public final d04 a;
    public final zzaw b;
    public final String c;
    public final zzchu d;
    public final Random e;

    public zzay() {
        d04 d04Var = new d04();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzeq(), new af3(), new iw3(), new er3(), new bf3());
        String i = d04.i();
        zzchu zzchuVar = new zzchu(0, 224400000, true, false, false);
        Random random = new Random();
        this.a = d04Var;
        this.b = zzawVar;
        this.c = i;
        this.d = zzchuVar;
        this.e = random;
    }

    public static zzaw zza() {
        return f.b;
    }

    public static d04 zzb() {
        return f.a;
    }

    public static zzchu zzc() {
        return f.d;
    }

    public static String zzd() {
        return f.c;
    }

    public static Random zze() {
        return f.e;
    }
}
