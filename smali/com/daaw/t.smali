.class public final Lcom/daaw/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wv;


# instance fields
.field public final a:Lcom/daaw/qv0;

.field public final b:Lcom/daaw/rv0;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Lcom/daaw/sm1;

.field public f:I

.field public g:I

.field public h:Z

.field public i:J

.field public j:Lcom/google/android/exoplayer2/Format;

.field public k:I

.field public l:J


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/t;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/qv0;

    const/16 v1, 0x80

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/daaw/qv0;-><init>([B)V

    iput-object v0, p0, Lcom/daaw/t;->a:Lcom/daaw/qv0;

    new-instance v1, Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/qv0;->a:[B

    invoke-direct {v1, v0}, Lcom/daaw/rv0;-><init>([B)V

    iput-object v1, p0, Lcom/daaw/t;->b:Lcom/daaw/rv0;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/t;->f:I

    iput-object p1, p0, Lcom/daaw/t;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/rv0;)V
    .locals 10

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    if-lez v0, :cond_4

    iget v0, p0, Lcom/daaw/t;->f:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    iget v2, p0, Lcom/daaw/t;->k:I

    iget v3, p0, Lcom/daaw/t;->g:I

    sub-int/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v2, p0, Lcom/daaw/t;->e:Lcom/daaw/sm1;

    invoke-interface {v2, p1, v0}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget v2, p0, Lcom/daaw/t;->g:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/daaw/t;->g:I

    iget v7, p0, Lcom/daaw/t;->k:I

    if-ne v2, v7, :cond_0

    iget-object v3, p0, Lcom/daaw/t;->e:Lcom/daaw/sm1;

    iget-wide v4, p0, Lcom/daaw/t;->l:J

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    iget-wide v2, p0, Lcom/daaw/t;->l:J

    iget-wide v4, p0, Lcom/daaw/t;->i:J

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/daaw/t;->l:J

    iput v1, p0, Lcom/daaw/t;->f:I

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/t;->b:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/16 v3, 0x80

    invoke-virtual {p0, p1, v0, v3}, Lcom/daaw/t;->f(Lcom/daaw/rv0;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/t;->g()V

    iget-object v0, p0, Lcom/daaw/t;->b:Lcom/daaw/rv0;

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->J(I)V

    iget-object v0, p0, Lcom/daaw/t;->e:Lcom/daaw/sm1;

    iget-object v1, p0, Lcom/daaw/t;->b:Lcom/daaw/rv0;

    invoke-interface {v0, v1, v3}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iput v2, p0, Lcom/daaw/t;->f:I

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/t;->h(Lcom/daaw/rv0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput v3, p0, Lcom/daaw/t;->f:I

    iget-object v0, p0, Lcom/daaw/t;->b:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/16 v4, 0xb

    aput-byte v4, v0, v1

    const/16 v1, 0x77

    aput-byte v1, v0, v3

    iput v2, p0, Lcom/daaw/t;->g:I

    goto :goto_0

    :cond_4
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/t;->f:I

    iput v0, p0, Lcom/daaw/t;->g:I

    iput-boolean v0, p0, Lcom/daaw/t;->h:Z

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d(Lcom/daaw/d00;Lcom/daaw/eo1$d;)V
    .locals 1

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->a()V

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/t;->d:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->c()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/t;->e:Lcom/daaw/sm1;

    return-void
.end method

.method public e(JZ)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/t;->l:J

    return-void
.end method

.method public final f(Lcom/daaw/rv0;[BI)Z
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    iget v1, p0, Lcom/daaw/t;->g:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Lcom/daaw/t;->g:I

    invoke-virtual {p1, p2, v1, v0}, Lcom/daaw/rv0;->g([BII)V

    iget p1, p0, Lcom/daaw/t;->g:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/t;->g:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final g()V
    .locals 14

    iget-object v0, p0, Lcom/daaw/t;->a:Lcom/daaw/qv0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/qv0;->m(I)V

    iget-object v0, p0, Lcom/daaw/t;->a:Lcom/daaw/qv0;

    invoke-static {v0}, Lcom/daaw/u;->e(Lcom/daaw/qv0;)Lcom/daaw/u$b;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/t;->j:Lcom/google/android/exoplayer2/Format;

    if-eqz v1, :cond_0

    iget v2, v0, Lcom/daaw/u$b;->d:I

    iget v3, v1, Lcom/google/android/exoplayer2/Format;->G:I

    if-ne v2, v3, :cond_0

    iget v2, v0, Lcom/daaw/u$b;->c:I

    iget v3, v1, Lcom/google/android/exoplayer2/Format;->H:I

    if-ne v2, v3, :cond_0

    iget-object v2, v0, Lcom/daaw/u$b;->a:Ljava/lang/String;

    iget-object v1, v1, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    if-eq v2, v1, :cond_1

    :cond_0
    iget-object v3, p0, Lcom/daaw/t;->d:Ljava/lang/String;

    iget-object v4, v0, Lcom/daaw/u$b;->a:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, -0x1

    iget v8, v0, Lcom/daaw/u$b;->d:I

    iget v9, v0, Lcom/daaw/u$b;->c:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    iget-object v13, p0, Lcom/daaw/t;->c:Ljava/lang/String;

    invoke-static/range {v3 .. v13}, Lcom/google/android/exoplayer2/Format;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/t;->j:Lcom/google/android/exoplayer2/Format;

    iget-object v2, p0, Lcom/daaw/t;->e:Lcom/daaw/sm1;

    invoke-interface {v2, v1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    :cond_1
    iget v1, v0, Lcom/daaw/u$b;->e:I

    iput v1, p0, Lcom/daaw/t;->k:I

    const-wide/32 v1, 0xf4240

    iget v0, v0, Lcom/daaw/u$b;->f:I

    int-to-long v3, v0

    mul-long v3, v3, v1

    iget-object v0, p0, Lcom/daaw/t;->j:Lcom/google/android/exoplayer2/Format;

    iget v0, v0, Lcom/google/android/exoplayer2/Format;->H:I

    int-to-long v0, v0

    div-long/2addr v3, v0

    iput-wide v3, p0, Lcom/daaw/t;->i:J

    return-void
.end method

.method public final h(Lcom/daaw/rv0;)Z
    .locals 5

    :goto_0
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_3

    iget-boolean v0, p0, Lcom/daaw/t;->h:Z

    const/16 v2, 0xb

    const/4 v3, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result v0

    if-ne v0, v2, :cond_0

    :goto_1
    const/4 v1, 0x1

    :cond_0
    iput-boolean v1, p0, Lcom/daaw/t;->h:Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result v0

    const/16 v4, 0x77

    if-ne v0, v4, :cond_2

    iput-boolean v1, p0, Lcom/daaw/t;->h:Z

    return v3

    :cond_2
    if-ne v0, v2, :cond_0

    goto :goto_1

    :cond_3
    return v1
.end method
