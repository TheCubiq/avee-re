.class public final Lcom/daaw/gu8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/xp4;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/daaw/xp4;->a:Lcom/daaw/xp4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/gu8;->a:Lcom/daaw/xp4;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/r84;[IILcom/daaw/mw8;Lcom/daaw/y17;)Lcom/daaw/hu8;
    .locals 19

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v4, p4

    move-object/from16 v15, p5

    new-instance v17, Lcom/daaw/hu8;

    move-object/from16 v0, v17

    move-object/from16 v14, p0

    iget-object v3, v14, Lcom/daaw/gu8;->a:Lcom/daaw/xp4;

    move-object/from16 v16, v3

    const/4 v3, 0x0

    const-wide/16 v5, 0x2710

    const-wide/16 v7, 0x61a8

    const-wide/16 v9, 0x61a8

    const/16 v11, 0x4ff

    const/16 v12, 0x2cf

    const v13, 0x3f333333    # 0.7f

    const/high16 v18, 0x3f400000    # 0.75f

    move/from16 v14, v18

    invoke-direct/range {v0 .. v16}, Lcom/daaw/hu8;-><init>(Lcom/daaw/r84;[IILcom/daaw/mw8;JJJIIFFLjava/util/List;Lcom/daaw/xp4;)V

    return-object v17
.end method
