package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class oh7 {
    public static final oh7 b = new mh7().a();
    public final Map a;

    public final Map a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oh7) {
            return this.a.equals(((oh7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
