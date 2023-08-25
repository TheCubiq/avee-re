.class public final Lcom/daaw/az0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/az0;->b()Lcom/daaw/j5;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/az0;->c()Landroid/content/Context;

    move-result-object v1

    const-string v2, "pref_alwaysHideAppLogo"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/j5;->K(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final b()Lcom/daaw/j5;
    .locals 2

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    const-string v1, "createOrGetInstance()"

    invoke-static {v0, v1}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/az0;->b()Lcom/daaw/j5;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/az0;->c()Landroid/content/Context;

    move-result-object v1

    const-string v2, "pref_disableHeaderAds"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/j5;->K(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/az0;->b()Lcom/daaw/j5;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/az0;->c()Landroid/content/Context;

    move-result-object v1

    const-string v2, "pref_showLegacyPremiumInfo"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/j5;->K(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final f(Z)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/az0;->b()Lcom/daaw/j5;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/az0;->c()Landroid/content/Context;

    move-result-object v1

    const-string v2, "pref_showLegacyPremiumInfo"

    invoke-virtual {v0, v1, v2, p1}, Lcom/daaw/j5;->Q(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method
