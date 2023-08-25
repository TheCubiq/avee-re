.class public final Lcom/daaw/t1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wv;


# static fields
.field public static final r:[B


# instance fields
.field public final a:Z

.field public final b:Lcom/daaw/qv0;

.field public final c:Lcom/daaw/rv0;

.field public final d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Lcom/daaw/sm1;

.field public g:Lcom/daaw/sm1;

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:J

.field public n:I

.field public o:J

.field public p:Lcom/daaw/sm1;

.field public q:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/t1;->r:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x49t
        0x44t
        0x33t
    .end array-data
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/daaw/t1;-><init>(ZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/qv0;

    const/4 v1, 0x7

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/daaw/qv0;-><init>([B)V

    iput-object v0, p0, Lcom/daaw/t1;->b:Lcom/daaw/qv0;

    new-instance v0, Lcom/daaw/rv0;

    sget-object v1, Lcom/daaw/t1;->r:[B

    const/16 v2, 0xa

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>([B)V

    iput-object v0, p0, Lcom/daaw/t1;->c:Lcom/daaw/rv0;

    invoke-virtual {p0}, Lcom/daaw/t1;->k()V

    iput-boolean p1, p0, Lcom/daaw/t1;->a:Z

    iput-object p2, p0, Lcom/daaw/t1;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/rv0;)V
    .locals 2

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    if-lez v0, :cond_6

    iget v0, p0, Lcom/daaw/t1;->h:I

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/t1;->j(Lcom/daaw/rv0;)V

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/daaw/t1;->k:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x7

    goto :goto_1

    :cond_3
    const/4 v0, 0x5

    :goto_1
    iget-object v1, p0, Lcom/daaw/t1;->b:Lcom/daaw/qv0;

    iget-object v1, v1, Lcom/daaw/qv0;->a:[B

    invoke-virtual {p0, p1, v1, v0}, Lcom/daaw/t1;->f(Lcom/daaw/rv0;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/t1;->h()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/daaw/t1;->c:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/16 v1, 0xa

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/t1;->f(Lcom/daaw/rv0;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/t1;->i()V

    goto :goto_0

    :cond_5
    invoke-virtual {p0, p1}, Lcom/daaw/t1;->g(Lcom/daaw/rv0;)V

    goto :goto_0

    :cond_6
    return-void
.end method

.method public b()V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/t1;->k()V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d(Lcom/daaw/d00;Lcom/daaw/eo1$d;)V
    .locals 3

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->a()V

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/t1;->e:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->c()I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/t1;->f:Lcom/daaw/sm1;

    iget-boolean v0, p0, Lcom/daaw/t1;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->a()V

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->c()I

    move-result v0

    const/4 v1, 0x4

    invoke-interface {p1, v0, v1}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/t1;->g:Lcom/daaw/sm1;

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->b()Ljava/lang/String;

    move-result-object p2

    const/4 v0, -0x1

    const-string v1, "application/id3"

    const/4 v2, 0x0

    invoke-static {p2, v1, v2, v0, v2}, Lcom/google/android/exoplayer2/Format;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/ev;

    invoke-direct {p1}, Lcom/daaw/ev;-><init>()V

    iput-object p1, p0, Lcom/daaw/t1;->g:Lcom/daaw/sm1;

    :goto_0
    return-void
.end method

.method public e(JZ)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/t1;->o:J

    return-void
.end method

.method public final f(Lcom/daaw/rv0;[BI)Z
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    iget v1, p0, Lcom/daaw/t1;->i:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Lcom/daaw/t1;->i:I

    invoke-virtual {p1, p2, v1, v0}, Lcom/daaw/rv0;->g([BII)V

    iget p1, p0, Lcom/daaw/t1;->i:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/t1;->i:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final g(Lcom/daaw/rv0;)V
    .locals 8

    iget-object v0, p1, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p1}, Lcom/daaw/rv0;->c()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/rv0;->d()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_7

    add-int/lit8 v3, v1, 0x1

    aget-byte v1, v0, v1

    const/16 v4, 0xff

    and-int/2addr v1, v4

    iget v5, p0, Lcom/daaw/t1;->j:I

    const/16 v6, 0x200

    if-ne v5, v6, :cond_1

    const/16 v7, 0xf0

    if-lt v1, v7, :cond_1

    if-eq v1, v4, :cond_1

    const/4 v0, 0x1

    and-int/2addr v1, v0

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/daaw/t1;->k:Z

    invoke-virtual {p0}, Lcom/daaw/t1;->l()V

    :goto_2
    invoke-virtual {p1, v3}, Lcom/daaw/rv0;->J(I)V

    return-void

    :cond_1
    or-int/2addr v1, v5

    const/16 v4, 0x149

    if-eq v1, v4, :cond_5

    const/16 v4, 0x1ff

    if-eq v1, v4, :cond_4

    const/16 v4, 0x344

    if-eq v1, v4, :cond_3

    const/16 v4, 0x433

    if-eq v1, v4, :cond_2

    const/16 v1, 0x100

    if-eq v5, v1, :cond_6

    iput v1, p0, Lcom/daaw/t1;->j:I

    add-int/lit8 v3, v3, -0x1

    goto :goto_4

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/t1;->m()V

    goto :goto_2

    :cond_3
    const/16 v1, 0x400

    goto :goto_3

    :cond_4
    iput v6, p0, Lcom/daaw/t1;->j:I

    goto :goto_4

    :cond_5
    const/16 v1, 0x300

    :goto_3
    iput v1, p0, Lcom/daaw/t1;->j:I

    :cond_6
    :goto_4
    move v1, v3

    goto :goto_0

    :cond_7
    invoke-virtual {p1, v1}, Lcom/daaw/rv0;->J(I)V

    return-void
.end method

.method public final h()V
    .locals 18

    move-object/from16 v6, p0

    iget-object v0, v6, Lcom/daaw/t1;->b:Lcom/daaw/qv0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->m(I)V

    iget-boolean v0, v6, Lcom/daaw/t1;->l:Z

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-nez v0, :cond_1

    iget-object v0, v6, Lcom/daaw/t1;->b:Lcom/daaw/qv0;

    invoke-virtual {v0, v2}, Lcom/daaw/qv0;->h(I)I

    move-result v0

    const/4 v3, 0x1

    add-int/2addr v0, v3

    if-eq v0, v2, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Detected audio object type: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", but assuming AAC LC."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x2

    :cond_0
    iget-object v4, v6, Lcom/daaw/t1;->b:Lcom/daaw/qv0;

    invoke-virtual {v4, v1}, Lcom/daaw/qv0;->h(I)I

    move-result v4

    iget-object v5, v6, Lcom/daaw/t1;->b:Lcom/daaw/qv0;

    invoke-virtual {v5, v3}, Lcom/daaw/qv0;->o(I)V

    iget-object v5, v6, Lcom/daaw/t1;->b:Lcom/daaw/qv0;

    const/4 v7, 0x3

    invoke-virtual {v5, v7}, Lcom/daaw/qv0;->h(I)I

    move-result v5

    invoke-static {v0, v4, v5}, Lcom/daaw/eg;->a(III)[B

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/eg;->i([B)Landroid/util/Pair;

    move-result-object v4

    iget-object v7, v6, Lcom/daaw/t1;->e:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, -0x1

    const/4 v11, -0x1

    iget-object v5, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    iget-object v0, v6, Lcom/daaw/t1;->d:Ljava/lang/String;

    const-string v8, "audio/mp4a-latm"

    move-object/from16 v17, v0

    invoke-static/range {v7 .. v17}, Lcom/google/android/exoplayer2/Format;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    const-wide/32 v4, 0x3d090000

    iget v7, v0, Lcom/google/android/exoplayer2/Format;->H:I

    int-to-long v7, v7

    div-long/2addr v4, v7

    iput-wide v4, v6, Lcom/daaw/t1;->m:J

    iget-object v4, v6, Lcom/daaw/t1;->f:Lcom/daaw/sm1;

    invoke-interface {v4, v0}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    iput-boolean v3, v6, Lcom/daaw/t1;->l:Z

    goto :goto_0

    :cond_1
    iget-object v0, v6, Lcom/daaw/t1;->b:Lcom/daaw/qv0;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Lcom/daaw/qv0;->o(I)V

    :goto_0
    iget-object v0, v6, Lcom/daaw/t1;->b:Lcom/daaw/qv0;

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->o(I)V

    iget-object v0, v6, Lcom/daaw/t1;->b:Lcom/daaw/qv0;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->h(I)I

    move-result v0

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x5

    iget-boolean v1, v6, Lcom/daaw/t1;->k:Z

    if-eqz v1, :cond_2

    add-int/lit8 v0, v0, -0x2

    :cond_2
    move v5, v0

    iget-object v1, v6, Lcom/daaw/t1;->f:Lcom/daaw/sm1;

    iget-wide v2, v6, Lcom/daaw/t1;->m:J

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/t1;->n(Lcom/daaw/sm1;JII)V

    return-void
.end method

.method public final i()V
    .locals 9

    iget-object v0, p0, Lcom/daaw/t1;->g:Lcom/daaw/sm1;

    iget-object v1, p0, Lcom/daaw/t1;->c:Lcom/daaw/rv0;

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget-object v0, p0, Lcom/daaw/t1;->c:Lcom/daaw/rv0;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->J(I)V

    iget-object v4, p0, Lcom/daaw/t1;->g:Lcom/daaw/sm1;

    iget-object v0, p0, Lcom/daaw/t1;->c:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->w()I

    move-result v0

    add-int/lit8 v8, v0, 0xa

    const-wide/16 v5, 0x0

    const/16 v7, 0xa

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/t1;->n(Lcom/daaw/sm1;JII)V

    return-void
.end method

.method public final j(Lcom/daaw/rv0;)V
    .locals 7

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    iget v1, p0, Lcom/daaw/t1;->n:I

    iget v2, p0, Lcom/daaw/t1;->i:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/t1;->p:Lcom/daaw/sm1;

    invoke-interface {v1, p1, v0}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget p1, p0, Lcom/daaw/t1;->i:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/t1;->i:I

    iget v4, p0, Lcom/daaw/t1;->n:I

    if-ne p1, v4, :cond_0

    iget-object v0, p0, Lcom/daaw/t1;->p:Lcom/daaw/sm1;

    iget-wide v1, p0, Lcom/daaw/t1;->o:J

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    iget-wide v0, p0, Lcom/daaw/t1;->o:J

    iget-wide v2, p0, Lcom/daaw/t1;->q:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/t1;->o:J

    invoke-virtual {p0}, Lcom/daaw/t1;->k()V

    :cond_0
    return-void
.end method

.method public final k()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/t1;->h:I

    iput v0, p0, Lcom/daaw/t1;->i:I

    const/16 v0, 0x100

    iput v0, p0, Lcom/daaw/t1;->j:I

    return-void
.end method

.method public final l()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/daaw/t1;->h:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/t1;->i:I

    return-void
.end method

.method public final m()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/t1;->h:I

    sget-object v0, Lcom/daaw/t1;->r:[B

    array-length v0, v0

    iput v0, p0, Lcom/daaw/t1;->i:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/t1;->n:I

    iget-object v1, p0, Lcom/daaw/t1;->c:Lcom/daaw/rv0;

    invoke-virtual {v1, v0}, Lcom/daaw/rv0;->J(I)V

    return-void
.end method

.method public final n(Lcom/daaw/sm1;JII)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lcom/daaw/t1;->h:I

    iput p4, p0, Lcom/daaw/t1;->i:I

    iput-object p1, p0, Lcom/daaw/t1;->p:Lcom/daaw/sm1;

    iput-wide p2, p0, Lcom/daaw/t1;->q:J

    iput p5, p0, Lcom/daaw/t1;->n:I

    return-void
.end method
