.class public Lcom/daaw/d90;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ts1$a;


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

.field public b:Lcom/daaw/ts1$a;

.field public c:I

.field public d:I

.field public e:Lcom/daaw/wc0;

.field public f:Lcom/daaw/oc0;


# direct methods
.method public constructor <init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;II)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/d90;->a:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/daaw/d90;->e:Lcom/daaw/wc0;

    iput-object p1, p0, Lcom/daaw/d90;->b:Lcom/daaw/ts1$a;

    iput p3, p0, Lcom/daaw/d90;->c:I

    iput p4, p0, Lcom/daaw/d90;->d:I

    new-instance p2, Lcom/daaw/d90$a;

    invoke-direct {p2, p0}, Lcom/daaw/d90$a;-><init>(Lcom/daaw/d90;)V

    iput-object p2, p0, Lcom/daaw/d90;->f:Lcom/daaw/oc0;

    invoke-interface {p1, p2}, Lcom/daaw/ts1$a;->f(Lcom/daaw/oc0;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/d90;->b:Lcom/daaw/ts1$a;

    invoke-interface {v0}, Lcom/daaw/ts1$a;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public b()Lcom/daaw/oc0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d90;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/oc0;

    return-object v0
.end method

.method public f(Lcom/daaw/oc0;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/d90;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public getItemViewType(I)I
    .locals 1

    if-nez p1, :cond_0

    iget p1, p0, Lcom/daaw/d90;->c:I

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/d90;->b:Lcom/daaw/ts1$a;

    invoke-interface {v0}, Lcom/daaw/ts1$a;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-ne p1, v0, :cond_1

    iget p1, p0, Lcom/daaw/d90;->d:I

    return p1

    :cond_1
    iget-object v0, p0, Lcom/daaw/d90;->b:Lcom/daaw/ts1$a;

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v0, p1}, Lcom/daaw/ts1$a;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public j(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/d90;->b:Lcom/daaw/ts1$a;

    add-int/lit8 p1, p1, -0x1

    add-int/lit8 p2, p2, -0x1

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/ts1$a;->j(IILjava/util/List;)V

    return-void
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/d90;->b:Lcom/daaw/ts1$a;

    invoke-interface {v0}, Lcom/daaw/ts1$a;->k()V

    return-void
.end method

.method public r(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$c0;
    .locals 2

    iget v0, p0, Lcom/daaw/d90;->c:I

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/d90;->e:Lcom/daaw/wc0;

    invoke-static {v0, p1, p2, v1}, Lcom/daaw/gt1;->a(Landroid/content/Context;Landroid/view/ViewGroup;ILcom/daaw/wc0;)Lcom/daaw/eb;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p0, Lcom/daaw/d90;->d:I

    if-ne p2, v0, :cond_1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/d90;->e:Lcom/daaw/wc0;

    invoke-static {v0, p1, p2, v1}, Lcom/daaw/gt1;->a(Landroid/content/Context;Landroid/view/ViewGroup;ILcom/daaw/wc0;)Lcom/daaw/eb;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/daaw/d90;->b:Lcom/daaw/ts1$a;

    invoke-interface {v0, p1, p2}, Lcom/daaw/ts1$a;->r(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$c0;

    move-result-object p1

    return-object p1
.end method

.method public t(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public v(Landroidx/recyclerview/widget/RecyclerView$c0;I)V
    .locals 1

    if-lez p2, :cond_0

    iget-object v0, p0, Lcom/daaw/d90;->b:Lcom/daaw/ts1$a;

    invoke-interface {v0}, Lcom/daaw/ts1$a;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-ge p2, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/d90;->b:Lcom/daaw/ts1$a;

    add-int/lit8 p2, p2, -0x1

    invoke-interface {v0, p1, p2}, Lcom/daaw/ts1$a;->v(Landroidx/recyclerview/widget/RecyclerView$c0;I)V

    return-void

    :cond_0
    check-cast p1, Lcom/daaw/eb;

    iget-object v0, p0, Lcom/daaw/d90;->e:Lcom/daaw/wc0;

    invoke-virtual {p1, v0, p2}, Lcom/daaw/eb;->O(Lcom/daaw/wc0;I)V

    return-void
.end method
