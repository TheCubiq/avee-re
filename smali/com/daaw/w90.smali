.class public Lcom/daaw/w90;
.super Lcom/daaw/qa;
.source ""


# instance fields
.field public final B:[Landroid/widget/ImageView;

.field public final C:I

.field public final D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 11

    invoke-static {p1}, Lcom/daaw/gr1;->p(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0081

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/daaw/qa;-><init>(Landroid/view/View;)V

    const/4 p2, 0x7

    new-array v0, p2, [Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/daaw/w90;->B:[Landroid/widget/ImageView;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/daaw/w90;->D:Ljava/util/List;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    const v3, 0x7f0400e9

    invoke-static {v1, v3}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v3

    iput v3, p0, Lcom/daaw/w90;->C:I

    new-array v3, p2, [Landroid/widget/TextView;

    const v4, 0x7f0902c5

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    aput-object v4, v3, v2

    const v4, 0x7f0902c7

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/4 v5, 0x1

    aput-object v4, v3, v5

    const v4, 0x7f0902c8

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/4 v6, 0x2

    aput-object v4, v3, v6

    const v4, 0x7f0902c9

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/4 v7, 0x3

    aput-object v4, v3, v7

    const v4, 0x7f0902ca

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/4 v8, 0x4

    aput-object v4, v3, v8

    const v4, 0x7f0902cb

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    const/4 v10, 0x5

    aput-object v9, v3, v10

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/4 v9, 0x6

    aput-object v4, v3, v9

    const v4, 0x7f09007a

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    aput-object v4, v0, v7

    const v4, 0x7f09007b

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    aput-object v4, v0, v8

    const v4, 0x7f09007c

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    aput-object v4, v0, v10

    const v4, 0x7f09007d

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    aput-object v4, v0, v9

    invoke-static {v3, p1}, Lcom/daaw/qa;->P([Landroid/widget/TextView;Landroid/content/Context;)V

    new-array p1, p2, [Landroid/view/View;

    const p2, 0x7f090143

    invoke-virtual {v1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    aput-object p2, p1, v2

    const p2, 0x7f090144

    invoke-virtual {v1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    aput-object p2, p1, v5

    const p2, 0x7f090145

    invoke-virtual {v1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    aput-object p2, p1, v6

    const p2, 0x7f090146

    invoke-virtual {v1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    aput-object p2, p1, v7

    const p2, 0x7f090147

    invoke-virtual {v1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    aput-object p2, p1, v8

    const p2, 0x7f090148

    invoke-virtual {v1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    aput-object p2, p1, v10

    const p2, 0x7f090149

    invoke-virtual {v1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    aput-object p2, p1, v9

    aget-object p2, p1, v2

    sget-object v0, Lcom/daaw/r90;->p:Lcom/daaw/r90;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object p2, p1, v5

    sget-object v0, Lcom/daaw/p90;->p:Lcom/daaw/p90;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object p2, p1, v5

    sget-object v0, Lcom/daaw/t90;->p:Lcom/daaw/t90;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    aget-object p2, p1, v6

    sget-object v0, Lcom/daaw/o90;->p:Lcom/daaw/o90;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object p2, p1, v7

    sget-object v0, Lcom/daaw/q90;->p:Lcom/daaw/q90;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object p2, p1, v8

    sget-object v0, Lcom/daaw/s90;->p:Lcom/daaw/s90;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object p2, p1, v10

    sget-object v0, Lcom/daaw/n90;->p:Lcom/daaw/n90;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object p1, p1, v9

    sget-object p2, Lcom/daaw/l90;->p:Lcom/daaw/l90;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic Q(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/w90;->f0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic R(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/w90;->e0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic S(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/w90;->b0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic T(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/w90;->Z(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic U(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/w90;->c0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic V(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/w90;->Y(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic W(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Lcom/daaw/w90;->a0(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/w90;->d0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic Y(Landroid/view/View;)V
    .locals 3

    sget-object v0, Lcom/daaw/qa;->y:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    const/16 v2, 0x6e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Z(Landroid/view/View;)V
    .locals 3

    sget-object v0, Lcom/daaw/qa;->y:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    const/16 v2, 0x6f

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a0(Landroid/view/View;)Z
    .locals 3

    sget-object v0, Lcom/daaw/qa;->y:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    const/16 v2, 0x456

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic b0(Landroid/view/View;)V
    .locals 3

    sget-object v0, Lcom/daaw/qa;->y:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    const/16 v2, 0x70

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c0(Landroid/view/View;)V
    .locals 3

    sget-object v0, Lcom/daaw/qa;->y:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    const/16 v2, 0x71

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d0(Landroid/view/View;)V
    .locals 3

    sget-object v0, Lcom/daaw/qa;->y:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    const/16 v2, 0x72

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e0(Landroid/view/View;)V
    .locals 3

    sget-object v0, Lcom/daaw/qa;->y:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    const/16 v2, 0x73

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f0(Landroid/view/View;)V
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
    .locals 2

    invoke-super {p0, p1, p2}, Lcom/daaw/ma;->O(Lcom/daaw/wc0;I)V

    iget-object p2, p0, Lcom/daaw/w90;->D:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    invoke-interface {p1}, Lcom/daaw/wc0;->w()Lcom/daaw/wc0$b;

    move-result-object p2

    new-instance v0, Lcom/daaw/m90;

    invoke-direct {v0, p0}, Lcom/daaw/m90;-><init>(Lcom/daaw/w90;)V

    iget-object v1, p0, Lcom/daaw/w90;->D:Ljava/util/List;

    invoke-interface {p2, v0, v1}, Lcom/daaw/wc0$b;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    invoke-interface {p1}, Lcom/daaw/wc0;->w()Lcom/daaw/wc0$b;

    move-result-object p2

    new-instance v0, Lcom/daaw/u90;

    invoke-direct {v0, p0}, Lcom/daaw/u90;-><init>(Lcom/daaw/w90;)V

    iget-object v1, p0, Lcom/daaw/w90;->D:Ljava/util/List;

    invoke-interface {p2, v0, v1}, Lcom/daaw/wc0$b;->e(Lcom/daaw/qw1$a;Ljava/util/List;)V

    invoke-interface {p1}, Lcom/daaw/wc0;->w()Lcom/daaw/wc0$b;

    move-result-object p2

    new-instance v0, Lcom/daaw/v90;

    invoke-direct {v0, p0}, Lcom/daaw/v90;-><init>(Lcom/daaw/w90;)V

    iget-object v1, p0, Lcom/daaw/w90;->D:Ljava/util/List;

    invoke-interface {p2, v0, v1}, Lcom/daaw/wc0$b;->g(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object p2, Lcom/daaw/qa;->u:Lcom/daaw/vw1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1}, Lcom/daaw/wc0;->b()Z

    move-result v0

    invoke-virtual {p0, p2}, Lcom/daaw/w90;->g0(Z)V

    invoke-virtual {p0, v0}, Lcom/daaw/w90;->h0(Z)V

    invoke-interface {p1}, Lcom/daaw/wc0;->w()Lcom/daaw/wc0$b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/daaw/wc0$b;->c()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/w90;->i0(I)V

    :cond_0
    return-void
.end method

.method public g0(Z)V
    .locals 2

    const/4 v0, 0x4

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/w90;->B:[Landroid/widget/ImageView;

    aget-object v1, p1, v0

    aget-object p1, p1, v0

    const v0, 0x7f0400eb

    invoke-static {p1, v0}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/w90;->B:[Landroid/widget/ImageView;

    aget-object p1, p1, v0

    iget v0, p0, Lcom/daaw/w90;->C:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    :goto_0
    return-void
.end method

.method public h0(Z)V
    .locals 2

    const/4 v0, 0x5

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/w90;->B:[Landroid/widget/ImageView;

    aget-object v1, p1, v0

    aget-object p1, p1, v0

    const v0, 0x7f0400eb

    invoke-static {p1, v0}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/w90;->B:[Landroid/widget/ImageView;

    aget-object p1, p1, v0

    iget v0, p0, Lcom/daaw/w90;->C:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    :goto_0
    return-void
.end method

.method public i0(I)V
    .locals 2

    const/4 v0, 0x3

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/w90;->B:[Landroid/widget/ImageView;

    aget-object v1, p1, v0

    aget-object p1, p1, v0

    const v0, 0x7f0400eb

    invoke-static {p1, v0}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/w90;->B:[Landroid/widget/ImageView;

    aget-object p1, p1, v0

    iget v0, p0, Lcom/daaw/w90;->C:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    :goto_0
    return-void
.end method
