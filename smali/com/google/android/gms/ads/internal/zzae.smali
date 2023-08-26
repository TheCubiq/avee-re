.class final synthetic Lcom/google/android/gms/ads/internal/zzae;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzanj;


# static fields
.field static final zzxn:Lcom/google/android/gms/internal/ads/zzanj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/zzae;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/zzae;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/zzae;->zzxn:Lcom/google/android/gms/internal/ads/zzanj;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 2

    check-cast p1, Lorg/json/JSONObject;

    const-string v0, "isSuccessful"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "appSettingsJson"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzajm;->zzqh()Lcom/google/android/gms/internal/ads/zzakd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzakd;->zzcs(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzano;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzany;

    move-result-object p1

    return-object p1
.end method
