.class public Lcom/daaw/jk;
.super Lcom/daaw/on;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/lang/ref/WeakReference;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/wc0$b;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7f10018a

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v3, "/"

    const v5, 0x7f0800f4

    move-object v1, p0

    move-object v2, p1

    move v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lcom/daaw/on;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/ref/WeakReference;)V

    invoke-virtual {p0, p1}, Lcom/daaw/on;->V(Landroid/content/Context;)V

    return-void
.end method

.method public static Y(Lcom/daaw/wc0$b;)Landroid/database/Cursor;
    .locals 6

    const-string v0, "_id"

    const-string v1, ""

    filled-new-array {v0, v1, v1, v1}, [Ljava/lang/String;

    move-result-object v0

    new-instance v2, Landroid/database/MatrixCursor;

    invoke-direct {v2, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    const-string v0, "-1"

    const-string v3, "2131755322"

    const-string v4, "2131230990"

    filled-new-array {v0, v3, v1, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    const-string v0, "0"

    const-string v3, "2131755331"

    const-string v5, "2131230995"

    filled-new-array {v0, v3, v1, v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    const-string v0, "1"

    const-string v3, "2131755318"

    const-string v5, "2131230925"

    filled-new-array {v0, v3, v1, v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    const-string v0, "2"

    const-string v3, "2131755320"

    const-string v5, "2131230926"

    filled-new-array {v0, v3, v1, v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    const-string v0, "3"

    const-string v3, "2131755325"

    const-string v5, "2131230977"

    filled-new-array {v0, v3, v1, v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    const-string v0, "4"

    const-string v3, "2131755328"

    filled-new-array {v0, v3, v1, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    const-string v0, "5"

    const-string v3, "2131755323"

    const-string v4, "2131230954"

    filled-new-array {v0, v3, v1, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/daaw/wc0$b;->d()I

    move-result p0

    if-nez p0, :cond_0

    const-string p0, "6"

    const-string v0, "2131755327"

    const-string v3, "2131230948"

    filled-new-array {p0, v0, v1, v3}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p0, "7"

    const-string v0, "2131755300"

    const-string v1, "dir.xiph.org"

    const-string v3, "2131231010"

    filled-new-array {p0, v0, v1, v3}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    const-string p0, "8"

    const-string v0, "2131755602"

    const-string v1, "www.shoutcast.com"

    filled-new-array {p0, v0, v1, v3}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    :goto_0
    return-object v2
.end method


# virtual methods
.method public A()Z
    .locals 3

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/jk;->P(Landroid/content/Context;)Lcom/daaw/lo1;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v0, Landroid/database/Cursor;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Lcom/daaw/on;->W(Landroid/database/Cursor;Ljava/lang/String;)V

    return v1
.end method

.method public E(Landroid/content/Context;I)Lcom/daaw/ts1;
    .locals 1

    new-instance p1, Lcom/daaw/d90;

    const/4 p2, 0x3

    const/16 v0, 0x10

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
    .locals 2
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

    new-instance p1, Lcom/daaw/lo1;

    iget-object v0, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/wc0$b;

    invoke-static {v0}, Lcom/daaw/jk;->Y(Lcom/daaw/wc0$b;)Landroid/database/Cursor;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public X(Landroid/database/Cursor;ILcom/daaw/uk;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p2

    invoke-virtual {p3, p0, p2}, Lcom/daaw/uk;->a0(Lcom/daaw/wc0;Lcom/daaw/sd0;)V

    const/4 p2, 0x3

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p3, v0}, Lcom/daaw/uk;->W(I)V

    iget v0, p0, Lcom/daaw/yj;->i:I

    invoke-virtual {p3, v0}, Lcom/daaw/uk;->V(I)V

    iget-object v0, p3, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    iget v2, p0, Lcom/daaw/yj;->g:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p3, v1}, Lcom/daaw/uk;->d0(I)V

    iget-object v0, p3, Lcom/daaw/uk;->B:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "6"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/daaw/uk;->W(I)V

    iget p1, p0, Lcom/daaw/yj;->h:I

    invoke-virtual {p3, p1}, Lcom/daaw/uk;->V(I)V

    iget-object p1, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    iget p2, p0, Lcom/daaw/yj;->h:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string v1, "7"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string v1, "8"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_1
    invoke-virtual {p3, v0}, Lcom/daaw/uk;->d0(I)V

    const/4 p2, 0x2

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/daaw/uk;->c0(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public c(Z)V
    .locals 2

    sget-object v0, Lcom/daaw/yj;->v:Lcom/daaw/rw1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-class v1, Lcom/daaw/jk;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 11

    const-string v0, "_id"

    invoke-virtual {p0, v0, p2}, Lcom/daaw/on;->S(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ltz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/on;->U(I)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v0}, Lcom/daaw/on;->U(I)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move v9, v0

    move-object v8, v4

    goto :goto_0

    :cond_0
    const-string v4, ""

    move-object v8, v4

    const/4 v9, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, 0x2

    sparse-switch v4, :sswitch_data_0

    :goto_1
    const/4 v1, -0x1

    goto/16 :goto_2

    :sswitch_0
    const-string v1, "-1"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    goto :goto_2

    :sswitch_1
    const-string v1, "8"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x7

    goto :goto_2

    :sswitch_2
    const-string v1, "7"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x6

    goto :goto_2

    :sswitch_3
    const-string v1, "5"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x5

    goto :goto_2

    :sswitch_4
    const-string v1, "4"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v1, 0x4

    goto :goto_2

    :sswitch_5
    const-string v4, "3"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_1

    :sswitch_6
    const-string v1, "2"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_1

    :cond_6
    const/4 v1, 0x2

    goto :goto_2

    :sswitch_7
    const-string v1, "1"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_1

    :cond_7
    const/4 v1, 0x1

    goto :goto_2

    :sswitch_8
    const-string v1, "0"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_1

    :cond_8
    const/4 v1, 0x0

    :cond_9
    :goto_2
    packed-switch v1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    new-instance v0, Lcom/daaw/wj;

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/yj;->l:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/wj;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object p2, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v0, p1, v3}, Lcom/daaw/yj;->G(Landroid/content/Context;I)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :pswitch_1
    const v0, 0x7f100252

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v1, Lcom/daaw/tr1;

    invoke-direct {v1, v0}, Lcom/daaw/tr1;-><init>(Ljava/lang/Object;)V

    const v0, 0x7f080122

    iget v2, p0, Lcom/daaw/yj;->l:I

    invoke-static {p1, p2, v1, v0, v2}, Lcom/daaw/mk;->X(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/me0;II)Lcom/daaw/mk;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2, v0}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p2, p1}, Lcom/daaw/yj;->F(Landroid/content/Context;)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :pswitch_2
    const v0, 0x7f100124

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v0, Lcom/daaw/dk;

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const v5, 0x7f080122

    iget v6, p0, Lcom/daaw/yj;->l:I

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/daaw/dk;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object p2, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v0, p1}, Lcom/daaw/yj;->F(Landroid/content/Context;)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :pswitch_3
    new-instance v0, Lcom/daaw/ak;

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/yj;->l:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/ak;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object p2, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v0, p1}, Lcom/daaw/yj;->F(Landroid/content/Context;)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance v0, Lcom/daaw/gk;

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget v4, p0, Lcom/daaw/yj;->l:I

    invoke-direct {v0, p1, v1, v4}, Lcom/daaw/gk;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    new-instance v1, Lcom/daaw/hk;

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget v4, p0, Lcom/daaw/yj;->l:I

    invoke-direct {v1, p1, p2, v4}, Lcom/daaw/hk;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    new-instance p2, Lcom/daaw/ti;

    new-array v4, v5, [Lcom/daaw/wc0;

    aput-object v0, v4, v3

    aput-object v1, v4, v2

    new-instance v2, Lcom/daaw/tr1;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f100140

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/daaw/tr1;-><init>(Ljava/lang/Object;)V

    const v3, 0x7f08010e

    new-instance v5, Lcom/daaw/jk$a;

    invoke-direct {v5, p0, v0, v1}, Lcom/daaw/jk$a;-><init>(Lcom/daaw/jk;Lcom/daaw/gk;Lcom/daaw/hk;)V

    invoke-direct {p2, v4, v2, v3, v5}, Lcom/daaw/ti;-><init>([Lcom/daaw/wc0;Lcom/daaw/me0;ILcom/daaw/ti$a;)V

    iget-object v0, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2, v0}, Lcom/daaw/ti;->q(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p2, p1}, Lcom/daaw/ti;->r(Landroid/content/Context;)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance v0, Lcom/daaw/bk;

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/yj;->l:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/bk;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object p2, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v0, p1}, Lcom/daaw/yj;->F(Landroid/content/Context;)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :pswitch_6
    new-instance v0, Lcom/daaw/xj;

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/yj;->l:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/xj;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object p2, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v0, p1}, Lcom/daaw/yj;->F(Landroid/content/Context;)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :pswitch_7
    new-instance v0, Lcom/daaw/vj;

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/yj;->l:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/vj;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object p2, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v0, p1}, Lcom/daaw/yj;->F(Landroid/content/Context;)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :pswitch_8
    new-instance v0, Lcom/daaw/ik;

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget v10, p0, Lcom/daaw/yj;->l:I

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v5 .. v10}, Lcom/daaw/ik;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object p2, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, p2}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v0, p1, v3}, Lcom/daaw/yj;->G(Landroid/content/Context;I)Lcom/daaw/ts1;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x30 -> :sswitch_8
        0x31 -> :sswitch_7
        0x32 -> :sswitch_6
        0x33 -> :sswitch_5
        0x34 -> :sswitch_4
        0x35 -> :sswitch_3
        0x37 -> :sswitch_2
        0x38 -> :sswitch_1
        0x5a4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/jk;->X(Landroid/database/Cursor;ILcom/daaw/uk;)V

    return-void
.end method

.method public z()Z
    .locals 3

    sget-object v0, Lcom/daaw/yj;->u:Lcom/daaw/ww1;

    const-class v1, Lcom/daaw/jk;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
