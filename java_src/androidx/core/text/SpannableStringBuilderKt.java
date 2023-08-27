package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SpannableStringBuilder.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a3\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a3\u0010\b\u001a\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a1\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001aB\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u000f\"\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a)\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a1\u0010\u0012\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0015\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0016\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0017\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0018\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"buildSpannedString", "Landroid/text/SpannedString;", "builderAction", "Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "", "Lkotlin/ExtensionFunctionType;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, TtmlNode.ATTR_TTS_COLOR, "", TtmlNode.BOLD, "inSpans", TtmlNode.TAG_SPAN, "", "spans", "", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", TtmlNode.ITALIC, "scale", "proportion", "", "strikeThrough", "subscript", "superscript", TtmlNode.UNDERLINE, "core-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class SpannableStringBuilderKt {
    public static final SpannedString buildSpannedString(Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        builderAction.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder inSpans, Object[] spans, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(inSpans, "$this$inSpans");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        int length = inSpans.length();
        builderAction.invoke(inSpans);
        for (Object obj : spans) {
            inSpans.setSpan(obj, length, inSpans.length(), 17);
        }
        return inSpans;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder inSpans, Object span, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(inSpans, "$this$inSpans");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        int length = inSpans.length();
        builderAction.invoke(inSpans);
        inSpans.setSpan(span, length, inSpans.length(), 17);
        return inSpans;
    }

    public static final SpannableStringBuilder bold(SpannableStringBuilder bold, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(bold, "$this$bold");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = bold.length();
        builderAction.invoke(bold);
        bold.setSpan(styleSpan, length, bold.length(), 17);
        return bold;
    }

    public static final SpannableStringBuilder italic(SpannableStringBuilder italic, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(italic, "$this$italic");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = italic.length();
        builderAction.invoke(italic);
        italic.setSpan(styleSpan, length, italic.length(), 17);
        return italic;
    }

    public static final SpannableStringBuilder underline(SpannableStringBuilder underline, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(underline, "$this$underline");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = underline.length();
        builderAction.invoke(underline);
        underline.setSpan(underlineSpan, length, underline.length(), 17);
        return underline;
    }

    public static final SpannableStringBuilder color(SpannableStringBuilder color, int i, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(color, "$this$color");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = color.length();
        builderAction.invoke(color);
        color.setSpan(foregroundColorSpan, length, color.length(), 17);
        return color;
    }

    public static final SpannableStringBuilder backgroundColor(SpannableStringBuilder backgroundColor, int i, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(backgroundColor, "$this$backgroundColor");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i);
        int length = backgroundColor.length();
        builderAction.invoke(backgroundColor);
        backgroundColor.setSpan(backgroundColorSpan, length, backgroundColor.length(), 17);
        return backgroundColor;
    }

    public static final SpannableStringBuilder strikeThrough(SpannableStringBuilder strikeThrough, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(strikeThrough, "$this$strikeThrough");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = strikeThrough.length();
        builderAction.invoke(strikeThrough);
        strikeThrough.setSpan(strikethroughSpan, length, strikeThrough.length(), 17);
        return strikeThrough;
    }

    public static final SpannableStringBuilder scale(SpannableStringBuilder scale, float f, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length = scale.length();
        builderAction.invoke(scale);
        scale.setSpan(relativeSizeSpan, length, scale.length(), 17);
        return scale;
    }

    public static final SpannableStringBuilder superscript(SpannableStringBuilder superscript, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(superscript, "$this$superscript");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = superscript.length();
        builderAction.invoke(superscript);
        superscript.setSpan(superscriptSpan, length, superscript.length(), 17);
        return superscript;
    }

    public static final SpannableStringBuilder subscript(SpannableStringBuilder subscript, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(subscript, "$this$subscript");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = subscript.length();
        builderAction.invoke(subscript);
        subscript.setSpan(subscriptSpan, length, subscript.length(), 17);
        return subscript;
    }
}
