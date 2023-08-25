.class public final synthetic Lcom/daaw/ge;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j50;


# instance fields
.field public final synthetic a:Lcom/daaw/ie;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ie;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ge;->a:Lcom/daaw/ie;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ge;->a:Lcom/daaw/ie;

    check-cast p1, Lcom/daaw/ie$a;

    invoke-static {v0, p1}, Lcom/daaw/ie;->d(Lcom/daaw/ie;Lcom/daaw/ie$a;)Lcom/daaw/ie$b;

    move-result-object p1

    return-object p1
.end method
