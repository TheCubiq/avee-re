.class public final synthetic Lcom/daaw/w91;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xw1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/y91;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/y91;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w91;->a:Lcom/daaw/y91;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/w91;->a:Lcom/daaw/y91;

    check-cast p2, [Ljava/lang/Integer;

    invoke-static {v0, p1, p2}, Lcom/daaw/y91;->b(Lcom/daaw/y91;Ljava/lang/Object;[Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
