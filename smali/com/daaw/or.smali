.class public Lcom/daaw/or;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e41;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/yu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:J


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 6

    const/4 v2, 0x0

    const-wide/16 v4, 0x1388

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/or;-><init>(Landroid/content/Context;Lcom/daaw/yu;IJ)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/yu;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;IJ)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/or;->a:Landroid/content/Context;

    iput p3, p0, Lcom/daaw/or;->c:I

    iput-wide p4, p0, Lcom/daaw/or;->d:J

    iput-object p2, p0, Lcom/daaw/or;->b:Lcom/daaw/yu;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;Lcom/daaw/rs1;Lcom/daaw/n7;Lcom/daaw/pk1;Lcom/daaw/xp0;Lcom/daaw/yu;)[Lcom/daaw/a41;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Lcom/daaw/rs1;",
            "Lcom/daaw/n7;",
            "Lcom/daaw/pk1;",
            "Lcom/daaw/xp0;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;)[",
            "Lcom/daaw/a41;"
        }
    .end annotation

    move-object v9, p0

    if-nez p6, :cond_0

    iget-object v0, v9, Lcom/daaw/or;->b:Lcom/daaw/yu;

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p6

    :goto_0
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v9, Lcom/daaw/or;->a:Landroid/content/Context;

    iget-wide v3, v9, Lcom/daaw/or;->d:J

    iget v7, v9, Lcom/daaw/or;->c:I

    move-object v0, p0

    move-object v2, v10

    move-object v5, p1

    move-object v6, p2

    move-object v8, v11

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/or;->g(Landroid/content/Context;Lcom/daaw/yu;JLandroid/os/Handler;Lcom/daaw/rs1;ILjava/util/ArrayList;)V

    iget-object v1, v9, Lcom/daaw/or;->a:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/daaw/or;->b()[Lcom/daaw/m7;

    move-result-object v3

    iget v6, v9, Lcom/daaw/or;->c:I

    move-object v4, p1

    move-object v5, p3

    move-object v7, v11

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/or;->c(Landroid/content/Context;Lcom/daaw/yu;[Lcom/daaw/m7;Landroid/os/Handler;Lcom/daaw/n7;ILjava/util/ArrayList;)V

    iget-object v1, v9, Lcom/daaw/or;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v3

    iget v4, v9, Lcom/daaw/or;->c:I

    move-object/from16 v2, p4

    move-object v5, v11

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/or;->f(Landroid/content/Context;Lcom/daaw/pk1;Landroid/os/Looper;ILjava/util/ArrayList;)V

    iget-object v1, v9, Lcom/daaw/or;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v3

    iget v4, v9, Lcom/daaw/or;->c:I

    move-object/from16 v2, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/or;->d(Landroid/content/Context;Lcom/daaw/xp0;Landroid/os/Looper;ILjava/util/ArrayList;)V

    iget-object v0, v9, Lcom/daaw/or;->a:Landroid/content/Context;

    iget v1, v9, Lcom/daaw/or;->c:I

    move-object v2, p1

    invoke-virtual {p0, v0, p1, v1, v11}, Lcom/daaw/or;->e(Landroid/content/Context;Landroid/os/Handler;ILjava/util/ArrayList;)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Lcom/daaw/a41;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/a41;

    return-object v0
.end method

.method public b()[Lcom/daaw/m7;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/daaw/m7;

    return-object v0
.end method

.method public c(Landroid/content/Context;Lcom/daaw/yu;[Lcom/daaw/m7;Landroid/os/Handler;Lcom/daaw/n7;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;[",
            "Lcom/daaw/m7;",
            "Landroid/os/Handler;",
            "Lcom/daaw/n7;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/a41;",
            ">;)V"
        }
    .end annotation

    const/4 p0, 0x0

    throw p0
.end method

.method public d(Landroid/content/Context;Lcom/daaw/xp0;Landroid/os/Looper;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/xp0;",
            "Landroid/os/Looper;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/a41;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Lcom/daaw/yp0;

    invoke-direct {p1, p2, p3}, Lcom/daaw/yp0;-><init>(Lcom/daaw/xp0;Landroid/os/Looper;)V

    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Landroid/content/Context;Landroid/os/Handler;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Handler;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/a41;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public f(Landroid/content/Context;Lcom/daaw/pk1;Landroid/os/Looper;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/pk1;",
            "Landroid/os/Looper;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/a41;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Lcom/daaw/qk1;

    invoke-direct {p1, p2, p3}, Lcom/daaw/qk1;-><init>(Lcom/daaw/pk1;Landroid/os/Looper;)V

    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Landroid/content/Context;Lcom/daaw/yu;JLandroid/os/Handler;Lcom/daaw/rs1;ILjava/util/ArrayList;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;J",
            "Landroid/os/Handler;",
            "Lcom/daaw/rs1;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/a41;",
            ">;)V"
        }
    .end annotation

    move/from16 v0, p7

    move-object/from16 v1, p8

    new-instance v12, Lcom/daaw/go0;

    sget-object v4, Lcom/daaw/eo0;->a:Lcom/daaw/eo0;

    const/4 v8, 0x0

    const/16 v11, 0x32

    move-object v2, v12

    move-object v3, p1

    move-wide/from16 v5, p3

    move-object v7, p2

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    invoke-direct/range {v2 .. v11}, Lcom/daaw/go0;-><init>(Landroid/content/Context;Lcom/daaw/eo0;JLcom/daaw/yu;ZLandroid/os/Handler;Lcom/daaw/rs1;I)V

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p8 .. p8}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    add-int/lit8 v2, v2, -0x1

    :cond_1
    :try_start_0
    const-string v0, "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v4, 0x5

    new-array v5, v4, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x1

    aput-object v6, v5, v8

    const-class v6, Landroid/os/Handler;

    aput-object v6, v5, v3

    const-class v6, Lcom/daaw/rs1;

    const/4 v9, 0x3

    aput-object v6, v5, v9

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v10, 0x4

    aput-object v6, v5, v10

    invoke-virtual {v0, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v4, v4, [Ljava/lang/Object;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v5, v4, v7

    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v8

    aput-object p5, v4, v3

    aput-object p6, v4, v9

    const/16 v3, 0x32

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v10

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/a41;

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error instantiating VP9 extension"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    :goto_0
    return-void
.end method
