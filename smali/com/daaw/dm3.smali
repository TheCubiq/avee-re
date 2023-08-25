.class public final synthetic Lcom/daaw/dm3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/zg3;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/daaw/zg3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dm3;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/dm3;->b:Lcom/daaw/zg3;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/dm3;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/dm3;->b:Lcom/daaw/zg3;

    check-cast p1, Lcom/daaw/kl3;

    invoke-interface {p1, v0, v1}, Lcom/daaw/kl3;->d0(Ljava/lang/String;Lcom/daaw/zg3;)V

    return-object p1
.end method
