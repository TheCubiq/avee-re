package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class pe extends ec {
    public pe(bc bcVar) {
        super(bcVar);
    }

    @Override // com.daaw.ec
    public Bitmap b(bc bcVar, Bitmap bitmap, int i, int i2) {
        Bitmap b = bcVar.b(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        Bitmap a = gn1.a(b, bitmap, i, i2);
        if (b != null && b != a && !bcVar.a(b)) {
            b.recycle();
        }
        return a;
    }

    @Override // com.daaw.cn1
    public String getId() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}
