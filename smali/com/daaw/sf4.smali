.class public final Lcom/daaw/sf4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/kf4;


# instance fields
.field public final a:Lcom/daaw/dh5;


# direct methods
.method public constructor <init>(Lcom/daaw/dh5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sf4;->a:Lcom/daaw/dh5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)V
    .locals 2

    sget-object v0, Lcom/daaw/g93;->n8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "policy_violations"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/sf4;->a:Lcom/daaw/dh5;

    invoke-virtual {v0, p1}, Lcom/daaw/dh5;->l(Ljava/lang/String;)V

    return-void
.end method
