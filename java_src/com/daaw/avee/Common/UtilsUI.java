package com.daaw.avee.Common;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
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
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyCharacterMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.daaw.avee.ContextData;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class UtilsUI {
    static int navBarHeight = -1;

    public static void AssertIsUiThread() {
        Assert.assertTrue(Looper.myLooper() == Looper.getMainLooper());
    }

    public static void AssertIsNotUiThread() {
        Assert.assertTrue(Looper.myLooper() != Looper.getMainLooper());
    }

    public static boolean IsUiThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static LayoutInflater getInflaterFromContext(Context context) {
        return LayoutInflater.from(context);
    }

    public static void disallowInterceptTouchEventRecursive(View view, ViewParent viewParent) {
        view.setOnTouchListener(new OnSwipeTouchDisallowParentListener(viewParent));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                disallowInterceptTouchEventRecursive(viewGroup.getChildAt(childCount), viewParent);
            }
        }
    }

    public static void disallowInterceptTouchEventRecursive(View view) {
        view.setOnTouchListener(new OnSwipeTouchDisallowListener());
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                disallowInterceptTouchEventRecursive(viewGroup.getChildAt(childCount));
            }
        }
    }

    public static void setViewStyle(View view, int i, int i2) {
        if (view instanceof ViewGroup) {
            int i3 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                setViewStyle(viewGroup.getChildAt(i3), i, i2);
                i3++;
            }
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setTextColor(i);
            textView.setHintTextColor(i2);
            textView.setLinkTextColor(i2);
        } else if (view instanceof ImageView) {
            ((ImageView) view).setColorFilter(i);
        }
    }

    public static int getNavBarHeightIgnoreOrienCached(Context context) {
        if (navBarHeight == -1) {
            navBarHeight = getNavBarHeightIgnoreOrient(context);
        }
        return navBarHeight;
    }

    public static int getNavBarHeightIgnoreOrient(Context context) {
        int identifier;
        boolean hasPermanentMenuKey = ViewConfiguration.get(context).hasPermanentMenuKey();
        boolean deviceHasKey = KeyCharacterMap.deviceHasKey(4);
        if (hasPermanentMenuKey && deviceHasKey) {
            return 0;
        }
        Resources resources = context.getResources();
        if (isTablet(context)) {
            identifier = resources.getIdentifier("navigation_bar_height", "dimen", AbstractSpiCall.ANDROID_CLIENT_TYPE);
        } else {
            identifier = resources.getIdentifier("navigation_bar_height", "dimen", AbstractSpiCall.ANDROID_CLIENT_TYPE);
        }
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int getNavBarHeight(Context context) {
        int identifier;
        boolean hasPermanentMenuKey = ViewConfiguration.get(context).hasPermanentMenuKey();
        boolean deviceHasKey = KeyCharacterMap.deviceHasKey(4);
        if (hasPermanentMenuKey || deviceHasKey) {
            return 0;
        }
        Resources resources = context.getResources();
        int i = context.getResources().getConfiguration().orientation;
        if (isTablet(context)) {
            identifier = resources.getIdentifier(i != 1 ? "navigation_bar_height_landscape" : "navigation_bar_height", "dimen", AbstractSpiCall.ANDROID_CLIENT_TYPE);
        } else {
            identifier = resources.getIdentifier(i != 1 ? "navigation_bar_width" : "navigation_bar_height", "dimen", AbstractSpiCall.ANDROID_CLIENT_TYPE);
        }
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static void dismissSafe(ListPopupWindow listPopupWindow) {
        if (listPopupWindow != null && listPopupWindow.isShowing()) {
            listPopupWindow.dismiss();
        }
    }

    public static void dismissSafe(PopupWindow popupWindow) {
        if (popupWindow != null && popupWindow.isShowing()) {
            try {
                popupWindow.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public static void dismissSafe(DialogFragment dialogFragment) {
        if (dialogFragment == null) {
            return;
        }
        try {
            dialogFragment.dismiss();
        } catch (Exception unused) {
        }
    }

    public static void cancelDialogSafe(Dialog dialog) {
        if (dialog == null) {
            return;
        }
        dialog.cancel();
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", AbstractSpiCall.ANDROID_CLIENT_TYPE);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void setStatusBarDimensions(View view) {
        if (view == null) {
            return;
        }
        view.getLayoutParams().height = getStatusBarHeight(view.getContext());
    }

    public static int getAttrDrawableRes(View view, int i) {
        TypedArray obtainStyledAttributes = view.getContext().getTheme().obtainStyledAttributes(new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int getAttrDrawableRes(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int getAttrColor(View view, int i) {
        TypedArray obtainStyledAttributes = view.getContext().getTheme().obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static int getAttrColor(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static int getAttrColorWithAlphaRes(Resources.Theme theme, Context context, int i, int i2) {
        return (getAttrColor(theme, i) & ViewCompat.MEASURED_SIZE_MASK) | (ContextCompat.getColor(context, i2) & ViewCompat.MEASURED_STATE_MASK);
    }

    public static int getAttrColorRes(View view, int i) {
        TypedArray obtainStyledAttributes = view.getContext().getTheme().obtainStyledAttributes(new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Bitmap copyBitmapSafe(Bitmap bitmap) {
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

    public static void setSelectedView(View[] viewArr, View view) {
        if (viewArr[0] != null) {
            viewArr[0].setSelected(false);
        }
        viewArr[0] = view;
        view.setSelected(true);
    }

    public static void showDialogSafe(DialogFragment dialogFragment, String str, ContextData contextData) {
        Activity activity;
        FragmentManager fragmentManager;
        if (contextData == null || (activity = contextData.getActivity()) == null || activity.isFinishing() || (fragmentManager = contextData.getFragmentManager()) == null) {
            return;
        }
        try {
            dialogFragment.show(fragmentManager, str);
        } catch (Exception unused) {
        }
    }

    public static void displayOneDialog(ContextData contextData, DialogFragment dialogFragment, String str) {
        FragmentManager fragmentManager = contextData.getFragmentManager();
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        Activity activity = contextData.getActivity();
        if (activity == null || activity.isFinishing() || contextData.getFragmentManager() == null) {
            return;
        }
        try {
            dialogFragment.show(beginTransaction, str);
        } catch (Exception unused) {
        }
    }

    public static void showControl(View view) {
        int integer = view.getResources().getInteger(17694720);
        view.animate().cancel();
        view.animate().withEndAction(null);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(integer);
    }

    public static void hideControl(final View view) {
        int integer = view.getResources().getInteger(17694720);
        view.animate().cancel();
        view.animate().withEndAction(new Runnable() { // from class: com.daaw.avee.Common.-$$Lambda$UtilsUI$yCqpXxOd6cWTPq8YFDPfpgfetw4
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(4);
            }
        }).alpha(0.0f).setDuration(integer);
    }

    public static void animShowDrawable(Drawable drawable, long j) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", 0, 255));
        ofPropertyValuesHolder.setTarget(drawable);
        ofPropertyValuesHolder.setDuration(j);
        ofPropertyValuesHolder.start();
    }

    public static void animHideDrawable(Drawable drawable, long j, final Action action) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", 255, 0));
        ofPropertyValuesHolder.setTarget(drawable);
        ofPropertyValuesHolder.setDuration(j);
        ofPropertyValuesHolder.addListener(new Animator.AnimatorListener() { // from class: com.daaw.avee.Common.UtilsUI.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Action.this.onInvoke();
            }
        });
        ofPropertyValuesHolder.start();
    }

    public static ValueAnimator animShowCustom255(ValueAnimator valueAnimator, final Action1<Integer> action1, int i, long j) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, 255);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.daaw.avee.Common.UtilsUI.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Action1.this.onInvoke((Integer) valueAnimator2.getAnimatedValue());
            }
        });
        ofInt.setDuration(j);
        ofInt.start();
        return ofInt;
    }

    public static ValueAnimator animHideCustom255(ValueAnimator valueAnimator, final Action1<Integer> action1, int i, long j, final Action action) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.daaw.avee.Common.UtilsUI.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Action1.this.onInvoke((Integer) valueAnimator2.getAnimatedValue());
            }
        });
        ofInt.setDuration(j);
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.daaw.avee.Common.UtilsUI.4
            boolean isCanceled = false;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (this.isCanceled) {
                    return;
                }
                Action.this.onInvoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.isCanceled = true;
            }
        });
        ofInt.start();
        return ofInt;
    }
}
