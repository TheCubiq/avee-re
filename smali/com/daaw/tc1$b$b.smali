.class public Lcom/daaw/tc1$b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/tc1$b;->a(Lcom/daaw/ir1;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/w40<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ir1;

.field public final synthetic b:Lcom/daaw/tc1$b;


# direct methods
.method public constructor <init>(Lcom/daaw/tc1$b;Lcom/daaw/ir1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tc1$b$b;->b:Lcom/daaw/tc1$b;

    iput-object p2, p0, Lcom/daaw/tc1$b$b;->a:Lcom/daaw/ir1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/tc1$b$b;->b()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tc1$b$b;->a:Lcom/daaw/ir1;

    invoke-virtual {v0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
