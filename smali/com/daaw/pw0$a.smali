.class public Lcom/daaw/pw0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/pw0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:D

.field public b:[D

.field public c:I

.field public d:I

.field public e:D

.field public f:D

.field public g:D

.field public h:D

.field public i:D

.field public j:D

.field public k:[D

.field public l:[D

.field public final synthetic m:Lcom/daaw/pw0;


# direct methods
.method public constructor <init>(Lcom/daaw/pw0;DI)V
    .locals 8

    iput-object p1, p0, Lcom/daaw/pw0$a;->m:Lcom/daaw/pw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    iput-wide v0, p0, Lcom/daaw/pw0$a;->a:D

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/daaw/pw0$a;->h:D

    iput p4, p0, Lcom/daaw/pw0$a;->d:I

    int-to-double v2, p4

    iput-wide v2, p0, Lcom/daaw/pw0$a;->e:D

    int-to-double v2, p4

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p2, p2, v2

    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-int p2, p1

    iput p2, p0, Lcom/daaw/pw0$a;->c:I

    new-array p1, p2, [D

    iput-object p1, p0, Lcom/daaw/pw0$a;->b:[D

    new-array p1, p2, [D

    iput-object p1, p0, Lcom/daaw/pw0$a;->k:[D

    new-array p1, p2, [D

    iput-object p1, p0, Lcom/daaw/pw0$a;->l:[D

    const/4 p1, 0x0

    :goto_0
    iget p2, p0, Lcom/daaw/pw0$a;->c:I

    if-ge p1, p2, :cond_0

    int-to-double p3, p1

    int-to-double v2, p2

    iget-wide v4, p0, Lcom/daaw/pw0$a;->e:D

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v4

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p3, v2

    mul-double p3, p3, v0

    invoke-static {p3, p4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    invoke-static {p3, p4}, Ljava/lang/Math;->sin(D)D

    move-result-wide p2

    mul-double v4, v2, v2

    mul-double v6, p2, p2

    add-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    div-double/2addr p2, v4

    iget-object p4, p0, Lcom/daaw/pw0$a;->k:[D

    aput-wide v2, p4, p1

    iget-object p4, p0, Lcom/daaw/pw0$a;->l:[D

    aput-wide p2, p4, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/pw0$a;->b()V

    return-void
.end method


# virtual methods
.method public a(ID)V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/pw0$a;->f:D

    iget-object v2, p0, Lcom/daaw/pw0$a;->k:[D

    aget-wide v3, v2, p1

    mul-double v3, v3, p2

    add-double/2addr v0, v3

    iput-wide v0, p0, Lcom/daaw/pw0$a;->f:D

    iget-wide v0, p0, Lcom/daaw/pw0$a;->g:D

    iget-object v2, p0, Lcom/daaw/pw0$a;->l:[D

    aget-wide v3, v2, p1

    mul-double v3, v3, p2

    add-double/2addr v0, v3

    iput-wide v0, p0, Lcom/daaw/pw0$a;->g:D

    return-void
.end method

.method public b()V
    .locals 8

    iget v0, p0, Lcom/daaw/pw0$a;->c:I

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    if-nez v0, :cond_0

    iput-wide v1, p0, Lcom/daaw/pw0$a;->j:D

    iput-wide v1, p0, Lcom/daaw/pw0$a;->i:D

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/pw0$a;->d()V

    const/4 v0, 0x0

    :goto_0
    iget v3, p0, Lcom/daaw/pw0$a;->c:I

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Lcom/daaw/pw0$a;->k:[D

    aget-wide v4, v3, v0

    const-wide v6, 0x3f847ae140000000L    # 0.009999999776482582

    mul-double v4, v4, v6

    invoke-virtual {p0, v0, v4, v5}, Lcom/daaw/pw0$a;->a(ID)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iput-wide v1, p0, Lcom/daaw/pw0$a;->i:D

    invoke-virtual {p0, v1, v2, v3}, Lcom/daaw/pw0$a;->c(DI)D

    iget-wide v0, p0, Lcom/daaw/pw0$a;->h:D

    iput-wide v0, p0, Lcom/daaw/pw0$a;->j:D

    iput-wide v0, p0, Lcom/daaw/pw0$a;->i:D

    return-void
.end method

.method public c(DI)D
    .locals 4

    iget-wide p1, p0, Lcom/daaw/pw0$a;->f:D

    int-to-double v0, p3

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p1, v0

    iput-wide p1, p0, Lcom/daaw/pw0$a;->f:D

    iget-wide v2, p0, Lcom/daaw/pw0$a;->g:D

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v0

    iput-wide v2, p0, Lcom/daaw/pw0$a;->g:D

    mul-double p1, p1, p1

    mul-double v2, v2, v2

    add-double/2addr p1, v2

    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    const-wide/high16 v0, 0x4089000000000000L    # 800.0

    mul-double p1, p1, v0

    iput-wide p1, p0, Lcom/daaw/pw0$a;->h:D

    return-wide p1
.end method

.method public d()V
    .locals 3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/pw0$a;->f:D

    iput-wide v0, p0, Lcom/daaw/pw0$a;->g:D

    iget-object v2, p0, Lcom/daaw/pw0$a;->b:[D

    invoke-static {v2, v0, v1}, Ljava/util/Arrays;->fill([DD)V

    return-void
.end method
