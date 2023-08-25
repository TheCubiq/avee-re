.class public Lcom/daaw/vj;
.super Lcom/daaw/on;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/vj$g;,
        Lcom/daaw/vj$f;
    }
.end annotation


# instance fields
.field public E:[Lcom/daaw/l0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/daaw/on;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p2, 0x5

    new-array p2, p2, [Lcom/daaw/l0;

    new-instance p3, Lcom/daaw/vj$a;

    invoke-direct {p3, p0}, Lcom/daaw/vj$a;-><init>(Lcom/daaw/vj;)V

    const/4 p4, 0x0

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/vj$b;

    invoke-direct {p3, p0}, Lcom/daaw/vj$b;-><init>(Lcom/daaw/vj;)V

    const/4 p4, 0x1

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/vj$c;

    invoke-direct {p3, p0}, Lcom/daaw/vj$c;-><init>(Lcom/daaw/vj;)V

    const/4 p4, 0x2

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/vj$d;

    invoke-direct {p3, p0}, Lcom/daaw/vj$d;-><init>(Lcom/daaw/vj;)V

    const/4 p4, 0x3

    aput-object p3, p2, p4

    new-instance p3, Lcom/daaw/vj$e;

    invoke-direct {p3, p0}, Lcom/daaw/vj$e;-><init>(Lcom/daaw/vj;)V

    const/4 p4, 0x4

    aput-object p3, p2, p4

    iput-object p2, p0, Lcom/daaw/vj;->E:[Lcom/daaw/l0;

    invoke-virtual {p0, p1}, Lcom/daaw/on;->V(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic X(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/vj;->Z(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static Z(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 6
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

    if-nez p0, :cond_0

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p0, "_id"

    const-string v1, "_data"

    filled-new-array {p0, v1}, [Ljava/lang/String;

    move-result-object v2

    const/4 p0, 0x1

    new-array v4, p0, [Ljava/lang/String;

    const/4 p0, 0x0

    aput-object p2, v4, p0

    sget-object p2, Lcom/daaw/yj;->s:Lcom/daaw/xw1;

    invoke-virtual {p1}, Lcom/daaw/yj;->I()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    const/4 v3, 0x0

    invoke-virtual {p2, v1, p1, v3}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ie1$h;

    invoke-static {p1, p0}, Lcom/daaw/dp0;->c(Lcom/daaw/ie1$h;I)Ljava/lang/String;

    move-result-object v5

    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v3, "album_id=?"

    invoke-static/range {v0 .. v5}, Lcom/daaw/dp0;->e(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0, p3}, Lcom/daaw/dr1;->f(Landroid/database/Cursor;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    return-object p1
.end method

.method public static b0(Landroid/content/Context;Lcom/daaw/sd0;I)Lcom/daaw/lo1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/sd0;",
            "I)",
            "Lcom/daaw/lo1<",
            "Landroid/database/Cursor;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object p0, Lcom/daaw/yj;->r:Lcom/daaw/xw1;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v1, ""

    invoke-virtual {p0, p2, p1, v1}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/String;

    const/4 p2, 0x0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, p2

    const-string p2, "album LIKE ?"

    move-object v4, p1

    move-object v3, p2

    goto :goto_0

    :cond_0
    move-object v3, p1

    move-object v4, v3

    move-object p0, v1

    :goto_0
    sget-object v1, Landroid/provider/MediaStore$Audio$Albums;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string p1, "_id"

    const-string p2, "album"

    const-string v2, "numsongs"

    const-string v5, "album_art"

    const-string v6, "artist"

    filled-new-array {p1, p2, v2, v5, v6}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/daaw/dp0;->f(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    new-instance p2, Lcom/daaw/lo1;

    invoke-direct {p2, p1, p0}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method


# virtual methods
.method public E(Landroid/content/Context;I)Lcom/daaw/ts1;
    .locals 1

    new-instance p1, Lcom/daaw/d90;

    const/4 p2, 0x7

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

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v0

    iget v1, p0, Lcom/daaw/yj;->l:I

    invoke-static {p1, v0, v1}, Lcom/daaw/vj;->b0(Landroid/content/Context;Lcom/daaw/sd0;I)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public Q(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/lo1;
    .locals 1
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

    iget v0, p0, Lcom/daaw/yj;->l:I

    invoke-static {p1, p2, v0}, Lcom/daaw/vj;->b0(Landroid/content/Context;Lcom/daaw/sd0;I)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public final Y(JLandroid/content/Context;)Landroid/net/Uri;
    .locals 6

    sget-boolean v0, Lcom/daaw/g2;->a:Z

    if-nez v0, :cond_0

    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    return-object p1

    :cond_0
    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string p3, "_id"

    filled-new-array {p3}, [Ljava/lang/String;

    move-result-object v2

    const/4 p3, 0x1

    new-array v4, p3, [Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    aput-object p1, v4, p2

    const/4 v5, 0x0

    const-string v3, "album_id=?"

    invoke-static/range {v0 .. v5}, Lcom/daaw/dp0;->e(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p3, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide p1

    invoke-static {p3, p1, p2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    return-object p1
.end method

.method public a0(Landroid/database/Cursor;ILcom/daaw/uk;)V
    .locals 7

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    new-instance v2, Lcom/daaw/vj$g;

    invoke-direct {v2, v0, v1}, Lcom/daaw/vj$g;-><init>(J)V

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v3

    invoke-virtual {p3, p0, v2, v3}, Lcom/daaw/uk;->b0(Lcom/daaw/wc0;Ljava/lang/Object;Lcom/daaw/sd0;)V

    sget-object v2, Lcom/daaw/yj;->x:Lcom/daaw/ww1;

    iget-object v3, p3, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v3, v4}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, p3, Lcom/daaw/uk;->w:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->setSelected(Z)V

    iget-object v2, p0, Lcom/daaw/vj;->E:[Lcom/daaw/l0;

    const/4 v3, -0x1

    invoke-virtual {p3, v2, v3, p0}, Lcom/daaw/uk;->X([Lcom/daaw/l0;ILcom/daaw/wc0;)V

    iget-object v2, p3, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-virtual {v2, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p3, v3}, Lcom/daaw/uk;->V(I)V

    iget-object v2, p3, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/vj;->Y(JLandroid/content/Context;)Landroid/net/Uri;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget-boolean v3, Lcom/daaw/g2;->a:Z

    if-nez v3, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f08016c

    invoke-virtual {p3, v0}, Lcom/daaw/uk;->W(I)V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v3, Lcom/daaw/yj;->p:Lcom/daaw/tw1;

    new-instance v5, Lcom/daaw/i2;

    const/4 v6, 0x0

    invoke-direct {v5, v0, v2, v6}, Lcom/daaw/i2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p3, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v5, v0, v2, v4}, Lcom/daaw/tw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    iget-object v0, p3, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    iget v2, p0, Lcom/daaw/yj;->g:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p3, p2}, Lcom/daaw/uk;->d0(I)V

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/daaw/uk;->c0(Ljava/lang/String;)V

    iget-object p2, p3, Lcom/daaw/uk;->B:Landroid/widget/TextView;

    const/4 p3, 0x2

    invoke-interface {p1, p3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    sget-object v3, Landroid/provider/MediaStore$Audio$Albums;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v4, "_id"

    const-string v5, "album"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x1

    new-array v6, v8, [Ljava/lang/String;

    const/4 v9, 0x0

    aput-object v1, v6, v9

    const-string v5, "_id=?"

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lcom/daaw/dp0;->e(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    invoke-static {v2, v8}, Lcom/daaw/dp0;->a(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_0
    const-string v3, ""

    :goto_0
    move-object v14, v3

    new-instance v2, Lcom/daaw/qk;

    new-instance v12, Lcom/daaw/vj$f;

    invoke-direct {v12, v1}, Lcom/daaw/vj$f;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x0

    iget v1, v0, Lcom/daaw/yj;->l:I

    const/16 v17, 0x0

    move-object v10, v2

    move-object/from16 v11, p1

    move/from16 v16, v1

    invoke-direct/range {v10 .. v17}, Lcom/daaw/qk;-><init>(Landroid/content/Context;Lcom/daaw/r40;Ljava/lang/String;Ljava/lang/String;IIZ)V

    iget-object v1, v0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2, v1}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    move-object/from16 v1, p1

    invoke-virtual {v2, v1, v9}, Lcom/daaw/yj;->G(Landroid/content/Context;I)Lcom/daaw/ts1;

    move-result-object v1

    return-object v1
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

    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/vj;->a0(Landroid/database/Cursor;ILcom/daaw/uk;)V

    return-void
.end method

.method public x(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/sd0;)V
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f100137

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method
