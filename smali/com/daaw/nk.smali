.class public Lcom/daaw/nk;
.super Lcom/daaw/n10;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/nk$b;,
        Lcom/daaw/nk$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/n10<",
        "Lcom/daaw/h60;",
        "Ljava/util/List<",
        "Lcom/daaw/h60;",
        ">;>;"
    }
.end annotation


# instance fields
.field public K:[Lcom/daaw/l0;

.field public L:[Lcom/daaw/l0;

.field public M:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/r40;Ljava/lang/String;Lcom/daaw/me0;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/daaw/r40<",
            "Lcom/daaw/yj;",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;>;",
            "Ljava/lang/String;",
            "Lcom/daaw/me0<",
            "Ljava/lang/String;",
            ">;II)V"
        }
    .end annotation

    move-object v9, p0

    new-instance v3, Lcom/daaw/f6;

    invoke-direct {v3}, Lcom/daaw/f6;-><init>()V

    new-instance v7, Lcom/daaw/p91;

    move-object v1, p1

    invoke-direct {v7, p1}, Lcom/daaw/p91;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v2, p3

    move-object v4, p4

    move-object v5, p5

    move/from16 v6, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/daaw/n10;-><init>(Landroid/content/Context;Lcom/daaw/r40;Lcom/daaw/w40;Ljava/lang/String;Lcom/daaw/me0;ILcom/daaw/m10;I)V

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/daaw/l0;

    iput-object v1, v9, Lcom/daaw/nk;->K:[Lcom/daaw/l0;

    new-array v0, v0, [Lcom/daaw/l0;

    iput-object v0, v9, Lcom/daaw/nk;->L:[Lcom/daaw/l0;

    move-object v0, p2

    iput-object v0, v9, Lcom/daaw/nk;->M:Ljava/lang/String;

    return-void
.end method

.method public static Y(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f1002c5

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method


# virtual methods
.method public E(Landroid/content/Context;I)Lcom/daaw/ts1;
    .locals 1

    new-instance p1, Lcom/daaw/d90;

    const/16 p2, 0x9

    const/16 v0, 0xf

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/d90;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;II)V

    new-instance p2, Lcom/daaw/ts1;

    invoke-direct {p2, p1, p0}, Lcom/daaw/ts1;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;)V

    return-object p2
.end method

.method public H(I)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/bk0;->R(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/h60;

    iget-object p1, p1, Lcom/daaw/h60;->b:Ljava/lang/String;

    return-object p1
.end method

.method public X(Lcom/daaw/h60;ILcom/daaw/uk;)V
    .locals 2

    new-instance p2, Lcom/daaw/nk$b;

    invoke-direct {p2, p1}, Lcom/daaw/nk$b;-><init>(Lcom/daaw/h60;)V

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v0

    invoke-virtual {p3, p0, p2, v0}, Lcom/daaw/uk;->b0(Lcom/daaw/wc0;Ljava/lang/Object;Lcom/daaw/sd0;)V

    sget-object p2, Lcom/daaw/yj;->x:Lcom/daaw/ww1;

    iget-object v0, p3, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0, v1}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p3, Lcom/daaw/uk;->w:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setSelected(Z)V

    iget-object p2, p0, Lcom/daaw/nk;->K:[Lcom/daaw/l0;

    const/4 v0, 0x0

    invoke-virtual {p3, p2, v0, p0}, Lcom/daaw/uk;->X([Lcom/daaw/l0;ILcom/daaw/wc0;)V

    iget-object p2, p3, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 p2, 0x0

    invoke-virtual {p3, p2}, Lcom/daaw/uk;->U(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, p3, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p2, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object p1, p1, Lcom/daaw/h60;->a:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/daaw/nk;->Y(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    iget p2, p0, Lcom/daaw/yj;->g:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p3, v0}, Lcom/daaw/uk;->d0(I)V

    iget-object p1, p3, Lcom/daaw/uk;->B:Landroid/widget/TextView;

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 8

    iget-object v0, p0, Lcom/daaw/nk;->M:Ljava/lang/String;

    invoke-static {v0, p2}, Lcom/daaw/tc1;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/me0;

    move-result-object v5

    new-instance v0, Lcom/daaw/lk;

    new-instance v3, Lcom/daaw/nk$a;

    invoke-direct {v3, p2}, Lcom/daaw/nk$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget v7, p0, Lcom/daaw/yj;->l:I

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/daaw/lk;-><init>(Landroid/content/Context;Lcom/daaw/r40;Ljava/lang/String;Lcom/daaw/me0;II)V

    iget-object p2, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/yj;->G(Landroid/content/Context;I)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/daaw/al;I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/nk;->L:[Lcom/daaw/l0;

    array-length v1, v0

    if-ge p2, v1, :cond_0

    aget-object p2, v0, p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/l0;->a(Lcom/daaw/al;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public o(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/daaw/p91;

    invoke-direct {v0, p1}, Lcom/daaw/p91;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/n10;->W(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m10;)V

    return-void
.end method

.method public v(Landroidx/recyclerview/widget/RecyclerView$c0;I)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/h60;

    check-cast p1, Lcom/daaw/uk;

    iput p2, p1, Lcom/daaw/uk;->v:I

    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/nk;->X(Lcom/daaw/h60;ILcom/daaw/uk;)V

    return-void
.end method

.method public x(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/sd0;)V
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f100145

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method
