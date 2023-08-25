.class public final synthetic Lcom/daaw/r10;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/b01;


# instance fields
.field public final synthetic a:Lcom/daaw/s10;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/s10;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r10;->a:Lcom/daaw/s10;

    iput-object p2, p0, Lcom/daaw/r10;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/r10;->a:Lcom/daaw/s10;

    iget-object v1, p0, Lcom/daaw/r10;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/daaw/s10;->b(Lcom/daaw/s10;Landroid/content/Context;)Lcom/daaw/fp;

    move-result-object v0

    return-object v0
.end method
