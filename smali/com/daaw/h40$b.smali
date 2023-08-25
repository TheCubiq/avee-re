.class public Lcom/daaw/h40$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/je0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/h40;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/h40;

.field public final b:I

.field public final c:I

.field public final d:F

.field public e:I

.field public f:[I

.field public g:[F

.field public h:F

.field public i:F

.field public j:I

.field public k:F

.field public l:I

.field public m:I

.field public n:I


# direct methods
.method public constructor <init>(Lcom/daaw/h40;III)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/h40$b;->e:I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/daaw/h40$b;->f:[I

    new-array v1, v0, [F

    iput-object v1, p0, Lcom/daaw/h40$b;->g:[F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/daaw/h40$b;->h:F

    iput-object p1, p0, Lcom/daaw/h40$b;->a:Lcom/daaw/h40;

    invoke-static {p1}, Lcom/daaw/h40;->a(Lcom/daaw/h40;)[Lcom/daaw/h40$a;

    move-result-object p1

    array-length p1, p1

    const/4 v2, 0x1

    sub-int/2addr p1, v2

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/h40$b;->b:I

    iput p3, p0, Lcom/daaw/h40$b;->c:I

    iput p4, p0, Lcom/daaw/h40$b;->e:I

    int-to-float p1, p3

    add-float/2addr p1, v1

    iput p1, p0, Lcom/daaw/h40$b;->d:F

    if-ge p4, v2, :cond_0

    new-array p1, v2, [I

    aput v0, p1, v0

    iput-object p1, p0, Lcom/daaw/h40$b;->f:[I

    new-array p1, v2, [F

    aput v1, p1, v0

    iput-object p1, p0, Lcom/daaw/h40$b;->g:[F

    iput v1, p0, Lcom/daaw/h40$b;->h:F

    return-void

    :cond_0
    add-int/lit8 p1, p4, 0x1

    add-int/2addr p1, p4

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/daaw/h40$b;->f:[I

    array-length p2, p1

    new-array p2, p2, [F

    iput-object p2, p0, Lcom/daaw/h40$b;->g:[F

    array-length p1, p1

    int-to-float p1, p1

    const p2, 0x3d4ccccd    # 0.05f

    mul-float p1, p1, p2

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/h40$b;->h:F

    :goto_0
    iget-object p1, p0, Lcom/daaw/h40$b;->f:[I

    array-length p3, p1

    if-ge v0, p3, :cond_1

    sub-int p3, v0, p4

    aput p3, p1, v0

    iget-object v1, p0, Lcom/daaw/h40$b;->g:[F

    array-length v2, p1

    add-int/lit8 v2, v2, 0x2

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, p3

    array-length p1, p1

    add-int/lit8 p1, p1, 0x2

    invoke-static {v2, p1}, Lcom/daaw/bv;->b(II)F

    move-result p1

    sub-float/2addr p1, p2

    const/4 p3, 0x0

    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    aput p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/h40;III)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/h40$b;->a:Lcom/daaw/h40;

    if-ne p1, v0, :cond_0

    iget p1, p0, Lcom/daaw/h40$b;->b:I

    if-ne p2, p1, :cond_0

    iget p1, p0, Lcom/daaw/h40$b;->c:I

    if-ne p3, p1, :cond_0

    iget p1, p0, Lcom/daaw/h40$b;->e:I

    if-ne p4, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public get(I)F
    .locals 4

    iget-object v0, p0, Lcom/daaw/h40$b;->a:Lcom/daaw/h40;

    invoke-static {v0}, Lcom/daaw/h40;->a(Lcom/daaw/h40;)[Lcom/daaw/h40$a;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/h40$a;->a:[F

    array-length v0, v0

    iput v0, p0, Lcom/daaw/h40$b;->n:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/h40$b;->i:F

    iput v1, p0, Lcom/daaw/h40$b;->l:I

    :goto_0
    iget v0, p0, Lcom/daaw/h40$b;->l:I

    iget-object v1, p0, Lcom/daaw/h40$b;->f:[I

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget v0, v1, v0

    add-int/2addr v0, p1

    iget-object v1, p0, Lcom/daaw/h40$b;->a:Lcom/daaw/h40;

    iget v2, v1, Lcom/daaw/h40;->b:I

    add-int/2addr v0, v2

    iget v2, p0, Lcom/daaw/h40$b;->n:I

    rem-int/2addr v0, v2

    iput v0, p0, Lcom/daaw/h40$b;->j:I

    invoke-static {v1}, Lcom/daaw/h40;->a(Lcom/daaw/h40;)[Lcom/daaw/h40$a;

    move-result-object v0

    iget v1, p0, Lcom/daaw/h40$b;->b:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/h40$a;->a:[F

    iget v2, p0, Lcom/daaw/h40$b;->j:I

    aget v0, v0, v2

    iput v0, p0, Lcom/daaw/h40$b;->k:F

    iput v1, p0, Lcom/daaw/h40$b;->m:I

    :goto_1
    iget v0, p0, Lcom/daaw/h40$b;->m:I

    iget v1, p0, Lcom/daaw/h40$b;->b:I

    iget v2, p0, Lcom/daaw/h40$b;->c:I

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/h40$b;->k:F

    iget-object v1, p0, Lcom/daaw/h40$b;->a:Lcom/daaw/h40;

    invoke-static {v1}, Lcom/daaw/h40;->a(Lcom/daaw/h40;)[Lcom/daaw/h40$a;

    move-result-object v1

    iget v2, p0, Lcom/daaw/h40$b;->m:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/daaw/h40$a;->a:[F

    iget v3, p0, Lcom/daaw/h40$b;->j:I

    aget v1, v1, v3

    add-float/2addr v0, v1

    iput v0, p0, Lcom/daaw/h40$b;->k:F

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/daaw/h40$b;->m:I

    goto :goto_1

    :cond_0
    iget v0, p0, Lcom/daaw/h40$b;->k:F

    iget v1, p0, Lcom/daaw/h40$b;->d:F

    div-float/2addr v0, v1

    iput v0, p0, Lcom/daaw/h40$b;->k:F

    iget v1, p0, Lcom/daaw/h40$b;->i:F

    iget-object v2, p0, Lcom/daaw/h40$b;->g:[F

    iget v3, p0, Lcom/daaw/h40$b;->l:I

    aget v2, v2, v3

    mul-float v0, v0, v2

    add-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/h40$b;->i:F

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/daaw/h40$b;->l:I

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/daaw/h40$b;->i:F

    iget v0, p0, Lcom/daaw/h40$b;->h:F

    div-float/2addr p1, v0

    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/h40$b;->a:Lcom/daaw/h40;

    iget v0, v0, Lcom/daaw/h40;->a:I

    return v0
.end method
