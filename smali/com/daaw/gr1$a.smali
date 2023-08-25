.class public Lcom/daaw/gr1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/gr1;->f(Landroid/animation/ValueAnimator;Lcom/daaw/e0;IJ)Landroid/animation/ValueAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/e0;


# direct methods
.method public constructor <init>(Lcom/daaw/e0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gr1$a;->a:Lcom/daaw/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gr1$a;->a:Lcom/daaw/e0;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-interface {v0, p1}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    return-void
.end method
