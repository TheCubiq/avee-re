.class public Lcom/daaw/ak;
.super Lcom/daaw/on;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ak$h;
    }
.end annotation


# instance fields
.field public E:[Lcom/daaw/l0;

.field public F:[Lcom/daaw/l0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/daaw/on;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p2, 0x6

    new-array p2, p2, [Lcom/daaw/l0;

    new-instance p3, Lcom/daaw/ak$a;

    invoke-direct {p3, p0}, Lcom/daaw/ak$a;-><init>(Lcom/daaw/ak;)V

    const/4 p4, 0x0

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/ak$b;

    invoke-direct {p3, p0}, Lcom/daaw/ak$b;-><init>(Lcom/daaw/ak;)V

    const/4 p4, 0x1

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/ak$c;

    invoke-direct {p3, p0}, Lcom/daaw/ak$c;-><init>(Lcom/daaw/ak;)V

    const/4 p5, 0x2

    aput-object p3, p2, p5

    new-instance p3, Lcom/daaw/ak$d;

    invoke-direct {p3, p0}, Lcom/daaw/ak$d;-><init>(Lcom/daaw/ak;)V

    const/4 p5, 0x3

    aput-object p3, p2, p5

    new-instance p3, Lcom/daaw/ak$e;

    invoke-direct {p3, p0}, Lcom/daaw/ak$e;-><init>(Lcom/daaw/ak;)V

    const/4 p5, 0x4

    aput-object p3, p2, p5

    new-instance p3, Lcom/daaw/ak$f;

    invoke-direct {p3, p0}, Lcom/daaw/ak$f;-><init>(Lcom/daaw/ak;)V

    const/4 p5, 0x5

    aput-object p3, p2, p5

    iput-object p2, p0, Lcom/daaw/ak;->E:[Lcom/daaw/l0;

    array-length p3, p2

    sub-int/2addr p3, p4

    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lcom/daaw/l0;

    iput-object p2, p0, Lcom/daaw/ak;->F:[Lcom/daaw/l0;

    invoke-virtual {p0, p1}, Lcom/daaw/on;->V(Landroid/content/Context;)V

    new-instance p2, Landroid/content/IntentFilter;

    invoke-direct {p2}, Landroid/content/IntentFilter;-><init>()V

    const-string p3, "android.intent.action.MEDIA_UNMOUNTED"

    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string p4, "android.intent.action.MEDIA_MOUNTED"

    invoke-virtual {p2, p4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string p3, "android.intent.action.MEDIA_CHECKING"

    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string p3, "android.intent.action.MEDIA_EJECT"

    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string p3, "android.intent.action.MEDIA_UNMOUNTABLE"

    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string p3, "android.intent.action.MEDIA_REMOVED"

    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string p3, "android.intent.action.MEDIA_BAD_REMOVAL"

    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string p3, "file"

    invoke-virtual {p2, p3}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    new-instance p3, Lcom/daaw/ak$g;

    invoke-direct {p3, p0}, Lcom/daaw/ak$g;-><init>(Lcom/daaw/ak;)V

    invoke-virtual {p1, p3, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public static synthetic X(Lcom/daaw/ak;Landroid/database/Cursor;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/on;->W(Landroid/database/Cursor;Ljava/lang/String;)V

    return-void
.end method

.method public static Z(Ljava/lang/String;)I
    .locals 1

    if-eqz p0, :cond_2

    const-string v0, "-01"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "-03"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "-02"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    const p0, 0x7f08011b

    return p0

    :cond_0
    const p0, 0x7f08010d

    return p0

    :cond_1
    const p0, 0x7f080129

    return p0

    :cond_2
    const p0, 0x7f0800ea

    return p0
.end method

.method public static b0(Landroid/content/Context;Lcom/daaw/sd0;)Lcom/daaw/lo1;
    .locals 7
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

    invoke-virtual {p1, p0}, Lcom/daaw/j5;->G(Landroid/content/Context;)Lcom/daaw/er0;

    move-result-object p0

    const-string p1, "_id"

    const-string v0, "path"

    const-string v1, "icon"

    const-string v2, "name"

    filled-new-array {p1, v0, v1, v2}, [Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/database/MatrixCursor;

    invoke-direct {v0, p1}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/er0;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    const-string v1, ""

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/lo1;

    iget-object v2, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/String;

    iget-object v4, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    aget-object v4, v2, v5

    const/4 v5, 0x1

    aput-object v4, v3, v5

    const/4 v4, 0x2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/ak;->Z(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v4

    const/4 p1, 0x3

    array-length v1, v2

    if-le v1, v5, :cond_0

    aget-object v1, v2, v5

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    aput-object v1, v3, p1

    invoke-virtual {v0, v3}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p0, Lcom/daaw/lo1;

    invoke-direct {p0, v0, v1}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public E(Landroid/content/Context;I)Lcom/daaw/ts1;
    .locals 1

    new-instance p1, Lcom/daaw/d90;

    const/4 p2, 0x5

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

    invoke-static {p1, v0}, Lcom/daaw/ak;->b0(Landroid/content/Context;Lcom/daaw/sd0;)Lcom/daaw/lo1;

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

    invoke-static {p1, p2}, Lcom/daaw/ak;->b0(Landroid/content/Context;Lcom/daaw/sd0;)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public Y(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;"
        }
    .end annotation

    iget v0, p0, Lcom/daaw/yj;->l:I

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v1

    invoke-static {p1, v0, v1, p2, p3}, Lcom/daaw/zj;->c0(Landroid/content/Context;ILcom/daaw/sd0;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a0(Landroid/database/Cursor;ILcom/daaw/uk;)V
    .locals 6

    new-instance v0, Lcom/daaw/ak$h;

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

    invoke-direct {v0, v1, p2}, Lcom/daaw/ak$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p2

    invoke-virtual {p3, p0, v0, p2}, Lcom/daaw/uk;->b0(Lcom/daaw/wc0;Ljava/lang/Object;Lcom/daaw/sd0;)V

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, "-"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    sget-object v1, Lcom/daaw/yj;->x:Lcom/daaw/ww1;

    iget-object v4, p3, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v4, v5}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v4, p3, Lcom/daaw/uk;->w:Landroid/view/View;

    invoke-virtual {v4, v1}, Landroid/view/View;->setSelected(Z)V

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ak;->F:[Lcom/daaw/l0;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ak;->E:[Lcom/daaw/l0;

    :goto_0
    const/4 v1, -0x1

    invoke-virtual {p3, v0, v1, p0}, Lcom/daaw/uk;->X([Lcom/daaw/l0;ILcom/daaw/wc0;)V

    iget-object v0, p3, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget v0, p0, Lcom/daaw/yj;->i:I

    invoke-virtual {p3, v0}, Lcom/daaw/uk;->V(I)V

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p3, v0}, Lcom/daaw/uk;->W(I)V

    iget-object v0, p3, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object p1, p3, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p2, v0, p1}, Lcom/daaw/dl;->c(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_1
    iget-object p2, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    iget p2, p0, Lcom/daaw/yj;->g:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p3, v2}, Lcom/daaw/uk;->d0(I)V

    invoke-virtual {p3, v0}, Lcom/daaw/uk;->c0(Ljava/lang/String;)V

    iget-object p1, p3, Lcom/daaw/uk;->B:Landroid/widget/TextView;

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 3

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

    new-instance v1, Lcom/daaw/zj;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget v0, p0, Lcom/daaw/yj;->l:I

    invoke-direct {v1, p1, v2, p2, v0}, Lcom/daaw/zj;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;I)V

    iget-object p2, p0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1, p2}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v1, p1}, Lcom/daaw/yj;->F(Landroid/content/Context;)Lcom/daaw/ts1;

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

    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/ak;->a0(Landroid/database/Cursor;ILcom/daaw/uk;)V

    return-void
.end method
