.class public final Lcom/daaw/as8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tv8;


# instance fields
.field public final a:Lcom/daaw/tv8;

.field public final b:Lcom/daaw/r84;


# direct methods
.method public constructor <init>(Lcom/daaw/tv8;Lcom/daaw/r84;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/as8;->a:Lcom/daaw/tv8;

    iput-object p2, p0, Lcom/daaw/as8;->b:Lcom/daaw/r84;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget-object p1, p0, Lcom/daaw/as8;->a:Lcom/daaw/tv8;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/daaw/xv8;->a(I)I

    move-result p1

    return p1
.end method

.method public final b(I)Lcom/daaw/f92;
    .locals 1

    iget-object v0, p0, Lcom/daaw/as8;->a:Lcom/daaw/tv8;

    invoke-interface {v0, p1}, Lcom/daaw/xv8;->b(I)Lcom/daaw/f92;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/as8;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/daaw/as8;

    iget-object v1, p0, Lcom/daaw/as8;->a:Lcom/daaw/tv8;

    iget-object v3, p1, Lcom/daaw/as8;->a:Lcom/daaw/tv8;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/as8;->b:Lcom/daaw/r84;

    iget-object p1, p1, Lcom/daaw/as8;->b:Lcom/daaw/r84;

    invoke-virtual {v1, p1}, Lcom/daaw/r84;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/as8;->b:Lcom/daaw/r84;

    invoke-virtual {v0}, Lcom/daaw/r84;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/as8;->a:Lcom/daaw/tv8;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final zzb(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/as8;->a:Lcom/daaw/tv8;

    invoke-interface {v0, p1}, Lcom/daaw/xv8;->zzb(I)I

    move-result p1

    return p1
.end method

.method public final zzc()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/as8;->a:Lcom/daaw/tv8;

    invoke-interface {v0}, Lcom/daaw/xv8;->zzc()I

    move-result v0

    return v0
.end method

.method public final zze()Lcom/daaw/r84;
    .locals 1

    iget-object v0, p0, Lcom/daaw/as8;->b:Lcom/daaw/r84;

    return-object v0
.end method
