package com.daaw;

import com.daaw.t48;
import com.daaw.w48;
/* loaded from: classes2.dex */
public abstract class t48<MessageType extends w48<MessageType, BuilderType>, BuilderType extends t48<MessageType, BuilderType>> implements xd8 {
    /* renamed from: e */
    public abstract t48 mo3980e(byte[] bArr, int i, int i2);

    /* renamed from: f */
    public abstract t48 mo3979f(byte[] bArr, int i, int i2, l88 l88Var);

    @Override // com.daaw.xd8
    /* renamed from: g */
    public final /* synthetic */ xd8 mo5199g(byte[] bArr, l88 l88Var) {
        return mo3979f(bArr, 0, bArr.length, l88Var);
    }

    @Override // com.daaw.xd8
    /* renamed from: h */
    public final /* synthetic */ xd8 mo5198h(byte[] bArr) {
        return mo3980e(bArr, 0, bArr.length);
    }
}
