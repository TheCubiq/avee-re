.class public Lcom/daaw/to1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/to1$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/zo1;

.field public static final b:Lcom/daaw/wl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/wl0<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/daaw/yo1;

    invoke-direct {v0}, Lcom/daaw/yo1;-><init>()V

    :goto_0
    sput-object v0, Lcom/daaw/to1;->a:Lcom/daaw/zo1;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    new-instance v0, Lcom/daaw/xo1;

    invoke-direct {v0}, Lcom/daaw/xo1;-><init>()V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    new-instance v0, Lcom/daaw/wo1;

    invoke-direct {v0}, Lcom/daaw/wo1;-><init>()V

    goto :goto_0

    :cond_2
    const/16 v1, 0x18

    if-lt v0, v1, :cond_3

    invoke-static {}, Lcom/daaw/vo1;->m()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v0, Lcom/daaw/vo1;

    invoke-direct {v0}, Lcom/daaw/vo1;-><init>()V

    goto :goto_0

    :cond_3
    const/16 v1, 0x15

    if-lt v0, v1, :cond_4

    new-instance v0, Lcom/daaw/uo1;

    invoke-direct {v0}, Lcom/daaw/uo1;-><init>()V

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/daaw/zo1;

    invoke-direct {v0}, Lcom/daaw/zo1;-><init>()V

    goto :goto_0

    :goto_1
    new-instance v0, Lcom/daaw/wl0;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/daaw/wl0;-><init>(I)V

    sput-object v0, Lcom/daaw/to1;->b:Lcom/daaw/wl0;

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    .locals 2

    if-eqz p0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    invoke-static {p0, p1, p2}, Lcom/daaw/to1;->g(Landroid/content/Context;Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Context cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Landroid/content/Context;Landroid/os/CancellationSignal;[Lcom/daaw/b30$b;I)Landroid/graphics/Typeface;
    .locals 1

    sget-object v0, Lcom/daaw/to1;->a:Lcom/daaw/zo1;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/daaw/zo1;->c(Landroid/content/Context;Landroid/os/CancellationSignal;[Lcom/daaw/b30$b;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Lcom/daaw/a30$b;Landroid/content/res/Resources;ILjava/lang/String;IILcom/daaw/j51$f;Landroid/os/Handler;Z)Landroid/graphics/Typeface;
    .locals 13

    move-object v0, p1

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    instance-of v3, v0, Lcom/daaw/a30$e;

    if-eqz v3, :cond_5

    check-cast v0, Lcom/daaw/a30$e;

    invoke-virtual {v0}, Lcom/daaw/a30$e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/daaw/to1;->h(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    if-eqz v3, :cond_1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v3, v2}, Lcom/daaw/j51$f;->d(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    :cond_0
    return-object v3

    :cond_1
    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz p9, :cond_2

    invoke-virtual {v0}, Lcom/daaw/a30$e;->a()I

    move-result v5

    if-nez v5, :cond_3

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    :goto_0
    const/4 v9, 0x1

    goto :goto_1

    :cond_3
    const/4 v9, 0x0

    :goto_1
    if-eqz p9, :cond_4

    invoke-virtual {v0}, Lcom/daaw/a30$e;->d()I

    move-result v3

    move v10, v3

    goto :goto_2

    :cond_4
    const/4 v3, -0x1

    const/4 v10, -0x1

    :goto_2
    invoke-static/range {p8 .. p8}, Lcom/daaw/j51$f;->e(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object v11

    new-instance v12, Lcom/daaw/to1$a;

    invoke-direct {v12, v1}, Lcom/daaw/to1$a;-><init>(Lcom/daaw/j51$f;)V

    invoke-virtual {v0}, Lcom/daaw/a30$e;->b()Lcom/daaw/x20;

    move-result-object v7

    move-object v6, p0

    move/from16 v8, p6

    invoke-static/range {v6 .. v12}, Lcom/daaw/b30;->c(Landroid/content/Context;Lcom/daaw/x20;IZILandroid/os/Handler;Lcom/daaw/b30$c;)Landroid/graphics/Typeface;

    move-result-object v0

    move-object v5, p2

    move/from16 v6, p6

    goto :goto_3

    :cond_5
    sget-object v3, Lcom/daaw/to1;->a:Lcom/daaw/zo1;

    check-cast v0, Lcom/daaw/a30$c;

    move-object v4, p0

    move-object v5, p2

    move/from16 v6, p6

    invoke-virtual {v3, p0, v0, p2, v6}, Lcom/daaw/zo1;->b(Landroid/content/Context;Lcom/daaw/a30$c;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v1, :cond_7

    if-eqz v0, :cond_6

    invoke-virtual {v1, v0, v2}, Lcom/daaw/j51$f;->d(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_3

    :cond_6
    const/4 v3, -0x3

    invoke-virtual {v1, v3, v2}, Lcom/daaw/j51$f;->c(ILandroid/os/Handler;)V

    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    sget-object v1, Lcom/daaw/to1;->b:Lcom/daaw/wl0;

    invoke-static/range {p2 .. p6}, Lcom/daaw/to1;->e(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/daaw/wl0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    return-object v0
.end method

.method public static d(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;
    .locals 6

    sget-object v0, Lcom/daaw/to1;->a:Lcom/daaw/zo1;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/zo1;->e(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p1, p2, p3, p4, p5}, Lcom/daaw/to1;->e(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/daaw/to1;->b:Lcom/daaw/wl0;

    invoke-virtual {p2, p1, p0}, Lcom/daaw/wl0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public static e(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 p0, 0x2d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;
    .locals 1

    sget-object v0, Lcom/daaw/to1;->b:Lcom/daaw/wl0;

    invoke-static {p0, p1, p2, p3, p4}, Lcom/daaw/to1;->e(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/daaw/wl0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Typeface;

    return-object p0
.end method

.method public static g(Landroid/content/Context;Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    .locals 2

    sget-object v0, Lcom/daaw/to1;->a:Lcom/daaw/zo1;

    invoke-virtual {v0, p1}, Lcom/daaw/zo1;->i(Landroid/graphics/Typeface;)Lcom/daaw/a30$c;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v0, p0, p1, v1, p2}, Lcom/daaw/zo1;->b(Landroid/content/Context;Lcom/daaw/a30$c;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p0

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v1

    if-eqz p0, :cond_1

    invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    move-object v0, p0

    :cond_1
    :goto_0
    return-object v0
.end method
