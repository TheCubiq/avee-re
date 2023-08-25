.class public final Lcom/daaw/r87;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/t87;


# instance fields
.field public final synthetic a:Lcom/daaw/ee7;


# direct methods
.method public constructor <init>(Lcom/daaw/ee7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/r87;->a:Lcom/daaw/ee7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/daaw/n87;
    .locals 2

    :try_start_0
    new-instance v0, Lcom/daaw/p87;

    iget-object v1, p0, Lcom/daaw/r87;->a:Lcom/daaw/ee7;

    invoke-direct {v0, v1, p1}, Lcom/daaw/p87;-><init>(Lcom/daaw/ee7;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Primitive type not supported"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final zzb()Lcom/daaw/n87;
    .locals 3

    new-instance v0, Lcom/daaw/p87;

    iget-object v1, p0, Lcom/daaw/r87;->a:Lcom/daaw/ee7;

    invoke-virtual {v1}, Lcom/daaw/ee7;->g()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/p87;-><init>(Lcom/daaw/ee7;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final zzc()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/daaw/r87;->a:Lcom/daaw/ee7;

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

    iget-object v0, p0, Lcom/daaw/r87;->a:Lcom/daaw/ee7;

    invoke-virtual {v0}, Lcom/daaw/ee7;->j()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
