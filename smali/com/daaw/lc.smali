.class public Lcom/daaw/lc;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static volatile b:Lcom/daaw/lc;


# instance fields
.field public a:Landroid/widget/Toast;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/widget/Toast;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Boast.Boast(Toast) requires a non-null parameter."

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/lc;->a:Landroid/widget/Toast;

    return-void
.end method

.method public static b(Landroid/content/Context;I)Lcom/daaw/lc;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ShowToast"
        }
    .end annotation

    new-instance v0, Lcom/daaw/lc;

    const/4 v1, 0x0

    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/lc;-><init>(Landroid/widget/Toast;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/CharSequence;)Lcom/daaw/lc;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ShowToast"
        }
    .end annotation

    new-instance v0, Lcom/daaw/lc;

    const/4 v1, 0x0

    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/lc;-><init>(Landroid/widget/Toast;)V

    return-object v0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/CharSequence;I)Lcom/daaw/lc;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ShowToast"
        }
    .end annotation

    new-instance v0, Lcom/daaw/lc;

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/lc;-><init>(Landroid/widget/Toast;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lc;->a:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/lc;->f(Z)V

    return-void
.end method

.method public f(Z)V
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/daaw/lc;->b:Lcom/daaw/lc;

    if-eqz p1, :cond_0

    sget-object p1, Lcom/daaw/lc;->b:Lcom/daaw/lc;

    invoke-virtual {p1}, Lcom/daaw/lc;->a()V

    :cond_0
    sput-object p0, Lcom/daaw/lc;->b:Lcom/daaw/lc;

    iget-object p1, p0, Lcom/daaw/lc;->a:Landroid/widget/Toast;

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method
