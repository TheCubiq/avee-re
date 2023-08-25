.class public Lcom/daaw/a4$r;
.super Lcom/daaw/a4$q;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/a4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "r"
.end annotation


# instance fields
.field public final c:Lcom/daaw/po1;

.field public final synthetic d:Lcom/daaw/a4;


# direct methods
.method public constructor <init>(Lcom/daaw/a4;Lcom/daaw/po1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a4$r;->d:Lcom/daaw/a4;

    invoke-direct {p0, p1}, Lcom/daaw/a4$q;-><init>(Lcom/daaw/a4;)V

    iput-object p2, p0, Lcom/daaw/a4$r;->c:Lcom/daaw/po1;

    return-void
.end method


# virtual methods
.method public b()Landroid/content/IntentFilter;
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4$r;->c:Lcom/daaw/po1;

    invoke-virtual {v0}, Lcom/daaw/po1;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4$r;->d:Lcom/daaw/a4;

    invoke-virtual {v0}, Lcom/daaw/a4;->Y()Z

    return-void
.end method
