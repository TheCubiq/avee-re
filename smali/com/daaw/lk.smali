.class public Lcom/daaw/lk;
.super Lcom/daaw/n10;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/lk$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/n10<",
        "Lcom/daaw/sc1;",
        "Ljava/util/List<",
        "Lcom/daaw/sc1;",
        ">;>;"
    }
.end annotation


# static fields
.field public static L:Lcom/daaw/kw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/kw1<",
            "Lcom/daaw/uk;",
            "Lcom/daaw/sc1;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public K:[Lcom/daaw/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/kw1;

    invoke-direct {v0}, Lcom/daaw/kw1;-><init>()V

    sput-object v0, Lcom/daaw/lk;->L:Lcom/daaw/kw1;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/r40;Ljava/lang/String;Lcom/daaw/me0;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/r40<",
            "Lcom/daaw/yj;",
            "Ljava/util/List<",
            "Lcom/daaw/sc1;",
            ">;>;",
            "Ljava/lang/String;",
            "Lcom/daaw/me0<",
            "Ljava/lang/String;",
            ">;II)V"
        }
    .end annotation

    new-instance v3, Lcom/daaw/f6;

    invoke-direct {v3}, Lcom/daaw/f6;-><init>()V

    new-instance v7, Lcom/daaw/r91;

    invoke-direct {v7, p1}, Lcom/daaw/r91;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/daaw/n10;-><init>(Landroid/content/Context;Lcom/daaw/r40;Lcom/daaw/w40;Ljava/lang/String;Lcom/daaw/me0;ILcom/daaw/m10;I)V

    const/4 p1, 0x1

    new-array p1, p1, [Lcom/daaw/l0;

    new-instance p2, Lcom/daaw/lk$a;

    invoke-direct {p2, p0}, Lcom/daaw/lk$a;-><init>(Lcom/daaw/lk;)V

    const/4 p3, 0x0

    aput-object p2, p1, p3

    iput-object p1, p0, Lcom/daaw/lk;->K:[Lcom/daaw/l0;

    return-void
.end method

.method public static synthetic X(Lcom/daaw/uk;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/lk;->Y(Lcom/daaw/uk;)V

    return-void
.end method

.method public static synthetic Y(Lcom/daaw/uk;)V
    .locals 0

    return-void
.end method

.method public static Z(Lcom/daaw/yj;Lcom/daaw/er0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yj;",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/sc1;",
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

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lcom/daaw/tf1;->d(Lcom/daaw/ie1$h;I)Ljava/util/Comparator;

    move-result-object p0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-static {p1, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "Comparator<Tuple2<PlaylistSong, StationEntry>> exception"

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public E(Landroid/content/Context;I)Lcom/daaw/ts1;
    .locals 1

    new-instance p1, Lcom/daaw/d90;

    const/16 p2, 0xe

    const/16 v0, 0xf

    invoke-direct {p1, p0, p0, p2, v0}, Lcom/daaw/d90;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;II)V

    new-instance p2, Lcom/daaw/ts1;

    invoke-direct {p2, p1, p0}, Lcom/daaw/ts1;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;)V

    return-object p2
.end method

.method public H(I)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public g(Lcom/daaw/al;I)V
    .locals 0

    return-void
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public o(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/daaw/r91;

    invoke-direct {v0, p1}, Lcom/daaw/r91;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/n10;->W(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m10;)V

    return-void
.end method

.method public v(Landroidx/recyclerview/widget/RecyclerView$c0;I)V
    .locals 18

    move-object/from16 v7, p0

    move/from16 v8, p2

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/bk0;->S()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/daaw/sc1;

    move-object/from16 v10, p1

    check-cast v10, Lcom/daaw/uk;

    iput v8, v10, Lcom/daaw/uk;->v:I

    sget-object v0, Lcom/daaw/yj;->q:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    new-instance v0, Lcom/daaw/lk$b;

    invoke-direct {v0, v9, v8}, Lcom/daaw/lk$b;-><init>(Lcom/daaw/sc1;I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v2

    invoke-virtual {v10, v7, v0, v2}, Lcom/daaw/uk;->b0(Lcom/daaw/wc0;Ljava/lang/Object;Lcom/daaw/sd0;)V

    iget-object v0, v9, Lcom/daaw/pf1;->b:Ljava/lang/String;

    iput-object v0, v10, Lcom/daaw/uk;->u:Ljava/lang/Object;

    sget-object v0, Lcom/daaw/yj;->x:Lcom/daaw/ww1;

    iget-object v2, v10, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    invoke-virtual {v0, v2, v1}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, v10, Lcom/daaw/uk;->w:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setSelected(Z)V

    iget-object v1, v7, Lcom/daaw/lk;->K:[Lcom/daaw/l0;

    sget-object v6, Lcom/daaw/kk;->a:Lcom/daaw/kk;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v10

    move-object/from16 v3, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/uk;->Y([Lcom/daaw/l0;ILcom/daaw/wc0;ZZLcom/daaw/e0;)V

    const/4 v0, 0x0

    iget-object v1, v10, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    if-eqz v11, :cond_0

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, v10, Lcom/daaw/uk;->y:Landroid/widget/TextView;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    add-int/2addr v3, v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v0

    const-string v3, "%d."

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object v1, v10, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v1, -0x1

    invoke-virtual {v10, v1}, Lcom/daaw/uk;->V(I)V

    new-instance v1, Lcom/daaw/i2;

    iget-object v2, v9, Lcom/daaw/pf1;->b:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iget-object v3, v9, Lcom/daaw/pf1;->a:Ljava/lang/String;

    const-string v4, "abc"

    invoke-direct {v1, v2, v4, v3}, Lcom/daaw/i2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v12, Lcom/daaw/g2;

    invoke-direct {v12}, Lcom/daaw/g2;-><init>()V

    iget-object v13, v1, Lcom/daaw/i2;->a:Landroid/net/Uri;

    iget-object v14, v1, Lcom/daaw/i2;->b:Ljava/lang/String;

    iget-object v15, v1, Lcom/daaw/i2;->c:Ljava/lang/String;

    iget-object v1, v10, Lcom/daaw/uk;->x:Landroid/widget/ImageView;

    const/16 v17, 0x1

    move-object/from16 v16, v1

    invoke-virtual/range {v12 .. v17}, Lcom/daaw/g2;->t(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Z)V

    iget-object v1, v10, Lcom/daaw/uk;->z:Landroid/widget/TextView;

    iget-object v2, v9, Lcom/daaw/pf1;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v10, v0}, Lcom/daaw/uk;->d0(I)V

    invoke-virtual {v9}, Lcom/daaw/sc1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/daaw/uk;->c0(Ljava/lang/String;)V

    iget-object v0, v10, Lcom/daaw/uk;->B:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v10}, Lcom/daaw/uk;->R()V

    sget-object v0, Lcom/daaw/lk;->L:Lcom/daaw/kw1;

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v10, v9, v1}, Lcom/daaw/kw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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
