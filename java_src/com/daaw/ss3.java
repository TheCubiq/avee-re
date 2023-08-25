package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
/* loaded from: classes.dex */
public final class ss3 extends vy3 {

    /* renamed from: p */
    public final /* synthetic */ QueryInfoGenerationCallback f26601p;

    public ss3(ts3 ts3Var, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.f26601p = queryInfoGenerationCallback;
    }

    @Override // com.daaw.wy3
    /* renamed from: B0 */
    public final void mo5712B0(String str, String str2, Bundle bundle) {
        this.f26601p.onSuccess(new QueryInfo(new zzem(str, bundle, str2)));
    }

    @Override // com.daaw.wy3
    public final void zzb(String str) {
        this.f26601p.onFailure(str);
    }
}
