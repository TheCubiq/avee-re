.class public Lcom/daaw/si;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ts1$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/si$a;,
        Lcom/daaw/si$b;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/oc0;",
            ">;"
        }
    .end annotation
.end field

.field public b:[Lcom/daaw/si$b;

.field public c:[Lcom/daaw/ts1$a;

.field public d:[Lcom/daaw/wc0;

.field public e:[Lcom/daaw/oc0;


# direct methods
.method public constructor <init>([Lcom/daaw/si$b;[Lcom/daaw/ts1$a;[Lcom/daaw/wc0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/si;->a:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/daaw/si;->d:[Lcom/daaw/wc0;

    iput-object p1, p0, Lcom/daaw/si;->b:[Lcom/daaw/si$b;

    iput-object p2, p0, Lcom/daaw/si;->c:[Lcom/daaw/ts1$a;

    array-length p1, p2

    new-array p1, p1, [Lcom/daaw/oc0;

    iput-object p1, p0, Lcom/daaw/si;->e:[Lcom/daaw/oc0;

    const/4 p1, 0x0

    :goto_0
    array-length p3, p2

    if-ge p1, p3, :cond_0

    iget-object p3, p0, Lcom/daaw/si;->e:[Lcom/daaw/oc0;

    new-instance v0, Lcom/daaw/si$a;

    invoke-direct {v0, p0, p1}, Lcom/daaw/si$a;-><init>(Lcom/daaw/si;I)V

    aput-object v0, p3, p1

    aget-object p3, p2, p1

    iget-object v0, p0, Lcom/daaw/si;->e:[Lcom/daaw/oc0;

    aget-object v0, v0, p1

    invoke-interface {p3, v0}, Lcom/daaw/ts1$a;->f(Lcom/daaw/oc0;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/si;->c:[Lcom/daaw/ts1$a;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/daaw/si;->d:[Lcom/daaw/wc0;

    aget-object v2, v2, v0

    invoke-interface {v2}, Lcom/daaw/wc0;->z()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/daaw/si;->c:[Lcom/daaw/ts1$a;

    aget-object v2, v2, v0

    invoke-interface {v2}, Lcom/daaw/ts1$a;->a()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public b()Lcom/daaw/oc0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/si;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/oc0;

    return-object v0
.end method

.method public c(I)Lcom/daaw/lo1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/daaw/lo1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/daaw/si;->c:[Lcom/daaw/ts1$a;

    array-length v3, v3

    if-ge v0, v3, :cond_2

    iget-object v3, p0, Lcom/daaw/si;->d:[Lcom/daaw/wc0;

    aget-object v3, v3, v0

    invoke-interface {v3}, Lcom/daaw/wc0;->z()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/daaw/si;->c:[Lcom/daaw/ts1$a;

    aget-object v3, v3, v0

    invoke-interface {v3}, Lcom/daaw/ts1$a;->a()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    :goto_1
    if-ge p1, v1, :cond_1

    new-instance v1, Lcom/daaw/lo1;

    sub-int/2addr p1, v2

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    move v2, v1

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/daaw/lo1;

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public f(Lcom/daaw/oc0;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/si;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public getItemViewType(I)I
    .locals 2

    invoke-virtual {p0, p1}, Lcom/daaw/si;->c(I)Lcom/daaw/lo1;

    move-result-object p1

    iget-object v0, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/si;->b:[Lcom/daaw/si$b;

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/daaw/si$b;->a()I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/si;->c:[Lcom/daaw/ts1$a;

    iget-object v1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iget-object p1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/daaw/ts1$a;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public j(IILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/daaw/si;->c(I)Lcom/daaw/lo1;

    move-result-object p1

    invoke-virtual {p0, p2}, Lcom/daaw/si;->c(I)Lcom/daaw/lo1;

    move-result-object p2

    iget-object v0, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    iget-object v1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Assert posFrom.obj2 != posFrom.obj1"

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/si;->c:[Lcom/daaw/ts1$a;

    iget-object p2, p2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    aget-object p2, v0, p2

    iget-object p1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, -0x1

    invoke-interface {p2, p1, v0, p3}, Lcom/daaw/ts1$a;->j(IILjava/util/List;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/si;->c:[Lcom/daaw/ts1$a;

    iget-object v1, p2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iget-object p1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p2, p2, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/ts1$a;->j(IILjava/util/List;)V

    return-void
.end method

.method public k()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/si;->c:[Lcom/daaw/ts1$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3}, Lcom/daaw/ts1$a;->k()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$c0;
    .locals 3

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/si;->d:[Lcom/daaw/wc0;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p1, p2, v1}, Lcom/daaw/gt1;->a(Landroid/content/Context;Landroid/view/ViewGroup;ILcom/daaw/wc0;)Lcom/daaw/eb;

    move-result-object p1

    return-object p1
.end method

.method public t(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public v(Landroidx/recyclerview/widget/RecyclerView$c0;I)V
    .locals 2

    invoke-virtual {p0, p2}, Lcom/daaw/si;->c(I)Lcom/daaw/lo1;

    move-result-object p2

    iget-object v0, p2, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p1, Lcom/daaw/eb;

    iget-object v0, p0, Lcom/daaw/si;->d:[Lcom/daaw/wc0;

    iget-object v1, p2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iget-object p2, p2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, v0, p2}, Lcom/daaw/eb;->O(Lcom/daaw/wc0;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/si;->c:[Lcom/daaw/ts1$a;

    iget-object v1, p2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iget-object p2, p2, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {v0, p1, p2}, Lcom/daaw/ts1$a;->v(Landroidx/recyclerview/widget/RecyclerView$c0;I)V

    :goto_0
    return-void
.end method
