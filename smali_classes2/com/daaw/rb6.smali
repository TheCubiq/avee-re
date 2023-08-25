.class public final synthetic Lcom/daaw/rb6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/gh6;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/gh6;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rb6;->a:Lcom/daaw/gh6;

    iput-object p2, p0, Lcom/daaw/rb6;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/rb6;->a:Lcom/daaw/gh6;

    iget-object v1, p0, Lcom/daaw/rb6;->b:Ljava/lang/String;

    new-instance v2, Lcom/daaw/qt8;

    new-instance v3, Lcom/daaw/l96;

    invoke-direct {v3, v0, v1}, Lcom/daaw/l96;-><init>(Lcom/daaw/gh6;Ljava/lang/String;)V

    const-string v0, "internal.appMetadata"

    invoke-direct {v2, v0, v3}, Lcom/daaw/qt8;-><init>(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    return-object v2
.end method
