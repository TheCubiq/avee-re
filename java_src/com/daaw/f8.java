package com.daaw;

import java.io.File;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class f8 extends zm {
    public final lm a;
    public final String b;
    public final File c;

    public f8(lm lmVar, String str, File file) {
        Objects.requireNonNull(lmVar, "Null report");
        this.a = lmVar;
        Objects.requireNonNull(str, "Null sessionId");
        this.b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.c = file;
    }

    @Override // com.daaw.zm
    public lm b() {
        return this.a;
    }

    @Override // com.daaw.zm
    public File c() {
        return this.c;
    }

    @Override // com.daaw.zm
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zm) {
            zm zmVar = (zm) obj;
            return this.a.equals(zmVar.b()) && this.b.equals(zmVar.d()) && this.c.equals(zmVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
