.class public final Lcom/daaw/h85;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/zg3;


# direct methods
.method public constructor <init>(Lcom/daaw/u85;Ljava/lang/String;Lcom/daaw/zg3;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/h85;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/h85;->b:Lcom/daaw/zg3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/daaw/a74;

    iget-object v0, p0, Lcom/daaw/h85;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/h85;->b:Lcom/daaw/zg3;

    invoke-interface {p1, v0, v1}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
