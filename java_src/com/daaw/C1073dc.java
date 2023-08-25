package com.daaw;

import android.graphics.Bitmap;
import java.util.Objects;
/* renamed from: com.daaw.dc */
/* loaded from: classes.dex */
public class C1073dc implements z41<Bitmap> {

    /* renamed from: a */
    public final Bitmap f6902a;

    /* renamed from: b */
    public final InterfaceC0832bc f6903b;

    public C1073dc(Bitmap bitmap, InterfaceC0832bc interfaceC0832bc) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        Objects.requireNonNull(interfaceC0832bc, "BitmapPool must not be null");
        this.f6902a = bitmap;
        this.f6903b = interfaceC0832bc;
    }

    /* renamed from: d */
    public static C1073dc m24559d(Bitmap bitmap, InterfaceC0832bc interfaceC0832bc) {
        if (bitmap == null) {
            return null;
        }
        return new C1073dc(bitmap, interfaceC0832bc);
    }

    @Override // com.daaw.z41
    /* renamed from: a */
    public int mo2828a() {
        return tq1.m8865f(this.f6902a);
    }

    @Override // com.daaw.z41
    /* renamed from: b */
    public Bitmap get() {
        return this.f6902a;
    }

    @Override // com.daaw.z41
    /* renamed from: c */
    public void mo2827c() {
        if (this.f6903b.mo8071a(this.f6902a)) {
            return;
        }
        this.f6902a.recycle();
    }
}
