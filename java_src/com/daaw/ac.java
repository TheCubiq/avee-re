package com.daaw;

import android.graphics.Bitmap;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class ac extends mf0<Bitmap> {
    public ac(ImageView imageView) {
        super(imageView);
    }

    @Override // com.daaw.mf0
    /* renamed from: o */
    public void n(Bitmap bitmap) {
        ((ImageView) this.q).setImageBitmap(bitmap);
    }
}
