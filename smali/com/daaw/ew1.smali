.class public final Lcom/daaw/ew1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;


# static fields
.field public static final f:Lcom/daaw/e00;


# instance fields
.field public a:Lcom/daaw/d00;

.field public b:Lcom/daaw/sm1;

.field public c:Lcom/daaw/fw1;

.field public d:I

.field public e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ew1$a;

    invoke-direct {v0}, Lcom/daaw/ew1$a;-><init>()V

    sput-object v0, Lcom/daaw/ew1;->f:Lcom/daaw/e00;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 0

    invoke-static {p1}, Lcom/daaw/gw1;->a(Lcom/daaw/a00;)Lcom/daaw/fw1;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 12

    iget-object p2, p0, Lcom/daaw/ew1;->c:Lcom/daaw/fw1;

    if-nez p2, :cond_1

    invoke-static {p1}, Lcom/daaw/gw1;->a(Lcom/daaw/a00;)Lcom/daaw/fw1;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/ew1;->c:Lcom/daaw/fw1;

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p2}, Lcom/daaw/fw1;->a()I

    move-result v3

    const v4, 0x8000

    iget-object p2, p0, Lcom/daaw/ew1;->c:Lcom/daaw/fw1;

    invoke-virtual {p2}, Lcom/daaw/fw1;->f()I

    move-result v5

    iget-object p2, p0, Lcom/daaw/ew1;->c:Lcom/daaw/fw1;

    invoke-virtual {p2}, Lcom/daaw/fw1;->i()I

    move-result v6

    iget-object p2, p0, Lcom/daaw/ew1;->c:Lcom/daaw/fw1;

    invoke-virtual {p2}, Lcom/daaw/fw1;->d()I

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v1, "audio/raw"

    invoke-static/range {v0 .. v11}, Lcom/google/android/exoplayer2/Format;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/ew1;->b:Lcom/daaw/sm1;

    invoke-interface {v0, p2}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    iget-object p2, p0, Lcom/daaw/ew1;->c:Lcom/daaw/fw1;

    invoke-virtual {p2}, Lcom/daaw/fw1;->c()I

    move-result p2

    iput p2, p0, Lcom/daaw/ew1;->d:I

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/tv0;

    const-string p2, "Unsupported or unrecognized wav header."

    invoke-direct {p1, p2}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/daaw/ew1;->c:Lcom/daaw/fw1;

    invoke-virtual {p2}, Lcom/daaw/fw1;->j()Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lcom/daaw/ew1;->c:Lcom/daaw/fw1;

    invoke-static {p1, p2}, Lcom/daaw/gw1;->b(Lcom/daaw/a00;Lcom/daaw/fw1;)V

    iget-object p2, p0, Lcom/daaw/ew1;->a:Lcom/daaw/d00;

    iget-object v0, p0, Lcom/daaw/ew1;->c:Lcom/daaw/fw1;

    invoke-interface {p2, v0}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    :cond_2
    iget-object p2, p0, Lcom/daaw/ew1;->b:Lcom/daaw/sm1;

    const v0, 0x8000

    iget v1, p0, Lcom/daaw/ew1;->e:I

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    invoke-interface {p2, p1, v0, v1}, Lcom/daaw/sm1;->b(Lcom/daaw/a00;IZ)I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_3

    iget v1, p0, Lcom/daaw/ew1;->e:I

    add-int/2addr v1, p2

    iput v1, p0, Lcom/daaw/ew1;->e:I

    :cond_3
    iget v1, p0, Lcom/daaw/ew1;->e:I

    iget v2, p0, Lcom/daaw/ew1;->d:I

    div-int/2addr v1, v2

    if-lez v1, :cond_4

    iget-object v2, p0, Lcom/daaw/ew1;->c:Lcom/daaw/fw1;

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v3

    iget p1, p0, Lcom/daaw/ew1;->e:I

    int-to-long v5, p1

    sub-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Lcom/daaw/fw1;->b(J)J

    move-result-wide v6

    iget p1, p0, Lcom/daaw/ew1;->d:I

    mul-int v9, v1, p1

    iget p1, p0, Lcom/daaw/ew1;->e:I

    sub-int v10, p1, v9

    iput v10, p0, Lcom/daaw/ew1;->e:I

    iget-object v5, p0, Lcom/daaw/ew1;->b:Lcom/daaw/sm1;

    const/4 v8, 0x1

    const/4 v11, 0x0

    invoke-interface/range {v5 .. v11}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    :cond_4
    if-ne p2, v0, :cond_5

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public f(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/ew1;->e:I

    return-void
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/ew1;->a:Lcom/daaw/d00;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ew1;->b:Lcom/daaw/sm1;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ew1;->c:Lcom/daaw/fw1;

    invoke-interface {p1}, Lcom/daaw/d00;->n()V

    return-void
.end method
