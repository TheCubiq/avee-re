.class public final synthetic Lcom/daaw/k86;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/l86;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/l86;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/k86;->a:Lcom/daaw/l86;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/k86;->a:Lcom/daaw/l86;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Lcom/daaw/l86;->b(Ljava/lang/Throwable;)Lcom/daaw/m86;

    move-result-object p1

    return-object p1
.end method
