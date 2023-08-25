.class public final Lcom/daaw/qm1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/qr;

.field public b:J

.field public c:J

.field public d:J

.field public e:I

.field public f:I

.field public g:[J

.field public h:[I

.field public i:[I

.field public j:[I

.field public k:[J

.field public l:[Z

.field public m:Z

.field public n:[Z

.field public o:Lcom/daaw/pm1;

.field public p:I

.field public q:Lcom/daaw/rv0;

.field public r:Z

.field public s:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/a00;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/qm1;->q:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    iget v1, p0, Lcom/daaw/qm1;->p:I

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lcom/daaw/a00;->f([BII)V

    iget-object p1, p0, Lcom/daaw/qm1;->q:Lcom/daaw/rv0;

    invoke-virtual {p1, v2}, Lcom/daaw/rv0;->J(I)V

    iput-boolean v2, p0, Lcom/daaw/qm1;->r:Z

    return-void
.end method

.method public b(Lcom/daaw/rv0;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/qm1;->q:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    iget v1, p0, Lcom/daaw/qm1;->p:I

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Lcom/daaw/rv0;->g([BII)V

    iget-object p1, p0, Lcom/daaw/qm1;->q:Lcom/daaw/rv0;

    invoke-virtual {p1, v2}, Lcom/daaw/rv0;->J(I)V

    iput-boolean v2, p0, Lcom/daaw/qm1;->r:Z

    return-void
.end method

.method public c(I)J
    .locals 5

    iget-object v0, p0, Lcom/daaw/qm1;->k:[J

    aget-wide v1, v0, p1

    iget-object v0, p0, Lcom/daaw/qm1;->j:[I

    aget p1, v0, p1

    int-to-long v3, p1

    add-long/2addr v1, v3

    return-wide v1
.end method

.method public d(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qm1;->q:Lcom/daaw/rv0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/rv0;->d()I

    move-result v0

    if-ge v0, p1, :cond_1

    :cond_0
    new-instance v0, Lcom/daaw/rv0;

    invoke-direct {v0, p1}, Lcom/daaw/rv0;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/qm1;->q:Lcom/daaw/rv0;

    :cond_1
    iput p1, p0, Lcom/daaw/qm1;->p:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/qm1;->m:Z

    iput-boolean p1, p0, Lcom/daaw/qm1;->r:Z

    return-void
.end method

.method public e(II)V
    .locals 1

    iput p1, p0, Lcom/daaw/qm1;->e:I

    iput p2, p0, Lcom/daaw/qm1;->f:I

    iget-object v0, p0, Lcom/daaw/qm1;->h:[I

    if-eqz v0, :cond_0

    array-length v0, v0

    if-ge v0, p1, :cond_1

    :cond_0
    new-array v0, p1, [J

    iput-object v0, p0, Lcom/daaw/qm1;->g:[J

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/daaw/qm1;->h:[I

    :cond_1
    iget-object p1, p0, Lcom/daaw/qm1;->i:[I

    if-eqz p1, :cond_2

    array-length p1, p1

    if-ge p1, p2, :cond_3

    :cond_2
    mul-int/lit8 p2, p2, 0x7d

    div-int/lit8 p2, p2, 0x64

    new-array p1, p2, [I

    iput-object p1, p0, Lcom/daaw/qm1;->i:[I

    new-array p1, p2, [I

    iput-object p1, p0, Lcom/daaw/qm1;->j:[I

    new-array p1, p2, [J

    iput-object p1, p0, Lcom/daaw/qm1;->k:[J

    new-array p1, p2, [Z

    iput-object p1, p0, Lcom/daaw/qm1;->l:[Z

    new-array p1, p2, [Z

    iput-object p1, p0, Lcom/daaw/qm1;->n:[Z

    :cond_3
    return-void
.end method

.method public f()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/qm1;->e:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/daaw/qm1;->s:J

    iput-boolean v0, p0, Lcom/daaw/qm1;->m:Z

    iput-boolean v0, p0, Lcom/daaw/qm1;->r:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/qm1;->o:Lcom/daaw/pm1;

    return-void
.end method
