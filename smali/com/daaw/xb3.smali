.class public final synthetic Lcom/daaw/xb3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m04;


# static fields
.field public static final synthetic a:Lcom/daaw/xb3;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/xb3;

    invoke-direct {v0}, Lcom/daaw/xb3;-><init>()V

    sput-object v0, Lcom/daaw/xb3;->a:Lcom/daaw/xb3;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/zb3;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lcom/daaw/zb3;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/zb3;

    invoke-direct {v0, p1}, Lcom/daaw/zb3;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
