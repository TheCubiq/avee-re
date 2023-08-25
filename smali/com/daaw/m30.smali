.class public Lcom/daaw/m30;
.super Lcom/daaw/dj0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/m30$b;
    }
.end annotation


# instance fields
.field public p0:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/daaw/m30$b;",
            ">;"
        }
    .end annotation
.end field

.field public q0:Ljava/lang/String;

.field public r0:Landroid/view/View;

.field public s0:Lcom/astuetz/PagerSlidingTabStrip;

.field public t0:Landroidx/recyclerview/widget/RecyclerView;

.field public u0:Lcom/daaw/ts1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/dj0;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/m30;->p0:Ljava/util/HashMap;

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    return-void
.end method

.method public static w()Lcom/daaw/m30;
    .locals 2

    new-instance v0, Lcom/daaw/m30;

    invoke-direct {v0}, Lcom/daaw/m30;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/m30;->p()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v1

    check-cast v1, Lcom/daaw/ts1;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1, v2}, Lcom/daaw/wc0;->h(Z)Z

    move-result v0

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/m30;->u(Lcom/daaw/ts1;Ljava/lang/String;Z)V

    :cond_2
    return-void
.end method

.method public B()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/daaw/ts1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/daaw/m30;->C(Lcom/daaw/ts1;)V

    return-void
.end method

