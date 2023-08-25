package com.daaw;

import android.content.Context;
import com.daaw.r41;
/* loaded from: classes.dex */
public class g60<ModelType, DataType, ResourceType> extends f60<ModelType, DataType, ResourceType, ResourceType> {
    public final mq0<ModelType, DataType> S;
    public final Class<DataType> T;
    public final Class<ResourceType> U;
    public final r41.d V;

    public g60(Context context, e70 e70Var, Class<ModelType> cls, mq0<ModelType, DataType> mq0Var, Class<DataType> cls2, Class<ResourceType> cls3, v41 v41Var, mj0 mj0Var, r41.d dVar) {
        super(context, cls, B(e70Var, mq0Var, cls2, cls3, mp1.b()), cls3, e70Var, v41Var, mj0Var);
        this.S = mq0Var;
        this.T = cls2;
        this.U = cls3;
        this.V = dVar;
    }

    public static <A, T, Z, R> ik0<A, T, Z, R> B(e70 e70Var, mq0<A, T> mq0Var, Class<T> cls, Class<Z> cls2, i51<Z, R> i51Var) {
        return new k20(mq0Var, i51Var, e70Var.a(cls, cls2));
    }
}
