.class public final Lcom/daaw/tk$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/daaw/tk$c;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/daaw/tk$b;

    invoke-direct {v0, p1, p2}, Lcom/daaw/tk$b;-><init>(Landroid/content/ClipData;I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/tk$d;

    invoke-direct {v0, p1, p2}, Lcom/daaw/tk$d;-><init>(Landroid/content/ClipData;I)V

    :goto_0
    iput-object v0, p0, Lcom/daaw/tk$a;->a:Lcom/daaw/tk$c;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/tk;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tk$a;->a:Lcom/daaw/tk$c;

    invoke-interface {v0}, Lcom/daaw/tk$c;->a()Lcom/daaw/tk;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/os/Bundle;)Lcom/daaw/tk$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tk$a;->a:Lcom/daaw/tk$c;

    invoke-interface {v0, p1}, Lcom/daaw/tk$c;->setExtras(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public c(I)Lcom/daaw/tk$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tk$a;->a:Lcom/daaw/tk$c;

    invoke-interface {v0, p1}, Lcom/daaw/tk$c;->c(I)V

    return-object p0
.end method

.method public d(Landroid/net/Uri;)Lcom/daaw/tk$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tk$a;->a:Lcom/daaw/tk$c;

    invoke-interface {v0, p1}, Lcom/daaw/tk$c;->b(Landroid/net/Uri;)V

    return-object p0
.end method
