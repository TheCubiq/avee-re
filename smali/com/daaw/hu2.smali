.class public final Lcom/daaw/hu2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/vt2;

.field public b:J

.field public c:J

.field public d:I

.field public e:I

.field public f:[J

.field public g:[I

.field public h:[I

.field public i:[I

.field public j:[J

.field public k:[Z

.field public l:Z

.field public m:[Z

.field public n:Lcom/daaw/gu2;

.field public o:I

.field public p:Lcom/daaw/iz2;

.field public q:Z

.field public r:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hu2;->p:Lcom/daaw/iz2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/iz2;->d()I

    move-result v0

    if-ge v0, p1, :cond_1

    :cond_0
    new-instance v0, Lcom/daaw/iz2;

    invoke-direct {v0, p1}, Lcom/daaw/iz2;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/hu2;->p:Lcom/daaw/iz2;

    :cond_1
    iput p1, p0, Lcom/daaw/hu2;->o:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/hu2;->l:Z

    iput-boolean p1, p0, Lcom/daaw/hu2;->q:Z

    return-void
.end method
