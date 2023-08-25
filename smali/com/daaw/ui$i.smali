.class public Lcom/daaw/ui$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tw1$a;


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
        "Lcom/daaw/tw1$a<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/String;",
        "Lcom/daaw/sd0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ui;


# direct methods
.method public constructor <init>(Lcom/daaw/ui;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ui$i;->a:Lcom/daaw/ui;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Lcom/daaw/sd0;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/ui$i;->b(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lcom/daaw/sd0;)V

    return-void
.end method

.method public b(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lcom/daaw/sd0;)V
    .locals 1

    invoke-static {}, Lcom/daaw/s70;->c()Lcom/daaw/s70;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/s70;->i(IZLjava/lang/String;Lcom/daaw/sd0;)V

    return-void
.end method
