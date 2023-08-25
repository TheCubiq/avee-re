.class public final Lcom/daaw/h55;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Lcom/daaw/ny8;

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h55;->a:Ljava/lang/Object;

    new-instance p1, Lcom/daaw/ny8;

    invoke-direct {p1}, Lcom/daaw/ny8;-><init>()V

    iput-object p1, p0, Lcom/daaw/h55;->b:Lcom/daaw/ny8;

    return-void
.end method


# virtual methods
.method public final a(ILcom/daaw/c35;)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/h55;->d:Z

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/h55;->b:Lcom/daaw/ny8;

    invoke-virtual {v0, p1}, Lcom/daaw/ny8;->a(I)Lcom/daaw/ny8;

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/h55;->c:Z

    iget-object p1, p0, Lcom/daaw/h55;->a:Ljava/lang/Object;

    invoke-interface {p2, p1}, Lcom/daaw/c35;->zza(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final b(Lcom/daaw/e45;)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/h55;->d:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/h55;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/h55;->b:Lcom/daaw/ny8;

    invoke-virtual {v0}, Lcom/daaw/ny8;->b()Lcom/daaw/r32;

    move-result-object v0

    new-instance v1, Lcom/daaw/ny8;

    invoke-direct {v1}, Lcom/daaw/ny8;-><init>()V

    iput-object v1, p0, Lcom/daaw/h55;->b:Lcom/daaw/ny8;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/h55;->c:Z

    iget-object v1, p0, Lcom/daaw/h55;->a:Ljava/lang/Object;

    invoke-interface {p1, v1, v0}, Lcom/daaw/e45;->a(Ljava/lang/Object;Lcom/daaw/r32;)V

    :cond_0
    return-void
.end method

.method public final c(Lcom/daaw/e45;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/h55;->d:Z

    iget-boolean v0, p0, Lcom/daaw/h55;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/h55;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/h55;->b:Lcom/daaw/ny8;

    invoke-virtual {v1}, Lcom/daaw/ny8;->b()Lcom/daaw/r32;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/daaw/e45;->a(Ljava/lang/Object;Lcom/daaw/r32;)V

    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lcom/daaw/h55;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/h55;->a:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/h55;

    iget-object p1, p1, Lcom/daaw/h55;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/h55;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
