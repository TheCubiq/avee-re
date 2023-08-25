.class public final Lcom/daaw/h31;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;


# static fields
.field public static final i:I


# instance fields
.field public final a:Lcom/google/android/exoplayer2/Format;

.field public final b:Lcom/daaw/rv0;

.field public c:Lcom/daaw/sm1;

.field public d:I

.field public e:I

.field public f:J

.field public g:I

.field public h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "RCC\u0001"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/h31;->i:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/Format;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h31;->a:Lcom/google/android/exoplayer2/Format;

    new-instance p1, Lcom/daaw/rv0;

    const/16 v0, 0x9

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/h31;->d:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public final b(Lcom/daaw/a00;)Z
    .locals 4

    iget-object v0, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->F()V

    iget-object v0, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x0

    const/16 v2, 0x8

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/daaw/a00;->c([BIIZ)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->i()I

    move-result p1

    sget v0, Lcom/daaw/h31;->i:I

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result p1

    iput p1, p0, Lcom/daaw/h31;->e:I

    return v3

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Input not RawCC"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return v1
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->F()V

    iget-object v0, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->k([BII)V

    iget-object p1, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->i()I

    move-result p1

    sget v0, Lcom/daaw/h31;->i:I

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 4

    :goto_0
    iget p2, p0, Lcom/daaw/h31;->d:I

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eqz p2, :cond_3

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq p2, v1, :cond_1

    if-ne p2, v3, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/h31;->e(Lcom/daaw/a00;)V

    iput v1, p0, Lcom/daaw/h31;->d:I

    return v2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/h31;->g(Lcom/daaw/a00;)Z

    move-result p2

    if-eqz p2, :cond_2

    iput v3, p0, Lcom/daaw/h31;->d:I

    goto :goto_0

    :cond_2
    iput v2, p0, Lcom/daaw/h31;->d:I

    return v0

    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/h31;->b(Lcom/daaw/a00;)Z

    move-result p2

    if-eqz p2, :cond_4

    iput v1, p0, Lcom/daaw/h31;->d:I

    goto :goto_0

    :cond_4
    return v0
.end method

.method public final e(Lcom/daaw/a00;)V
    .locals 8

    :goto_0
    iget v0, p0, Lcom/daaw/h31;->g:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->F()V

    iget-object v0, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->f([BII)V

    iget-object v0, p0, Lcom/daaw/h31;->c:Lcom/daaw/sm1;

    iget-object v1, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    invoke-interface {v0, v1, v2}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget v0, p0, Lcom/daaw/h31;->h:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/daaw/h31;->h:I

    iget v0, p0, Lcom/daaw/h31;->g:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/h31;->g:I

    goto :goto_0

    :cond_0
    iget v5, p0, Lcom/daaw/h31;->h:I

    if-lez v5, :cond_1

    iget-object v1, p0, Lcom/daaw/h31;->c:Lcom/daaw/sm1;

    iget-wide v2, p0, Lcom/daaw/h31;->f:J

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    :cond_1
    return-void
.end method

.method public f(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/h31;->d:I

    return-void
.end method

.method public final g(Lcom/daaw/a00;)Z
    .locals 7

    iget-object v0, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->F()V

    iget v0, p0, Lcom/daaw/h31;->e:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v3, 0x5

    invoke-interface {p1, v0, v2, v3, v1}, Lcom/daaw/a00;->c([BIIZ)Z

    move-result p1

    if-nez p1, :cond_0

    return v2

    :cond_0
    iget-object p1, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->z()J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    mul-long v3, v3, v5

    const-wide/16 v5, 0x2d

    div-long/2addr v3, v5

    :goto_0
    iput-wide v3, p0, Lcom/daaw/h31;->f:J

    goto :goto_1

    :cond_1
    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/16 v3, 0x9

    invoke-interface {p1, v0, v2, v3, v1}, Lcom/daaw/a00;->c([BIIZ)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    iget-object p1, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->q()J

    move-result-wide v3

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/daaw/h31;->b:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result p1

    iput p1, p0, Lcom/daaw/h31;->g:I

    iput v2, p0, Lcom/daaw/h31;->h:I

    return v1

    :cond_3
    new-instance p1, Lcom/daaw/tv0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported version number: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/h31;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 3

    new-instance v0, Lcom/daaw/da1$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lcom/daaw/da1$b;-><init>(J)V

    invoke-interface {p1, v0}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-interface {p1, v0, v1}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/h31;->c:Lcom/daaw/sm1;

    invoke-interface {p1}, Lcom/daaw/d00;->n()V

    iget-object p1, p0, Lcom/daaw/h31;->c:Lcom/daaw/sm1;

    iget-object v0, p0, Lcom/daaw/h31;->a:Lcom/google/android/exoplayer2/Format;

    invoke-interface {p1, v0}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    return-void
.end method
