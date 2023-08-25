package com.daaw;

import android.graphics.Bitmap;
import com.daaw.r60;
/* loaded from: classes.dex */
public class j60 implements r60.InterfaceC2829a {

    /* renamed from: a */
    public final InterfaceC0832bc f14445a;

    public j60(InterfaceC0832bc interfaceC0832bc) {
        this.f14445a = interfaceC0832bc;
    }

    @Override // com.daaw.r60.InterfaceC2829a
    /* renamed from: a */
    public Bitmap mo11712a(int i, int i2, Bitmap.Config config) {
        return this.f14445a.mo8067e(i, i2, config);
    }

    @Override // com.daaw.r60.InterfaceC2829a
    /* renamed from: b */
    public void mo11711b(Bitmap bitmap) {
        if (this.f14445a.mo8071a(bitmap)) {
            return;
        }
        bitmap.recycle();
    }
}
