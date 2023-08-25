package com.daaw;

import com.daaw.xg;
/* loaded from: classes.dex */
public class ch {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[xg.b.values().length];
            a = iArr;
            try {
                iArr[xg.b.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[xg.b.FLOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static bh a(xg.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new s20();
            }
            throw new IllegalArgumentException("wrong WHEEL_TYPE");
        }
        return new dd1();
    }
}
