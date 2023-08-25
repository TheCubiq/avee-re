.class public Lcom/daaw/gr1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/gr1;->e(Landroid/animation/ValueAnimator;Lcom/daaw/e0;IJLcom/daaw/h0;)Landroid/animation/ValueAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/daaw/h0;


# direct methods
.method public constructor <init>(Lcom/daaw/h0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gr1$c;->b:Lcom/daaw/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/gr1$c;->a:Z

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/gr1$c;->a:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-boolean p1, p0, Lcom/daaw/gr1$c;->a:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/gr1$c;->b:Lcom/daaw/h0;

    invoke-interface {p1}, Lcom/daaw/h0;->a()V

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
