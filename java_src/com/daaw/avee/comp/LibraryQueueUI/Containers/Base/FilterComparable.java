package com.daaw.avee.comp.LibraryQueueUI.Containers.Base;
/* loaded from: classes.dex */
public interface FilterComparable<T1> {
    boolean compare(String str, T1 t1);

    void preProcessItem(T1 t1);

    String preProcessQuery(String str);
}
