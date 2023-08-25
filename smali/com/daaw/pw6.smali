.class public final Lcom/daaw/pw6;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedApi"
    }
.end annotation

.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation


# static fields
.field public static final c:Lcom/daaw/cx6;

.field public static final d:Landroid/content/Intent;


# instance fields
.field public final a:Lcom/daaw/qx6;

.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/cx6;

    const-string v1, "OverlayDisplayService"

    invoke-direct {v0, v1}, Lcom/daaw/cx6;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/pw6;->c:Lcom/daaw/cx6;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    sput-object v0, Lcom/daaw/pw6;->d:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/tx6;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/qx6;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lcom/daaw/pw6;->c:Lcom/daaw/cx6;

    sget-object v5, Lcom/daaw/pw6;->d:Landroid/content/Intent;

    sget-object v6, Lcom/daaw/kw6;->a:Lcom/daaw/kw6;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v4, "OverlayDisplayService"

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/daaw/qx6;-><init>(Landroid/content/Context;Lcom/daaw/cx6;Ljava/lang/String;Landroid/content/Intent;Lcom/daaw/kw6;Lcom/daaw/lx6;[B)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/pw6;->b:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic a()Lcom/daaw/cx6;
    .locals 1

    sget-object v0, Lcom/daaw/pw6;->c:Lcom/daaw/cx6;

    return-object v0
.end method

.method public static bridge synthetic b(Lcom/daaw/pw6;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pw6;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/daaw/pw6;->c:Lcom/daaw/cx6;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unbind LMD display overlay service"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    invoke-virtual {v0}, Lcom/daaw/qx6;->r()V

    return-void
.end method

.method public final d(Lcom/daaw/dw6;Lcom/daaw/uw6;)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    if-nez v0, :cond_0

    sget-object p1, Lcom/daaw/pw6;->c:Lcom/daaw/cx6;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    const-string v1, "Play Store not found."

    aput-object v1, p2, v0

    const-string v0, "error: %s"

    invoke-virtual {p1, v0, p2}, Lcom/daaw/cx6;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    :cond_0
    new-instance v0, Lcom/daaw/tj1;

    invoke-direct {v0}, Lcom/daaw/tj1;-><init>()V

    iget-object v7, p0, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    new-instance v8, Lcom/daaw/mw6;

    move-object v1, v8

    move-object v2, p0

    move-object v3, v0

    move-object v4, p1

    move-object v5, p2

    move-object v6, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/mw6;-><init>(Lcom/daaw/pw6;Lcom/daaw/tj1;Lcom/daaw/dw6;Lcom/daaw/uw6;Lcom/daaw/tj1;)V

    invoke-virtual {v7, v8, v0}, Lcom/daaw/qx6;->p(Lcom/daaw/dx6;Lcom/daaw/tj1;)V

    return-void
.end method

.method public final e(Lcom/daaw/rw6;Lcom/daaw/uw6;)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object p1, Lcom/daaw/pw6;->c:Lcom/daaw/cx6;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "Play Store not found."

    aput-object v0, p2, v1

    const-string v0, "error: %s"

    invoke-virtual {p1, v0, p2}, Lcom/daaw/cx6;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/rw6;->g()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object p1, Lcom/daaw/pw6;->c:Lcom/daaw/cx6;

    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null."

    invoke-virtual {p1, v1, v0}, Lcom/daaw/cx6;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    invoke-static {}, Lcom/daaw/tw6;->c()Lcom/daaw/sw6;

    move-result-object p1

    const/16 v0, 0x1fe0

    invoke-virtual {p1, v0}, Lcom/daaw/sw6;->b(I)Lcom/daaw/sw6;

    invoke-virtual {p1}, Lcom/daaw/sw6;->c()Lcom/daaw/tw6;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/daaw/uw6;->a(Lcom/daaw/tw6;)V

    return-void

    :cond_1
    new-instance v6, Lcom/daaw/tj1;

    invoke-direct {v6}, Lcom/daaw/tj1;-><init>()V

    iget-object v7, p0, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    new-instance v8, Lcom/daaw/lw6;

    move-object v0, v8

    move-object v1, p0

    move-object v2, v6

    move-object v3, p1

    move-object v4, p2

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/lw6;-><init>(Lcom/daaw/pw6;Lcom/daaw/tj1;Lcom/daaw/rw6;Lcom/daaw/uw6;Lcom/daaw/tj1;)V

    invoke-virtual {v7, v8, v6}, Lcom/daaw/qx6;->p(Lcom/daaw/dx6;Lcom/daaw/tj1;)V

    return-void
.end method

.method public final f(Lcom/daaw/ww6;Lcom/daaw/uw6;I)V
    .locals 10

    iget-object v0, p0, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    if-nez v0, :cond_0

    sget-object p1, Lcom/daaw/pw6;->c:Lcom/daaw/cx6;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "Play Store not found."

    aput-object v0, p2, p3

    const-string p3, "error: %s"

    invoke-virtual {p1, p3, p2}, Lcom/daaw/cx6;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    :cond_0
    new-instance v7, Lcom/daaw/tj1;

    invoke-direct {v7}, Lcom/daaw/tj1;-><init>()V

    iget-object v8, p0, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    new-instance v9, Lcom/daaw/nw6;

    move-object v0, v9

    move-object v1, p0

    move-object v2, v7

    move-object v3, p1

    move v4, p3

    move-object v5, p2

    move-object v6, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/nw6;-><init>(Lcom/daaw/pw6;Lcom/daaw/tj1;Lcom/daaw/ww6;ILcom/daaw/uw6;Lcom/daaw/tj1;)V

    invoke-virtual {v8, v9, v7}, Lcom/daaw/qx6;->p(Lcom/daaw/dx6;Lcom/daaw/tj1;)V

    return-void
.end method
