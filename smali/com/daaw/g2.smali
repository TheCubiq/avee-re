.class public Lcom/daaw/g2;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/g2$c;,
        Lcom/daaw/g2$b;
    }
.end annotation


# static fields
.field public static final a:Z

.field public static b:Lcom/daaw/ww1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ww1<",
            "Ljava/lang/Object;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Landroid/graphics/drawable/Drawable;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-boolean v0, Lcom/daaw/br1;->a:Z

    xor-int/lit8 v0, v0, 0x1

    sput-boolean v0, Lcom/daaw/g2;->a:Z

    new-instance v0, Lcom/daaw/ww1;

    invoke-direct {v0}, Lcom/daaw/ww1;-><init>()V

    sput-object v0, Lcom/daaw/g2;->b:Lcom/daaw/ww1;

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/g2;->c:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/su;IILcom/daaw/ir1;)Lcom/daaw/l70;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/g2;->n(Lcom/daaw/su;IILcom/daaw/ir1;)Lcom/daaw/l70;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lcom/daaw/r60;Lcom/daaw/ye0;Lcom/daaw/l31;Lcom/daaw/l31;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/daaw/g2;->q(Ljava/lang/Object;Lcom/daaw/r60;Lcom/daaw/ye0;Lcom/daaw/l31;Lcom/daaw/l31;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;Lcom/daaw/l31;Lcom/daaw/l31;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/g2;->r(Ljava/lang/Object;Lcom/daaw/l31;Lcom/daaw/l31;)V

    return-void
.end method

.method public static synthetic d(Lcom/daaw/l31;Lcom/daaw/l31;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/g2;->p(Lcom/daaw/l31;Lcom/daaw/l31;)V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/af0;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;Lcom/daaw/l70;Z)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/daaw/g2;->o(Lcom/daaw/af0;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;Lcom/daaw/l70;Z)V

    return-void
.end method

.method public static synthetic f(Lcom/daaw/g2;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/g2;->u(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/daaw/g2;Ljava/lang/String;Ljava/lang/String;IIII)Landroid/graphics/Bitmap;
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/g2;->x(Ljava/lang/String;Ljava/lang/String;IIII)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/daaw/g2;Landroid/content/Context;)Lcom/daaw/r41;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/g2;->m(Landroid/content/Context;)Lcom/daaw/r41;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/daaw/af0;Lcom/daaw/l70;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/daaw/g2;->y(Lcom/daaw/af0;Lcom/daaw/l70;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;)V

    return-void
.end method

.method public static synthetic n(Lcom/daaw/su;IILcom/daaw/ir1;)Lcom/daaw/l70;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/f60;->o(II)Lcom/daaw/x50;

    move-result-object p0

    const-wide/16 p1, 0x2328

    :try_start_0
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, p1, p2, p3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/l70;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/util/concurrent/TimeoutException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/util/concurrent/ExecutionException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_0
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method public static synthetic o(Lcom/daaw/af0;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;Lcom/daaw/l70;Z)V
    .locals 0

    invoke-static {p0, p4, p1, p2, p3}, Lcom/daaw/g2;->y(Lcom/daaw/af0;Lcom/daaw/l70;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;)V

    return-void
.end method

.method public static synthetic p(Lcom/daaw/l31;Lcom/daaw/l31;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/l31;->a:Ljava/lang/Object;

    iget-object p0, p1, Lcom/daaw/l31;->a:Ljava/lang/Object;

    if-eqz p0, :cond_0

    check-cast p0, Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    iput-object v0, p1, Lcom/daaw/l31;->a:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic q(Ljava/lang/Object;Lcom/daaw/r60;Lcom/daaw/ye0;Lcom/daaw/l31;Lcom/daaw/l31;)Landroid/graphics/Bitmap;
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/r60;->i()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1, p2, p3, p4}, Lcom/daaw/vg;->d(Landroid/graphics/Bitmap;Lcom/daaw/ye0;Lcom/daaw/l31;Lcom/daaw/l31;)Landroid/graphics/Bitmap;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static synthetic r(Ljava/lang/Object;Lcom/daaw/l31;Lcom/daaw/l31;)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p1, Lcom/daaw/l31;->a:Ljava/lang/Object;

    iget-object p1, p2, Lcom/daaw/l31;->a:Ljava/lang/Object;

    if-eqz p1, :cond_0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    iput-object v0, p2, Lcom/daaw/l31;->a:Ljava/lang/Object;

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static y(Lcom/daaw/af0;Lcom/daaw/l70;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const/4 v4, 0x0

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/df0;

    invoke-direct {v1, v4}, Lcom/daaw/df0;-><init>(Landroid/graphics/Bitmap;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/af0;->b(Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v5, v1, Lcom/daaw/h70;

    if-eqz v5, :cond_1

    check-cast v1, Lcom/daaw/h70;

    new-instance v5, Lcom/daaw/l31;

    invoke-direct {v5, v4}, Lcom/daaw/l31;-><init>(Ljava/lang/Object;)V

    new-instance v6, Lcom/daaw/l31;

    invoke-direct {v6, v4}, Lcom/daaw/l31;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/daaw/h70;->d()Landroid/graphics/Bitmap;

    move-result-object v1

    move-object/from16 v10, p4

    invoke-static {v1, v10, v6, v5}, Lcom/daaw/vg;->d(Landroid/graphics/Bitmap;Lcom/daaw/ye0;Lcom/daaw/l31;Lcom/daaw/l31;)Landroid/graphics/Bitmap;

    move-result-object v1

    new-instance v4, Lcom/daaw/df0;

    new-instance v7, Lcom/daaw/a2;

    invoke-direct {v7, v5, v6}, Lcom/daaw/a2;-><init>(Lcom/daaw/l31;Lcom/daaw/l31;)V

    invoke-direct {v4, v1, v7}, Lcom/daaw/df0;-><init>(Landroid/graphics/Bitmap;Lcom/daaw/h0;)V

    :goto_0
    invoke-interface {v0, v4, v2, v3}, Lcom/daaw/af0;->b(Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object/from16 v10, p4

    instance-of v5, v1, Lcom/daaw/s60;

    if-eqz v5, :cond_2

    check-cast v1, Lcom/daaw/s60;

    invoke-virtual {v1}, Lcom/daaw/s60;->e()Lcom/daaw/r60;

    move-result-object v9

    new-instance v5, Ljava/lang/Object;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lcom/daaw/l31;

    invoke-direct {v6, v4}, Lcom/daaw/l31;-><init>(Ljava/lang/Object;)V

    new-instance v13, Lcom/daaw/l31;

    invoke-direct {v13, v4}, Lcom/daaw/l31;-><init>(Ljava/lang/Object;)V

    new-instance v4, Lcom/daaw/ef0;

    invoke-virtual {v1}, Lcom/daaw/s60;->f()Landroid/graphics/Bitmap;

    move-result-object v15

    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/daaw/c2;

    invoke-direct {v1, v9}, Lcom/daaw/c2;-><init>(Lcom/daaw/r60;)V

    new-instance v14, Lcom/daaw/z1;

    invoke-direct {v14, v9}, Lcom/daaw/z1;-><init>(Lcom/daaw/r60;)V

    new-instance v12, Lcom/daaw/y1;

    invoke-direct {v12, v9}, Lcom/daaw/y1;-><init>(Lcom/daaw/r60;)V

    new-instance v19, Lcom/daaw/d2;

    move-object/from16 v7, v19

    move-object v8, v5

    move-object/from16 v10, p4

    move-object v11, v13

    move-object/from16 v18, v12

    move-object v12, v6

    invoke-direct/range {v7 .. v12}, Lcom/daaw/d2;-><init>(Ljava/lang/Object;Lcom/daaw/r60;Lcom/daaw/ye0;Lcom/daaw/l31;Lcom/daaw/l31;)V

    new-instance v7, Lcom/daaw/b2;

    invoke-direct {v7, v5, v6, v13}, Lcom/daaw/b2;-><init>(Ljava/lang/Object;Lcom/daaw/l31;Lcom/daaw/l31;)V

    move-object v5, v14

    move-object v14, v4

    move-object/from16 v16, v1

    move-object/from16 v17, v5

    move-object/from16 v20, v7

    invoke-direct/range {v14 .. v20}, Lcom/daaw/ef0;-><init>(Landroid/graphics/Bitmap;Lcom/daaw/w40;Lcom/daaw/h0;Lcom/daaw/h0;Lcom/daaw/w40;Lcom/daaw/h0;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public A(Landroid/net/Uri;ZLcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)Lcom/daaw/su;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Z",
            "Lcom/daaw/bc;",
            "Landroid/content/Context;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)",
            "Lcom/daaw/su<",
            "*>;"
        }
    .end annotation

    move-object v9, p0

    move-object/from16 v10, p4

    invoke-virtual {p0, v10}, Lcom/daaw/g2;->m(Landroid/content/Context;)Lcom/daaw/r41;

    move-result-object v0

    move-object v1, p1

    invoke-virtual {v0, p1}, Lcom/daaw/r41;->t(Landroid/net/Uri;)Lcom/daaw/uu;

    move-result-object v0

    const v1, 0x7f08016c

    invoke-virtual {v0, v1}, Lcom/daaw/su;->N(I)Lcom/daaw/su;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/su;->I(I)Lcom/daaw/su;

    move-result-object v0

    sget-object v1, Lcom/daaw/wt;->s:Lcom/daaw/wt;

    invoke-virtual {v0, v1}, Lcom/daaw/su;->G(Lcom/daaw/wt;)Lcom/daaw/su;

    move-result-object v11

    if-eqz p2, :cond_0

    invoke-virtual {v11}, Lcom/daaw/su;->J()Lcom/daaw/su;

    :cond_0
    new-instance v12, Lcom/daaw/g2$c;

    move-object v0, v12

    move-object v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move/from16 v7, p8

    move/from16 v8, p9

    invoke-direct/range {v0 .. v8}, Lcom/daaw/g2$c;-><init>(Lcom/daaw/g2;Lcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)V

    new-instance v0, Lcom/daaw/bh1;

    iget-object v1, v12, Lcom/daaw/g2$b;->i:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/daaw/bh1;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Lcom/daaw/su;->O(Lcom/daaw/hi0;)Lcom/daaw/su;

    invoke-virtual {v11, v12}, Lcom/daaw/su;->K(Lcom/daaw/q41;)Lcom/daaw/su;

    move-object/from16 v0, p3

    invoke-virtual {p0, v10, v0}, Lcom/daaw/g2;->l(Landroid/content/Context;Lcom/daaw/bc;)Lcom/daaw/d51;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/daaw/su;->F(Lcom/daaw/d51;)Lcom/daaw/su;

    return-object v11
.end method

.method public B(Ljava/lang/Integer;ZLcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)Lcom/daaw/su;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Z",
            "Lcom/daaw/bc;",
            "Landroid/content/Context;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)",
            "Lcom/daaw/su<",
            "*>;"
        }
    .end annotation

    move-object v9, p0

    move-object/from16 v3, p4

    invoke-virtual {p0, v3}, Lcom/daaw/g2;->m(Landroid/content/Context;)Lcom/daaw/r41;

    move-result-object v0

    move-object v1, p1

    invoke-virtual {v0, p1}, Lcom/daaw/r41;->u(Ljava/lang/Integer;)Lcom/daaw/uu;

    move-result-object v0

    const v1, 0x7f08016c

    invoke-virtual {v0, v1}, Lcom/daaw/su;->N(I)Lcom/daaw/su;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/su;->I(I)Lcom/daaw/su;

    move-result-object v0

    sget-object v1, Lcom/daaw/wt;->s:Lcom/daaw/wt;

    invoke-virtual {v0, v1}, Lcom/daaw/su;->G(Lcom/daaw/wt;)Lcom/daaw/su;

    move-result-object v10

    if-eqz p2, :cond_0

    invoke-virtual {v10}, Lcom/daaw/su;->J()Lcom/daaw/su;

    :cond_0
    new-instance v11, Lcom/daaw/g2$c;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move/from16 v7, p8

    move/from16 v8, p9

    invoke-direct/range {v0 .. v8}, Lcom/daaw/g2$c;-><init>(Lcom/daaw/g2;Lcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)V

    new-instance v0, Lcom/daaw/bh1;

    iget-object v1, v11, Lcom/daaw/g2$b;->i:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/daaw/bh1;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Lcom/daaw/su;->O(Lcom/daaw/hi0;)Lcom/daaw/su;

    invoke-virtual {v10, v11}, Lcom/daaw/su;->K(Lcom/daaw/q41;)Lcom/daaw/su;

    return-object v10
.end method

.method public final C(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/cr1;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "mp3"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public j(Landroid/widget/ImageView;)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/e70;->g(Landroid/view/View;)V

    return-void
.end method

.method public final k(Landroid/content/Context;)Lcom/daaw/bc;
    .locals 0

    invoke-static {p1}, Lcom/daaw/e70;->j(Landroid/content/Context;)Lcom/daaw/e70;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/e70;->k()Lcom/daaw/bc;

    move-result-object p1

    return-object p1
.end method

.method public final l(Landroid/content/Context;Lcom/daaw/bc;)Lcom/daaw/d51;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/bc;",
            ")",
            "Lcom/daaw/d51<",
            "Lcom/daaw/jf0;",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/ff0;

    new-instance v1, Lcom/daaw/kg1;

    sget-object v2, Lcom/daaw/cq;->q:Lcom/daaw/cq;

    invoke-direct {v1, p2, v2}, Lcom/daaw/kg1;-><init>(Lcom/daaw/bc;Lcom/daaw/cq;)V

    new-instance v3, Lcom/daaw/x00;

    invoke-direct {v3, p2, v2}, Lcom/daaw/x00;-><init>(Lcom/daaw/bc;Lcom/daaw/cq;)V

    invoke-direct {v0, v1, v3}, Lcom/daaw/ff0;-><init>(Lcom/daaw/d51;Lcom/daaw/d51;)V

    new-instance v1, Lcom/daaw/c70;

    invoke-direct {v1, p1, p2}, Lcom/daaw/c70;-><init>(Landroid/content/Context;Lcom/daaw/bc;)V

    new-instance p1, Lcom/daaw/n60;

    invoke-direct {p1, v0, v1, p2}, Lcom/daaw/n60;-><init>(Lcom/daaw/d51;Lcom/daaw/d51;Lcom/daaw/bc;)V

    return-object p1
.end method

.method public final m(Landroid/content/Context;)Lcom/daaw/r41;
    .locals 0

    invoke-static {p1}, Lcom/daaw/e70;->t(Landroid/content/Context;)Lcom/daaw/r41;

    move-result-object p1

    return-object p1
.end method

.method public final s(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/af0;IIIIZLcom/daaw/ye0;Ljava/lang/Object;)V
    .locals 24

    move-object/from16 v11, p0

    move-object/from16 v12, p3

    move-object/from16 v13, p5

    move/from16 v0, p6

    move/from16 v14, p7

    move-object/from16 v15, p11

    move-object/from16 v9, p12

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v10

    if-nez v10, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v1, p2

    invoke-virtual {v11, v10, v1, v0, v14}, Lcom/daaw/g2;->w(Landroid/content/Context;Landroid/net/Uri;II)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v0, Lcom/daaw/df0;

    invoke-direct {v0, v1}, Lcom/daaw/df0;-><init>(Landroid/graphics/Bitmap;)V

    invoke-interface {v13, v0, v8, v12}, Lcom/daaw/af0;->b(Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {v11, v8}, Lcom/daaw/g2;->C(Ljava/lang/String;)Z

    move-result v16

    new-instance v7, Lcom/daaw/g2$a;

    move-object v1, v7

    move-object/from16 v2, p0

    move-object/from16 v3, p5

    move-object v4, v8

    move-object/from16 v5, p3

    move-object/from16 v6, p11

    move-object v15, v7

    move/from16 v7, p6

    move-object/from16 p2, v8

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/daaw/g2$a;-><init>(Lcom/daaw/g2;Lcom/daaw/af0;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;II)V

    invoke-interface {v13, v15}, Lcom/daaw/af0;->a(Ljava/lang/Object;)V

    and-int/lit8 v1, p8, 0x4

    const/4 v2, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    const-string v7, "file://"

    if-eqz v1, :cond_3

    move-object/from16 v17, v7

    goto :goto_1

    :cond_3
    move-object/from16 v17, v12

    :goto_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-ne v1, v3, :cond_4

    const/16 v18, 0x1

    goto :goto_2

    :cond_4
    const/16 v18, 0x0

    :goto_2
    invoke-virtual {v11, v10}, Lcom/daaw/g2;->k(Landroid/content/Context;)Lcom/daaw/bc;

    move-result-object v19

    invoke-static/range {v17 .. v17}, Lcom/daaw/qg0;->a(Ljava/lang/String;)I

    move-result v1

    const/16 v6, 0x2f

    const/4 v5, 0x0

    if-lez v1, :cond_5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    move-object/from16 v1, p0

    move-object/from16 v4, v19

    move-object v9, v5

    move-object v5, v10

    move/from16 v6, p10

    move-object/from16 v21, v7

    move-object/from16 v7, p2

    move-object/from16 v8, p4

    move/from16 v9, p8

    move-object/from16 v22, v10

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/g2;->B(Ljava/lang/Integer;ZLcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)Lcom/daaw/su;

    move-result-object v5

    invoke-virtual {v5}, Lcom/daaw/su;->H()Lcom/daaw/su;

    move-object/from16 v1, v17

    move-object/from16 v23, v21

    const/16 v20, 0x0

    goto/16 :goto_4

    :cond_5
    move-object/from16 v21, v7

    move-object/from16 v22, v10

    if-eqz v17, :cond_8

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_8

    invoke-static/range {v17 .. v17}, Lcom/daaw/pk0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v9, :cond_8

    if-eqz v1, :cond_8

    sget-object v2, Lcom/daaw/g2;->b:Lcom/daaw/ww1;

    const/4 v10, 0x0

    invoke-virtual {v2, v9, v10}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_7

    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v8, 0x2f

    if-ne v2, v8, :cond_6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v7, v21

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_6
    move-object/from16 v7, v21

    goto :goto_3

    :cond_7
    move-object/from16 v7, v21

    const/16 v8, 0x2f

    const/4 v9, 0x0

    :goto_3
    move-object/from16 v17, v1

    invoke-static/range {v17 .. v17}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    const/4 v3, 0x1

    move-object/from16 v1, p0

    move-object/from16 v4, v19

    move-object/from16 v5, v22

    move/from16 v6, p10

    move-object/from16 v23, v7

    move-object/from16 v7, p2

    move-object/from16 v8, p4

    move/from16 v9, p8

    move-object/from16 v20, v10

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/g2;->A(Landroid/net/Uri;ZLcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)Lcom/daaw/su;

    move-result-object v5

    invoke-virtual {v5}, Lcom/daaw/su;->H()Lcom/daaw/su;

    move-object/from16 v1, v17

    goto :goto_4

    :cond_8
    move-object/from16 v23, v21

    const/16 v20, 0x0

    move-object/from16 v1, v17

    move-object/from16 v5, v20

    :goto_4
    if-nez v5, :cond_d

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_9

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_9

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, v23

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_9
    move-object/from16 v2, v23

    :goto_5
    move-object v7, v1

    if-eqz v7, :cond_a

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_b

    :cond_a
    move-object v7, v2

    :cond_b
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    if-eqz v16, :cond_c

    const/4 v2, 0x1

    move-object/from16 v1, p0

    move-object/from16 v3, v19

    move-object/from16 v4, v22

    move/from16 v5, p10

    move-object/from16 v6, p2

    move-object/from16 v7, p4

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-virtual/range {v1 .. v9}, Lcom/daaw/g2;->z(ZLcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)Lcom/daaw/su;

    move-result-object v1

    goto :goto_6

    :cond_c
    const/4 v3, 0x1

    move-object/from16 v1, p0

    move-object/from16 v4, v19

    move-object/from16 v5, v22

    move/from16 v6, p10

    move-object/from16 v7, p2

    move-object/from16 v8, p4

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/g2;->A(Landroid/net/Uri;ZLcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)Lcom/daaw/su;

    move-result-object v1

    :goto_6
    move-object v5, v1

    invoke-virtual {v5}, Lcom/daaw/su;->H()Lcom/daaw/su;

    :cond_d
    if-eqz v18, :cond_e

    invoke-virtual {v5, v15}, Lcom/daaw/f60;->r(Lcom/daaw/pj1;)Lcom/daaw/pj1;

    goto :goto_8

    :cond_e
    if-eqz p1, :cond_f

    :try_start_0
    invoke-virtual {v5, v0, v14}, Lcom/daaw/f60;->o(II)Lcom/daaw/x50;

    move-result-object v0

    const-wide/16 v1, 0x5dc

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/l70;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v2, p2

    move-object/from16 v1, p11

    goto :goto_7

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    move-object/from16 v2, p2

    move-object/from16 v1, p11

    move-object/from16 v5, v20

    :goto_7
    invoke-static {v13, v5, v2, v12, v1}, Lcom/daaw/g2;->y(Lcom/daaw/af0;Lcom/daaw/l70;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;)V

    goto :goto_8

    :cond_f
    move-object/from16 v2, p2

    move-object/from16 v1, p11

    new-instance v3, Lcom/daaw/ir1;

    new-instance v4, Lcom/daaw/f2;

    invoke-direct {v4, v5, v0, v14}, Lcom/daaw/f2;-><init>(Lcom/daaw/su;II)V

    invoke-direct {v3, v4}, Lcom/daaw/ir1;-><init>(Lcom/daaw/ir1$c;)V

    new-instance v0, Lcom/daaw/e2;

    invoke-direct {v0, v13, v2, v12, v1}, Lcom/daaw/e2;-><init>(Lcom/daaw/af0;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ye0;)V

    invoke-virtual {v3, v0}, Lcom/daaw/ir1;->b(Lcom/daaw/ir1$b;)V

    :goto_8
    return-void
.end method

.method public t(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Z)V
    .locals 10

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v4

    if-nez v4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p4}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    invoke-virtual {p4}, Landroid/widget/ImageView;->getHeight()I

    move-result v1

    invoke-virtual {p0, v4, p1, v0, v1}, Lcom/daaw/g2;->w(Landroid/content/Context;Landroid/net/Uri;II)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p4, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/daaw/g2;->C(Ljava/lang/String;)Z

    move-result p1

    const-string v0, "file://"

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2f

    if-ne v1, v2, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_2
    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    move-object v0, p2

    :goto_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p0, v4}, Lcom/daaw/g2;->k(Landroid/content/Context;)Lcom/daaw/bc;

    move-result-object v3

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    const/4 v7, 0x0

    const/4 v8, -0x1

    move-object v0, p0

    move v1, p5

    move-object v2, v3

    move-object v3, v4

    move v4, p1

    move-object v5, v6

    move-object v6, p3

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/g2;->z(ZLcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)Lcom/daaw/su;

    move-result-object p1

    goto :goto_1

    :cond_4
    const/4 v5, 0x1

    const/4 v8, 0x0

    const/4 v9, -0x1

    move-object v0, p0

    move v2, p5

    move-object v7, p3

    invoke-virtual/range {v0 .. v9}, Lcom/daaw/g2;->A(Landroid/net/Uri;ZLcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)Lcom/daaw/su;

    move-result-object p1

    :goto_1
    invoke-virtual {p1, p4}, Lcom/daaw/su;->p(Landroid/widget/ImageView;)Lcom/daaw/pj1;

    return-void
.end method

.method public final u(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, Lcom/daaw/uq0;

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/daaw/uq0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/daaw/uq0;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/uq0;->d()Lcom/daaw/hd0;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/hd0;->a()[B

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p1

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-object v0
.end method

.method public v(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/af0;IIIIZLcom/daaw/ye0;Ljava/lang/Object;)V
    .locals 16

    move/from16 v0, p7

    const/4 v1, 0x2

    move/from16 v2, p6

    if-ge v2, v1, :cond_0

    invoke-static/range {p6 .. p7}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_0
    move v9, v2

    if-ge v0, v1, :cond_1

    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_1
    move v10, v0

    move-object/from16 v3, p0

    move/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v11, p8

    move/from16 v12, p9

    move/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    invoke-virtual/range {v3 .. v15}, Lcom/daaw/g2;->s(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/af0;IIIIZLcom/daaw/ye0;Ljava/lang/Object;)V

    return-void
.end method

.method public final w(Landroid/content/Context;Landroid/net/Uri;II)Landroid/graphics/Bitmap;
    .locals 5

    sget-boolean v0, Lcom/daaw/g2;->a:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    const/4 v2, 0x1

    if-ge p3, v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-ge p4, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    if-nez v0, :cond_2

    if-eqz v3, :cond_3

    :cond_2
    const-string v2, "Dimensions were too small"

    invoke-static {v2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_3
    new-instance v2, Landroid/util/Size;

    const/16 v4, 0xc8

    if-eqz v3, :cond_4

    const/16 p3, 0xc8

    :cond_4
    if-eqz v0, :cond_5

    const/16 p4, 0xc8

    :cond_5
    invoke-direct {v2, p3, p4}, Landroid/util/Size;-><init>(II)V

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, p2, v2, v1}, Landroid/content/ContentResolver;->loadThumbnail(Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string p2, ""

    invoke-static {p1, p2}, Lcom/daaw/lz1;->b(Ljava/lang/Exception;Ljava/lang/String;)V

    :cond_6
    return-object v1
.end method

.method public final x(Ljava/lang/String;Ljava/lang/String;IIII)Landroid/graphics/Bitmap;
    .locals 14

    move-object/from16 v2, p2

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    and-int/lit8 v1, p5, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    const/4 v6, 0x2

    and-int/lit8 v7, p5, 0x2

    if-eqz v7, :cond_2

    const/4 v7, 0x1

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    :goto_2
    const/4 v8, 0x3

    if-nez v5, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/cr1;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "mp3"

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    const-string v9, "wav"

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    const-string v9, "ogg"

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-static {v0, v8}, Lcom/daaw/pr0;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    if-eqz v2, :cond_7

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_7

    new-array v0, v8, [F

    move/from16 v5, p6

    invoke-static {v5, v0}, Lcom/daaw/zg;->d(I[F)V

    aget v9, v0, v6

    const v10, 0x3f7d70a4    # 0.99f

    const/high16 v11, 0x3f800000    # 1.0f

    cmpl-float v9, v9, v10

    if-lez v9, :cond_4

    aput v11, v0, v4

    :cond_4
    invoke-static/range {p6 .. p6}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Lcom/daaw/md1;->e(C)F

    move-result v9

    const/high16 v10, 0x43b40000    # 360.0f

    mul-float v9, v9, v10

    const/4 v10, 0x0

    if-eqz v1, :cond_5

    const/high16 v1, 0x41700000    # 15.0f

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    add-float/2addr v9, v1

    float-to-int v1, v9

    add-int/lit8 v1, v1, 0x1e

    rem-int/lit16 v1, v1, 0x168

    new-array v12, v8, [F

    add-float/2addr v10, v9

    aput v10, v12, v3

    const v10, 0x3e4ccccd    # 0.2f

    aput v10, v12, v4

    aput v11, v12, v6

    new-array v10, v8, [F

    aput v9, v10, v3

    const v9, 0x3f666666    # 0.9f

    aput v9, v10, v4

    const v11, 0x3f19999a    # 0.6f

    aget v13, v0, v6

    mul-float v13, v13, v11

    aput v13, v10, v6

    new-array v8, v8, [F

    int-to-float v1, v1

    aput v1, v8, v3

    aput v9, v8, v4

    const v1, 0x3ecccccd    # 0.4f

    aget v0, v0, v6

    mul-float v0, v0, v1

    aput v0, v8, v6

    invoke-static {v12}, Lcom/daaw/zg;->a([F)I

    move-result v0

    if-eqz v7, :cond_6

    goto :goto_4

    :cond_6
    const/16 v3, 0xff

    :goto_4
    invoke-static {v0, v3}, Lcom/daaw/zg;->j(II)I

    move-result v3

    invoke-static {v10}, Lcom/daaw/zg;->a([F)I

    move-result v0

    invoke-static {v0, v5}, Lcom/daaw/zg;->j(II)I

    move-result v4

    invoke-static {v8}, Lcom/daaw/zg;->a([F)I

    move-result v0

    invoke-static {v0, v5}, Lcom/daaw/zg;->j(II)I

    move-result v5

    sget-object v6, Lcom/daaw/g2;->c:Landroid/graphics/drawable/Drawable;

    move/from16 v0, p3

    move/from16 v1, p4

    move-object/from16 v2, p2

    invoke-static/range {v0 .. v6}, Lcom/daaw/md1;->c(IILjava/lang/String;IIILandroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_7
    const/4 v0, 0x0

    return-object v0
.end method

.method public z(ZLcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;II)Lcom/daaw/su;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/daaw/bc;",
            "Landroid/content/Context;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)",
            "Lcom/daaw/su<",
            "*>;"
        }
    .end annotation

    move-object v10, p0

    move-object/from16 v3, p3

    invoke-virtual {p0, v3}, Lcom/daaw/g2;->m(Landroid/content/Context;)Lcom/daaw/r41;

    move-result-object v0

    const v1, 0x7f0800f1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/r41;->u(Ljava/lang/Integer;)Lcom/daaw/uu;

    move-result-object v0

    const v1, 0x7f08016c

    invoke-virtual {v0, v1}, Lcom/daaw/su;->N(I)Lcom/daaw/su;

    invoke-virtual {v0, v1}, Lcom/daaw/su;->I(I)Lcom/daaw/su;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lcom/daaw/su;->J()Lcom/daaw/su;

    :cond_0
    if-nez p4, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/su;->P(Z)Lcom/daaw/su;

    move-result-object v0

    :cond_1
    move-object v11, v0

    new-instance v12, Lcom/daaw/g2$b;

    const/4 v9, 0x1

    move-object v0, v12

    move-object v1, p0

    move-object v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lcom/daaw/g2$b;-><init>(Lcom/daaw/g2;Lcom/daaw/bc;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;IIZ)V

    new-instance v0, Lcom/daaw/bh1;

    iget-object v1, v12, Lcom/daaw/g2$b;->i:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/daaw/bh1;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Lcom/daaw/su;->O(Lcom/daaw/hi0;)Lcom/daaw/su;

    invoke-virtual {v11, v12}, Lcom/daaw/su;->F(Lcom/daaw/d51;)Lcom/daaw/su;

    sget-object v0, Lcom/daaw/wt;->s:Lcom/daaw/wt;

    invoke-virtual {v11, v0}, Lcom/daaw/su;->G(Lcom/daaw/wt;)Lcom/daaw/su;

    return-object v11
.end method
