.class public final Lcom/daaw/q87;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/t87;


# instance fields
.field public final synthetic a:Lcom/daaw/n87;


# direct methods
.method public constructor <init>(Lcom/daaw/n87;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/q87;->a:Lcom/daaw/n87;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/daaw/n87;
    .locals 1

    iget-object v0, p0, Lcom/daaw/q87;->a:Lcom/daaw/n87;

    invoke-interface {v0}, Lcom/daaw/n87;->zzc()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/q87;->a:Lcom/daaw/n87;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/InternalError;

    const-string v0, "This should never be called, as we always first check supportedPrimitives."

    invoke-direct {p1, v0}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzb()Lcom/daaw/n87;
    .locals 1

    iget-object v0, p0, Lcom/daaw/q87;->a:Lcom/daaw/n87;

    return-object v0
.end method

.method public final zzc()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/daaw/q87;->a:Lcom/daaw/n87;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()Ljava/lang/Class;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zze()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/q87;->a:Lcom/daaw/n87;

    invoke-interface {v0}, Lcom/daaw/n87;->zzc()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
