.class public Lcom/google/android/gms/ads/MobileAdsInitProvider;
.super Landroid/content/ContentProvider;
.source ""


# instance fields
.field public final p:Lcom/google/android/gms/ads/internal/client/zzek;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzek;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzek;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/MobileAdsInitProvider;->p:Lcom/google/android/gms/ads/internal/client/zzek;

    return-void
.end method


# virtual methods
.method public attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/MobileAdsInitProvider;->p:Lcom/google/android/gms/ads/internal/client/zzek;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/zzek;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    return-void
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
