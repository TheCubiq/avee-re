.class final Lcom/google/android/gms/internal/ads/zzalm;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic zzcst:Lcom/google/android/gms/internal/ads/zzall;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzall;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzalm;->zzcst:Lcom/google/android/gms/internal/ads/zzall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/zzakk;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzalm;->zzcst:Lcom/google/android/gms/internal/ads/zzall;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzall;->val$context:Landroid/content/Context;

    const-string p2, "https://support.google.com/dfp_premium/answer/7160685#push"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzakk;->zza(Landroid/content/Context;Landroid/net/Uri;)V

    return-void
.end method
