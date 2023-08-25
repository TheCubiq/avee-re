package com.daaw;

import com.daaw.of1;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class u9 extends of1.c {
    public final String a;
    public final String b;
    public final boolean c;

    public u9(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.b = str2;
        this.c = z;
    }

    @Override // com.daaw.of1.c
    public boolean b() {
        return this.c;
    }

    @Override // com.daaw.of1.c
    public String c() {
        return this.b;
    }

    @Override // com.daaw.of1.c
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof of1.c) {
            of1.c cVar = (of1.c) obj;
            return this.a.equals(cVar.d()) && this.b.equals(cVar.c()) && this.c == cVar.b();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.a + ", osCodeName=" + this.b + ", isRooted=" + this.c + "}";
    }
}
