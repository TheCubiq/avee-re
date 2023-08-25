package com.daaw;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.OutputStream;
/* renamed from: com.daaw.zb */
/* loaded from: classes.dex */
public class C3826zb implements e51<Bitmap> {

    /* renamed from: a */
    public Bitmap.CompressFormat f34698a;

    /* renamed from: b */
    public int f34699b;

    public C3826zb() {
        this(null, 90);
    }

    public C3826zb(Bitmap.CompressFormat compressFormat, int i) {
        this.f34698a = compressFormat;
        this.f34699b = i;
    }

    @Override // com.daaw.InterfaceC3911zw
    /* renamed from: b */
    public boolean mo1827a(z41<Bitmap> z41Var, OutputStream outputStream) {
        Bitmap bitmap = z41Var.get();
        long m18440b = jl0.m18440b();
        Bitmap.CompressFormat m2557c = m2557c(bitmap);
        bitmap.compress(m2557c, this.f34699b, outputStream);
        if (Log.isLoggable("BitmapEncoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Compressed with type: ");
            sb.append(m2557c);
            sb.append(" of size ");
            sb.append(tq1.m8865f(bitmap));
            sb.append(" in ");
            sb.append(jl0.m18441a(m18440b));
            return true;
        }
        return true;
    }

    /* renamed from: c */
    public final Bitmap.CompressFormat m2557c(Bitmap bitmap) {
        Bitmap.CompressFormat compressFormat = this.f34698a;
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.daaw.InterfaceC3911zw
    public String getId() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }
}
