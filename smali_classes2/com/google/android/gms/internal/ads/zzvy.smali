.class final Lcom/google/android/gms/internal/ads/zzvy;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaom;


# instance fields
.field private final synthetic zzbqv:Lcom/google/android/gms/internal/ads/zzvs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzvw;Lcom/google/android/gms/internal/ads/zzvs;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzvy;->zzbqv:Lcom/google/android/gms/internal/ads/zzvs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    const-string v0, "Rejecting reference for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvy;->zzbqv:Lcom/google/android/gms/internal/ads/zzvs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaop;->reject()V

    return-void
.end method
