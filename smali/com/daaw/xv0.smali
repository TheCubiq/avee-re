.class public Lcom/daaw/xv0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:Z

.field public final f:[F

.field public g:F

.field public h:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/daaw/xv0;->f:[F

    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lcom/daaw/xv0;->g:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/xv0;->h:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/xv0;->e:Z

    return-void
.end method

.method public static a(Lcom/daaw/xv0;Lcom/daaw/xv0;Lcom/daaw/xv0;F)V
    .locals 5

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/xv0;->a:F

    iget v0, p1, Lcom/daaw/xv0;->b:F

    iget v1, p2, Lcom/daaw/xv0;->b:F

    float-to-double v2, p3

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/tg0;->a(FFD)F

    move-result v0

    iput v0, p0, Lcom/daaw/xv0;->b:F

    iget v0, p1, Lcom/daaw/xv0;->c:F

    iget v1, p2, Lcom/daaw/xv0;->c:F

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/tg0;->a(FFD)F

    move-result v0

    iput v0, p0, Lcom/daaw/xv0;->c:F

    iget v0, p1, Lcom/daaw/xv0;->d:F

    iget v1, p2, Lcom/daaw/xv0;->d:F

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/tg0;->a(FFD)F

    move-result v0

    iput v0, p0, Lcom/daaw/xv0;->d:F

    iget-object v0, p0, Lcom/daaw/xv0;->f:[F

    iget-object v1, p1, Lcom/daaw/xv0;->f:[F

    iget-object v4, p2, Lcom/daaw/xv0;->f:[F

    invoke-static {v0, v1, v4, p3}, Lcom/daaw/f80;->b([F[F[FF)V

    iget v0, p1, Lcom/daaw/xv0;->g:F

    iget v1, p2, Lcom/daaw/xv0;->g:F

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/tg0;->a(FFD)F

    move-result v0

    iput v0, p0, Lcom/daaw/xv0;->g:F

    iget v0, p1, Lcom/daaw/xv0;->h:F

    iget v1, p2, Lcom/daaw/xv0;->h:F

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/tg0;->a(FFD)F

    move-result v0

    iput v0, p0, Lcom/daaw/xv0;->h:F

    const/high16 v0, 0x3f000000    # 0.5f

    cmpg-float p3, p3, v0

    if-gez p3, :cond_0

    iget-boolean p1, p1, Lcom/daaw/xv0;->e:Z

    goto :goto_0

    :cond_0
    iget-boolean p1, p2, Lcom/daaw/xv0;->e:Z

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/xv0;->e:Z

    return-void
.end method


# virtual methods
.method public b()[F
    .locals 1

    iget-object v0, p0, Lcom/daaw/xv0;->f:[F

    return-object v0
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/xv0;->f:[F

    invoke-static {v0, p1}, Lcom/daaw/f80;->n([FI)V

    return-void
.end method

.method public d([F)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/xv0;->f:[F

    const/4 v1, 0x0

    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x1

    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x2

    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x3

    aget p1, p1, v1

    aput p1, v0, v1

    return-void
.end method
