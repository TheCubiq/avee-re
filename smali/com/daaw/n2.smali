.class public final Lcom/daaw/n2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;


# static fields
.field public static final h:Lcom/daaw/e00;

.field public static final i:[I

.field public static final j:[I

.field public static final k:[B

.field public static final l:[B

.field public static final m:I


# instance fields
.field public final a:[B

.field public b:Z

.field public c:J

.field public d:I

.field public e:I

.field public f:Lcom/daaw/sm1;

.field public g:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/n2$a;

    invoke-direct {v0}, Lcom/daaw/n2$a;-><init>()V

    sput-object v0, Lcom/daaw/n2;->h:Lcom/daaw/e00;

    const/16 v0, 0x10

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/daaw/n2;->i:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/daaw/n2;->j:[I

    const-string v1, "#!AMR\n"

    invoke-static {v1}, Lcom/daaw/sq1;->D(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Lcom/daaw/n2;->k:[B

    const-string v1, "#!AMR-WB\n"

    invoke-static {v1}, Lcom/daaw/sq1;->D(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Lcom/daaw/n2;->l:[B

    const/16 v1, 0x8

    aget v0, v0, v1

    sput v0, Lcom/daaw/n2;->m:I

    return-void

    :array_0
    .array-data 4
        0xd
        0xe
        0x10
        0x12
        0x14
        0x15
        0x1b
        0x20
        0x6
        0x7
        0x6
        0x6
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x12
        0x18
        0x21
        0x25
        0x29
        0x2f
        0x33
        0x3b
        0x3d
        0x6
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/n2;->a:[B

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public final b(I)I
    .locals 3

    invoke-virtual {p0, p1}, Lcom/daaw/n2;->g(I)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/tv0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal AMR "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/daaw/n2;->b:Z

    if-eqz v2, :cond_0

    const-string v2, "WB"

    goto :goto_0

    :cond_0
    const-string v2, "NB"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " frame type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/n2;->b:Z

    if-eqz v0, :cond_2

    sget-object v0, Lcom/daaw/n2;->j:[I

    aget p1, v0, p1

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/daaw/n2;->i:[I

    aget p1, v0, p1

    :goto_1
    return p1
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/n2;->l(Lcom/daaw/a00;)Z

    move-result p1

    return p1
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 4

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/n2;->l(Lcom/daaw/a00;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/tv0;

    const-string p2, "Could not find AMR header."

    invoke-direct {p1, p2}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/n2;->j()V

    invoke-virtual {p0, p1}, Lcom/daaw/n2;->n(Lcom/daaw/a00;)I

    move-result p1

    return p1
.end method

.method public final e(I)Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/n2;->b:Z

    if-nez v0, :cond_1

    const/16 v0, 0xc

    if-lt p1, v0, :cond_0

    const/16 v0, 0xe

    if-le p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f(JJ)V
    .locals 0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/daaw/n2;->c:J

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/n2;->d:I

    iput p1, p0, Lcom/daaw/n2;->e:I

    return-void
.end method

.method public final g(I)Z
    .locals 1

    if-ltz p1, :cond_1

    const/16 v0, 0xf

    if-gt p1, v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/n2;->h(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/n2;->e(I)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final h(I)Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/n2;->b:Z

    if-eqz v0, :cond_1

    const/16 v0, 0xa

    if-lt p1, v0, :cond_0

    const/16 v0, 0xd

    if-le p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 3

    new-instance v0, Lcom/daaw/da1$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lcom/daaw/da1$b;-><init>(J)V

    invoke-interface {p1, v0}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/n2;->f:Lcom/daaw/sm1;

    invoke-interface {p1}, Lcom/daaw/d00;->n()V

    return-void
.end method

.method public final j()V
    .locals 14

    iget-boolean v0, p0, Lcom/daaw/n2;->g:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/n2;->g:Z

    iget-boolean v0, p0, Lcom/daaw/n2;->b:Z

    if-eqz v0, :cond_0

    const-string v1, "audio/amr-wb"

    goto :goto_0

    :cond_0
    const-string v1, "audio/3gpp"

    :goto_0
    move-object v3, v1

    if-eqz v0, :cond_1

    const/16 v0, 0x3e80

    const/16 v8, 0x3e80

    goto :goto_1

    :cond_1
    const/16 v0, 0x1f40

    const/16 v8, 0x1f40

    :goto_1
    iget-object v0, p0, Lcom/daaw/n2;->f:Lcom/daaw/sm1;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    sget v6, Lcom/daaw/n2;->m:I

    const/4 v7, 0x1

    const/4 v9, -0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v13}, Lcom/google/android/exoplayer2/Format;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    :cond_2
    return-void
.end method

.method public final k(Lcom/daaw/a00;[B)Z
    .locals 3

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    array-length v0, p2

    new-array v0, v0, [B

    array-length v1, p2

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lcom/daaw/a00;->k([BII)V

    invoke-static {v0, p2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final l(Lcom/daaw/a00;)Z
    .locals 4

    sget-object v0, Lcom/daaw/n2;->k:[B

    invoke-virtual {p0, p1, v0}, Lcom/daaw/n2;->k(Lcom/daaw/a00;[B)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iput-boolean v2, p0, Lcom/daaw/n2;->b:Z

    array-length v0, v0

    :goto_0
    invoke-interface {p1, v0}, Lcom/daaw/a00;->j(I)V

    return v3

    :cond_0
    sget-object v0, Lcom/daaw/n2;->l:[B

    invoke-virtual {p0, p1, v0}, Lcom/daaw/n2;->k(Lcom/daaw/a00;[B)Z

    move-result v1

    if-eqz v1, :cond_1

    iput-boolean v3, p0, Lcom/daaw/n2;->b:Z

    array-length v0, v0

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final m(Lcom/daaw/a00;)I
    .locals 3

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    iget-object v0, p0, Lcom/daaw/n2;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->k([BII)V

    iget-object p1, p0, Lcom/daaw/n2;->a:[B

    aget-byte p1, p1, v1

    and-int/lit16 v0, p1, 0x83

    if-gtz v0, :cond_0

    shr-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0xf

    invoke-virtual {p0, p1}, Lcom/daaw/n2;->b(I)I

    move-result p1

    return p1

    :cond_0
    new-instance v0, Lcom/daaw/tv0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid padding bits for frame header "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final n(Lcom/daaw/a00;)I
    .locals 8

    iget v0, p0, Lcom/daaw/n2;->e:I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/daaw/n2;->m(Lcom/daaw/a00;)I

    move-result v0

    iput v0, p0, Lcom/daaw/n2;->d:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iput v0, p0, Lcom/daaw/n2;->e:I

    goto :goto_0

    :catch_0
    return v1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/daaw/n2;->f:Lcom/daaw/sm1;

    iget v2, p0, Lcom/daaw/n2;->e:I

    const/4 v3, 0x1

    invoke-interface {v0, p1, v2, v3}, Lcom/daaw/sm1;->b(Lcom/daaw/a00;IZ)I

    move-result p1

    if-ne p1, v1, :cond_1

    return v1

    :cond_1
    iget v0, p0, Lcom/daaw/n2;->e:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/n2;->e:I

    const/4 p1, 0x0

    if-lez v0, :cond_2

    return p1

    :cond_2
    iget-object v1, p0, Lcom/daaw/n2;->f:Lcom/daaw/sm1;

    iget-wide v2, p0, Lcom/daaw/n2;->c:J

    const/4 v4, 0x1

    iget v5, p0, Lcom/daaw/n2;->d:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    iget-wide v0, p0, Lcom/daaw/n2;->c:J

    const-wide/16 v2, 0x4e20

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/n2;->c:J

    return p1
.end method
