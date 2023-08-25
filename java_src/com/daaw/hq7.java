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
    public static void g(Iterable iterable, List list) {
        vs7.e(iterable);
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
    public final byte[] a() {
        try {
            byte[] bArr = new byte[i()];
            qr7 h = qr7.h(bArr);
            e(h);
            h.j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // com.daaw.xt7
    public final yq7 d() {
        try {
            int i = i();
            yq7 yq7Var = yq7.q;
            byte[] bArr = new byte[i];
            qr7 h = qr7.h(bArr);
            e(h);
            h.j();
            return new uq7(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public int f(cv7 cv7Var) {
        throw null;
    }

    public final void h(OutputStream outputStream) {
        qr7 i = qr7.i(outputStream, qr7.c(i()));
        e(i);
        i.m();
    }
}
