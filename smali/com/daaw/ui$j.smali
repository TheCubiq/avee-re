.class public Lcom/daaw/ui$j;
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
        "Landroid/os/AsyncTask;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ui;


# direct methods
.method public constructor <init>(Lcom/daaw/ui;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ui$j;->a:Lcom/daaw/ui;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/AsyncTask;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 1

    invoke-static {}, Lcom/daaw/ui;->a()Lcom/daaw/t91;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/daaw/t91;->c(Landroid/os/AsyncTask;I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/os/AsyncTask;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ui$j;->a(Landroid/os/AsyncTask;Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
