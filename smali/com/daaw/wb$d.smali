.class public Lcom/daaw/wb$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wb;->t(Ljava/lang/Runnable;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:Lcom/daaw/wb;


# direct methods
.method public constructor <init>(Lcom/daaw/wb;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wb$d;->c:Lcom/daaw/wb;

    iput-object p2, p0, Lcom/daaw/wb$d;->a:Ljava/lang/Runnable;

    iput-object p3, p0, Lcom/daaw/wb$d;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/xb;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/xb;->b()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Setup finished. Response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/daaw/wb$d;->c:Lcom/daaw/wb;

    if-nez p1, :cond_0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/wb;->i(Lcom/daaw/wb;Z)Z

    iget-object v0, p0, Lcom/daaw/wb$d;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/wb;->i(Lcom/daaw/wb;Z)Z

    iget-object v0, p0, Lcom/daaw/wb$d;->b:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    :goto_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_1
    iget-object v0, p0, Lcom/daaw/wb$d;->c:Lcom/daaw/wb;

    invoke-static {v0, p1}, Lcom/daaw/wb;->j(Lcom/daaw/wb;I)I

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/wb$d;->c:Lcom/daaw/wb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/wb;->i(Lcom/daaw/wb;Z)Z

    return-void
.end method
