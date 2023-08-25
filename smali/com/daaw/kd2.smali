.class public final Lcom/daaw/kd2;
.super Lcom/daaw/nz8;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/cr5;JJII)V
    .locals 16

    new-instance v1, Lcom/daaw/iz8;

    invoke-direct {v1}, Lcom/daaw/iz8;-><init>()V

    new-instance v2, Lcom/daaw/jd2;

    const v0, 0x1b8a0

    move-object/from16 v3, p1

    move/from16 v4, p6

    invoke-direct {v2, v4, v3, v0}, Lcom/daaw/jd2;-><init>(ILcom/daaw/cr5;I)V

    const-wide/16 v3, 0x1

    add-long v7, p2, v3

    const-wide/16 v5, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v13, 0xbc

    const/16 v15, 0x3ac

    move-object/from16 v0, p0

    move-wide/from16 v3, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v0 .. v15}, Lcom/daaw/nz8;-><init>(Lcom/daaw/kz8;Lcom/daaw/mz8;JJJJJJI)V

    return-void
.end method
