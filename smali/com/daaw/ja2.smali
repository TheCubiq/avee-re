.class public final Lcom/daaw/ja2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/s92;

.field public b:J

.field public c:J

.field public d:I

.field public e:I

.field public f:[J

.field public g:[I

.field public h:[I

.field public i:[J

.field public j:[Z

.field public k:Z

.field public l:[Z

.field public m:Lcom/daaw/ia2;

.field public final n:Lcom/daaw/ik5;

.field public o:Z

.field public p:J

.field public q:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [J

    iput-object v1, p0, Lcom/daaw/ja2;->f:[J

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/daaw/ja2;->g:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/daaw/ja2;->h:[I

    new-array v1, v0, [J

    iput-object v1, p0, Lcom/daaw/ja2;->i:[J

    new-array v1, v0, [Z

    iput-object v1, p0, Lcom/daaw/ja2;->j:[Z

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/daaw/ja2;->l:[Z

    new-instance v0, Lcom/daaw/ik5;

    invoke-direct {v0}, Lcom/daaw/ik5;-><init>()V

    iput-object v0, p0, Lcom/daaw/ja2;->n:Lcom/daaw/ik5;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ja2;->n:Lcom/daaw/ik5;

    invoke-virtual {v0, p1}, Lcom/daaw/ik5;->c(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/ja2;->k:Z

    iput-boolean p1, p0, Lcom/daaw/ja2;->o:Z

    return-void
.end method

.method public final b(I)Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ja2;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ja2;->l:[Z

    aget-boolean p1, v0, p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
