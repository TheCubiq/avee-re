.class public Lcom/daaw/xn;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/xn$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Landroidx/recyclerview/widget/RecyclerView$c0;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:Landroid/content/Context;

.field public d:Z

.field public e:I

.field public f:Lcom/daaw/wn;

.field public g:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/daaw/xn$d;",
            ">;"
        }
    .end annotation
.end field

.field public h:I

.field public i:Lcom/daaw/wn$d;

.field public final j:Lcom/daaw/w40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/w40<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;IILcom/daaw/wn;Lcom/daaw/w40;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "II",
            "Lcom/daaw/wn;",
            "Lcom/daaw/w40<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    const/4 p3, 0x1

    iput-boolean p3, p0, Lcom/daaw/xn;->d:Z

    new-instance p3, Landroid/util/SparseArray;

    invoke-direct {p3}, Landroid/util/SparseArray;-><init>()V

    iput-object p3, p0, Lcom/daaw/xn;->g:Landroid/util/SparseArray;

    const/4 p3, -0x1

    iput p3, p0, Lcom/daaw/xn;->h:I

    iput p2, p0, Lcom/daaw/xn;->e:I

    iput-object p4, p0, Lcom/daaw/xn;->f:Lcom/daaw/wn;

    iput-object p1, p0, Lcom/daaw/xn;->c:Landroid/content/Context;

    iput-object p5, p0, Lcom/daaw/xn;->j:Lcom/daaw/w40;

    new-instance p1, Lcom/daaw/xn$a;

    invoke-direct {p1, p0}, Lcom/daaw/xn$a;-><init>(Lcom/daaw/xn;)V

    invoke-virtual {p4, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->u(Landroidx/recyclerview/widget/RecyclerView$i;)V

    return-void
.end method

.method public static synthetic A(Lcom/daaw/xn;)Lcom/daaw/wn$d;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xn;->i:Lcom/daaw/wn$d;

    return-object p0
.end method

.method public static synthetic y(Lcom/daaw/xn;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/xn;->d:Z

    return p1
.end method

.method public static synthetic z(Lcom/daaw/xn;)Lcom/daaw/wn;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xn;->f:Lcom/daaw/wn;

    return-object p0
.end method


# virtual methods
.method public B(ILcom/daaw/lo1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/lo1<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/xn;->f:Lcom/daaw/wn;

    invoke-virtual {p0, p1}, Lcom/daaw/xn;->D(I)I

    move-result v1

    invoke-virtual {v0, v1, p2}, Lcom/daaw/wn;->D(ILcom/daaw/lo1;)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->j(I)V

    return-void
.end method

.method public C(I)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/xn;->g:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public D(I)I
    .locals 3

    invoke-virtual {p0, p1}, Lcom/daaw/xn;->C(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/xn;->g:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lcom/daaw/xn;->g:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/xn$d;

    iget v2, v2, Lcom/daaw/xn$d;->b:I

    if-le v2, p1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    add-int/2addr p1, v1

    return p1
.end method

.method public E(Lcom/daaw/wn$d;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xn;->i:Lcom/daaw/wn$d;

    return-void
.end method

.method public F(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/xn$d;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/xn;->g:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xn$d;

    iget v2, v1, Lcom/daaw/xn$d;->a:I

    add-int/2addr v2, v0

    iput v2, v1, Lcom/daaw/xn$d;->b:I

    iget-object v3, p0, Lcom/daaw/xn;->g:Landroid/util/SparseArray;

    invoke-virtual {v3, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->i()V

    return-void
.end method

.method public G(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/xn;->H(ILandroid/view/View;)V

    return-void
.end method

.method public H(ILandroid/view/View;)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/daaw/xn;->C(I)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/xn;->f:Lcom/daaw/wn;

    invoke-virtual {v0, v2, v1}, Lcom/daaw/wn;->G(ILandroid/view/View;)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/xn;->x(ILandroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2, v1}, Lcom/daaw/xn;->x(ILandroid/view/View;)V

    iget-object v0, p0, Lcom/daaw/xn;->f:Lcom/daaw/wn;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/wn;->G(ILandroid/view/View;)V

    :goto_0
    return-void
.end method

.method public d()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/xn;->f:Lcom/daaw/wn;

    invoke-virtual {v0}, Lcom/daaw/wn;->d()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/xn;->g:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public e(I)J
    .locals 2

    invoke-virtual {p0, p1}, Lcom/daaw/xn;->C(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7fffffff

    iget-object v1, p0, Lcom/daaw/xn;->g:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result p1

    sub-int/2addr v0, p1

    int-to-long v0, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/xn;->f:Lcom/daaw/wn;

    invoke-virtual {p0, p1}, Lcom/daaw/xn;->D(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->e(I)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public f(I)I
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/xn;->C(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/xn;->f:Lcom/daaw/wn;

    invoke-virtual {p0, p1}, Lcom/daaw/xn;->D(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->f(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    :goto_0
    return p1
.end method

.method public m(Landroidx/recyclerview/widget/RecyclerView$c0;I)V
    .locals 2

    invoke-virtual {p0, p2}, Lcom/daaw/xn;->C(I)Z

    move-result v0

    if-eqz v0, :cond_2

    check-cast p1, Lcom/daaw/yn;

    invoke-virtual {p1}, Lcom/daaw/yn;->P()V

    iget-object v0, p1, Lcom/daaw/yn;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/daaw/xn;->g:Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/xn$d;

    iget-object p2, p2, Lcom/daaw/xn$d;->c:Ljava/lang/CharSequence;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string p2, ""

    invoke-virtual {p1, p2}, Lcom/daaw/yn;->R(Ljava/lang/CharSequence;)V

    iget-object p2, p1, Lcom/daaw/yn;->x:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/daaw/xn;->j:Lcom/daaw/w40;

    invoke-interface {v0}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    new-instance v0, Lcom/daaw/xn$b;

    invoke-direct {v0, p0, p1}, Lcom/daaw/xn$b;-><init>(Lcom/daaw/xn;Lcom/daaw/yn;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p1, Lcom/daaw/yn;->w:Landroid/widget/ImageButton;

    new-instance v0, Lcom/daaw/xn$c;

    invoke-direct {v0, p0, p1}, Lcom/daaw/xn$c;-><init>(Lcom/daaw/xn;Lcom/daaw/yn;)V

    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    iget p1, p1, Lcom/daaw/yn;->y:I

    iget v0, p0, Lcom/daaw/xn;->h:I

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {p2, v1}, Landroid/view/View;->setSelected(Z)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/daaw/xn;->f:Lcom/daaw/wn;

    check-cast p1, Lcom/daaw/yn;

    invoke-virtual {p0, p2}, Lcom/daaw/xn;->D(I)I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/daaw/wn;->z(Lcom/daaw/yn;I)V

    :goto_1
    return-void
.end method

.method public o(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$c0;
    .locals 2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/daaw/xn;->c:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    iget v0, p0, Lcom/daaw/xn;->e:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/daaw/yn;

    invoke-direct {p2, p1}, Lcom/daaw/yn;-><init>(Landroid/view/View;)V

    return-object p2

    :cond_0
    iget-object v0, p0, Lcom/daaw/xn;->f:Lcom/daaw/wn;

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/wn;->A(Landroid/view/ViewGroup;I)Lcom/daaw/yn;

    move-result-object p1

    return-object p1
.end method

.method public final x(ILandroid/view/View;)V
    .locals 1

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    :cond_0
    iget p2, p0, Lcom/daaw/xn;->h:I

    if-ltz p2, :cond_1

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->j(I)V

    :cond_1
    :goto_0
    iput p1, p0, Lcom/daaw/xn;->h:I

    if-ltz p1, :cond_2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->j(I)V

    :cond_2
    return-void
.end method
