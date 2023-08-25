.class public final Lcom/daaw/h7;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/h7$b;,
        Lcom/daaw/h7$c;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/h7$c;

.field public final c:Landroid/content/BroadcastReceiver;

.field public d:Lcom/daaw/g7;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/h7$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/daaw/h7;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/h7$c;

    iput-object p1, p0, Lcom/daaw/h7;->b:Lcom/daaw/h7$c;

    sget p1, Lcom/daaw/sq1;->a:I

    const/4 p2, 0x0

    const/16 v0, 0x15

    if-lt p1, v0, :cond_0

    new-instance p1, Lcom/daaw/h7$b;

    invoke-direct {p1, p0, p2}, Lcom/daaw/h7$b;-><init>(Lcom/daaw/h7;Lcom/daaw/h7$a;)V

    move-object p2, p1

    :cond_0
    iput-object p2, p0, Lcom/daaw/h7;->c:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/h7;)Lcom/daaw/h7$c;
    .locals 0

    iget-object p0, p0, Lcom/daaw/h7;->b:Lcom/daaw/h7$c;

    return-object p0
.end method
