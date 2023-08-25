.class public Lcom/daaw/a4$g;
.super Lcom/daaw/xt1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/a4;->b1(Lcom/daaw/n0$a;)Lcom/daaw/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/a4;


# direct methods
.method public constructor <init>(Lcom/daaw/a4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a4$g;->a:Lcom/daaw/a4;

    invoke-direct {p0}, Lcom/daaw/xt1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/a4$g;->a:Lcom/daaw/a4;

    iget-object p1, p1, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Lcom/daaw/a4$g;->a:Lcom/daaw/a4;

    iget-object p1, p1, Lcom/daaw/a4;->P:Lcom/daaw/ut1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/ut1;->h(Lcom/daaw/wt1;)Lcom/daaw/ut1;

    iget-object p1, p0, Lcom/daaw/a4$g;->a:Lcom/daaw/a4;

    iput-object v0, p1, Lcom/daaw/a4;->P:Lcom/daaw/ut1;

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/a4$g;->a:Lcom/daaw/a4;

    iget-object p1, p1, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/a4$g;->a:Lcom/daaw/a4;

    iget-object p1, p1, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/a4$g;->a:Lcom/daaw/a4;

    iget-object p1, p1, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lcom/daaw/xs1;->o0(Landroid/view/View;)V

    :cond_0
    return-void
.end method
