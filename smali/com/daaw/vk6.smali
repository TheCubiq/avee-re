.class public final Lcom/daaw/vk6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/vk6;->a:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/jk6;Landroid/content/Context;Lcom/daaw/bk6;Lcom/daaw/bl6;)Lcom/daaw/uk6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vk6;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/uk6;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/gk6;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzfkz;->h(Lcom/daaw/jk6;Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzfkz;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/daaw/gk6;-><init>(Lcom/google/android/gms/internal/ads/zzfkz;)V

    new-instance p2, Lcom/daaw/dl6;

    invoke-direct {p2, v0, p3, p4}, Lcom/daaw/dl6;-><init>(Lcom/daaw/fk6;Lcom/daaw/bk6;Lcom/daaw/bl6;)V

    new-instance p3, Lcom/daaw/uk6;

    invoke-direct {p3, v0, p2}, Lcom/daaw/uk6;-><init>(Lcom/daaw/fk6;Lcom/daaw/dl6;)V

    iget-object p2, p0, Lcom/daaw/vk6;->a:Ljava/util/HashMap;

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3

    :cond_0
    return-object v0
.end method
