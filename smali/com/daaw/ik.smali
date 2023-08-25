.class public Lcom/daaw/ik;
.super Lcom/daaw/qk;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ik$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 8

    new-instance v2, Lcom/daaw/ik$b;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lcom/daaw/ik$b;-><init>(Lcom/daaw/ik$a;)V

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v7}, Lcom/daaw/qk;-><init>(Landroid/content/Context;Lcom/daaw/r40;Ljava/lang/String;Ljava/lang/String;IIZ)V

    return-void
.end method

.method public static j0(Landroid/content/Context;ILcom/daaw/sd0;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Lcom/daaw/sd0;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->H:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    sget-object v7, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v1, "_id"

    const-string v2, "_data"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v8

    sget-object v1, Lcom/daaw/yj;->s:Lcom/daaw/xw1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, p2, v2}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ie1$h;

    const/4 p2, 0x4

    invoke-static {p1, p2}, Lcom/daaw/dp0;->c(Lcom/daaw/ie1$h;I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    const p2, 0x93a80

    mul-int p2, p2, v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "date_added>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    int-to-long v4, p2

    sub-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, v7

    move-object v3, v8

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lcom/daaw/dp0;->e(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x8

    if-le v0, v1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_0

    invoke-interface {p2}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_0

    :goto_0
    if-eqz p2, :cond_2

    invoke-static {p2}, Lcom/daaw/dr1;->e(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    return-object p0
.end method
