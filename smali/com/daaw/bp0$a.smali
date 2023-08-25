.class public final Lcom/daaw/bp0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/bp0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:J


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const-wide/16 v0, -0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/daaw/bp0$a;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IIIJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/bp0$a;->a:I

    iput p2, p0, Lcom/daaw/bp0$a;->b:I

    iput p3, p0, Lcom/daaw/bp0$a;->c:I

    iput-wide p4, p0, Lcom/daaw/bp0$a;->d:J

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 6

    const/4 v2, -0x1

    const/4 v3, -0x1

    move-object v0, p0

    move v1, p1

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bp0$a;-><init>(IIIJ)V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/daaw/bp0$a;
    .locals 7

    iget v0, p0, Lcom/daaw/bp0$a;->a:I

    if-ne v0, p1, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/bp0$a;

    iget v3, p0, Lcom/daaw/bp0$a;->b:I

    iget v4, p0, Lcom/daaw/bp0$a;->c:I

    iget-wide v5, p0, Lcom/daaw/bp0$a;->d:J

    move-object v1, v0

    move v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/daaw/bp0$a;-><init>(IIIJ)V

    :goto_0
    return-object v0
.end method

.method public b()Z
    .locals 2

    iget v0, p0, Lcom/daaw/bp0$a;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lcom/daaw/bp0$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/daaw/bp0$a;

    iget v2, p0, Lcom/daaw/bp0$a;->a:I

    iget v3, p1, Lcom/daaw/bp0$a;->a:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/daaw/bp0$a;->b:I

    iget v3, p1, Lcom/daaw/bp0$a;->b:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/daaw/bp0$a;->c:I

    iget v3, p1, Lcom/daaw/bp0$a;->c:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lcom/daaw/bp0$a;->d:J

    iget-wide v4, p1, Lcom/daaw/bp0$a;->d:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/daaw/bp0$a;->a:I

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/daaw/bp0$a;->b:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/daaw/bp0$a;->c:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lcom/daaw/bp0$a;->d:J

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method
