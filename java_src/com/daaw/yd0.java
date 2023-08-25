package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public interface yd0 extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends wx2 implements yd0 {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static yd0 I(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof yd0 ? (yd0) queryLocalInterface : new rx2(iBinder);
        }
    }
}
