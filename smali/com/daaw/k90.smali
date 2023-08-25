.class public Lcom/daaw/k90;
.super Lcom/daaw/qa;
.source ""


# instance fields
.field public final B:[Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 6

    invoke-static {p1}, Lcom/daaw/gr1;->p(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0080

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/daaw/qa;-><init>(Landroid/view/View;)V

    const/4 p2, 0x3

    new-array v0, p2, [Landroid/view/View;

    iput-object v0, p0, Lcom/daaw/k90;->B:[Landroid/view/View;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    const v3, 0x7f090143

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    aput-object v3, v0, v2

    const v3, 0x7f090144

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v0, v4

    const v3, 0x7f090149

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const/4 v5, 0x2

    aput-object v3, v0, v5

    new-array p2, p2, [Landroid/widget/TextView;

    const v0, 0x7f0902c5

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, p2, v2

    const v0, 0x7f0902c7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, p2, v4

    const v0, 0x7f0902cc

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, p2, v5

    invoke-static {p2, p1}, Lcom/daaw/qa;->P([Landroid/widget/TextView;Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic Q(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/k90;->U(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic R(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/k90;->T(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic S(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/k90;->V(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic T(Landroid/view/View;)V
    .locals 2

    sget-object v0, Lcom/daaw/qa;->A:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    const/4 p0, 0x0

    invoke-virtual {v0, p0, p0, v1}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic U(Landroid/view/View;)V
    .locals 2

    sget-object v0, Lcom/daaw/qa;->z:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic V(Landroid/view/View;)V
    .locals 3

    sget-object v0, Lcom/daaw/qa;->y:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    const/16 v2, 0x7d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public O(Lcom/daaw/wc0;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/ma;->O(Lcom/daaw/wc0;I)V

    iget-object p1, p0, Lcom/daaw/k90;->B:[Landroid/view/View;

    const/4 p2, 0x0

    aget-object p1, p1, p2

    sget-object p2, Lcom/daaw/i90;->p:Lcom/daaw/i90;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/daaw/k90;->B:[Landroid/view/View;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    sget-object p2, Lcom/daaw/h90;->p:Lcom/daaw/h90;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/daaw/k90;->B:[Landroid/view/View;

    const/4 p2, 0x2

    aget-object p1, p1, p2

    sget-object p2, Lcom/daaw/j90;->p:Lcom/daaw/j90;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
