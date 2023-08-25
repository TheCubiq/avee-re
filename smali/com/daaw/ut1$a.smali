.class public Lcom/daaw/ut1$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ut1;->i(Landroid/view/View;Lcom/daaw/wt1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/wt1;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lcom/daaw/ut1;


# direct methods
.method public constructor <init>(Lcom/daaw/ut1;Lcom/daaw/wt1;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ut1$a;->c:Lcom/daaw/ut1;

    iput-object p2, p0, Lcom/daaw/ut1$a;->a:Lcom/daaw/wt1;

    iput-object p3, p0, Lcom/daaw/ut1$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/ut1$a;->a:Lcom/daaw/wt1;

    iget-object v0, p0, Lcom/daaw/ut1$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/daaw/wt1;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/ut1$a;->a:Lcom/daaw/wt1;

    iget-object v0, p0, Lcom/daaw/ut1$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/daaw/wt1;->b(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/ut1$a;->a:Lcom/daaw/wt1;

    iget-object v0, p0, Lcom/daaw/ut1$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/daaw/wt1;->c(Landroid/view/View;)V

    return-void
.end method
