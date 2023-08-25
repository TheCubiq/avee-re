.class public final Lcom/daaw/jt3;
.super Lcom/daaw/kt3;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/kt3;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb()V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    new-instance v1, Lcom/daaw/it3;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/daaw/it3;-><init>(Lcom/daaw/ht3;)V

    const-string v2, "FlagsAccessedBeforeInitialized"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
