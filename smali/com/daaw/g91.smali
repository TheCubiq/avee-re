.class public final Lcom/daaw/g91;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g00;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g00<",
        "Lcom/daaw/f91;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/daaw/a01<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/daaw/a01<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g91;->a:Lcom/daaw/a01;

    iput-object p2, p0, Lcom/daaw/g91;->b:Lcom/daaw/a01;

    iput-object p3, p0, Lcom/daaw/g91;->c:Lcom/daaw/a01;

    return-void
.end method

.method public static a(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)Lcom/daaw/g91;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/daaw/a01<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/daaw/a01<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/daaw/g91;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/g91;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/g91;-><init>(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;I)Lcom/daaw/f91;
    .locals 1

    new-instance v0, Lcom/daaw/f91;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/f91;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/daaw/f91;
    .locals 3

    iget-object v0, p0, Lcom/daaw/g91;->a:Lcom/daaw/a01;

    invoke-interface {v0}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/g91;->b:Lcom/daaw/a01;

    invoke-interface {v1}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/g91;->c:Lcom/daaw/a01;

    invoke-interface {v2}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/daaw/g91;->c(Landroid/content/Context;Ljava/lang/String;I)Lcom/daaw/f91;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/g91;->b()Lcom/daaw/f91;

    move-result-object v0

    return-object v0
.end method
