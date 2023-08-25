.class public Lcom/daaw/ts1;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""

# interfaces
.implements Lcom/daaw/oc0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ts1$a;
    }
.end annotation


# instance fields
.field public c:Lcom/daaw/ts1$a;

.field public d:Lcom/daaw/wc0;


# direct methods
.method public constructor <init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;)V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    iput-object p2, p0, Lcom/daaw/ts1;->d:Lcom/daaw/wc0;

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->v(Z)V

    iput-object p1, p0, Lcom/daaw/ts1;->c:Lcom/daaw/ts1$a;

    invoke-interface {p1, p0}, Lcom/daaw/ts1$a;->f(Lcom/daaw/oc0;)V

    return-void
.end method


# virtual methods
.method public A(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ts1;->c:Lcom/daaw/ts1$a;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/ts1$a;->j(IILjava/util/List;)V

    return-void
.end method

.method public a()V
    .locals 0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->i()V

    return-void
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ts1;->c:Lcom/daaw/ts1$a;

    invoke-interface {v0}, Lcom/daaw/ts1$a;->a()I

    move-result v0

    return v0
.end method

.method public f(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ts1;->c:Lcom/daaw/ts1$a;

    invoke-interface {v0, p1}, Lcom/daaw/ts1$a;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public m(Landroidx/recyclerview/widget/RecyclerView$c0;I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ts1;->c:Lcom/daaw/ts1$a;

    invoke-interface {v0, p1, p2}, Lcom/daaw/ts1$a;->v(Landroidx/recyclerview/widget/RecyclerView$c0;I)V

    return-void
.end method

.method public o(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$c0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ts1;->c:Lcom/daaw/ts1$a;

    invoke-interface {v0, p1, p2}, Lcom/daaw/ts1$a;->r(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$c0;

    move-result-object p1

    return-object p1
.end method

.method public x(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ts1;->c:Lcom/daaw/ts1$a;

    invoke-interface {v0, p1}, Lcom/daaw/ts1$a;->t(I)I

    move-result p1

    return p1
.end method

.method public y()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ts1;->c:Lcom/daaw/ts1$a;

    invoke-interface {v0}, Lcom/daaw/ts1$a;->k()V

    return-void
.end method

.method public z()Lcom/daaw/wc0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ts1;->d:Lcom/daaw/wc0;

    return-object v0
.end method
