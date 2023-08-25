.class public final Lcom/daaw/fl3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g14;


# instance fields
.field public final synthetic a:Lcom/daaw/al3;


# direct methods
.method public constructor <init>(Lcom/daaw/il3;Lcom/daaw/al3;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/fl3;->a:Lcom/daaw/al3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 1

    const-string v0, "Rejecting reference for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/fl3;->a:Lcom/daaw/al3;

    invoke-virtual {v0}, Lcom/daaw/l14;->c()V

    return-void
.end method
