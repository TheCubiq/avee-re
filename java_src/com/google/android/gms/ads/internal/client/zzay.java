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

    /* renamed from: f */
    public static final zzay f36094f = new zzay();

    /* renamed from: a */
    public final d04 f36095a;

    /* renamed from: b */
    public final zzaw f36096b;

    /* renamed from: c */
    public final String f36097c;

    /* renamed from: d */
    public final zzchu f36098d;

    /* renamed from: e */
    public final Random f36099e;

    public zzay() {
        d04 d04Var = new d04();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzeq(), new af3(), new iw3(), new er3(), new bf3());
        String m24823i = d04.m24823i();
        zzchu zzchuVar = new zzchu(0, 224400000, true, false, false);
        Random random = new Random();
        this.f36095a = d04Var;
        this.f36096b = zzawVar;
        this.f36097c = m24823i;
        this.f36098d = zzchuVar;
        this.f36099e = random;
    }

    public static zzaw zza() {
        return f36094f.f36096b;
    }

    public static d04 zzb() {
        return f36094f.f36095a;
    }

    public static zzchu zzc() {
        return f36094f.f36098d;
    }

    public static String zzd() {
        return f36094f.f36097c;
    }

    public static Random zze() {
        return f36094f.f36099e;
    }
}
