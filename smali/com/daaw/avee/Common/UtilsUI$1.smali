.class final Lcom/daaw/avee/Common/UtilsUI$1;
.super Ljava/lang/Object;
.source "UtilsUI.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Common/UtilsUI;->animHideDrawable(Landroid/graphics/drawable/Drawable;JLcom/daaw/avee/Common/Action;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$endAction:Lcom/daaw/avee/Common/Action;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Common/Action;)V
    .locals 0

    .line 396
    iput-object p1, p0, Lcom/daaw/avee/Common/UtilsUI$1;->val$endAction:Lcom/daaw/avee/Common/Action;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 404
    iget-object p1, p0, Lcom/daaw/avee/Common/UtilsUI$1;->val$endAction:Lcom/daaw/avee/Common/Action;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Action;->onInvoke()V

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
