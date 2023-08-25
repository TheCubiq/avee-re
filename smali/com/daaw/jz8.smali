.class public final Lcom/daaw/jz8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:J


# direct methods
.method public constructor <init>(JJJJJJJ)V
    .locals 13

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, Lcom/daaw/jz8;->a:J

    move-wide/from16 v1, p3

    iput-wide v1, v0, Lcom/daaw/jz8;->b:J

    const-wide/16 v3, 0x0

    iput-wide v3, v0, Lcom/daaw/jz8;->d:J

    move-wide/from16 v5, p7

    iput-wide v5, v0, Lcom/daaw/jz8;->e:J

    move-wide/from16 v7, p9

    iput-wide v7, v0, Lcom/daaw/jz8;->f:J

    move-wide/from16 v9, p11

    iput-wide v9, v0, Lcom/daaw/jz8;->g:J

    move-wide/from16 v11, p13

    iput-wide v11, v0, Lcom/daaw/jz8;->c:J

    invoke-static/range {v1 .. v12}, Lcom/daaw/jz8;->f(JJJJJJ)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/daaw/jz8;->h:J

    return-void
.end method

.method public static synthetic a(Lcom/daaw/jz8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/jz8;->g:J

    return-wide v0
.end method

.method public static synthetic b(Lcom/daaw/jz8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/jz8;->f:J

    return-wide v0
.end method

.method public static synthetic c(Lcom/daaw/jz8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/jz8;->h:J

    return-wide v0
.end method

.method public static synthetic d(Lcom/daaw/jz8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/jz8;->a:J

    return-wide v0
.end method

.method public static synthetic e(Lcom/daaw/jz8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/jz8;->b:J

    return-wide v0
.end method

.method public static f(JJJJJJ)J
    .locals 6

    const-wide/16 v0, 0x1

    add-long v2, p6, v0

    cmp-long v4, v2, p8

    if-gez v4, :cond_1

    add-long/2addr v0, p2

    cmp-long v2, v0, p4

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    sub-long v0, p0, p2

    long-to-float v0, v0

    sub-long v1, p8, p6

    long-to-float v1, v1

    sub-long v2, p4, p2

    long-to-float v2, v2

    div-float/2addr v1, v2

    mul-float v0, v0, v1

    float-to-long v0, v0

    add-long v2, p6, v0

    sub-long v2, v2, p10

    const-wide/16 v4, 0x14

    div-long/2addr v0, v4

    sub-long v0, v2, v0

    const-wide/16 v2, -0x1

    add-long/2addr v2, p8

    move-wide p0, v0

    move-wide p2, p6

    move-wide p4, v2

    invoke-static/range {p0 .. p5}, Lcom/daaw/it5;->b0(JJJ)J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    return-wide p6
.end method

.method public static bridge synthetic g(Lcom/daaw/jz8;JJ)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/jz8;->e:J

    iput-wide p3, p0, Lcom/daaw/jz8;->g:J

    invoke-virtual {p0}, Lcom/daaw/jz8;->i()V

    return-void
.end method

.method public static bridge synthetic h(Lcom/daaw/jz8;JJ)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/jz8;->d:J

    iput-wide p3, p0, Lcom/daaw/jz8;->f:J

    invoke-virtual {p0}, Lcom/daaw/jz8;->i()V

    return-void
.end method


# virtual methods
.method public final i()V
    .locals 12

    iget-wide v0, p0, Lcom/daaw/jz8;->b:J

    iget-wide v2, p0, Lcom/daaw/jz8;->d:J

    iget-wide v4, p0, Lcom/daaw/jz8;->e:J

    iget-wide v6, p0, Lcom/daaw/jz8;->f:J

    iget-wide v8, p0, Lcom/daaw/jz8;->g:J

    iget-wide v10, p0, Lcom/daaw/jz8;->c:J

    invoke-static/range {v0 .. v11}, Lcom/daaw/jz8;->f(JJJJJJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/jz8;->h:J

    return-void
.end method
