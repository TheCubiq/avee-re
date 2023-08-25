.class public final Lcom/daaw/jv;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wv;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/eo1$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:[Lcom/daaw/sm1;

.field public c:Z

.field public d:I

.field public e:I

.field public f:J


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/eo1$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jv;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lcom/daaw/sm1;

    iput-object p1, p0, Lcom/daaw/jv;->b:[Lcom/daaw/sm1;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/rv0;)V
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/jv;->c:Z

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/daaw/jv;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/16 v0, 0x20

    invoke-virtual {p0, p1, v0}, Lcom/daaw/jv;->f(Lcom/daaw/rv0;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/daaw/jv;->d:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-virtual {p0, p1, v1}, Lcom/daaw/jv;->f(Lcom/daaw/rv0;I)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/rv0;->c()I

    move-result v0

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v2

    iget-object v3, p0, Lcom/daaw/jv;->b:[Lcom/daaw/sm1;

    array-length v4, v3

    :goto_0
    if-ge v1, v4, :cond_2

    aget-object v5, v3, v1

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-interface {v5, p1, v2}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget p1, p0, Lcom/daaw/jv;->e:I

    add-int/2addr p1, v2

    iput p1, p0, Lcom/daaw/jv;->e:I

    :cond_3
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/jv;->c:Z

    return-void
.end method

.method public c()V
    .locals 11

    iget-boolean v0, p0, Lcom/daaw/jv;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/jv;->b:[Lcom/daaw/sm1;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-wide v5, p0, Lcom/daaw/jv;->f:J

    const/4 v7, 0x1

    iget v8, p0, Lcom/daaw/jv;->e:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v2, p0, Lcom/daaw/jv;->c:Z

    :cond_1
    return-void
.end method

.method public d(Lcom/daaw/d00;Lcom/daaw/eo1$d;)V
    .locals 11

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/jv;->b:[Lcom/daaw/sm1;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/jv;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/eo1$a;

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->a()V

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->c()I

    move-result v2

    const/4 v3, 0x3

    invoke-interface {p1, v2, v3}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v2

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->b()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    iget-object v4, v1, Lcom/daaw/eo1$a;->c:[B

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    iget-object v9, v1, Lcom/daaw/eo1$a;->a:Ljava/lang/String;

    const/4 v10, 0x0

    const-string v4, "application/dvbsubs"

    invoke-static/range {v3 .. v10}, Lcom/google/android/exoplayer2/Format;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    iget-object v1, p0, Lcom/daaw/jv;->b:[Lcom/daaw/sm1;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(JZ)V
    .locals 0

    if-nez p3, :cond_0

    return-void

    :cond_0
    const/4 p3, 0x1

    iput-boolean p3, p0, Lcom/daaw/jv;->c:Z

    iput-wide p1, p0, Lcom/daaw/jv;->f:J

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/jv;->e:I

    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/jv;->d:I

    return-void
.end method

.method public final f(Lcom/daaw/rv0;I)Z
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result p1

    if-eq p1, p2, :cond_1

    iput-boolean v1, p0, Lcom/daaw/jv;->c:Z

    :cond_1
    iget p1, p0, Lcom/daaw/jv;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/jv;->d:I

    iget-boolean p1, p0, Lcom/daaw/jv;->c:Z

    return p1
.end method
