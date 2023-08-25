package com.daaw;

import com.daaw.of1;
import java.util.Objects;
/* renamed from: com.daaw.u9 */
/* loaded from: classes2.dex */
public final class C3189u9 extends of1.AbstractC2437c {

    /* renamed from: a */
    public final String f28801a;

    /* renamed from: b */
    public final String f28802b;

    /* renamed from: c */
    public final boolean f28803c;

    public C3189u9(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f28801a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f28802b = str2;
        this.f28803c = z;
    }

    @Override // com.daaw.of1.AbstractC2437c
    /* renamed from: b */
    public boolean mo8411b() {
        return this.f28803c;
    }

    @Override // com.daaw.of1.AbstractC2437c
    /* renamed from: c */
    public String mo8410c() {
        return this.f28802b;
    }

    @Override // com.daaw.of1.AbstractC2437c
    /* renamed from: d */
    public String mo8409d() {
        return this.f28801a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof of1.AbstractC2437c) {
            of1.AbstractC2437c abstractC2437c = (of1.AbstractC2437c) obj;
            return this.f28801a.equals(abstractC2437c.mo8409d()) && this.f28802b.equals(abstractC2437c.mo8410c()) && this.f28803c == abstractC2437c.mo8411b();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f28801a.hashCode() ^ 1000003) * 1000003) ^ this.f28802b.hashCode()) * 1000003) ^ (this.f28803c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f28801a + ", osCodeName=" + this.f28802b + ", isRooted=" + this.f28803c + "}";
    }
}
