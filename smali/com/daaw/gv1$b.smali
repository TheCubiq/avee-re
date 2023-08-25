.class public Lcom/daaw/gv1$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""

# interfaces
.implements Lcom/daaw/in1$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gv1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/view/View;

.field public final b:I

.field public final c:Landroid/view/ViewGroup;

.field public final d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Landroid/view/View;IZ)V
    .locals 1

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/gv1$b;->f:Z

    iput-object p1, p0, Lcom/daaw/gv1$b;->a:Landroid/view/View;

    iput p2, p0, Lcom/daaw/gv1$b;->b:I

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/daaw/gv1$b;->c:Landroid/view/ViewGroup;

    iput-boolean p3, p0, Lcom/daaw/gv1$b;->d:Z

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/gv1$b;->g(Z)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/in1;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/gv1$b;->f()V

    invoke-virtual {p1, p0}, Lcom/daaw/in1;->T(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    return-void
.end method

.method public b(Lcom/daaw/in1;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/gv1$b;->g(Z)V

    return-void
.end method

.method public c(Lcom/daaw/in1;)V
    .locals 0

    return-void
.end method

.method public d(Lcom/daaw/in1;)V
    .locals 0

    return-void
.end method

.method public e(Lcom/daaw/in1;)V
    .locals 0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/gv1$b;->g(Z)V

    return-void
.end method

.method public final f()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/gv1$b;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gv1$b;->a:Landroid/view/View;

    iget v1, p0, Lcom/daaw/gv1$b;->b:I

    invoke-static {v0, v1}, Lcom/daaw/gu1;->h(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/daaw/gv1$b;->c:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/gv1$b;->g(Z)V

    return-void
.end method

.method public final g(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/gv1$b;->d:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/gv1$b;->e:Z

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/daaw/gv1$b;->c:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    iput-boolean p1, p0, Lcom/daaw/gv1$b;->e:Z

    invoke-static {v0, p1}, Lcom/daaw/et1;->c(Landroid/view/ViewGroup;Z)V

    :cond_0
    return-void
.end method

.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/gv1$b;->f:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/gv1$b;->f()V

    return-void
.end method

.method public onAnimationPause(Landroid/animation/Animator;)V
    .locals 1

    iget-boolean p1, p0, Lcom/daaw/gv1$b;->f:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/gv1$b;->a:Landroid/view/View;

    iget v0, p0, Lcom/daaw/gv1$b;->b:I

    invoke-static {p1, v0}, Lcom/daaw/gu1;->h(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationResume(Landroid/animation/Animator;)V
    .locals 1

    iget-boolean p1, p0, Lcom/daaw/gv1$b;->f:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/gv1$b;->a:Landroid/view/View;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/gu1;->h(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
