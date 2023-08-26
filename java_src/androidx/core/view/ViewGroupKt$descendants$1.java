package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewGroup.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 1})
@DebugMetadata(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {97, 99}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes.dex */
public final class ViewGroupKt$descendants$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewGroup $this_descendants;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.$this_descendants = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, completion);
        viewGroupKt$descendants$1.L$0 = obj;
        return viewGroupKt$descendants$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super View> sequenceScope, Continuation<? super Unit> continuation) {
        return ((ViewGroupKt$descendants$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008e -> B:22:0x0090). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0097 -> B:24:0x009b). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        ViewGroup viewGroup;
        int i;
        int childCount;
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1;
        ViewGroupKt$descendants$1 viewGroupKt$descendants$12;
        SequenceScope sequenceScope2;
        ViewGroup viewGroup2;
        View view;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            viewGroup = this.$this_descendants;
            i = 0;
            childCount = viewGroup.getChildCount();
            viewGroupKt$descendants$1 = this;
            if (i >= childCount) {
            }
        } else if (i3 == 1) {
            i2 = this.I$1;
            i = this.I$0;
            view = (View) this.L$2;
            viewGroup2 = (ViewGroup) this.L$1;
            sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            viewGroupKt$descendants$12 = this;
            if (view instanceof ViewGroup) {
            }
        } else if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i2 = this.I$1;
            i = this.I$0;
            ViewGroup viewGroup3 = (ViewGroup) this.L$1;
            SequenceScope sequenceScope3 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            viewGroupKt$descendants$12 = this;
            SequenceScope sequenceScope4 = sequenceScope3;
            viewGroupKt$descendants$1 = viewGroupKt$descendants$12;
            sequenceScope = sequenceScope4;
            ViewGroup viewGroup4 = viewGroup3;
            childCount = i2;
            viewGroup = viewGroup4;
            i++;
            if (i >= childCount) {
                View childAt = viewGroup.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
                viewGroupKt$descendants$1.L$0 = sequenceScope;
                viewGroupKt$descendants$1.L$1 = viewGroup;
                viewGroupKt$descendants$1.L$2 = childAt;
                viewGroupKt$descendants$1.I$0 = i;
                viewGroupKt$descendants$1.I$1 = childCount;
                viewGroupKt$descendants$1.label = 1;
                if (sequenceScope.yield(childAt, viewGroupKt$descendants$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sequenceScope2 = sequenceScope;
                viewGroupKt$descendants$12 = viewGroupKt$descendants$1;
                viewGroup2 = viewGroup;
                i2 = childCount;
                view = childAt;
                if (view instanceof ViewGroup) {
                    childCount = i2;
                    viewGroup = viewGroup2;
                    viewGroupKt$descendants$1 = viewGroupKt$descendants$12;
                    sequenceScope = sequenceScope2;
                    i++;
                    if (i >= childCount) {
                    }
                } else {
                    Sequence<View> descendants = ViewGroupKt.getDescendants((ViewGroup) view);
                    viewGroupKt$descendants$12.L$0 = sequenceScope2;
                    viewGroupKt$descendants$12.L$1 = viewGroup2;
                    viewGroupKt$descendants$12.L$2 = null;
                    viewGroupKt$descendants$12.I$0 = i;
                    viewGroupKt$descendants$12.I$1 = i2;
                    viewGroupKt$descendants$12.label = 2;
                    if (sequenceScope2.yieldAll(descendants, viewGroupKt$descendants$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    viewGroup3 = viewGroup2;
                    sequenceScope3 = sequenceScope2;
                    SequenceScope sequenceScope42 = sequenceScope3;
                    viewGroupKt$descendants$1 = viewGroupKt$descendants$12;
                    sequenceScope = sequenceScope42;
                    ViewGroup viewGroup42 = viewGroup3;
                    childCount = i2;
                    viewGroup = viewGroup42;
                    i++;
                    if (i >= childCount) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }
}
