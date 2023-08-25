package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.daaw.py0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public final class sk1 {

    /* renamed from: com.daaw.sk1$a */
    /* loaded from: classes.dex */
    public static class C2948a {
        /* renamed from: a */
        public static boolean m10256a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        public static int m10255b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        public static int m10254c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: com.daaw.sk1$b */
    /* loaded from: classes.dex */
    public static class C2949b {
        /* renamed from: a */
        public static Drawable[] m10253a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static int m10252b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        public static int m10251c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        public static Locale m10250d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        public static void m10249e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        public static void m10248f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        public static void m10247g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        public static void m10246h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: com.daaw.sk1$c */
    /* loaded from: classes.dex */
    public static class C2950c {
        /* renamed from: a */
        public static int m10245a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        public static ColorStateList m10244b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        public static PorterDuff.Mode m10243c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        public static int m10242d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        public static void m10241e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        public static void m10240f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        public static void m10239g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        public static void m10238h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* renamed from: com.daaw.sk1$d */
    /* loaded from: classes.dex */
    public static class C2951d {
        /* renamed from: a */
        public static DecimalFormatSymbols m10237a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: com.daaw.sk1$e */
    /* loaded from: classes.dex */
    public static class C2952e {
        /* renamed from: a */
        public static String[] m10236a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        public static PrecomputedText.Params m10235b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        public static void m10234c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* renamed from: com.daaw.sk1$f */
    /* loaded from: classes.dex */
    public static class ActionMode$CallbackC2953f implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f26331a;

        /* renamed from: b */
        public final TextView f26332b;

        /* renamed from: c */
        public Class<?> f26333c;

        /* renamed from: d */
        public Method f26334d;

        /* renamed from: e */
        public boolean f26335e;

        /* renamed from: f */
        public boolean f26336f = false;

        public ActionMode$CallbackC2953f(ActionMode.Callback callback, TextView textView) {
            this.f26331a = callback;
            this.f26332b = textView;
        }

        /* renamed from: a */
        public final Intent m10233a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        public final Intent m10232b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m10233a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m10229e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        public final List<ResolveInfo> m10231c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m10233a(), 0)) {
                    if (m10228f(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
                return arrayList;
            }
            return arrayList;
        }

        /* renamed from: d */
        public ActionMode.Callback m10230d() {
            return this.f26331a;
        }

        /* renamed from: e */
        public final boolean m10229e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: f */
        public final boolean m10228f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo.exported) {
                String str = activityInfo.permission;
                return str == null || context.checkSelfPermission(str) == 0;
            }
            return false;
        }

        /* renamed from: g */
        public final void m10227g(Menu menu) {
            Context context = this.f26332b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f26336f) {
                this.f26336f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f26333c = cls;
                    this.f26334d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f26335e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f26333c = null;
                    this.f26334d = null;
                    this.f26335e = false;
                }
            }
            try {
                Method declaredMethod = (this.f26335e && this.f26333c.isInstance(menu)) ? this.f26334d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m10231c = m10231c(context, packageManager);
                for (int i = 0; i < m10231c.size(); i++) {
                    ResolveInfo resolveInfo = m10231c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m10232b(resolveInfo, this.f26332b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f26331a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f26331a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f26331a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m10227g(menu);
            return this.f26331a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m10273a(TextView textView) {
        return C2949b.m10253a(textView);
    }

    /* renamed from: b */
    public static int m10272b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m10271c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m10270d(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: e */
    public static TextDirectionHeuristic m10269e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C2952e.m10236a(C2951d.m10237a(C2949b.m10250d(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = C2949b.m10252b(textView) == 1;
        switch (C2949b.m10251c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: f */
    public static py0.C2666a m10268f(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new py0.C2666a(C2952e.m10235b(textView));
        }
        py0.C2666a.C2667a c2667a = new py0.C2666a.C2667a(new TextPaint(textView.getPaint()));
        if (i >= 23) {
            c2667a.m12873b(C2950c.m10245a(textView));
            c2667a.m12872c(C2950c.m10242d(textView));
        }
        c2667a.m12871d(m10269e(textView));
        return c2667a.m12874a();
    }

    /* renamed from: g */
    public static void m10267g(TextView textView, ColorStateList colorStateList) {
        ty0.m8699f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C2950c.m10240f(textView, colorStateList);
        } else if (textView instanceof yl1) {
            ((yl1) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: h */
    public static void m10266h(TextView textView, PorterDuff.Mode mode) {
        ty0.m8699f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C2950c.m10239g(textView, mode);
        } else if (textView instanceof yl1) {
            ((yl1) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: i */
    public static void m10265i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C2949b.m10249e(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: j */
    public static void m10264j(TextView textView, int i) {
        ty0.m8702c(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C2952e.m10234c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = C2948a.m10256a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: k */
    public static void m10263k(TextView textView, int i) {
        ty0.m8702c(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = C2948a.m10256a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: l */
    public static void m10262l(TextView textView, int i) {
        ty0.m8702c(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* renamed from: m */
    public static void m10261m(TextView textView, py0 py0Var) {
        PrecomputedText precomputedText;
        if (Build.VERSION.SDK_INT >= 29) {
            precomputedText = py0Var.m12880b();
        } else {
            boolean m12879a = m10268f(textView).m12879a(py0Var.m12881a());
            precomputedText = py0Var;
            if (!m12879a) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(precomputedText);
    }

    /* renamed from: n */
    public static void m10260n(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: o */
    public static void m10259o(TextView textView, py0.C2666a c2666a) {
        int i = Build.VERSION.SDK_INT;
        C2949b.m10246h(textView, m10270d(c2666a.m12876d()));
        if (i >= 23) {
            textView.getPaint().set(c2666a.m12875e());
            C2950c.m10241e(textView, c2666a.m12878b());
            C2950c.m10238h(textView, c2666a.m12877c());
            return;
        }
        float textScaleX = c2666a.m12875e().getTextScaleX();
        textView.getPaint().set(c2666a.m12875e());
        if (textScaleX == textView.getTextScaleX()) {
            textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
        }
        textView.setTextScaleX(textScaleX);
    }

    /* renamed from: p */
    public static ActionMode.Callback m10258p(ActionMode.Callback callback) {
        return (!(callback instanceof ActionMode$CallbackC2953f) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionMode$CallbackC2953f) callback).m10230d();
    }

    /* renamed from: q */
    public static ActionMode.Callback m10257q(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionMode$CallbackC2953f) || callback == null) ? callback : new ActionMode$CallbackC2953f(callback, textView);
    }
}
