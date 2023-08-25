.class public Lcom/daaw/ez0;
.super Lcom/daaw/i6;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ez0$b;
    }
.end annotation


# instance fields
.field public g:I

.field public h:[Lcom/daaw/de1;

.field public i:[Lcom/daaw/de1;

.field public j:I

.field public k:Lcom/daaw/ez0$b;

.field public l:Lcom/daaw/gd;


# direct methods
.method public constructor <init>(Lcom/daaw/gd;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/daaw/i6;-><init>(Lcom/daaw/gd;)V

    const/16 v0, 0x80

    iput v0, p0, Lcom/daaw/ez0;->g:I

    new-array v1, v0, [Lcom/daaw/de1;

    iput-object v1, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    new-array v0, v0, [Lcom/daaw/de1;

    iput-object v0, p0, Lcom/daaw/ez0;->i:[Lcom/daaw/de1;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/ez0;->j:I

    new-instance v0, Lcom/daaw/ez0$b;

    invoke-direct {v0, p0, p0}, Lcom/daaw/ez0$b;-><init>(Lcom/daaw/ez0;Lcom/daaw/ez0;)V

    iput-object v0, p0, Lcom/daaw/ez0;->k:Lcom/daaw/ez0$b;

    iput-object p1, p0, Lcom/daaw/ez0;->l:Lcom/daaw/gd;

    return-void
.end method

.method public static synthetic E(Lcom/daaw/ez0;Lcom/daaw/de1;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/ez0;->G(Lcom/daaw/de1;)V

    return-void
.end method


# virtual methods
.method public C(Lcom/daaw/i6;Z)V
    .locals 6

    iget-object p2, p1, Lcom/daaw/i6;->a:Lcom/daaw/de1;

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lcom/daaw/i6;->e:Lcom/daaw/i6$a;

    invoke-interface {v0}, Lcom/daaw/i6$a;->b()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2}, Lcom/daaw/i6$a;->d(I)Lcom/daaw/de1;

    move-result-object v3

    invoke-interface {v0, v2}, Lcom/daaw/i6$a;->g(I)F

    move-result v4

    iget-object v5, p0, Lcom/daaw/ez0;->k:Lcom/daaw/ez0$b;

    invoke-virtual {v5, v3}, Lcom/daaw/ez0$b;->b(Lcom/daaw/de1;)V

    iget-object v5, p0, Lcom/daaw/ez0;->k:Lcom/daaw/ez0$b;

    invoke-virtual {v5, p2, v4}, Lcom/daaw/ez0$b;->a(Lcom/daaw/de1;F)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p0, v3}, Lcom/daaw/ez0;->F(Lcom/daaw/de1;)V

    :cond_1
    iget v3, p0, Lcom/daaw/i6;->b:F

    iget v5, p1, Lcom/daaw/i6;->b:F

    mul-float v5, v5, v4

    add-float/2addr v3, v5

    iput v3, p0, Lcom/daaw/i6;->b:F

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p2}, Lcom/daaw/ez0;->G(Lcom/daaw/de1;)V

    return-void
.end method

.method public final F(Lcom/daaw/de1;)V
    .locals 5

    iget v0, p0, Lcom/daaw/ez0;->j:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    array-length v3, v2

    if-le v0, v3, :cond_0

    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/de1;

    iput-object v0, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    array-length v2, v0

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/de1;

    iput-object v0, p0, Lcom/daaw/ez0;->i:[Lcom/daaw/de1;

    :cond_0
    iget-object v0, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    iget v2, p0, Lcom/daaw/ez0;->j:I

    aput-object p1, v0, v2

    add-int/2addr v2, v1

    iput v2, p0, Lcom/daaw/ez0;->j:I

    if-le v2, v1, :cond_2

    sub-int/2addr v2, v1

    aget-object v0, v0, v2

    iget v0, v0, Lcom/daaw/de1;->c:I

    iget v2, p1, Lcom/daaw/de1;->c:I

    if-le v0, v2, :cond_2

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, Lcom/daaw/ez0;->j:I

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lcom/daaw/ez0;->i:[Lcom/daaw/de1;

    iget-object v4, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    aget-object v4, v4, v2

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/daaw/ez0;->i:[Lcom/daaw/de1;

    new-instance v4, Lcom/daaw/ez0$a;

    invoke-direct {v4, p0}, Lcom/daaw/ez0$a;-><init>(Lcom/daaw/ez0;)V

    invoke-static {v2, v0, v3, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    :goto_1
    iget v2, p0, Lcom/daaw/ez0;->j:I

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    iget-object v3, p0, Lcom/daaw/ez0;->i:[Lcom/daaw/de1;

    aget-object v3, v3, v0

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iput-boolean v1, p1, Lcom/daaw/de1;->a:Z

    invoke-virtual {p1, p0}, Lcom/daaw/de1;->a(Lcom/daaw/i6;)V

    return-void
.end method

.method public final G(Lcom/daaw/de1;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/daaw/ez0;->j:I

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    aget-object v2, v2, v1

    if-ne v2, p1, :cond_1

    :goto_1
    iget v2, p0, Lcom/daaw/ez0;->j:I

    add-int/lit8 v3, v2, -0x1

    if-ge v1, v3, :cond_0

    iget-object v2, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    add-int/lit8 v3, v1, 0x1

    aget-object v4, v2, v3

    aput-object v4, v2, v1

    move v1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lcom/daaw/ez0;->j:I

    iput-boolean v0, p1, Lcom/daaw/de1;->a:Z

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(Lcom/daaw/de1;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ez0;->k:Lcom/daaw/ez0$b;

    invoke-virtual {v0, p1}, Lcom/daaw/ez0$b;->b(Lcom/daaw/de1;)V

    iget-object v0, p0, Lcom/daaw/ez0;->k:Lcom/daaw/ez0$b;

    invoke-virtual {v0}, Lcom/daaw/ez0$b;->e()V

    iget-object v0, p1, Lcom/daaw/de1;->i:[F

    iget v1, p1, Lcom/daaw/de1;->e:I

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    invoke-virtual {p0, p1}, Lcom/daaw/ez0;->F(Lcom/daaw/de1;)V

    return-void
.end method

.method public c(Lcom/daaw/ak0;[Z)Lcom/daaw/de1;
    .locals 4

    const/4 p1, -0x1

    const/4 v0, 0x0

    const/4 v1, -0x1

    :goto_0
    iget v2, p0, Lcom/daaw/ez0;->j:I

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    aget-object v2, v2, v0

    iget v3, v2, Lcom/daaw/de1;->c:I

    aget-boolean v3, p2, v3

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    iget-object v3, p0, Lcom/daaw/ez0;->k:Lcom/daaw/ez0$b;

    invoke-virtual {v3, v2}, Lcom/daaw/ez0$b;->b(Lcom/daaw/de1;)V

    iget-object v2, p0, Lcom/daaw/ez0;->k:Lcom/daaw/ez0$b;

    if-ne v1, p1, :cond_1

    invoke-virtual {v2}, Lcom/daaw/ez0$b;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    aget-object v3, v3, v1

    invoke-virtual {v2, v3}, Lcom/daaw/ez0$b;->d(Lcom/daaw/de1;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    move v1, v0

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    if-ne v1, p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    iget-object p1, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    aget-object p1, p1, v1

    return-object p1
.end method

.method public clear()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/ez0;->j:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/i6;->b:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " goal -> ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/i6;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ") : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/daaw/ez0;->j:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/ez0;->h:[Lcom/daaw/de1;

    aget-object v2, v2, v1

    iget-object v3, p0, Lcom/daaw/ez0;->k:Lcom/daaw/ez0$b;

    invoke-virtual {v3, v2}, Lcom/daaw/ez0$b;->b(Lcom/daaw/de1;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/daaw/ez0;->k:Lcom/daaw/ez0$b;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
