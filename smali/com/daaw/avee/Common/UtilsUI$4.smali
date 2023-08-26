.class final Lcom/daaw/avee/Common/UtilsUI$4;
.super Ljava/lang/Object;
.source "UtilsUI.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Common/UtilsUI;->animHideCustom255(Landroid/animation/ValueAnimator;Lcom/daaw/avee/Common/Action1;IJLcom/daaw/avee/Common/Action;)Landroid/animation/ValueAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field isCanceled:Z

.field final synthetic val$endAction:Lcom/daaw/avee/Common/Action;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Common/Action;)V
    .locals 0

    .line 462
    iput-object p1, p0, Lcom/daaw/avee/Common/UtilsUI$4;->val$endAction:Lcom/daaw/avee/Common/Action;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 464
    iput-boolean p1, p0, Lcom/daaw/avee/Common/UtilsUI$4;->isCanceled:Z

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    .line 478
    iput-boolean p1, p0, Lcom/daaw/avee/Common/UtilsUI$4;->isCanceled:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 473
    iget-boolean p1, p0, Lcom/daaw/avee/Common/UtilsUI$4;->isCanceled:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/avee/Common/UtilsUI$4;->val$endAction:Lcom/daaw/avee/Common/Action;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Action;->onInvoke()V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
