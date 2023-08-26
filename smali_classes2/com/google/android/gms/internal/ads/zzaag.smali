.class final Lcom/google/android/gms/internal/ads/zzaag;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic zzbwq:Lcom/google/android/gms/internal/ads/zzaae;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaae;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaag;->zzbwq:Lcom/google/android/gms/internal/ads/zzaae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaag;->zzbwq:Lcom/google/android/gms/internal/ads/zzaae;

    const-string p2, "User canceled the download."

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzaal;->zzbw(Ljava/lang/String;)V

    return-void
.end method
