package com.daaw;

import android.content.Context;
import java.util.Objects;
/* renamed from: com.daaw.a9 */
/* loaded from: classes.dex */
public final class C0611a9 extends AbstractC1202en {

    /* renamed from: a */
    public final Context f2998a;

    /* renamed from: b */
    public final InterfaceC0951cg f2999b;

    /* renamed from: c */
    public final InterfaceC0951cg f3000c;

    /* renamed from: d */
    public final String f3001d;

    public C0611a9(Context context, InterfaceC0951cg interfaceC0951cg, InterfaceC0951cg interfaceC0951cg2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f2998a = context;
        Objects.requireNonNull(interfaceC0951cg, "Null wallClock");
        this.f2999b = interfaceC0951cg;
        Objects.requireNonNull(interfaceC0951cg2, "Null monotonicClock");
        this.f3000c = interfaceC0951cg2;
        Objects.requireNonNull(str, "Null backendName");
        this.f3001d = str;
    }

    @Override // com.daaw.AbstractC1202en
    /* renamed from: b */
    public Context mo23362b() {
        return this.f2998a;
    }

    @Override // com.daaw.AbstractC1202en
    /* renamed from: c */
    public String mo23361c() {
        return this.f3001d;
    }

    @Override // com.daaw.AbstractC1202en
    /* renamed from: d */
    public InterfaceC0951cg mo23360d() {
        return this.f3000c;
    }

    @Override // com.daaw.AbstractC1202en
    /* renamed from: e */
    public InterfaceC0951cg mo23359e() {
        return this.f2999b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1202en) {
            AbstractC1202en abstractC1202en = (AbstractC1202en) obj;
            return this.f2998a.equals(abstractC1202en.mo23362b()) && this.f2999b.equals(abstractC1202en.mo23359e()) && this.f3000c.equals(abstractC1202en.mo23360d()) && this.f3001d.equals(abstractC1202en.mo23361c());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f2998a.hashCode() ^ 1000003) * 1000003) ^ this.f2999b.hashCode()) * 1000003) ^ this.f3000c.hashCode()) * 1000003) ^ this.f3001d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f2998a + ", wallClock=" + this.f2999b + ", monotonicClock=" + this.f3000c + ", backendName=" + this.f3001d + "}";
    }
}
