.class public final Lcom/daaw/kc5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kc5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/kc5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/kc5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/kc5;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/daaw/kc5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/kc5;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/h94;

    invoke-virtual {v1}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v2}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/kc5;->d:Lcom/daaw/m08;

    check-cast v3, Lcom/daaw/a08;

    invoke-virtual {v3}, Lcom/daaw/a08;->c()Ljava/util/Map;

    move-result-object v3

    sget-object v4, Lcom/daaw/g93;->s4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v4, Lcom/daaw/x33;

    new-instance v5, Lcom/daaw/g43;

    invoke-direct {v5, v1}, Lcom/daaw/g43;-><init>(Landroid/content/Context;)V

    invoke-direct {v4, v5}, Lcom/daaw/x33;-><init>(Lcom/daaw/g43;)V

    new-instance v1, Lcom/daaw/lc5;

    invoke-direct {v1, v0}, Lcom/daaw/lc5;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Lcom/daaw/x33;->b(Lcom/daaw/w33;)V

    new-instance v0, Lcom/daaw/nc5;

    invoke-direct {v0, v4, v3}, Lcom/daaw/nc5;-><init>(Lcom/daaw/x33;Ljava/util/Map;)V

    new-instance v1, Lcom/daaw/ly4;

    invoke-direct {v1, v0, v2}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
