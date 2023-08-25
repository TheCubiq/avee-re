package com.daaw;

import android.graphics.Bitmap;
import java.util.Objects;
/* loaded from: classes.dex */
public class dc implements z41<Bitmap> {
    public final Bitmap a;
    public final bc b;

    public dc(Bitmap bitmap, bc bcVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        Objects.requireNonNull(bcVar, "BitmapPool must not be null");
        this.a = bitmap;
        this.b = bcVar;
    }

    public static dc d(Bitmap bitmap, bc bcVar) {
        if (bitmap == null) {
            return null;
        }
        return new dc(bitmap, bcVar);
    }

    @Override // com.daaw.z41
    public int a() {
        return tq1.f(this.a);
    }

    @Override // com.daaw.z41
    /* renamed from: b */
    public Bitmap get() {
        return this.a;
    }

    @Override // com.daaw.z41
    public void c() {
        if (this.b.a(this.a)) {
            return;
        }
        this.a.recycle();
    }
}
