package com.daaw;

import java.util.Objects;
/* renamed from: com.daaw.b9 */
/* loaded from: classes.dex */
public final class C0827b9<T> extends AbstractC3649xx<T> {

    /* renamed from: a */
    public final Integer f4553a;

    /* renamed from: b */
    public final T f4554b;

    /* renamed from: c */
    public final cz0 f4555c;

    public C0827b9(Integer num, T t, cz0 cz0Var) {
        this.f4553a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f4554b = t;
        Objects.requireNonNull(cz0Var, "Null priority");
        this.f4555c = cz0Var;
    }

    @Override // com.daaw.AbstractC3649xx
    /* renamed from: a */
    public Integer mo4419a() {
        return this.f4553a;
    }

    @Override // com.daaw.AbstractC3649xx
    /* renamed from: b */
    public T mo4418b() {
        return this.f4554b;
    }

    @Override // com.daaw.AbstractC3649xx
    /* renamed from: c */
    public cz0 mo4417c() {
        return this.f4555c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3649xx) {
            AbstractC3649xx abstractC3649xx = (AbstractC3649xx) obj;
            Integer num = this.f4553a;
            if (num != null ? num.equals(abstractC3649xx.mo4419a()) : abstractC3649xx.mo4419a() == null) {
                if (this.f4554b.equals(abstractC3649xx.mo4418b()) && this.f4555c.equals(abstractC3649xx.mo4417c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f4553a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f4554b.hashCode()) * 1000003) ^ this.f4555c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f4553a + ", payload=" + this.f4554b + ", priority=" + this.f4555c + "}";
    }
}
