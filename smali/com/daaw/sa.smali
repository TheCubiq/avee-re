.class public abstract Lcom/daaw/sa;
.super Lcom/daaw/zn0;
.source ""


# instance fields
.field public final j:J

.field public k:Lcom/daaw/ta;

.field public l:[I


# direct methods
.method public constructor <init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJ)V
    .locals 12

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v10, p12

    invoke-direct/range {v0 .. v11}, Lcom/daaw/zn0;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJ)V

    move-wide/from16 v1, p10

    iput-wide v1, v0, Lcom/daaw/sa;->j:J

    return-void
.end method


# virtual methods
.method public final g(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/sa;->l:[I

    aget p1, v0, p1

    return p1
.end method

.method public final h()Lcom/daaw/ta;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sa;->k:Lcom/daaw/ta;

    return-object v0
.end method

.method public i(Lcom/daaw/ta;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/sa;->k:Lcom/daaw/ta;

    invoke-virtual {p1}, Lcom/daaw/ta;->b()[I

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/sa;->l:[I

    return-void
.end method
