.class public final Lcom/daaw/yk3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i14;


# instance fields
.field public final synthetic a:Lcom/daaw/al3;


# direct methods
.method public constructor <init>(Lcom/daaw/al3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yk3;->a:Lcom/daaw/al3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/kl3;

    const-string p1, "Releasing engine reference."

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/yk3;->a:Lcom/daaw/al3;

    invoke-static {p1}, Lcom/daaw/al3;->f(Lcom/daaw/al3;)Lcom/daaw/il3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/il3;->i()V

    return-void
.end method
