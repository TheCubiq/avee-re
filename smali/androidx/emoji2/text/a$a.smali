.class public Landroidx/emoji2/text/a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroidx/emoji2/text/a$b;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/emoji2/text/a$a;->e()Landroidx/emoji2/text/a$b;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Landroidx/emoji2/text/a$a;->a:Landroidx/emoji2/text/a$b;

    return-void
.end method

.method public static e()Landroidx/emoji2/text/a$b;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/emoji2/text/a$d;

    invoke-direct {v0}, Landroidx/emoji2/text/a$d;-><init>()V

    return-object v0

    :cond_0
    new-instance v0, Landroidx/emoji2/text/a$c;

    invoke-direct {v0}, Landroidx/emoji2/text/a$c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/daaw/x20;)Landroidx/emoji2/text/b$c;
    .locals 1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Landroidx/emoji2/text/d;

    invoke-direct {v0, p1, p2}, Landroidx/emoji2/text/d;-><init>(Landroid/content/Context;Lcom/daaw/x20;)V

    return-object v0
.end method

.method public final b([Landroid/content/pm/Signature;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroid/content/pm/Signature;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "[B>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-virtual {v3}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/content/Context;)Landroidx/emoji2/text/b$c;
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/emoji2/text/a$a;->h(Landroid/content/Context;)Lcom/daaw/x20;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroidx/emoji2/text/a$a;->a(Landroid/content/Context;Lcom/daaw/x20;)Landroidx/emoji2/text/b$c;

    move-result-object p1

    return-object p1
.end method

.method public final d(Landroid/content/pm/ProviderInfo;Landroid/content/pm/PackageManager;)Lcom/daaw/x20;
    .locals 3

    iget-object v0, p1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    iget-object p1, p1, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    iget-object v1, p0, Landroidx/emoji2/text/a$a;->a:Landroidx/emoji2/text/a$b;

    invoke-virtual {v1, p2, p1}, Landroidx/emoji2/text/a$b;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/emoji2/text/a$a;->b([Landroid/content/pm/Signature;)Ljava/util/List;

    move-result-object p2

    new-instance v1, Lcom/daaw/x20;

    const-string v2, "emojicompat-emoji-font"

    invoke-direct {v1, v0, p1, v2, p2}, Lcom/daaw/x20;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public final f(Landroid/content/pm/ProviderInfo;)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz p1, :cond_0

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g(Landroid/content/pm/PackageManager;)Landroid/content/pm/ProviderInfo;
    .locals 3

    iget-object v0, p0, Landroidx/emoji2/text/a$a;->a:Landroidx/emoji2/text/a$b;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "androidx.content.action.LOAD_EMOJI_FONT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroidx/emoji2/text/a$b;->c(Landroid/content/pm/PackageManager;Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v1, p0, Landroidx/emoji2/text/a$a;->a:Landroidx/emoji2/text/a$b;

    invoke-virtual {v1, v0}, Landroidx/emoji2/text/a$b;->a(Landroid/content/pm/ResolveInfo;)Landroid/content/pm/ProviderInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/emoji2/text/a$a;->f(Landroid/content/pm/ProviderInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public h(Landroid/content/Context;)Lcom/daaw/x20;
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v0, "Package manager required to locate emoji font provider"

    invoke-static {p1, v0}, Lcom/daaw/ty0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroidx/emoji2/text/a$a;->g(Landroid/content/pm/PackageManager;)Landroid/content/pm/ProviderInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    invoke-virtual {p0, v0, p1}, Landroidx/emoji2/text/a$a;->d(Landroid/content/pm/ProviderInfo;Landroid/content/pm/PackageManager;)Lcom/daaw/x20;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "emoji2.text.DefaultEmojiConfig"

    invoke-static {v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v1
.end method
