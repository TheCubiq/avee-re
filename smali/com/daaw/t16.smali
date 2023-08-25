.class public final Lcom/daaw/t16;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lcom/daaw/qz3;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/qz3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/t16;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/daaw/t16;->b:Lcom/daaw/qz3;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 3

    sget-object v0, Lcom/daaw/g93;->o2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/t16;->b:Lcom/daaw/qz3;

    invoke-virtual {v0}, Lcom/daaw/qz3;->j()Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/r16;->a:Lcom/daaw/r16;

    iget-object v2, p0, Lcom/daaw/t16;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
