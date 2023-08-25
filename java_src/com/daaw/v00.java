package com.daaw;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class v00 extends AbstractC3163u6<ParcelFileDescriptor> {
    public v00(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.daaw.AbstractC3163u6
    /* renamed from: e */
    public void mo7564c(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    @Override // com.daaw.AbstractC3163u6
    /* renamed from: f */
    public ParcelFileDescriptor mo7563d(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
