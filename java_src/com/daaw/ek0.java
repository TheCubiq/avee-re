package com.daaw;

import android.widget.ListView;
/* loaded from: classes.dex */
public final class ek0 {

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        public static void b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    public static void a(ListView listView, int i) {
        a.b(listView, i);
    }
}