.method public final C(Lcom/daaw/ts1;)V
    .locals 4

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/q6;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/daaw/m30;->o(Lcom/daaw/ts1;)Lcom/daaw/m91;

    move-result-object p1

    sget-object v0, Lcom/daaw/dj0;->r:Lcom/daaw/tw1;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-boolean v2, p1, Lcom/daaw/m91;->a:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v3, p1, Lcom/daaw/m91;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/daaw/m91;->c:Lcom/daaw/sd0;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/daaw/tw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public D(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/daaw/ts1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/wc0;->o(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public E()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->d()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->X(I)Landroidx/recyclerview/widget/RecyclerView$c0;

    move-result-object v2

    instance-of v3, v2, Lcom/daaw/uk;

    if-eqz v3, :cond_1

    check-cast v2, Lcom/daaw/uk;

    invoke-virtual {v2}, Lcom/daaw/uk;->R()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public l()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Z1()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n()Lcom/daaw/m91;
    .locals 1

    iget-object v0, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/daaw/ts1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/daaw/m30;->o(Lcom/daaw/ts1;)Lcom/daaw/m91;

    move-result-object v0

    return-object v0
.end method

.method public final o(Lcom/daaw/ts1;)Lcom/daaw/m91;
    .locals 1

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/daaw/m91;->d:Lcom/daaw/m91;

    return-object p1

    :cond_0
    invoke-static {v0, p1}, Lcom/daaw/dj0;->h(Landroid/content/Context;Lcom/daaw/ts1;)Lcom/daaw/m91;

    move-result-object p1

    return-object p1
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget v0, Lcom/daaw/j5;->a0:I

    invoke-virtual {p1, v0}, Lcom/daaw/j5;->t(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, ""

    iput-object p1, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    :cond_0
    const/4 p1, 0x0

    iget-object v0, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/m30;->t(Lcom/daaw/ts1;Ljava/lang/String;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p3

    sget v0, Lcom/daaw/j5;->a0:I

    invoke-virtual {p3, v0}, Lcom/daaw/j5;->t(I)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    if-nez p3, :cond_0

    const-string p3, ""

    iput-object p3, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    :cond_0
    const p3, 0x7f0c0077

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090313

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/gr1;->u(Landroid/view/View;)V

    sget-object p2, Lcom/daaw/dj0;->t:Lcom/daaw/rw1;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const v1, 0x7f09030d

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p2, p3, v1}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    const p2, 0x7f090062

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/m30;->r0:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lcom/daaw/m30;->r(F)V

    const p2, 0x7f090287

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/astuetz/PagerSlidingTabStrip;

    iput-object p2, p0, Lcom/daaw/m30;->s0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p0}, Landroid/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f06001b

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    iget-object p3, p0, Lcom/daaw/m30;->s0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3, p2}, Lcom/astuetz/PagerSlidingTabStrip;->setTextColor(I)V

    iget-object p3, p0, Lcom/daaw/m30;->s0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3, p2}, Lcom/astuetz/PagerSlidingTabStrip;->setTextColorSelected(I)V

    iget-object p3, p0, Lcom/daaw/m30;->s0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3, p2}, Lcom/astuetz/PagerSlidingTabStrip;->setDividerColor(I)V

    iget-object p3, p0, Lcom/daaw/m30;->s0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3, p2}, Lcom/astuetz/PagerSlidingTabStrip;->setUnderlineColor(I)V

    iget-object p3, p0, Lcom/daaw/m30;->s0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3, p2}, Lcom/astuetz/PagerSlidingTabStrip;->setIndicatorColor(I)V

    iget-object p2, p0, Lcom/daaw/m30;->s0:Lcom/astuetz/PagerSlidingTabStrip;

    new-instance p3, Lcom/daaw/m30$a;

    invoke-direct {p3, p0}, Lcom/daaw/m30$a;-><init>(Lcom/daaw/m30;)V

    invoke-virtual {p2, p3}, Lcom/astuetz/PagerSlidingTabStrip;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09020f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iget-object p3, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object p2, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p3, Lcom/daaw/ke1;

    const/4 v1, 0x1

    const v2, 0x7f0400e8

    invoke-static {p2, v2}, Lcom/daaw/gr1;->n(Landroid/view/View;I)I

    move-result v2

    invoke-direct {p3, v1, v2}, Lcom/daaw/ke1;-><init>(II)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    const p2, 0x7f090288

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/daaw/gr1;->i(Landroid/view/View;Landroid/view/ViewParent;)V

    new-instance p2, Lcom/daaw/jk;

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p3

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {p2, p3, v0, v1}, Lcom/daaw/jk;-><init>(Landroid/content/Context;ILjava/lang/ref/WeakReference;)V

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/daaw/yj;->F(Landroid/content/Context;)Lcom/daaw/ts1;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/m30;->u0:Lcom/daaw/ts1;

    const/4 p2, 0x0

    iget-object p3, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    invoke-virtual {p0, p2, p3}, Lcom/daaw/m30;->t(Lcom/daaw/ts1;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/m30;->E()V

    invoke-virtual {p0}, Lcom/daaw/m30;->B()V

    return-object p1
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    return-void
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/m30;->s0:Lcom/astuetz/PagerSlidingTabStrip;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2f

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    :goto_0
    if-gtz v1, :cond_1

    const-string v0, "/"

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/daaw/m30;->t(Lcom/daaw/ts1;Ljava/lang/String;)V

    return-void
.end method

.method public r(F)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/m30;->r0:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotX(F)V

    iget-object v0, p0, Lcom/daaw/m30;->r0:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    return-void
.end method

.method public s(Lcom/daaw/ts1;Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p1

    check-cast p1, Lcom/daaw/ts1;

    :cond_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/daaw/m30;->v(Lcom/daaw/ts1;Ljava/lang/String;)Lcom/daaw/ts1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/wc0;->e()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    sget v0, Lcom/daaw/j5;->a0:I

    iget-object v1, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/j5;->g0(ILjava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/daaw/m30;->y(Lcom/daaw/ts1;)V

    return-void
.end method

.method public t(Lcom/daaw/ts1;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/m30;->u(Lcom/daaw/ts1;Ljava/lang/String;Z)V

    return-void
.end method

.method public u(Lcom/daaw/ts1;Ljava/lang/String;Z)V
    .locals 3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x2f

    const/4 v2, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v1, :cond_1

    :cond_0
    const-string p2, "/"

    :cond_1
    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/m30;->u0:Lcom/daaw/ts1;

    :cond_2
    if-nez p3, :cond_3

    if-eqz p1, :cond_3

    iget-object p3, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p3

    check-cast p3, Lcom/daaw/ts1;

    if-eqz p3, :cond_3

    invoke-virtual {p1}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/daaw/wc0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object p3

    invoke-interface {p3}, Lcom/daaw/wc0;->e()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    return-void

    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    if-lez p3, :cond_5

    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result p3

    if-ne p3, v1, :cond_5

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/daaw/m30;->u0:Lcom/daaw/ts1;

    :cond_4
    iget-object p3, p0, Lcom/daaw/m30;->s0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p3}, Lcom/astuetz/PagerSlidingTabStrip;->v()V

    iget-object p3, p0, Lcom/daaw/m30;->s0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p1}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/wc0;->l()Lcom/daaw/me0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/wc0;->i()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/wc0;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v0, v1, v2}, Lcom/astuetz/PagerSlidingTabStrip;->u(Lcom/daaw/me0;ILjava/lang/Object;)V

    const/4 p3, 0x1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2, p3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    :cond_5
    invoke-virtual {p0, p1, p2}, Lcom/daaw/m30;->v(Lcom/daaw/ts1;Ljava/lang/String;)Lcom/daaw/ts1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/wc0;->e()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    sget p3, Lcom/daaw/j5;->a0:I

    iget-object v0, p0, Lcom/daaw/m30;->q0:Ljava/lang/String;

    invoke-virtual {p2, p3, v0}, Lcom/daaw/j5;->g0(ILjava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/daaw/m30;->y(Lcom/daaw/ts1;)V

    return-void
.end method

.method public v(Lcom/daaw/ts1;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 4

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x2f

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_1

    const-string v0, ""

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p2, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object p2, v1

    :goto_0
    invoke-virtual {p1}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-interface {v1, v2, p2}, Lcom/daaw/wc0;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/daaw/m30;->s0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {p2}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/wc0;->l()Lcom/daaw/me0;

    move-result-object v1

    invoke-virtual {p2}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/wc0;->i()I

    move-result v2

    invoke-virtual {p2}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v3

    invoke-interface {v3}, Lcom/daaw/wc0;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v2, v3}, Lcom/astuetz/PagerSlidingTabStrip;->u(Lcom/daaw/me0;ILjava/lang/Object;)V

    invoke-virtual {p0, p2, v0}, Lcom/daaw/m30;->v(Lcom/daaw/ts1;Ljava/lang/String;)Lcom/daaw/ts1;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method public x(Lcom/daaw/sd0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/daaw/ts1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/daaw/wc0;->y(Lcom/daaw/sd0;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->i()V

    :cond_1
    return-void
.end method

.method public y(Lcom/daaw/ts1;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/daaw/ts1;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/wc0;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v3

    invoke-interface {v3}, Lcom/daaw/wc0;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x1

    if-ge v4, v5, :cond_0

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v6, 0x0

    :goto_1
    if-eqz v1, :cond_2

    iget-object v3, p0, Lcom/daaw/m30;->p0:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    new-instance v2, Lcom/daaw/m30$b;

    invoke-direct {v2, p0}, Lcom/daaw/m30$b;-><init>(Lcom/daaw/m30;)V

    invoke-virtual {p0}, Lcom/daaw/m30;->m()I

    move-result v3

    iput v3, v2, Lcom/daaw/m30$b;->a:I

    iget-object v3, p0, Lcom/daaw/m30;->p0:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/wc0;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    :goto_2
    if-eq v0, p1, :cond_6

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/daaw/ts1;->y()V

    :cond_4
    invoke-virtual {p0, p1}, Lcom/daaw/m30;->C(Lcom/daaw/ts1;)V

    iget-object v0, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    if-nez v1, :cond_5

    if-eqz v6, :cond_6

    :cond_5
    iget-object v0, p0, Lcom/daaw/m30;->p0:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/daaw/ts1;->z()Lcom/daaw/wc0;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/wc0;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/m30$b;

    if-eqz p1, :cond_6

    iget p1, p1, Lcom/daaw/m30$b;->a:I

    invoke-virtual {p0, p1}, Lcom/daaw/m30;->z(I)V

    :cond_6
    return-void
.end method

.method public z(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/m30;->t0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->x1(I)V

    :cond_0
    return-void
.end method
