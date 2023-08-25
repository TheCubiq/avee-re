package com.daaw;

import android.util.Pair;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzao;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
/* loaded from: classes.dex */
public final class q32 implements o67 {
    public final /* synthetic */ zzac a;

    public q32(zzac zzacVar) {
        this.a = zzacVar;
    }

    @Override // com.daaw.o67
    public final /* synthetic */ void a(Object obj) {
        zzao zzaoVar = (zzao) obj;
        k04.zze("Initialized webview successfully for SDKCore.");
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        pd5 pd5Var;
        fd5 fd5Var;
        zzt.zzo().u(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzac zzacVar = this.a;
        pd5Var = zzacVar.B;
        fd5Var = zzacVar.t;
        zzf.zzc(pd5Var, fd5Var, "sgf", new Pair("sgf_reason", th.getMessage()));
        k04.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }
}
