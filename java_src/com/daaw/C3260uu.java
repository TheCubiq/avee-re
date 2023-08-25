package com.daaw;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.daaw.r41;
import java.io.InputStream;
/* renamed from: com.daaw.uu */
/* loaded from: classes.dex */
public class C3260uu<ModelType> extends C2982su<ModelType> {

    /* renamed from: S */
    public final mq0<ModelType, InputStream> f29537S;

    /* renamed from: T */
    public final mq0<ModelType, ParcelFileDescriptor> f29538T;

    /* renamed from: U */
    public final r41.C2823d f29539U;

    public C3260uu(Class<ModelType> cls, mq0<ModelType, InputStream> mq0Var, mq0<ModelType, ParcelFileDescriptor> mq0Var2, Context context, e70 e70Var, v41 v41Var, mj0 mj0Var, r41.C2823d c2823d) {
        super(context, cls, m7705R(e70Var, mq0Var, mq0Var2, k60.class, l70.class, null), e70Var, v41Var, mj0Var);
        this.f29537S = mq0Var;
        this.f29538T = mq0Var2;
        this.f29539U = c2823d;
    }

    /* renamed from: R */
    public static <A, Z, R> k20<A, jf0, Z, R> m7705R(e70 e70Var, mq0<A, InputStream> mq0Var, mq0<A, ParcelFileDescriptor> mq0Var2, Class<Z> cls, Class<R> cls2, i51<Z, R> i51Var) {
        if (mq0Var == null && mq0Var2 == null) {
            return null;
        }
        if (i51Var == null) {
            i51Var = e70Var.m23689f(cls, cls2);
        }
        return new k20<>(new if0(mq0Var, mq0Var2), i51Var, e70Var.m23694a(jf0.class, cls));
    }
}
