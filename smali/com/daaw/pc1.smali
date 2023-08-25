.class public final synthetic Lcom/daaw/pc1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/s40;


# instance fields
.field public final synthetic a:Lcom/daaw/rc1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/rc1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pc1;->a:Lcom/daaw/rc1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pc1;->a:Lcom/daaw/rc1;

    check-cast p1, Ljava/io/File;

    check-cast p2, [Ljava/lang/Boolean;

    invoke-static {v0, p1, p2}, Lcom/daaw/rc1;->b(Lcom/daaw/rc1;Ljava/io/File;[Ljava/lang/Boolean;)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method
