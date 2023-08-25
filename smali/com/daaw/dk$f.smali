.class public Lcom/daaw/dk$f;
.super Lcom/daaw/gh0$j$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/dk;


# direct methods
.method public constructor <init>(Lcom/daaw/dk;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dk$f;->b:Lcom/daaw/dk;

    invoke-direct {p0}, Lcom/daaw/gh0$j$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/gh0$d;
    .locals 0

    check-cast p2, Lcom/daaw/dk$h;

    iget-object p1, p2, Lcom/daaw/dk$h;->b:Lcom/daaw/tx0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/daaw/gh0$d;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/daaw/gh0$d;-><init>(Lcom/daaw/tx0;)V

    return-object p1

    :cond_0
    new-instance p2, Lcom/daaw/gh0$d;

    invoke-direct {p2, p1}, Lcom/daaw/gh0$d;-><init>(Lcom/daaw/tx0;)V

    return-object p2
.end method
