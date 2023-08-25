.class public final Lcom/daaw/u42;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j09;


# static fields
.field public static final n:Lcom/daaw/q09;

.field public static final o:[I

.field public static final p:[I

.field public static final q:[B

.field public static final r:[B

.field public static final s:I


# instance fields
.field public final a:[B

.field public b:Z

.field public c:J

.field public d:I

.field public e:I

.field public f:Z

.field public g:I

.field public h:I

.field public i:J

.field public j:Lcom/daaw/m09;

.field public k:Lcom/daaw/m42;

.field public l:Lcom/daaw/i42;

.field public m:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lcom/daaw/t42;->b:Lcom/daaw/t42;

    sput-object v0, Lcom/daaw/u42;->n:Lcom/daaw/q09;

    const/16 v0, 0x10

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/daaw/u42;->o:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/daaw/u42;->p:[I

    const-string v1, "#!AMR\n"

    invoke-static {v1}, Lcom/daaw/it5;->B(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Lcom/daaw/u42;->q:[B

    const-string v1, "#!AMR-WB\n"

    invoke-static {v1}, Lcom/daaw/it5;->B(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Lcom/daaw/u42;->r:[B

    const/16 v1, 0x8

    aget v0, v0, v1

    sput v0, Lcom/daaw/u42;->s:I

    return-void

    nop

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

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/daaw/u42;->a:[B

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/u42;->g:I

    return-void
.end method

.method public static e(Lcom/daaw/k09;[B)Z
    .locals 3

    invoke-interface {p0}, Lcom/daaw/k09;->zzj()V

    array-length v0, p1

    new-array v1, v0, [B

    check-cast p0, Lcom/daaw/rz8;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/u42;->g(Lcom/daaw/k09;)Z

    move-result p1

    return p1
.end method

.method public final b(Lcom/daaw/k09;)I
    .locals 11
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "trackOutput"
        }
    .end annotation

    iget v0, p0, Lcom/daaw/u42;->e:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_7

    :try_start_0
    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    iget-object v0, p0, Lcom/daaw/u42;->a:[B

    move-object v4, p1

    check-cast v4, Lcom/daaw/rz8;

    invoke-virtual {v4, v0, v3, v2, v3}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object v0, p0, Lcom/daaw/u42;->a:[B

    aget-byte v0, v0, v3

    and-int/lit16 v4, v0, 0x83

    const/4 v5, 0x0

    if-gtz v4, :cond_6

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xf

    iget-boolean v4, p0, Lcom/daaw/u42;->b:Z

    if-eqz v4, :cond_0

    const/16 v6, 0xa

    if-lt v0, v6, :cond_1

    const/16 v6, 0xd

    if-le v0, v6, :cond_0

    goto :goto_0

    :cond_0
    if-nez v4, :cond_4

    const/16 v6, 0xc

    if-lt v0, v6, :cond_1

    const/16 v6, 0xe

    if-gt v0, v6, :cond_1

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    sget-object v4, Lcom/daaw/u42;->p:[I

    aget v0, v4, v0

    goto :goto_1

    :cond_2
    sget-object v4, Lcom/daaw/u42;->o:[I

    aget v0, v4, v0

    :goto_1
    iput v0, p0, Lcom/daaw/u42;->d:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iput v0, p0, Lcom/daaw/u42;->e:I

    iget v4, p0, Lcom/daaw/u42;->g:I

    if-ne v4, v1, :cond_3

    iput v0, p0, Lcom/daaw/u42;->g:I

    move v4, v0

    :cond_3
    if-ne v4, v0, :cond_7

    iget v4, p0, Lcom/daaw/u42;->h:I

    add-int/2addr v4, v2

    iput v4, p0, Lcom/daaw/u42;->h:I

    goto :goto_3

    :cond_4
    :goto_2
    :try_start_1
    const-string p1, "WB"

    const-string v3, "NB"

    if-eq v2, v4, :cond_5

    move-object p1, v3

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Illegal AMR "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " frame type "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid padding bits for frame header "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return v1

    :cond_7
    :goto_3
    iget-object v4, p0, Lcom/daaw/u42;->k:Lcom/daaw/m42;

    invoke-static {v4, p1, v0, v2}, Lcom/daaw/k42;->a(Lcom/daaw/m42;Lcom/daaw/xp8;IZ)I

    move-result p1

    if-ne p1, v1, :cond_8

    return v1

    :cond_8
    iget v0, p0, Lcom/daaw/u42;->e:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/u42;->e:I

    if-lez v0, :cond_9

    return v3

    :cond_9
    iget-object v4, p0, Lcom/daaw/u42;->k:Lcom/daaw/m42;

    iget-wide v5, p0, Lcom/daaw/u42;->c:J

    const/4 v7, 0x1

    iget v8, p0, Lcom/daaw/u42;->d:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    iget-wide v0, p0, Lcom/daaw/u42;->c:J

    const-wide/16 v4, 0x4e20

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/daaw/u42;->c:J

    return v3
.end method

.method public final c(Lcom/daaw/m09;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/u42;->j:Lcom/daaw/m09;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/u42;->k:Lcom/daaw/m42;

    invoke-interface {p1}, Lcom/daaw/m09;->zzC()V

    return-void
.end method

.method public final d(Lcom/daaw/k09;Lcom/daaw/f42;)I
    .locals 6

    iget-object p2, p0, Lcom/daaw/u42;->k:Lcom/daaw/m42;

    invoke-static {p2}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget p2, Lcom/daaw/it5;->a:I

    invoke-interface {p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/u42;->g(Lcom/daaw/k09;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const-string p2, "Could not find AMR header."

    invoke-static {p2, p1}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    iget-boolean p2, p0, Lcom/daaw/u42;->m:Z

    const/4 v0, 0x1

    if-nez p2, :cond_4

    iput-boolean v0, p0, Lcom/daaw/u42;->m:Z

    iget-boolean p2, p0, Lcom/daaw/u42;->b:Z

    if-eq v0, p2, :cond_2

    const-string v1, "audio/3gpp"

    goto :goto_1

    :cond_2
    const-string v1, "audio/amr-wb"

    :goto_1
    if-eq v0, p2, :cond_3

    const/16 p2, 0x1f40

    goto :goto_2

    :cond_3
    const/16 p2, 0x3e80

    :goto_2
    iget-object v4, p0, Lcom/daaw/u42;->k:Lcom/daaw/m42;

    new-instance v5, Lcom/daaw/b72;

    invoke-direct {v5}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v5, v1}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    sget v1, Lcom/daaw/u42;->s:I

    invoke-virtual {v5, v1}, Lcom/daaw/b72;->l(I)Lcom/daaw/b72;

    invoke-virtual {v5, v0}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    invoke-virtual {v5, p2}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    invoke-virtual {v5}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p2

    invoke-interface {v4, p2}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    :cond_4
    invoke-virtual {p0, p1}, Lcom/daaw/u42;->b(Lcom/daaw/k09;)I

    move-result p1

    iget-boolean p2, p0, Lcom/daaw/u42;->f:Z

    if-eqz p2, :cond_5

    return p1

    :cond_5
    new-instance p2, Lcom/daaw/h42;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p2, v4, v5, v2, v3}, Lcom/daaw/h42;-><init>(JJ)V

    iput-object p2, p0, Lcom/daaw/u42;->l:Lcom/daaw/i42;

    iget-object v1, p0, Lcom/daaw/u42;->j:Lcom/daaw/m09;

    invoke-interface {v1, p2}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    iput-boolean v0, p0, Lcom/daaw/u42;->f:Z

    return p1
.end method

.method public final f(JJ)V
    .locals 0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/daaw/u42;->c:J

    const/4 p3, 0x0

    iput p3, p0, Lcom/daaw/u42;->d:I

    iput p3, p0, Lcom/daaw/u42;->e:I

    iput-wide p1, p0, Lcom/daaw/u42;->i:J

    return-void
.end method

.method public final g(Lcom/daaw/k09;)Z
    .locals 4

    sget-object v0, Lcom/daaw/u42;->q:[B

    invoke-static {p1, v0}, Lcom/daaw/u42;->e(Lcom/daaw/k09;[B)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iput-boolean v3, p0, Lcom/daaw/u42;->b:Z

    array-length v0, v0

    :goto_0
    check-cast p1, Lcom/daaw/rz8;

    invoke-virtual {p1, v0, v3}, Lcom/daaw/rz8;->l(IZ)Z

    return v2

    :cond_0
    sget-object v0, Lcom/daaw/u42;->r:[B

    invoke-static {p1, v0}, Lcom/daaw/u42;->e(Lcom/daaw/k09;[B)Z

    move-result v1

    if-eqz v1, :cond_1

    iput-boolean v2, p0, Lcom/daaw/u42;->b:Z

    array-length v0, v0

    goto :goto_0

    :cond_1
    return v3
.end method
