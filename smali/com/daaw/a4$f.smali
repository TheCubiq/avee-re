.class public Lcom/daaw/a4$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/a4;->b1(Lcom/daaw/n0$a;)Lcom/daaw/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/a4;


# direct methods
.method public constructor <init>(Lcom/daaw/a4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    iget-object v1, v0, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    iget-object v0, v0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v2, 0x37

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v0, p0, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    invoke-virtual {v0}, Lcom/daaw/a4;->o0()V

    iget-object v0, p0, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    invoke-virtual {v0}, Lcom/daaw/a4;->Z0()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    iget-object v0, v0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v0, p0, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    iget-object v2, v0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, Lcom/daaw/xs1;->e(Landroid/view/View;)Lcom/daaw/ut1;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/ut1;->b(F)Lcom/daaw/ut1;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/a4;->P:Lcom/daaw/ut1;

    iget-object v0, p0, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    iget-object v0, v0, Lcom/daaw/a4;->P:Lcom/daaw/ut1;

    new-instance v1, Lcom/daaw/a4$f$a;

    invoke-direct {v1, p0}, Lcom/daaw/a4$f$a;-><init>(Lcom/daaw/a4$f;)V

    invoke-virtual {v0, v1}, Lcom/daaw/ut1;->h(Lcom/daaw/wt1;)Lcom/daaw/ut1;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    iget-object v0, v0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v0, p0, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    iget-object v0, v0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_0
    return-void
.end method
