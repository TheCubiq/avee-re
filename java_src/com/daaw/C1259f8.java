package com.daaw;

import java.io.File;
import java.util.Objects;
/* renamed from: com.daaw.f8 */
/* loaded from: classes2.dex */
public final class C1259f8 extends AbstractC3878zm {

    /* renamed from: a */
    public final AbstractC2057lm f9221a;

    /* renamed from: b */
    public final String f9222b;

    /* renamed from: c */
    public final File f9223c;

    public C1259f8(AbstractC2057lm abstractC2057lm, String str, File file) {
        Objects.requireNonNull(abstractC2057lm, "Null report");
        this.f9221a = abstractC2057lm;
        Objects.requireNonNull(str, "Null sessionId");
        this.f9222b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f9223c = file;
    }

    @Override // com.daaw.AbstractC3878zm
    /* renamed from: b */
    public AbstractC2057lm mo2118b() {
        return this.f9221a;
    }

    @Override // com.daaw.AbstractC3878zm
    /* renamed from: c */
    public File mo2117c() {
        return this.f9223c;
    }

    @Override // com.daaw.AbstractC3878zm
    /* renamed from: d */
    public String mo2116d() {
        return this.f9222b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3878zm) {
            AbstractC3878zm abstractC3878zm = (AbstractC3878zm) obj;
            return this.f9221a.equals(abstractC3878zm.mo2118b()) && this.f9222b.equals(abstractC3878zm.mo2116d()) && this.f9223c.equals(abstractC3878zm.mo2117c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f9221a.hashCode() ^ 1000003) * 1000003) ^ this.f9222b.hashCode()) * 1000003) ^ this.f9223c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f9221a + ", sessionId=" + this.f9222b + ", reportFile=" + this.f9223c + "}";
    }
}
