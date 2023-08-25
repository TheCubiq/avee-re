package com.daaw;

import android.content.res.AssetManager;
import java.io.InputStream;
/* loaded from: classes.dex */
public class ig1 extends AbstractC3163u6<InputStream> {
    public ig1(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.daaw.AbstractC3163u6
    /* renamed from: e */
    public void mo7564c(InputStream inputStream) {
        inputStream.close();
    }

    @Override // com.daaw.AbstractC3163u6
    /* renamed from: f */
    public InputStream mo7563d(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
