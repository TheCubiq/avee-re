.class public Lcom/daaw/mt;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/mt$b;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lcom/daaw/mt$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mt;->a:Landroid/content/Context;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/mt;->b:Lcom/daaw/mt$b;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/mt;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/mt;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/mt;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/mt;->c(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/mt;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/daaw/mt;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return v0

    :catch_0
    return v1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/mt;->f()Lcom/daaw/mt$b;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/mt$b;->a(Lcom/daaw/mt$b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/mt;->f()Lcom/daaw/mt$b;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/mt$b;->b(Lcom/daaw/mt$b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/daaw/mt$b;
    .locals 2

    iget-object v0, p0, Lcom/daaw/mt;->b:Lcom/daaw/mt$b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/mt$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/mt$b;-><init>(Lcom/daaw/mt;Lcom/daaw/mt$a;)V

    iput-object v0, p0, Lcom/daaw/mt;->b:Lcom/daaw/mt$b;

    :cond_0
    iget-object v0, p0, Lcom/daaw/mt;->b:Lcom/daaw/mt$b;

    return-object v0
.end method
