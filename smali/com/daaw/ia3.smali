.class public final Lcom/daaw/ia3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public a:Lcom/daaw/eo;

.field public b:Lcom/daaw/bo;

.field public c:Lcom/daaw/do;

.field public d:Lcom/daaw/ga3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g(Landroid/content/Context;)Z
    .locals 6

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v2, Landroid/content/Intent;

    const-string v3, "http://www.example.com"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v2, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v3

    const/high16 v4, 0x10000

    invoke-virtual {v0, v2, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz v3, :cond_2

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    iget-object v5, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v0, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-static {p0}, Lcom/daaw/n08;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method


# virtual methods
.method public final a()Lcom/daaw/eo;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ia3;->b:Lcom/daaw/bo;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/daaw/ia3;->a:Lcom/daaw/eo;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/daaw/ia3;->a:Lcom/daaw/eo;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lcom/daaw/bo;->c(Lcom/daaw/ao;)Lcom/daaw/eo;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ia3;->a:Lcom/daaw/eo;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/ia3;->a:Lcom/daaw/eo;

    return-object v0
.end method

.method public final b(Landroid/app/Activity;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ia3;->b:Lcom/daaw/bo;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lcom/daaw/n08;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v1, Lcom/daaw/o08;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/daaw/o08;-><init>(Lcom/daaw/ia3;[B)V

    iput-object v1, p0, Lcom/daaw/ia3;->c:Lcom/daaw/do;

    invoke-static {p1, v0, v1}, Lcom/daaw/bo;->a(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/do;)Z

    return-void
.end method

.method public final c(Lcom/daaw/bo;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/ia3;->b:Lcom/daaw/bo;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/bo;->e(J)Z

    iget-object p1, p0, Lcom/daaw/ia3;->d:Lcom/daaw/ga3;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/daaw/ga3;->zza()V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ia3;->b:Lcom/daaw/bo;

    iput-object v0, p0, Lcom/daaw/ia3;->a:Lcom/daaw/eo;

    return-void
.end method

.method public final e(Lcom/daaw/ga3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ia3;->d:Lcom/daaw/ga3;

    return-void
.end method

.method public final f(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ia3;->c:Lcom/daaw/do;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Landroid/app/Activity;->unbindService(Landroid/content/ServiceConnection;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/ia3;->b:Lcom/daaw/bo;

    iput-object p1, p0, Lcom/daaw/ia3;->a:Lcom/daaw/eo;

    iput-object p1, p0, Lcom/daaw/ia3;->c:Lcom/daaw/do;

    return-void
.end method
