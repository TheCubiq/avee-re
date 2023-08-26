package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
/* compiled from: View.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a5\u0010 \u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010'\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010(\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010)\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010*\u001a\u00020+*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a\u0014\u0010,\u001a\u00020-*\u00020\u00022\b\b\u0002\u0010.\u001a\u00020/\u001a(\u00100\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\u000e\b\u0004\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04H\u0086\bø\u0001\u0000\u001a(\u00105\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\u000e\b\u0004\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04H\u0087\bø\u0001\u0000\u001a\u0017\u00106\u001a\u00020!*\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u0013H\u0086\b\u001a:\u00108\u001a\u00020!\"\n\b\u0000\u00109\u0018\u0001*\u00020:*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0087\bø\u0001\u0000¢\u0006\u0002\b=\u001a)\u00108\u001a\u00020!*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0086\bø\u0001\u0000\u001a5\u0010>\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010?\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010A\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0086\b\u001a5\u0010C\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010D\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010E\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0087\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\"*\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\"*\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r\"*\u0010\u0010\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r\"\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0016\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\"\u0016\u0010\u0018\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\"\u0016\u0010\u001a\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\"\u0016\u0010\u001c\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015\"\u0016\u0010\u001e\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, d2 = {"allViews", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "getAllViews", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "Landroid/view/ViewParent;", "getAncestors", "value", "", "isGone", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isVisible", "setVisible", "marginBottom", "", "getMarginBottom", "(Landroid/view/View;)I", "marginEnd", "getMarginEnd", "marginLeft", "getMarginLeft", "marginRight", "getMarginRight", "marginStart", "getMarginStart", "marginTop", "getMarginTop", "doOnAttach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "view", "doOnDetach", "doOnLayout", "doOnNextLayout", "doOnPreDraw", "Landroidx/core/view/OneShotPreDrawListener;", "drawToBitmap", "Landroid/graphics/Bitmap;", "config", "Landroid/graphics/Bitmap$Config;", "postDelayed", "Ljava/lang/Runnable;", "delayInMillis", "", "Lkotlin/Function0;", "postOnAnimationDelayed", "setPadding", "size", "updateLayoutParams", "T", "Landroid/view/ViewGroup$LayoutParams;", "block", "Lkotlin/ExtensionFunctionType;", "updateLayoutParamsTyped", "updatePadding", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "updatePaddingRelative", "start", "end", "core-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class ViewKt {
    public static final void doOnNextLayout(View doOnNextLayout, final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(doOnNextLayout, "$this$doOnNextLayout");
        Intrinsics.checkNotNullParameter(action, "action");
        doOnNextLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                Function1.this.invoke(view);
            }
        });
    }

    public static final void doOnLayout(View doOnLayout, final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(doOnLayout, "$this$doOnLayout");
        Intrinsics.checkNotNullParameter(action, "action");
        if (ViewCompat.isLaidOut(doOnLayout) && !doOnLayout.isLayoutRequested()) {
            action.invoke(doOnLayout);
        } else {
            doOnLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    Function1.this.invoke(view);
                }
            });
        }
    }

    public static final OneShotPreDrawListener doOnPreDraw(final View doOnPreDraw, final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(doOnPreDraw, "$this$doOnPreDraw");
        Intrinsics.checkNotNullParameter(action, "action");
        OneShotPreDrawListener add = OneShotPreDrawListener.add(doOnPreDraw, new Runnable() { // from class: androidx.core.view.ViewKt$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                action.invoke(doOnPreDraw);
            }
        });
        Intrinsics.checkNotNullExpressionValue(add, "OneShotPreDrawListener.add(this) { action(this) }");
        return add;
    }

    public static final void doOnAttach(final View doOnAttach, final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(doOnAttach, "$this$doOnAttach");
        Intrinsics.checkNotNullParameter(action, "action");
        if (ViewCompat.isAttachedToWindow(doOnAttach)) {
            action.invoke(doOnAttach);
        } else {
            doOnAttach.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    doOnAttach.removeOnAttachStateChangeListener(this);
                    action.invoke(view);
                }
            });
        }
    }

    public static final void doOnDetach(final View doOnDetach, final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(doOnDetach, "$this$doOnDetach");
        Intrinsics.checkNotNullParameter(action, "action");
        if (!ViewCompat.isAttachedToWindow(doOnDetach)) {
            action.invoke(doOnDetach);
        } else {
            doOnDetach.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    doOnDetach.removeOnAttachStateChangeListener(this);
                    action.invoke(view);
                }
            });
        }
    }

    public static /* synthetic */ void updatePaddingRelative$default(View updatePaddingRelative, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = updatePaddingRelative.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = updatePaddingRelative.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = updatePaddingRelative.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = updatePaddingRelative.getPaddingBottom();
        }
        Intrinsics.checkNotNullParameter(updatePaddingRelative, "$this$updatePaddingRelative");
        updatePaddingRelative.setPaddingRelative(i, i2, i3, i4);
    }

    public static final void updatePaddingRelative(View updatePaddingRelative, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(updatePaddingRelative, "$this$updatePaddingRelative");
        updatePaddingRelative.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePadding$default(View updatePadding, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = updatePadding.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = updatePadding.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = updatePadding.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = updatePadding.getPaddingBottom();
        }
        Intrinsics.checkNotNullParameter(updatePadding, "$this$updatePadding");
        updatePadding.setPadding(i, i2, i3, i4);
    }

    public static final void updatePadding(View updatePadding, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(updatePadding, "$this$updatePadding");
        updatePadding.setPadding(i, i2, i3, i4);
    }

    public static final void setPadding(View setPadding, int i) {
        Intrinsics.checkNotNullParameter(setPadding, "$this$setPadding");
        setPadding.setPadding(i, i, i, i);
    }

    public static final Runnable postDelayed(View postDelayed, long j, final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(postDelayed, "$this$postDelayed");
        Intrinsics.checkNotNullParameter(action, "action");
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        };
        postDelayed.postDelayed(runnable, j);
        return runnable;
    }

    public static final Runnable postOnAnimationDelayed(View postOnAnimationDelayed, long j, final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(postOnAnimationDelayed, "$this$postOnAnimationDelayed");
        Intrinsics.checkNotNullParameter(action, "action");
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postOnAnimationDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        };
        postOnAnimationDelayed.postOnAnimationDelayed(runnable, j);
        return runnable;
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final Bitmap drawToBitmap(View drawToBitmap, Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(drawToBitmap, "$this$drawToBitmap");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!ViewCompat.isLaidOut(drawToBitmap)) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawToBitmap.getWidth(), drawToBitmap.getHeight(), config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "Bitmap.createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-drawToBitmap.getScrollX(), -drawToBitmap.getScrollY());
        drawToBitmap.draw(canvas);
        return createBitmap;
    }

    public static final boolean isVisible(View isVisible) {
        Intrinsics.checkNotNullParameter(isVisible, "$this$isVisible");
        return isVisible.getVisibility() == 0;
    }

    public static final void setVisible(View isVisible, boolean z) {
        Intrinsics.checkNotNullParameter(isVisible, "$this$isVisible");
        isVisible.setVisibility(z ? 0 : 8);
    }

    public static final boolean isInvisible(View isInvisible) {
        Intrinsics.checkNotNullParameter(isInvisible, "$this$isInvisible");
        return isInvisible.getVisibility() == 4;
    }

    public static final void setInvisible(View isInvisible, boolean z) {
        Intrinsics.checkNotNullParameter(isInvisible, "$this$isInvisible");
        isInvisible.setVisibility(z ? 4 : 0);
    }

    public static final boolean isGone(View isGone) {
        Intrinsics.checkNotNullParameter(isGone, "$this$isGone");
        return isGone.getVisibility() == 8;
    }

    public static final void setGone(View isGone, boolean z) {
        Intrinsics.checkNotNullParameter(isGone, "$this$isGone");
        isGone.setVisibility(z ? 8 : 0);
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View updateLayoutParams, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(updateLayoutParams, "$this$updateLayoutParams");
        Intrinsics.checkNotNullParameter(block, "block");
        ViewGroup.LayoutParams layoutParams = updateLayoutParams.getLayoutParams();
        Intrinsics.reifiedOperationMarker(1, "T");
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        block.invoke(layoutParams2);
        updateLayoutParams.setLayoutParams(layoutParams2);
    }

    public static final int getMarginLeft(View marginLeft) {
        Intrinsics.checkNotNullParameter(marginLeft, "$this$marginLeft");
        ViewGroup.LayoutParams layoutParams = marginLeft.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginTop(View marginTop) {
        Intrinsics.checkNotNullParameter(marginTop, "$this$marginTop");
        ViewGroup.LayoutParams layoutParams = marginTop.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View marginRight) {
        Intrinsics.checkNotNullParameter(marginRight, "$this$marginRight");
        ViewGroup.LayoutParams layoutParams = marginRight.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginBottom(View marginBottom) {
        Intrinsics.checkNotNullParameter(marginBottom, "$this$marginBottom");
        ViewGroup.LayoutParams layoutParams = marginBottom.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View marginStart) {
        Intrinsics.checkNotNullParameter(marginStart, "$this$marginStart");
        ViewGroup.LayoutParams layoutParams = marginStart.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginEnd(View marginEnd) {
        Intrinsics.checkNotNullParameter(marginEnd, "$this$marginEnd");
        ViewGroup.LayoutParams layoutParams = marginEnd.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final Sequence<ViewParent> getAncestors(View ancestors) {
        Intrinsics.checkNotNullParameter(ancestors, "$this$ancestors");
        return SequencesKt.generateSequence(ancestors.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    public static final Sequence<View> getAllViews(View allViews) {
        Intrinsics.checkNotNullParameter(allViews, "$this$allViews");
        return SequencesKt.sequence(new ViewKt$allViews$1(allViews, null));
    }

    public static final void updateLayoutParams(View updateLayoutParams, Function1<? super ViewGroup.LayoutParams, Unit> block) {
        Intrinsics.checkNotNullParameter(updateLayoutParams, "$this$updateLayoutParams");
        Intrinsics.checkNotNullParameter(block, "block");
        ViewGroup.LayoutParams layoutParams = updateLayoutParams.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        block.invoke(layoutParams);
        updateLayoutParams.setLayoutParams(layoutParams);
    }
}
