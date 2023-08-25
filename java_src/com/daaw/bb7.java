package com.daaw;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class bb7 implements a87 {

    /* renamed from: c */
    public static final byte[] f4684c = new byte[0];

    /* renamed from: a */
    public final vm7 f4685a;

    /* renamed from: b */
    public final a87 f4686b;

    public bb7(vm7 vm7Var, a87 a87Var) {
        this.f4685a = vm7Var;
        this.f4686b = a87Var;
    }

    @Override // com.daaw.a87
    /* renamed from: a */
    public final byte[] mo1998a(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((a87) w97.m6290i(this.f4685a.m7023Q(), this.f4686b.mo1998a(bArr3, f4684c), a87.class)).mo1998a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // com.daaw.a87
    /* renamed from: b */
    public final byte[] mo1997b(byte[] bArr, byte[] bArr2) {
        byte[] mo4516a = w97.m6295d(this.f4685a).mo4516a();
        byte[] mo1997b = this.f4686b.mo1997b(mo4516a, f4684c);
        byte[] mo1997b2 = ((a87) w97.m6290i(this.f4685a.m7023Q(), mo4516a, a87.class)).mo1997b(bArr, bArr2);
        int length = mo1997b.length;
        return ByteBuffer.allocate(length + 4 + mo1997b2.length).putInt(length).put(mo1997b).put(mo1997b2).array();
    }
}
