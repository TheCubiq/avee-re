package com.daaw;

import com.daaw.of1;
import java.util.Objects;
/* renamed from: com.daaw.s9 */
/* loaded from: classes2.dex */
public final class C2924s9 extends of1.AbstractC2435a {

    /* renamed from: a */
    public final String f26006a;

    /* renamed from: b */
    public final String f26007b;

    /* renamed from: c */
    public final String f26008c;

    /* renamed from: d */
    public final String f26009d;

    /* renamed from: e */
    public final int f26010e;

    /* renamed from: f */
    public final C2209mt f26011f;

    public C2924s9(String str, String str2, String str3, String str4, int i, C2209mt c2209mt) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f26006a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f26007b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f26008c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f26009d = str4;
        this.f26010e = i;
        Objects.requireNonNull(c2209mt, "Null developmentPlatformProvider");
        this.f26011f = c2209mt;
    }

    @Override // com.daaw.of1.AbstractC2435a
    /* renamed from: a */
    public String mo10515a() {
        return this.f26006a;
    }

    @Override // com.daaw.of1.AbstractC2435a
    /* renamed from: c */
    public int mo10514c() {
        return this.f26010e;
    }

    @Override // com.daaw.of1.AbstractC2435a
    /* renamed from: d */
    public C2209mt mo10513d() {
        return this.f26011f;
    }

    @Override // com.daaw.of1.AbstractC2435a
    /* renamed from: e */
    public String mo10512e() {
        return this.f26009d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof of1.AbstractC2435a) {
            of1.AbstractC2435a abstractC2435a = (of1.AbstractC2435a) obj;
            return this.f26006a.equals(abstractC2435a.mo10515a()) && this.f26007b.equals(abstractC2435a.mo10511f()) && this.f26008c.equals(abstractC2435a.mo10510g()) && this.f26009d.equals(abstractC2435a.mo10512e()) && this.f26010e == abstractC2435a.mo10514c() && this.f26011f.equals(abstractC2435a.mo10513d());
        }
        return false;
    }

    @Override // com.daaw.of1.AbstractC2435a
    /* renamed from: f */
    public String mo10511f() {
        return this.f26007b;
    }

    @Override // com.daaw.of1.AbstractC2435a
    /* renamed from: g */
    public String mo10510g() {
        return this.f26008c;
    }

    public int hashCode() {
        return ((((((((((this.f26006a.hashCode() ^ 1000003) * 1000003) ^ this.f26007b.hashCode()) * 1000003) ^ this.f26008c.hashCode()) * 1000003) ^ this.f26009d.hashCode()) * 1000003) ^ this.f26010e) * 1000003) ^ this.f26011f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f26006a + ", versionCode=" + this.f26007b + ", versionName=" + this.f26008c + ", installUuid=" + this.f26009d + ", deliveryMechanism=" + this.f26010e + ", developmentPlatformProvider=" + this.f26011f + "}";
    }
}
