.class public Lcom/daaw/gk;
.super Lcom/daaw/on;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/gk$i;,
        Lcom/daaw/gk$h;
    }
.end annotation


# instance fields
.field public E:[Lcom/daaw/l0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 8

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100243

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f08010e

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, Lcom/daaw/on;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 p2, 0x7

    new-array p2, p2, [Lcom/daaw/l0;

    new-instance p3, Lcom/daaw/gk$a;

    invoke-direct {p3, p0}, Lcom/daaw/gk$a;-><init>(Lcom/daaw/gk;)V

    const/4 v0, 0x0

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/gk$b;

    invoke-direct {p3, p0}, Lcom/daaw/gk$b;-><init>(Lcom/daaw/gk;)V

    const/4 v0, 0x1

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/gk$c;

    invoke-direct {p3, p0}, Lcom/daaw/gk$c;-><init>(Lcom/daaw/gk;)V

    const/4 v0, 0x2

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/gk$d;

    invoke-direct {p3, p0}, Lcom/daaw/gk$d;-><init>(Lcom/daaw/gk;)V

    const/4 v0, 0x3

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/gk$e;

    invoke-direct {p3, p0}, Lcom/daaw/gk$e;-><init>(Lcom/daaw/gk;)V

    const/4 v0, 0x4

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/gk$f;

    invoke-direct {p3, p0}, Lcom/daaw/gk$f;-><init>(Lcom/daaw/gk;)V

    const/4 v0, 0x5

    aput-object p3, p2, v0

    new-instance p3, Lcom/daaw/gk$g;

    invoke-direct {p3, p0}, Lcom/daaw/gk$g;-><init>(Lcom/daaw/gk;)V

    const/4 v0, 0x6

    aput-object p3, p2, v0

    iput-object p2, p0, Lcom/daaw/gk;->E:[Lcom/daaw/l0;

    invoke-virtual {p0, p1}, Lcom/daaw/on;->V(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic X(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/gk;->Y(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static Y(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
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

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p0, "_id"

    const-string v1, "audio_id"

    const-string v2, "_data"

    filled-new-array {p0, v1, v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 p0, 0x1

    new-array v4, p0, [Ljava/lang/String;

    const/4 p0, 0x0

    aput-object p2, v4, p0

    sget-object p0, Lcom/daaw/yj;->s:Lcom/daaw/xw1;

    invoke-virtual {p1}, Lcom/daaw/yj;->I()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    const/4 v3, 0x0

    invoke-virtual {p0, v1, p1, v3}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/ie1$h;

    const/16 p1, 0xa

    invoke-static {p0, p1}, Lcom/daaw/dp0;->c(Lcom/daaw/ie1$h;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {p2}, Lcom/daaw/br1;->y(Ljava/lang/String;)J

    move-result-wide p0

    const-string p2, "external"

    invoke-static {p2, p0, p1}, Landroid/provider/MediaStore$Audio$Playlists$Members;->getContentUri(Ljava/lang/String;J)Landroid/net/Uri;

    move-result-object v1

    const-string v3, "playlist_id=?"

    invoke-static/range {v0 .. v5}, Lcom/daaw/dp0;->e(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p3}, Lcom/daaw/dr1;->f(Landroid/database/Cursor;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    return-object p1
.end method

.method public static a0(Landroid/content/Context;Lcom/daaw/sd0;I)Lcom/daaw/lo1;
    .locals 6
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

    const/4 p1, 0x1

    const/4 p2, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    new-array p2, p1, [Ljava/lang/String;

    const/4 v1, 0x0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p2, v1

    const-string v1, "name LIKE ?"

    move-object v4, p2

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, p2

    move-object v4, v3

    move-object p0, v1

    :goto_0
    sget-object v1, Landroid/provider/MediaStore$Audio$Playlists;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string p2, "_id"

    const-string v2, "name"

    const-string v5, "_data"

    filled-new-array {p2, v2, v5}, [Ljava/lang/String;

    move-result-object v2

    aget-object v5, v2, p1

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

    invoke-static {p1, v0, v1}, Lcom/daaw/gk;->a0(Landroid/content/Context;Lcom/daaw/sd0;I)Lcom/daaw/lo1;

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

    invoke-static {p1, p2, v0}, Lcom/daaw/gk;->a0(Landroid/content/Context;Lcom/daaw/sd0;I)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public Z(Landroid/database/Cursor;ILcom/daaw/uk;)V
    .locals 5

    new-instance p2, Lcom/daaw/gk$i;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p2, v1, v2, v4}, Lcom/daaw/gk$i;-><init>(JLjava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v1

    invoke-virtual {p3, p0, p2, v1}, Lcom/daaw/uk;->b0(Lcom/daaw/wc0;Ljava/lang/Object;Lcom/daaw/sd0;)V

    sget-object p2, Lcom/daaw/yj;->x:Lcom/daaw/ww1;

    iget-object v1, p3, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v1, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v1, p3, Lcom/daaw/uk;->w:Landroid/view/View;

    invoke-virtual {v1, p2}, Landroid/view/View;->setSelected(Z)V

    iget-object p2, p0, Lcom/daaw/gk;->E:[Lcom/daaw/l0;

    const/4 v1, -0x1

    invoke-virtual {p3, p2, v1, p0}, Lcom/daaw/uk;->X([Lcom/daaw/l0;ILcom/daaw/wc0;)V

    iget-object p2, p3, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget p2, p0, Lcom/daaw/yj;->i:I

    invoke-virtual {p3, p2}, Lcom/daaw/uk;->V(I)V

    const p2, 0x7f08010e

    invoke-virtual {p3, p2}, Lcom/daaw/uk;->W(I)V

    iget-object p2, p3, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p2, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p3, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    iget p2, p0, Lcom/daaw/yj;->g:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p3, v0}, Lcom/daaw/uk;->d0(I)V

    const-string p1, ""

    invoke-virtual {p3, p1}, Lcom/daaw/uk;->c0(Ljava/lang/String;)V

    iget-object p2, p3, Lcom/daaw/uk;->B:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public c(Z)V
    .locals 2

    sget-object v0, Lcom/daaw/yj;->v:Lcom/daaw/rw1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-class v1, Lcom/daaw/gk;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    sget-object v3, Landroid/provider/MediaStore$Audio$Playlists;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v4, "name"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v6, v5, [Ljava/lang/String;

    const/4 v8, 0x0

    aput-object v1, v6, v8

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
    move-object v13, v3

    new-instance v2, Lcom/daaw/qk;

    new-instance v11, Lcom/daaw/gk$h;

    invoke-direct {v11, v1}, Lcom/daaw/gk$h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/yj;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x0

    iget v15, v0, Lcom/daaw/yj;->l:I

    const/16 v16, 0x0

    move-object v9, v2

    move-object/from16 v10, p1

    invoke-direct/range {v9 .. v16}, Lcom/daaw/qk;-><init>(Landroid/content/Context;Lcom/daaw/r40;Ljava/lang/String;Ljava/lang/String;IIZ)V

    iget-object v1, v0, Lcom/daaw/yj;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2, v1}, Lcom/daaw/yj;->q(Ljava/lang/ref/WeakReference;)V

    move-object/from16 v1, p1

    invoke-virtual {v2, v1, v8}, Lcom/daaw/yj;->G(Landroid/content/Context;I)Lcom/daaw/ts1;

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

    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/gk;->Z(Landroid/database/Cursor;ILcom/daaw/uk;)V

    return-void
.end method

.method public x(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/sd0;)V
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f100141

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-virtual {p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    aput-object p1, p3, v0

    return-void
.end method

.method public z()Z
    .locals 3

    sget-object v0, Lcom/daaw/yj;->u:Lcom/daaw/ww1;

    const-class v1, Lcom/daaw/gk;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
