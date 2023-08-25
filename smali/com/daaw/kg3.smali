.class public final Lcom/daaw/kg3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    check-cast p1, Lcom/daaw/a74;

    :try_start_0
    invoke-interface {p1}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/kv6;->k(Landroid/content/Context;)Lcom/daaw/kv6;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/kv6;->l()V

    invoke-interface {p1}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lv6;->j(Landroid/content/Context;)Lcom/daaw/lv6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/lv6;->k()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object p2

    const-string v0, "DefaultGmsgHandlers.ResetPaid"

    invoke-virtual {p2, p1, v0}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
