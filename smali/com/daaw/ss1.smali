.class public final Lcom/daaw/ss1;
.super Lcom/daaw/nj1;
.source ""


# instance fields
.field public final b:Lcom/daaw/rv0;

.field public final c:Lcom/daaw/rv0;

.field public d:I

.field public e:Z

.field public f:I


# direct methods
.method public constructor <init>(Lcom/daaw/sm1;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/daaw/nj1;-><init>(Lcom/daaw/sm1;)V

    new-instance p1, Lcom/daaw/rv0;

    sget-object v0, Lcom/daaw/sr0;->a:[B

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>([B)V

    iput-object p1, p0, Lcom/daaw/ss1;->b:Lcom/daaw/rv0;

    new-instance p1, Lcom/daaw/rv0;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/ss1;->c:Lcom/daaw/rv0;

    return-void
.end method


# virtual methods
.method public b(Lcom/daaw/rv0;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result p1

    shr-int/lit8 v0, p1, 0x4

    and-int/lit8 v0, v0, 0xf

    and-int/lit8 p1, p1, 0xf

    const/4 v1, 0x7

    if-ne p1, v1, :cond_1

    iput v0, p0, Lcom/daaw/ss1;->f:I

    const/4 p1, 0x5

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    new-instance v0, Lcom/daaw/nj1$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video format not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/nj1$a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Lcom/daaw/rv0;J)V
    .locals 12

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result v0

    invoke-virtual {p1}, Lcom/daaw/rv0;->j()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    add-long v4, p2, v1

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-nez v0, :cond_0

    iget-boolean v1, p0, Lcom/daaw/ss1;->e:Z

    if-nez v1, :cond_0

    new-instance v0, Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v1

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>([B)V

    iget-object v1, v0, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v2

    invoke-virtual {p1, v1, p3, v2}, Lcom/daaw/rv0;->g([BII)V

    invoke-static {v0}, Lcom/daaw/y9;->b(Lcom/daaw/rv0;)Lcom/daaw/y9;

    move-result-object p1

    iget p3, p1, Lcom/daaw/y9;->b:I

    iput p3, p0, Lcom/daaw/ss1;->d:I

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, -0x1

    iget v5, p1, Lcom/daaw/y9;->c:I

    iget v6, p1, Lcom/daaw/y9;->d:I

    const/high16 v7, -0x40800000    # -1.0f

    iget-object v8, p1, Lcom/daaw/y9;->a:Ljava/util/List;

    const/4 v9, -0x1

    iget v10, p1, Lcom/daaw/y9;->e:F

    const/4 v11, 0x0

    const-string v1, "video/avc"

    invoke-static/range {v0 .. v11}, Lcom/google/android/exoplayer2/Format;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;IFLcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object p1

    iget-object p3, p0, Lcom/daaw/nj1;->a:Lcom/daaw/sm1;

    invoke-interface {p3, p1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    iput-boolean p2, p0, Lcom/daaw/ss1;->e:Z

    goto :goto_2

    :cond_0
    if-ne v0, p2, :cond_3

    iget-boolean v0, p0, Lcom/daaw/ss1;->e:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/ss1;->c:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    aput-byte p3, v0, p3

    aput-byte p3, v0, p2

    const/4 v1, 0x2

    aput-byte p3, v0, v1

    iget v0, p0, Lcom/daaw/ss1;->d:I

    const/4 v1, 0x4

    rsub-int/lit8 v0, v0, 0x4

    const/4 v7, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v2

    if-lez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/ss1;->c:Lcom/daaw/rv0;

    iget-object v2, v2, Lcom/daaw/rv0;->a:[B

    iget v3, p0, Lcom/daaw/ss1;->d:I

    invoke-virtual {p1, v2, v0, v3}, Lcom/daaw/rv0;->g([BII)V

    iget-object v2, p0, Lcom/daaw/ss1;->c:Lcom/daaw/rv0;

    invoke-virtual {v2, p3}, Lcom/daaw/rv0;->J(I)V

    iget-object v2, p0, Lcom/daaw/ss1;->c:Lcom/daaw/rv0;

    invoke-virtual {v2}, Lcom/daaw/rv0;->B()I

    move-result v2

    iget-object v3, p0, Lcom/daaw/ss1;->b:Lcom/daaw/rv0;

    invoke-virtual {v3, p3}, Lcom/daaw/rv0;->J(I)V

    iget-object v3, p0, Lcom/daaw/nj1;->a:Lcom/daaw/sm1;

    iget-object v6, p0, Lcom/daaw/ss1;->b:Lcom/daaw/rv0;

    invoke-interface {v3, v6, v1}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    add-int/lit8 v7, v7, 0x4

    iget-object v3, p0, Lcom/daaw/nj1;->a:Lcom/daaw/sm1;

    invoke-interface {v3, p1, v2}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    add-int/2addr v7, v2

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/daaw/nj1;->a:Lcom/daaw/sm1;

    iget p1, p0, Lcom/daaw/ss1;->f:I

    if-ne p1, p2, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    :cond_3
    :goto_2
    return-void
.end method
