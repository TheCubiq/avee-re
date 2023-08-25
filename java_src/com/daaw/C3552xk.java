package com.daaw;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.daaw.xk */
/* loaded from: classes.dex */
public final class C3552xk {

    /* renamed from: a */
    public final Set<C3553a> f32773a = new HashSet();

    /* renamed from: com.daaw.xk$a */
    /* loaded from: classes.dex */
    public static final class C3553a {

        /* renamed from: a */
        public final Uri f32774a;

        /* renamed from: b */
        public final boolean f32775b;

        public C3553a(Uri uri, boolean z) {
            this.f32774a = uri;
            this.f32775b = z;
        }

        /* renamed from: a */
        public Uri m5037a() {
            return this.f32774a;
        }

        /* renamed from: b */
        public boolean m5036b() {
            return this.f32775b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3553a.class != obj.getClass()) {
                return false;
            }
            C3553a c3553a = (C3553a) obj;
            return this.f32775b == c3553a.f32775b && this.f32774a.equals(c3553a.f32774a);
        }

        public int hashCode() {
            return (this.f32774a.hashCode() * 31) + (this.f32775b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void m5040a(Uri uri, boolean z) {
        this.f32773a.add(new C3553a(uri, z));
    }

    /* renamed from: b */
    public Set<C3553a> m5039b() {
        return this.f32773a;
    }

    /* renamed from: c */
    public int m5038c() {
        return this.f32773a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3552xk.class != obj.getClass()) {
            return false;
        }
        return this.f32773a.equals(((C3552xk) obj).f32773a);
    }

    public int hashCode() {
        return this.f32773a.hashCode();
    }
}
