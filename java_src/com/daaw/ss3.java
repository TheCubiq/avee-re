package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
/* loaded from: classes.dex */
public final class ss3 extends vy3 {
    public final /* synthetic */ QueryInfoGenerationCallback p;

    public ss3(ts3 ts3Var, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.p = queryInfoGenerationCallback;
    }

    @Override // com.daaw.wy3
    public final void B0(String str, String str2, Bundle bundle) {
        this.p.onSuccess(new QueryInfo(new zzem(str, bundle, str2)));
    }

    @Override // com.daaw.wy3
    public final void zzb(String str) {
        this.p.onFailure(str);
    }
}
