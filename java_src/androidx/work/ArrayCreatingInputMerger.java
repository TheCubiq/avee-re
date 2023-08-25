package androidx.work;

import androidx.work.C0511b;
import com.daaw.cg0;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends cg0 {
    @Override // com.daaw.cg0
    /* renamed from: b */
    public C0511b mo25393b(List<C0511b> list) {
        C0511b.C0512a c0512a = new C0511b.C0512a();
        HashMap hashMap = new HashMap();
        for (C0511b c0511b : list) {
            for (Map.Entry<String, Object> entry : c0511b.m27965h().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(key);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        value = cls2.isArray() ? m28009d(obj, value) : m28008e(obj, value);
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = m28010c(obj, value);
                    } else if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                        throw new IllegalArgumentException();
                    } else {
                        value = m28010c(value, obj);
                    }
                } else if (!cls.isArray()) {
                    value = m28007f(value);
                }
                hashMap.put(key, value);
            }
        }
        c0512a.m27958d(hashMap);
        return c0512a.m27961a();
    }

    /* renamed from: c */
    public final Object m28010c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    /* renamed from: d */
    public final Object m28009d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    /* renamed from: e */
    public final Object m28008e(Object obj, Object obj2) {
        Object newInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(newInstance, 0, obj);
        Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    /* renamed from: f */
    public final Object m28007f(Object obj) {
        Object newInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(newInstance, 0, obj);
        return newInstance;
    }
}
