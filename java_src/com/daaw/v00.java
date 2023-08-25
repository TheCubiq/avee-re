package com.daaw;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class v00 extends u6<ParcelFileDescriptor> {
    public v00(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.daaw.u6
    /* renamed from: e */
    public void c(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    @Override // com.daaw.u6
    /* renamed from: f */
    public ParcelFileDescriptor d(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
