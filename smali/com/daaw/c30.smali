.class public Lcom/daaw/c30;
.super Lcom/daaw/ma;
.source ""

# interfaces
.implements Lcom/daaw/wc0$a;


# instance fields
.field public A:Z

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Ljava/lang/String;

.field public x:I

.field public y:I

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;I)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/gr1;->p(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    const p3, 0x7f0c0075

    goto :goto_0

    :cond_0
    const p3, 0x7f0c0074

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2, p2}, Lcom/daaw/ma;-><init>(Landroid/view/View;IZ)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/c30;->w:Ljava/lang/String;

    iput v0, p0, Lcom/daaw/c30;->x:I

    iput v0, p0, Lcom/daaw/c30;->y:I

    iput-boolean v0, p0, Lcom/daaw/c30;->z:Z

    iput-boolean v0, p0, Lcom/daaw/c30;->A:Z

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    const p2, 0x7f09029f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/daaw/c30;->u:Landroid/widget/TextView;

    const p2, 0x7f0902a0

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/daaw/c30;->v:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public O(Lcom/daaw/wc0;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/daaw/ma;->O(Lcom/daaw/wc0;I)V

    iget-object p2, p0, Lcom/daaw/c30;->u:Landroid/widget/TextView;

    const-string v0, ""

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lcom/daaw/c30;->v:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lcom/daaw/wc0;->n(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p0}, Lcom/daaw/c30;->P()V

    return-void
.end method

.method public final P()V
    .locals 0

    return-void
.end method

.method public final Q()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/c30;->w:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/daaw/c30;->u:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/daaw/c30;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/c30;->A:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/c30;->u:Landroid/widget/TextView;

    const v2, 0x7f100158

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/daaw/c30;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_2
    iget-boolean v0, p0, Lcom/daaw/c30;->z:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    const v4, 0x7f0e0007

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/c30;->u:Landroid/widget/TextView;

    const v5, 0x7f100241

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    iget v0, p0, Lcom/daaw/c30;->x:I

    if-ltz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/c30;->v:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/daaw/c30;->x:I

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v2

    invoke-virtual {v0, v4, v1, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    iget v0, p0, Lcom/daaw/c30;->x:I

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/daaw/c30;->u:Landroid/widget/TextView;

    const v2, 0x7f1001cf

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/daaw/c30;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/daaw/c30;->v:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/daaw/c30;->x:I

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v2

    invoke-virtual {v0, v4, v1, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/c30;->v:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c30;->w:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/c30;->Q()V

    return-void
.end method

.method public b(IIZZ)V
    .locals 0

    iput p1, p0, Lcom/daaw/c30;->x:I

    iput p2, p0, Lcom/daaw/c30;->y:I

    iput-boolean p3, p0, Lcom/daaw/c30;->z:Z

    iput-boolean p4, p0, Lcom/daaw/c30;->A:Z

    invoke-virtual {p0}, Lcom/daaw/c30;->Q()V

    return-void
.end method
