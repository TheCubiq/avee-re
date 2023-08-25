package com.daaw;

import com.daaw.C3538xg;
/* renamed from: com.daaw.ch */
/* loaded from: classes.dex */
public class C0952ch {

    /* renamed from: com.daaw.ch$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0953a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5803a;

        static {
            int[] iArr = new int[C3538xg.EnumC3540b.values().length];
            f5803a = iArr;
            try {
                iArr[C3538xg.EnumC3540b.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5803a[C3538xg.EnumC3540b.FLOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public static InterfaceC0841bh m25386a(C3538xg.EnumC3540b enumC3540b) {
        int i = C0953a.f5803a[enumC3540b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new s20();
            }
            throw new IllegalArgumentException("wrong WHEEL_TYPE");
        }
        return new dd1();
    }
}
