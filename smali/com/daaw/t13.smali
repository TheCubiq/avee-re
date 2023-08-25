.class public final Lcom/daaw/t13;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:I


# direct methods
.method public constructor <init>(FFFFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/t13;->a:F

    iput p2, p0, Lcom/daaw/t13;->b:F

    add-float/2addr p1, p3

    iput p1, p0, Lcom/daaw/t13;->c:F

    add-float/2addr p2, p4

    iput p2, p0, Lcom/daaw/t13;->d:F

    iput p5, p0, Lcom/daaw/t13;->e:I

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lcom/daaw/t13;->d:F

    return v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lcom/daaw/t13;->a:F

    return v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lcom/daaw/t13;->c:F

    return v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Lcom/daaw/t13;->b:F

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcom/daaw/t13;->e:I

    return v0
.end method
