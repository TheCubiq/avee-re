.class public abstract Lcom/daaw/on;
.super Lcom/daaw/yj;
.source ""

# interfaces
.implements Lcom/daaw/ts1$a;


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

.field public D:Landroid/database/Cursor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 6

    new-instance v3, Lcom/daaw/tr1;

    invoke-direct {v3, p3}, Lcom/daaw/tr1;-><init>(Ljava/lang/Object;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/daaw/yj;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/me0;II)V

    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/on;->C:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/ref/WeakReference;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/wc0$b;",
            ">;)V"
        }
    .end annotation

    new-instance v3, Lcom/daaw/tr1;

    invoke-direct {v3, p3}, Lcom/daaw/tr1;-><init>(Ljava/lang/Object;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/daaw/yj;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/me0;IILjava/lang/ref/WeakReference;)V

    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/on;->C:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/on;->T()Lcom/daaw/oc0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/oc0;->a()V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract P(Landroid/content/Context;)Lcom/daaw/lo1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/daaw/lo1<",
            "Landroid/database/Cursor;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public Q(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/lo1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/lo1<",
            "Landroid/database/Cursor;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/daaw/on;->P(Landroid/content/Context;)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public R(ILjava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/on;->D:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    :goto_0
    iget-object v0, p0, Lcom/daaw/on;->D:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/on;->D:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/daaw/on;->D:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->getPosition()I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/on;->D:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public S(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/on;->D:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/on;->R(ILjava/lang/String;)I

    move-result p1

    return p1
.end method

.method public T()Lcom/daaw/oc0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/on;->C:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/oc0;

    return-object v0
.end method

.method public U(I)Landroid/database/Cursor;
    .locals 1

    iget-object v0, p0, Lcom/daaw/on;->D:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    iget-object p1, p0, Lcom/daaw/on;->D:Landroid/database/Cursor;

    return-object p1
.end method

.method public V(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/on;->P(Landroid/content/Context;)Lcom/daaw/lo1;

    move-result-object p1

    iget-object v0, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v0, Landroid/database/Cursor;

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/on;->W(Landroid/database/Cursor;Ljava/lang/String;)V

    return-void
.end method

.method public W(Landroid/database/Cursor;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/daaw/yj;->B(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lcom/daaw/on;->D:Landroid/database/Cursor;

    invoke-static {p2}, Lcom/daaw/dp0;->b(Landroid/database/Cursor;)V

    invoke-static {p1}, Lcom/daaw/q6;->f(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/on;->D:Landroid/database/Cursor;

    invoke-virtual {p0}, Lcom/daaw/on;->T()Lcom/daaw/oc0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/daaw/oc0;->a()V

    :cond_1
    return-void
.end method

.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/on;->D:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    return v0
.end method

.method public f(Lcom/daaw/oc0;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/on;->C:Ljava/lang/ref/WeakReference;

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

.method public o(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/on;->Q(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/lo1;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p2, Landroid/database/Cursor;

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p2, p1}, Lcom/daaw/on;->W(Landroid/database/Cursor;Ljava/lang/String;)V

    :cond_0
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
