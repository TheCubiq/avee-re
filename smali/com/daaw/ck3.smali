.class public final synthetic Lcom/daaw/ck3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/s84;


# instance fields
.field public final synthetic a:Lcom/daaw/pk3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/pk3;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ck3;->a:Lcom/daaw/pk3;

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/ck3;->a:Lcom/daaw/pk3;

    iget-object v1, v0, Lcom/daaw/pk3;->a:Lcom/daaw/jl3;

    iget-object v2, v0, Lcom/daaw/pk3;->b:Lcom/daaw/il3;

    iget-object v0, v0, Lcom/daaw/pk3;->c:Lcom/daaw/bk3;

    sget-object v3, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    new-instance v4, Lcom/daaw/ok3;

    invoke-direct {v4, v1, v2, v0}, Lcom/daaw/ok3;-><init>(Lcom/daaw/jl3;Lcom/daaw/il3;Lcom/daaw/bk3;)V

    const-wide/16 v0, 0x2710

    invoke-virtual {v3, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
