.class public Lcom/daaw/a4$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/n0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/a4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "j"
.end annotation


# instance fields
.field public a:Lcom/daaw/n0$a;

.field public final synthetic b:Lcom/daaw/a4;


# direct methods
.method public constructor <init>(Lcom/daaw/a4;Lcom/daaw/n0$a;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a4$j;->b:Lcom/daaw/a4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/a4$j;->a:Lcom/daaw/n0$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/n0;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4$j;->b:Lcom/daaw/a4;

    iget-object v0, v0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    invoke-static {v0}, Lcom/daaw/xs1;->o0(Landroid/view/View;)V

    iget-object v0, p0, Lcom/daaw/a4$j;->a:Lcom/daaw/n0$a;

    invoke-interface {v0, p1, p2}, Lcom/daaw/n0$a;->a(Lcom/daaw/n0;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Lcom/daaw/n0;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4$j;->a:Lcom/daaw/n0$a;

    invoke-interface {v0, p1, p2}, Lcom/daaw/n0$a;->b(Lcom/daaw/n0;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public c(Lcom/daaw/n0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/a4$j;->a:Lcom/daaw/n0$a;

    invoke-interface {v0, p1}, Lcom/daaw/n0$a;->c(Lcom/daaw/n0;)V

    iget-object p1, p0, Lcom/daaw/a4$j;->b:Lcom/daaw/a4;

    iget-object v0, p1, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/a4$j;->b:Lcom/daaw/a4;

    iget-object v0, v0, Lcom/daaw/a4;->O:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Lcom/daaw/a4$j;->b:Lcom/daaw/a4;

    iget-object v0, p1, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/a4;->o0()V

    iget-object p1, p0, Lcom/daaw/a4$j;->b:Lcom/daaw/a4;

    iget-object v0, p1, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Lcom/daaw/xs1;->e(Landroid/view/View;)Lcom/daaw/ut1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/ut1;->b(F)Lcom/daaw/ut1;

    move-result-object v0

    iput-object v0, p1, Lcom/daaw/a4;->P:Lcom/daaw/ut1;

    iget-object p1, p0, Lcom/daaw/a4$j;->b:Lcom/daaw/a4;

    iget-object p1, p1, Lcom/daaw/a4;->P:Lcom/daaw/ut1;

    new-instance v0, Lcom/daaw/a4$j$a;

    invoke-direct {v0, p0}, Lcom/daaw/a4$j$a;-><init>(Lcom/daaw/a4$j;)V

    invoke-virtual {p1, v0}, Lcom/daaw/ut1;->h(Lcom/daaw/wt1;)Lcom/daaw/ut1;

    :cond_1
    iget-object p1, p0, Lcom/daaw/a4$j;->b:Lcom/daaw/a4;

    iget-object v0, p1, Lcom/daaw/a4;->E:Lcom/daaw/t3;

    if-eqz v0, :cond_2

    iget-object p1, p1, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    invoke-interface {v0, p1}, Lcom/daaw/t3;->h(Lcom/daaw/n0;)V

    :cond_2
    iget-object p1, p0, Lcom/daaw/a4$j;->b:Lcom/daaw/a4;

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    iget-object p1, p1, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    invoke-static {p1}, Lcom/daaw/xs1;->o0(Landroid/view/View;)V

    return-void
.end method

.method public d(Lcom/daaw/n0;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4$j;->a:Lcom/daaw/n0$a;

    invoke-interface {v0, p1, p2}, Lcom/daaw/n0$a;->d(Lcom/daaw/n0;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
