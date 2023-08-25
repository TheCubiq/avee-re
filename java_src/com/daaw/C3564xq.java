package com.daaw;

import java.lang.reflect.Constructor;
/* renamed from: com.daaw.xq */
/* loaded from: classes.dex */
public final class C3564xq implements e00 {

    /* renamed from: g */
    public static final Constructor<? extends InterfaceC3919zz> f32877g;

    /* renamed from: a */
    public int f32878a;

    /* renamed from: b */
    public int f32879b;

    /* renamed from: c */
    public int f32880c;

    /* renamed from: d */
    public int f32881d;

    /* renamed from: e */
    public int f32882e = 1;

    /* renamed from: f */
    public int f32883f;

    static {
        Constructor<? extends InterfaceC3919zz> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC3919zz.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f32877g = constructor;
    }

    @Override // com.daaw.e00
    /* renamed from: a */
    public synchronized InterfaceC3919zz[] mo4824a() {
        InterfaceC3919zz[] interfaceC3919zzArr;
        Constructor<? extends InterfaceC3919zz> constructor = f32877g;
        interfaceC3919zzArr = new InterfaceC3919zz[constructor == null ? 12 : 13];
        interfaceC3919zzArr[0] = new un0(this.f32878a);
        interfaceC3919zzArr[1] = new d40(this.f32880c);
        interfaceC3919zzArr[2] = new vq0(this.f32879b);
        interfaceC3919zzArr[3] = new tq0(this.f32881d);
        interfaceC3919zzArr[4] = new C2902s1();
        interfaceC3919zzArr[5] = new C2899s();
        interfaceC3919zzArr[6] = new do1(this.f32882e, this.f32883f);
        interfaceC3919zzArr[7] = new t20();
        interfaceC3919zzArr[8] = new rt0();
        interfaceC3919zzArr[9] = new c01();
        interfaceC3919zzArr[10] = new ew1();
        interfaceC3919zzArr[11] = new C2234n2();
        if (constructor != null) {
            try {
                interfaceC3919zzArr[12] = constructor.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return interfaceC3919zzArr;
    }
}
