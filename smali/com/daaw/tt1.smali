.class public final synthetic Lcom/daaw/tt1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/daaw/yt1;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/yt1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tt1;->a:Lcom/daaw/yt1;

    iput-object p2, p0, Lcom/daaw/tt1;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/tt1;->a:Lcom/daaw/yt1;

    iget-object v1, p0, Lcom/daaw/tt1;->b:Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/daaw/ut1;->a(Lcom/daaw/yt1;Landroid/view/View;Landroid/animation/ValueAnimator;)V

    return-void
.end method
