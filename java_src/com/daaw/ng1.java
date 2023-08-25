package com.daaw;

import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class ng1 implements InterfaceC1849jp<InputStream, File> {

    /* renamed from: r */
    public static final C2291b f20103r = new C2291b();

    /* renamed from: p */
    public final d51<File, File> f20104p = new u00();

    /* renamed from: q */
    public final InterfaceC3911zw<InputStream> f20105q = new mg1();

    /* renamed from: com.daaw.ng1$b */
    /* loaded from: classes.dex */
    public static class C2291b implements d51<InputStream, File> {
        public C2291b() {
        }

        @Override // com.daaw.d51
        /* renamed from: a */
        public z41<File> mo2793c(InputStream inputStream, int i, int i2) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }

        @Override // com.daaw.d51
        public String getId() {
            return "";
        }
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: a */
    public InterfaceC3911zw<InputStream> mo6618a() {
        return this.f20105q;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: c */
    public e51<File> mo6617c() {
        return jt0.m18256c();
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: d */
    public d51<InputStream, File> mo6616d() {
        return f20103r;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: e */
    public d51<File, File> mo6615e() {
        return this.f20104p;
    }
}
