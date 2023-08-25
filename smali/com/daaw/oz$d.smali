.class public Lcom/daaw/oz$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bx0$a;
.implements Lcom/daaw/xp0;
.implements Lcom/daaw/fd1$c;
.implements Lcom/daaw/pk1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/oz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public A:I

.field public B:Landroid/content/Context;

.field public final synthetic C:Lcom/daaw/oz;

.field public final p:Lcom/daaw/lq;

.field public q:Lcom/google/android/exoplayer2/trackselection/b;

.field public r:Lcom/daaw/mp$a;

.field public s:Lcom/daaw/wd0;

.field public t:Lcom/daaw/bp0;

.field public u:I

.field public v:F

.field public w:F

.field public x:F

.field public y:Lcom/daaw/fd1;

.field public z:F


# direct methods
.method public constructor <init>(Lcom/daaw/oz;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/daaw/lq;

    invoke-direct {p1}, Lcom/daaw/lq;-><init>()V

    iput-object p1, p0, Lcom/daaw/oz$d;->p:Lcom/daaw/lq;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/oz$d;->u:I

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/daaw/oz$d;->v:F

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/oz$d;->w:F

    iput p1, p0, Lcom/daaw/oz$d;->x:F

    iput p1, p0, Lcom/daaw/oz$d;->z:F

    iput-object p2, p0, Lcom/daaw/oz$d;->B:Landroid/content/Context;

    iput p3, p0, Lcom/daaw/oz$d;->A:I

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/oz$d;->l(Z)Lcom/daaw/mp$a;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/oz$d;->r:Lcom/daaw/mp$a;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/oz$d;)I
    .locals 0

    iget p0, p0, Lcom/daaw/oz$d;->A:I

    return p0
.end method

