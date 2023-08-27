package com.daaw.avee.comp.IceCast;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class GenreDesc {
    private List<GenreDesc> children = new ArrayList();
    public final String id;
    public final String name;

    public GenreDesc(String str, String str2) {
        this.name = str;
        this.id = str2;
    }

    public List<GenreDesc> getChildren() {
        return this.children;
    }
}
