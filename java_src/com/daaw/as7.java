package com.daaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class as7 {

    /* renamed from: d */
    public static final as7 f3534d = new as7(true);

    /* renamed from: a */
    public final pv7 f3535a = new fv7(16);

    /* renamed from: b */
    public boolean f3536b;

    /* renamed from: c */
    public boolean f3537c;

    public as7() {
    }

    public as7(boolean z) {
        m27096b();
        m27096b();
    }

    /* renamed from: a */
    public static as7 m27097a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m27094d(zr7 zr7Var, Object obj) {
        boolean z;
        mw7 zzb = zr7Var.zzb();
        vs7.m6816e(obj);
        mw7 mw7Var = mw7.f19207q;
        nw7 nw7Var = nw7.INT;
        switch (zzb.m15739a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zr7Var.zza()), zr7Var.zzb().m15739a(), obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zr7Var.zza()), zr7Var.zzb().m15739a(), obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zr7Var.zza()), zr7Var.zzb().m15739a(), obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zr7Var.zza()), zr7Var.zzb().m15739a(), obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zr7Var.zza()), zr7Var.zzb().m15739a(), obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zr7Var.zza()), zr7Var.zzb().m15739a(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof yq7) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zr7Var.zza()), zr7Var.zzb().m15739a(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof ns7)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zr7Var.zza()), zr7Var.zzb().m15739a(), obj.getClass().getName()));
            case 8:
                if (obj instanceof xt7) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zr7Var.zza()), zr7Var.zzb().m15739a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zr7Var.zza()), zr7Var.zzb().m15739a(), obj.getClass().getName()));
        }
    }

    /* renamed from: b */
    public final void m27096b() {
        if (this.f3536b) {
            return;
        }
        for (int i = 0; i < this.f3535a.m13014b(); i++) {
            Map.Entry m13009g = this.f3535a.m13009g(i);
            if (m13009g.getValue() instanceof ls7) {
                ((ls7) m13009g.getValue()).m16599A();
            }
        }
        this.f3535a.mo13015a();
        this.f3536b = true;
    }

    /* renamed from: c */
    public final void m27095c(zr7 zr7Var, Object obj) {
        if (!zr7Var.zzc()) {
            m27094d(zr7Var, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m27094d(zr7Var, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.f3535a.put(zr7Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        as7 as7Var = new as7();
        for (int i = 0; i < this.f3535a.m13014b(); i++) {
            Map.Entry m13009g = this.f3535a.m13009g(i);
            as7Var.m27095c((zr7) m13009g.getKey(), m13009g.getValue());
        }
        for (Map.Entry entry : this.f3535a.m13013c()) {
            as7Var.m27095c((zr7) entry.getKey(), entry.getValue());
        }
        as7Var.f3537c = this.f3537c;
        return as7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof as7) {
            return this.f3535a.equals(((as7) obj).f3535a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3535a.hashCode();
    }
}
