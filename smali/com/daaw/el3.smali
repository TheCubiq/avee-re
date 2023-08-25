.class public final Lcom/daaw/el3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i14;


# instance fields
.field public final synthetic a:Lcom/daaw/al3;


# direct methods
.method public constructor <init>(Lcom/daaw/il3;Lcom/daaw/al3;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/el3;->a:Lcom/daaw/al3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/daaw/bk3;

    const-string v0, "Getting a new session for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/el3;->a:Lcom/daaw/al3;

    invoke-interface {p1}, Lcom/daaw/bk3;->zzj()Lcom/daaw/ll3;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/l14;->d(Ljava/lang/Object;)V

    return-void
.end method
