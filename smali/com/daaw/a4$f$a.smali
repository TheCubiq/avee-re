.class public Lcom/daaw/a4$f$a;
.super Lcom/daaw/xt1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/a4$f;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/a4$f;


# direct methods
.method public constructor <init>(Lcom/daaw/a4$f;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a4$f$a;->a:Lcom/daaw/a4$f;

    invoke-direct {p0}, Lcom/daaw/xt1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/a4$f$a;->a:Lcom/daaw/a4$f;

    iget-object p1, p1, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    iget-object p1, p1, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Lcom/daaw/a4$f$a;->a:Lcom/daaw/a4$f;

    iget-object p1, p1, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    iget-object p1, p1, Lcom/daaw/a4;->P:Lcom/daaw/ut1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/ut1;->h(Lcom/daaw/wt1;)Lcom/daaw/ut1;

    iget-object p1, p0, Lcom/daaw/a4$f$a;->a:Lcom/daaw/a4$f;

    iget-object p1, p1, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    iput-object v0, p1, Lcom/daaw/a4;->P:Lcom/daaw/ut1;

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/a4$f$a;->a:Lcom/daaw/a4$f;

    iget-object p1, p1, Lcom/daaw/a4$f;->p:Lcom/daaw/a4;

    iget-object p1, p1, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method
