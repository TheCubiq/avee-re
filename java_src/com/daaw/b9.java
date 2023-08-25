package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class b9<T> extends xx<T> {
    public final Integer a;
    public final T b;
    public final cz0 c;

    public b9(Integer num, T t, cz0 cz0Var) {
        this.a = num;
        Objects.requireNonNull(t, "Null payload");
        this.b = t;
        Objects.requireNonNull(cz0Var, "Null priority");
        this.c = cz0Var;
    }

    @Override // com.daaw.xx
    public Integer a() {
        return this.a;
    }

    @Override // com.daaw.xx
    public T b() {
        return this.b;
    }

    @Override // com.daaw.xx
    public cz0 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xx) {
            xx xxVar = (xx) obj;
            Integer num = this.a;
            if (num != null ? num.equals(xxVar.a()) : xxVar.a() == null) {
                if (this.b.equals(xxVar.b()) && this.c.equals(xxVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + "}";
    }
}
