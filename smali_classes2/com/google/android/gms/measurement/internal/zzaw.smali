.class public final Lcom/google/android/gms/measurement/internal/zzaw;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/zzaw;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final p:Ljava/lang/String;

.field public final q:Lcom/google/android/gms/measurement/internal/zzau;

.field public final r:Ljava/lang/String;

.field public final s:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/nu2;

    invoke-direct {v0}, Lcom/daaw/nu2;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/zzaw;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzaw;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/zzaw;->q:Lcom/google/android/gms/measurement/internal/zzau;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzaw;->q:Lcom/google/android/gms/measurement/internal/zzau;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/zzaw;->r:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzaw;->r:Ljava/lang/String;

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/zzaw;->s:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzau;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzaw;->q:Lcom/google/android/gms/measurement/internal/zzau;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzaw;->r:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/zzaw;->s:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzaw;->r:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzaw;->p:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzaw;->q:Lcom/google/android/gms/measurement/internal/zzau;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "origin="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",name="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",params="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/nu2;->a(Lcom/google/android/gms/measurement/internal/zzaw;Landroid/os/Parcel;I)V

    return-void
.end method
