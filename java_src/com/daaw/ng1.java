package com.daaw;

import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class ng1 implements jp<InputStream, File> {
    public static final b r = new b();
    public final d51<File, File> p = new u00();
    public final zw<InputStream> q = new mg1();

    /* loaded from: classes.dex */
    public static class b implements d51<InputStream, File> {
        public b() {
        }

        @Override // com.daaw.d51
        /* renamed from: a */
        public z41<File> c(InputStream inputStream, int i, int i2) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }

        @Override // com.daaw.d51
        public String getId() {
            return "";
        }
    }

    @Override // com.daaw.jp
    public zw<InputStream> a() {
        return this.q;
    }

    @Override // com.daaw.jp
    public e51<File> c() {
        return jt0.c();
    }

    @Override // com.daaw.jp
    public d51<InputStream, File> d() {
        return r;
    }

    @Override // com.daaw.jp
    public d51<File, File> e() {
        return this.p;
    }
}
