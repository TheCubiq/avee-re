package com.daaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class a98 {

    /* renamed from: d */
    public static final a98 f3009d = new a98(true);

    /* renamed from: a */
    public final gg8 f3010a = new mf8(16);

    /* renamed from: b */
    public boolean f3011b;

    /* renamed from: c */
    public boolean f3012c;

    public a98() {
    }

    public a98(boolean z) {
        m27546b();
        m27546b();
    }

    /* renamed from: a */
    public static a98 m27547a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m27544d(x88 x88Var, Object obj) {
        boolean z;
        gi8 zzb = x88Var.zzb();
        gb8.m21816e(obj);
        gi8 gi8Var = gi8.f11346q;
        ii8 ii8Var = ii8.INT;
        switch (zzb.m21569a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x88Var.zza()), x88Var.zzb().m21569a(), obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x88Var.zza()), x88Var.zzb().m21569a(), obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x88Var.zza()), x88Var.zzb().m21569a(), obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x88Var.zza()), x88Var.zzb().m21569a(), obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x88Var.zza()), x88Var.zzb().m21569a(), obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x88Var.zza()), x88Var.zzb().m21569a(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof y68) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x88Var.zza()), x88Var.zzb().m21569a(), obj.getClass().getName()));
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x88Var.zza()), x88Var.zzb().m21569a(), obj.getClass().getName()));
            case 8:
                if (obj instanceof zd8) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x88Var.zza()), x88Var.zzb().m21569a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x88Var.zza()), x88Var.zzb().m21569a(), obj.getClass().getName()));
        }
    }

    /* renamed from: b */
    public final void m27546b() {
        if (this.f3011b) {
            return;
        }
        for (int i = 0; i < this.f3010a.m21655b(); i++) {
            Map.Entry m21650g = this.f3010a.m21650g(i);
            if (m21650g.getValue() instanceof ja8) {
                ((ja8) m21650g.getValue()).m18663t();
            }
        }
        this.f3010a.mo16039a();
        this.f3011b = true;
    }

    /* renamed from: c */
    public final void m27545c(x88 x88Var, Object obj) {
        if (!x88Var.zzc()) {
            m27544d(x88Var, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m27544d(x88Var, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.f3010a.put(x88Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        a98 a98Var = new a98();
        for (int i = 0; i < this.f3010a.m21655b(); i++) {
            Map.Entry m21650g = this.f3010a.m21650g(i);
            a98Var.m27545c((x88) m21650g.getKey(), m21650g.getValue());
        }
        for (Map.Entry entry : this.f3010a.m21654c()) {
            a98Var.m27545c((x88) entry.getKey(), entry.getValue());
        }
        a98Var.f3012c = this.f3012c;
        return a98Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a98) {
            return this.f3010a.equals(((a98) obj).f3010a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3010a.hashCode();
    }
}
