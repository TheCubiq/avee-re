.class public Lcom/daaw/avee/comp/playback/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/playback/a$h;,
        Lcom/daaw/avee/comp/playback/a$g;
    }
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public c:[S

.field public d:S

.field public e:S

.field public f:I

.field public g:F

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:I

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:J

.field public r:Z

.field public s:J

.field public t:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/a;->k:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/a;->t:Z

    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/a;->a:Z

    const/4 v2, 0x2

    new-array v3, v2, [S

    iput-object v3, p0, Lcom/daaw/avee/comp/playback/a;->c:[S

    const/4 v3, 0x0

    iput v3, p0, Lcom/daaw/avee/comp/playback/a;->g:F

    const v3, 0xac44

    invoke-virtual {p0, v3, v1, v2, v0}, Lcom/daaw/avee/comp/playback/a;->d(IIII)V

    return-void
.end method

.method public static h(III[S)Lcom/daaw/ke0;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/playback/a;->i(II[S)Lcom/daaw/ke0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/playback/a;->m(II[S)Lcom/daaw/ke0;

    move-result-object p0

    return-object p0
.end method

.method public static i(II[S)Lcom/daaw/ke0;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    array-length p1, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    new-instance p1, Lcom/daaw/avee/comp/playback/a$a;

    invoke-direct {p1, p0, p2}, Lcom/daaw/avee/comp/playback/a$a;-><init>(I[S)V

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/playback/a$b;

    invoke-direct {v0, p0, p2, p1}, Lcom/daaw/avee/comp/playback/a$b;-><init>(I[SI)V

    return-object v0
.end method

.method public static j(II[S)Lcom/daaw/ke0;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    array-length p1, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    new-instance p1, Lcom/daaw/avee/comp/playback/a$e;

    invoke-direct {p1, p0, p2}, Lcom/daaw/avee/comp/playback/a$e;-><init>(I[S)V

    return-object p1

    :cond_0
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    new-instance v0, Lcom/daaw/avee/comp/playback/a$f;

    invoke-direct {v0, p0, p2, p1}, Lcom/daaw/avee/comp/playback/a$f;-><init>(I[SI)V

    return-object v0
.end method

.method public static m(II[S)Lcom/daaw/ke0;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    new-instance p1, Lcom/daaw/avee/comp/playback/a$c;

    invoke-direct {p1, p0, p2}, Lcom/daaw/avee/comp/playback/a$c;-><init>(I[S)V

    return-object p1

    :cond_0
    new-instance p1, Lcom/daaw/avee/comp/playback/a$d;

    invoke-direct {p1, p0, p2}, Lcom/daaw/avee/comp/playback/a$d;-><init>(I[S)V

    return-object p1
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/a;->t:Z

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/daaw/avee/comp/playback/a;->h:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/daaw/avee/comp/playback/a;->j:I

    return v0
.end method

.method public d(IIII)V
    .locals 6

    const/4 v5, 0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/playback/a;->e(IIIIZ)V

    return-void
.end method

.method public e(IIIIZ)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lez p2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lcom/daaw/q6;->i(Z)V

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    iput-boolean p5, p0, Lcom/daaw/avee/comp/playback/a;->t:Z

    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/a;->r:Z

    iput p1, p0, Lcom/daaw/avee/comp/playback/a;->f:I

    iput p2, p0, Lcom/daaw/avee/comp/playback/a;->b:I

    iput p3, p0, Lcom/daaw/avee/comp/playback/a;->i:I

    iput p4, p0, Lcom/daaw/avee/comp/playback/a;->j:I

    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/playback/a;->h:I

    mul-int p1, p1, p2

    iget-object p2, p0, Lcom/daaw/avee/comp/playback/a;->c:[S

    array-length p2, p2

    if-eq p2, p1, :cond_1

    new-array p1, p1, [S

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/a;->c:[S

    :cond_1
    const/16 p1, 0x7fff

    iput-short p1, p0, Lcom/daaw/avee/comp/playback/a;->d:S

    iput-short v1, p0, Lcom/daaw/avee/comp/playback/a;->e:S

    return-void
.end method

.method public f(J)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/a;->r:Z

    iput-wide p1, p0, Lcom/daaw/avee/comp/playback/a;->s:J

    return-void
.end method

.method public g(II)Lcom/daaw/ke0;
    .locals 2

    iget v0, p0, Lcom/daaw/avee/comp/playback/a;->b:I

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/a;->c:[S

    invoke-static {p1, p2, v0, v1}, Lcom/daaw/avee/comp/playback/a;->h(III[S)Lcom/daaw/ke0;

    move-result-object p1

    return-object p1
.end method

.method public k()Lcom/daaw/ke0;
    .locals 3

    iget v0, p0, Lcom/daaw/avee/comp/playback/a;->i:I

    iget v1, p0, Lcom/daaw/avee/comp/playback/a;->b:I

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/a;->c:[S

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/comp/playback/a;->i(II[S)Lcom/daaw/ke0;

    move-result-object v0

    return-object v0
.end method

.method public l()Lcom/daaw/ke0;
    .locals 3

    iget v0, p0, Lcom/daaw/avee/comp/playback/a;->i:I

    iget v1, p0, Lcom/daaw/avee/comp/playback/a;->b:I

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/a;->c:[S

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/comp/playback/a;->j(II[S)Lcom/daaw/ke0;

    move-result-object v0

    return-object v0
.end method
