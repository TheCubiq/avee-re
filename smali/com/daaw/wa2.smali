.class public final Lcom/daaw/wa2;
.super Lcom/daaw/gb2;
.source ""


# instance fields
.field public n:Lcom/daaw/w09;

.field public o:Lcom/daaw/va2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/gb2;-><init>()V

    return-void
.end method

.method public static j([B)Z
    .locals 2

    const/4 v0, 0x0

    aget-byte p0, p0, v0

    const/4 v1, -0x1

    if-ne p0, v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v0
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)J
    .locals 4

    invoke-virtual {p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/wa2;->j([B)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    const/4 v1, 0x2

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x4

    shr-int/2addr v0, v1

    const/4 v2, 0x6

    const/4 v3, 0x7

    if-eq v0, v2, :cond_0

    if-ne v0, v3, :cond_1

    const/4 v0, 0x7

    :cond_0
    invoke-virtual {p1, v1}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p1}, Lcom/daaw/ik5;->C()J

    :cond_1
    invoke-static {p1, v0}, Lcom/daaw/s09;->a(Lcom/daaw/ik5;I)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/daaw/ik5;->f(I)V

    int-to-long v0, v0

    return-wide v0

    :cond_2
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final b(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/gb2;->b(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/wa2;->n:Lcom/daaw/w09;

    iput-object p1, p0, Lcom/daaw/wa2;->o:Lcom/daaw/va2;

    :cond_0
    return-void
.end method

.method public final c(Lcom/daaw/ik5;JLcom/daaw/db2;)Z
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "#3.format"
        }
        result = false
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/wa2;->n:Lcom/daaw/w09;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    new-instance p2, Lcom/daaw/w09;

    const/16 p3, 0x11

    invoke-direct {p2, v0, p3}, Lcom/daaw/w09;-><init>([BI)V

    iput-object p2, p0, Lcom/daaw/wa2;->n:Lcom/daaw/w09;

    const/16 p3, 0x9

    invoke-virtual {p1}, Lcom/daaw/ik5;->l()I

    move-result p1

    invoke-static {v0, p3, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Lcom/daaw/w09;->c([BLcom/google/android/gms/internal/ads/zzbq;)Lcom/daaw/f92;

    move-result-object p1

    iput-object p1, p4, Lcom/daaw/db2;->a:Lcom/daaw/f92;

    return v2

    :cond_0
    const/4 v3, 0x0

    aget-byte v4, v0, v3

    and-int/lit8 v4, v4, 0x7f

    const/4 v5, 0x3

    if-ne v4, v5, :cond_1

    invoke-static {p1}, Lcom/daaw/t09;->b(Lcom/daaw/ik5;)Lcom/daaw/v09;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/w09;->f(Lcom/daaw/v09;)Lcom/daaw/w09;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/wa2;->n:Lcom/daaw/w09;

    new-instance p3, Lcom/daaw/va2;

    invoke-direct {p3, p2, p1}, Lcom/daaw/va2;-><init>(Lcom/daaw/w09;Lcom/daaw/v09;)V

    iput-object p3, p0, Lcom/daaw/wa2;->o:Lcom/daaw/va2;

    return v2

    :cond_1
    invoke-static {v0}, Lcom/daaw/wa2;->j([B)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/wa2;->o:Lcom/daaw/va2;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p2, p3}, Lcom/daaw/va2;->c(J)V

    iget-object p1, p0, Lcom/daaw/wa2;->o:Lcom/daaw/va2;

    iput-object p1, p4, Lcom/daaw/db2;->b:Lcom/daaw/bb2;

    :cond_2
    iget-object p1, p4, Lcom/daaw/db2;->a:Lcom/daaw/f92;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return v3

    :cond_3
    return v2
.end method
