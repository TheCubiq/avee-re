.class public Lcom/daaw/ui$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ui;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/xw1$a<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/sd0;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ui;


# direct methods
.method public constructor <init>(Lcom/daaw/ui;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ui$h;->a:Lcom/daaw/ui;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;Lcom/daaw/sd0;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/daaw/s70;->c()Lcom/daaw/s70;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/s70;->d(I)Lcom/daaw/l91;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/l91;->d()Lcom/daaw/sd0;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/daaw/br1;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/daaw/l91;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/sd0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ui$h;->a(Ljava/lang/Integer;Lcom/daaw/sd0;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
