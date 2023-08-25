.class public final Lcom/daaw/vh5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/xh5;


# direct methods
.method public constructor <init>(Lcom/daaw/xh5;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vh5;->b:Lcom/daaw/xh5;

    iput-object p2, p0, Lcom/daaw/vh5;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/daaw/og5;

    invoke-virtual {p1}, Lcom/daaw/og5;->d()V

    iget-object p1, p0, Lcom/daaw/vh5;->b:Lcom/daaw/xh5;

    invoke-static {p1}, Lcom/daaw/xh5;->g3(Lcom/daaw/xh5;)Lcom/daaw/lh5;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/vh5;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/daaw/lh5;->e(Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
