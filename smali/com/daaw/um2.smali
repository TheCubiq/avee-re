.class public final Lcom/daaw/um2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:I

.field public final synthetic q:Lcom/daaw/wm2;


# direct methods
.method public constructor <init>(Lcom/daaw/wm2;IZ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/um2;->q:Lcom/daaw/wm2;

    iput p2, p0, Lcom/daaw/um2;->p:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/um2;->q:Lcom/daaw/wm2;

    iget v1, p0, Lcom/daaw/um2;->p:I

    if-lez v1, :cond_0

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v1, v1

    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    :try_start_1
    iget-object v1, v0, Lcom/daaw/wm2;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/wm2;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v0, v0, Lcom/daaw/wm2;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/daaw/ps6;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/fj2;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/um2;->q:Lcom/daaw/wm2;

    invoke-static {v1, v0}, Lcom/daaw/wm2;->m(Lcom/daaw/wm2;Lcom/daaw/fj2;)V

    iget v1, p0, Lcom/daaw/um2;->p:I

    const/4 v2, 0x4

    if-ge v1, v2, :cond_3

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/fj2;->v0()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/daaw/fj2;->J0()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0000000000000000000000000000000000000000000000000000000000000000"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/daaw/fj2;->w0()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/daaw/fj2;->H0()Lcom/daaw/oj2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/oj2;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/daaw/fj2;->H0()Lcom/daaw/oj2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/oj2;->L()J

    move-result-wide v0

    const-wide/16 v2, -0x2

    cmp-long v4, v0, v2

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/daaw/um2;->q:Lcom/daaw/wm2;

    iget v1, p0, Lcom/daaw/um2;->p:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/wm2;->o(IZ)V

    :cond_3
    :goto_2
    return-void
.end method
