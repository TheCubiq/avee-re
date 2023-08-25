package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class gt implements od0 {
    public List<String> a = new ArrayList();

    @Override // com.daaw.od0
    public void a(String str) {
        this.a.add(str);
    }

    public List<String> b() {
        return this.a;
    }
}
