.class public Lcom/daaw/avee/Common/Boast;
.super Ljava/lang/Object;
.source "Boast.java"


# static fields
.field private static volatile globalBoast:Lcom/daaw/avee/Common/Boast;


# instance fields
.field private internalToast:Landroid/widget/Toast;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/widget/Toast;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 46
    iput-object p1, p0, Lcom/daaw/avee/Common/Boast;->internalToast:Landroid/widget/Toast;

    return-void

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Boast.Boast(Toast) requires a non-null parameter."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static makeText(Landroid/content/Context;I)Lcom/daaw/avee/Common/Boast;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .line 110
    new-instance v0, Lcom/daaw/avee/Common/Boast;

    const/4 v1, 0x0

    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/avee/Common/Boast;-><init>(Landroid/widget/Toast;)V

    return-object v0
.end method

.method public static makeText(Landroid/content/Context;II)Lcom/daaw/avee/Common/Boast;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .line 81
    new-instance v0, Lcom/daaw/avee/Common/Boast;

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/avee/Common/Boast;-><init>(Landroid/widget/Toast;)V

    return-object v0
.end method

.method public static makeText(Landroid/content/Context;Ljava/lang/CharSequence;)Lcom/daaw/avee/Common/Boast;
    .locals 2

    .line 94
    new-instance v0, Lcom/daaw/avee/Common/Boast;

    const/4 v1, 0x0

    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/avee/Common/Boast;-><init>(Landroid/widget/Toast;)V

    return-object v0
.end method

.method public static makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Lcom/daaw/avee/Common/Boast;
    .locals 1

    .line 63
    new-instance v0, Lcom/daaw/avee/Common/Boast;

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/avee/Common/Boast;-><init>(Landroid/widget/Toast;)V

    return-object v0
.end method

.method public static showText(Landroid/content/Context;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 169
    invoke-static {p0, p1, v0}, Lcom/daaw/avee/Common/Boast;->makeText(Landroid/content/Context;II)Lcom/daaw/avee/Common/Boast;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/avee/Common/Boast;->show()V

    return-void
.end method

.method public static showText(Landroid/content/Context;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .line 142
    invoke-static {p0, p1, p2}, Lcom/daaw/avee/Common/Boast;->makeText(Landroid/content/Context;II)Lcom/daaw/avee/Common/Boast;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/avee/Common/Boast;->show()V

    return-void
.end method

.method public static showText(Landroid/content/Context;Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x0

    .line 154
    invoke-static {p0, p1, v0}, Lcom/daaw/avee/Common/Boast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Lcom/daaw/avee/Common/Boast;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/avee/Common/Boast;->show()V

    return-void
.end method

.method public static showText(Landroid/content/Context;Ljava/lang/CharSequence;I)V
    .locals 0

    .line 125
    invoke-static {p0, p1, p2}, Lcom/daaw/avee/Common/Boast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Lcom/daaw/avee/Common/Boast;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/avee/Common/Boast;->show()V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/daaw/avee/Common/Boast;->internalToast:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    return-void
.end method

.method public show()V
    .locals 1

    const/4 v0, 0x1

    .line 192
    invoke-virtual {p0, v0}, Lcom/daaw/avee/Common/Boast;->show(Z)V

    return-void
.end method

.method public show(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 205
    sget-object p1, Lcom/daaw/avee/Common/Boast;->globalBoast:Lcom/daaw/avee/Common/Boast;

    if-eqz p1, :cond_0

    .line 206
    sget-object p1, Lcom/daaw/avee/Common/Boast;->globalBoast:Lcom/daaw/avee/Common/Boast;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Boast;->cancel()V

    .line 210
    :cond_0
    sput-object p0, Lcom/daaw/avee/Common/Boast;->globalBoast:Lcom/daaw/avee/Common/Boast;

    .line 212
    iget-object p1, p0, Lcom/daaw/avee/Common/Boast;->internalToast:Landroid/widget/Toast;

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method
