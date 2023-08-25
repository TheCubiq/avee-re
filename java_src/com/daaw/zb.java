package com.daaw;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class zb implements e51<Bitmap> {
    public Bitmap.CompressFormat a;
    public int b;

    public zb() {
        this(null, 90);
    }

    public zb(Bitmap.CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = i;
    }

    @Override // com.daaw.zw
    /* renamed from: b */
    public boolean a(z41<Bitmap> z41Var, OutputStream outputStream) {
        Bitmap bitmap = z41Var.get();
        long b = jl0.b();
        Bitmap.CompressFormat c = c(bitmap);
        bitmap.compress(c, this.b, outputStream);
        if (Log.isLoggable("BitmapEncoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Compressed with type: ");
            sb.append(c);
            sb.append(" of size ");
            sb.append(tq1.f(bitmap));
            sb.append(" in ");
            sb.append(jl0.a(b));
            return true;
        }
        return true;
    }

    public final Bitmap.CompressFormat c(Bitmap bitmap) {
        Bitmap.CompressFormat compressFormat = this.a;
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.daaw.zw
    public String getId() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }
}
