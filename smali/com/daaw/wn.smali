.class public Lcom/daaw/wn;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/wn$d;,
        Lcom/daaw/wn$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Lcom/daaw/yn;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:Landroid/content/Context;

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/lo1<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public e:Lcom/daaw/wn$c;

.field public f:Lcom/daaw/wn$d;

.field public g:Landroid/view/ViewGroup;

.field public h:I

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Landroid/view/ViewGroup;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/daaw/lo1<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Landroid/view/ViewGroup;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/wn;->h:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/wn;->i:Z

    iput-object p1, p0, Lcom/daaw/wn;->c:Landroid/content/Context;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/daaw/wn;->d:Ljava/util/List;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/wn;->d:Ljava/util/List;

    :goto_0
    iput-object p3, p0, Lcom/daaw/wn;->g:Landroid/view/ViewGroup;

    return-void
.end method

.method public static synthetic x(Lcom/daaw/wn;)Lcom/daaw/wn$d;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wn;->f:Lcom/daaw/wn$d;

    return-object p0
.end method


# virtual methods
.method public A(Landroid/view/ViewGroup;I)Lcom/daaw/yn;
    .locals 2

    iget-object p2, p0, Lcom/daaw/wn;->c:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c002a

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/daaw/yn;

    iget-object v0, p0, Lcom/daaw/wn;->e:Lcom/daaw/wn$c;

    iget-object v1, p0, Lcom/daaw/wn;->g:Landroid/view/ViewGroup;

    invoke-direct {p2, p1, v0, v1}, Lcom/daaw/yn;-><init>(Landroid/view/View;Lcom/daaw/wn$c;Landroid/view/ViewGroup;)V

    return-object p2
.end method

.method public B(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/lo1<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/wn;->d:Ljava/util/List;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->i()V

    return-void
.end method

.method public C(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/wn;->i:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/wn;->i:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->i()V

    return-void
.end method

.method public D(ILcom/daaw/lo1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/lo1<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/wn;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/wn;->d:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public E(Lcom/daaw/wn$c;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wn;->e:Lcom/daaw/wn$c;

    return-void
.end method

.method public F(Lcom/daaw/wn$d;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wn;->f:Lcom/daaw/wn$d;

    return-void
.end method

.method public G(ILandroid/view/View;)V
    .locals 1

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    :cond_0
    iget p2, p0, Lcom/daaw/wn;->h:I

    if-ltz p2, :cond_1

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->j(I)V

    :cond_1
    :goto_0
    iput p1, p0, Lcom/daaw/wn;->h:I

    if-ltz p1, :cond_2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->j(I)V

    :cond_2
    return-void
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/wn;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic m(Landroidx/recyclerview/widget/RecyclerView$c0;I)V
    .locals 0

    check-cast p1, Lcom/daaw/yn;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/wn;->z(Lcom/daaw/yn;I)V

    return-void
.end method

.method public bridge synthetic o(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$c0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/wn;->A(Landroid/view/ViewGroup;I)Lcom/daaw/yn;

    move-result-object p1

    return-object p1
.end method

.method public y()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/wn;->i:Z

    return v0
.end method

.method public z(Lcom/daaw/yn;I)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/yn;->P()V

    iget-object v0, p0, Lcom/daaw/wn;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/lo1;

    iget-object v0, p1, Lcom/daaw/yn;->u:Landroid/widget/TextView;

    iget-object v1, p2, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Lcom/daaw/yn;->R(Ljava/lang/CharSequence;)V

    iget-object p2, p1, Lcom/daaw/yn;->x:Landroid/view/ViewGroup;

    iget-boolean v0, p0, Lcom/daaw/wn;->i:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    new-instance v0, Lcom/daaw/wn$a;

    invoke-direct {v0, p0, p1}, Lcom/daaw/wn$a;-><init>(Lcom/daaw/wn;Lcom/daaw/yn;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p1, Lcom/daaw/yn;->w:Landroid/widget/ImageButton;

    new-instance v0, Lcom/daaw/wn$b;

    invoke-direct {v0, p0, p1}, Lcom/daaw/wn$b;-><init>(Lcom/daaw/wn;Lcom/daaw/yn;)V

    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    iget p1, p1, Lcom/daaw/yn;->y:I

    iget v0, p0, Lcom/daaw/wn;->h:I

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {p2, v1}, Landroid/view/View;->setSelected(Z)V

    return-void
.end method
