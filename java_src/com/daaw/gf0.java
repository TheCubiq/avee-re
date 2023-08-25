package com.daaw;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class gf0 implements jp<jf0, Bitmap> {
    public final ff0 p;
    public final d51<File, Bitmap> q;
    public final e51<Bitmap> r;
    public final kf0 s;

    public gf0(jp<InputStream, Bitmap> jpVar, jp<ParcelFileDescriptor, Bitmap> jpVar2) {
        this.r = jpVar.c();
        this.s = new kf0(jpVar.a(), jpVar2.a());
        this.q = jpVar.e();
        this.p = new ff0(jpVar.d(), jpVar2.d());
    }

    @Override // com.daaw.jp
    public zw<jf0> a() {
        return this.s;
    }

    @Override // com.daaw.jp
    public e51<Bitmap> c() {
        return this.r;
    }

    @Override // com.daaw.jp
    public d51<jf0, Bitmap> d() {
        return this.p;
    }

    @Override // com.daaw.jp
    public d51<File, Bitmap> e() {
        return this.q;
    }
}
