.class public Lcom/daaw/dv1$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dv1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:I

.field public f:F

.field public g:I

.field public h:F

.field public i:I


# direct methods
.method public constructor <init>(IIIIFIFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/dv1$e;->a:I

    iput p2, p0, Lcom/daaw/dv1$e;->c:I

    iput p3, p0, Lcom/daaw/dv1$e;->d:I

    iput p4, p0, Lcom/daaw/dv1$e;->e:I

    iput p5, p0, Lcom/daaw/dv1$e;->f:F

    iput p6, p0, Lcom/daaw/dv1$e;->g:I

    iput p7, p0, Lcom/daaw/dv1$e;->h:F

    iput p8, p0, Lcom/daaw/dv1$e;->i:I

    invoke-virtual {p0}, Lcom/daaw/dv1$e;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dv1$e;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(IIIIFZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/dv1$e;->a:I

    iput p2, p0, Lcom/daaw/dv1$e;->c:I

    iput p3, p0, Lcom/daaw/dv1$e;->d:I

    iput p4, p0, Lcom/daaw/dv1$e;->e:I

    iput p5, p0, Lcom/daaw/dv1$e;->f:F

    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/dv1$e;->g:I

    if-eqz p6, :cond_0

    const/high16 p1, 0x43c00000    # 384.0f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x43800000    # 256.0f

    :goto_0
    iput p1, p0, Lcom/daaw/dv1$e;->h:F

    iput p7, p0, Lcom/daaw/dv1$e;->i:I

    invoke-virtual {p0}, Lcom/daaw/dv1$e;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dv1$e;->b:Ljava/lang/String;

    return-void
.end method

.method public static d([Lcom/daaw/dv1$e;)Lcom/daaw/dv1$e;
    .locals 11

    if-eqz p0, :cond_2

    array-length v0, p0

    if-gtz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    aget-object v1, p0, v0

    invoke-virtual {v1}, Lcom/daaw/dv1$e;->a()Lcom/daaw/dv1$e;

    move-result-object v1

    array-length v2, p0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, p0, v0

    iget v4, v1, Lcom/daaw/dv1$e;->c:I

    iget v5, v3, Lcom/daaw/dv1$e;->c:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v1, Lcom/daaw/dv1$e;->c:I

    iget v4, v1, Lcom/daaw/dv1$e;->d:I

    iget v5, v3, Lcom/daaw/dv1$e;->d:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v1, Lcom/daaw/dv1$e;->d:I

    iget v4, v1, Lcom/daaw/dv1$e;->e:I

    iget v5, v3, Lcom/daaw/dv1$e;->e:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v1, Lcom/daaw/dv1$e;->e:I

    iget v4, v1, Lcom/daaw/dv1$e;->f:F

    iget v5, v3, Lcom/daaw/dv1$e;->f:F

    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    iput v4, v1, Lcom/daaw/dv1$e;->f:F

    iget v4, v1, Lcom/daaw/dv1$e;->g:I

    iget v5, v3, Lcom/daaw/dv1$e;->g:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v1, Lcom/daaw/dv1$e;->g:I

    iget v4, v1, Lcom/daaw/dv1$e;->h:F

    iget v5, v3, Lcom/daaw/dv1$e;->h:F

    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    iput v4, v1, Lcom/daaw/dv1$e;->h:F

    iget v4, v1, Lcom/daaw/dv1$e;->i:I

    iget v3, v3, Lcom/daaw/dv1$e;->i:I

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v1, Lcom/daaw/dv1$e;->i:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/daaw/dv1$e;->e()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lcom/daaw/dv1$e;->b:Ljava/lang/String;

    return-object v1

    :cond_2
    :goto_1
    new-instance p0, Lcom/daaw/dv1$e;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v10}, Lcom/daaw/dv1$e;-><init>(IIIIFIFI)V

    return-object p0
.end method


# virtual methods
.method public a()Lcom/daaw/dv1$e;
    .locals 10

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v9, Lcom/daaw/dv1$e;

    iget v1, p0, Lcom/daaw/dv1$e;->a:I

    iget v2, p0, Lcom/daaw/dv1$e;->c:I

    iget v3, p0, Lcom/daaw/dv1$e;->d:I

    iget v4, p0, Lcom/daaw/dv1$e;->e:I

    iget v5, p0, Lcom/daaw/dv1$e;->f:F

    iget v6, p0, Lcom/daaw/dv1$e;->g:I

    iget v7, p0, Lcom/daaw/dv1$e;->h:F

    iget v8, p0, Lcom/daaw/dv1$e;->i:I

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/daaw/dv1$e;-><init>(IIIIFIFI)V

    return-object v9
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    const-string v0, ";"

    invoke-static {v0, p1}, Lcom/daaw/er1;->a(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/dv1$e;->a:I

    invoke-static {v0, v1}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->a:I

    const/4 v0, 0x1

    aget-object v0, p1, v0

    iget-object v1, p0, Lcom/daaw/dv1$e;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/br1;->A(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/dv1$e;->b:Ljava/lang/String;

    const/4 v0, 0x2

    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/dv1$e;->c:I

    invoke-static {v0, v1}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->c:I

    const/4 v0, 0x3

    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/dv1$e;->d:I

    invoke-static {v0, v1}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->d:I

    const/4 v0, 0x4

    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/dv1$e;->e:I

    invoke-static {v0, v1}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->e:I

    const/4 v0, 0x5

    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/dv1$e;->f:F

    invoke-static {v0, v1}, Lcom/daaw/br1;->v(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->f:F

    const/4 v0, 0x6

    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/dv1$e;->g:I

    invoke-static {v0, v1}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->g:I

    const/4 v0, 0x7

    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/dv1$e;->h:F

    invoke-static {v0, v1}, Lcom/daaw/br1;->v(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->h:F

    const/16 v0, 0x8

    aget-object p1, p1, v0

    iget v0, p0, Lcom/daaw/dv1$e;->i:I

    invoke-static {p1, v0}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/daaw/dv1$e;->i:I

    return-void
.end method

.method public c(Lcom/daaw/dv1$e;)V
    .locals 4

    iget v0, p1, Lcom/daaw/dv1$e;->c:I

    iget v1, p1, Lcom/daaw/dv1$e;->d:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    sget-object v1, Lcom/daaw/oy0;->c:Lcom/daaw/ww1;

    const v2, 0x7f090106

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    iget v2, p0, Lcom/daaw/dv1$e;->c:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Lcom/daaw/dv1$e;->c:I

    :cond_0
    const v2, 0x7f090104

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    iget v2, p0, Lcom/daaw/dv1$e;->d:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->d:I

    :cond_1
    const v0, 0x7f090103

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Lcom/daaw/dv1$e;->e:I

    iget v2, p1, Lcom/daaw/dv1$e;->e:I

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->e:I

    :cond_2
    const v0, 0x7f090100

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Lcom/daaw/dv1$e;->f:F

    iget v2, p1, Lcom/daaw/dv1$e;->f:F

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->f:F

    :cond_3
    iget v0, p0, Lcom/daaw/dv1$e;->g:I

    iget v2, p1, Lcom/daaw/dv1$e;->g:I

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->g:I

    const v0, 0x7f0900fd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    iget v0, p0, Lcom/daaw/dv1$e;->h:F

    iget v1, p1, Lcom/daaw/dv1$e;->h:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$e;->h:F

    :cond_4
    iget v0, p0, Lcom/daaw/dv1$e;->i:I

    iget p1, p1, Lcom/daaw/dv1$e;->i:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/dv1$e;->i:I

    invoke-virtual {p0}, Lcom/daaw/dv1$e;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dv1$e;->b:Ljava/lang/String;

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/dv1$e;->a()Lcom/daaw/dv1$e;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lcom/daaw/dv1$e;->a:I

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const-string v5, ""

    if-ne v0, v4, :cond_0

    const-string v0, " "

    goto :goto_0

    :cond_0
    if-ne v0, v3, :cond_1

    const-string v0, "  "

    goto :goto_0

    :cond_1
    if-ne v0, v2, :cond_2

    const-string v0, "   "

    goto :goto_0

    :cond_2
    if-ne v0, v1, :cond_3

    const-string v0, "    "

    goto :goto_0

    :cond_3
    move-object v0, v5

    :goto_0
    iget v6, p0, Lcom/daaw/dv1$e;->i:I

    if-nez v6, :cond_4

    const-string v6, "L"

    goto :goto_1

    :cond_4
    const-string v6, "H"

    :goto_1
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v8, 0x7

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    iget v0, p0, Lcom/daaw/dv1$e;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v8, v4

    iget v0, p0, Lcom/daaw/dv1$e;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v8, v3

    iget v0, p0, Lcom/daaw/dv1$e;->f:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v8, v2

    aput-object v5, v8, v1

    const/4 v0, 0x5

    iget v1, p0, Lcom/daaw/dv1$e;->h:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v8, v0

    const/4 v0, 0x6

    aput-object v6, v8, v0

    const-string v0, "%s%dp @%d %.1fMbps%s %.1fKbps %s"

    invoke-static {v7, v0, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/daaw/dv1$e;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/dv1$e;->b:Ljava/lang/String;

    const/16 v3, 0x3b

    const/16 v4, 0x5f

    invoke-static {v3, v4, v2}, Lcom/daaw/er1;->c(CCLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/dv1$e;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/dv1$e;->d:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/dv1$e;->e:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/dv1$e;->f:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/dv1$e;->g:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/dv1$e;->h:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/dv1$e;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
