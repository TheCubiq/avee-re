package com.daaw;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class nf0 {
    /* renamed from: a */
    public <Z> pj1<Z> m15201a(ImageView imageView, Class<Z> cls) {
        if (l70.class.isAssignableFrom(cls)) {
            return new m70(imageView);
        }
        if (Bitmap.class.equals(cls)) {
            return new C0614ac(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C2888ru(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
