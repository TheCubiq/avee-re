.class final Lcom/google/android/gms/internal/ads/zzaaa;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic zzbvx:Lcom/google/android/gms/internal/ads/zzzy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzzy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaaa;->zzbvx:Lcom/google/android/gms/internal/ads/zzzy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaaa;->zzbvx:Lcom/google/android/gms/internal/ads/zzzy;

    const-string p2, "Operation denied by user."

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzaal;->zzbw(Ljava/lang/String;)V

    return-void
.end method
