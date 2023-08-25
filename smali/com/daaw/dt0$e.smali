.class public abstract Lcom/daaw/dt0$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dt0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation


# instance fields
.field public a:Lcom/daaw/dt0$d;

.field public b:Ljava/lang/CharSequence;

.field public c:Ljava/lang/CharSequence;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/dt0$e;->d:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/dt0$e;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/dt0$e;->c:Ljava/lang/CharSequence;

    const-string v1, "android.summaryText"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/dt0$e;->b:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    const-string v1, "android.title.big"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/dt0$e;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "androidx.core.app.extra.COMPAT_TEMPLATE"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public abstract b(Lcom/daaw/ct0;)V
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public d(Lcom/daaw/ct0;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public e(Lcom/daaw/ct0;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public f(Lcom/daaw/ct0;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public g(Lcom/daaw/dt0$d;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/dt0$e;->a:Lcom/daaw/dt0$d;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/daaw/dt0$e;->a:Lcom/daaw/dt0$d;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Lcom/daaw/dt0$d;->o(Lcom/daaw/dt0$e;)Lcom/daaw/dt0$d;

    :cond_0
    return-void
.end method
