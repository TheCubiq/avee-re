package com.daaw;

import android.graphics.Bitmap;
/* renamed from: com.daaw.pe */
/* loaded from: classes.dex */
public class C2542pe extends AbstractC1176ec {
    public C2542pe(InterfaceC0832bc interfaceC0832bc) {
        super(interfaceC0832bc);
    }

    @Override // com.daaw.AbstractC1176ec
    /* renamed from: b */
    public Bitmap mo13431b(InterfaceC0832bc interfaceC0832bc, Bitmap bitmap, int i, int i2) {
        Bitmap mo8070b = interfaceC0832bc.mo8070b(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        Bitmap m21447a = gn1.m21447a(mo8070b, bitmap, i, i2);
        if (mo8070b != null && mo8070b != m21447a && !interfaceC0832bc.mo8071a(mo8070b)) {
            mo8070b.recycle();
        }
        return m21447a;
    }

    @Override // com.daaw.cn1
    public String getId() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}
