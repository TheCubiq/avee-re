package com.daaw;

import android.widget.ListView;
/* loaded from: classes.dex */
public final class ek0 {

    /* renamed from: com.daaw.ek0$a */
    /* loaded from: classes.dex */
    public static class C1194a {
        /* renamed from: a */
        public static boolean m23432a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        /* renamed from: b */
        public static void m23431b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    /* renamed from: a */
    public static void m23433a(ListView listView, int i) {
        C1194a.m23431b(listView, i);
    }
}
