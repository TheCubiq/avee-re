package com.daaw;

import java.lang.reflect.Constructor;
/* loaded from: classes.dex */
public final class xq implements e00 {
    public static final Constructor<? extends zz> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e = 1;
    public int f;

    static {
        Constructor<? extends zz> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(zz.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        g = constructor;
    }

    @Override // com.daaw.e00
    public synchronized zz[] a() {
        zz[] zzVarArr;
        Constructor<? extends zz> constructor = g;
        zzVarArr = new zz[constructor == null ? 12 : 13];
        zzVarArr[0] = new un0(this.a);
        zzVarArr[1] = new d40(this.c);
        zzVarArr[2] = new vq0(this.b);
        zzVarArr[3] = new tq0(this.d);
        zzVarArr[4] = new s1();
        zzVarArr[5] = new s();
        zzVarArr[6] = new do1(this.e, this.f);
        zzVarArr[7] = new t20();
        zzVarArr[8] = new rt0();
        zzVarArr[9] = new c01();
        zzVarArr[10] = new ew1();
        zzVarArr[11] = new n2();
        if (constructor != null) {
            try {
                zzVarArr[12] = constructor.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return zzVarArr;
    }
}
