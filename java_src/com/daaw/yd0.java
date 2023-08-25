package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public interface yd0 extends IInterface {

    /* renamed from: com.daaw.yd0$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC3691a extends wx2 implements yd0 {
        public AbstractBinderC3691a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: I */
        public static yd0 m3857I(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof yd0 ? (yd0) queryLocalInterface : new rx2(iBinder);
        }
    }
}
