.class public final Lcom/daaw/y75;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ec3;


# instance fields
.field public final synthetic a:Lcom/daaw/z75;


# direct methods
.method public constructor <init>(Lcom/daaw/z75;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/y75;->a:Lcom/daaw/z75;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public final zza()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzb()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzc()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/y75;->a:Lcom/daaw/z75;

    invoke-static {v0}, Lcom/daaw/z75;->h3(Lcom/daaw/z75;)Lcom/daaw/e35;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/daaw/z75;->h3(Lcom/daaw/z75;)Lcom/daaw/e35;

    move-result-object v0

    const-string v1, "_videoMediaView"

    invoke-virtual {v0, v1}, Lcom/daaw/e35;->i(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
