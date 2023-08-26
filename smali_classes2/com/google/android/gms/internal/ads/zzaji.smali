.class public final Lcom/google/android/gms/internal/ads/zzaji;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field public final errorCode:I

.field public final zzacv:Lcom/google/android/gms/internal/ads/zzjn;

.field public final zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

.field public final zzcob:Lorg/json/JSONObject;

.field public final zzcod:Lcom/google/android/gms/internal/ads/zzwy;

.field public final zzcoh:J

.field public final zzcoi:J

.field public final zzcoq:Lcom/google/android/gms/internal/ads/zzhs;

.field public final zzcor:Z

.field public final zzcos:Lcom/google/android/gms/internal/ads/zzaej;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaef;Lcom/google/android/gms/internal/ads/zzaej;Lcom/google/android/gms/internal/ads/zzwy;Lcom/google/android/gms/internal/ads/zzjn;IJJLorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzhs;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcod:Lcom/google/android/gms/internal/ads/zzwy;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzaji;->errorCode:I

    iput-wide p6, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcoh:J

    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcoi:J

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcob:Lorg/json/JSONObject;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcoq:Lcom/google/android/gms/internal/ads/zzhs;

    if-eqz p12, :cond_0

    invoke-virtual {p12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :goto_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcor:Z

    return-void

    :cond_0
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzamm;->zzo(Lcom/google/android/gms/internal/ads/zzjj;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaef;Lcom/google/android/gms/internal/ads/zzaej;Lcom/google/android/gms/internal/ads/zzwy;Lcom/google/android/gms/internal/ads/zzjn;IJJLorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzhx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcod:Lcom/google/android/gms/internal/ads/zzwy;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzaji;->errorCode:I

    iput-wide p6, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcoh:J

    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcoi:J

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcob:Lorg/json/JSONObject;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzhs;

    invoke-direct {p1, p11}, Lcom/google/android/gms/internal/ads/zzhs;-><init>(Lcom/google/android/gms/internal/ads/zzhx;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcoq:Lcom/google/android/gms/internal/ads/zzhs;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaji;->zzcor:Z

    return-void
.end method
