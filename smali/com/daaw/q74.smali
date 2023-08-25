.class public final synthetic Lcom/daaw/q74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/yd0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/yd0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q74;->p:Lcom/daaw/yd0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/q74;->p:Lcom/daaw/yd0;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/daaw/nq5;

    sget-object v1, Lcom/daaw/g93;->y4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/daaw/rp6;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/tp6;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/tp6;

    invoke-virtual {v0}, Lcom/daaw/tp6;->c()V

    :cond_1
    :goto_0
    return-void
.end method
