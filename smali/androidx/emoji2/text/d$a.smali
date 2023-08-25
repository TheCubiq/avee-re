.class public Landroidx/emoji2/text/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/daaw/b30$b;)Landroid/graphics/Typeface;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/b30$b;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 p2, 0x0

    invoke-static {p1, p2, v0}, Lcom/daaw/b30;->a(Landroid/content/Context;Landroid/os/CancellationSignal;[Lcom/daaw/b30$b;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/content/Context;Lcom/daaw/x20;)Lcom/daaw/b30$a;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, Lcom/daaw/b30;->b(Landroid/content/Context;Landroid/os/CancellationSignal;Lcom/daaw/x20;)Lcom/daaw/b30$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/content/Context;Landroid/database/ContentObserver;)V
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    return-void
.end method
