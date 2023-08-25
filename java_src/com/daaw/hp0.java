package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
/* loaded from: classes.dex */
public final class hp0 {

    /* renamed from: com.daaw.hp0$a */
    /* loaded from: classes.dex */
    public static class C1604a {
        /* renamed from: a */
        public static int m20558a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: b */
        public static CharSequence m20557b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: c */
        public static ColorStateList m20556c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: d */
        public static PorterDuff.Mode m20555d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: e */
        public static int m20554e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: f */
        public static CharSequence m20553f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: g */
        public static MenuItem m20552g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: h */
        public static MenuItem m20551h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: i */
        public static MenuItem m20550i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: j */
        public static MenuItem m20549j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: k */
        public static MenuItem m20548k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: l */
        public static MenuItem m20547l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        /* renamed from: m */
        public static MenuItem m20546m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static MenuItem m20565a(MenuItem menuItem, AbstractC2388o0 abstractC2388o0) {
        return menuItem instanceof hi1 ? ((hi1) menuItem).mo16344b(abstractC2388o0) : menuItem;
    }

    /* renamed from: b */
    public static void m20564b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof hi1) {
            ((hi1) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1604a.m20552g(menuItem, c, i);
        }
    }

    /* renamed from: c */
    public static void m20563c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof hi1) {
            ((hi1) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1604a.m20551h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m20562d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof hi1) {
            ((hi1) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1604a.m20550i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m20561e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof hi1) {
            ((hi1) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1604a.m20549j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m20560f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof hi1) {
            ((hi1) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1604a.m20548k(menuItem, c, i);
        }
    }

    /* renamed from: g */
    public static void m20559g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof hi1) {
            ((hi1) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1604a.m20546m(menuItem, charSequence);
        }
    }
}
