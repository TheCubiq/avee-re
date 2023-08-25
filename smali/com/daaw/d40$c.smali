.class public final Lcom/daaw/d40$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/d40;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lcom/daaw/sm1;

.field public final b:Lcom/daaw/qm1;

.field public c:Lcom/daaw/nm1;

.field public d:Lcom/daaw/qr;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public final i:Lcom/daaw/rv0;

.field public final j:Lcom/daaw/rv0;


# direct methods
.method public constructor <init>(Lcom/daaw/sm1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/d40$c;->a:Lcom/daaw/sm1;

    new-instance p1, Lcom/daaw/qm1;

    invoke-direct {p1}, Lcom/daaw/qm1;-><init>()V

    iput-object p1, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    new-instance p1, Lcom/daaw/rv0;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/d40$c;->i:Lcom/daaw/rv0;

    new-instance p1, Lcom/daaw/rv0;

    invoke-direct {p1}, Lcom/daaw/rv0;-><init>()V

    iput-object p1, p0, Lcom/daaw/d40$c;->j:Lcom/daaw/rv0;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/d40$c;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/d40$c;->h()V

    return-void
.end method


# virtual methods
.method public final b()Lcom/daaw/pm1;
    .locals 2

    iget-object v0, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v1, v0, Lcom/daaw/qm1;->a:Lcom/daaw/qr;

    iget v1, v1, Lcom/daaw/qr;->a:I

    iget-object v0, v0, Lcom/daaw/qm1;->o:Lcom/daaw/pm1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/d40$c;->c:Lcom/daaw/nm1;

    invoke-virtual {v0, v1}, Lcom/daaw/nm1;->a(I)Lcom/daaw/pm1;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public c(Lcom/daaw/nm1;Lcom/daaw/qr;)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/nm1;

    iput-object v0, p0, Lcom/daaw/d40$c;->c:Lcom/daaw/nm1;

    invoke-static {p2}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/qr;

    iput-object p2, p0, Lcom/daaw/d40$c;->d:Lcom/daaw/qr;

    iget-object p2, p0, Lcom/daaw/d40$c;->a:Lcom/daaw/sm1;

    iget-object p1, p1, Lcom/daaw/nm1;->f:Lcom/google/android/exoplayer2/Format;

    invoke-interface {p2, p1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    invoke-virtual {p0}, Lcom/daaw/d40$c;->f()V

    return-void
.end method

.method public d()Z
    .locals 4

    iget v0, p0, Lcom/daaw/d40$c;->e:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/d40$c;->e:I

    iget v0, p0, Lcom/daaw/d40$c;->f:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/d40$c;->f:I

    iget-object v2, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v2, v2, Lcom/daaw/qm1;->h:[I

    iget v3, p0, Lcom/daaw/d40$c;->g:I

    aget v2, v2, v3

    if-ne v0, v2, :cond_0

    add-int/2addr v3, v1

    iput v3, p0, Lcom/daaw/d40$c;->g:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/d40$c;->f:I

    return v0

    :cond_0
    return v1
.end method

.method public e()I
    .locals 8

    iget-object v0, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-boolean v0, v0, Lcom/daaw/qm1;->m:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/d40$c;->b()Lcom/daaw/pm1;

    move-result-object v0

    iget v2, v0, Lcom/daaw/pm1;->d:I

    if-eqz v2, :cond_1

    iget-object v0, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v0, v0, Lcom/daaw/qm1;->q:Lcom/daaw/rv0;

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lcom/daaw/pm1;->e:[B

    iget-object v2, p0, Lcom/daaw/d40$c;->j:Lcom/daaw/rv0;

    array-length v3, v0

    invoke-virtual {v2, v0, v3}, Lcom/daaw/rv0;->H([BI)V

    iget-object v2, p0, Lcom/daaw/d40$c;->j:Lcom/daaw/rv0;

    array-length v0, v0

    move-object v7, v2

    move v2, v0

    move-object v0, v7

    :goto_0
    iget-object v3, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v3, v3, Lcom/daaw/qm1;->n:[Z

    iget v4, p0, Lcom/daaw/d40$c;->e:I

    aget-boolean v3, v3, v4

    iget-object v4, p0, Lcom/daaw/d40$c;->i:Lcom/daaw/rv0;

    iget-object v5, v4, Lcom/daaw/rv0;->a:[B

    if-eqz v3, :cond_2

    const/16 v6, 0x80

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    or-int/2addr v6, v2

    int-to-byte v6, v6

    aput-byte v6, v5, v1

    invoke-virtual {v4, v1}, Lcom/daaw/rv0;->J(I)V

    iget-object v1, p0, Lcom/daaw/d40$c;->a:Lcom/daaw/sm1;

    iget-object v4, p0, Lcom/daaw/d40$c;->i:Lcom/daaw/rv0;

    const/4 v5, 0x1

    invoke-interface {v1, v4, v5}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget-object v1, p0, Lcom/daaw/d40$c;->a:Lcom/daaw/sm1;

    invoke-interface {v1, v0, v2}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    if-nez v3, :cond_3

    add-int/2addr v2, v5

    return v2

    :cond_3
    iget-object v0, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v0, v0, Lcom/daaw/qm1;->q:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->D()I

    move-result v1

    const/4 v3, -0x2

    invoke-virtual {v0, v3}, Lcom/daaw/rv0;->K(I)V

    mul-int/lit8 v1, v1, 0x6

    add-int/lit8 v1, v1, 0x2

    iget-object v3, p0, Lcom/daaw/d40$c;->a:Lcom/daaw/sm1;

    invoke-interface {v3, v0, v1}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    add-int/2addr v2, v5

    add-int/2addr v2, v1

    return v2
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    invoke-virtual {v0}, Lcom/daaw/qm1;->f()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/d40$c;->e:I

    iput v0, p0, Lcom/daaw/d40$c;->g:I

    iput v0, p0, Lcom/daaw/d40$c;->f:I

    iput v0, p0, Lcom/daaw/d40$c;->h:I

    return-void
.end method

.method public g(J)V
    .locals 4

    invoke-static {p1, p2}, Lcom/daaw/dd;->b(J)J

    move-result-wide p1

    iget v0, p0, Lcom/daaw/d40$c;->e:I

    :goto_0
    iget-object v1, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget v2, v1, Lcom/daaw/qm1;->f:I

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Lcom/daaw/qm1;->c(I)J

    move-result-wide v1

    cmp-long v3, v1, p1

    if-gez v3, :cond_1

    iget-object v1, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v1, v1, Lcom/daaw/qm1;->l:[Z

    aget-boolean v1, v1, v0

    if-eqz v1, :cond_0

    iput v0, p0, Lcom/daaw/d40$c;->h:I

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-boolean v1, v0, Lcom/daaw/qm1;->m:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Lcom/daaw/qm1;->q:Lcom/daaw/rv0;

    invoke-virtual {p0}, Lcom/daaw/d40$c;->b()Lcom/daaw/pm1;

    move-result-object v1

    iget v1, v1, Lcom/daaw/pm1;->d:I

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->K(I)V

    :cond_1
    iget-object v1, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v1, v1, Lcom/daaw/qm1;->n:[Z

    iget v2, p0, Lcom/daaw/d40$c;->e:I

    aget-boolean v1, v1, v2

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/daaw/rv0;->D()I

    move-result v1

    mul-int/lit8 v1, v1, 0x6

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->K(I)V

    :cond_2
    return-void
.end method

.method public i(Lcom/google/android/exoplayer2/drm/DrmInitData;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/d40$c;->c:Lcom/daaw/nm1;

    iget-object v1, p0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v1, v1, Lcom/daaw/qm1;->a:Lcom/daaw/qr;

    iget v1, v1, Lcom/daaw/qr;->a:I

    invoke-virtual {v0, v1}, Lcom/daaw/nm1;->a(I)Lcom/daaw/pm1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/daaw/pm1;->b:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/d40$c;->a:Lcom/daaw/sm1;

    iget-object v2, p0, Lcom/daaw/d40$c;->c:Lcom/daaw/nm1;

    iget-object v2, v2, Lcom/daaw/nm1;->f:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/drm/DrmInitData;->c(Ljava/lang/String;)Lcom/google/android/exoplayer2/drm/DrmInitData;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/exoplayer2/Format;->b(Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    return-void
.end method
