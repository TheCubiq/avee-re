package com.daaw;

import android.content.Context;
import java.io.File;
/* loaded from: classes.dex */
public final class bh2 implements lg2 {

    /* renamed from: a */
    public File f4795a = null;

    /* renamed from: b */
    public final /* synthetic */ Context f4796b;

    public bh2(Context context) {
        this.f4796b = context;
    }

    @Override // com.daaw.lg2
    public final File zza() {
        if (this.f4795a == null) {
            this.f4795a = new File(this.f4796b.getCacheDir(), "volley");
        }
        return this.f4795a;
    }
}
