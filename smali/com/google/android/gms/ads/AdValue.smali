.class public final Lcom/google/android/gms/ads/AdValue;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/AdValue$PrecisionType;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:J


# direct methods
.method public constructor <init>(ILjava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/ads/AdValue;->a:I

    iput-object p2, p0, Lcom/google/android/gms/ads/AdValue;->b:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/ads/AdValue;->c:J

    return-void
.end method

.method public static zza(ILjava/lang/String;J)Lcom/google/android/gms/ads/AdValue;
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/AdValue;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/ads/AdValue;-><init>(ILjava/lang/String;J)V

    return-object v0
.end method


# virtual methods
.method public getCurrencyCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/AdValue;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getPrecisionType()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/AdValue;->a:I

    return v0
.end method

.method public getValueMicros()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/ads/AdValue;->c:J

    return-wide v0
.end method
