package com.daaw;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.daaw.r41;
import java.io.InputStream;
/* loaded from: classes.dex */
public class uu<ModelType> extends su<ModelType> {
    public final mq0<ModelType, InputStream> S;
    public final mq0<ModelType, ParcelFileDescriptor> T;
    public final r41.d U;

    public uu(Class<ModelType> cls, mq0<ModelType, InputStream> mq0Var, mq0<ModelType, ParcelFileDescriptor> mq0Var2, Context context, e70 e70Var, v41 v41Var, mj0 mj0Var, r41.d dVar) {
        super(context, cls, R(e70Var, mq0Var, mq0Var2, k60.class, l70.class, null), e70Var, v41Var, mj0Var);
        this.S = mq0Var;
        this.T = mq0Var2;
        this.U = dVar;
    }

    public static <A, Z, R> k20<A, jf0, Z, R> R(e70 e70Var, mq0<A, InputStream> mq0Var, mq0<A, ParcelFileDescriptor> mq0Var2, Class<Z> cls, Class<R> cls2, i51<Z, R> i51Var) {
        if (mq0Var == null && mq0Var2 == null) {
            return null;
        }
        if (i51Var == null) {
            i51Var = e70Var.f(cls, cls2);
        }
        return new k20<>(new if0(mq0Var, mq0Var2), i51Var, e70Var.a(jf0.class, cls));
    }
}
