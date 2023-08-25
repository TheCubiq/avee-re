package com.daaw;

import com.daaw.t48;
import com.daaw.w48;
/* loaded from: classes2.dex */
public abstract class t48<MessageType extends w48<MessageType, BuilderType>, BuilderType extends t48<MessageType, BuilderType>> implements xd8 {
    public abstract t48 e(byte[] bArr, int i, int i2);

    public abstract t48 f(byte[] bArr, int i, int i2, l88 l88Var);

    @Override // com.daaw.xd8
    public final /* synthetic */ xd8 g(byte[] bArr, l88 l88Var) {
        return f(bArr, 0, bArr.length, l88Var);
    }

    @Override // com.daaw.xd8
    public final /* synthetic */ xd8 h(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }
}
