.class public Lcom/daaw/d30;
.super Lcom/daaw/ma;
.source ""

# interfaces
.implements Lcom/daaw/wc0$a;


# instance fields
.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 2

    invoke-static {p1}, Lcom/daaw/gr1;->p(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c0076

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2, p2}, Lcom/daaw/ma;-><init>(Landroid/view/View;IZ)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/d30;->w:Ljava/lang/String;

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    const p2, 0x7f09029f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/daaw/d30;->u:Landroid/widget/TextView;

    const p2, 0x7f0902a0

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/daaw/d30;->v:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public O(Lcom/daaw/wc0;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/daaw/ma;->O(Lcom/daaw/wc0;I)V

    iget-object p2, p0, Lcom/daaw/d30;->u:Landroid/widget/TextView;

    const-string v0, ""

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lcom/daaw/d30;->v:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lcom/daaw/wc0;->n(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p0}, Lcom/daaw/d30;->P()V

    return-void
.end method

.method public final P()V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/d30;->w:Ljava/lang/String;

    return-void
.end method

.method public b(IIZZ)V
    .locals 3

    const/4 p2, 0x0

    const/4 p4, 0x1

    const v0, 0x7f0e0007

    const-string v1, ""

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/daaw/d30;->u:Landroid/widget/TextView;

    const v2, 0x7f100241

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(I)V

    if-ltz p1, :cond_1

    iget-object p3, p0, Lcom/daaw/d30;->v:Landroid/widget/TextView;

    invoke-virtual {p3}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    new-array p4, p4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p4, p2

    invoke-virtual {p3, v0, p1, p4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/d30;->u:Landroid/widget/TextView;

    const p2, 0x7f1001cf

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/d30;->v:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    iget-object p3, p0, Lcom/daaw/d30;->u:Landroid/widget/TextView;

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p3, p0, Lcom/daaw/d30;->v:Landroid/widget/TextView;

    invoke-virtual {p3}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    new-array p4, p4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p4, p2

    invoke-virtual {p3, v0, p1, p4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/d30;->v:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method
