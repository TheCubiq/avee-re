.class public Lcom/daaw/gv1$a;
.super Lcom/daaw/jn1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/gv1;->l0(Landroid/view/ViewGroup;Lcom/daaw/on1;ILcom/daaw/on1;I)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lcom/daaw/gv1;


# direct methods
.method public constructor <init>(Lcom/daaw/gv1;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gv1$a;->d:Lcom/daaw/gv1;

    iput-object p2, p0, Lcom/daaw/gv1$a;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/daaw/gv1$a;->b:Landroid/view/View;

    iput-object p4, p0, Lcom/daaw/gv1$a;->c:Landroid/view/View;

    invoke-direct {p0}, Lcom/daaw/jn1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/in1;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/gv1$a;->c:Landroid/view/View;

    sget v1, Lcom/daaw/v11;->a:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/daaw/gv1$a;->a:Landroid/view/ViewGroup;

    invoke-static {v0}, Lcom/daaw/et1;->a(Landroid/view/ViewGroup;)Lcom/daaw/dt1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/gv1$a;->b:Landroid/view/View;

    invoke-interface {v0, v1}, Lcom/daaw/dt1;->d(Landroid/view/View;)V

    invoke-virtual {p1, p0}, Lcom/daaw/in1;->T(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    return-void
.end method

.method public b(Lcom/daaw/in1;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/gv1$a;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, Lcom/daaw/et1;->a(Landroid/view/ViewGroup;)Lcom/daaw/dt1;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/gv1$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/daaw/dt1;->d(Landroid/view/View;)V

    return-void
.end method

.method public e(Lcom/daaw/in1;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/gv1$a;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/gv1$a;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, Lcom/daaw/et1;->a(Landroid/view/ViewGroup;)Lcom/daaw/dt1;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/gv1$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/daaw/dt1;->c(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/gv1$a;->d:Lcom/daaw/gv1;

    invoke-virtual {p1}, Lcom/daaw/in1;->f()V

    :goto_0
    return-void
.end method
