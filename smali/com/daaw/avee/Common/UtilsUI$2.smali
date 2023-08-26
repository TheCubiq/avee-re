.class final Lcom/daaw/avee/Common/UtilsUI$2;
.super Ljava/lang/Object;
.source "UtilsUI.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Common/UtilsUI;->animShowCustom255(Landroid/animation/ValueAnimator;Lcom/daaw/avee/Common/Action1;IJ)Landroid/animation/ValueAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$updateAction:Lcom/daaw/avee/Common/Action1;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Common/Action1;)V
    .locals 0

    .line 426
    iput-object p1, p0, Lcom/daaw/avee/Common/UtilsUI$2;->val$updateAction:Lcom/daaw/avee/Common/Action1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 429
    iget-object v0, p0, Lcom/daaw/avee/Common/UtilsUI$2;->val$updateAction:Lcom/daaw/avee/Common/Action1;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-interface {v0, p1}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    return-void
.end method
