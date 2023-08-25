.class public final synthetic Lcom/daaw/k66;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# static fields
.field public static final synthetic a:Lcom/daaw/k66;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/k66;

    invoke-direct {v0}, Lcom/daaw/k66;-><init>()V

    sput-object v0, Lcom/daaw/k66;->a:Lcom/daaw/k66;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;

    new-instance v0, Lcom/daaw/n66;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;->zza:Ljava/lang/String;

    invoke-direct {v0, p1}, Lcom/daaw/n66;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-direct {v0, p1}, Lcom/daaw/n66;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method
