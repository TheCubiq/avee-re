.class public final synthetic Lcom/daaw/n1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ww1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/r1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n1;->a:Lcom/daaw/r1;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/n1;->a:Lcom/daaw/r1;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Lcom/daaw/r1;->d(Lcom/daaw/r1;Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
