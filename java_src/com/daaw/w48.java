package com.daaw;

import com.daaw.t48;
import com.daaw.w48;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class w48<MessageType extends w48<MessageType, BuilderType>, BuilderType extends t48<MessageType, BuilderType>> implements zd8 {
    public int zzb = 0;

    /* renamed from: f */
    public static void m6532f(Iterable iterable, List list) {
        gb8.m21816e(iterable);
        if (iterable instanceof ac8) {
            List zzh = ((ac8) iterable).zzh();
            ac8 ac8Var = (ac8) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    int size2 = ac8Var.size();
                    String str = "Element at index " + (size2 - size) + " is null.";
                    int size3 = ac8Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        ac8Var.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof y68) {
                    ac8Var.mo3754g((y68) obj);
                } else {
                    ac8Var.add((String) obj);
                }
            }
        } else if (iterable instanceof ne8) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    int size5 = list.size();
                    String str2 = "Element at index " + (size5 - size4) + " is null.";
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
        }
    }

    /* renamed from: e */
    public int mo6533e(ve8 ve8Var) {
        throw null;
    }

    /* renamed from: i */
    public final byte[] m6531i() {
        try {
            byte[] bArr = new byte[mo2461c()];
            w78 m6382c = w78.m6382c(bArr);
            mo2462b(m6382c);
            m6382c.m6381d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // com.daaw.zd8
    public final y68 zzbs() {
        try {
            int mo2461c = mo2461c();
            y68 y68Var = y68.f33399q;
            byte[] bArr = new byte[mo2461c];
            w78 m6382c = w78.m6382c(bArr);
            mo2462b(m6382c);
            m6382c.m6381d();
            return new p68(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
