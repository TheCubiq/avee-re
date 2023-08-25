.class public Lcom/daaw/n30;
.super Lcom/daaw/dj0;
.source ""


# instance fields
.field public p0:Lcom/daaw/qk;

.field public q0:Landroidx/recyclerview/widget/RecyclerView;

.field public r0:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/daaw/vd0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/dj0;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/daaw/n30;->r0:Ljava/util/ArrayDeque;

    return-void
.end method

.method public static synthetic l(Lcom/daaw/n30;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method public static o()Lcom/daaw/n30;
    .locals 2

    new-instance v0, Lcom/daaw/n30;

    invoke-direct {v0}, Lcom/daaw/n30;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public m()Lcom/daaw/m91;
    .locals 2

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/daaw/m91;->d:Lcom/daaw/m91;

    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v1, :cond_1

    sget-object v0, Lcom/daaw/m91;->d:Lcom/daaw/m91;

    return-object v0

    :cond_1
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v1

    check-cast v1, Lcom/daaw/ts1;

    if-nez v1, :cond_2

    sget-object v0, Lcom/daaw/m91;->d:Lcom/daaw/m91;

    return-object v0

    :cond_2
    invoke-static {v0, v1}, Lcom/daaw/dj0;->h(Landroid/content/Context;Lcom/daaw/ts1;)Lcom/daaw/m91;

    move-result-object v0

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    const p3, 0x7f0c0078

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090313

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/gr1;->u(Landroid/view/View;)V

    sget-object p2, Lcom/daaw/dj0;->t:Lcom/daaw/rw1;

    const/4 p3, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f09030d

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    const p2, 0x7f09020f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    new-instance p2, Lcom/daaw/qk;

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    new-instance v3, Lcom/daaw/n30$a;

    invoke-direct {v3, p0}, Lcom/daaw/n30$a;-><init>(Lcom/daaw/n30;)V

    const-string v4, "nowplaying"

    const-string v5, "Playlist"

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v1, p2

    invoke-direct/range {v1 .. v7}, Lcom/daaw/qk;-><init>(Landroid/content/Context;Lcom/daaw/r40;Ljava/lang/String;Ljava/lang/String;ZI)V

    iput-object p2, p0, Lcom/daaw/n30;->p0:Lcom/daaw/qk;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    iget-object p2, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lcom/daaw/n30;->p0:Lcom/daaw/qk;

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Lcom/daaw/yj;->G(Landroid/content/Context;I)Lcom/daaw/ts1;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    iget-object p2, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/daaw/ke1;

    const v1, 0x7f0400e8

    invoke-static {p2, v1}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v1

    invoke-direct {v0, p3, v1}, Lcom/daaw/ke1;-><init>(II)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    new-instance p2, Lcom/daaw/lu;

    invoke-direct {p2}, Lcom/daaw/lu;-><init>()V

    const p3, 0x7f09008e

    invoke-virtual {p2, p3}, Lcom/daaw/lu;->x(I)V

    const p3, 0x3ecccccd    # 0.4f

    invoke-virtual {p2, p3}, Lcom/daaw/lu;->t(F)V

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p3

    invoke-virtual {p3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f060026

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/daaw/lu;->u(I)V

    const p3, 0x3e99999a    # 0.3f

    invoke-virtual {p2, p3}, Lcom/daaw/lu;->r(F)V

    const p3, 0x3dcccccd    # 0.1f

    invoke-virtual {p2, p3}, Lcom/daaw/lu;->s(F)V

    new-instance p3, Lcom/daaw/n30$b;

    invoke-direct {p3, p0}, Lcom/daaw/n30$b;-><init>(Lcom/daaw/n30;)V

    invoke-virtual {p2, p3}, Lcom/daaw/lu;->w(Lcom/daaw/lu$c;)V

    iget-object p3, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    iget-object p3, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroidx/recyclerview/widget/RecyclerView$s;)V

    iget-object p3, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Lcom/daaw/lu;->q()Landroidx/recyclerview/widget/RecyclerView$t;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->k(Landroidx/recyclerview/widget/RecyclerView$t;)V

    iget-object p3, p0, Lcom/daaw/n30;->p0:Lcom/daaw/qk;

    new-instance v0, Lcom/daaw/n30$c;

    invoke-direct {v0, p0, p2}, Lcom/daaw/n30$c;-><init>(Lcom/daaw/n30;Lcom/daaw/lu;)V

    invoke-virtual {p3, v0}, Lcom/daaw/yj;->M(Lcom/daaw/wc0$c;)V

    sget-object p2, Lcom/daaw/dj0;->v:Lcom/daaw/vw1;

    new-instance p3, Lcom/daaw/er0;

    invoke-direct {p3}, Lcom/daaw/er0;-><init>()V

    invoke-virtual {p2, p3}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/er0;

    invoke-virtual {p0, p2}, Lcom/daaw/n30;->v(Lcom/daaw/er0;)V

    sget p2, Lcom/daaw/ww0;->e:I

    sget-object p3, Lcom/daaw/ww0;->b:Lcom/daaw/tx0;

    sget-object v0, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    sget-object v1, Lcom/daaw/ww0;->c:Lcom/daaw/vd0;

    invoke-virtual {p0, p2, p3, v0, v1}, Lcom/daaw/n30;->u(ILcom/daaw/tx0;Lcom/daaw/tx0$b;Lcom/daaw/vd0;)V

    invoke-virtual {p0}, Lcom/daaw/n30;->s()V

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/n30;->p(Z)V

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    return-void
.end method

.method public p(Z)V
    .locals 0

    return-void
.end method

.method public q(Lcom/daaw/sd0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/daaw/ts1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/daaw/wc0;->y(Lcom/daaw/sd0;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->i()V

    :cond_0
    return-void
.end method

.method public r()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/n30;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/daaw/ts1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->i()V

    :cond_1
    return-void
.end method

.method public s()V
    .locals 5

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/q6;->f(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/daaw/n30;->m()Lcom/daaw/m91;

    move-result-object v0

    sget-object v1, Lcom/daaw/dj0;->r:Lcom/daaw/tw1;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-boolean v3, v0, Lcom/daaw/m91;->a:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-object v4, v0, Lcom/daaw/m91;->b:Ljava/lang/String;

    iget-object v0, v0, Lcom/daaw/m91;->c:Lcom/daaw/sd0;

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/daaw/tw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public t(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n30;->p0:Lcom/daaw/qk;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/qk;->o(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public u(ILcom/daaw/tx0;Lcom/daaw/tx0$b;Lcom/daaw/vd0;)V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p2

    check-cast p2, Lcom/daaw/ts1;

    if-eqz p2, :cond_9

    iget-object p3, p0, Lcom/daaw/n30;->p0:Lcom/daaw/qk;

    if-eqz p3, :cond_6

    iget-object p3, p0, Lcom/daaw/n30;->r0:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->size()I

    move-result p3

    const/4 v0, 0x1

    if-le p3, v0, :cond_2

    iget-object p3, p0, Lcom/daaw/n30;->r0:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    :cond_2
    if-eqz p4, :cond_4

    iget-object p3, p0, Lcom/daaw/n30;->r0:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/daaw/n30;->r0:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/vd0;

    invoke-virtual {p3, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    :cond_3
    iget-object p3, p0, Lcom/daaw/n30;->r0:Ljava/util/ArrayDeque;

    invoke-virtual {p3, p4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_4
    iget-object p3, p0, Lcom/daaw/n30;->r0:Ljava/util/ArrayDeque;

    invoke-virtual {p3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_5
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/daaw/vd0;

    iget-object v0, p0, Lcom/daaw/n30;->p0:Lcom/daaw/qk;

    invoke-virtual {v0, p4}, Lcom/daaw/qk;->e0(Lcom/daaw/vd0;)I

    move-result p4

    if-ltz p4, :cond_5

    invoke-virtual {p2, p4}, Lcom/daaw/ts1;->x(I)I

    move-result p4

    iget-object v0, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p4}, Landroidx/recyclerview/widget/RecyclerView;->X(I)Landroidx/recyclerview/widget/RecyclerView$c0;

    move-result-object p4

    instance-of v0, p4, Lcom/daaw/uk;

    if-eqz v0, :cond_5

    check-cast p4, Lcom/daaw/uk;

    invoke-virtual {p4}, Lcom/daaw/uk;->R()V

    goto :goto_0

    :cond_6
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$g;->i()V

    :cond_7
    sget-object p3, Lcom/daaw/dj0;->T:Lcom/daaw/vw1;

    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p3, p4}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_9

    iget-object p3, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p3

    check-cast p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroid/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    const v0, 0x7f0a0015

    invoke-virtual {p4, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p4

    invoke-virtual {p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->c2()I

    move-result p3

    add-int/lit8 v0, p4, 0x1

    sub-int/2addr p3, v0

    const/4 v0, 0x0

    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    move-result p3

    if-lt p1, p3, :cond_8

    iget-object p3, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    add-int/2addr p1, p4

    goto :goto_1

    :cond_8
    iget-object p3, p0, Lcom/daaw/n30;->q0:Landroidx/recyclerview/widget/RecyclerView;

    :goto_1
    invoke-virtual {p2, p1}, Lcom/daaw/ts1;->x(I)I

    move-result p1

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->j1(I)V

    :cond_9
    return-void
.end method

.method public v(Lcom/daaw/er0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/n30;->p0:Lcom/daaw/qk;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/yj;->h(Z)Z

    :cond_0
    return-void
.end method
