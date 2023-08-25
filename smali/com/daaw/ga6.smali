.class public final Lcom/daaw/ga6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/ez3;


# direct methods
.method public constructor <init>(Lcom/daaw/ez3;Lcom/daaw/g77;Ljava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ga6;->c:Lcom/daaw/ez3;

    iput-object p2, p0, Lcom/daaw/ga6;->a:Lcom/daaw/g77;

    iput-object p3, p0, Lcom/daaw/ga6;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0x2f

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 4

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v1

    sget-object v2, Lcom/daaw/g93;->l5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v1

    :cond_0
    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/daaw/f77;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    invoke-static {v2}, Lcom/daaw/s67;->d([Lcom/daaw/f77;)Lcom/daaw/r67;

    move-result-object v2

    new-instance v3, Lcom/daaw/fa6;

    invoke-direct {v3, v1, v0}, Lcom/daaw/fa6;-><init>(Lcom/daaw/f77;Lcom/daaw/f77;)V

    sget-object v0, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-virtual {v2, v3, v0}, Lcom/daaw/r67;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
