package com.daaw;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.AbstractC0555a;
import java.io.InputStream;
/* loaded from: classes.dex */
public class kg1 implements d51<InputStream, Bitmap> {

    /* renamed from: a */
    public final AbstractC0555a f16356a;

    /* renamed from: b */
    public InterfaceC0832bc f16357b;

    /* renamed from: c */
    public EnumC0988cq f16358c;

    /* renamed from: d */
    public String f16359d;

    public kg1(AbstractC0555a abstractC0555a, InterfaceC0832bc interfaceC0832bc, EnumC0988cq enumC0988cq) {
        this.f16356a = abstractC0555a;
        this.f16357b = interfaceC0832bc;
        this.f16358c = enumC0988cq;
    }

    public kg1(InterfaceC0832bc interfaceC0832bc, EnumC0988cq enumC0988cq) {
        this(AbstractC0555a.f2649c, interfaceC0832bc, enumC0988cq);
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public z41<Bitmap> mo2793c(InputStream inputStream, int i, int i2) {
        return C1073dc.m24559d(this.f16356a.m27799a(inputStream, this.f16357b, i, i2, this.f16358c), this.f16357b);
    }

    @Override // com.daaw.d51
    public String getId() {
        if (this.f16359d == null) {
            this.f16359d = "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap" + this.f16356a.getId() + this.f16358c.name();
        }
        return this.f16359d;
    }
}
