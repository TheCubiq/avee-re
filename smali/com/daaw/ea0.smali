.class public Lcom/daaw/ea0;
.super Lcom/daaw/qa;
.source ""


# instance fields
.field public final B:[Landroid/widget/ImageView;

.field public final C:[Landroid/view/View;

.field public final D:I

.field public final E:Ljava/util/List;
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
    .locals 9

    invoke-static {p1}, Lcom/daaw/gr1;->p(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0082

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    invoke-direct {p0, p2, v2}, Lcom/daaw/qa;-><init>(Landroid/view/View;Z)V

    const/4 p2, 0x5

    new-array v0, p2, [Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/daaw/ea0;->B:[Landroid/widget/ImageView;

    new-array v1, p2, [Landroid/view/View;

    iput-object v1, p0, Lcom/daaw/ea0;->C:[Landroid/view/View;

    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    iput-object v3, p0, Lcom/daaw/ea0;->E:Ljava/util/List;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    const v4, 0x7f0400e9

    invoke-static {v3, v4}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v4

    iput v4, p0, Lcom/daaw/ea0;->D:I

    new-array p2, p2, [Landroid/widget/TextView;

    const v4, 0x7f0902c5

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    aput-object v4, p2, v2

    const v4, 0x7f0902c7

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/4 v5, 0x1

    aput-object v4, p2, v5

    const v4, 0x7f0902ca

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/4 v6, 0x2

    aput-object v4, p2, v6

    const v4, 0x7f0902cb

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/4 v7, 0x3

    aput-object v4, p2, v7

    const v4, 0x7f0902cc

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/4 v8, 0x4

    aput-object v4, p2, v8

    const v4, 0x7f09007c

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    aput-object v4, v0, v7

    invoke-static {p2, p1}, Lcom/daaw/qa;->P([Landroid/widget/TextView;Landroid/content/Context;)V

    const p1, 0x7f090143

    invoke-virtual {v3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    aput-object p1, v1, v2

    const p1, 0x7f090144

    invoke-virtual {v3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    aput-object p1, v1, v5

    const p1, 0x7f090147

    invoke-virtual {v3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    aput-object p1, v1, v6

    const p1, 0x7f090148

    invoke-virtual {v3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    aput-object p1, v1, v7

    const p1, 0x7f090149

    invoke-virtual {v3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    aput-object p1, v1, v8

    return-void
.end method

.method public static synthetic Q(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/ea0;->a0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic R(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/ea0;->b0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic S(Lcom/daaw/wc0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/ea0;->Y(Lcom/daaw/wc0;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic T(Lcom/daaw/wc0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/ea0;->X(Lcom/daaw/wc0;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic U(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/ea0;->Z(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic V(Lcom/daaw/ea0;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/ea0;->W(Ljava/lang/Boolean;)V

    return-void
.end method

.method private synthetic W(Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/ea0;->c0(Z)V

    return-void
.end method

.method public static synthetic X(Lcom/daaw/wc0;Landroid/view/View;)V
    .locals 1

    new-instance v0, Lcom/daaw/al;

    invoke-direct {v0, p1}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    const/4 p1, 0x0

    invoke-interface {p0, v0, p1}, Lcom/daaw/wc0;->g(Lcom/daaw/al;I)V

    return-void
.end method

.method public static synthetic Y(Lcom/daaw/wc0;Landroid/view/View;)V
    .locals 1

    new-instance v0, Lcom/daaw/al;

    invoke-direct {v0, p1}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    const/4 p1, 0x1

    invoke-interface {p0, v0, p1}, Lcom/daaw/wc0;->g(Lcom/daaw/al;I)V

    return-void
.end method

.method public static synthetic Z(Landroid/view/View;)V
    .locals 2

    sget-object v0, Lcom/daaw/qa;->w:Lcom/daaw/rw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p0}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1, p0}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a0(Landroid/view/View;)V
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

.method public static synthetic b0(Landroid/view/View;)V
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

    iget-object p2, p0, Lcom/daaw/ea0;->E:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    invoke-interface {p1}, Lcom/daaw/wc0;->w()Lcom/daaw/wc0$b;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance v0, Lcom/daaw/da0;

    invoke-direct {v0, p0}, Lcom/daaw/da0;-><init>(Lcom/daaw/ea0;)V

    iget-object v1, p0, Lcom/daaw/ea0;->E:Ljava/util/List;

    invoke-interface {p2, v0, v1}, Lcom/daaw/wc0$b;->g(Lcom/daaw/qw1$a;Ljava/util/List;)V

    :cond_0
    iget-object p2, p0, Lcom/daaw/ea0;->C:[Landroid/view/View;

    const/4 v0, 0x0

    aget-object p2, p2, v0

    new-instance v0, Lcom/daaw/z90;

    invoke-direct {v0, p1}, Lcom/daaw/z90;-><init>(Lcom/daaw/wc0;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/daaw/ea0;->C:[Landroid/view/View;

    const/4 v0, 0x1

    aget-object p2, p2, v0

    new-instance v0, Lcom/daaw/y90;

    invoke-direct {v0, p1}, Lcom/daaw/y90;-><init>(Lcom/daaw/wc0;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/daaw/ea0;->C:[Landroid/view/View;

    const/4 v0, 0x2

    aget-object p2, p2, v0

    sget-object v0, Lcom/daaw/ca0;->p:Lcom/daaw/ca0;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/daaw/ea0;->C:[Landroid/view/View;

    const/4 v0, 0x3

    aget-object p2, p2, v0

    sget-object v0, Lcom/daaw/aa0;->p:Lcom/daaw/aa0;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/daaw/ea0;->C:[Landroid/view/View;

    const/4 v0, 0x4

    aget-object p2, p2, v0

    sget-object v0, Lcom/daaw/ba0;->p:Lcom/daaw/ba0;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-interface {p1}, Lcom/daaw/wc0;->b()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/ea0;->c0(Z)V

    return-void
.end method

.method public c0(Z)V
    .locals 2

    const/4 v0, 0x3

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ea0;->B:[Landroid/widget/ImageView;

    aget-object v1, p1, v0

    aget-object p1, p1, v0

    const v0, 0x7f0400eb

    invoke-static {p1, v0}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/ea0;->B:[Landroid/widget/ImageView;

    aget-object p1, p1, v0

    iget v0, p0, Lcom/daaw/ea0;->D:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    :goto_0
    return-void
.end method
