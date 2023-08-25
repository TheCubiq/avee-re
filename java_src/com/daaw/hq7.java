package com.daaw;

import com.daaw.gq7;
import com.daaw.hq7;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class hq7<MessageType extends hq7<MessageType, BuilderType>, BuilderType extends gq7<MessageType, BuilderType>> implements xt7 {
    public int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static void m20483g(Iterable iterable, List list) {
        vs7.m6816e(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                int size2 = list.size();
                String str = "Element at index " + (size2 - size) + " is null.";
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        break;
                    }
                    list.remove(size3);
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    @Override // com.daaw.xt7
    /* renamed from: a */
    public final byte[] mo4516a() {
        try {
            byte[] bArr = new byte[mo4512i()];
            qr7 m12254h = qr7.m12254h(bArr);
            mo4513e(m12254h);
            m12254h.m12252j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // com.daaw.xt7
    /* renamed from: d */
    public final yq7 mo4514d() {
        try {
            int mo4512i = mo4512i();
            yq7 yq7Var = yq7.f33966q;
            byte[] bArr = new byte[mo4512i];
            qr7 m12254h = qr7.m12254h(bArr);
            mo4513e(m12254h);
            m12254h.m12252j();
            return new uq7(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: f */
    public int mo16589f(cv7 cv7Var) {
        throw null;
    }

    /* renamed from: h */
    public final void m20482h(OutputStream outputStream) {
        qr7 m12253i = qr7.m12253i(outputStream, qr7.m12259c(mo4512i()));
        mo4513e(m12253i);
        m12253i.mo12249m();
    }
}
