package com.daaw;

import android.graphics.Bitmap;
import com.daaw.r60;
/* loaded from: classes.dex */
public class j60 implements r60.a {
    public final bc a;

    public j60(bc bcVar) {
        this.a = bcVar;
    }

    @Override // com.daaw.r60.a
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.a.e(i, i2, config);
    }

    @Override // com.daaw.r60.a
    public void b(Bitmap bitmap) {
        if (this.a.a(bitmap)) {
            return;
        }
        bitmap.recycle();
    }
}
