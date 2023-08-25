.class public final Lcom/daaw/up4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/ri6;

.field public final c:Landroid/os/Bundle;

.field public final d:Lcom/daaw/gi6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/sp4;Lcom/daaw/tp4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/sp4;->a(Lcom/daaw/sp4;)Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/up4;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/daaw/sp4;->i(Lcom/daaw/sp4;)Lcom/daaw/ri6;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/up4;->b:Lcom/daaw/ri6;

    invoke-static {p1}, Lcom/daaw/sp4;->b(Lcom/daaw/sp4;)Landroid/os/Bundle;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/up4;->c:Landroid/os/Bundle;

    invoke-static {p1}, Lcom/daaw/sp4;->h(Lcom/daaw/sp4;)Lcom/daaw/gi6;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/up4;->d:Lcom/daaw/gi6;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    iget-object p1, p0, Lcom/daaw/up4;->a:Landroid/content/Context;

    return-object p1
.end method

.method public final b()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/daaw/up4;->c:Landroid/os/Bundle;

    return-object v0
.end method

.method public final c()Lcom/daaw/sp4;
    .locals 2

    new-instance v0, Lcom/daaw/sp4;

    invoke-direct {v0}, Lcom/daaw/sp4;-><init>()V

    iget-object v1, p0, Lcom/daaw/up4;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/daaw/sp4;->c(Landroid/content/Context;)Lcom/daaw/sp4;

    iget-object v1, p0, Lcom/daaw/up4;->b:Lcom/daaw/ri6;

    invoke-virtual {v0, v1}, Lcom/daaw/sp4;->f(Lcom/daaw/ri6;)Lcom/daaw/sp4;

    iget-object v1, p0, Lcom/daaw/up4;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lcom/daaw/sp4;->d(Landroid/os/Bundle;)Lcom/daaw/sp4;

    return-object v0
.end method

.method public final d()Lcom/daaw/gi6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/up4;->d:Lcom/daaw/gi6;

    return-object v0
.end method

.method public final e()Lcom/daaw/ri6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/up4;->b:Lcom/daaw/ri6;

    return-object v0
.end method
