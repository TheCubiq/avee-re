.class public final Lcom/daaw/uo$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yn1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/uo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/uo$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/uo$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/yn1;
    .locals 3

    iget-object v0, p0, Lcom/daaw/uo$b;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/daaw/qy0;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/daaw/uo;

    iget-object v1, p0, Lcom/daaw/uo$b;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/uo;-><init>(Landroid/content/Context;Lcom/daaw/uo$a;)V

    return-object v0
.end method

.method public bridge synthetic b(Landroid/content/Context;)Lcom/daaw/yn1$a;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/uo$b;->c(Landroid/content/Context;)Lcom/daaw/uo$b;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/content/Context;)Lcom/daaw/uo$b;
    .locals 0

    invoke-static {p1}, Lcom/daaw/qy0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/daaw/uo$b;->a:Landroid/content/Context;

    return-object p0
.end method
