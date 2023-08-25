.class public final Lcom/daaw/mm3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final a:Lcom/daaw/pl3;

.field public final b:Lcom/daaw/ql3;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/daaw/f77;


# direct methods
.method public constructor <init>(Lcom/daaw/f77;Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mm3;->d:Lcom/daaw/f77;

    const-string p1, "google.afma.activeView.handleUpdate"

    iput-object p1, p0, Lcom/daaw/mm3;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/mm3;->b:Lcom/daaw/ql3;

    iput-object p4, p0, Lcom/daaw/mm3;->a:Lcom/daaw/pl3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/mm3;->d:Lcom/daaw/f77;

    new-instance v1, Lcom/daaw/km3;

    invoke-direct {v1, p0, p1}, Lcom/daaw/km3;-><init>(Lcom/daaw/mm3;Ljava/lang/Object;)V

    sget-object p1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Ljava/lang/Object;Lcom/daaw/kl3;)Lcom/daaw/f77;
    .locals 4

    new-instance v0, Lcom/daaw/e14;

    invoke-direct {v0}, Lcom/daaw/e14;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/daaw/yg3;->o:Lcom/daaw/nh3;

    new-instance v3, Lcom/daaw/lm3;

    invoke-direct {v3, p0, v0}, Lcom/daaw/lm3;-><init>(Lcom/daaw/mm3;Lcom/daaw/e14;)V

    invoke-virtual {v2, v1, v3}, Lcom/daaw/nh3;->c(Ljava/lang/String;Lcom/daaw/mh3;)V

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "id"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    check-cast p1, Lorg/json/JSONObject;

    const-string v1, "args"

    invoke-virtual {v2, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lcom/daaw/mm3;->c:Ljava/lang/String;

    invoke-interface {p2, p1, v2}, Lcom/daaw/kk3;->C0(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/mm3;->a(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
