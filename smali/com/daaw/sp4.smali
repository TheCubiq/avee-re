.class public final Lcom/daaw/sp4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lcom/daaw/ri6;

.field public c:Landroid/os/Bundle;

.field public d:Lcom/daaw/gi6;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/sp4;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sp4;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/sp4;)Landroid/os/Bundle;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sp4;->c:Landroid/os/Bundle;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/daaw/sp4;)Lcom/daaw/gi6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sp4;->d:Lcom/daaw/gi6;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/daaw/sp4;)Lcom/daaw/ri6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sp4;->b:Lcom/daaw/ri6;

    return-object p0
.end method


# virtual methods
.method public final c(Landroid/content/Context;)Lcom/daaw/sp4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/sp4;->a:Landroid/content/Context;

    return-object p0
.end method

.method public final d(Landroid/os/Bundle;)Lcom/daaw/sp4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/sp4;->c:Landroid/os/Bundle;

    return-object p0
.end method

.method public final e(Lcom/daaw/gi6;)Lcom/daaw/sp4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/sp4;->d:Lcom/daaw/gi6;

    return-object p0
.end method

.method public final f(Lcom/daaw/ri6;)Lcom/daaw/sp4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/sp4;->b:Lcom/daaw/ri6;

    return-object p0
.end method

.method public final g()Lcom/daaw/up4;
    .locals 2

    new-instance v0, Lcom/daaw/up4;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/up4;-><init>(Lcom/daaw/sp4;Lcom/daaw/tp4;)V

    return-object v0
.end method