.method public static synthetic i(Lcom/daaw/oz$d;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/oz$d;->B()V

    return-void
.end method

.method public static synthetic j(Lcom/daaw/oz$d;)Lcom/daaw/fd1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    return-object p0
.end method


# virtual methods
.method public A(Lcom/daaw/qz;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    if-nez p1, :cond_0

    move-object p1, v0

    :cond_0
    const-string v1, "java.io.IOException:"

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "java.lang.IllegalStateException"

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    iget-object v0, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->z(Lcom/daaw/oz;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    return-void
.end method

.method public final B()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/fd1;->a()V

    iput-object v1, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    :cond_0
    iput-object v1, p0, Lcom/daaw/oz$d;->q:Lcom/google/android/exoplayer2/trackselection/b;

    return-void
.end method

.method public C(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/fd1;->f(J)V

    :cond_0
    return-void
.end method

.method public D(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/oz$d;->w:F

    invoke-virtual {p0}, Lcom/daaw/oz$d;->L()V

    return-void
.end method

.method public E(F)Z
    .locals 3

    iget v0, p0, Lcom/daaw/oz$d;->w:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/daaw/oz$d;->w:F

    const/4 p1, 0x1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    iput v1, p0, Lcom/daaw/oz$d;->w:F

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/daaw/oz$d;->w:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_1

    iput v2, p0, Lcom/daaw/oz$d;->w:F

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    invoke-virtual {p0}, Lcom/daaw/oz$d;->L()V

    return p1
.end method

.method public F(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/oz$d;->z:F

    return-void
.end method

.method public G(I)V
    .locals 0

    return-void
.end method

.method public H(Landroid/view/Surface;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    invoke-virtual {v0, p0}, Lcom/daaw/fd1;->I(Lcom/daaw/fd1$c;)V

    iget-object v0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    invoke-virtual {v0, p1}, Lcom/daaw/fd1;->J(Landroid/view/Surface;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    iget-object p1, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/fd1;->I(Lcom/daaw/fd1$c;)V

    iget-object p1, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    invoke-virtual {p1, v0}, Lcom/daaw/fd1;->J(Landroid/view/Surface;)V

    return v1
.end method

.method public I(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/oz$d;->v:F

    invoke-virtual {p0}, Lcom/daaw/oz$d;->L()V

    return-void
.end method

.method public J(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/oz$d;->x:F

    invoke-virtual {p0}, Lcom/daaw/oz$d;->L()V

    return-void
.end method

.method public K()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/fd1;->h(Z)V

    :cond_0
    return-void
.end method

.method public L()V
    .locals 3

    iget v0, p0, Lcom/daaw/oz$d;->x:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v0, v1, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    iget v0, p0, Lcom/daaw/oz$d;->x:F

    add-float/2addr v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget-object v1, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    if-eqz v1, :cond_0

    iget v2, p0, Lcom/daaw/oz$d;->w:F

    mul-float v0, v0, v2

    iget v2, p0, Lcom/daaw/oz$d;->v:F

    mul-float v0, v0, v2

    invoke-virtual {v1, v0}, Lcom/daaw/fd1;->L(F)V

    :cond_0
    return-void
.end method

.method public b(IIIF)V
    .locals 7

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "width: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " height: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    int-to-float p3, p1

    int-to-float v0, p2

    if-ge p1, p2, :cond_0

    move v6, v0

    move v0, p3

    move p3, v6

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    cmpl-float v5, p3, v4

    if-lez v5, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    cmpl-float v4, v0, v4

    if-lez v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    and-int/2addr v2, v5

    if-eqz v2, :cond_3

    mul-float p3, p3, p4

    div-float v1, p3, v0

    :cond_3
    iget-object p3, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {p3}, Lcom/daaw/oz;->z(Lcom/daaw/oz;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object p3

    invoke-interface {p3, p1, p2, v1}, Lcom/daaw/avee/comp/playback/e$b;->i(IIF)V

    return-void
.end method

.method public c(Lcom/daaw/zw0;)V
    .locals 0

    return-void
.end method

.method public d(Z)V
    .locals 0

    return-void
.end method

.method public e(I)V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public h(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/ln;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public k(Lcom/daaw/bn1;)Lcom/daaw/mp$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/bn1<",
            "-",
            "Lcom/daaw/mp;",
            ">;)",
            "Lcom/daaw/mp$a;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/sq;

    iget-object v1, p0, Lcom/daaw/oz$d;->B:Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/daaw/oz$d;->n(Lcom/daaw/bn1;)Lcom/daaw/tb0$b;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/daaw/sq;-><init>(Landroid/content/Context;Lcom/daaw/bn1;Lcom/daaw/mp$a;)V

    return-object v0
.end method

.method public final l(Z)Lcom/daaw/mp$a;
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/oz$d;->p:Lcom/daaw/lq;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/oz$d;->k(Lcom/daaw/bn1;)Lcom/daaw/mp$a;

    move-result-object p1

    return-object p1
.end method

.method public m(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/um1;)V
    .locals 0

    return-void
.end method

.method public n(Lcom/daaw/bn1;)Lcom/daaw/tb0$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/bn1<",
            "-",
            "Lcom/daaw/mp;",
            ">;)",
            "Lcom/daaw/tb0$b;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/hr;

    iget-object v1, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {v1}, Lcom/daaw/oz;->I(Lcom/daaw/oz;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/daaw/hr;-><init>(Ljava/lang/String;Lcom/daaw/bn1;)V

    return-object v0
.end method

.method public final o(Landroid/net/Uri;ILjava/lang/String;)Lcom/daaw/bp0;
    .locals 2

    invoke-static {p1, p3}, Lcom/daaw/sq1;->F(Landroid/net/Uri;Ljava/lang/String;)I

    move-result p2

    const/4 p3, 0x0

    if-eqz p2, :cond_3

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_1

    const/4 p3, 0x3

    if-ne p2, p3, :cond_0

    new-instance p2, Lcom/daaw/c00$b;

    iget-object p3, p0, Lcom/daaw/oz$d;->r:Lcom/daaw/mp$a;

    invoke-direct {p2, p3}, Lcom/daaw/c00$b;-><init>(Lcom/daaw/mp$a;)V

    invoke-virtual {p2, p1}, Lcom/daaw/c00$b;->a(Landroid/net/Uri;)Lcom/daaw/c00;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported type: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Lcom/daaw/mb0$b;

    iget-object p3, p0, Lcom/daaw/oz$d;->r:Lcom/daaw/mp$a;

    invoke-direct {p2, p3}, Lcom/daaw/mb0$b;-><init>(Lcom/daaw/mp$a;)V

    new-instance p3, Lcom/daaw/p10;

    new-instance v0, Lcom/daaw/ob0;

    invoke-direct {v0}, Lcom/daaw/ob0;-><init>()V

    invoke-virtual {p0, p1}, Lcom/daaw/oz$d;->t(Landroid/net/Uri;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p3, v0, v1}, Lcom/daaw/p10;-><init>(Lcom/daaw/vv0$a;Ljava/util/List;)V

    invoke-virtual {p2, p3}, Lcom/daaw/mb0$b;->b(Lcom/daaw/vv0$a;)Lcom/daaw/mb0$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/mb0$b;->a(Landroid/net/Uri;)Lcom/daaw/mb0;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p2, Lcom/daaw/af1$b;

    new-instance v0, Lcom/daaw/yr$a;

    iget-object v1, p0, Lcom/daaw/oz$d;->r:Lcom/daaw/mp$a;

    invoke-direct {v0, v1}, Lcom/daaw/yr$a;-><init>(Lcom/daaw/mp$a;)V

    invoke-virtual {p0, p3}, Lcom/daaw/oz$d;->l(Z)Lcom/daaw/mp$a;

    move-result-object p3

    invoke-direct {p2, v0, p3}, Lcom/daaw/af1$b;-><init>(Lcom/daaw/we1$a;Lcom/daaw/mp$a;)V

    new-instance p3, Lcom/daaw/p10;

    new-instance v0, Lcom/daaw/ye1;

    invoke-direct {v0}, Lcom/daaw/ye1;-><init>()V

    invoke-virtual {p0, p1}, Lcom/daaw/oz$d;->t(Landroid/net/Uri;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p3, v0, v1}, Lcom/daaw/p10;-><init>(Lcom/daaw/vv0$a;Ljava/util/List;)V

    invoke-virtual {p2, p3}, Lcom/daaw/af1$b;->b(Lcom/daaw/vv0$a;)Lcom/daaw/af1$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/af1$b;->a(Landroid/net/Uri;)Lcom/daaw/af1;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p2, Lcom/daaw/ap$e;

    new-instance v0, Lcom/daaw/qq$a;

    iget-object v1, p0, Lcom/daaw/oz$d;->r:Lcom/daaw/mp$a;

    invoke-direct {v0, v1}, Lcom/daaw/qq$a;-><init>(Lcom/daaw/mp$a;)V

    invoke-virtual {p0, p3}, Lcom/daaw/oz$d;->l(Z)Lcom/daaw/mp$a;

    move-result-object p3

    invoke-direct {p2, v0, p3}, Lcom/daaw/ap$e;-><init>(Lcom/daaw/vo$a;Lcom/daaw/mp$a;)V

    new-instance p3, Lcom/daaw/p10;

    new-instance v0, Lcom/daaw/xo;

    invoke-direct {v0}, Lcom/daaw/xo;-><init>()V

    invoke-virtual {p0, p1}, Lcom/daaw/oz$d;->t(Landroid/net/Uri;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p3, v0, v1}, Lcom/daaw/p10;-><init>(Lcom/daaw/vv0$a;Ljava/util/List;)V

    invoke-virtual {p2, p3}, Lcom/daaw/ap$e;->b(Lcom/daaw/vv0$a;)Lcom/daaw/ap$e;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/ap$e;->a(Landroid/net/Uri;)Lcom/daaw/ap;

    move-result-object p1

    return-object p1
.end method

.method public p(Lcom/google/android/exoplayer2/metadata/Metadata;)V
    .locals 0

    return-void
.end method

.method public q()J
    .locals 7

    iget-object v0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/daaw/fd1;->getDuration()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-gez v0, :cond_0

    return-wide v1

    :cond_0
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-nez v0, :cond_1

    return-wide v1

    :cond_1
    return-wide v3

    :cond_2
    return-wide v1
.end method

.method public final r(Lcom/daaw/wd0;)Lcom/daaw/bp0;
    .locals 9

    const/4 v0, 0x1

    new-array v1, v0, [Landroid/net/Uri;

    invoke-interface {p1}, Lcom/daaw/wd0;->a()Landroid/net/Uri;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ""

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-array v4, v0, [I

    invoke-interface {p1}, Lcom/daaw/wd0;->b()I

    move-result p1

    aput p1, v4, v3

    new-array p1, v0, [Lcom/daaw/bp0;

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_0

    aget-object v6, v1, v5

    aget v7, v4, v5

    aget-object v8, v2, v5

    invoke-virtual {p0, v6, v7, v8}, Lcom/daaw/oz$d;->o(Landroid/net/Uri;ILjava/lang/String;)Lcom/daaw/bp0;

    move-result-object v6

    aput-object v6, p1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    aget-object p1, p1, v3

    return-object p1
.end method

.method public s(ZI)V
    .locals 4

    iget p1, p0, Lcom/daaw/oz$d;->u:I

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    iput p2, p0, Lcom/daaw/oz$d;->u:I

    iget-object v0, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->E(Lcom/daaw/oz;)Lcom/daaw/mz;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->E(Lcom/daaw/oz;)Lcom/daaw/mz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/b;->i()V

    :cond_1
    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    iget v1, p0, Lcom/daaw/oz$d;->z:F

    invoke-virtual {p0, v1}, Lcom/daaw/oz$d;->D(F)V

    iget-object v1, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {v1}, Lcom/daaw/oz;->z(Lcom/daaw/oz;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lcom/daaw/avee/comp/playback/e$b;->a(ZLjava/lang/String;)V

    :cond_2
    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-ne p1, v0, :cond_4

    :cond_3
    const/4 p1, 0x4

    if-ne p2, p1, :cond_4

    iget-object p1, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    invoke-virtual {p0, p1}, Lcom/daaw/oz$d;->u(Lcom/daaw/fd1;)V

    :cond_4
    return-void
.end method

.method public t(Landroid/net/Uri;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public u(Lcom/daaw/fd1;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->C(Lcom/daaw/oz;)Lcom/daaw/fd1;

    move-result-object v0

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {p1}, Lcom/daaw/oz;->z(Lcom/daaw/oz;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/e$b;->o()V

    :cond_1
    return-void
.end method

.method public v(Lcom/daaw/nl1;Ljava/lang/Object;I)V
    .locals 0

    return-void
.end method

.method public w()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/fd1;->h(Z)V

    :cond_0
    return-void
.end method

.method public x(Lcom/daaw/bp0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->B(Lcom/daaw/oz;)Lcom/daaw/ne0;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ne0;->b()V

    iget-object v0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    invoke-virtual {v0, p1}, Lcom/daaw/fd1;->G(Lcom/daaw/bp0;)V

    :cond_0
    return-void
.end method

.method public y(Lcom/daaw/wd0;FJ)V
    .locals 6

    new-instance v0, Lcom/google/android/exoplayer2/trackselection/a$a;

    iget-object v1, p0, Lcom/daaw/oz$d;->p:Lcom/daaw/lq;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/trackselection/a$a;-><init>(Lcom/daaw/ia;)V

    new-instance v1, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;

    invoke-direct {v1, v0}, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;-><init>(Lcom/google/android/exoplayer2/trackselection/c$a;)V

    iput-object v1, p0, Lcom/daaw/oz$d;->q:Lcom/google/android/exoplayer2/trackselection/b;

    iput-object p1, p0, Lcom/daaw/oz$d;->s:Lcom/daaw/wd0;

    invoke-virtual {p0, p1}, Lcom/daaw/oz$d;->r(Lcom/daaw/wd0;)Lcom/daaw/bp0;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/oz$d;->t:Lcom/daaw/bp0;

    iget-object p1, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    if-nez p1, :cond_1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    sput-boolean p1, Lcom/daaw/kq;->Z:Z

    :cond_0
    const/4 v5, 0x0

    new-instance p1, Lcom/daaw/or0;

    iget-object v0, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->z(Lcom/daaw/oz;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v1

    iget-object v0, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->B(Lcom/daaw/oz;)Lcom/daaw/ne0;

    move-result-object v2

    iget v3, p0, Lcom/daaw/oz$d;->A:I

    iget-object v4, p0, Lcom/daaw/oz$d;->B:Landroid/content/Context;

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/or0;-><init>(Lcom/daaw/avee/comp/playback/e$b;Lcom/daaw/ne0;ILandroid/content/Context;I)V

    iget-object v0, p0, Lcom/daaw/oz$d;->q:Lcom/google/android/exoplayer2/trackselection/b;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/daaw/sz;->a(Lcom/daaw/e41;Lcom/daaw/wm1;Lcom/daaw/yu;)Lcom/daaw/fd1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    invoke-virtual {p1, p0}, Lcom/daaw/fd1;->b(Lcom/daaw/bx0$a;)V

    iget-object p1, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    new-instance v0, Lcom/daaw/cy;

    iget-object v1, p0, Lcom/daaw/oz$d;->q:Lcom/google/android/exoplayer2/trackselection/b;

    invoke-direct {v0, v1}, Lcom/daaw/cy;-><init>(Lcom/google/android/exoplayer2/trackselection/b;)V

    invoke-virtual {p1, v0}, Lcom/daaw/fd1;->C(Lcom/daaw/x2;)V

    iget-object p1, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    invoke-virtual {p1, p3, p4}, Lcom/daaw/fd1;->f(J)V

    :cond_1
    invoke-virtual {p0, p2}, Lcom/daaw/oz$d;->D(F)V

    invoke-virtual {p0, p2}, Lcom/daaw/oz$d;->F(F)V

    iget-object p1, p0, Lcom/daaw/oz$d;->C:Lcom/daaw/oz;

    invoke-static {p1}, Lcom/daaw/oz;->z(Lcom/daaw/oz;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e$b;->n()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/oz;->m(Landroid/view/SurfaceHolder;)V

    iget-object p1, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    invoke-virtual {p1, p3, p4}, Lcom/daaw/fd1;->f(J)V

    iget-object p1, p0, Lcom/daaw/oz$d;->s:Lcom/daaw/wd0;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/oz$d;->t:Lcom/daaw/bp0;

    invoke-virtual {p0, p1}, Lcom/daaw/oz$d;->x(Lcom/daaw/bp0;)V

    :cond_2
    invoke-virtual {p0, p2}, Lcom/daaw/oz$d;->D(F)V

    return-void
.end method

.method public z()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/fd1;->k()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/oz$d;->t:Lcom/daaw/bp0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/oz$d;->y:Lcom/daaw/fd1;

    invoke-virtual {v1, v0}, Lcom/daaw/fd1;->G(Lcom/daaw/bp0;)V

    :cond_0
    return-void
.end method
