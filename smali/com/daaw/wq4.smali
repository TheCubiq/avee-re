.class public final synthetic Lcom/daaw/wq4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jw4;


# instance fields
.field public final synthetic a:Lcom/daaw/b15;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/b15;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wq4;->a:Lcom/daaw/b15;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/wq4;->a:Lcom/daaw/b15;

    check-cast p1, Lcom/daaw/er4;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/daaw/er4;->A(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method
