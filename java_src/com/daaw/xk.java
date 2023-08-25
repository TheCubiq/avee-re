package com.daaw;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class xk {
    public final Set<a> a = new HashSet();

    /* loaded from: classes.dex */
    public static final class a {
        public final Uri a;
        public final boolean b;

        public a(Uri uri, boolean z) {
            this.a = uri;
            this.b = z;
        }

        public Uri a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.a.equals(aVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z) {
        this.a.add(new a(uri, z));
    }

    public Set<a> b() {
        return this.a;
    }

    public int c() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xk.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((xk) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
