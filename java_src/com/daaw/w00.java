package com.daaw;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
/* loaded from: classes.dex */
public class w00 implements jp<ParcelFileDescriptor, Bitmap> {
    public final d51<File, Bitmap> p;
    public final x00 q;
    public final zb r = new zb();
    public final zw<ParcelFileDescriptor> s = it0.b();

    public w00(bc bcVar, cq cqVar) {
        this.p = new i10(new kg1(bcVar, cqVar));
        this.q = new x00(bcVar, cqVar);
    }

    @Override // com.daaw.jp
    public zw<ParcelFileDescriptor> a() {
        return this.s;
    }

    @Override // com.daaw.jp
    public e51<Bitmap> c() {
        return this.r;
    }

    @Override // com.daaw.jp
    public d51<ParcelFileDescriptor, Bitmap> d() {
        return this.q;
    }

    @Override // com.daaw.jp
    public d51<File, Bitmap> e() {
        return this.p;
    }
}
