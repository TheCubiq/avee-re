package com.daaw;

import android.content.Context;
import com.daaw.r41;
/* loaded from: classes.dex */
public class g60<ModelType, DataType, ResourceType> extends f60<ModelType, DataType, ResourceType, ResourceType> {

    /* renamed from: S */
    public final mq0<ModelType, DataType> f10296S;

    /* renamed from: T */
    public final Class<DataType> f10297T;

    /* renamed from: U */
    public final Class<ResourceType> f10298U;

    /* renamed from: V */
    public final r41.C2823d f10299V;

    public g60(Context context, e70 e70Var, Class<ModelType> cls, mq0<ModelType, DataType> mq0Var, Class<DataType> cls2, Class<ResourceType> cls3, v41 v41Var, mj0 mj0Var, r41.C2823d c2823d) {
        super(context, cls, m21904B(e70Var, mq0Var, cls2, cls3, mp1.m15863b()), cls3, e70Var, v41Var, mj0Var);
        this.f10296S = mq0Var;
        this.f10297T = cls2;
        this.f10298U = cls3;
        this.f10299V = c2823d;
    }

    /* renamed from: B */
    public static <A, T, Z, R> ik0<A, T, Z, R> m21904B(e70 e70Var, mq0<A, T> mq0Var, Class<T> cls, Class<Z> cls2, i51<Z, R> i51Var) {
        return new k20(mq0Var, i51Var, e70Var.m23694a(cls, cls2));
    }
}
