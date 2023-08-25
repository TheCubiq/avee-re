.class public final synthetic Lcom/daaw/uf3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# static fields
.field public static final synthetic a:Lcom/daaw/uf3;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/uf3;

    invoke-direct {v0}, Lcom/daaw/uf3;-><init>()V

    sput-object v0, Lcom/daaw/uf3;->a:Lcom/daaw/uf3;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Throwable;

    sget-object v0, Lcom/daaw/yg3;->a:Lcom/daaw/zg3;

    sget-object v0, Lcom/daaw/za3;->k:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    const-string v1, "prepareClickUrl.attestation1"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_0
    const-string p1, "failure_click_attok"

    return-object p1
.end method
