package com.daaw;

import android.content.Context;
import java.io.File;
/* loaded from: classes.dex */
public final class bh2 implements lg2 {
    public File a = null;
    public final /* synthetic */ Context b;

    public bh2(Context context) {
        this.b = context;
    }

    @Override // com.daaw.lg2
    public final File zza() {
        if (this.a == null) {
            this.a = new File(this.b.getCacheDir(), "volley");
        }
        return this.a;
    }
}
