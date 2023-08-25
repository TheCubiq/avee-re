package com.daaw;

import com.daaw.AbstractC0943ca;
import java.util.Arrays;
import java.util.Objects;
/* renamed from: com.daaw.a8 */
/* loaded from: classes.dex */
public final class C0607a8 extends AbstractC0943ca {

    /* renamed from: a */
    public final Iterable<AbstractC0896by> f2962a;

    /* renamed from: b */
    public final byte[] f2963b;

    /* renamed from: com.daaw.a8$b */
    /* loaded from: classes.dex */
    public static final class C0609b extends AbstractC0943ca.AbstractC0944a {

        /* renamed from: a */
        public Iterable<AbstractC0896by> f2964a;

        /* renamed from: b */
        public byte[] f2965b;

        @Override // com.daaw.AbstractC0943ca.AbstractC0944a
        /* renamed from: a */
        public AbstractC0943ca mo25476a() {
            String str = "";
            if (this.f2964a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C0607a8(this.f2964a, this.f2965b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC0943ca.AbstractC0944a
        /* renamed from: b */
        public AbstractC0943ca.AbstractC0944a mo25475b(Iterable<AbstractC0896by> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f2964a = iterable;
            return this;
        }

        @Override // com.daaw.AbstractC0943ca.AbstractC0944a
        /* renamed from: c */
        public AbstractC0943ca.AbstractC0944a mo25474c(byte[] bArr) {
            this.f2965b = bArr;
            return this;
        }
    }

    public C0607a8(Iterable<AbstractC0896by> iterable, byte[] bArr) {
        this.f2962a = iterable;
        this.f2963b = bArr;
    }

    @Override // com.daaw.AbstractC0943ca
    /* renamed from: b */
    public Iterable<AbstractC0896by> mo25478b() {
        return this.f2962a;
    }

    @Override // com.daaw.AbstractC0943ca
    /* renamed from: c */
    public byte[] mo25477c() {
        return this.f2963b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0943ca) {
            AbstractC0943ca abstractC0943ca = (AbstractC0943ca) obj;
            if (this.f2962a.equals(abstractC0943ca.mo25478b())) {
                if (Arrays.equals(this.f2963b, abstractC0943ca instanceof C0607a8 ? ((C0607a8) abstractC0943ca).f2963b : abstractC0943ca.mo25477c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2962a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2963b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f2962a + ", extras=" + Arrays.toString(this.f2963b) + "}";
    }
}
