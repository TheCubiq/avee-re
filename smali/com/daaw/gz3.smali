.class public final Lcom/daaw/gz3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:Lcom/daaw/e14;


# direct methods
.method public constructor <init>(Lcom/daaw/hz3;Landroid/content/Context;Lcom/daaw/e14;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/gz3;->p:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/gz3;->q:Lcom/daaw/e14;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/gz3;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/gz3;->q:Lcom/daaw/e14;

    invoke-virtual {v1, v0}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/daaw/a80; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    iget-object v1, p0, Lcom/daaw/gz3;->q:Lcom/daaw/e14;

    invoke-virtual {v1, v0}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    const-string v1, "Exception while getting advertising Id info"

    invoke-static {v1, v0}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
