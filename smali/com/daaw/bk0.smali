.class public abstract Lcom/daaw/bk0;
.super Lcom/daaw/yj;
.source ""

# interfaces
.implements Lcom/daaw/ts1$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V::",
        "Ljava/util/List<",
        "TT;>;>",
        "Lcom/daaw/yj;",
        "Lcom/daaw/ts1$a;"
    }
.end annotation


# instance fields
.field public C:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/oc0;",
            ">;"
        }
    .end annotation
.end field

.field public D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field public E:Lcom/daaw/w40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/w40<",
            "TV;>;"
        }
    .end annotation
.end field

.field public F:Lcom/daaw/r40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/r40<",
            "Lcom/daaw/yj;",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/r40;Lcom/daaw/w40;Ljava/lang/String;Lcom/daaw/me0;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/r40<",
            "Lcom/daaw/yj;",
            "TV;>;",
            "Lcom/daaw/w40<",
            "TV;>;",
            "Ljava/lang/String;",
            "Lcom/daaw/me0<",
            "Ljava/lang/String;",
            ">;II)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p4

    move-object v3, p5

    move v4, p6

    move v5, p7

    invoke-direct/range {v0 .. v5}, Lcom/daaw/yj;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/me0;II)V

    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p4, 0x0

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/bk0;->C:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/daaw/bk0;->F:Lcom/daaw/r40;

    iput-object p3, p0, Lcom/daaw/bk0;->E:Lcom/daaw/w40;

    invoke-interface {p2, p0}, Lcom/daaw/r40;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/bk0;->D:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/bk0;->Q(Z)Lcom/daaw/lo1;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/daaw/yj;->B(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, v2}, Lcom/daaw/bk0;->Q(Z)Lcom/daaw/lo1;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_1

    iget-object v1, p0, Lcom/daaw/bk0;->E:Lcom/daaw/w40;

    invoke-interface {v1}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/daaw/bk0;->T(Ljava/util/List;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Lcom/daaw/bk0;->T(Ljava/util/List;Ljava/lang/String;)V

    :goto_0
    return v0
.end method

.method public P()Lcom/daaw/oc0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bk0;->C:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/oc0;

    return-object v0
.end method

.method public Q(Z)Lcom/daaw/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/daaw/lo1<",
            "TV;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/bk0;->F:Lcom/daaw/r40;

    invoke-interface {p1, p0}, Lcom/daaw/r40;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/bk0;->E:Lcom/daaw/w40;

    invoke-interface {v0}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance p1, Lcom/daaw/lo1;

    const-string v1, ""

    invoke-direct {p1, v0, v1}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public R(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bk0;->D:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public S()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/bk0;->D:Ljava/util/List;

    return-object v0
.end method

.method public T(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/daaw/yj;->B(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lcom/daaw/q6;->f(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/bk0;->D:Ljava/util/List;

    invoke-virtual {p0}, Lcom/daaw/bk0;->P()Lcom/daaw/oc0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/daaw/oc0;->a()V

    :cond_1
    return-void
.end method

.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/bk0;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public f(Lcom/daaw/oc0;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/bk0;->C:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public j(IILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public r(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$c0;
    .locals 1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2, p0}, Lcom/daaw/gt1;->a(Landroid/content/Context;Landroid/view/ViewGroup;ILcom/daaw/wc0;)Lcom/daaw/eb;

    move-result-object p1

    return-object p1
.end method

.method public t(I)I
    .locals 0

    return p1
.end method
