package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
/* compiled from: ViewGroup.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0015\u0010\f\u001a\u00020\r*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\n\u001a3\u0010\u000f\u001a\u00020\u0010*\u00020\u00032!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00100\u0012H\u0086\bø\u0001\u0000\u001aH\u0010\u0015\u001a\u00020\u0010*\u00020\u000326\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00100\u0016H\u0086\bø\u0001\u0000\u001a\u0015\u0010\u0018\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\tH\u0086\u0002\u001a\r\u0010\u0019\u001a\u00020\r*\u00020\u0003H\u0086\b\u001a\r\u0010\u001a\u001a\u00020\r*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c*\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\u001d\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\u001e\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\n\u001a\u0017\u0010\u001f\u001a\u00020\u0010*\u00020 2\b\b\u0001\u0010\b\u001a\u00020\tH\u0086\b\u001a5\u0010!\u001a\u00020\u0010*\u00020 2\b\b\u0003\u0010\"\u001a\u00020\t2\b\b\u0003\u0010#\u001a\u00020\t2\b\b\u0003\u0010$\u001a\u00020\t2\b\b\u0003\u0010%\u001a\u00020\tH\u0086\b\u001a5\u0010&\u001a\u00020\u0010*\u00020 2\b\b\u0003\u0010'\u001a\u00020\t2\b\b\u0003\u0010#\u001a\u00020\t2\b\b\u0003\u0010(\u001a\u00020\t2\b\b\u0003\u0010%\u001a\u00020\tH\u0087\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\t*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "descendants", "getDescendants", "size", "", "getSize", "(Landroid/view/ViewGroup;)I", "contains", "", "view", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "forEachIndexed", "Lkotlin/Function2;", FirebaseAnalytics.Param.INDEX, "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "plusAssign", "setMargins", "Landroid/view/ViewGroup$MarginLayoutParams;", "updateMargins", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "updateMarginsRelative", "start", "end", "core-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class ViewGroupKt {
    public static final View get(ViewGroup get, int i) {
        Intrinsics.checkNotNullParameter(get, "$this$get");
        View childAt = get.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + get.getChildCount());
    }

    public static final boolean contains(ViewGroup contains, View view) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Intrinsics.checkNotNullParameter(view, "view");
        return contains.indexOfChild(view) != -1;
    }

    public static final void plusAssign(ViewGroup plusAssign, View view) {
        Intrinsics.checkNotNullParameter(plusAssign, "$this$plusAssign");
        Intrinsics.checkNotNullParameter(view, "view");
        plusAssign.addView(view);
    }

    public static final void minusAssign(ViewGroup minusAssign, View view) {
        Intrinsics.checkNotNullParameter(minusAssign, "$this$minusAssign");
        Intrinsics.checkNotNullParameter(view, "view");
        minusAssign.removeView(view);
    }

    public static final int getSize(ViewGroup size) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup isEmpty) {
        Intrinsics.checkNotNullParameter(isEmpty, "$this$isEmpty");
        return isEmpty.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(ViewGroup isNotEmpty) {
        Intrinsics.checkNotNullParameter(isNotEmpty, "$this$isNotEmpty");
        return isNotEmpty.getChildCount() != 0;
    }

    public static final void forEach(ViewGroup forEach, Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int childCount = forEach.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = forEach.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            action.invoke(childAt);
        }
    }

    public static final void forEachIndexed(ViewGroup forEachIndexed, Function2<? super Integer, ? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int childCount = forEachIndexed.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Integer valueOf = Integer.valueOf(i);
            View childAt = forEachIndexed.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            action.invoke(valueOf, childAt);
        }
    }

    public static final Iterator<View> iterator(ViewGroup iterator) {
        Intrinsics.checkNotNullParameter(iterator, "$this$iterator");
        return new ViewGroupKt$iterator$1(iterator);
    }

    public static final Sequence<View> getChildren(final ViewGroup children) {
        Intrinsics.checkNotNullParameter(children, "$this$children");
        return new Sequence<View>() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // kotlin.sequences.Sequence
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(children);
            }
        };
    }

    public static final Sequence<View> getDescendants(ViewGroup descendants) {
        Intrinsics.checkNotNullParameter(descendants, "$this$descendants");
        return SequencesKt.sequence(new ViewGroupKt$descendants$1(descendants, null));
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams setMargins, int i) {
        Intrinsics.checkNotNullParameter(setMargins, "$this$setMargins");
        setMargins.setMargins(i, i, i, i);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams updateMargins, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = updateMargins.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = updateMargins.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = updateMargins.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = updateMargins.bottomMargin;
        }
        Intrinsics.checkNotNullParameter(updateMargins, "$this$updateMargins");
        updateMargins.setMargins(i, i2, i3, i4);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams updateMargins, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(updateMargins, "$this$updateMargins");
        updateMargins.setMargins(i, i2, i3, i4);
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams updateMarginsRelative, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = updateMarginsRelative.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = updateMarginsRelative.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = updateMarginsRelative.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = updateMarginsRelative.bottomMargin;
        }
        Intrinsics.checkNotNullParameter(updateMarginsRelative, "$this$updateMarginsRelative");
        updateMarginsRelative.setMarginStart(i);
        updateMarginsRelative.topMargin = i2;
        updateMarginsRelative.setMarginEnd(i3);
        updateMarginsRelative.bottomMargin = i4;
    }

    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams updateMarginsRelative, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(updateMarginsRelative, "$this$updateMarginsRelative");
        updateMarginsRelative.setMarginStart(i);
        updateMarginsRelative.topMargin = i2;
        updateMarginsRelative.setMarginEnd(i3);
        updateMarginsRelative.bottomMargin = i4;
    }
}
