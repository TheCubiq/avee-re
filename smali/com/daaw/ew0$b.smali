.class public Lcom/daaw/ew0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ew0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ew0;


# direct methods
.method public constructor <init>(Lcom/daaw/ew0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ew0$b;->a:Lcom/daaw/ew0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ew0$b;->a:Lcom/daaw/ew0;

    invoke-static {v0}, Lcom/daaw/ew0;->b(Lcom/daaw/ew0;)Lcom/daaw/wz;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/wz;->c()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/ew0$b;->a:Lcom/daaw/ew0;

    invoke-static {v0}, Lcom/daaw/ew0;->c(Lcom/daaw/ew0;)Lcom/daaw/dw0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/dw0;->d()V

    :cond_1
    return-void
.end method
