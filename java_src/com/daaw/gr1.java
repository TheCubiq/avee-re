package com.daaw;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
/* loaded from: classes.dex */
public class gr1 {

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ e0 a;

        public a(e0 e0Var) {
            this.a = e0Var;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a((Integer) valueAnimator.getAnimatedValue());
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ e0 a;

        public b(e0 e0Var) {
            this.a = e0Var;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a((Integer) valueAnimator.getAnimatedValue());
        }
    }

    /* loaded from: classes.dex */
    public class c implements Animator.AnimatorListener {
        public boolean a = false;
        public final /* synthetic */ h0 b;

        public c(h0 h0Var) {
            this.b = h0Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.b.a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static void b() {
        q6.i(Looper.myLooper() != Looper.getMainLooper());
    }

    public static void c() {
        q6.i(Looper.myLooper() == Looper.getMainLooper());
    }

    public static boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static ValueAnimator e(ValueAnimator valueAnimator, e0<Integer> e0Var, int i, long j, h0 h0Var) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, 0);
        ofInt.addUpdateListener(new b(e0Var));
        ofInt.setDuration(j);
        ofInt.addListener(new c(h0Var));
        ofInt.start();
        return ofInt;
    }

    public static ValueAnimator f(ValueAnimator valueAnimator, e0<Integer> e0Var, int i, long j) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, 255);
        ofInt.addUpdateListener(new a(e0Var));
        ofInt.setDuration(j);
        ofInt.start();
        return ofInt;
    }

    public static void g(Dialog dialog) {
        if (dialog == null) {
            return;
        }
        dialog.cancel();
    }

    public static Bitmap h(Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                try {
                    config = Bitmap.Config.RGB_565;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                } catch (OutOfMemoryError e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
            return bitmap.copy(config, false);
        }
        return bitmap;
    }

    public static void i(View view, ViewParent viewParent) {
        view.setOnTouchListener(new lu0(viewParent));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                i(viewGroup.getChildAt(childCount), viewParent);
            }
        }
    }

    public static void j(DialogFragment dialogFragment) {
        if (dialogFragment == null) {
            return;
        }
        try {
            dialogFragment.dismiss();
        } catch (Exception unused) {
        }
    }

    public static void k(PopupWindow popupWindow) {
        if (popupWindow != null && popupWindow.isShowing()) {
            try {
                popupWindow.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public static void l(al alVar, DialogFragment dialogFragment, String str) {
        FragmentManager c2 = alVar.c();
        FragmentTransaction beginTransaction = c2.beginTransaction();
        Fragment findFragmentByTag = c2.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        Activity a2 = alVar.a();
        if (a2 == null || a2.isFinishing() || alVar.c() == null) {
            return;
        }
        try {
            dialogFragment.show(beginTransaction, str);
        } catch (Exception unused) {
        }
    }

    public static int m(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static int n(View view, int i) {
        TypedArray obtainStyledAttributes = view.getContext().getTheme().obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static int o(Resources.Theme theme, Context context, int i, int i2) {
        return (m(theme, i) & 16777215) | (zk.c(context, i2) & (-16777216));
    }

    public static LayoutInflater p(Context context) {
        return LayoutInflater.from(context);
    }

    public static int q(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void r(final View view) {
        if (view == null) {
            return;
        }
        int integer = view.getResources().getInteger(17694720);
        view.animate().cancel();
        view.animate().withEndAction(new Runnable() { // from class: com.daaw.fr1
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(4);
            }
        }).alpha(0.0f).setDuration(integer);
    }

    public static void t(View[] viewArr, View view) {
        if (viewArr[0] != null) {
            viewArr[0].setSelected(false);
        }
        viewArr[0] = view;
        view.setSelected(true);
    }

    public static void u(View view) {
        if (view == null) {
            return;
        }
        view.getLayoutParams().height = q(view.getContext());
    }

    public static void v(View view, int i, int i2) {
        if (view instanceof ViewGroup) {
            int i3 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                v(viewGroup.getChildAt(i3), i, i2);
                i3++;
            }
        }
        if (!(view instanceof TextView)) {
            if (view instanceof ImageView) {
                ((ImageView) view).setColorFilter(i);
                return;
            }
            return;
        }
        TextView textView = (TextView) view;
        textView.setTextColor(i);
        textView.setHintTextColor(i2);
        textView.setLinkTextColor(i2);
    }

    public static void w(View view) {
        if (view == null) {
            return;
        }
        int integer = view.getResources().getInteger(17694720);
        view.animate().cancel();
        view.animate().withEndAction(null);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(integer);
    }

    public static void x(DialogFragment dialogFragment, String str, al alVar) {
        Activity a2;
        FragmentManager c2;
        if (alVar == null || (a2 = alVar.a()) == null || a2.isFinishing() || (c2 = alVar.c()) == null) {
            return;
        }
        try {
            dialogFragment.show(c2, str);
        } catch (Exception unused) {
        }
    }
}
