.class final synthetic Lcom/google/android/gms/internal/ads/zzana;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzand;


# instance fields
.field private final zzbjl:Ljava/util/Map;

.field private final zzcvc:I


# direct methods
.method constructor <init>(ILjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzana;->zzcvc:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzana;->zzbjl:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final zza(Landroid/util/JsonWriter;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzana;->zzcvc:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzana;->zzbjl:Ljava/util/Map;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzamy;->zza(ILjava/util/Map;Landroid/util/JsonWriter;)V

    return-void
.end method
