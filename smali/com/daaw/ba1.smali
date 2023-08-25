.class public Lcom/daaw/ba1;
.super Lcom/daaw/eb;
.source ""

# interfaces
.implements Lcom/daaw/wc0$a;


# instance fields
.field public t:Landroid/widget/ImageButton;

.field public u:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 2

    invoke-static {p1}, Lcom/daaw/gr1;->p(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c00d3

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/eb;-><init>(Landroid/view/View;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    const p2, 0x7f090082

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageButton;

    iput-object p2, p0, Lcom/daaw/ba1;->t:Landroid/widget/ImageButton;

    const p2, 0x7f0902f8

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/daaw/ba1;->u:Landroid/widget/TextView;

    return-void
.end method

.method public static synthetic P(Lcom/daaw/ba1;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ba1;->u:Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public O(Lcom/daaw/wc0;I)V
    .locals 1

    invoke-interface {p1}, Lcom/daaw/wc0;->l()Lcom/daaw/me0;

    move-result-object p2

    new-instance v0, Lcom/daaw/ba1$a;

    invoke-direct {v0, p0}, Lcom/daaw/ba1$a;-><init>(Lcom/daaw/ba1;)V

    invoke-interface {p2, v0}, Lcom/daaw/me0;->a(Lcom/daaw/ir1$b;)V

    invoke-interface {p1}, Lcom/daaw/wc0;->z()Z

    move-result p2

    invoke-virtual {p0, p2}, Lcom/daaw/ba1;->Q(Z)V

    iget-object p2, p0, Lcom/daaw/ba1;->t:Landroid/widget/ImageButton;

    new-instance v0, Lcom/daaw/ba1$b;

    invoke-direct {v0, p0, p1}, Lcom/daaw/ba1$b;-><init>(Lcom/daaw/ba1;Lcom/daaw/wc0;)V

    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public Q(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ba1;->t:Landroid/widget/ImageButton;

    const v0, 0x7f0800fc

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/ba1;->t:Landroid/widget/ImageButton;

    const v0, 0x7f0800e4

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public b(IIZZ)V
    .locals 0

    return-void
.end method
