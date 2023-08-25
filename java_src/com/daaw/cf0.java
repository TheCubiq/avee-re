package com.daaw;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
/* loaded from: classes2.dex */
public class cf0 extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f5777a;

    public cf0() {
        super(Matrix.class, "imageMatrixProperty");
        this.f5777a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f5777a.set(imageView.getImageMatrix());
        return this.f5777a;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
