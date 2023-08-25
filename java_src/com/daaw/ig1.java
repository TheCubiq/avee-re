package com.daaw;

import android.content.res.AssetManager;
import java.io.InputStream;
/* loaded from: classes.dex */
public class ig1 extends u6<InputStream> {
    public ig1(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.daaw.u6
    /* renamed from: e */
    public void c(InputStream inputStream) {
        inputStream.close();
    }

    @Override // com.daaw.u6
    /* renamed from: f */
    public InputStream d(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
