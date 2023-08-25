package com.daaw;

import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class uk0 implements tk0 {
    public final LocaleList a;

    public uk0(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // com.daaw.tk0
    public String a() {
        return this.a.toLanguageTags();
    }

    @Override // com.daaw.tk0
    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((tk0) obj).b());
    }

    @Override // com.daaw.tk0
    public Locale get(int i) {
        return this.a.get(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.daaw.tk0
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // com.daaw.tk0
    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }
}
