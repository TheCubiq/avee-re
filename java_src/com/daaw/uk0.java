package com.daaw;

import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class uk0 implements tk0 {

    /* renamed from: a */
    public final LocaleList f29143a;

    public uk0(Object obj) {
        this.f29143a = (LocaleList) obj;
    }

    @Override // com.daaw.tk0
    /* renamed from: a */
    public String mo8083a() {
        return this.f29143a.toLanguageTags();
    }

    @Override // com.daaw.tk0
    /* renamed from: b */
    public Object mo8082b() {
        return this.f29143a;
    }

    public boolean equals(Object obj) {
        return this.f29143a.equals(((tk0) obj).mo8082b());
    }

    @Override // com.daaw.tk0
    public Locale get(int i) {
        return this.f29143a.get(i);
    }

    public int hashCode() {
        return this.f29143a.hashCode();
    }

    @Override // com.daaw.tk0
    public boolean isEmpty() {
        return this.f29143a.isEmpty();
    }

    @Override // com.daaw.tk0
    public int size() {
        return this.f29143a.size();
    }

    public String toString() {
        return this.f29143a.toString();
    }
}
