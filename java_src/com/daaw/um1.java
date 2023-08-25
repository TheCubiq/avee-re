package com.daaw;

import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class um1 {

    /* renamed from: a */
    public final int f29184a;

    /* renamed from: b */
    public final InterfaceC3970c[] f29185b;

    /* renamed from: c */
    public int f29186c;

    public um1(InterfaceC3970c... interfaceC3970cArr) {
        this.f29185b = interfaceC3970cArr;
        this.f29184a = interfaceC3970cArr.length;
    }

    /* renamed from: a */
    public InterfaceC3970c m8019a(int i) {
        return this.f29185b[i];
    }

    /* renamed from: b */
    public InterfaceC3970c[] m8018b() {
        return (InterfaceC3970c[]) this.f29185b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || um1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f29185b, ((um1) obj).f29185b);
    }

    public int hashCode() {
        if (this.f29186c == 0) {
            this.f29186c = 527 + Arrays.hashCode(this.f29185b);
        }
        return this.f29186c;
    }
}
