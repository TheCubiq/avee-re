.class public final Lcom/daaw/vu7;
.super Lcom/daaw/jn3;
.source ""


# static fields
.field public static final z:Lcom/daaw/th8;


# instance fields
.field public final s:I

.field public final t:Ljava/lang/String;

.field public final u:I

.field public final v:Lcom/daaw/f92;

.field public final w:I

.field public final x:Lcom/daaw/md3;

.field public final y:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/jt7;->a:Lcom/daaw/jt7;

    sput-object v0, Lcom/daaw/vu7;->z:Lcom/daaw/th8;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Throwable;I)V
    .locals 10

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v4, p3

    invoke-direct/range {v0 .. v9}, Lcom/daaw/vu7;-><init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILcom/daaw/f92;IZ)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILcom/daaw/f92;IZ)V
    .locals 13

    move v4, p1

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    if-eq v4, v0, :cond_0

    const-string v0, "Unexpected runtime error"

    move-object/from16 v5, p5

    move/from16 v6, p6

    goto :goto_0

    :cond_0
    invoke-static/range {p7 .. p7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static/range {p8 .. p8}, Lcom/daaw/it5;->m(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v5, p5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " error, index="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v6, p6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", format="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", format_supported="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object/from16 v5, p5

    move/from16 v6, p6

    const-string v0, "Source error"

    :goto_0
    const/4 v1, 0x0

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ": null"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    move-object v1, v0

    const/4 v9, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    move-object v0, p0

    move-object v2, p2

    move/from16 v3, p4

    move v4, p1

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v12, p9

    invoke-direct/range {v0 .. v12}, Lcom/daaw/vu7;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILcom/daaw/f92;ILcom/daaw/md3;JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILcom/daaw/f92;ILcom/daaw/md3;JZ)V
    .locals 8

    move-object v6, p0

    move/from16 v7, p12

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide/from16 v4, p10

    invoke-direct/range {v0 .. v5}, Lcom/daaw/jn3;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IJ)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    move v2, p4

    if-eqz v7, :cond_1

    if-ne v2, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    invoke-static {v3}, Lcom/daaw/uo4;->d(Z)V

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x1

    :goto_2
    invoke-static {v0}, Lcom/daaw/uo4;->d(Z)V

    iput v2, v6, Lcom/daaw/vu7;->s:I

    move-object v0, p5

    iput-object v0, v6, Lcom/daaw/vu7;->t:Ljava/lang/String;

    move v0, p6

    iput v0, v6, Lcom/daaw/vu7;->u:I

    move-object v0, p7

    iput-object v0, v6, Lcom/daaw/vu7;->v:Lcom/daaw/f92;

    move/from16 v0, p8

    iput v0, v6, Lcom/daaw/vu7;->w:I

    move-object/from16 v0, p9

    iput-object v0, v6, Lcom/daaw/vu7;->x:Lcom/daaw/md3;

    iput-boolean v7, v6, Lcom/daaw/vu7;->y:Z

    return-void
.end method

.method public static b(Ljava/lang/Throwable;Ljava/lang/String;ILcom/daaw/f92;IZI)Lcom/daaw/vu7;
    .locals 11

    if-nez p3, :cond_0

    const/4 v0, 0x4

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    move v8, p4

    :goto_0
    new-instance v10, Lcom/daaw/vu7;

    const/4 v1, 0x1

    const/4 v3, 0x0

    move-object v0, v10

    move-object v2, p0

    move/from16 v4, p6

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    move/from16 v9, p5

    invoke-direct/range {v0 .. v9}, Lcom/daaw/vu7;-><init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILcom/daaw/f92;IZ)V

    return-object v10
.end method

.method public static c(Ljava/io/IOException;I)Lcom/daaw/vu7;
    .locals 2

    new-instance v0, Lcom/daaw/vu7;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Lcom/daaw/vu7;-><init>(ILjava/lang/Throwable;I)V

    return-object v0
.end method

.method public static d(Ljava/lang/RuntimeException;I)Lcom/daaw/vu7;
    .locals 2

    new-instance v0, Lcom/daaw/vu7;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Lcom/daaw/vu7;-><init>(ILjava/lang/Throwable;I)V

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/daaw/md3;)Lcom/daaw/vu7;
    .locals 14

    new-instance v13, Lcom/daaw/vu7;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    sget v0, Lcom/daaw/it5;->a:I

    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    iget v3, p0, Lcom/daaw/jn3;->p:I

    iget v4, p0, Lcom/daaw/vu7;->s:I

    iget-object v5, p0, Lcom/daaw/vu7;->t:Ljava/lang/String;

    iget v6, p0, Lcom/daaw/vu7;->u:I

    iget-object v7, p0, Lcom/daaw/vu7;->v:Lcom/daaw/f92;

    iget v8, p0, Lcom/daaw/vu7;->w:I

    iget-wide v10, p0, Lcom/daaw/jn3;->q:J

    iget-boolean v12, p0, Lcom/daaw/vu7;->y:Z

    move-object v0, v13

    move-object v9, p1

    invoke-direct/range {v0 .. v12}, Lcom/daaw/vu7;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILcom/daaw/f92;ILcom/daaw/md3;JZ)V

    return-object v13
.end method
