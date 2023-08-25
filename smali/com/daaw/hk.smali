.class public Lcom/daaw/hk;
.super Lcom/daaw/on;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/hk$h;,
        Lcom/daaw/hk$g;
    }
.end annotation


# instance fields
.field public E:[Lcom/daaw/l0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 8

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100242

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f08010e

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, Lcom/daaw/on;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p2, 0x6

    new-array p2, p2, [Lcom/daaw/l0;

    new-instance p3, Lcom/daaw/hk$a;

    invoke-direct {p3, p0}, Lcom/daaw/hk$a;-><init>(Lcom/daaw/hk;)V

    const/4 v0, 0x0

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/hk$b;

    invoke-direct {p3, p0}, Lcom/daaw/hk$b;-><init>(Lcom/daaw/hk;)V

    const/4 v0, 0x1

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/hk$c;

    invoke-direct {p3, p0}, Lcom/daaw/hk$c;-><init>(Lcom/daaw/hk;)V

    const/4 v0, 0x2

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/hk$d;

    invoke-direct {p3, p0}, Lcom/daaw/hk$d;-><init>(Lcom/daaw/hk;)V

    const/4 v0, 0x3

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/hk$e;

    invoke-direct {p3, p0}, Lcom/daaw/hk$e;-><init>(Lcom/daaw/hk;)V

    const/4 v0, 0x4

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/hk$f;

    invoke-direct {p3, p0}, Lcom/daaw/hk$f;-><init>(Lcom/daaw/hk;)V

    const/4 v0, 0x5

    aput-object p3, p2, v0

    iput-object p2, p0, Lcom/daaw/hk;->E:[Lcom/daaw/l0;

    invoke-virtual {p0, p1}, Lcom/daaw/on;->V(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic X(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/hk;->Y(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static Y(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/yj;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;"
        }
    .end annotation

    if-nez p3, :cond_0

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-static {}, Lcom/daaw/lx0;->h()Lcom/daaw/lx0;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/daaw/lx0;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p1, p0}, Lcom/daaw/hk;->c0(Lcom/daaw/yj;Ljava/util/List;)V

    invoke-interface {p3, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    return-object p3
.end method

.method public static Z(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/daaw/cr1;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b0(Landroid/content/Context;Lcom/daaw/sd0;)Lcom/daaw/lo1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/sd0;",
            ")",
            "Lcom/daaw/lo1<",
            "Landroid/database/Cursor;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/j5;->H(Landroid/content/Context;)Lcom/daaw/er0;

    move-result-object p0

    const-string p1, "_id"

    const-string v0, ""

    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    new-instance v1, Landroid/database/MatrixCursor;

    invoke-direct {v1, p1}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/er0;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/lo1;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    iget-object v4, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    aput-object p1, v2, v3

    invoke-virtual {v1, v2}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/daaw/lo1;

    invoke-direct {p0, v1, v0}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public static c0(Lcom/daaw/yj;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yj;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/daaw/yj;->s:Lcom/daaw/xw1;

    invoke-virtual {p0}, Lcom/daaw/yj;->I()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/ie1$h;

    iget-boolean p0, p0, Lcom/daaw/ie1$h;->b:Z

    if-eqz p0, :cond_0

    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public E(Landroid/content/Context;I)Lcom/daaw/ts1;
    .locals 1

    new-instance p1, Lcom/daaw/d90;

    const/4 p2, 0x6

    const/4 v0, 0x1

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/d90;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;II)V

    new-instance p2, Lcom/daaw/ts1;

    invoke-direct {p2, p1, p0}, Lcom/daaw/ts1;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;)V

    return-object p2
.end method

.method public H(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/daaw/on;->U(I)Landroid/database/Cursor;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public P(Landroid/content/Context;)Lcom/daaw/lo1;
    .locals 1
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

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/hk;->b0(Landroid/content/Context;Lcom/daaw/sd0;)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
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

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/daaw/hk;->b0(Landroid/content/Context;Lcom/daaw/sd0;)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public a0(Landroid/database/Cursor;ILcom/daaw/uk;)V
    .locals 4

    new-instance v0, Lcom/daaw/hk$h;

    invoke-virtual {p0, p2}, Lcom/daaw/on;->U(I)Landroid/database/Cursor;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p2}, Lcom/daaw/on;->U(I)Landroid/database/Cursor;

    move-result-object p2

    const/4 v3, 0x1

    invoke-interface {p2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Lcom/daaw/hk$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p2

    invoke-virtual {p3, p0, v0, p2}, Lcom/daaw/uk;->b0(Lcom/daaw/wc0;Ljava/lang/Object;Lcom/daaw/sd0;)V

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

    iget-object p2, p0, Lcom/daaw/hk;->E:[Lcom/daaw/l0;

    const/4 v0, -0x1

    invoke-virtual {p3, p2, v0, p0}, Lcom/daaw/uk;->X([Lcom/daaw/l0;ILcom/daaw/wc0;)V

    iget-object p2, p3, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget p2, p0, Lcom/daaw/yj;->i:I

    invoke-virtual {p3, p2}, Lcom/daaw/uk;->V(I)V

    const p2, 0x7f080110

    invoke-virtual {p3, p2}, Lcom/daaw/uk;->W(I)V

    iget-object p2, p3, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    invoke-static {p1}, Lcom/daaw/hk;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    iget v0, p0, Lcom/daaw/yj;->g:I

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p3, v2}, Lcom/daaw/uk;->d0(I)V

    invoke-virtual {p3, p1}, Lcom/daaw/uk;->c0(Ljava/lang/String;)V

    iget-object p1, p3, Lcom/daaw/uk;->B:Landroid/widget/TextView;

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public c(Z)V
    .locals 2

    sget-object v0, Lcom/daaw/yj;->v:Lcom/daaw/rw1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-class v1, Lcom/daaw/hk;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 10

    const-string v0, "_id"

    invoke-virtual {p0, v0, p2}, Lcom/daaw/on;->S(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/on;->U(I)Landroid/database/Cursor;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    invoke-static {v0}, Lcom/daaw/hk;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v1, Lcom/daaw/qk;

    new-instance v4, Lcom/daaw/hk$g;

    invoke-direct {v4, v0}, Lcom/daaw/hk$g;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    iget v8, p0, Lcom/daaw/yj;->l:I

    const/4 v9, 0x0

    move-object v2, v1

    move-object v3, p1

    invoke-direct/range {v2 .. v9}, Lcom/daaw/qk;-><init>(Landroid/content/Context;Lcom/daaw/r40;Ljava/lang/String;Ljava/lang/String;IIZ)V

    iget-object p2, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1, p2}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    const/4 p2, 0x0

    invoke-virtual {v1, p1, p2}, Lcom/daaw/yj;->G(Landroid/content/Context;I)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public v(Landroidx/recyclerview/widget/RecyclerView$c0;I)V
    .locals 1

    invoke-virtual {p0, p2}, Lcom/daaw/on;->U(I)Landroid/database/Cursor;

    move-result-object v0

    check-cast p1, Lcom/daaw/uk;

    iput p2, p1, Lcom/daaw/uk;->v:I

    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/hk;->a0(Landroid/database/Cursor;ILcom/daaw/uk;)V

    return-void
.end method

.method public z()Z
    .locals 3

    sget-object v0, Lcom/daaw/yj;->u:Lcom/daaw/ww1;

    const-class v1, Lcom/daaw/hk;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
