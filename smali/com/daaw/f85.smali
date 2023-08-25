.class public final synthetic Lcom/daaw/f85;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/u85;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/u85;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/f85;->a:Lcom/daaw/u85;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/f85;->a:Lcom/daaw/u85;

    check-cast p1, Lcom/daaw/a74;

    invoke-virtual {v0, p1}, Lcom/daaw/u85;->a(Lcom/daaw/a74;)Lcom/daaw/a74;

    return-object p1
.end method
